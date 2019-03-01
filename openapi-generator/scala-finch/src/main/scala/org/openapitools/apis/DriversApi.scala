package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Driver
import org.openapitools.models.DriverForCreate
import org.openapitools.models.InlineObject4
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

object DriversApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createDriver(da) :+:
        deactivateDriver(da) :+:
        getAllDeactivatedDrivers(da) :+:
        getDeactivatedDriverById(da) :+:
        getDriverById(da) :+:
        reactivateDriverById(da)


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
        * @return An endpoint representing a Driver
        */
        private def createDriver(da: DataAccessor): Endpoint[Driver] =
        post("fleet" :: "drivers" :: "create" :: param("access_token") :: jsonBody[DriverForCreate]) { (accessToken: String, createDriverParam: DriverForCreate) =>
          da.Drivers_createDriver(accessToken, createDriverParam) match {
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
        private def deactivateDriver(da: DataAccessor): Endpoint[Unit] =
        delete("fleet" :: "drivers" :: string :: param("access_token")) { (accessToken: String, driverIdOrExternalId: String) =>
          da.Drivers_deactivateDriver(accessToken, driverIdOrExternalId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Driver]
        */
        private def getAllDeactivatedDrivers(da: DataAccessor): Endpoint[Seq[Driver]] =
        get("fleet" :: "drivers" :: "inactive" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long]) =>
          da.Drivers_getAllDeactivatedDrivers(accessToken, groupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Driver
        */
        private def getDeactivatedDriverById(da: DataAccessor): Endpoint[Driver] =
        get("fleet" :: "drivers" :: "inactive" :: string :: param("access_token")) { (accessToken: String, driverIdOrExternalId: String) =>
          da.Drivers_getDeactivatedDriverById(accessToken, driverIdOrExternalId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Driver
        */
        private def getDriverById(da: DataAccessor): Endpoint[Driver] =
        get("fleet" :: "drivers" :: string :: param("access_token")) { (accessToken: String, driverIdOrExternalId: String) =>
          da.Drivers_getDriverById(accessToken, driverIdOrExternalId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Driver
        */
        private def reactivateDriverById(da: DataAccessor): Endpoint[Driver] =
        put("fleet" :: "drivers" :: "inactive" :: string :: param("access_token") :: jsonBody[InlineObject4]) { (accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4) =>
          da.Drivers_reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam) match {
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
      val file = File.createTempFile("tmpDriversApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
