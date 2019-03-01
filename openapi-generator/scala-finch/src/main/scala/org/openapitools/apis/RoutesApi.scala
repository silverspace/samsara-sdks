package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AllRouteJobUpdates
import org.openapitools.models.DispatchRoute
import org.openapitools.models.DispatchRouteCreate
import org.openapitools.models.DispatchRouteHistory
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

object RoutesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createDispatchRoute(da) :+:
        createDriverDispatchRoute(da) :+:
        createVehicleDispatchRoute(da) :+:
        deleteDispatchRouteById(da) :+:
        fetchAllDispatchRoutes(da) :+:
        fetchAllRouteJobUpdates(da) :+:
        getDispatchRouteById(da) :+:
        getDispatchRouteHistory(da) :+:
        getDispatchRoutesByDriverId(da) :+:
        getDispatchRoutesByVehicleId(da) :+:
        updateDispatchRouteById(da)


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
        * @return An endpoint representing a DispatchRoute
        */
        private def createDispatchRoute(da: DataAccessor): Endpoint[DispatchRoute] =
        post("fleet" :: "dispatch" :: "routes" :: param("access_token") :: jsonBody[DispatchRouteCreate]) { (accessToken: String, createDispatchRouteParams: DispatchRouteCreate) =>
          da.Routes_createDispatchRoute(accessToken, createDispatchRouteParams) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DispatchRoute
        */
        private def createDriverDispatchRoute(da: DataAccessor): Endpoint[DispatchRoute] =
        post("fleet" :: "drivers" :: long :: "dispatch" :: "routes" :: param("access_token") :: jsonBody[DispatchRouteCreate]) { (accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate) =>
          da.Routes_createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DispatchRoute
        */
        private def createVehicleDispatchRoute(da: DataAccessor): Endpoint[DispatchRoute] =
        post("fleet" :: "vehicles" :: long :: "dispatch" :: "routes" :: param("access_token") :: jsonBody[DispatchRouteCreate]) { (accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate) =>
          da.Routes_createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams) match {
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
        private def deleteDispatchRouteById(da: DataAccessor): Endpoint[Unit] =
        delete("fleet" :: "dispatch" :: "routes" :: long :: param("access_token")) { (accessToken: String, routeId: Long) =>
          da.Routes_deleteDispatchRouteById(accessToken, routeId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[DispatchRoute]
        */
        private def fetchAllDispatchRoutes(da: DataAccessor): Endpoint[Seq[DispatchRoute]] =
        get("fleet" :: "dispatch" :: "routes" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong)) :: paramOption("end_time").map(_.map(_.toLong)) :: paramOption("duration").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long], endTime: Option[Long], duration: Option[Long]) =>
          da.Routes_fetchAllDispatchRoutes(accessToken, groupId, endTime, duration) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AllRouteJobUpdates
        */
        private def fetchAllRouteJobUpdates(da: DataAccessor): Endpoint[AllRouteJobUpdates] =
        get("fleet" :: "dispatch" :: "routes" :: "job_updates" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong)) :: paramOption("sequence_id") :: paramOption("include")) { (accessToken: String, groupId: Option[Long], sequenceId: Option[String], include: Option[String]) =>
          da.Routes_fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DispatchRoute
        */
        private def getDispatchRouteById(da: DataAccessor): Endpoint[DispatchRoute] =
        get("fleet" :: "dispatch" :: "routes" :: long :: param("access_token")) { (accessToken: String, routeId: Long) =>
          da.Routes_getDispatchRouteById(accessToken, routeId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DispatchRouteHistory
        */
        private def getDispatchRouteHistory(da: DataAccessor): Endpoint[DispatchRouteHistory] =
        get("fleet" :: "dispatch" :: "routes" :: long :: "history" :: param("access_token") :: paramOption("start_time").map(_.map(_.toLong)) :: paramOption("end_time").map(_.map(_.toLong))) { (accessToken: String, routeId: Long, startTime: Option[Long], endTime: Option[Long]) =>
          da.Routes_getDispatchRouteHistory(accessToken, routeId, startTime, endTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[DispatchRoute]
        */
        private def getDispatchRoutesByDriverId(da: DataAccessor): Endpoint[Seq[DispatchRoute]] =
        get("fleet" :: "drivers" :: long :: "dispatch" :: "routes" :: param("access_token") :: paramOption("end_time").map(_.map(_.toLong)) :: paramOption("duration").map(_.map(_.toLong))) { (accessToken: String, driverId: Long, endTime: Option[Long], duration: Option[Long]) =>
          da.Routes_getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[DispatchRoute]
        */
        private def getDispatchRoutesByVehicleId(da: DataAccessor): Endpoint[Seq[DispatchRoute]] =
        get("fleet" :: "vehicles" :: long :: "dispatch" :: "routes" :: param("access_token") :: paramOption("end_time").map(_.map(_.toLong)) :: paramOption("duration").map(_.map(_.toLong))) { (accessToken: String, vehicleId: Long, endTime: Option[Long], duration: Option[Long]) =>
          da.Routes_getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DispatchRoute
        */
        private def updateDispatchRouteById(da: DataAccessor): Endpoint[DispatchRoute] =
        put("fleet" :: "dispatch" :: "routes" :: long :: param("access_token") :: jsonBody[DispatchRoute]) { (accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute) =>
          da.Routes_updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams) match {
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
      val file = File.createTempFile("tmpRoutesApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
