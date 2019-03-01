/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<List<Address>>(){}.getType();
    }
    
    if ("AddressGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressGeofence>>(){}.getType();
    }
    
    if ("AddressGeofenceCircle".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressGeofenceCircle>>(){}.getType();
    }
    
    if ("AddressGeofencePolygon".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressGeofencePolygon>>(){}.getType();
    }
    
    if ("AddressGeofencePolygonVertices".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressGeofencePolygonVertices>>(){}.getType();
    }
    
    if ("AddressNotes".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressNotes>>(){}.getType();
    }
    
    if ("AddressParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressParam>>(){}.getType();
    }
    
    if ("Addresses".equalsIgnoreCase(className)) {
      return new TypeToken<List<Addresses>>(){}.getType();
    }
    
    if ("AddressesAddresses".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressesAddresses>>(){}.getType();
    }
    
    if ("AllRouteJobUpdates".equalsIgnoreCase(className)) {
      return new TypeToken<List<AllRouteJobUpdates>>(){}.getType();
    }
    
    if ("Asset".equalsIgnoreCase(className)) {
      return new TypeToken<List<Asset>>(){}.getType();
    }
    
    if ("AssetCable".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetCable>>(){}.getType();
    }
    
    if ("AssetCurrentLocation".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetCurrentLocation>>(){}.getType();
    }
    
    if ("AssetCurrentLocationsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetCurrentLocationsResponse>>(){}.getType();
    }
    
    if ("AssetLocationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetLocationResponse>>(){}.getType();
    }
    
    if ("AssetLocationResponseInner".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetLocationResponseInner>>(){}.getType();
    }
    
    if ("AssetReeferResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponse>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStats".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStats>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsAlarms".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsAlarms>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsAlarms1".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsAlarms1>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsEngineHours".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsEngineHours>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsFuelPercentage".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsFuelPercentage>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsPowerStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsPowerStatus>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsReturnAirTemp".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsReturnAirTemp>>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsSetPoint".equalsIgnoreCase(className)) {
      return new TypeToken<List<AssetReeferResponseReeferStatsSetPoint>>(){}.getType();
    }
    
    if ("AuxInput".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuxInput>>(){}.getType();
    }
    
    if ("AuxInputSeries".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuxInputSeries>>(){}.getType();
    }
    
    if ("CargoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CargoResponse>>(){}.getType();
    }
    
    if ("CargoResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<List<CargoResponseSensors>>(){}.getType();
    }
    
    if ("Contact".equalsIgnoreCase(className)) {
      return new TypeToken<List<Contact>>(){}.getType();
    }
    
    if ("ContactIds".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactIds>>(){}.getType();
    }
    
    if ("CreateDvirParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateDvirParam>>(){}.getType();
    }
    
    if ("CurrentDriver".equalsIgnoreCase(className)) {
      return new TypeToken<List<CurrentDriver>>(){}.getType();
    }
    
    if ("Data".equalsIgnoreCase(className)) {
      return new TypeToken<List<Data>>(){}.getType();
    }
    
    if ("DataInputHistoryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DataInputHistoryResponse>>(){}.getType();
    }
    
    if ("DataInputHistoryResponsePoints".equalsIgnoreCase(className)) {
      return new TypeToken<List<DataInputHistoryResponsePoints>>(){}.getType();
    }
    
    if ("DispatchJobCreate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchJobCreate>>(){}.getType();
    }
    
    if ("DispatchRouteBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchRouteBase>>(){}.getType();
    }
    
    if ("DispatchRouteHistoricalEntry".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchRouteHistoricalEntry>>(){}.getType();
    }
    
    if ("DispatchRouteHistory".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchRouteHistory>>(){}.getType();
    }
    
    if ("DispatchRoutes".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchRoutes>>(){}.getType();
    }
    
    if ("DocumentBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentBase>>(){}.getType();
    }
    
    if ("DocumentFieldCreate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentFieldCreate>>(){}.getType();
    }
    
    if ("DocumentFieldCreatePhotoValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentFieldCreatePhotoValue>>(){}.getType();
    }
    
    if ("DocumentFieldType".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentFieldType>>(){}.getType();
    }
    
    if ("DocumentFieldTypeNumberValueTypeMetadata".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentFieldTypeNumberValueTypeMetadata>>(){}.getType();
    }
    
    if ("DocumentFieldTypes".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentFieldTypes>>(){}.getType();
    }
    
    if ("DocumentType".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentType>>(){}.getType();
    }
    
    if ("DocumentTypes".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentTypes>>(){}.getType();
    }
    
    if ("Documents".equalsIgnoreCase(className)) {
      return new TypeToken<List<Documents>>(){}.getType();
    }
    
    if ("DoorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoorResponse>>(){}.getType();
    }
    
    if ("DoorResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoorResponseSensors>>(){}.getType();
    }
    
    if ("DriverBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriverBase>>(){}.getType();
    }
    
    if ("DriverDailyLogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriverDailyLogResponse>>(){}.getType();
    }
    
    if ("DriverDailyLogResponseDays".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriverDailyLogResponseDays>>(){}.getType();
    }
    
    if ("DriverSafetyScoreResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriverSafetyScoreResponse>>(){}.getType();
    }
    
    if ("DriversResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriversResponse>>(){}.getType();
    }
    
    if ("DriversSummaryParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriversSummaryParam>>(){}.getType();
    }
    
    if ("DriversSummaryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriversSummaryResponse>>(){}.getType();
    }
    
    if ("DriversSummaryResponseSummaries".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriversSummaryResponseSummaries>>(){}.getType();
    }
    
    if ("DvirBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirBase>>(){}.getType();
    }
    
    if ("DvirBaseAuthorSignature".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirBaseAuthorSignature>>(){}.getType();
    }
    
    if ("DvirBaseMechanicOrAgentSignature".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirBaseMechanicOrAgentSignature>>(){}.getType();
    }
    
    if ("DvirBaseNextDriverSignature".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirBaseNextDriverSignature>>(){}.getType();
    }
    
    if ("DvirBaseTrailerDefects".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirBaseTrailerDefects>>(){}.getType();
    }
    
    if ("DvirBaseVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirBaseVehicle>>(){}.getType();
    }
    
    if ("DvirListResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DvirListResponse>>(){}.getType();
    }
    
    if ("EngineState".equalsIgnoreCase(className)) {
      return new TypeToken<List<EngineState>>(){}.getType();
    }
    
    if ("ErrorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorResponse>>(){}.getType();
    }
    
    if ("FleetVehicleLocation".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehicleLocation>>(){}.getType();
    }
    
    if ("FleetVehicleLocations".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehicleLocations>>(){}.getType();
    }
    
    if ("FleetVehicleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehicleResponse>>(){}.getType();
    }
    
    if ("FleetVehicleResponseVehicleInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehicleResponseVehicleInfo>>(){}.getType();
    }
    
    if ("FleetVehiclesLocations".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehiclesLocations>>(){}.getType();
    }
    
    if ("FleetVehiclesLocationsInner".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehiclesLocationsInner>>(){}.getType();
    }
    
    if ("GroupDriversParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<GroupDriversParam>>(){}.getType();
    }
    
    if ("GroupParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<GroupParam>>(){}.getType();
    }
    
    if ("HistoryParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoryParam>>(){}.getType();
    }
    
    if ("HistoryParam1".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoryParam1>>(){}.getType();
    }
    
    if ("HosAuthenticationLogsParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosAuthenticationLogsParam>>(){}.getType();
    }
    
    if ("HosAuthenticationLogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosAuthenticationLogsResponse>>(){}.getType();
    }
    
    if ("HosAuthenticationLogsResponseAuthenticationLogs".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosAuthenticationLogsResponseAuthenticationLogs>>(){}.getType();
    }
    
    if ("HosLogsParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsParam>>(){}.getType();
    }
    
    if ("HosLogsParam1".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsParam1>>(){}.getType();
    }
    
    if ("HosLogsParam2".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsParam2>>(){}.getType();
    }
    
    if ("HosLogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsResponse>>(){}.getType();
    }
    
    if ("HosLogsResponseLogs".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsResponseLogs>>(){}.getType();
    }
    
    if ("HosLogsSummaryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsSummaryResponse>>(){}.getType();
    }
    
    if ("HosLogsSummaryResponseDrivers".equalsIgnoreCase(className)) {
      return new TypeToken<List<HosLogsSummaryResponseDrivers>>(){}.getType();
    }
    
    if ("HumidityResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HumidityResponse>>(){}.getType();
    }
    
    if ("HumidityResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<List<HumidityResponseSensors>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2001>>(){}.getType();
    }
    
    if ("InlineResponse2002".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2002>>(){}.getType();
    }
    
    if ("InlineResponse2003".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2003>>(){}.getType();
    }
    
    if ("InlineResponse2004".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2004>>(){}.getType();
    }
    
    if ("InlineResponse2005".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2005>>(){}.getType();
    }
    
    if ("InlineResponse2005VehicleStats".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2005VehicleStats>>(){}.getType();
    }
    
    if ("InlineResponse2006".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2006>>(){}.getType();
    }
    
    if ("InlineResponse2007".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2007>>(){}.getType();
    }
    
    if ("InlineResponse2008".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2008>>(){}.getType();
    }
    
    if ("InlineResponse2009".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2009>>(){}.getType();
    }
    
    if ("JobStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobStatus>>(){}.getType();
    }
    
    if ("JobUpdateObject".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobUpdateObject>>(){}.getType();
    }
    
    if ("Machine".equalsIgnoreCase(className)) {
      return new TypeToken<List<Machine>>(){}.getType();
    }
    
    if ("MachineHistoryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MachineHistoryResponse>>(){}.getType();
    }
    
    if ("MachineHistoryResponseMachines".equalsIgnoreCase(className)) {
      return new TypeToken<List<MachineHistoryResponseMachines>>(){}.getType();
    }
    
    if ("MachineHistoryResponseVibrations".equalsIgnoreCase(className)) {
      return new TypeToken<List<MachineHistoryResponseVibrations>>(){}.getType();
    }
    
    if ("Pagination".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pagination>>(){}.getType();
    }
    
    if ("PrevJobStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<PrevJobStatus>>(){}.getType();
    }
    
    if ("ReactivateDriverParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReactivateDriverParam>>(){}.getType();
    }
    
    if ("SafetyReportHarshEvent".equalsIgnoreCase(className)) {
      return new TypeToken<List<SafetyReportHarshEvent>>(){}.getType();
    }
    
    if ("Sensor".equalsIgnoreCase(className)) {
      return new TypeToken<List<Sensor>>(){}.getType();
    }
    
    if ("SensorHistoryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SensorHistoryResponse>>(){}.getType();
    }
    
    if ("SensorHistoryResponseResults".equalsIgnoreCase(className)) {
      return new TypeToken<List<SensorHistoryResponseResults>>(){}.getType();
    }
    
    if ("SensorParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<SensorParam>>(){}.getType();
    }
    
    if ("SensorshistorySeries".equalsIgnoreCase(className)) {
      return new TypeToken<List<SensorshistorySeries>>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<List<Tag>>(){}.getType();
    }
    
    if ("TagCreate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagCreate>>(){}.getType();
    }
    
    if ("TagIds".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagIds>>(){}.getType();
    }
    
    if ("TagMetadata".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagMetadata>>(){}.getType();
    }
    
    if ("TagModify".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagModify>>(){}.getType();
    }
    
    if ("TagModifyAdd".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagModifyAdd>>(){}.getType();
    }
    
    if ("TagModifyDelete".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagModifyDelete>>(){}.getType();
    }
    
    if ("TagUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagUpdate>>(){}.getType();
    }
    
    if ("TaggedAddressBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedAddressBase>>(){}.getType();
    }
    
    if ("TaggedAssetBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedAssetBase>>(){}.getType();
    }
    
    if ("TaggedDriverBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedDriverBase>>(){}.getType();
    }
    
    if ("TaggedMachineBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedMachineBase>>(){}.getType();
    }
    
    if ("TaggedSensorBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedSensorBase>>(){}.getType();
    }
    
    if ("TaggedVehicleBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedVehicleBase>>(){}.getType();
    }
    
    if ("TemperatureResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TemperatureResponse>>(){}.getType();
    }
    
    if ("TemperatureResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<List<TemperatureResponseSensors>>(){}.getType();
    }
    
    if ("TripResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripResponse>>(){}.getType();
    }
    
    if ("TripResponseEndCoordinates".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripResponseEndCoordinates>>(){}.getType();
    }
    
    if ("TripResponseStartCoordinates".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripResponseStartCoordinates>>(){}.getType();
    }
    
    if ("TripResponseTrips".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripResponseTrips>>(){}.getType();
    }
    
    if ("TripsParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsParam>>(){}.getType();
    }
    
    if ("UserBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserBase>>(){}.getType();
    }
    
    if ("UserRole".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserRole>>(){}.getType();
    }
    
    if ("UserTagRole".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTagRole>>(){}.getType();
    }
    
    if ("UserTagRoleTag".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTagRoleTag>>(){}.getType();
    }
    
    if ("Vehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<Vehicle>>(){}.getType();
    }
    
    if ("VehicleHarshEventResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleHarshEventResponse>>(){}.getType();
    }
    
    if ("VehicleHarshEventResponseLocation".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleHarshEventResponseLocation>>(){}.getType();
    }
    
    if ("VehicleLocation".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleLocation>>(){}.getType();
    }
    
    if ("VehicleMaintenance".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenance>>(){}.getType();
    }
    
    if ("VehicleMaintenanceJ1939".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenanceJ1939>>(){}.getType();
    }
    
    if ("VehicleMaintenanceJ1939CheckEngineLight".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenanceJ1939CheckEngineLight>>(){}.getType();
    }
    
    if ("VehicleMaintenanceJ1939DiagnosticTroubleCodes".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenanceJ1939DiagnosticTroubleCodes>>(){}.getType();
    }
    
    if ("VehicleMaintenancePassenger".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenancePassenger>>(){}.getType();
    }
    
    if ("VehicleMaintenancePassengerCheckEngineLight".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenancePassengerCheckEngineLight>>(){}.getType();
    }
    
    if ("VehicleMaintenancePassengerDiagnosticTroubleCodes".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleMaintenancePassengerDiagnosticTroubleCodes>>(){}.getType();
    }
    
    if ("VehicleSafetyScoreResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleSafetyScoreResponse>>(){}.getType();
    }
    
    if ("VehicleUpdateParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<VehicleUpdateParam>>(){}.getType();
    }
    
    if ("DispatchJob".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchJob>>(){}.getType();
    }
    
    if ("DispatchRoute".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchRoute>>(){}.getType();
    }
    
    if ("DispatchRouteCreate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispatchRouteCreate>>(){}.getType();
    }
    
    if ("Document".equalsIgnoreCase(className)) {
      return new TypeToken<List<Document>>(){}.getType();
    }
    
    if ("DocumentCreate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentCreate>>(){}.getType();
    }
    
    if ("DocumentField".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentField>>(){}.getType();
    }
    
    if ("Driver".equalsIgnoreCase(className)) {
      return new TypeToken<List<Driver>>(){}.getType();
    }
    
    if ("DriverForCreate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DriverForCreate>>(){}.getType();
    }
    
    if ("TaggedAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedAddress>>(){}.getType();
    }
    
    if ("TaggedAsset".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedAsset>>(){}.getType();
    }
    
    if ("TaggedDriver".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedDriver>>(){}.getType();
    }
    
    if ("TaggedMachine".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedMachine>>(){}.getType();
    }
    
    if ("TaggedSensor".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedSensor>>(){}.getType();
    }
    
    if ("TaggedVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaggedVehicle>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<Address>(){}.getType();
    }
    
    if ("AddressGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<AddressGeofence>(){}.getType();
    }
    
    if ("AddressGeofenceCircle".equalsIgnoreCase(className)) {
      return new TypeToken<AddressGeofenceCircle>(){}.getType();
    }
    
    if ("AddressGeofencePolygon".equalsIgnoreCase(className)) {
      return new TypeToken<AddressGeofencePolygon>(){}.getType();
    }
    
    if ("AddressGeofencePolygonVertices".equalsIgnoreCase(className)) {
      return new TypeToken<AddressGeofencePolygonVertices>(){}.getType();
    }
    
    if ("AddressNotes".equalsIgnoreCase(className)) {
      return new TypeToken<AddressNotes>(){}.getType();
    }
    
    if ("AddressParam".equalsIgnoreCase(className)) {
      return new TypeToken<AddressParam>(){}.getType();
    }
    
    if ("Addresses".equalsIgnoreCase(className)) {
      return new TypeToken<Addresses>(){}.getType();
    }
    
    if ("AddressesAddresses".equalsIgnoreCase(className)) {
      return new TypeToken<AddressesAddresses>(){}.getType();
    }
    
    if ("AllRouteJobUpdates".equalsIgnoreCase(className)) {
      return new TypeToken<AllRouteJobUpdates>(){}.getType();
    }
    
    if ("Asset".equalsIgnoreCase(className)) {
      return new TypeToken<Asset>(){}.getType();
    }
    
    if ("AssetCable".equalsIgnoreCase(className)) {
      return new TypeToken<AssetCable>(){}.getType();
    }
    
    if ("AssetCurrentLocation".equalsIgnoreCase(className)) {
      return new TypeToken<AssetCurrentLocation>(){}.getType();
    }
    
    if ("AssetCurrentLocationsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AssetCurrentLocationsResponse>(){}.getType();
    }
    
    if ("AssetLocationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AssetLocationResponse>(){}.getType();
    }
    
    if ("AssetLocationResponseInner".equalsIgnoreCase(className)) {
      return new TypeToken<AssetLocationResponseInner>(){}.getType();
    }
    
    if ("AssetReeferResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponse>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStats".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStats>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsAlarms".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsAlarms>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsAlarms1".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsAlarms1>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsEngineHours".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsEngineHours>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsFuelPercentage".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsFuelPercentage>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsPowerStatus".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsPowerStatus>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsReturnAirTemp".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsReturnAirTemp>(){}.getType();
    }
    
    if ("AssetReeferResponseReeferStatsSetPoint".equalsIgnoreCase(className)) {
      return new TypeToken<AssetReeferResponseReeferStatsSetPoint>(){}.getType();
    }
    
    if ("AuxInput".equalsIgnoreCase(className)) {
      return new TypeToken<AuxInput>(){}.getType();
    }
    
    if ("AuxInputSeries".equalsIgnoreCase(className)) {
      return new TypeToken<AuxInputSeries>(){}.getType();
    }
    
    if ("CargoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CargoResponse>(){}.getType();
    }
    
    if ("CargoResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<CargoResponseSensors>(){}.getType();
    }
    
    if ("Contact".equalsIgnoreCase(className)) {
      return new TypeToken<Contact>(){}.getType();
    }
    
    if ("ContactIds".equalsIgnoreCase(className)) {
      return new TypeToken<ContactIds>(){}.getType();
    }
    
    if ("CreateDvirParam".equalsIgnoreCase(className)) {
      return new TypeToken<CreateDvirParam>(){}.getType();
    }
    
    if ("CurrentDriver".equalsIgnoreCase(className)) {
      return new TypeToken<CurrentDriver>(){}.getType();
    }
    
    if ("Data".equalsIgnoreCase(className)) {
      return new TypeToken<Data>(){}.getType();
    }
    
    if ("DataInputHistoryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DataInputHistoryResponse>(){}.getType();
    }
    
    if ("DataInputHistoryResponsePoints".equalsIgnoreCase(className)) {
      return new TypeToken<DataInputHistoryResponsePoints>(){}.getType();
    }
    
    if ("DispatchJobCreate".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchJobCreate>(){}.getType();
    }
    
    if ("DispatchRouteBase".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchRouteBase>(){}.getType();
    }
    
    if ("DispatchRouteHistoricalEntry".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchRouteHistoricalEntry>(){}.getType();
    }
    
    if ("DispatchRouteHistory".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchRouteHistory>(){}.getType();
    }
    
    if ("DispatchRoutes".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchRoutes>(){}.getType();
    }
    
    if ("DocumentBase".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentBase>(){}.getType();
    }
    
    if ("DocumentFieldCreate".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentFieldCreate>(){}.getType();
    }
    
    if ("DocumentFieldCreatePhotoValue".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentFieldCreatePhotoValue>(){}.getType();
    }
    
    if ("DocumentFieldType".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentFieldType>(){}.getType();
    }
    
    if ("DocumentFieldTypeNumberValueTypeMetadata".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentFieldTypeNumberValueTypeMetadata>(){}.getType();
    }
    
    if ("DocumentFieldTypes".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentFieldTypes>(){}.getType();
    }
    
    if ("DocumentType".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentType>(){}.getType();
    }
    
    if ("DocumentTypes".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentTypes>(){}.getType();
    }
    
    if ("Documents".equalsIgnoreCase(className)) {
      return new TypeToken<Documents>(){}.getType();
    }
    
    if ("DoorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DoorResponse>(){}.getType();
    }
    
    if ("DoorResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<DoorResponseSensors>(){}.getType();
    }
    
    if ("DriverBase".equalsIgnoreCase(className)) {
      return new TypeToken<DriverBase>(){}.getType();
    }
    
    if ("DriverDailyLogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DriverDailyLogResponse>(){}.getType();
    }
    
    if ("DriverDailyLogResponseDays".equalsIgnoreCase(className)) {
      return new TypeToken<DriverDailyLogResponseDays>(){}.getType();
    }
    
    if ("DriverSafetyScoreResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DriverSafetyScoreResponse>(){}.getType();
    }
    
    if ("DriversResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DriversResponse>(){}.getType();
    }
    
    if ("DriversSummaryParam".equalsIgnoreCase(className)) {
      return new TypeToken<DriversSummaryParam>(){}.getType();
    }
    
    if ("DriversSummaryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DriversSummaryResponse>(){}.getType();
    }
    
    if ("DriversSummaryResponseSummaries".equalsIgnoreCase(className)) {
      return new TypeToken<DriversSummaryResponseSummaries>(){}.getType();
    }
    
    if ("DvirBase".equalsIgnoreCase(className)) {
      return new TypeToken<DvirBase>(){}.getType();
    }
    
    if ("DvirBaseAuthorSignature".equalsIgnoreCase(className)) {
      return new TypeToken<DvirBaseAuthorSignature>(){}.getType();
    }
    
    if ("DvirBaseMechanicOrAgentSignature".equalsIgnoreCase(className)) {
      return new TypeToken<DvirBaseMechanicOrAgentSignature>(){}.getType();
    }
    
    if ("DvirBaseNextDriverSignature".equalsIgnoreCase(className)) {
      return new TypeToken<DvirBaseNextDriverSignature>(){}.getType();
    }
    
    if ("DvirBaseTrailerDefects".equalsIgnoreCase(className)) {
      return new TypeToken<DvirBaseTrailerDefects>(){}.getType();
    }
    
    if ("DvirBaseVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<DvirBaseVehicle>(){}.getType();
    }
    
    if ("DvirListResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DvirListResponse>(){}.getType();
    }
    
    if ("EngineState".equalsIgnoreCase(className)) {
      return new TypeToken<EngineState>(){}.getType();
    }
    
    if ("ErrorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorResponse>(){}.getType();
    }
    
    if ("FleetVehicleLocation".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehicleLocation>(){}.getType();
    }
    
    if ("FleetVehicleLocations".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehicleLocations>(){}.getType();
    }
    
    if ("FleetVehicleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehicleResponse>(){}.getType();
    }
    
    if ("FleetVehicleResponseVehicleInfo".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehicleResponseVehicleInfo>(){}.getType();
    }
    
    if ("FleetVehiclesLocations".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehiclesLocations>(){}.getType();
    }
    
    if ("FleetVehiclesLocationsInner".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehiclesLocationsInner>(){}.getType();
    }
    
    if ("GroupDriversParam".equalsIgnoreCase(className)) {
      return new TypeToken<GroupDriversParam>(){}.getType();
    }
    
    if ("GroupParam".equalsIgnoreCase(className)) {
      return new TypeToken<GroupParam>(){}.getType();
    }
    
    if ("HistoryParam".equalsIgnoreCase(className)) {
      return new TypeToken<HistoryParam>(){}.getType();
    }
    
    if ("HistoryParam1".equalsIgnoreCase(className)) {
      return new TypeToken<HistoryParam1>(){}.getType();
    }
    
    if ("HosAuthenticationLogsParam".equalsIgnoreCase(className)) {
      return new TypeToken<HosAuthenticationLogsParam>(){}.getType();
    }
    
    if ("HosAuthenticationLogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HosAuthenticationLogsResponse>(){}.getType();
    }
    
    if ("HosAuthenticationLogsResponseAuthenticationLogs".equalsIgnoreCase(className)) {
      return new TypeToken<HosAuthenticationLogsResponseAuthenticationLogs>(){}.getType();
    }
    
    if ("HosLogsParam".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsParam>(){}.getType();
    }
    
    if ("HosLogsParam1".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsParam1>(){}.getType();
    }
    
    if ("HosLogsParam2".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsParam2>(){}.getType();
    }
    
    if ("HosLogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsResponse>(){}.getType();
    }
    
    if ("HosLogsResponseLogs".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsResponseLogs>(){}.getType();
    }
    
    if ("HosLogsSummaryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsSummaryResponse>(){}.getType();
    }
    
    if ("HosLogsSummaryResponseDrivers".equalsIgnoreCase(className)) {
      return new TypeToken<HosLogsSummaryResponseDrivers>(){}.getType();
    }
    
    if ("HumidityResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HumidityResponse>(){}.getType();
    }
    
    if ("HumidityResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<HumidityResponseSensors>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2001>(){}.getType();
    }
    
    if ("InlineResponse2002".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2002>(){}.getType();
    }
    
    if ("InlineResponse2003".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2003>(){}.getType();
    }
    
    if ("InlineResponse2004".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2004>(){}.getType();
    }
    
    if ("InlineResponse2005".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2005>(){}.getType();
    }
    
    if ("InlineResponse2005VehicleStats".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2005VehicleStats>(){}.getType();
    }
    
    if ("InlineResponse2006".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2006>(){}.getType();
    }
    
    if ("InlineResponse2007".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2007>(){}.getType();
    }
    
    if ("InlineResponse2008".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2008>(){}.getType();
    }
    
    if ("InlineResponse2009".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2009>(){}.getType();
    }
    
    if ("JobStatus".equalsIgnoreCase(className)) {
      return new TypeToken<JobStatus>(){}.getType();
    }
    
    if ("JobUpdateObject".equalsIgnoreCase(className)) {
      return new TypeToken<JobUpdateObject>(){}.getType();
    }
    
    if ("Machine".equalsIgnoreCase(className)) {
      return new TypeToken<Machine>(){}.getType();
    }
    
    if ("MachineHistoryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MachineHistoryResponse>(){}.getType();
    }
    
    if ("MachineHistoryResponseMachines".equalsIgnoreCase(className)) {
      return new TypeToken<MachineHistoryResponseMachines>(){}.getType();
    }
    
    if ("MachineHistoryResponseVibrations".equalsIgnoreCase(className)) {
      return new TypeToken<MachineHistoryResponseVibrations>(){}.getType();
    }
    
    if ("Pagination".equalsIgnoreCase(className)) {
      return new TypeToken<Pagination>(){}.getType();
    }
    
    if ("PrevJobStatus".equalsIgnoreCase(className)) {
      return new TypeToken<PrevJobStatus>(){}.getType();
    }
    
    if ("ReactivateDriverParam".equalsIgnoreCase(className)) {
      return new TypeToken<ReactivateDriverParam>(){}.getType();
    }
    
    if ("SafetyReportHarshEvent".equalsIgnoreCase(className)) {
      return new TypeToken<SafetyReportHarshEvent>(){}.getType();
    }
    
    if ("Sensor".equalsIgnoreCase(className)) {
      return new TypeToken<Sensor>(){}.getType();
    }
    
    if ("SensorHistoryResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SensorHistoryResponse>(){}.getType();
    }
    
    if ("SensorHistoryResponseResults".equalsIgnoreCase(className)) {
      return new TypeToken<SensorHistoryResponseResults>(){}.getType();
    }
    
    if ("SensorParam".equalsIgnoreCase(className)) {
      return new TypeToken<SensorParam>(){}.getType();
    }
    
    if ("SensorshistorySeries".equalsIgnoreCase(className)) {
      return new TypeToken<SensorshistorySeries>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<Tag>(){}.getType();
    }
    
    if ("TagCreate".equalsIgnoreCase(className)) {
      return new TypeToken<TagCreate>(){}.getType();
    }
    
    if ("TagIds".equalsIgnoreCase(className)) {
      return new TypeToken<TagIds>(){}.getType();
    }
    
    if ("TagMetadata".equalsIgnoreCase(className)) {
      return new TypeToken<TagMetadata>(){}.getType();
    }
    
    if ("TagModify".equalsIgnoreCase(className)) {
      return new TypeToken<TagModify>(){}.getType();
    }
    
    if ("TagModifyAdd".equalsIgnoreCase(className)) {
      return new TypeToken<TagModifyAdd>(){}.getType();
    }
    
    if ("TagModifyDelete".equalsIgnoreCase(className)) {
      return new TypeToken<TagModifyDelete>(){}.getType();
    }
    
    if ("TagUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TagUpdate>(){}.getType();
    }
    
    if ("TaggedAddressBase".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedAddressBase>(){}.getType();
    }
    
    if ("TaggedAssetBase".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedAssetBase>(){}.getType();
    }
    
    if ("TaggedDriverBase".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedDriverBase>(){}.getType();
    }
    
    if ("TaggedMachineBase".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedMachineBase>(){}.getType();
    }
    
    if ("TaggedSensorBase".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedSensorBase>(){}.getType();
    }
    
    if ("TaggedVehicleBase".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedVehicleBase>(){}.getType();
    }
    
    if ("TemperatureResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TemperatureResponse>(){}.getType();
    }
    
    if ("TemperatureResponseSensors".equalsIgnoreCase(className)) {
      return new TypeToken<TemperatureResponseSensors>(){}.getType();
    }
    
    if ("TripResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TripResponse>(){}.getType();
    }
    
    if ("TripResponseEndCoordinates".equalsIgnoreCase(className)) {
      return new TypeToken<TripResponseEndCoordinates>(){}.getType();
    }
    
    if ("TripResponseStartCoordinates".equalsIgnoreCase(className)) {
      return new TypeToken<TripResponseStartCoordinates>(){}.getType();
    }
    
    if ("TripResponseTrips".equalsIgnoreCase(className)) {
      return new TypeToken<TripResponseTrips>(){}.getType();
    }
    
    if ("TripsParam".equalsIgnoreCase(className)) {
      return new TypeToken<TripsParam>(){}.getType();
    }
    
    if ("UserBase".equalsIgnoreCase(className)) {
      return new TypeToken<UserBase>(){}.getType();
    }
    
    if ("UserRole".equalsIgnoreCase(className)) {
      return new TypeToken<UserRole>(){}.getType();
    }
    
    if ("UserTagRole".equalsIgnoreCase(className)) {
      return new TypeToken<UserTagRole>(){}.getType();
    }
    
    if ("UserTagRoleTag".equalsIgnoreCase(className)) {
      return new TypeToken<UserTagRoleTag>(){}.getType();
    }
    
    if ("Vehicle".equalsIgnoreCase(className)) {
      return new TypeToken<Vehicle>(){}.getType();
    }
    
    if ("VehicleHarshEventResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleHarshEventResponse>(){}.getType();
    }
    
    if ("VehicleHarshEventResponseLocation".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleHarshEventResponseLocation>(){}.getType();
    }
    
    if ("VehicleLocation".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleLocation>(){}.getType();
    }
    
    if ("VehicleMaintenance".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenance>(){}.getType();
    }
    
    if ("VehicleMaintenanceJ1939".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenanceJ1939>(){}.getType();
    }
    
    if ("VehicleMaintenanceJ1939CheckEngineLight".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenanceJ1939CheckEngineLight>(){}.getType();
    }
    
    if ("VehicleMaintenanceJ1939DiagnosticTroubleCodes".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenanceJ1939DiagnosticTroubleCodes>(){}.getType();
    }
    
    if ("VehicleMaintenancePassenger".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenancePassenger>(){}.getType();
    }
    
    if ("VehicleMaintenancePassengerCheckEngineLight".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenancePassengerCheckEngineLight>(){}.getType();
    }
    
    if ("VehicleMaintenancePassengerDiagnosticTroubleCodes".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleMaintenancePassengerDiagnosticTroubleCodes>(){}.getType();
    }
    
    if ("VehicleSafetyScoreResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleSafetyScoreResponse>(){}.getType();
    }
    
    if ("VehicleUpdateParam".equalsIgnoreCase(className)) {
      return new TypeToken<VehicleUpdateParam>(){}.getType();
    }
    
    if ("DispatchJob".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchJob>(){}.getType();
    }
    
    if ("DispatchRoute".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchRoute>(){}.getType();
    }
    
    if ("DispatchRouteCreate".equalsIgnoreCase(className)) {
      return new TypeToken<DispatchRouteCreate>(){}.getType();
    }
    
    if ("Document".equalsIgnoreCase(className)) {
      return new TypeToken<Document>(){}.getType();
    }
    
    if ("DocumentCreate".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentCreate>(){}.getType();
    }
    
    if ("DocumentField".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentField>(){}.getType();
    }
    
    if ("Driver".equalsIgnoreCase(className)) {
      return new TypeToken<Driver>(){}.getType();
    }
    
    if ("DriverForCreate".equalsIgnoreCase(className)) {
      return new TypeToken<DriverForCreate>(){}.getType();
    }
    
    if ("TaggedAddress".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedAddress>(){}.getType();
    }
    
    if ("TaggedAsset".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedAsset>(){}.getType();
    }
    
    if ("TaggedDriver".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedDriver>(){}.getType();
    }
    
    if ("TaggedMachine".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedMachine>(){}.getType();
    }
    
    if ("TaggedSensor".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedSensor>(){}.getType();
    }
    
    if ("TaggedVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<TaggedVehicle>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
