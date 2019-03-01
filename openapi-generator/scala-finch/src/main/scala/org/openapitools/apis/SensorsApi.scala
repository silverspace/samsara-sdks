package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CargoResponse
import org.openapitools.models.DoorResponse
import org.openapitools.models.HumidityResponse
import org.openapitools.models.InlineObject19
import org.openapitools.models.InlineObject20
import org.openapitools.models.InlineObject21
import org.openapitools.models.InlineObject22
import org.openapitools.models.InlineObject23
import org.openapitools.models.InlineObject24
import org.openapitools.models.InlineResponse2008
import org.openapitools.models.SensorHistoryResponse
import org.openapitools.models.TemperatureResponse
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

object SensorsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getSensors(da) :+:
        getSensorsCargo(da) :+:
        getSensorsDoor(da) :+:
        getSensorsHistory(da) :+:
        getSensorsHumidity(da) :+:
        getSensorsTemperature(da)


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
        * @return An endpoint representing a InlineResponse2008
        */
        private def getSensors(da: DataAccessor): Endpoint[InlineResponse2008] =
        post("sensors" :: "list" :: param("access_token") :: jsonBody[InlineObject23]) { (accessToken: String, groupParam: InlineObject23) =>
          da.Sensors_getSensors(accessToken, groupParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CargoResponse
        */
        private def getSensorsCargo(da: DataAccessor): Endpoint[CargoResponse] =
        post("sensors" :: "cargo" :: param("access_token") :: jsonBody[InlineObject19]) { (accessToken: String, sensorParam: InlineObject19) =>
          da.Sensors_getSensorsCargo(accessToken, sensorParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DoorResponse
        */
        private def getSensorsDoor(da: DataAccessor): Endpoint[DoorResponse] =
        post("sensors" :: "door" :: param("access_token") :: jsonBody[InlineObject20]) { (accessToken: String, sensorParam: InlineObject20) =>
          da.Sensors_getSensorsDoor(accessToken, sensorParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SensorHistoryResponse
        */
        private def getSensorsHistory(da: DataAccessor): Endpoint[SensorHistoryResponse] =
        post("sensors" :: "history" :: param("access_token") :: jsonBody[InlineObject21]) { (accessToken: String, historyParam: InlineObject21) =>
          da.Sensors_getSensorsHistory(accessToken, historyParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a HumidityResponse
        */
        private def getSensorsHumidity(da: DataAccessor): Endpoint[HumidityResponse] =
        post("sensors" :: "humidity" :: param("access_token") :: jsonBody[InlineObject22]) { (accessToken: String, sensorParam: InlineObject22) =>
          da.Sensors_getSensorsHumidity(accessToken, sensorParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TemperatureResponse
        */
        private def getSensorsTemperature(da: DataAccessor): Endpoint[TemperatureResponse] =
        post("sensors" :: "temperature" :: param("access_token") :: jsonBody[InlineObject24]) { (accessToken: String, sensorParam: InlineObject24) =>
          da.Sensors_getSensorsTemperature(accessToken, sensorParam) match {
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
      val file = File.createTempFile("tmpSensorsApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
