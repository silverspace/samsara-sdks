package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.DataInputHistoryResponse
import org.openapitools.models.InlineObject17
import org.openapitools.models.InlineObject18
import org.openapitools.models.InlineResponse2006
import org.openapitools.models.InlineResponse2007
import org.openapitools.models.MachineHistoryResponse
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

object IndustrialApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getAllDataInputs(da) :+:
        getDataInput(da) :+:
        getMachines(da) :+:
        getMachinesHistory(da)


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
        * @return An endpoint representing a InlineResponse2006
        */
        private def getAllDataInputs(da: DataAccessor): Endpoint[InlineResponse2006] =
        get("industrial" :: "data" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong)) :: paramOption("startMs").map(_.map(_.toLong)) :: paramOption("endMs").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long], startMs: Option[Long], endMs: Option[Long]) =>
          da.Industrial_getAllDataInputs(accessToken, groupId, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DataInputHistoryResponse
        */
        private def getDataInput(da: DataAccessor): Endpoint[DataInputHistoryResponse] =
        get("industrial" :: "data" :: long :: param("access_token") :: paramOption("startMs").map(_.map(_.toLong)) :: paramOption("endMs").map(_.map(_.toLong))) { (accessToken: String, dataInputId: Long, startMs: Option[Long], endMs: Option[Long]) =>
          da.Industrial_getDataInput(accessToken, dataInputId, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2007
        */
        private def getMachines(da: DataAccessor): Endpoint[InlineResponse2007] =
        post("machines" :: "list" :: param("access_token") :: jsonBody[InlineObject18]) { (accessToken: String, groupParam: InlineObject18) =>
          da.Industrial_getMachines(accessToken, groupParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MachineHistoryResponse
        */
        private def getMachinesHistory(da: DataAccessor): Endpoint[MachineHistoryResponse] =
        post("machines" :: "history" :: param("access_token") :: jsonBody[InlineObject17]) { (accessToken: String, historyParam: InlineObject17) =>
          da.Industrial_getMachinesHistory(accessToken, historyParam) match {
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
      val file = File.createTempFile("tmpIndustrialApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
