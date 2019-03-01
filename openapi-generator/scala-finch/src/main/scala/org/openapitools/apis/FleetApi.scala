package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Address
import org.openapitools.models.AllRouteJobUpdates
import org.openapitools.models.AssetReeferResponse
import org.openapitools.models.Contact
import org.openapitools.models.DispatchRoute
import org.openapitools.models.DispatchRouteCreate
import org.openapitools.models.DispatchRouteHistory
import org.openapitools.models.Document
import org.openapitools.models.DocumentCreate
import org.openapitools.models.DocumentType
import org.openapitools.models.Driver
import org.openapitools.models.DriverDailyLogResponse
import org.openapitools.models.DriverForCreate
import org.openapitools.models.DriverSafetyScoreResponse
import org.openapitools.models.DriversResponse
import org.openapitools.models.DriversSummaryResponse
import org.openapitools.models.DvirBase
import org.openapitools.models.DvirListResponse
import org.openapitools.models.FleetVehicleLocation
import org.openapitools.models.FleetVehicleResponse
import org.openapitools.models.HosAuthenticationLogsResponse
import org.openapitools.models.HosLogsResponse
import org.openapitools.models.HosLogsSummaryResponse
import org.openapitools.models.InlineObject
import org.openapitools.models.InlineObject1
import org.openapitools.models.InlineObject10
import org.openapitools.models.InlineObject11
import org.openapitools.models.InlineObject12
import org.openapitools.models.InlineObject13
import org.openapitools.models.InlineObject14
import org.openapitools.models.InlineObject15
import org.openapitools.models.InlineObject16
import org.openapitools.models.InlineObject2
import org.openapitools.models.InlineObject3
import org.openapitools.models.InlineObject4
import org.openapitools.models.InlineObject5
import org.openapitools.models.InlineObject6
import org.openapitools.models.InlineObject7
import org.openapitools.models.InlineObject8
import org.openapitools.models.InlineObject9
import org.openapitools.models.InlineResponse200
import org.openapitools.models.InlineResponse2001
import org.openapitools.models.InlineResponse2002
import org.openapitools.models.InlineResponse2003
import org.openapitools.models.InlineResponse2004
import org.openapitools.models.InlineResponse2005
import org.openapitools.models.TripResponse
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

object FleetApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        addFleetAddress(da) :+:
        addOrganizationAddresses(da) :+:
        createDispatchRoute(da) :+:
        createDriver(da) :+:
        createDriverDispatchRoute(da) :+:
        createDriverDocument(da) :+:
        createDvir(da) :+:
        createVehicleDispatchRoute(da) :+:
        deactivateDriver(da) :+:
        deleteDispatchRouteById(da) :+:
        deleteOrganizationAddress(da) :+:
        fetchAllDispatchRoutes(da) :+:
        fetchAllRouteJobUpdates(da) :+:
        getAllAssetCurrentLocations(da) :+:
        getAllAssets(da) :+:
        getAllDeactivatedDrivers(da) :+:
        getAssetLocation(da) :+:
        getAssetReefer(da) :+:
        getDeactivatedDriverById(da) :+:
        getDispatchRouteById(da) :+:
        getDispatchRouteHistory(da) :+:
        getDispatchRoutesByDriverId(da) :+:
        getDispatchRoutesByVehicleId(da) :+:
        getDriverById(da) :+:
        getDriverDocumentTypesByOrgId(da) :+:
        getDriverDocumentsByOrgId(da) :+:
        getDriverSafetyScore(da) :+:
        getDvirs(da) :+:
        getFleetDrivers(da) :+:
        getFleetDriversHosDailyLogs(da) :+:
        getFleetDriversSummary(da) :+:
        getFleetHosAuthenticationLogs(da) :+:
        getFleetHosLogs(da) :+:
        getFleetHosLogsSummary(da) :+:
        getFleetLocations(da) :+:
        getFleetMaintenanceList(da) :+:
        getFleetTrips(da) :+:
        getFleetVehicle(da) :+:
        getOrganizationAddress(da) :+:
        getOrganizationAddresses(da) :+:
        getOrganizationContact(da) :+:
        getVehicleHarshEvent(da) :+:
        getVehicleLocations(da) :+:
        getVehicleSafetyScore(da) :+:
        getVehicleStats(da) :+:
        getVehiclesLocations(da) :+:
        listContacts(da) :+:
        listFleet(da) :+:
        patchFleetVehicle(da) :+:
        reactivateDriverById(da) :+:
        updateDispatchRouteById(da) :+:
        updateOrganizationAddress(da) :+:
        updateVehicles(da)


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
        * @return An endpoint representing a Unit
        */
        private def addFleetAddress(da: DataAccessor): Endpoint[Unit] =
        post("fleet" :: "add_address" :: param("access_token") :: jsonBody[InlineObject2]) { (accessToken: String, addressParam: InlineObject2) =>
          da.Fleet_addFleetAddress(accessToken, addressParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Address]
        */
        private def addOrganizationAddresses(da: DataAccessor): Endpoint[Seq[Address]] =
        post("addresses" :: param("access_token") :: jsonBody[InlineObject]) { (accessToken: String, addresses: InlineObject) =>
          da.Fleet_addOrganizationAddresses(accessToken, addresses) match {
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
        private def createDispatchRoute(da: DataAccessor): Endpoint[DispatchRoute] =
        post("fleet" :: "dispatch" :: "routes" :: param("access_token") :: jsonBody[DispatchRouteCreate]) { (accessToken: String, createDispatchRouteParams: DispatchRouteCreate) =>
          da.Fleet_createDispatchRoute(accessToken, createDispatchRouteParams) match {
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
        private def createDriver(da: DataAccessor): Endpoint[Driver] =
        post("fleet" :: "drivers" :: "create" :: param("access_token") :: jsonBody[DriverForCreate]) { (accessToken: String, createDriverParam: DriverForCreate) =>
          da.Fleet_createDriver(accessToken, createDriverParam) match {
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
          da.Fleet_createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Document
        */
        private def createDriverDocument(da: DataAccessor): Endpoint[Document] =
        post("fleet" :: "drivers" :: long :: "documents" :: param("access_token") :: jsonBody[DocumentCreate]) { (accessToken: String, driverId: Long, createDocumentParams: DocumentCreate) =>
          da.Fleet_createDriverDocument(accessToken, driverId, createDocumentParams) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DvirBase
        */
        private def createDvir(da: DataAccessor): Endpoint[DvirBase] =
        post("fleet" :: "maintenance" :: "dvirs" :: param("access_token") :: jsonBody[InlineObject12]) { (accessToken: String, createDvirParam: InlineObject12) =>
          da.Fleet_createDvir(accessToken, createDvirParam) match {
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
          da.Fleet_createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams) match {
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
          da.Fleet_deactivateDriver(accessToken, driverIdOrExternalId) match {
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
          da.Fleet_deleteDispatchRouteById(accessToken, routeId) match {
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
        private def deleteOrganizationAddress(da: DataAccessor): Endpoint[Unit] =
        delete("addresses" :: long :: param("access_token")) { (accessToken: String, addressId: Long) =>
          da.Fleet_deleteOrganizationAddress(accessToken, addressId) match {
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
          da.Fleet_fetchAllDispatchRoutes(accessToken, groupId, endTime, duration) match {
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
          da.Fleet_fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2001
        */
        private def getAllAssetCurrentLocations(da: DataAccessor): Endpoint[InlineResponse2001] =
        get("fleet" :: "assets" :: "locations" :: param("access_token") :: paramOption("group_id").map(_.map(_.toLong))) { (accessToken: String, groupId: Option[Long]) =>
          da.Fleet_getAllAssetCurrentLocations(accessToken, groupId) match {
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
          da.Fleet_getAllAssets(accessToken, groupId) match {
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
          da.Fleet_getAllDeactivatedDrivers(accessToken, groupId) match {
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
          da.Fleet_getAssetLocation(accessToken, assetId, startMs, endMs) match {
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
          da.Fleet_getAssetReefer(accessToken, assetId, startMs, endMs) match {
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
          da.Fleet_getDeactivatedDriverById(accessToken, driverIdOrExternalId) match {
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
          da.Fleet_getDispatchRouteById(accessToken, routeId) match {
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
          da.Fleet_getDispatchRouteHistory(accessToken, routeId, startTime, endTime) match {
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
          da.Fleet_getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration) match {
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
          da.Fleet_getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration) match {
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
          da.Fleet_getDriverById(accessToken, driverIdOrExternalId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[DocumentType]
        */
        private def getDriverDocumentTypesByOrgId(da: DataAccessor): Endpoint[Seq[DocumentType]] =
        get("fleet" :: "drivers" :: "document_types") { () =>
          da.Fleet_getDriverDocumentTypesByOrgId() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Document]
        */
        private def getDriverDocumentsByOrgId(da: DataAccessor): Endpoint[Seq[Document]] =
        get("fleet" :: "drivers" :: "documents" :: param("access_token") :: paramOption("endMs").map(_.map(_.toLong)) :: paramOption("durationMs").map(_.map(_.toLong))) { (accessToken: String, endMs: Option[Long], durationMs: Option[Long]) =>
          da.Fleet_getDriverDocumentsByOrgId(accessToken, endMs, durationMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DriverSafetyScoreResponse
        */
        private def getDriverSafetyScore(da: DataAccessor): Endpoint[DriverSafetyScoreResponse] =
        get("fleet" :: "drivers" :: long :: "safety" :: "score" :: param("access_token") :: param("startMs").map(_.toLong) :: param("endMs").map(_.toLong)) { (driverId: Long, accessToken: String, startMs: Long, endMs: Long) =>
          da.Fleet_getDriverSafetyScore(driverId, accessToken, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DvirListResponse
        */
        private def getDvirs(da: DataAccessor): Endpoint[DvirListResponse] =
        get("fleet" :: "maintenance" :: "dvirs" :: param("access_token") :: param("end_ms").map(_.toInt) :: param("duration_ms").map(_.toInt) :: paramOption("group_id").map(_.map(_.toInt))) { (accessToken: String, endMs: Int, durationMs: Int, groupId: Option[Int]) =>
          da.Fleet_getDvirs(accessToken, endMs, durationMs, groupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DriversResponse
        */
        private def getFleetDrivers(da: DataAccessor): Endpoint[DriversResponse] =
        post("fleet" :: "drivers" :: param("access_token") :: jsonBody[InlineObject3]) { (accessToken: String, groupDriversParam: InlineObject3) =>
          da.Fleet_getFleetDrivers(accessToken, groupDriversParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DriverDailyLogResponse
        */
        private def getFleetDriversHosDailyLogs(da: DataAccessor): Endpoint[DriverDailyLogResponse] =
        post("fleet" :: "drivers" :: long :: "hos_daily_logs" :: param("access_token") :: jsonBody[InlineObject6]) { (accessToken: String, driverId: Long, hosLogsParam: InlineObject6) =>
          da.Fleet_getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DriversSummaryResponse
        */
        private def getFleetDriversSummary(da: DataAccessor): Endpoint[DriversSummaryResponse] =
        post("fleet" :: "drivers" :: "summary" :: param("access_token") :: jsonBody[InlineObject5] :: paramOption("snap_to_day_bounds").map(_.map(_.toBoolean))) { (accessToken: String, driversSummaryParam: InlineObject5, snapToDayBounds: Option[Boolean]) =>
          da.Fleet_getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a HosAuthenticationLogsResponse
        */
        private def getFleetHosAuthenticationLogs(da: DataAccessor): Endpoint[HosAuthenticationLogsResponse] =
        post("fleet" :: "hos_authentication_logs" :: param("access_token") :: jsonBody[InlineObject7]) { (accessToken: String, hosAuthenticationLogsParam: InlineObject7) =>
          da.Fleet_getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a HosLogsResponse
        */
        private def getFleetHosLogs(da: DataAccessor): Endpoint[HosLogsResponse] =
        post("fleet" :: "hos_logs" :: param("access_token") :: jsonBody[InlineObject8]) { (accessToken: String, hosLogsParam: InlineObject8) =>
          da.Fleet_getFleetHosLogs(accessToken, hosLogsParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a HosLogsSummaryResponse
        */
        private def getFleetHosLogsSummary(da: DataAccessor): Endpoint[HosLogsSummaryResponse] =
        post("fleet" :: "hos_logs_summary" :: param("access_token") :: jsonBody[InlineObject9]) { (accessToken: String, hosLogsParam: InlineObject9) =>
          da.Fleet_getFleetHosLogsSummary(accessToken, hosLogsParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2003
        */
        private def getFleetLocations(da: DataAccessor): Endpoint[InlineResponse2003] =
        post("fleet" :: "locations" :: param("access_token") :: jsonBody[InlineObject11]) { (accessToken: String, groupParam: InlineObject11) =>
          da.Fleet_getFleetLocations(accessToken, groupParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2004
        */
        private def getFleetMaintenanceList(da: DataAccessor): Endpoint[InlineResponse2004] =
        post("fleet" :: "maintenance" :: "list" :: param("access_token") :: jsonBody[InlineObject13]) { (accessToken: String, groupParam: InlineObject13) =>
          da.Fleet_getFleetMaintenanceList(accessToken, groupParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TripResponse
        */
        private def getFleetTrips(da: DataAccessor): Endpoint[TripResponse] =
        post("fleet" :: "trips" :: param("access_token") :: jsonBody[InlineObject15]) { (accessToken: String, tripsParam: InlineObject15) =>
          da.Fleet_getFleetTrips(accessToken, tripsParam) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FleetVehicleResponse
        */
        private def getFleetVehicle(da: DataAccessor): Endpoint[FleetVehicleResponse] =
        get("fleet" :: "vehicles" :: string :: param("access_token")) { (accessToken: String, vehicleIdOrExternalId: String) =>
          da.Fleet_getFleetVehicle(accessToken, vehicleIdOrExternalId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Address
        */
        private def getOrganizationAddress(da: DataAccessor): Endpoint[Address] =
        get("addresses" :: long :: param("access_token")) { (accessToken: String, addressId: Long) =>
          da.Fleet_getOrganizationAddress(accessToken, addressId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Address]
        */
        private def getOrganizationAddresses(da: DataAccessor): Endpoint[Seq[Address]] =
        get("addresses" :: param("access_token")) { (accessToken: String) =>
          da.Fleet_getOrganizationAddresses(accessToken) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Contact
        */
        private def getOrganizationContact(da: DataAccessor): Endpoint[Contact] =
        get("contacts" :: long :: param("access_token")) { (accessToken: String, contactId: Long) =>
          da.Fleet_getOrganizationContact(accessToken, contactId) match {
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
          da.Fleet_getVehicleHarshEvent(vehicleId, accessToken, timestamp) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[FleetVehicleLocation]
        */
        private def getVehicleLocations(da: DataAccessor): Endpoint[Seq[FleetVehicleLocation]] =
        get("fleet" :: "vehicles" :: long :: "locations" :: param("access_token") :: param("startMs").map(_.toLong) :: param("endMs").map(_.toLong)) { (accessToken: String, vehicleId: Long, startMs: Long, endMs: Long) =>
          da.Fleet_getVehicleLocations(accessToken, vehicleId, startMs, endMs) match {
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
          da.Fleet_getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2005
        */
        private def getVehicleStats(da: DataAccessor): Endpoint[InlineResponse2005] =
        get("fleet" :: "vehicles" :: "stats" :: param("access_token") :: param("startMs").map(_.toInt) :: param("endMs").map(_.toInt) :: paramOption("series") :: paramOption("tagIds") :: paramOption("startingAfter") :: paramOption("endingBefore") :: paramOption("limit").map(_.map(_.toLong))) { (accessToken: String, startMs: Int, endMs: Int, series: Option[String], tagIds: Option[String], startingAfter: Option[String], endingBefore: Option[String], limit: Option[Long]) =>
          da.Fleet_getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit) match {
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
        private def getVehiclesLocations(da: DataAccessor): Endpoint[Seq[Object]] =
        get("fleet" :: "vehicles" :: "locations" :: param("access_token") :: param("startMs").map(_.toInt) :: param("endMs").map(_.toInt)) { (accessToken: String, startMs: Int, endMs: Int) =>
          da.Fleet_getVehiclesLocations(accessToken, startMs, endMs) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Contact]
        */
        private def listContacts(da: DataAccessor): Endpoint[Seq[Contact]] =
        get("contacts" :: param("access_token")) { (accessToken: String) =>
          da.Fleet_listContacts(accessToken) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InlineResponse2002
        */
        private def listFleet(da: DataAccessor): Endpoint[InlineResponse2002] =
        post("fleet" :: "list" :: param("access_token") :: jsonBody[InlineObject10] :: paramOption("startingAfter") :: paramOption("endingBefore") :: paramOption("limit").map(_.map(_.toLong))) { (accessToken: String, groupParam: InlineObject10, startingAfter: Option[String], endingBefore: Option[String], limit: Option[Long]) =>
          da.Fleet_listFleet(accessToken, groupParam, startingAfter, endingBefore, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FleetVehicleResponse
        */
        private def patchFleetVehicle(da: DataAccessor): Endpoint[FleetVehicleResponse] =
        patch("fleet" :: "vehicles" :: string :: param("access_token") :: jsonBody[InlineObject16]) { (accessToken: String, vehicleIdOrExternalId: String, data: InlineObject16) =>
          da.Fleet_patchFleetVehicle(accessToken, vehicleIdOrExternalId, data) match {
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
          da.Fleet_reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam) match {
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
          da.Fleet_updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams) match {
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
        private def updateOrganizationAddress(da: DataAccessor): Endpoint[Unit] =
        patch("addresses" :: long :: param("access_token") :: jsonBody[InlineObject1]) { (accessToken: String, addressId: Long, address: InlineObject1) =>
          da.Fleet_updateOrganizationAddress(accessToken, addressId, address) match {
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
        private def updateVehicles(da: DataAccessor): Endpoint[Unit] =
        post("fleet" :: "set_data" :: param("access_token") :: jsonBody[InlineObject14]) { (accessToken: String, vehicleUpdateParam: InlineObject14) =>
          da.Fleet_updateVehicles(accessToken, vehicleUpdateParam) match {
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
      val file = File.createTempFile("tmpFleetApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
