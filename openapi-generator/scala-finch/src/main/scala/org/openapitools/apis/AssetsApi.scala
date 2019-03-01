package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AssetReeferResponse
import org.openapitools.models.InlineResponse200
import org.openapitools.models.InlineResponse2001
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.time._

object AssetsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getAllAssetCurrentLocations(da) :+:
        getAllAssets(da) :+:
        getAssetLocation(da) :+:
        getAssetReefer(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a InlineResponse2001
        */
        private def getAllAssetCurrentLocations(da: DataAccessor): Endpoint[InlineResponse2001] =
        get("fleet" :: "assets" :: "locations" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long]) =>
          da.Assets_getAllAssetCurrentLocations(accessToken, groupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse200
        */
        private def getAllAssets(da: DataAccessor): Endpoint[InlineResponse200] =
        get("fleet" :: "assets" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long]) =>
          da.Assets_getAllAssets(accessToken, groupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Object]
        */
        private def getAssetLocation(da: DataAccessor): Endpoint[Seq[Object]] =
        get("fleet" :: "assets" :: long :: "locations" :: param("access_token") :: param("startMs").map(_.toLong) :: param("endMs").map(_.toLong)) { (accessToken: String, assetId: Long, startMs: Long, endMs: Long) =>
          da.Assets_getAssetLocation(accessToken, assetId, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AssetReeferResponse
        */
        private def getAssetReefer(da: DataAccessor): Endpoint[AssetReeferResponse] =
        get("fleet" :: "assets" :: long :: "reefer" :: param("access_token") :: param("startMs").map(_.toLong) :: param("endMs").map(_.toLong)) { (accessToken: String, assetId: Long, startMs: Long, endMs: Long) =>
          da.Assets_getAssetReefer(accessToken, assetId, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = File.createTempFile("tmpAssetsApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
