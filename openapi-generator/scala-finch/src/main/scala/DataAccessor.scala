package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A InlineResponse2001
        */
        def Assets_getAllAssetCurrentLocations(accessToken: String, groupId: Option[Long]): Either[CommonError,InlineResponse2001] = Left(TODO)

        /**
        * 
        * @return A InlineResponse200
        */
        def Assets_getAllAssets(accessToken: String, groupId: Option[Long]): Either[CommonError,InlineResponse200] = Left(TODO)

        /**
        * 
        * @return A Seq[Object]
        */
        def Assets_getAssetLocation(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Either[CommonError,Seq[Object]] = Left(TODO)

        /**
        * 
        * @return A AssetReeferResponse
        */
        def Assets_getAssetReefer(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Either[CommonError,AssetReeferResponse] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Drivers_createDriver(accessToken: String, createDriverParam: DriverForCreate): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Drivers_deactivateDriver(accessToken: String, driverIdOrExternalId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Seq[Driver]
        */
        def Drivers_getAllDeactivatedDrivers(accessToken: String, groupId: Option[Long]): Either[CommonError,Seq[Driver]] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Drivers_getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Drivers_getDriverById(accessToken: String, driverIdOrExternalId: String): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Drivers_reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fleet_addFleetAddress(accessToken: String, addressParam: InlineObject2): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Seq[Address]
        */
        def Fleet_addOrganizationAddresses(accessToken: String, addresses: InlineObject): Either[CommonError,Seq[Address]] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Fleet_createDispatchRoute(accessToken: String, createDispatchRouteParams: DispatchRouteCreate): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Fleet_createDriver(accessToken: String, createDriverParam: DriverForCreate): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Fleet_createDriverDispatchRoute(accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A Document
        */
        def Fleet_createDriverDocument(accessToken: String, driverId: Long, createDocumentParams: DocumentCreate): Either[CommonError,Document] = Left(TODO)

        /**
        * 
        * @return A DvirBase
        */
        def Fleet_createDvir(accessToken: String, createDvirParam: InlineObject12): Either[CommonError,DvirBase] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Fleet_createVehicleDispatchRoute(accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fleet_deactivateDriver(accessToken: String, driverIdOrExternalId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fleet_deleteDispatchRouteById(accessToken: String, routeId: Long): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fleet_deleteOrganizationAddress(accessToken: String, addressId: Long): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Seq[DispatchRoute]
        */
        def Fleet_fetchAllDispatchRoutes(accessToken: String, groupId: Option[Long], endTime: Option[Long], duration: Option[Long]): Either[CommonError,Seq[DispatchRoute]] = Left(TODO)

        /**
        * 
        * @return A AllRouteJobUpdates
        */
        def Fleet_fetchAllRouteJobUpdates(accessToken: String, groupId: Option[Long], sequenceId: Option[String], include: Option[String]): Either[CommonError,AllRouteJobUpdates] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2001
        */
        def Fleet_getAllAssetCurrentLocations(accessToken: String, groupId: Option[Long]): Either[CommonError,InlineResponse2001] = Left(TODO)

        /**
        * 
        * @return A InlineResponse200
        */
        def Fleet_getAllAssets(accessToken: String, groupId: Option[Long]): Either[CommonError,InlineResponse200] = Left(TODO)

        /**
        * 
        * @return A Seq[Driver]
        */
        def Fleet_getAllDeactivatedDrivers(accessToken: String, groupId: Option[Long]): Either[CommonError,Seq[Driver]] = Left(TODO)

        /**
        * 
        * @return A Seq[Object]
        */
        def Fleet_getAssetLocation(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Either[CommonError,Seq[Object]] = Left(TODO)

        /**
        * 
        * @return A AssetReeferResponse
        */
        def Fleet_getAssetReefer(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Either[CommonError,AssetReeferResponse] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Fleet_getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Fleet_getDispatchRouteById(accessToken: String, routeId: Long): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A DispatchRouteHistory
        */
        def Fleet_getDispatchRouteHistory(accessToken: String, routeId: Long, startTime: Option[Long], endTime: Option[Long]): Either[CommonError,DispatchRouteHistory] = Left(TODO)

        /**
        * 
        * @return A Seq[DispatchRoute]
        */
        def Fleet_getDispatchRoutesByDriverId(accessToken: String, driverId: Long, endTime: Option[Long], duration: Option[Long]): Either[CommonError,Seq[DispatchRoute]] = Left(TODO)

        /**
        * 
        * @return A Seq[DispatchRoute]
        */
        def Fleet_getDispatchRoutesByVehicleId(accessToken: String, vehicleId: Long, endTime: Option[Long], duration: Option[Long]): Either[CommonError,Seq[DispatchRoute]] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Fleet_getDriverById(accessToken: String, driverIdOrExternalId: String): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A Seq[DocumentType]
        */
        def Fleet_getDriverDocumentTypesByOrgId(): Either[CommonError,Seq[DocumentType]] = Left(TODO)

        /**
        * 
        * @return A Seq[Document]
        */
        def Fleet_getDriverDocumentsByOrgId(accessToken: String, endMs: Option[Long], durationMs: Option[Long]): Either[CommonError,Seq[Document]] = Left(TODO)

        /**
        * 
        * @return A DriverSafetyScoreResponse
        */
        def Fleet_getDriverSafetyScore(driverId: Long, accessToken: String, startMs: Long, endMs: Long): Either[CommonError,DriverSafetyScoreResponse] = Left(TODO)

        /**
        * 
        * @return A DvirListResponse
        */
        def Fleet_getDvirs(accessToken: String, endMs: Int, durationMs: Int, groupId: Option[Int]): Either[CommonError,DvirListResponse] = Left(TODO)

        /**
        * 
        * @return A DriversResponse
        */
        def Fleet_getFleetDrivers(accessToken: String, groupDriversParam: InlineObject3): Either[CommonError,DriversResponse] = Left(TODO)

        /**
        * 
        * @return A DriverDailyLogResponse
        */
        def Fleet_getFleetDriversHosDailyLogs(accessToken: String, driverId: Long, hosLogsParam: InlineObject6): Either[CommonError,DriverDailyLogResponse] = Left(TODO)

        /**
        * 
        * @return A DriversSummaryResponse
        */
        def Fleet_getFleetDriversSummary(accessToken: String, driversSummaryParam: InlineObject5, snapToDayBounds: Option[Boolean]): Either[CommonError,DriversSummaryResponse] = Left(TODO)

        /**
        * 
        * @return A HosAuthenticationLogsResponse
        */
        def Fleet_getFleetHosAuthenticationLogs(accessToken: String, hosAuthenticationLogsParam: InlineObject7): Either[CommonError,HosAuthenticationLogsResponse] = Left(TODO)

        /**
        * 
        * @return A HosLogsResponse
        */
        def Fleet_getFleetHosLogs(accessToken: String, hosLogsParam: InlineObject8): Either[CommonError,HosLogsResponse] = Left(TODO)

        /**
        * 
        * @return A HosLogsSummaryResponse
        */
        def Fleet_getFleetHosLogsSummary(accessToken: String, hosLogsParam: InlineObject9): Either[CommonError,HosLogsSummaryResponse] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2003
        */
        def Fleet_getFleetLocations(accessToken: String, groupParam: InlineObject11): Either[CommonError,InlineResponse2003] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2004
        */
        def Fleet_getFleetMaintenanceList(accessToken: String, groupParam: InlineObject13): Either[CommonError,InlineResponse2004] = Left(TODO)

        /**
        * 
        * @return A TripResponse
        */
        def Fleet_getFleetTrips(accessToken: String, tripsParam: InlineObject15): Either[CommonError,TripResponse] = Left(TODO)

        /**
        * 
        * @return A FleetVehicleResponse
        */
        def Fleet_getFleetVehicle(accessToken: String, vehicleIdOrExternalId: String): Either[CommonError,FleetVehicleResponse] = Left(TODO)

        /**
        * 
        * @return A Address
        */
        def Fleet_getOrganizationAddress(accessToken: String, addressId: Long): Either[CommonError,Address] = Left(TODO)

        /**
        * 
        * @return A Seq[Address]
        */
        def Fleet_getOrganizationAddresses(accessToken: String): Either[CommonError,Seq[Address]] = Left(TODO)

        /**
        * 
        * @return A Contact
        */
        def Fleet_getOrganizationContact(accessToken: String, contactId: Long): Either[CommonError,Contact] = Left(TODO)

        /**
        * 
        * @return A VehicleHarshEventResponse
        */
        def Fleet_getVehicleHarshEvent(vehicleId: Long, accessToken: String, timestamp: Long): Either[CommonError,VehicleHarshEventResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[FleetVehicleLocation]
        */
        def Fleet_getVehicleLocations(accessToken: String, vehicleId: Long, startMs: Long, endMs: Long): Either[CommonError,Seq[FleetVehicleLocation]] = Left(TODO)

        /**
        * 
        * @return A VehicleSafetyScoreResponse
        */
        def Fleet_getVehicleSafetyScore(vehicleId: Long, accessToken: String, startMs: Long, endMs: Long): Either[CommonError,VehicleSafetyScoreResponse] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2005
        */
        def Fleet_getVehicleStats(accessToken: String, startMs: Int, endMs: Int, series: Option[String], tagIds: Option[String], startingAfter: Option[String], endingBefore: Option[String], limit: Option[Long]): Either[CommonError,InlineResponse2005] = Left(TODO)

        /**
        * 
        * @return A Seq[Object]
        */
        def Fleet_getVehiclesLocations(accessToken: String, startMs: Int, endMs: Int): Either[CommonError,Seq[Object]] = Left(TODO)

        /**
        * 
        * @return A Seq[Contact]
        */
        def Fleet_listContacts(accessToken: String): Either[CommonError,Seq[Contact]] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2002
        */
        def Fleet_listFleet(accessToken: String, groupParam: InlineObject10, startingAfter: Option[String], endingBefore: Option[String], limit: Option[Long]): Either[CommonError,InlineResponse2002] = Left(TODO)

        /**
        * 
        * @return A FleetVehicleResponse
        */
        def Fleet_patchFleetVehicle(accessToken: String, vehicleIdOrExternalId: String, data: InlineObject16): Either[CommonError,FleetVehicleResponse] = Left(TODO)

        /**
        * 
        * @return A Driver
        */
        def Fleet_reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4): Either[CommonError,Driver] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Fleet_updateDispatchRouteById(accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fleet_updateOrganizationAddress(accessToken: String, addressId: Long, address: InlineObject1): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fleet_updateVehicles(accessToken: String, vehicleUpdateParam: InlineObject14): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2006
        */
        def Industrial_getAllDataInputs(accessToken: String, groupId: Option[Long], startMs: Option[Long], endMs: Option[Long]): Either[CommonError,InlineResponse2006] = Left(TODO)

        /**
        * 
        * @return A DataInputHistoryResponse
        */
        def Industrial_getDataInput(accessToken: String, dataInputId: Long, startMs: Option[Long], endMs: Option[Long]): Either[CommonError,DataInputHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2007
        */
        def Industrial_getMachines(accessToken: String, groupParam: InlineObject18): Either[CommonError,InlineResponse2007] = Left(TODO)

        /**
        * 
        * @return A MachineHistoryResponse
        */
        def Industrial_getMachinesHistory(accessToken: String, historyParam: InlineObject17): Either[CommonError,MachineHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Routes_createDispatchRoute(accessToken: String, createDispatchRouteParams: DispatchRouteCreate): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Routes_createDriverDispatchRoute(accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Routes_createVehicleDispatchRoute(accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Routes_deleteDispatchRouteById(accessToken: String, routeId: Long): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Seq[DispatchRoute]
        */
        def Routes_fetchAllDispatchRoutes(accessToken: String, groupId: Option[Long], endTime: Option[Long], duration: Option[Long]): Either[CommonError,Seq[DispatchRoute]] = Left(TODO)

        /**
        * 
        * @return A AllRouteJobUpdates
        */
        def Routes_fetchAllRouteJobUpdates(accessToken: String, groupId: Option[Long], sequenceId: Option[String], include: Option[String]): Either[CommonError,AllRouteJobUpdates] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Routes_getDispatchRouteById(accessToken: String, routeId: Long): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A DispatchRouteHistory
        */
        def Routes_getDispatchRouteHistory(accessToken: String, routeId: Long, startTime: Option[Long], endTime: Option[Long]): Either[CommonError,DispatchRouteHistory] = Left(TODO)

        /**
        * 
        * @return A Seq[DispatchRoute]
        */
        def Routes_getDispatchRoutesByDriverId(accessToken: String, driverId: Long, endTime: Option[Long], duration: Option[Long]): Either[CommonError,Seq[DispatchRoute]] = Left(TODO)

        /**
        * 
        * @return A Seq[DispatchRoute]
        */
        def Routes_getDispatchRoutesByVehicleId(accessToken: String, vehicleId: Long, endTime: Option[Long], duration: Option[Long]): Either[CommonError,Seq[DispatchRoute]] = Left(TODO)

        /**
        * 
        * @return A DispatchRoute
        */
        def Routes_updateDispatchRouteById(accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute): Either[CommonError,DispatchRoute] = Left(TODO)

        /**
        * 
        * @return A DriverSafetyScoreResponse
        */
        def Safety_getDriverSafetyScore(driverId: Long, accessToken: String, startMs: Long, endMs: Long): Either[CommonError,DriverSafetyScoreResponse] = Left(TODO)

        /**
        * 
        * @return A VehicleHarshEventResponse
        */
        def Safety_getVehicleHarshEvent(vehicleId: Long, accessToken: String, timestamp: Long): Either[CommonError,VehicleHarshEventResponse] = Left(TODO)

        /**
        * 
        * @return A VehicleSafetyScoreResponse
        */
        def Safety_getVehicleSafetyScore(vehicleId: Long, accessToken: String, startMs: Long, endMs: Long): Either[CommonError,VehicleSafetyScoreResponse] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2008
        */
        def Sensors_getSensors(accessToken: String, groupParam: InlineObject23): Either[CommonError,InlineResponse2008] = Left(TODO)

        /**
        * 
        * @return A CargoResponse
        */
        def Sensors_getSensorsCargo(accessToken: String, sensorParam: InlineObject19): Either[CommonError,CargoResponse] = Left(TODO)

        /**
        * 
        * @return A DoorResponse
        */
        def Sensors_getSensorsDoor(accessToken: String, sensorParam: InlineObject20): Either[CommonError,DoorResponse] = Left(TODO)

        /**
        * 
        * @return A SensorHistoryResponse
        */
        def Sensors_getSensorsHistory(accessToken: String, historyParam: InlineObject21): Either[CommonError,SensorHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A HumidityResponse
        */
        def Sensors_getSensorsHumidity(accessToken: String, sensorParam: InlineObject22): Either[CommonError,HumidityResponse] = Left(TODO)

        /**
        * 
        * @return A TemperatureResponse
        */
        def Sensors_getSensorsTemperature(accessToken: String, sensorParam: InlineObject24): Either[CommonError,TemperatureResponse] = Left(TODO)

        /**
        * 
        * @return A Tag
        */
        def Tags_createTag(accessToken: String, tagCreateParams: TagCreate): Either[CommonError,Tag] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Tags_deleteTagById(accessToken: String, tagId: Long): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A InlineResponse2009
        */
        def Tags_getAllTags(accessToken: String, groupId: Option[Long]): Either[CommonError,InlineResponse2009] = Left(TODO)

        /**
        * 
        * @return A Tag
        */
        def Tags_getTagById(accessToken: String, tagId: Long): Either[CommonError,Tag] = Left(TODO)

        /**
        * 
        * @return A Tag
        */
        def Tags_modifyTagById(accessToken: String, tagId: Long, tagModifyParams: TagModify): Either[CommonError,Tag] = Left(TODO)

        /**
        * 
        * @return A Tag
        */
        def Tags_updateTagById(accessToken: String, tagId: Long, updateTagParams: TagUpdate): Either[CommonError,Tag] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Users_deleteUserById(accessToken: String, userId: Long): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A User
        */
        def Users_getUserById(accessToken: String, userId: Long): Either[CommonError,User] = Left(TODO)

        /**
        * 
        * @return A Seq[UserRole]
        */
        def Users_listUserRoles(accessToken: String): Either[CommonError,Seq[UserRole]] = Left(TODO)

        /**
        * 
        * @return A Seq[User]
        */
        def Users_listUsers(accessToken: String): Either[CommonError,Seq[User]] = Left(TODO)

}