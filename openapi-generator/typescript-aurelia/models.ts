/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 */
export interface Address {
  contacts?: Array<Contact>;
  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   */
  formattedAddress?: string;
  geofence?: AddressGeofence;
  /**
   * ID of the address
   */
  id?: number;
  /**
   * Name of the address or geofence
   */
  name?: string;
  /**
   * Notes associated with an address.
   */
  notes?: string;
  tags?: Array<TagMetadata>;
}

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 */
export interface AddressGeofence {
  circle?: AddressGeofenceCircle;
  polygon?: AddressGeofencePolygon;
}

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 */
export interface AddressGeofenceCircle {
  /**
   * The latitude of the center of the circular geofence
   */
  latitude?: number;
  /**
   * The radius of the circular geofence
   */
  radiusMeters?: number;
  /**
   * The longitude of the center of the circular geofence
   */
  longitude?: number;
}

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 */
export interface AddressGeofencePolygon {
  /**
   * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
   */
  vertices?: Array<AddressGeofencePolygonVertices>;
}

export interface AddressGeofencePolygonVertices {
  /**
   * The longitude of a geofence vertex
   */
  latitude?: number;
  /**
   * The longitude of a geofence vertex
   */
  longitude?: number;
}

export interface AddressesAddresses {
  /**
   * Notes associated with an address.
   */
  notes?: string;
  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   */
  formattedAddress: string;
  geofence: AddressGeofence;
  /**
   * A list of tag IDs.
   */
  tagIds?: Array<number>;
  /**
   * The name of this address/geofence
   */
  name: string;
  /**
   * A list of IDs for contact book entries.
   */
  contactIds?: Array<number>;
}

export interface AllRouteJobUpdates {
  jobUpdates?: Array<JobUpdateObject>;
  /**
   * Sequence ID of the last update returned in the response
   */
  sequenceId?: string;
}

/**
 * Basic information of an asset
 */
export interface Asset {
  /**
   * Serial number of the host asset
   */
  assetSerialNumber?: string;
  /**
   * The cable connected to the asset
   */
  cable?: Array<AssetCable>;
  /**
   * Engine hours
   */
  engineHours?: number;
  /**
   * Asset ID
   */
  id: number;
  /**
   * Asset name
   */
  name?: string;
}

export interface AssetCable {
  /**
   * Asset type
   */
  assetType?: string;
}

/**
 * Current location of an asset
 */
export interface AssetCurrentLocation {
  /**
   * The latitude of the location in degrees.
   */
  latitude?: number;
  /**
   * The best effort (street,city,state) for the latitude and longitude.
   */
  location?: string;
  /**
   * The longitude of the location in degrees.
   */
  longitude?: number;
  /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
   */
  speedMilesPerHour?: number;
  /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   */
  timeMs?: number;
}

/**
 * Basic information of an asset
 */
export interface AssetCurrentLocationsResponse {
  /**
   * The cable connected to the asset
   */
  cable?: Array<AssetCable>;
  /**
   * Engine hours
   */
  engineHours?: number;
  /**
   * Asset ID
   */
  id: number;
  /**
   * Current location of an asset
   */
  location?: Array<AssetCurrentLocation>;
  /**
   * Asset name
   */
  name?: string;
}

/**
 * Reefer-specific asset details
 */
export interface AssetReeferResponse {
  /**
   * Asset type
   */
  assetType?: string;
  /**
   * Asset ID
   */
  id?: number;
  /**
   * Asset name
   */
  name?: string;
  reeferStats?: AssetReeferResponseReeferStats;
}

export interface AssetReeferResponseReeferStats {
  /**
   * Fuel percentage of the reefer
   */
  fuelPercentage?: Array<AssetReeferResponseReeferStatsFuelPercentage>;
  /**
   * Power status of the reefer
   */
  powerStatus?: Array<AssetReeferResponseReeferStatsPowerStatus>;
  /**
   * Engine hours of the reefer
   */
  engineHours?: Array<AssetReeferResponseReeferStatsEngineHours>;
  /**
   * Set point temperature of the reefer
   */
  setPoint?: Array<AssetReeferResponseReeferStatsSetPoint>;
  /**
   * Return air temperature of the reefer
   */
  returnAirTemp?: Array<AssetReeferResponseReeferStatsReturnAirTemp>;
  /**
   * Reefer alarms
   */
  alarms?: Array<AssetReeferResponseReeferStatsAlarms1>;
}

export interface AssetReeferResponseReeferStatsAlarms {
  /**
   * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
   */
  severity?: number;
  /**
   * Recommended operator action
   */
  operatorAction?: string;
  /**
   * Description of the alarm
   */
  description?: string;
  /**
   * ID of the alarm
   */
  alarmCode?: number;
}

export interface AssetReeferResponseReeferStatsAlarms1 {
  alarms?: Array<AssetReeferResponseReeferStatsAlarms>;
  /**
   * Timestamp when the alarms were reported, in Unix milliseconds since epoch
   */
  changedAtMs?: number;
}

export interface AssetReeferResponseReeferStatsEngineHours {
  /**
   * Engine hours of the reefer.
   */
  engineHours?: number;
  /**
   * Timestamp in Unix milliseconds since epoch.
   */
  changedAtMs?: number;
}

export interface AssetReeferResponseReeferStatsFuelPercentage {
  /**
   * Fuel percentage of the reefer.
   */
  fuelPercentage?: number;
  /**
   * Timestamp in Unix milliseconds since epoch.
   */
  changedAtMs?: number;
}

export interface AssetReeferResponseReeferStatsPowerStatus {
  /**
   * Timestamp in Unix milliseconds since epoch.
   */
  changedAtMs?: number;
  /**
   * Power status of the reefer.
   */
  status?: string;
}

export interface AssetReeferResponseReeferStatsReturnAirTemp {
  /**
   * Return air temperature in millidegree Celsius.
   */
  tempInMilliC?: number;
  /**
   * Timestamp in Unix milliseconds since epoch.
   */
  changedAtMs?: number;
}

export interface AssetReeferResponseReeferStatsSetPoint {
  /**
   * Set point temperature in millidegree Celsius.
   */
  tempInMilliC?: number;
  /**
   * Timestamp in Unix milliseconds since epoch.
   */
  changedAtMs?: number;
}

/**
 * Digital value of an aux input.
 */
export interface AuxInput {
  /**
   * Timestamp in Unix epoch milliseconds.
   */
  timeMs: any;
  /**
   * Boolean representing the digital value of the aux input.
   */
  value: boolean;
}

/**
 * A list of aux input values over a timerange.
 */
export interface AuxInputSeries {
  /**
   * The name of the aux input.
   */
  name: AuxInputSeriesNameEnum;
  values: Array<AuxInput>;
}

/**
 * Enum for the name property.
 */
export type AuxInputSeriesNameEnum = 'Emergency Lights' | 'Emergency Alarm' | 'Stop Paddle' | 'Power Take-Off' | 'Plow' | 'Sweeper' | 'Salter' | 'Boom';

/**
 * Contains the current cargo status of a sensor.
 */
export interface CargoResponse {
  groupId?: number;
  sensors?: Array<CargoResponseSensors>;
}

export interface CargoResponseSensors {
  /**
   * Flag indicating whether the current cargo is empty or loaded.
   */
  cargoEmpty?: boolean;
  /**
   * Name of the sensor.
   */
  name?: string;
  /**
   * ID of the sensor.
   */
  id?: number;
}

/**
 * Information about a notification contact for alerts.
 */
export interface Contact {
  /**
   * Email address of the contact
   */
  email?: string;
  /**
   * First name of the contact
   */
  firstName?: string;
  /**
   * ID of the contact
   */
  id?: number;
  /**
   * Last name of the contact
   */
  lastName?: string;
  /**
   * Phone number of the contact
   */
  phone?: string;
}

export interface CurrentDriver {
}

export interface DataInputHistoryResponse {
  /**
   * The ID of this data input
   */
  id?: number;
  /**
   * Name of this data input
   */
  name: string;
  /**
   * Data points from this data input
   */
  points?: Array<DataInputHistoryResponsePoints>;
}

export interface DataInputHistoryResponsePoints {
  value?: number;
  timeMs?: number;
}

export interface DispatchJob {
  /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   */
  destinationAddress?: string;
  /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   */
  destinationAddressId?: number;
  /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   */
  destinationLat?: number;
  /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   */
  destinationLng?: number;
  /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   */
  destinationName?: string;
  /**
   * Notes regarding the details of this job.
   */
  notes?: string;
  /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   */
  scheduledArrivalTimeMs: number;
  /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   */
  scheduledDepartureTimeMs?: number;
  /**
   * The time at which the driver arrived at the job destination.
   */
  arrivedAtMs?: number;
  /**
   * The time at which the job was marked complete (e.g. started driving to the next destination).
   */
  completedAtMs?: number;
  /**
   * ID of the route that this job belongs to.
   */
  dispatchRouteId: number;
  /**
   * ID of the driver assigned to the dispatch job.
   */
  driverId?: number;
  /**
   * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
   */
  enRouteAtMs?: number;
  /**
   * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
   */
  estimatedArrivalMs?: number;
  /**
   * Fleet viewer url of the dispatch job.
   */
  fleetViewerUrl?: string;
  groupId: number;
  /**
   * ID of the Samsara dispatch job.
   */
  id: number;
  jobState: JobStatus;
  /**
   * The time at which the job was marked skipped.
   */
  skippedAtMs?: number;
  /**
   * ID of the vehicle used for the dispatch job.
   */
  vehicleId?: number;
}

export interface DispatchJobCreate {
  /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   */
  destinationAddress?: string;
  /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   */
  destinationAddressId?: number;
  /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   */
  destinationLat?: number;
  /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   */
  destinationLng?: number;
  /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   */
  destinationName?: string;
  /**
   * Notes regarding the details of this job.
   */
  notes?: string;
  /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   */
  scheduledArrivalTimeMs: number;
  /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   */
  scheduledDepartureTimeMs?: number;
}

export interface DispatchRoute {
  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   */
  actualEndMs?: number;
  /**
   * The time in Unix epoch milliseconds that the route actually started.
   */
  actualStartMs?: number;
  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   */
  driverId?: number;
  /**
   * ID of the group if the organization has multiple groups (optional).
   */
  groupId?: number;
  /**
   * Descriptive name of this route.
   */
  name: string;
  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   */
  scheduledEndMs: number;
  /**
   * The distance expected to be traveled for this route in meters.
   */
  scheduledMeters?: number;
  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   */
  scheduledStartMs: number;
  /**
   * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   */
  startLocationAddress?: string;
  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   */
  startLocationAddressId?: number;
  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   */
  startLocationLat?: number;
  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   */
  startLocationLng?: number;
  /**
   * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
   */
  startLocationName?: string;
  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   */
  trailerId?: number;
  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   */
  vehicleId?: number;
  /**
   * The dispatch jobs associated with this route.
   */
  dispatchJobs: Array<DispatchJob>;
  /**
   * ID of the Samsara dispatch route.
   */
  id: number;
}

export interface DispatchRouteBase {
  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   */
  actualEndMs?: number;
  /**
   * The time in Unix epoch milliseconds that the route actually started.
   */
  actualStartMs?: number;
  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   */
  driverId?: number;
  /**
   * ID of the group if the organization has multiple groups (optional).
   */
  groupId?: number;
  /**
   * Descriptive name of this route.
   */
  name: string;
  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   */
  scheduledEndMs: number;
  /**
   * The distance expected to be traveled for this route in meters.
   */
  scheduledMeters?: number;
  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   */
  scheduledStartMs: number;
  /**
   * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   */
  startLocationAddress?: string;
  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   */
  startLocationAddressId?: number;
  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   */
  startLocationLat?: number;
  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   */
  startLocationLng?: number;
  /**
   * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
   */
  startLocationName?: string;
  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   */
  trailerId?: number;
  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   */
  vehicleId?: number;
}

export interface DispatchRouteCreate {
  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   */
  actualEndMs?: number;
  /**
   * The time in Unix epoch milliseconds that the route actually started.
   */
  actualStartMs?: number;
  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   */
  driverId?: number;
  /**
   * ID of the group if the organization has multiple groups (optional).
   */
  groupId?: number;
  /**
   * Descriptive name of this route.
   */
  name: string;
  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   */
  scheduledEndMs: number;
  /**
   * The distance expected to be traveled for this route in meters.
   */
  scheduledMeters?: number;
  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   */
  scheduledStartMs: number;
  /**
   * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   */
  startLocationAddress?: string;
  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   */
  startLocationAddressId?: number;
  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   */
  startLocationLat?: number;
  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   */
  startLocationLng?: number;
  /**
   * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
   */
  startLocationName?: string;
  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   */
  trailerId?: number;
  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   */
  vehicleId?: number;
  /**
   * The dispatch jobs to create for this route.
   */
  dispatchJobs: Array<DispatchJobCreate>;
}

export interface DispatchRouteHistoricalEntry {
  /**
   * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
   */
  changedAtMs?: number;
  route?: DispatchRoute;
}

export interface DispatchRouteHistory {
  /**
   * History of the route's state changes.
   */
  history?: Array<DispatchRouteHistoricalEntry>;
}

export interface Document {
  /**
   * ID of the Samsara dispatch job for which the document is submitted
   */
  dispatchJobId?: number;
  /**
   * Notes submitted with this document.
   */
  notes?: string;
  /**
   * Descriptive name of this type of document.
   */
  documentType: string;
  /**
   * The time in Unix epoch milliseconds that the document is created.
   */
  driverCreatedAtMs: number;
  /**
   * ID of the driver for whom the document is submitted
   */
  driverId: number;
  /**
   * The fields associated with this document.
   */
  fields: Array<DocumentField>;
  /**
   * VehicleID of the driver at document creation.
   */
  vehicleId?: number;
}

export interface DocumentBase {
  /**
   * ID of the Samsara dispatch job for which the document is submitted
   */
  dispatchJobId?: number;
  /**
   * Notes submitted with this document.
   */
  notes?: string;
}

export interface DocumentCreate {
  /**
   * ID of the Samsara dispatch job for which the document is submitted
   */
  dispatchJobId?: number;
  /**
   * Notes submitted with this document.
   */
  notes?: string;
  /**
   * Universally unique identifier for the document type this document is being created for.
   */
  documentTypeUuid: string;
  /**
   * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   */
  fields: Array<DocumentField>;
}

export interface DocumentField {
  /**
   * Value of this field if this document field has valueType: ValueType_Number.
   */
  numberValue?: number;
  /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   */
  photoValue?: Array<DocumentFieldCreatePhotoValue>;
  /**
   * Value of this field if this document field has valueType: ValueType_String.
   */
  stringValue?: string;
  /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   */
  valueType: string;
  /**
   * Descriptive name of this field.
   */
  label: string;
  /**
   * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
   */
  value?: any;
}

export interface DocumentFieldCreate {
  /**
   * Value of this field if this document field has valueType: ValueType_Number.
   */
  numberValue?: number;
  /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   */
  photoValue?: Array<DocumentFieldCreatePhotoValue>;
  /**
   * Value of this field if this document field has valueType: ValueType_String.
   */
  stringValue?: string;
  /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   */
  valueType: string;
}

export interface DocumentFieldCreatePhotoValue {
  /**
   * Photo URL for a JPG image
   */
  url?: string;
}

export interface DocumentFieldType {
  /**
   * Descriptive name of this field type.
   */
  label: string;
  numberValueTypeMetadata?: DocumentFieldTypeNumberValueTypeMetadata;
  /**
   * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   */
  valueType: string;
}

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 */
export interface DocumentFieldTypeNumberValueTypeMetadata {
  /**
   * Number of decimal places that values for this field type can have.
   */
  numDecimalPlaces?: number;
}

export interface DocumentType {
  /**
   * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
   */
  fieldTypes?: Array<Array>;
  /**
   * Name of the document type.
   */
  name: string;
  /**
   * ID for the organization this document belongs to.
   */
  orgId: number;
  /**
   * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
   */
  uuid: string;
}

/**
 * Contains the current door status of a sensor.
 */
export interface DoorResponse {
  groupId?: number;
  sensors?: Array<DoorResponseSensors>;
}

export interface DoorResponseSensors {
  /**
   * Flag indicating whether the current door is closed or open.
   */
  doorClosed?: boolean;
  /**
   * Name of the sensor.
   */
  name?: string;
  /**
   * ID of the sensor.
   */
  id?: number;
}

export interface Driver {
  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   */
  eldAdverseWeatherExemptionEnabled?: boolean;
  /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   */
  eldBigDayExemptionEnabled?: boolean;
  /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   */
  eldDayStartHour?: number;
  /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   */
  eldExempt?: boolean;
  /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   */
  eldExemptReason?: string;
  /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   */
  eldPcEnabled?: boolean;
  /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   */
  eldYmEnabled?: boolean;
  /**
   * Dictionary of external IDs (string key-value pairs)
   */
  externalIds?: { [key: string]: string; };
  /**
   * ID of the group if the organization has multiple groups (uncommon).
   */
  groupId?: number;
  /**
   * Driver's state issued license number.
   */
  licenseNumber?: string;
  /**
   * Abbreviation of state that issued driver's license.
   */
  licenseState?: string;
  /**
   * Driver's name.
   */
  name: string;
  /**
   * Notes about the driver.
   */
  notes?: string;
  /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   */
  phone?: string;
  /**
   * Driver's login username into the driver app.
   */
  username?: string;
  /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   */
  vehicleId?: number;
  /**
   * ID of the driver.
   */
  id: number;
  /**
   * True if the driver account has been deactivated.
   */
  isDeactivated?: boolean;
  tags?: Array<TagMetadata>;
}

export interface DriverBase {
  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   */
  eldAdverseWeatherExemptionEnabled?: boolean;
  /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   */
  eldBigDayExemptionEnabled?: boolean;
  /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   */
  eldDayStartHour?: number;
  /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   */
  eldExempt?: boolean;
  /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   */
  eldExemptReason?: string;
  /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   */
  eldPcEnabled?: boolean;
  /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   */
  eldYmEnabled?: boolean;
  /**
   * Dictionary of external IDs (string key-value pairs)
   */
  externalIds?: { [key: string]: string; };
  /**
   * ID of the group if the organization has multiple groups (uncommon).
   */
  groupId?: number;
  /**
   * Driver's state issued license number.
   */
  licenseNumber?: string;
  /**
   * Abbreviation of state that issued driver's license.
   */
  licenseState?: string;
  /**
   * Driver's name.
   */
  name: string;
  /**
   * Notes about the driver.
   */
  notes?: string;
  /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   */
  phone?: string;
  /**
   * Driver's login username into the driver app.
   */
  username?: string;
  /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   */
  vehicleId?: number;
}

export interface DriverDailyLogResponse {
  days?: Array<DriverDailyLogResponseDays>;
}

export interface DriverDailyLogResponseDays {
  /**
   * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
   */
  certifiedAtMs?: number;
  /**
   * End of the HOS day, specified in milliseconds UNIX time.
   */
  endMs?: number;
  /**
   * End of the HOS day, specified in milliseconds UNIX time.
   */
  startMs?: number;
  /**
   * List of trailer ID's associated with the driver for the day.
   */
  trailerIds?: any;
  /**
   * Hours spent on duty or driving, rounded to two decimal places.
   */
  activeHours?: number;
  /**
   * Distance driven in miles, rounded to two decimal places.
   */
  distanceMiles?: number;
  /**
   * Milliseconds spent on duty or driving.
   */
  activeMs?: number;
  /**
   * Whether this HOS day chart was certified by the driver.
   */
  certified?: boolean;
  /**
   * List of vehicle ID's associated with the driver for the day.
   */
  vehicleIds?: any;
}

export interface DriverForCreate {
  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   */
  eldAdverseWeatherExemptionEnabled?: boolean;
  /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   */
  eldBigDayExemptionEnabled?: boolean;
  /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   */
  eldDayStartHour?: number;
  /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   */
  eldExempt?: boolean;
  /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   */
  eldExemptReason?: string;
  /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   */
  eldPcEnabled?: boolean;
  /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   */
  eldYmEnabled?: boolean;
  /**
   * Dictionary of external IDs (string key-value pairs)
   */
  externalIds?: { [key: string]: string; };
  /**
   * ID of the group if the organization has multiple groups (uncommon).
   */
  groupId?: number;
  /**
   * Driver's state issued license number.
   */
  licenseNumber?: string;
  /**
   * Abbreviation of state that issued driver's license.
   */
  licenseState?: string;
  /**
   * Driver's name.
   */
  name: string;
  /**
   * Notes about the driver.
   */
  notes?: string;
  /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   */
  phone?: string;
  /**
   * Driver's login username into the driver app.
   */
  username?: string;
  /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   */
  vehicleId?: number;
  /**
   * Driver's password for the driver app.
   */
  password: string;
  /**
   * A list of tag IDs.
   */
  tagIds?: Array<number>;
}

/**
 * Safety score details for a driver
 */
export interface DriverSafetyScoreResponse {
  /**
   * Crash event count
   */
  crashCount?: number;
  /**
   * Driver ID
   */
  driverId?: number;
  /**
   * Harsh acceleration event count
   */
  harshAccelCount?: number;
  /**
   * Harsh braking event count
   */
  harshBrakingCount?: number;
  harshEvents?: Array<SafetyReportHarshEvent>;
  /**
   * Harsh turning event count
   */
  harshTurningCount?: number;
  /**
   * Safety Score
   */
  safetyScore?: number;
  /**
   * Safety Score Rank
   */
  safetyScoreRank?: string;
  /**
   * Amount of time driven over the speed limit in milliseconds
   */
  timeOverSpeedLimitMs?: number;
  /**
   * Total distance driven in meters
   */
  totalDistanceDrivenMeters?: number;
  /**
   * Total harsh event count
   */
  totalHarshEventCount?: number;
  /**
   * Amount of time driven in milliseconds
   */
  totalTimeDrivenMs?: number;
}

export interface DriversResponse {
  drivers?: Array<Driver>;
}

export interface DriversSummaryResponse {
  summaries?: Array<DriversSummaryResponseSummaries>;
}

export interface DriversSummaryResponseSummaries {
  /**
   * ID of the driver.
   */
  driverId?: number;
  /**
   * Distance driven in miles, rounded to two decimal places.
   */
  distanceMiles?: number;
  /**
   * Duration in milliseconds that driver was driving during the requested time range
   */
  driveMs?: number;
  /**
   * Duration in milliseconds that driver was on duty or driving during the requested time range
   */
  activeMs?: number;
  /**
   * Username of the driver.
   */
  driverUsername?: string;
  /**
   * Group of the driver.
   */
  groupId?: number;
  /**
   * Name of the driver.
   */
  driverName?: string;
  /**
   * Duration in milliseconds that driver was on duty during the requested time range
   */
  onDutyMs?: number;
}

export interface DvirBase {
  authorSignature?: DvirBaseAuthorSignature;
  /**
   * Signifies if the defects on the vehicle corrected after the DVIR is done.
   */
  defectsCorrected?: boolean;
  /**
   * Signifies if the defects on this vehicle can be ignored.
   */
  defectsNeedNotBeCorrected?: boolean;
  /**
   * The id of this DVIR record.
   */
  id?: number;
  /**
   * Inspection type of the DVIR.
   */
  inspectionType?: string;
  /**
   * The mechanics notes on the DVIR.
   */
  mechanicNotes?: string;
  mechanicOrAgentSignature?: DvirBaseMechanicOrAgentSignature;
  nextDriverSignature?: DvirBaseNextDriverSignature;
  /**
   * The odometer reading in miles for the vehicle when the DVIR was done.
   */
  odometerMiles?: number;
  /**
   * Timestamp of this DVIR in UNIX milliseconds.
   */
  timeMs?: number;
  /**
   * Defects registered for the trailer which was part of the DVIR.
   */
  trailerDefects?: Array<DvirBaseTrailerDefects>;
  /**
   * The id of the trailer which was part of the DVIR.
   */
  trailerId?: number;
  /**
   * The name of the trailer which was part of the DVIR.
   */
  trailerName?: string;
  vehicle?: DvirBaseVehicle;
  /**
   * The condition of vechile on which DVIR was done.
   */
  vehicleCondition?: string;
  /**
   * Defects registered for the vehicle which was part of the DVIR.
   */
  vehicleDefects?: Array<DvirBaseTrailerDefects>;
}

/**
 * The authors signature for the DVIR.
 */
export interface DvirBaseAuthorSignature {
  /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   */
  mechanicUserId?: number;
  /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
   */
  driverId?: number;
  /**
   * The name of the driver or mechanic who signed the DVIR.
   */
  name?: string;
  /**
   * The time in millis when the DVIR was signed
   */
  signedAt?: number;
  /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
   */
  type?: string;
  /**
   * Email of the  driver|mechanic who signed the DVIR.
   */
  email?: string;
  /**
   * Username of the  driver|mechanic who signed the DVIR.
   */
  username?: string;
}

/**
 * The mechanic's or agent's signature for the DVIR.
 */
export interface DvirBaseMechanicOrAgentSignature {
  /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   */
  mechanicUserId?: number;
  /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
   */
  driverId?: number;
  /**
   * The name of the agent or mechanic who signed the DVIR.
   */
  name?: string;
  /**
   * The time in millis when the DVIR was signed
   */
  signedAt?: number;
  /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
   */
  type?: string;
  /**
   * Email of the  agent|mechanic who signed the DVIR.
   */
  email?: string;
  /**
   * Username of the  agent|mechanic who signed the DVIR.
   */
  username?: string;
}

/**
 * The next driver signature for the DVIR.
 */
export interface DvirBaseNextDriverSignature {
  /**
   * ID of the driver who signed the DVIR
   */
  driverId?: number;
  /**
   * The name of the driver who signed the next DVIR on this vehicle.
   */
  name?: string;
  /**
   * The time in millis when the next driver signed the DVIR on this vehicle.
   */
  signedAt?: number;
  /**
   * Type corresponds to driver.
   */
  type?: string;
  /**
   * Email of the  driver who signed the next DVIR on this vehicle.
   */
  email?: string;
  /**
   * Username of the  driver who signed the next DVIR on this vehicle.
   */
  username?: string;
}

export interface DvirBaseTrailerDefects {
  /**
   * The comment describing the type of DVIR defect
   */
  comment?: string;
  /**
   * The type of DVIR defect
   */
  defectType?: string;
}

/**
 * The vehicle on which DVIR was done.
 */
export interface DvirBaseVehicle {
  /**
   * The vehicle on which DVIR was done.
   */
  name?: string;
  /**
   * The vehicle id on which DVIR was done.
   */
  id?: number;
}

export interface DvirListResponse {
  dvirs?: Array<DvirBase>;
}

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 */
export interface EngineState {
  /**
   * Timestamp in Unix epoch milliseconds.
   */
  timeMs: any;
  value: EngineStateValueEnum;
}

/**
 * Enum for the value property.
 */
export type EngineStateValueEnum = 'Running' | 'Off' | 'Idle';

/**
 * Contains the location and speed of a vehicle at a particular time
 */
export interface FleetVehicleLocation {
  /**
   * The latitude of the location in degrees.
   */
  latitude?: number;
  /**
   * The best effort (street,city,state) for the latitude and longitude.
   */
  location?: string;
  /**
   * The longitude of the location in degrees.
   */
  longitude?: number;
  /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
   */
  speedMilesPerHour?: number;
  /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   */
  timeMs?: number;
}

/**
 * A vehicle object as returned for fleet/vehicle
 */
export interface FleetVehicleResponse {
  externalIds?: { [key: string]: string; };
  /**
   * Harsh event detection setting.
   */
  harshAccelSetting?: string;
  /**
   * ID of the vehicle.
   */
  id: number;
  /**
   * Name of the vehicle.
   */
  name: string;
  vehicleInfo?: FleetVehicleResponseVehicleInfo;
}

export interface FleetVehicleResponseVehicleInfo {
  /**
   * Year of the vehicle.
   */
  year?: number;
  /**
   * Model of the Vehicle.
   */
  model?: string;
  /**
   * Vehicle Identification Number.
   */
  vin?: string;
  /**
   * Make of the vehicle.
   */
  make?: string;
}

export interface HosAuthenticationLogsResponse {
  authenticationLogs?: Array<HosAuthenticationLogsResponseAuthenticationLogs>;
}

export interface HosAuthenticationLogsResponseAuthenticationLogs {
  /**
   * The log type - one of 'signin' or 'signout'
   */
  actionType?: string;
  /**
   * Address at which the log was recorded, if applicable.
   */
  address?: string;
  /**
   * City in which the log was recorded, if applicable.
   */
  city?: string;
  /**
   * The time at which the event was recorded in UNIX milliseconds.
   */
  happenedAtMs?: number;
  /**
   * Address name from the group address book at which the log was recorded, if applicable.
   */
  addressName?: string;
  /**
   * State in which the log was recorded, if applicable.
   */
  state?: string;
}

export interface HosLogsResponse {
  logs?: Array<HosLogsResponseLogs>;
}

export interface HosLogsResponseLogs {
  /**
   * Longitude at which the log was recorded.
   */
  locLng?: number;
  /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   */
  logStartMs?: number;
  /**
   * ID of the driver.
   */
  driverId?: number;
  /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   */
  statusType?: string;
  /**
   * City in which the log was recorded.
   */
  locCity?: string;
  /**
   * ID of the group.
   */
  groupId?: number;
  /**
   * Name of location at which the log was recorded.
   */
  locName?: string;
  /**
   * Latitude at which the log was recorded.
   */
  locLat?: number;
  /**
   * Remark associated with the log entry.
   */
  remark?: string;
  /**
   * State in which the log was recorded.
   */
  locState?: string;
  /**
   * ID of the vehicle.
   */
  vehicleId?: number;
  codriverIds?: Array<number>;
}

export interface HosLogsSummaryResponse {
  drivers?: Array<HosLogsSummaryResponseDrivers>;
}

export interface HosLogsSummaryResponseDrivers {
  /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
   */
  timeUntilBreak?: number;
  /**
   * Name of the vehicle.
   */
  vehicleName?: string;
  /**
   * The amount of driving time in violation today (in ms).
   */
  drivingInViolationToday?: number;
  /**
   * ID of the driver.
   */
  driverId?: number;
  /**
   * The amount of remaining cycle time (in ms).
   */
  cycleRemaining?: number;
  /**
   * Name of the driver.
   */
  driverName?: string;
  /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   */
  dutyStatus?: string;
  /**
   * The amount of cycle time (in ms) available tomorrow.
   */
  cycleTomorrow?: number;
  /**
   * The amount of remaining shift drive time (in ms).
   */
  shiftDriveRemaining?: number;
  /**
   * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
   */
  timeInCurrentStatus?: number;
  /**
   * The amount of driving time in violation in this cycle (in ms).
   */
  drivingInViolationCycle?: number;
  /**
   * The amount of remaining shift time (in ms).
   */
  shiftRemaining?: number;
}

/**
 * Contains the current humidity of a sensor.
 */
export interface HumidityResponse {
  groupId?: number;
  sensors?: Array<HumidityResponseSensors>;
}

export interface HumidityResponseSensors {
  /**
   * Name of the sensor.
   */
  name?: string;
  /**
   * Currently reported relative humidity in percent, from 0-100.
   */
  humidity?: number;
  /**
   * ID of the sensor.
   */
  id?: number;
}

export interface InlineObject {
  addresses: Array<AddressesAddresses>;
}

export interface InlineObject1 {
  /**
   * A list of IDs for contact book entries.
   */
  contactIds?: Array<number>;
  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   */
  formattedAddress?: string;
  geofence?: AddressGeofence;
  /**
   * The name of this address/geofence
   */
  name?: string;
  /**
   * Notes associated with an address.
   */
  notes?: string;
  /**
   * A list of tag IDs.
   */
  tagIds?: Array<number>;
}

export interface InlineObject10 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineObject11 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineObject12 {
  /**
   * Only type 'mechanic' is currently accepted.
   */
  inspectionType: InlineObject12InspectionTypeEnum;
  /**
   * Any notes from the mechanic.
   */
  mechanicNotes?: string;
  /**
   * The current odometer of the vehicle.
   */
  odometerMiles?: number;
  /**
   * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   */
  previousDefectsCorrected?: boolean;
  /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   */
  previousDefectsIgnored?: boolean;
  /**
   * Whether or not this vehicle or trailer is safe to drive.
   */
  safe: InlineObject12SafeEnum;
  /**
   * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
   */
  trailerId?: number;
  /**
   * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
   */
  userEmail: string;
  /**
   * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
   */
  vehicleId?: number;
}

/**
 * Enum for the inspectionType property.
 */
export type InlineObject12InspectionTypeEnum = 'mechanic';

/**
 * Enum for the safe property.
 */
export type InlineObject12SafeEnum = 'safe' | 'unsafe';

export interface InlineObject13 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineObject14 {
  /**
   * Group ID to query.
   */
  groupId: number;
  vehicles: Array<Vehicle>;
}

export interface InlineObject15 {
  /**
   * End of the time range, specified in milliseconds UNIX time.
   */
  endMs: number;
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
   */
  startMs: number;
  /**
   * Vehicle ID to query.
   */
  vehicleId: number;
}

export interface InlineObject16 {
  externalIds?: { [key: string]: string; };
  /**
   * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
   */
  harshAccelSetting?: number;
  /**
   * Name
   */
  name?: string;
}

export interface InlineObject17 {
  /**
   * End of the time range, specified in milliseconds UNIX time.
   */
  endMs: number;
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   */
  startMs: number;
}

export interface InlineObject18 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineObject19 {
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * List of sensor IDs to query.
   */
  sensors: Array<number>;
}

export interface InlineObject2 {
  /**
   * The address of the entry to add, as it would be recognized if provided to maps.google.com.
   */
  address: string;
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * Name of the location to add to the address book.
   */
  name: string;
  /**
   * Radius in meters of the address (used for matching vehicle trip stops to this location).
   */
  radius: number;
}

export interface InlineObject20 {
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * List of sensor IDs to query.
   */
  sensors: Array<number>;
}

export interface InlineObject21 {
  /**
   * End of the time range, specified in milliseconds UNIX time.
   */
  endMs: number;
  fillMissing?: InlineObject21FillMissingEnum;
  /**
   * Group ID to query.
   */
  groupId: number;
  series: Array<SensorsHistorySeries>;
  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   */
  startMs: number;
  /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
   */
  stepMs: number;
}

/**
 * Enum for the fillMissing property.
 */
export type InlineObject21FillMissingEnum = 'withNull' | 'withPrevious';

export interface InlineObject22 {
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * List of sensor IDs to query.
   */
  sensors: Array<number>;
}

export interface InlineObject23 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineObject24 {
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * List of sensor IDs to query.
   */
  sensors: Array<number>;
}

export interface InlineObject3 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineObject4 {
  /**
   * True indicates that this driver should be reactivated.
   */
  reactivate: boolean;
}

export interface InlineObject5 {
  /**
   * End time (ms) of queried time period.
   */
  endMs: number;
  /**
   * Org ID to query.
   */
  orgId: number;
  /**
   * Start time (ms) of queried time period.
   */
  startMs: number;
}

export interface InlineObject6 {
  /**
   * Driver ID to query.
   */
  driverId: number;
  /**
   * End of the time range, specified in milliseconds UNIX time.
   */
  endMs: number;
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   */
  startMs: number;
}

export interface InlineObject7 {
  /**
   * Driver ID to query.
   */
  driverId: number;
  /**
   * End of the time range, specified in milliseconds UNIX time.
   */
  endMs: number;
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   */
  startMs: number;
}

export interface InlineObject8 {
  /**
   * Driver ID to query.
   */
  driverId: number;
  /**
   * End of the time range, specified in milliseconds UNIX time.
   */
  endMs: number;
  /**
   * Group ID to query.
   */
  groupId: number;
  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   */
  startMs: number;
}

export interface InlineObject9 {
  /**
   * Group ID to query.
   */
  groupId: number;
}

export interface InlineResponse200 {
  assets?: Array<Asset>;
}

export interface InlineResponse2001 {
  assets?: Array<AssetCurrentLocationsResponse>;
}

export interface InlineResponse2002 {
  pagination?: Pagination;
  /**
   * Group ID to query.
   */
  groupId?: number;
  vehicles?: Array<Vehicle>;
}

export interface InlineResponse2003 {
  /**
   * Group ID to query.
   */
  groupId?: number;
  vehicles?: Array<VehicleLocation>;
}

export interface InlineResponse2004 {
  vehicles?: Array<VehicleMaintenance>;
}

export interface InlineResponse2005 {
  pagination?: Pagination;
  vehicleStats: Array<InlineResponse2005VehicleStats>;
}

export interface InlineResponse2005VehicleStats {
  engineState?: Array<EngineState>;
  auxInput2?: AuxInputSeries;
  /**
   * ID of the vehicle.
   */
  vehicleId: number;
  auxInput1?: AuxInputSeries;
}

export interface InlineResponse2006 {
  dataInputs?: Array<DataInputHistoryResponse>;
}

export interface InlineResponse2007 {
  machines?: Array<Machine>;
}

export interface InlineResponse2008 {
  sensors?: Array<Sensor>;
}

export interface InlineResponse2009 {
  tags?: Array<Tag>;
}

/**
 * The current state of the dispatch job.
 */
export type JobStatus = 'JobState_Unassigned' | 'JobState_Scheduled' | 'JobState_EnRoute' | 'JobState_Arrived' | 'JobState_Completed' | 'JobState_Skipped';
export interface JobUpdateObject {
  /**
   * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
   */
  changedAtMs?: number;
  /**
   * ID of the Samsara job.
   */
  jobId?: number;
  jobState?: JobStatus;
  prevJobState?: PrevJobStatus;
  route?: DispatchRoute;
  /**
   * ID of the Samsara dispatch route.
   */
  routeId?: number;
}

/**
 * Contains information about a machine.
 */
export interface Machine {
  /**
   * ID of the machine.
   */
  id: number;
  /**
   * Name of the machine.
   */
  name?: string;
  /**
   * Notes about the machine
   */
  notes?: string;
}

/**
 * Contains the results for a machine history request
 */
export interface MachineHistoryResponse {
  machines?: Array<MachineHistoryResponseMachines>;
}

export interface MachineHistoryResponseMachines {
  /**
   * Machine name
   */
  name?: string;
  /**
   * Machine ID
   */
  id?: number;
  /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
   */
  vibrations?: Array<MachineHistoryResponseVibrations>;
}

export interface MachineHistoryResponseVibrations {
  X?: number;
  Y?: number;
  Z?: number;
  time?: number;
}

export interface Pagination {
  /**
   * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
   */
  endCursor: string;
  /**
   * True if there are more pages of results after this response.
   */
  hasNextPage: boolean;
  /**
   * True if there are more pages of results before this response.
   */
  hasPrevPage: boolean;
  /**
   * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
   */
  startCursor: string;
}

/**
 * The previous state of the dispatch job.
 */
export type PrevJobStatus = 'JobState_Unassigned' | 'JobState_Scheduled' | 'JobState_EnRoute' | 'JobState_Arrived' | 'JobState_Completed' | 'JobState_Skipped';
/**
 * List of harsh events
 */
export interface SafetyReportHarshEvent {
  /**
   * Type of the harsh event
   */
  harshEventType?: string;
  /**
   * Timestamp that the harsh event occurred in Unix milliseconds since epoch
   */
  timestampMs?: number;
  /**
   * Vehicle associated with the harsh event
   */
  vehicleId?: number;
}

/**
 * Contains information about a sensor.
 */
export interface Sensor {
  /**
   * ID of the sensor.
   */
  id: number;
  /**
   * MAC address of the sensor.
   */
  macAddress?: string;
  /**
   * Name of the sensor.
   */
  name?: string;
}

/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 */
export interface SensorHistoryResponse {
  results?: Array<SensorHistoryResponseResults>;
}

export interface SensorHistoryResponseResults {
  /**
   * List of datapoints, one for each requested (sensor, field) pair.
   */
  series?: Array<number>;
  /**
   * Timestamp in UNIX milliseconds.
   */
  timeMs?: number;
}

/**
 * Sensor ID and field to query.
 */
export interface SensorsHistorySeries {
  /**
   * Field to query.
   */
  field: SensorsHistorySeriesFieldEnum;
  /**
   * Sensor ID to query.
   */
  widgetId: number;
}

/**
 * Enum for the field property.
 */
export type SensorsHistorySeriesFieldEnum = 'ambientTemperature' | 'probeTemperature' | 'currentLoop1Raw' | 'currentLoop1Mapped' | 'currentLoop2Raw' | 'currentLoop2Mapped' | 'pmPowerTotal' | 'pmPhase1Power' | 'pmPhase2Power' | 'pmPhase3Power' | 'pmPhase1PowerFactor' | 'pmPhase2PowerFactor' | 'pmPhase3PowerFactor';

export interface Tag {
  /**
   * The addresses that belong to this tag.
   */
  addresses?: Array<TaggedAddress>;
  /**
   * The assets that belong to this tag.
   */
  assets?: Array<TaggedAsset>;
  /**
   * The drivers that belong to this tag.
   */
  drivers?: Array<TaggedDriver>;
  /**
   * The GroupID that this tag belongs to.
   */
  groupId?: number;
  /**
   * The ID of this tag.
   */
  id: number;
  /**
   * The machines that belong to this tag.
   */
  machines?: Array<TaggedMachine>;
  /**
   * Name of this tag.
   */
  name: string;
  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   */
  parentTagId?: number;
  /**
   * The sensors that belong to this tag.
   */
  sensors?: Array<TaggedSensor>;
  /**
   * The vehicles that belong to this tag.
   */
  vehicles?: Array<TaggedVehicle>;
}

export interface TagCreate {
  /**
   * The assets that belong to this tag.
   */
  assets?: Array<TaggedAssetBase>;
  /**
   * The drivers that belong to this tag.
   */
  drivers?: Array<TaggedDriverBase>;
  /**
   * The machines that belong to this tag.
   */
  machines?: Array<TaggedMachineBase>;
  /**
   * Name of this tag.
   */
  name: string;
  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   */
  parentTagId?: number;
  /**
   * The sensors that belong to this tag.
   */
  sensors?: Array<TaggedSensorBase>;
  /**
   * The vehicles that belong to this tag.
   */
  vehicles?: Array<TaggedVehicleBase>;
}

export interface TagMetadata {
  /**
   * The ID of this tag.
   */
  id: number;
  /**
   * Name of this tag.
   */
  name: string;
}

export interface TagModify {
  add?: TagModifyAdd;
  _delete?: TagModifyDelete;
  /**
   * Updated name of this tag.
   */
  name?: string;
  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   */
  parentTagId?: number;
}

/**
 * Specify devices, etc. that should be added to the tag.
 */
export interface TagModifyAdd {
  /**
   * The assets to be added to this tag.
   */
  assets?: Array<TaggedAssetBase>;
  /**
   * The sensors to be added to this tag.
   */
  sensors?: Array<TaggedSensorBase>;
  /**
   * The vehicles to be added to this tag.
   */
  vehicles?: Array<TaggedVehicleBase>;
  /**
   * The machines to be added to this tag.
   */
  machines?: Array<TaggedMachineBase>;
  /**
   * The drivers to be added to this tag.
   */
  drivers?: Array<TaggedDriverBase>;
}

/**
 * Specify devices, etc. that should be removed from the tag.
 */
export interface TagModifyDelete {
  /**
   * The assets to be removed from this tag.
   */
  assets?: Array<TaggedAssetBase>;
  /**
   * The sensors to be removed from this tag.
   */
  sensors?: Array<TaggedSensorBase>;
  /**
   * The vehicles to be removed from this tag.
   */
  vehicles?: Array<TaggedVehicleBase>;
  /**
   * The machines to be removed from this tag.
   */
  machines?: Array<TaggedMachineBase>;
  /**
   * The drivers to be removed from this tag.
   */
  drivers?: Array<TaggedDriverBase>;
}

export interface TagUpdate {
  /**
   * The assets that belong to this tag.
   */
  assets?: Array<TaggedAssetBase>;
  /**
   * The drivers that belong to this tag.
   */
  drivers?: Array<TaggedDriverBase>;
  /**
   * The machines that belong to this tag.
   */
  machines?: Array<TaggedMachineBase>;
  /**
   * Updated name of this tag.
   */
  name?: string;
  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   */
  parentTagId?: number;
  /**
   * The sensors that belong to this tag.
   */
  sensors?: Array<TaggedSensorBase>;
  /**
   * The vehicles that belong to this tag.
   */
  vehicles?: Array<TaggedVehicleBase>;
}

export interface TaggedAddress {
  /**
   * The ID of the address being tagged.
   */
  id: number;
  /**
   * Name of the address being tagged.
   */
  name?: string;
}

export interface TaggedAddressBase {
  /**
   * The ID of the address being tagged.
   */
  id: number;
}

export interface TaggedAsset {
  /**
   * The ID of the Asset being tagged.
   */
  id: number;
  /**
   * Name of the Asset being tagged.
   */
  name?: string;
}

export interface TaggedAssetBase {
  /**
   * The ID of the Asset being tagged.
   */
  id: number;
}

export interface TaggedDriver {
  /**
   * The ID of the Driver being tagged.
   */
  id: number;
  /**
   * Name of the Driver being tagged.
   */
  name?: string;
}

export interface TaggedDriverBase {
  /**
   * The ID of the Driver being tagged.
   */
  id: number;
}

export interface TaggedMachine {
  /**
   * The ID of the Machine being tagged.
   */
  id: number;
  /**
   * Name of the Machine being tagged.
   */
  name?: string;
}

export interface TaggedMachineBase {
  /**
   * The ID of the Machine being tagged.
   */
  id: number;
}

export interface TaggedSensor {
  /**
   * The ID of the Sensor being tagged.
   */
  id: number;
  /**
   * Name of the Sensor being tagged.
   */
  name?: string;
}

export interface TaggedSensorBase {
  /**
   * The ID of the Sensor being tagged.
   */
  id: number;
}

export interface TaggedVehicle {
  /**
   * The ID of the Vehicle being tagged.
   */
  id: number;
  /**
   * Name of the Vehicle being tagged.
   */
  name?: string;
}

export interface TaggedVehicleBase {
  /**
   * The ID of the Vehicle being tagged.
   */
  id: number;
}

/**
 * Contains the current temperatures of a sensor.
 */
export interface TemperatureResponse {
  groupId?: number;
  sensors?: Array<TemperatureResponseSensors>;
}

export interface TemperatureResponseSensors {
  /**
   * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
   */
  probeTemperature?: number;
  /**
   * Name of the sensor.
   */
  name?: string;
  /**
   * ID of the sensor.
   */
  id?: number;
  /**
   * Currently reported ambient temperature in millidegrees celsius.
   */
  ambientTemperature?: number;
}

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 */
export interface TripResponse {
  trips?: Array<TripResponseTrips>;
}

/**
 * End (latitude, longitude) in decimal degrees.
 */
export interface TripResponseEndCoordinates {
  latitude?: number;
  longitude?: number;
}

/**
 * Start (latitude, longitude) in decimal degrees.
 */
export interface TripResponseStartCoordinates {
  latitude?: number;
  longitude?: number;
}

export interface TripResponseTrips {
  /**
   * Odometer reading at the end of the trip.
   */
  endOdometer?: number;
  /**
   * Length of the trip in meters.
   */
  distanceMeters?: number;
  /**
   * End of the trip in UNIX milliseconds.
   */
  endMs?: number;
  /**
   * Beginning of the trip in UNIX milliseconds.
   */
  startMs?: number;
  /**
   * Amount in milliliters of fuel consumed on this trip.
   */
  fuelConsumedMl?: number;
  /**
   * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
   */
  startAddress?: string;
  startCoordinates?: TripResponseStartCoordinates;
  endCoordinates?: TripResponseEndCoordinates;
  /**
   * Odometer reading at the beginning of the trip.
   */
  startOdometer?: number;
  /**
   * ID of the driver.
   */
  driverId?: number;
  /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   */
  startLocation?: string;
  /**
   * Length in meters trip spent on toll roads.
   */
  tollMeters?: number;
  /**
   * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
   */
  endAddress?: string;
  /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   */
  endLocation?: string;
}

export interface User {
  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   */
  authType: UserAuthTypeEnum;
  /**
   * The email address of this user.
   */
  email: string;
  /**
   * The first and last name of the user.
   */
  name?: string;
  /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   */
  organizationRoleId?: string;
  /**
   * The ID of the User record.
   */
  id?: number;
  /**
   * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   */
  organizationRole?: string;
  /**
   * The specific tags this user has access to. This will be blank for users that have full access to the organization.
   */
  tagRoles?: Array<UserTagRole>;
}

/**
 * Enum for the authType property.
 */
export type UserAuthTypeEnum = 'default' | 'saml';

export interface UserBase {
  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   */
  authType: UserBaseAuthTypeEnum;
  /**
   * The email address of this user.
   */
  email: string;
  /**
   * The first and last name of the user.
   */
  name?: string;
  /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   */
  organizationRoleId?: string;
}

/**
 * Enum for the authType property.
 */
export type UserBaseAuthTypeEnum = 'default' | 'saml';

export interface UserRole {
  id?: string;
  name?: string;
}

export interface UserTagRole {
  /**
   * The name of the role the user has been granted on this tag.
   */
  role?: string;
  /**
   * The id of the role the user has been granted on this tag.
   */
  roleId: string;
  tag: UserTagRoleTag;
}

export interface UserTagRoleTag {
  /**
   * The ID of this tag.
   */
  parentTagId?: number;
  /**
   * Name of this tag.
   */
  name: string;
  /**
   * The ID of this tag.
   */
  id: number;
}

/**
 * A vehicle object.
 */
export interface Vehicle {
  /**
   * Total engine hours for the vehicle.
   */
  engineHours?: number;
  /**
   * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
   */
  fuelLevelPercent?: number;
  /**
   * ID of the vehicle.
   */
  id: number;
  /**
   * Name of the vehicle.
   */
  name?: string;
  note?: string;
  /**
   * The number of meters reported by the odometer.
   */
  odometerMeters?: number;
  /**
   * Vehicle Identification Number.
   */
  vin?: string;
}

/**
 * Harsh event details for a vehicle
 */
export interface VehicleHarshEventResponse {
  /**
   * URL for downloading the forward facing video
   */
  downloadForwardVideoUrl?: string;
  /**
   * URL for downloading the inward facing video
   */
  downloadInwardVideoUrl?: string;
  /**
   * URL for downloading the tracked inward facing video
   */
  downloadTrackedInwardVideoUrl?: string;
  /**
   * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
   */
  harshEventType: string;
  /**
   * URL of the associated incident report page
   */
  incidentReportUrl: string;
  /**
   * Whether the driver was deemed distracted during this harsh event
   */
  isDistracted?: boolean;
  location?: VehicleHarshEventResponseLocation;
}

export interface VehicleHarshEventResponseLocation {
  /**
   * Address of location where the harsh event occurred
   */
  address?: string;
  /**
   * Latitude of location where the harsh event occurred
   */
  latitude?: string;
  /**
   * Longitude of location where the harsh event occurred
   */
  longitude?: string;
}

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 */
export interface VehicleLocation {
  /**
   * Heading in degrees.
   */
  heading?: number;
  /**
   * ID of the vehicle.
   */
  id: number;
  /**
   * Latitude in decimal degrees.
   */
  latitude?: number;
  /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
   */
  location?: string;
  /**
   * Longitude in decimal degrees.
   */
  longitude?: number;
  /**
   * Name of the vehicle.
   */
  name?: string;
  /**
   * The number of meters reported by the odometer.
   */
  odometerMeters?: number;
  /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
   */
  onTrip?: boolean;
  /**
   * Speed in miles per hour.
   */
  speed?: number;
  /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
   */
  time?: number;
  /**
   * Vehicle Identification Number (VIN) of the vehicle.
   */
  vin?: string;
}

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 */
export interface VehicleMaintenance {
  /**
   * ID of the vehicle.
   */
  id: number;
  j1939?: VehicleMaintenanceJ1939;
  passenger?: VehicleMaintenancePassenger;
}

/**
 * J1939 based data. Null if no data is available.
 */
export interface VehicleMaintenanceJ1939 {
  checkEngineLight?: VehicleMaintenanceJ1939CheckEngineLight;
  /**
   * J1939 DTCs.
   */
  diagnosticTroubleCodes?: Array<VehicleMaintenanceJ1939DiagnosticTroubleCodes>;
}

/**
 * J1939 check engine lights.
 */
export interface VehicleMaintenanceJ1939CheckEngineLight {
  protectIsOn?: boolean;
  stopIsOn?: boolean;
  warningIsOn?: boolean;
  emissionsIsOn?: boolean;
}

export interface VehicleMaintenanceJ1939DiagnosticTroubleCodes {
  spnDescription?: string;
  fmiText?: string;
  spnId?: number;
  occurrenceCount?: number;
  txId?: number;
  fmiId?: number;
}

/**
 * Passenger vehicle data. Null if no data is available.
 */
export interface VehicleMaintenancePassenger {
  checkEngineLight?: VehicleMaintenancePassengerCheckEngineLight;
  /**
   * Passenger vehicle DTCs.
   */
  diagnosticTroubleCodes?: Array<VehicleMaintenancePassengerDiagnosticTroubleCodes>;
}

/**
 * Passenger vehicle check engine light.
 */
export interface VehicleMaintenancePassengerCheckEngineLight {
  isOn?: boolean;
}

export interface VehicleMaintenancePassengerDiagnosticTroubleCodes {
  dtcShortCode?: string;
  dtcId?: number;
  dtcDescription?: string;
}

/**
 * Safety score details for a vehicle
 */
export interface VehicleSafetyScoreResponse {
  /**
   * Crash event count
   */
  crashCount?: number;
  /**
   * Harsh acceleration event count
   */
  harshAccelCount?: number;
  /**
   * Harsh braking event count
   */
  harshBrakingCount?: number;
  harshEvents?: Array<SafetyReportHarshEvent>;
  /**
   * Harsh turning event count
   */
  harshTurningCount?: number;
  /**
   * Safety Score
   */
  safetyScore?: number;
  /**
   * Safety Score Rank
   */
  safetyScoreRank?: string;
  /**
   * Amount of time driven over the speed limit in milliseconds
   */
  timeOverSpeedLimitMs?: number;
  /**
   * Total distance driven in meters
   */
  totalDistanceDrivenMeters?: number;
  /**
   * Total harsh event count
   */
  totalHarshEventCount?: number;
  /**
   * Amount of time driven in milliseconds
   */
  totalTimeDrivenMs?: number;
  /**
   * Vehicle ID
   */
  vehicleId?: number;
}

