package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.DriverSafetyScoreResponse
import org.openapitools.models.VehicleHarshEventResponse
import org.openapitools.models.VehicleSafetyScoreResponse
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

object SafetyApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getDriverSafetyScore(da) :+:
        getVehicleHarshEvent(da) :+:
        getVehicleSafetyScore(da)


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
        * @return An endpoint representing a DriverSafetyScoreResponse
        */
        private def getDriverSafetyScore(da: DataAccessor): Endpoint[DriverSafetyScoreResponse] =
        get("fleet" :: "drivers" :: long :: "safety" :: "score" :: param("access_token") :: param("startMs").map(_.toLong) :: param("endMs").map(_.toLong)) { (driverId: Long, accessToken: String, startMs: Long, endMs: Long) =>
          da.Safety_getDriverSafetyScore(driverId, accessToken, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VehicleHarshEventResponse
        */
        private def getVehicleHarshEvent(da: DataAccessor): Endpoint[VehicleHarshEventResponse] =
        get("fleet" :: "vehicles" :: long :: "safety" :: "harsh_event" :: param("access_token") :: param("timestamp").map(_.toLong)) { (vehicleId: Long, accessToken: String, timestamp: Long) =>
          da.Safety_getVehicleHarshEvent(vehicleId, accessToken, timestamp) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VehicleSafetyScoreResponse
        */
        private def getVehicleSafetyScore(da: DataAccessor): Endpoint[VehicleSafetyScoreResponse] =
        get("fleet" :: "vehicles" :: long :: "safety" :: "score" :: param("access_token") :: param("startMs").map(_.toLong) :: param("endMs").map(_.toLong)) { (vehicleId: Long, accessToken: String, startMs: Long, endMs: Long) =>
          da.Safety_getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs) match {
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
      val file = File.createTempFile("tmpSafetyApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
