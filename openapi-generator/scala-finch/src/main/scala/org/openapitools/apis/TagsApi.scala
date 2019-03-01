package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.InlineResponse2009
import org.openapitools.models.Tag
import org.openapitools.models.TagCreate
import org.openapitools.models.TagModify
import org.openapitools.models.TagUpdate
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

object TagsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createTag(da) :+:
        deleteTagById(da) :+:
        getAllTags(da) :+:
        getTagById(da) :+:
        modifyTagById(da) :+:
        updateTagById(da)


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
        * @return An endpoint representing a Tag
        */
        private def createTag(da: DataAccessor): Endpoint[Tag] =
        post("tags" :: param("access_token") :: jsonBody[TagCreate]) { (accessToken: String, tagCreateParams: TagCreate) =>
          da.Tags_createTag(accessToken, tagCreateParams) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def deleteTagById(da: DataAccessor): Endpoint[Unit] =
        delete("tags" :: long :: param("access_token")) { (accessToken: String, tagId: Long) =>
          da.Tags_deleteTagById(accessToken, tagId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2009
        */
        private def getAllTags(da: DataAccessor): Endpoint[InlineResponse2009] =
        get("tags" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long]) =>
          da.Tags_getAllTags(accessToken, groupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Tag
        */
        private def getTagById(da: DataAccessor): Endpoint[Tag] =
        get("tags" :: long :: param("access_token")) { (accessToken: String, tagId: Long) =>
          da.Tags_getTagById(accessToken, tagId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Tag
        */
        private def modifyTagById(da: DataAccessor): Endpoint[Tag] =
        patch("tags" :: long :: param("access_token") :: jsonBody[TagModify]) { (accessToken: String, tagId: Long, tagModifyParams: TagModify) =>
          da.Tags_modifyTagById(accessToken, tagId, tagModifyParams) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Tag
        */
        private def updateTagById(da: DataAccessor): Endpoint[Tag] =
        put("tags" :: long :: param("access_token") :: jsonBody[TagUpdate]) { (accessToken: String, tagId: Long, updateTagParams: TagUpdate) =>
          da.Tags_updateTagById(accessToken, tagId, updateTagParams) match {
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
      val file = File.createTempFile("tmpTagsApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
