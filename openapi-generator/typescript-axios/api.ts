// tslint:disable
/// <reference path="./custom.d.ts" />
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


import * as url from "url";
import { Configuration } from "./configuration";
import globalAxios, { AxiosPromise, AxiosInstance } from 'axios';

const BASE_PATH = "https://api.samsara.com/v1".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *  
 * @export
 * @interface RequestArgs
 */
export interface RequestArgs {
    url: string;
    options: any;
}

/**
 * 
 * @export
 * @class BaseAPI
 */
export class BaseAPI {
    protected configuration: Configuration | undefined;

    constructor(configuration?: Configuration, protected basePath: string = BASE_PATH, protected axios: AxiosInstance = globalAxios) {
        if (configuration) {
            this.configuration = configuration;
            this.basePath = configuration.basePath || this.basePath;
        }
    }
};

/**
 * 
 * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name: "RequiredError" = "RequiredError";
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 * @export
 * @interface Address
 */
export interface Address {
    /**
     * 
     * @type {Array<Contact>}
     * @memberof Address
     */
    contacts?: Array<Contact>;
    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     * @type {string}
     * @memberof Address
     */
    formattedAddress?: string;
    /**
     * 
     * @type {AddressGeofence}
     * @memberof Address
     */
    geofence?: AddressGeofence;
    /**
     * ID of the address
     * @type {number}
     * @memberof Address
     */
    id?: number;
    /**
     * Name of the address or geofence
     * @type {string}
     * @memberof Address
     */
    name?: string;
    /**
     * Notes associated with an address.
     * @type {string}
     * @memberof Address
     */
    notes?: string;
    /**
     * 
     * @type {Array<TagMetadata>}
     * @memberof Address
     */
    tags?: Array<TagMetadata>;
}

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 * @export
 * @interface AddressGeofence
 */
export interface AddressGeofence {
    /**
     * 
     * @type {AddressGeofenceCircle}
     * @memberof AddressGeofence
     */
    circle?: AddressGeofenceCircle;
    /**
     * 
     * @type {AddressGeofencePolygon}
     * @memberof AddressGeofence
     */
    polygon?: AddressGeofencePolygon;
}

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 * @export
 * @interface AddressGeofenceCircle
 */
export interface AddressGeofenceCircle {
    /**
     * The latitude of the center of the circular geofence
     * @type {number}
     * @memberof AddressGeofenceCircle
     */
    latitude?: number;
    /**
     * The radius of the circular geofence
     * @type {number}
     * @memberof AddressGeofenceCircle
     */
    radiusMeters?: number;
    /**
     * The longitude of the center of the circular geofence
     * @type {number}
     * @memberof AddressGeofenceCircle
     */
    longitude?: number;
}

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 * @export
 * @interface AddressGeofencePolygon
 */
export interface AddressGeofencePolygon {
    /**
     * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
     * @type {Array<AddressGeofencePolygonVertices>}
     * @memberof AddressGeofencePolygon
     */
    vertices?: Array<AddressGeofencePolygonVertices>;
}

/**
 * 
 * @export
 * @interface AddressGeofencePolygonVertices
 */
export interface AddressGeofencePolygonVertices {
    /**
     * The longitude of a geofence vertex
     * @type {number}
     * @memberof AddressGeofencePolygonVertices
     */
    latitude?: number;
    /**
     * The longitude of a geofence vertex
     * @type {number}
     * @memberof AddressGeofencePolygonVertices
     */
    longitude?: number;
}

/**
 * 
 * @export
 * @interface AddressesAddresses
 */
export interface AddressesAddresses {
    /**
     * Notes associated with an address.
     * @type {string}
     * @memberof AddressesAddresses
     */
    notes?: string;
    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     * @type {string}
     * @memberof AddressesAddresses
     */
    formattedAddress: string;
    /**
     * 
     * @type {AddressGeofence}
     * @memberof AddressesAddresses
     */
    geofence: AddressGeofence;
    /**
     * A list of tag IDs.
     * @type {Array<number>}
     * @memberof AddressesAddresses
     */
    tagIds?: Array<number>;
    /**
     * The name of this address/geofence
     * @type {string}
     * @memberof AddressesAddresses
     */
    name: string;
    /**
     * A list of IDs for contact book entries.
     * @type {Array<number>}
     * @memberof AddressesAddresses
     */
    contactIds?: Array<number>;
}

/**
 * 
 * @export
 * @interface AllRouteJobUpdates
 */
export interface AllRouteJobUpdates {
    /**
     * 
     * @type {Array<JobUpdateObject>}
     * @memberof AllRouteJobUpdates
     */
    jobUpdates?: Array<JobUpdateObject>;
    /**
     * Sequence ID of the last update returned in the response
     * @type {string}
     * @memberof AllRouteJobUpdates
     */
    sequenceId?: string;
}

/**
 * Basic information of an asset
 * @export
 * @interface Asset
 */
export interface Asset {
    /**
     * Serial number of the host asset
     * @type {string}
     * @memberof Asset
     */
    assetSerialNumber?: string;
    /**
     * The cable connected to the asset
     * @type {Array<AssetCable>}
     * @memberof Asset
     */
    cable?: Array<AssetCable>;
    /**
     * Engine hours
     * @type {number}
     * @memberof Asset
     */
    engineHours?: number;
    /**
     * Asset ID
     * @type {number}
     * @memberof Asset
     */
    id: number;
    /**
     * Asset name
     * @type {string}
     * @memberof Asset
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface AssetCable
 */
export interface AssetCable {
    /**
     * Asset type
     * @type {string}
     * @memberof AssetCable
     */
    assetType?: string;
}

/**
 * Current location of an asset
 * @export
 * @interface AssetCurrentLocation
 */
export interface AssetCurrentLocation {
    /**
     * The latitude of the location in degrees.
     * @type {number}
     * @memberof AssetCurrentLocation
     */
    latitude?: number;
    /**
     * The best effort (street,city,state) for the latitude and longitude.
     * @type {string}
     * @memberof AssetCurrentLocation
     */
    location?: string;
    /**
     * The longitude of the location in degrees.
     * @type {number}
     * @memberof AssetCurrentLocation
     */
    longitude?: number;
    /**
     * The speed calculated from GPS that the asset was traveling at in miles per hour.
     * @type {number}
     * @memberof AssetCurrentLocation
     */
    speedMilesPerHour?: number;
    /**
     * Time in Unix milliseconds since epoch when the asset was at the location.
     * @type {number}
     * @memberof AssetCurrentLocation
     */
    timeMs?: number;
}

/**
 * Basic information of an asset
 * @export
 * @interface AssetCurrentLocationsResponse
 */
export interface AssetCurrentLocationsResponse {
    /**
     * The cable connected to the asset
     * @type {Array<AssetCable>}
     * @memberof AssetCurrentLocationsResponse
     */
    cable?: Array<AssetCable>;
    /**
     * Engine hours
     * @type {number}
     * @memberof AssetCurrentLocationsResponse
     */
    engineHours?: number;
    /**
     * Asset ID
     * @type {number}
     * @memberof AssetCurrentLocationsResponse
     */
    id: number;
    /**
     * Current location of an asset
     * @type {Array<AssetCurrentLocation>}
     * @memberof AssetCurrentLocationsResponse
     */
    location?: Array<AssetCurrentLocation>;
    /**
     * Asset name
     * @type {string}
     * @memberof AssetCurrentLocationsResponse
     */
    name?: string;
}

/**
 * Reefer-specific asset details
 * @export
 * @interface AssetReeferResponse
 */
export interface AssetReeferResponse {
    /**
     * Asset type
     * @type {string}
     * @memberof AssetReeferResponse
     */
    assetType?: string;
    /**
     * Asset ID
     * @type {number}
     * @memberof AssetReeferResponse
     */
    id?: number;
    /**
     * Asset name
     * @type {string}
     * @memberof AssetReeferResponse
     */
    name?: string;
    /**
     * 
     * @type {AssetReeferResponseReeferStats}
     * @memberof AssetReeferResponse
     */
    reeferStats?: AssetReeferResponseReeferStats;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStats
 */
export interface AssetReeferResponseReeferStats {
    /**
     * Fuel percentage of the reefer
     * @type {Array<AssetReeferResponseReeferStatsFuelPercentage>}
     * @memberof AssetReeferResponseReeferStats
     */
    fuelPercentage?: Array<AssetReeferResponseReeferStatsFuelPercentage>;
    /**
     * Power status of the reefer
     * @type {Array<AssetReeferResponseReeferStatsPowerStatus>}
     * @memberof AssetReeferResponseReeferStats
     */
    powerStatus?: Array<AssetReeferResponseReeferStatsPowerStatus>;
    /**
     * Engine hours of the reefer
     * @type {Array<AssetReeferResponseReeferStatsEngineHours>}
     * @memberof AssetReeferResponseReeferStats
     */
    engineHours?: Array<AssetReeferResponseReeferStatsEngineHours>;
    /**
     * Set point temperature of the reefer
     * @type {Array<AssetReeferResponseReeferStatsSetPoint>}
     * @memberof AssetReeferResponseReeferStats
     */
    setPoint?: Array<AssetReeferResponseReeferStatsSetPoint>;
    /**
     * Return air temperature of the reefer
     * @type {Array<AssetReeferResponseReeferStatsReturnAirTemp>}
     * @memberof AssetReeferResponseReeferStats
     */
    returnAirTemp?: Array<AssetReeferResponseReeferStatsReturnAirTemp>;
    /**
     * Reefer alarms
     * @type {Array<AssetReeferResponseReeferStatsAlarms1>}
     * @memberof AssetReeferResponseReeferStats
     */
    alarms?: Array<AssetReeferResponseReeferStatsAlarms1>;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsAlarms
 */
export interface AssetReeferResponseReeferStatsAlarms {
    /**
     * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsAlarms
     */
    severity?: number;
    /**
     * Recommended operator action
     * @type {string}
     * @memberof AssetReeferResponseReeferStatsAlarms
     */
    operatorAction?: string;
    /**
     * Description of the alarm
     * @type {string}
     * @memberof AssetReeferResponseReeferStatsAlarms
     */
    description?: string;
    /**
     * ID of the alarm
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsAlarms
     */
    alarmCode?: number;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsAlarms1
 */
export interface AssetReeferResponseReeferStatsAlarms1 {
    /**
     * 
     * @type {Array<AssetReeferResponseReeferStatsAlarms>}
     * @memberof AssetReeferResponseReeferStatsAlarms1
     */
    alarms?: Array<AssetReeferResponseReeferStatsAlarms>;
    /**
     * Timestamp when the alarms were reported, in Unix milliseconds since epoch
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsAlarms1
     */
    changedAtMs?: number;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsEngineHours
 */
export interface AssetReeferResponseReeferStatsEngineHours {
    /**
     * Engine hours of the reefer.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsEngineHours
     */
    engineHours?: number;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsEngineHours
     */
    changedAtMs?: number;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsFuelPercentage
 */
export interface AssetReeferResponseReeferStatsFuelPercentage {
    /**
     * Fuel percentage of the reefer.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsFuelPercentage
     */
    fuelPercentage?: number;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsFuelPercentage
     */
    changedAtMs?: number;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsPowerStatus
 */
export interface AssetReeferResponseReeferStatsPowerStatus {
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsPowerStatus
     */
    changedAtMs?: number;
    /**
     * Power status of the reefer.
     * @type {string}
     * @memberof AssetReeferResponseReeferStatsPowerStatus
     */
    status?: string;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsReturnAirTemp
 */
export interface AssetReeferResponseReeferStatsReturnAirTemp {
    /**
     * Return air temperature in millidegree Celsius.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsReturnAirTemp
     */
    tempInMilliC?: number;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsReturnAirTemp
     */
    changedAtMs?: number;
}

/**
 * 
 * @export
 * @interface AssetReeferResponseReeferStatsSetPoint
 */
export interface AssetReeferResponseReeferStatsSetPoint {
    /**
     * Set point temperature in millidegree Celsius.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsSetPoint
     */
    tempInMilliC?: number;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @type {number}
     * @memberof AssetReeferResponseReeferStatsSetPoint
     */
    changedAtMs?: number;
}

/**
 * Digital value of an aux input.
 * @export
 * @interface AuxInput
 */
export interface AuxInput {
    /**
     * Timestamp in Unix epoch milliseconds.
     * @type {any}
     * @memberof AuxInput
     */
    timeMs: any;
    /**
     * Boolean representing the digital value of the aux input.
     * @type {boolean}
     * @memberof AuxInput
     */
    value: boolean;
}

/**
 * A list of aux input values over a timerange.
 * @export
 * @interface AuxInputSeries
 */
export interface AuxInputSeries {
    /**
     * The name of the aux input.
     * @type {string}
     * @memberof AuxInputSeries
     */
    name: AuxInputSeries.NameEnum;
    /**
     * 
     * @type {Array<AuxInput>}
     * @memberof AuxInputSeries
     */
    values: Array<AuxInput>;
}

/**
 * @export
 * @namespace AuxInputSeries
 */
export namespace AuxInputSeries {
    /**
     * @export
     * @enum {string}
     */
    export enum NameEnum {
        EmergencyLights = 'Emergency Lights',
        EmergencyAlarm = 'Emergency Alarm',
        StopPaddle = 'Stop Paddle',
        PowerTakeOff = 'Power Take-Off',
        Plow = 'Plow',
        Sweeper = 'Sweeper',
        Salter = 'Salter',
        Boom = 'Boom'
    }
}

/**
 * Contains the current cargo status of a sensor.
 * @export
 * @interface CargoResponse
 */
export interface CargoResponse {
    /**
     * 
     * @type {number}
     * @memberof CargoResponse
     */
    groupId?: number;
    /**
     * 
     * @type {Array<CargoResponseSensors>}
     * @memberof CargoResponse
     */
    sensors?: Array<CargoResponseSensors>;
}

/**
 * 
 * @export
 * @interface CargoResponseSensors
 */
export interface CargoResponseSensors {
    /**
     * Flag indicating whether the current cargo is empty or loaded.
     * @type {boolean}
     * @memberof CargoResponseSensors
     */
    cargoEmpty?: boolean;
    /**
     * Name of the sensor.
     * @type {string}
     * @memberof CargoResponseSensors
     */
    name?: string;
    /**
     * ID of the sensor.
     * @type {number}
     * @memberof CargoResponseSensors
     */
    id?: number;
}

/**
 * Information about a notification contact for alerts.
 * @export
 * @interface Contact
 */
export interface Contact {
    /**
     * Email address of the contact
     * @type {string}
     * @memberof Contact
     */
    email?: string;
    /**
     * First name of the contact
     * @type {string}
     * @memberof Contact
     */
    firstName?: string;
    /**
     * ID of the contact
     * @type {number}
     * @memberof Contact
     */
    id?: number;
    /**
     * Last name of the contact
     * @type {string}
     * @memberof Contact
     */
    lastName?: string;
    /**
     * Phone number of the contact
     * @type {string}
     * @memberof Contact
     */
    phone?: string;
}

/**
 * 
 * @export
 * @interface CurrentDriver
 */
export interface CurrentDriver {
}

/**
 * 
 * @export
 * @interface DataInputHistoryResponse
 */
export interface DataInputHistoryResponse {
    /**
     * The ID of this data input
     * @type {number}
     * @memberof DataInputHistoryResponse
     */
    id?: number;
    /**
     * Name of this data input
     * @type {string}
     * @memberof DataInputHistoryResponse
     */
    name: string;
    /**
     * Data points from this data input
     * @type {Array<DataInputHistoryResponsePoints>}
     * @memberof DataInputHistoryResponse
     */
    points?: Array<DataInputHistoryResponsePoints>;
}

/**
 * 
 * @export
 * @interface DataInputHistoryResponsePoints
 */
export interface DataInputHistoryResponsePoints {
    /**
     * 
     * @type {number}
     * @memberof DataInputHistoryResponsePoints
     */
    value?: number;
    /**
     * 
     * @type {number}
     * @memberof DataInputHistoryResponsePoints
     */
    timeMs?: number;
}

/**
 * 
 * @export
 * @interface DispatchJob
 */
export interface DispatchJob {
    /**
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     * @type {string}
     * @memberof DispatchJob
     */
    destinationAddress?: string;
    /**
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     * @type {number}
     * @memberof DispatchJob
     */
    destinationAddressId?: number;
    /**
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @type {number}
     * @memberof DispatchJob
     */
    destinationLat?: number;
    /**
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @type {number}
     * @memberof DispatchJob
     */
    destinationLng?: number;
    /**
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     * @type {string}
     * @memberof DispatchJob
     */
    destinationName?: string;
    /**
     * Notes regarding the details of this job.
     * @type {string}
     * @memberof DispatchJob
     */
    notes?: string;
    /**
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     * @type {number}
     * @memberof DispatchJob
     */
    scheduledArrivalTimeMs: number;
    /**
     * The time at which the assigned driver is scheduled to depart from the job destination.
     * @type {number}
     * @memberof DispatchJob
     */
    scheduledDepartureTimeMs?: number;
    /**
     * The time at which the driver arrived at the job destination.
     * @type {number}
     * @memberof DispatchJob
     */
    arrivedAtMs?: number;
    /**
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     * @type {number}
     * @memberof DispatchJob
     */
    completedAtMs?: number;
    /**
     * ID of the route that this job belongs to.
     * @type {number}
     * @memberof DispatchJob
     */
    dispatchRouteId: number;
    /**
     * ID of the driver assigned to the dispatch job.
     * @type {number}
     * @memberof DispatchJob
     */
    driverId?: number;
    /**
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     * @type {number}
     * @memberof DispatchJob
     */
    enRouteAtMs?: number;
    /**
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     * @type {number}
     * @memberof DispatchJob
     */
    estimatedArrivalMs?: number;
    /**
     * Fleet viewer url of the dispatch job.
     * @type {string}
     * @memberof DispatchJob
     */
    fleetViewerUrl?: string;
    /**
     * 
     * @type {number}
     * @memberof DispatchJob
     */
    groupId: number;
    /**
     * ID of the Samsara dispatch job.
     * @type {number}
     * @memberof DispatchJob
     */
    id: number;
    /**
     * 
     * @type {JobStatus}
     * @memberof DispatchJob
     */
    jobState: JobStatus;
    /**
     * The time at which the job was marked skipped.
     * @type {number}
     * @memberof DispatchJob
     */
    skippedAtMs?: number;
    /**
     * ID of the vehicle used for the dispatch job.
     * @type {number}
     * @memberof DispatchJob
     */
    vehicleId?: number;
}

/**
 * 
 * @export
 * @interface DispatchJobCreate
 */
export interface DispatchJobCreate {
    /**
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     * @type {string}
     * @memberof DispatchJobCreate
     */
    destinationAddress?: string;
    /**
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     * @type {number}
     * @memberof DispatchJobCreate
     */
    destinationAddressId?: number;
    /**
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @type {number}
     * @memberof DispatchJobCreate
     */
    destinationLat?: number;
    /**
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @type {number}
     * @memberof DispatchJobCreate
     */
    destinationLng?: number;
    /**
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     * @type {string}
     * @memberof DispatchJobCreate
     */
    destinationName?: string;
    /**
     * Notes regarding the details of this job.
     * @type {string}
     * @memberof DispatchJobCreate
     */
    notes?: string;
    /**
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     * @type {number}
     * @memberof DispatchJobCreate
     */
    scheduledArrivalTimeMs: number;
    /**
     * The time at which the assigned driver is scheduled to depart from the job destination.
     * @type {number}
     * @memberof DispatchJobCreate
     */
    scheduledDepartureTimeMs?: number;
}

/**
 * 
 * @export
 * @interface DispatchRoute
 */
export interface DispatchRoute {
    /**
     * The time in Unix epoch milliseconds that the route actually ended.
     * @type {number}
     * @memberof DispatchRoute
     */
    actualEndMs?: number;
    /**
     * The time in Unix epoch milliseconds that the route actually started.
     * @type {number}
     * @memberof DispatchRoute
     */
    actualStartMs?: number;
    /**
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @type {number}
     * @memberof DispatchRoute
     */
    driverId?: number;
    /**
     * ID of the group if the organization has multiple groups (optional).
     * @type {number}
     * @memberof DispatchRoute
     */
    groupId?: number;
    /**
     * Descriptive name of this route.
     * @type {string}
     * @memberof DispatchRoute
     */
    name: string;
    /**
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     * @type {number}
     * @memberof DispatchRoute
     */
    scheduledEndMs: number;
    /**
     * The distance expected to be traveled for this route in meters.
     * @type {number}
     * @memberof DispatchRoute
     */
    scheduledMeters?: number;
    /**
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     * @type {number}
     * @memberof DispatchRoute
     */
    scheduledStartMs: number;
    /**
     * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     * @type {string}
     * @memberof DispatchRoute
     */
    startLocationAddress?: string;
    /**
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     * @type {number}
     * @memberof DispatchRoute
     */
    startLocationAddressId?: number;
    /**
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @type {number}
     * @memberof DispatchRoute
     */
    startLocationLat?: number;
    /**
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @type {number}
     * @memberof DispatchRoute
     */
    startLocationLng?: number;
    /**
     * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     * @type {string}
     * @memberof DispatchRoute
     */
    startLocationName?: string;
    /**
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     * @type {number}
     * @memberof DispatchRoute
     */
    trailerId?: number;
    /**
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @type {number}
     * @memberof DispatchRoute
     */
    vehicleId?: number;
    /**
     * The dispatch jobs associated with this route.
     * @type {Array<DispatchJob>}
     * @memberof DispatchRoute
     */
    dispatchJobs: Array<DispatchJob>;
    /**
     * ID of the Samsara dispatch route.
     * @type {number}
     * @memberof DispatchRoute
     */
    id: number;
}

/**
 * 
 * @export
 * @interface DispatchRouteBase
 */
export interface DispatchRouteBase {
    /**
     * The time in Unix epoch milliseconds that the route actually ended.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    actualEndMs?: number;
    /**
     * The time in Unix epoch milliseconds that the route actually started.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    actualStartMs?: number;
    /**
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    driverId?: number;
    /**
     * ID of the group if the organization has multiple groups (optional).
     * @type {number}
     * @memberof DispatchRouteBase
     */
    groupId?: number;
    /**
     * Descriptive name of this route.
     * @type {string}
     * @memberof DispatchRouteBase
     */
    name: string;
    /**
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    scheduledEndMs: number;
    /**
     * The distance expected to be traveled for this route in meters.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    scheduledMeters?: number;
    /**
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    scheduledStartMs: number;
    /**
     * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     * @type {string}
     * @memberof DispatchRouteBase
     */
    startLocationAddress?: string;
    /**
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    startLocationAddressId?: number;
    /**
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    startLocationLat?: number;
    /**
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    startLocationLng?: number;
    /**
     * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     * @type {string}
     * @memberof DispatchRouteBase
     */
    startLocationName?: string;
    /**
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    trailerId?: number;
    /**
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @type {number}
     * @memberof DispatchRouteBase
     */
    vehicleId?: number;
}

/**
 * 
 * @export
 * @interface DispatchRouteCreate
 */
export interface DispatchRouteCreate {
    /**
     * The time in Unix epoch milliseconds that the route actually ended.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    actualEndMs?: number;
    /**
     * The time in Unix epoch milliseconds that the route actually started.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    actualStartMs?: number;
    /**
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    driverId?: number;
    /**
     * ID of the group if the organization has multiple groups (optional).
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    groupId?: number;
    /**
     * Descriptive name of this route.
     * @type {string}
     * @memberof DispatchRouteCreate
     */
    name: string;
    /**
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    scheduledEndMs: number;
    /**
     * The distance expected to be traveled for this route in meters.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    scheduledMeters?: number;
    /**
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    scheduledStartMs: number;
    /**
     * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     * @type {string}
     * @memberof DispatchRouteCreate
     */
    startLocationAddress?: string;
    /**
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    startLocationAddressId?: number;
    /**
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    startLocationLat?: number;
    /**
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    startLocationLng?: number;
    /**
     * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     * @type {string}
     * @memberof DispatchRouteCreate
     */
    startLocationName?: string;
    /**
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    trailerId?: number;
    /**
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @type {number}
     * @memberof DispatchRouteCreate
     */
    vehicleId?: number;
    /**
     * The dispatch jobs to create for this route.
     * @type {Array<DispatchJobCreate>}
     * @memberof DispatchRouteCreate
     */
    dispatchJobs: Array<DispatchJobCreate>;
}

/**
 * 
 * @export
 * @interface DispatchRouteHistoricalEntry
 */
export interface DispatchRouteHistoricalEntry {
    /**
     * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
     * @type {number}
     * @memberof DispatchRouteHistoricalEntry
     */
    changedAtMs?: number;
    /**
     * 
     * @type {DispatchRoute}
     * @memberof DispatchRouteHistoricalEntry
     */
    route?: DispatchRoute;
}

/**
 * 
 * @export
 * @interface DispatchRouteHistory
 */
export interface DispatchRouteHistory {
    /**
     * History of the route's state changes.
     * @type {Array<DispatchRouteHistoricalEntry>}
     * @memberof DispatchRouteHistory
     */
    history?: Array<DispatchRouteHistoricalEntry>;
}

/**
 * 
 * @export
 * @interface Document
 */
export interface Document {
    /**
     * ID of the Samsara dispatch job for which the document is submitted
     * @type {number}
     * @memberof Document
     */
    dispatchJobId?: number;
    /**
     * Notes submitted with this document.
     * @type {string}
     * @memberof Document
     */
    notes?: string;
    /**
     * Descriptive name of this type of document.
     * @type {string}
     * @memberof Document
     */
    documentType: string;
    /**
     * The time in Unix epoch milliseconds that the document is created.
     * @type {number}
     * @memberof Document
     */
    driverCreatedAtMs: number;
    /**
     * ID of the driver for whom the document is submitted
     * @type {number}
     * @memberof Document
     */
    driverId: number;
    /**
     * The fields associated with this document.
     * @type {Array<DocumentField>}
     * @memberof Document
     */
    fields: Array<DocumentField>;
    /**
     * VehicleID of the driver at document creation.
     * @type {number}
     * @memberof Document
     */
    vehicleId?: number;
}

/**
 * 
 * @export
 * @interface DocumentBase
 */
export interface DocumentBase {
    /**
     * ID of the Samsara dispatch job for which the document is submitted
     * @type {number}
     * @memberof DocumentBase
     */
    dispatchJobId?: number;
    /**
     * Notes submitted with this document.
     * @type {string}
     * @memberof DocumentBase
     */
    notes?: string;
}

/**
 * 
 * @export
 * @interface DocumentCreate
 */
export interface DocumentCreate {
    /**
     * ID of the Samsara dispatch job for which the document is submitted
     * @type {number}
     * @memberof DocumentCreate
     */
    dispatchJobId?: number;
    /**
     * Notes submitted with this document.
     * @type {string}
     * @memberof DocumentCreate
     */
    notes?: string;
    /**
     * Universally unique identifier for the document type this document is being created for.
     * @type {string}
     * @memberof DocumentCreate
     */
    documentTypeUuid: string;
    /**
     * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     * @type {Array<DocumentField>}
     * @memberof DocumentCreate
     */
    fields: Array<DocumentField>;
}

/**
 * 
 * @export
 * @interface DocumentField
 */
export interface DocumentField {
    /**
     * Value of this field if this document field has valueType: ValueType_Number.
     * @type {number}
     * @memberof DocumentField
     */
    numberValue?: number;
    /**
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     * @type {Array<DocumentFieldCreatePhotoValue>}
     * @memberof DocumentField
     */
    photoValue?: Array<DocumentFieldCreatePhotoValue>;
    /**
     * Value of this field if this document field has valueType: ValueType_String.
     * @type {string}
     * @memberof DocumentField
     */
    stringValue?: string;
    /**
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     * @type {string}
     * @memberof DocumentField
     */
    valueType: string;
    /**
     * Descriptive name of this field.
     * @type {string}
     * @memberof DocumentField
     */
    label: string;
    /**
     * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
     * @type {any}
     * @memberof DocumentField
     */
    value?: any;
}

/**
 * 
 * @export
 * @interface DocumentFieldCreate
 */
export interface DocumentFieldCreate {
    /**
     * Value of this field if this document field has valueType: ValueType_Number.
     * @type {number}
     * @memberof DocumentFieldCreate
     */
    numberValue?: number;
    /**
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     * @type {Array<DocumentFieldCreatePhotoValue>}
     * @memberof DocumentFieldCreate
     */
    photoValue?: Array<DocumentFieldCreatePhotoValue>;
    /**
     * Value of this field if this document field has valueType: ValueType_String.
     * @type {string}
     * @memberof DocumentFieldCreate
     */
    stringValue?: string;
    /**
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     * @type {string}
     * @memberof DocumentFieldCreate
     */
    valueType: string;
}

/**
 * 
 * @export
 * @interface DocumentFieldCreatePhotoValue
 */
export interface DocumentFieldCreatePhotoValue {
    /**
     * Photo URL for a JPG image
     * @type {string}
     * @memberof DocumentFieldCreatePhotoValue
     */
    url?: string;
}

/**
 * 
 * @export
 * @interface DocumentFieldType
 */
export interface DocumentFieldType {
    /**
     * Descriptive name of this field type.
     * @type {string}
     * @memberof DocumentFieldType
     */
    label: string;
    /**
     * 
     * @type {DocumentFieldTypeNumberValueTypeMetadata}
     * @memberof DocumentFieldType
     */
    numberValueTypeMetadata?: DocumentFieldTypeNumberValueTypeMetadata;
    /**
     * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     * @type {string}
     * @memberof DocumentFieldType
     */
    valueType: string;
}

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 * @export
 * @interface DocumentFieldTypeNumberValueTypeMetadata
 */
export interface DocumentFieldTypeNumberValueTypeMetadata {
    /**
     * Number of decimal places that values for this field type can have.
     * @type {number}
     * @memberof DocumentFieldTypeNumberValueTypeMetadata
     */
    numDecimalPlaces?: number;
}

/**
 * 
 * @export
 * @interface DocumentType
 */
export interface DocumentType {
    /**
     * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
     * @type {Array<Array>}
     * @memberof DocumentType
     */
    fieldTypes?: Array<Array>;
    /**
     * Name of the document type.
     * @type {string}
     * @memberof DocumentType
     */
    name: string;
    /**
     * ID for the organization this document belongs to.
     * @type {number}
     * @memberof DocumentType
     */
    orgId: number;
    /**
     * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
     * @type {string}
     * @memberof DocumentType
     */
    uuid: string;
}

/**
 * Contains the current door status of a sensor.
 * @export
 * @interface DoorResponse
 */
export interface DoorResponse {
    /**
     * 
     * @type {number}
     * @memberof DoorResponse
     */
    groupId?: number;
    /**
     * 
     * @type {Array<DoorResponseSensors>}
     * @memberof DoorResponse
     */
    sensors?: Array<DoorResponseSensors>;
}

/**
 * 
 * @export
 * @interface DoorResponseSensors
 */
export interface DoorResponseSensors {
    /**
     * Flag indicating whether the current door is closed or open.
     * @type {boolean}
     * @memberof DoorResponseSensors
     */
    doorClosed?: boolean;
    /**
     * Name of the sensor.
     * @type {string}
     * @memberof DoorResponseSensors
     */
    name?: string;
    /**
     * ID of the sensor.
     * @type {number}
     * @memberof DoorResponseSensors
     */
    id?: number;
}

/**
 * 
 * @export
 * @interface Driver
 */
export interface Driver {
    /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     * @type {boolean}
     * @memberof Driver
     */
    eldAdverseWeatherExemptionEnabled?: boolean;
    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     * @type {boolean}
     * @memberof Driver
     */
    eldBigDayExemptionEnabled?: boolean;
    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     * @type {number}
     * @memberof Driver
     */
    eldDayStartHour?: number;
    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     * @type {boolean}
     * @memberof Driver
     */
    eldExempt?: boolean;
    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     * @type {string}
     * @memberof Driver
     */
    eldExemptReason?: string;
    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     * @type {boolean}
     * @memberof Driver
     */
    eldPcEnabled?: boolean;
    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     * @type {boolean}
     * @memberof Driver
     */
    eldYmEnabled?: boolean;
    /**
     * Dictionary of external IDs (string key-value pairs)
     * @type {{ [key: string]: string; }}
     * @memberof Driver
     */
    externalIds?: { [key: string]: string; };
    /**
     * ID of the group if the organization has multiple groups (uncommon).
     * @type {number}
     * @memberof Driver
     */
    groupId?: number;
    /**
     * Driver's state issued license number.
     * @type {string}
     * @memberof Driver
     */
    licenseNumber?: string;
    /**
     * Abbreviation of state that issued driver's license.
     * @type {string}
     * @memberof Driver
     */
    licenseState?: string;
    /**
     * Driver's name.
     * @type {string}
     * @memberof Driver
     */
    name: string;
    /**
     * Notes about the driver.
     * @type {string}
     * @memberof Driver
     */
    notes?: string;
    /**
     * Driver's phone number. Please include only digits, ex. 4157771234
     * @type {string}
     * @memberof Driver
     */
    phone?: string;
    /**
     * Driver's login username into the driver app.
     * @type {string}
     * @memberof Driver
     */
    username?: string;
    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     * @type {number}
     * @memberof Driver
     */
    vehicleId?: number;
    /**
     * ID of the driver.
     * @type {number}
     * @memberof Driver
     */
    id: number;
    /**
     * True if the driver account has been deactivated.
     * @type {boolean}
     * @memberof Driver
     */
    isDeactivated?: boolean;
    /**
     * 
     * @type {Array<TagMetadata>}
     * @memberof Driver
     */
    tags?: Array<TagMetadata>;
}

/**
 * 
 * @export
 * @interface DriverBase
 */
export interface DriverBase {
    /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     * @type {boolean}
     * @memberof DriverBase
     */
    eldAdverseWeatherExemptionEnabled?: boolean;
    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     * @type {boolean}
     * @memberof DriverBase
     */
    eldBigDayExemptionEnabled?: boolean;
    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     * @type {number}
     * @memberof DriverBase
     */
    eldDayStartHour?: number;
    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     * @type {boolean}
     * @memberof DriverBase
     */
    eldExempt?: boolean;
    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     * @type {string}
     * @memberof DriverBase
     */
    eldExemptReason?: string;
    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     * @type {boolean}
     * @memberof DriverBase
     */
    eldPcEnabled?: boolean;
    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     * @type {boolean}
     * @memberof DriverBase
     */
    eldYmEnabled?: boolean;
    /**
     * Dictionary of external IDs (string key-value pairs)
     * @type {{ [key: string]: string; }}
     * @memberof DriverBase
     */
    externalIds?: { [key: string]: string; };
    /**
     * ID of the group if the organization has multiple groups (uncommon).
     * @type {number}
     * @memberof DriverBase
     */
    groupId?: number;
    /**
     * Driver's state issued license number.
     * @type {string}
     * @memberof DriverBase
     */
    licenseNumber?: string;
    /**
     * Abbreviation of state that issued driver's license.
     * @type {string}
     * @memberof DriverBase
     */
    licenseState?: string;
    /**
     * Driver's name.
     * @type {string}
     * @memberof DriverBase
     */
    name: string;
    /**
     * Notes about the driver.
     * @type {string}
     * @memberof DriverBase
     */
    notes?: string;
    /**
     * Driver's phone number. Please include only digits, ex. 4157771234
     * @type {string}
     * @memberof DriverBase
     */
    phone?: string;
    /**
     * Driver's login username into the driver app.
     * @type {string}
     * @memberof DriverBase
     */
    username?: string;
    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     * @type {number}
     * @memberof DriverBase
     */
    vehicleId?: number;
}

/**
 * 
 * @export
 * @interface DriverDailyLogResponse
 */
export interface DriverDailyLogResponse {
    /**
     * 
     * @type {Array<DriverDailyLogResponseDays>}
     * @memberof DriverDailyLogResponse
     */
    days?: Array<DriverDailyLogResponseDays>;
}

/**
 * 
 * @export
 * @interface DriverDailyLogResponseDays
 */
export interface DriverDailyLogResponseDays {
    /**
     * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
     * @type {number}
     * @memberof DriverDailyLogResponseDays
     */
    certifiedAtMs?: number;
    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof DriverDailyLogResponseDays
     */
    endMs?: number;
    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof DriverDailyLogResponseDays
     */
    startMs?: number;
    /**
     * List of trailer ID's associated with the driver for the day.
     * @type {any}
     * @memberof DriverDailyLogResponseDays
     */
    trailerIds?: any;
    /**
     * Hours spent on duty or driving, rounded to two decimal places.
     * @type {number}
     * @memberof DriverDailyLogResponseDays
     */
    activeHours?: number;
    /**
     * Distance driven in miles, rounded to two decimal places.
     * @type {number}
     * @memberof DriverDailyLogResponseDays
     */
    distanceMiles?: number;
    /**
     * Milliseconds spent on duty or driving.
     * @type {number}
     * @memberof DriverDailyLogResponseDays
     */
    activeMs?: number;
    /**
     * Whether this HOS day chart was certified by the driver.
     * @type {boolean}
     * @memberof DriverDailyLogResponseDays
     */
    certified?: boolean;
    /**
     * List of vehicle ID's associated with the driver for the day.
     * @type {any}
     * @memberof DriverDailyLogResponseDays
     */
    vehicleIds?: any;
}

/**
 * 
 * @export
 * @interface DriverForCreate
 */
export interface DriverForCreate {
    /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     * @type {boolean}
     * @memberof DriverForCreate
     */
    eldAdverseWeatherExemptionEnabled?: boolean;
    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     * @type {boolean}
     * @memberof DriverForCreate
     */
    eldBigDayExemptionEnabled?: boolean;
    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     * @type {number}
     * @memberof DriverForCreate
     */
    eldDayStartHour?: number;
    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     * @type {boolean}
     * @memberof DriverForCreate
     */
    eldExempt?: boolean;
    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     * @type {string}
     * @memberof DriverForCreate
     */
    eldExemptReason?: string;
    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     * @type {boolean}
     * @memberof DriverForCreate
     */
    eldPcEnabled?: boolean;
    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     * @type {boolean}
     * @memberof DriverForCreate
     */
    eldYmEnabled?: boolean;
    /**
     * Dictionary of external IDs (string key-value pairs)
     * @type {{ [key: string]: string; }}
     * @memberof DriverForCreate
     */
    externalIds?: { [key: string]: string; };
    /**
     * ID of the group if the organization has multiple groups (uncommon).
     * @type {number}
     * @memberof DriverForCreate
     */
    groupId?: number;
    /**
     * Driver's state issued license number.
     * @type {string}
     * @memberof DriverForCreate
     */
    licenseNumber?: string;
    /**
     * Abbreviation of state that issued driver's license.
     * @type {string}
     * @memberof DriverForCreate
     */
    licenseState?: string;
    /**
     * Driver's name.
     * @type {string}
     * @memberof DriverForCreate
     */
    name: string;
    /**
     * Notes about the driver.
     * @type {string}
     * @memberof DriverForCreate
     */
    notes?: string;
    /**
     * Driver's phone number. Please include only digits, ex. 4157771234
     * @type {string}
     * @memberof DriverForCreate
     */
    phone?: string;
    /**
     * Driver's login username into the driver app.
     * @type {string}
     * @memberof DriverForCreate
     */
    username?: string;
    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     * @type {number}
     * @memberof DriverForCreate
     */
    vehicleId?: number;
    /**
     * Driver's password for the driver app.
     * @type {string}
     * @memberof DriverForCreate
     */
    password: string;
    /**
     * A list of tag IDs.
     * @type {Array<number>}
     * @memberof DriverForCreate
     */
    tagIds?: Array<number>;
}

/**
 * Safety score details for a driver
 * @export
 * @interface DriverSafetyScoreResponse
 */
export interface DriverSafetyScoreResponse {
    /**
     * Crash event count
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    crashCount?: number;
    /**
     * Driver ID
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    driverId?: number;
    /**
     * Harsh acceleration event count
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    harshAccelCount?: number;
    /**
     * Harsh braking event count
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    harshBrakingCount?: number;
    /**
     * 
     * @type {Array<SafetyReportHarshEvent>}
     * @memberof DriverSafetyScoreResponse
     */
    harshEvents?: Array<SafetyReportHarshEvent>;
    /**
     * Harsh turning event count
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    harshTurningCount?: number;
    /**
     * Safety Score
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    safetyScore?: number;
    /**
     * Safety Score Rank
     * @type {string}
     * @memberof DriverSafetyScoreResponse
     */
    safetyScoreRank?: string;
    /**
     * Amount of time driven over the speed limit in milliseconds
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    timeOverSpeedLimitMs?: number;
    /**
     * Total distance driven in meters
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    totalDistanceDrivenMeters?: number;
    /**
     * Total harsh event count
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    totalHarshEventCount?: number;
    /**
     * Amount of time driven in milliseconds
     * @type {number}
     * @memberof DriverSafetyScoreResponse
     */
    totalTimeDrivenMs?: number;
}

/**
 * 
 * @export
 * @interface DriversResponse
 */
export interface DriversResponse {
    /**
     * 
     * @type {Array<Driver>}
     * @memberof DriversResponse
     */
    drivers?: Array<Driver>;
}

/**
 * 
 * @export
 * @interface DriversSummaryResponse
 */
export interface DriversSummaryResponse {
    /**
     * 
     * @type {Array<DriversSummaryResponseSummaries>}
     * @memberof DriversSummaryResponse
     */
    summaries?: Array<DriversSummaryResponseSummaries>;
}

/**
 * 
 * @export
 * @interface DriversSummaryResponseSummaries
 */
export interface DriversSummaryResponseSummaries {
    /**
     * ID of the driver.
     * @type {number}
     * @memberof DriversSummaryResponseSummaries
     */
    driverId?: number;
    /**
     * Distance driven in miles, rounded to two decimal places.
     * @type {number}
     * @memberof DriversSummaryResponseSummaries
     */
    distanceMiles?: number;
    /**
     * Duration in milliseconds that driver was driving during the requested time range
     * @type {number}
     * @memberof DriversSummaryResponseSummaries
     */
    driveMs?: number;
    /**
     * Duration in milliseconds that driver was on duty or driving during the requested time range
     * @type {number}
     * @memberof DriversSummaryResponseSummaries
     */
    activeMs?: number;
    /**
     * Username of the driver.
     * @type {string}
     * @memberof DriversSummaryResponseSummaries
     */
    driverUsername?: string;
    /**
     * Group of the driver.
     * @type {number}
     * @memberof DriversSummaryResponseSummaries
     */
    groupId?: number;
    /**
     * Name of the driver.
     * @type {string}
     * @memberof DriversSummaryResponseSummaries
     */
    driverName?: string;
    /**
     * Duration in milliseconds that driver was on duty during the requested time range
     * @type {number}
     * @memberof DriversSummaryResponseSummaries
     */
    onDutyMs?: number;
}

/**
 * 
 * @export
 * @interface DvirBase
 */
export interface DvirBase {
    /**
     * 
     * @type {DvirBaseAuthorSignature}
     * @memberof DvirBase
     */
    authorSignature?: DvirBaseAuthorSignature;
    /**
     * Signifies if the defects on the vehicle corrected after the DVIR is done.
     * @type {boolean}
     * @memberof DvirBase
     */
    defectsCorrected?: boolean;
    /**
     * Signifies if the defects on this vehicle can be ignored.
     * @type {boolean}
     * @memberof DvirBase
     */
    defectsNeedNotBeCorrected?: boolean;
    /**
     * The id of this DVIR record.
     * @type {number}
     * @memberof DvirBase
     */
    id?: number;
    /**
     * Inspection type of the DVIR.
     * @type {string}
     * @memberof DvirBase
     */
    inspectionType?: string;
    /**
     * The mechanics notes on the DVIR.
     * @type {string}
     * @memberof DvirBase
     */
    mechanicNotes?: string;
    /**
     * 
     * @type {DvirBaseMechanicOrAgentSignature}
     * @memberof DvirBase
     */
    mechanicOrAgentSignature?: DvirBaseMechanicOrAgentSignature;
    /**
     * 
     * @type {DvirBaseNextDriverSignature}
     * @memberof DvirBase
     */
    nextDriverSignature?: DvirBaseNextDriverSignature;
    /**
     * The odometer reading in miles for the vehicle when the DVIR was done.
     * @type {number}
     * @memberof DvirBase
     */
    odometerMiles?: number;
    /**
     * Timestamp of this DVIR in UNIX milliseconds.
     * @type {number}
     * @memberof DvirBase
     */
    timeMs?: number;
    /**
     * Defects registered for the trailer which was part of the DVIR.
     * @type {Array<DvirBaseTrailerDefects>}
     * @memberof DvirBase
     */
    trailerDefects?: Array<DvirBaseTrailerDefects>;
    /**
     * The id of the trailer which was part of the DVIR.
     * @type {number}
     * @memberof DvirBase
     */
    trailerId?: number;
    /**
     * The name of the trailer which was part of the DVIR.
     * @type {string}
     * @memberof DvirBase
     */
    trailerName?: string;
    /**
     * 
     * @type {DvirBaseVehicle}
     * @memberof DvirBase
     */
    vehicle?: DvirBaseVehicle;
    /**
     * The condition of vechile on which DVIR was done.
     * @type {string}
     * @memberof DvirBase
     */
    vehicleCondition?: string;
    /**
     * Defects registered for the vehicle which was part of the DVIR.
     * @type {Array<DvirBaseTrailerDefects>}
     * @memberof DvirBase
     */
    vehicleDefects?: Array<DvirBaseTrailerDefects>;
}

/**
 * The authors signature for the DVIR.
 * @export
 * @interface DvirBaseAuthorSignature
 */
export interface DvirBaseAuthorSignature {
    /**
     * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
     * @type {number}
     * @memberof DvirBaseAuthorSignature
     */
    mechanicUserId?: number;
    /**
     * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
     * @type {number}
     * @memberof DvirBaseAuthorSignature
     */
    driverId?: number;
    /**
     * The name of the driver or mechanic who signed the DVIR.
     * @type {string}
     * @memberof DvirBaseAuthorSignature
     */
    name?: string;
    /**
     * The time in millis when the DVIR was signed
     * @type {number}
     * @memberof DvirBaseAuthorSignature
     */
    signedAt?: number;
    /**
     * Type corresponds to whether the signature corresponds to driver|mechanic.
     * @type {string}
     * @memberof DvirBaseAuthorSignature
     */
    type?: string;
    /**
     * Email of the  driver|mechanic who signed the DVIR.
     * @type {string}
     * @memberof DvirBaseAuthorSignature
     */
    email?: string;
    /**
     * Username of the  driver|mechanic who signed the DVIR.
     * @type {string}
     * @memberof DvirBaseAuthorSignature
     */
    username?: string;
}

/**
 * The mechanic's or agent's signature for the DVIR.
 * @export
 * @interface DvirBaseMechanicOrAgentSignature
 */
export interface DvirBaseMechanicOrAgentSignature {
    /**
     * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
     * @type {number}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    mechanicUserId?: number;
    /**
     * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
     * @type {number}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    driverId?: number;
    /**
     * The name of the agent or mechanic who signed the DVIR.
     * @type {string}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    name?: string;
    /**
     * The time in millis when the DVIR was signed
     * @type {number}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    signedAt?: number;
    /**
     * Type corresponds to whether the signature corresponds to driver|mechanic.
     * @type {string}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    type?: string;
    /**
     * Email of the  agent|mechanic who signed the DVIR.
     * @type {string}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    email?: string;
    /**
     * Username of the  agent|mechanic who signed the DVIR.
     * @type {string}
     * @memberof DvirBaseMechanicOrAgentSignature
     */
    username?: string;
}

/**
 * The next driver signature for the DVIR.
 * @export
 * @interface DvirBaseNextDriverSignature
 */
export interface DvirBaseNextDriverSignature {
    /**
     * ID of the driver who signed the DVIR
     * @type {number}
     * @memberof DvirBaseNextDriverSignature
     */
    driverId?: number;
    /**
     * The name of the driver who signed the next DVIR on this vehicle.
     * @type {string}
     * @memberof DvirBaseNextDriverSignature
     */
    name?: string;
    /**
     * The time in millis when the next driver signed the DVIR on this vehicle.
     * @type {number}
     * @memberof DvirBaseNextDriverSignature
     */
    signedAt?: number;
    /**
     * Type corresponds to driver.
     * @type {string}
     * @memberof DvirBaseNextDriverSignature
     */
    type?: string;
    /**
     * Email of the  driver who signed the next DVIR on this vehicle.
     * @type {string}
     * @memberof DvirBaseNextDriverSignature
     */
    email?: string;
    /**
     * Username of the  driver who signed the next DVIR on this vehicle.
     * @type {string}
     * @memberof DvirBaseNextDriverSignature
     */
    username?: string;
}

/**
 * 
 * @export
 * @interface DvirBaseTrailerDefects
 */
export interface DvirBaseTrailerDefects {
    /**
     * The comment describing the type of DVIR defect
     * @type {string}
     * @memberof DvirBaseTrailerDefects
     */
    comment?: string;
    /**
     * The type of DVIR defect
     * @type {string}
     * @memberof DvirBaseTrailerDefects
     */
    defectType?: string;
}

/**
 * The vehicle on which DVIR was done.
 * @export
 * @interface DvirBaseVehicle
 */
export interface DvirBaseVehicle {
    /**
     * The vehicle on which DVIR was done.
     * @type {string}
     * @memberof DvirBaseVehicle
     */
    name?: string;
    /**
     * The vehicle id on which DVIR was done.
     * @type {number}
     * @memberof DvirBaseVehicle
     */
    id?: number;
}

/**
 * 
 * @export
 * @interface DvirListResponse
 */
export interface DvirListResponse {
    /**
     * 
     * @type {Array<DvirBase>}
     * @memberof DvirListResponse
     */
    dvirs?: Array<DvirBase>;
}

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 * @export
 * @interface EngineState
 */
export interface EngineState {
    /**
     * Timestamp in Unix epoch milliseconds.
     * @type {any}
     * @memberof EngineState
     */
    timeMs: any;
    /**
     * 
     * @type {string}
     * @memberof EngineState
     */
    value: EngineState.ValueEnum;
}

/**
 * @export
 * @namespace EngineState
 */
export namespace EngineState {
    /**
     * @export
     * @enum {string}
     */
    export enum ValueEnum {
        Running = 'Running',
        Off = 'Off',
        Idle = 'Idle'
    }
}

/**
 * Contains the location and speed of a vehicle at a particular time
 * @export
 * @interface FleetVehicleLocation
 */
export interface FleetVehicleLocation {
    /**
     * The latitude of the location in degrees.
     * @type {number}
     * @memberof FleetVehicleLocation
     */
    latitude?: number;
    /**
     * The best effort (street,city,state) for the latitude and longitude.
     * @type {string}
     * @memberof FleetVehicleLocation
     */
    location?: string;
    /**
     * The longitude of the location in degrees.
     * @type {number}
     * @memberof FleetVehicleLocation
     */
    longitude?: number;
    /**
     * The speed calculated from GPS that the asset was traveling at in miles per hour.
     * @type {number}
     * @memberof FleetVehicleLocation
     */
    speedMilesPerHour?: number;
    /**
     * Time in Unix milliseconds since epoch when the asset was at the location.
     * @type {number}
     * @memberof FleetVehicleLocation
     */
    timeMs?: number;
}

/**
 * A vehicle object as returned for fleet/vehicle
 * @export
 * @interface FleetVehicleResponse
 */
export interface FleetVehicleResponse {
    /**
     * 
     * @type {{ [key: string]: string; }}
     * @memberof FleetVehicleResponse
     */
    externalIds?: { [key: string]: string; };
    /**
     * Harsh event detection setting.
     * @type {string}
     * @memberof FleetVehicleResponse
     */
    harshAccelSetting?: string;
    /**
     * ID of the vehicle.
     * @type {number}
     * @memberof FleetVehicleResponse
     */
    id: number;
    /**
     * Name of the vehicle.
     * @type {string}
     * @memberof FleetVehicleResponse
     */
    name: string;
    /**
     * 
     * @type {FleetVehicleResponseVehicleInfo}
     * @memberof FleetVehicleResponse
     */
    vehicleInfo?: FleetVehicleResponseVehicleInfo;
}

/**
 * 
 * @export
 * @interface FleetVehicleResponseVehicleInfo
 */
export interface FleetVehicleResponseVehicleInfo {
    /**
     * Year of the vehicle.
     * @type {number}
     * @memberof FleetVehicleResponseVehicleInfo
     */
    year?: number;
    /**
     * Model of the Vehicle.
     * @type {string}
     * @memberof FleetVehicleResponseVehicleInfo
     */
    model?: string;
    /**
     * Vehicle Identification Number.
     * @type {string}
     * @memberof FleetVehicleResponseVehicleInfo
     */
    vin?: string;
    /**
     * Make of the vehicle.
     * @type {string}
     * @memberof FleetVehicleResponseVehicleInfo
     */
    make?: string;
}

/**
 * 
 * @export
 * @interface HosAuthenticationLogsResponse
 */
export interface HosAuthenticationLogsResponse {
    /**
     * 
     * @type {Array<HosAuthenticationLogsResponseAuthenticationLogs>}
     * @memberof HosAuthenticationLogsResponse
     */
    authenticationLogs?: Array<HosAuthenticationLogsResponseAuthenticationLogs>;
}

/**
 * 
 * @export
 * @interface HosAuthenticationLogsResponseAuthenticationLogs
 */
export interface HosAuthenticationLogsResponseAuthenticationLogs {
    /**
     * The log type - one of 'signin' or 'signout'
     * @type {string}
     * @memberof HosAuthenticationLogsResponseAuthenticationLogs
     */
    actionType?: string;
    /**
     * Address at which the log was recorded, if applicable.
     * @type {string}
     * @memberof HosAuthenticationLogsResponseAuthenticationLogs
     */
    address?: string;
    /**
     * City in which the log was recorded, if applicable.
     * @type {string}
     * @memberof HosAuthenticationLogsResponseAuthenticationLogs
     */
    city?: string;
    /**
     * The time at which the event was recorded in UNIX milliseconds.
     * @type {number}
     * @memberof HosAuthenticationLogsResponseAuthenticationLogs
     */
    happenedAtMs?: number;
    /**
     * Address name from the group address book at which the log was recorded, if applicable.
     * @type {string}
     * @memberof HosAuthenticationLogsResponseAuthenticationLogs
     */
    addressName?: string;
    /**
     * State in which the log was recorded, if applicable.
     * @type {string}
     * @memberof HosAuthenticationLogsResponseAuthenticationLogs
     */
    state?: string;
}

/**
 * 
 * @export
 * @interface HosLogsResponse
 */
export interface HosLogsResponse {
    /**
     * 
     * @type {Array<HosLogsResponseLogs>}
     * @memberof HosLogsResponse
     */
    logs?: Array<HosLogsResponseLogs>;
}

/**
 * 
 * @export
 * @interface HosLogsResponseLogs
 */
export interface HosLogsResponseLogs {
    /**
     * Longitude at which the log was recorded.
     * @type {number}
     * @memberof HosLogsResponseLogs
     */
    locLng?: number;
    /**
     * The time at which the log/HOS status started in UNIX milliseconds.
     * @type {number}
     * @memberof HosLogsResponseLogs
     */
    logStartMs?: number;
    /**
     * ID of the driver.
     * @type {number}
     * @memberof HosLogsResponseLogs
     */
    driverId?: number;
    /**
     * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     * @type {string}
     * @memberof HosLogsResponseLogs
     */
    statusType?: string;
    /**
     * City in which the log was recorded.
     * @type {string}
     * @memberof HosLogsResponseLogs
     */
    locCity?: string;
    /**
     * ID of the group.
     * @type {number}
     * @memberof HosLogsResponseLogs
     */
    groupId?: number;
    /**
     * Name of location at which the log was recorded.
     * @type {string}
     * @memberof HosLogsResponseLogs
     */
    locName?: string;
    /**
     * Latitude at which the log was recorded.
     * @type {number}
     * @memberof HosLogsResponseLogs
     */
    locLat?: number;
    /**
     * Remark associated with the log entry.
     * @type {string}
     * @memberof HosLogsResponseLogs
     */
    remark?: string;
    /**
     * State in which the log was recorded.
     * @type {string}
     * @memberof HosLogsResponseLogs
     */
    locState?: string;
    /**
     * ID of the vehicle.
     * @type {number}
     * @memberof HosLogsResponseLogs
     */
    vehicleId?: number;
    /**
     * 
     * @type {Array<number>}
     * @memberof HosLogsResponseLogs
     */
    codriverIds?: Array<number>;
}

/**
 * 
 * @export
 * @interface HosLogsSummaryResponse
 */
export interface HosLogsSummaryResponse {
    /**
     * 
     * @type {Array<HosLogsSummaryResponseDrivers>}
     * @memberof HosLogsSummaryResponse
     */
    drivers?: Array<HosLogsSummaryResponseDrivers>;
}

/**
 * 
 * @export
 * @interface HosLogsSummaryResponseDrivers
 */
export interface HosLogsSummaryResponseDrivers {
    /**
     * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    timeUntilBreak?: number;
    /**
     * Name of the vehicle.
     * @type {string}
     * @memberof HosLogsSummaryResponseDrivers
     */
    vehicleName?: string;
    /**
     * The amount of driving time in violation today (in ms).
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    drivingInViolationToday?: number;
    /**
     * ID of the driver.
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    driverId?: number;
    /**
     * The amount of remaining cycle time (in ms).
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    cycleRemaining?: number;
    /**
     * Name of the driver.
     * @type {string}
     * @memberof HosLogsSummaryResponseDrivers
     */
    driverName?: string;
    /**
     * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     * @type {string}
     * @memberof HosLogsSummaryResponseDrivers
     */
    dutyStatus?: string;
    /**
     * The amount of cycle time (in ms) available tomorrow.
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    cycleTomorrow?: number;
    /**
     * The amount of remaining shift drive time (in ms).
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    shiftDriveRemaining?: number;
    /**
     * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    timeInCurrentStatus?: number;
    /**
     * The amount of driving time in violation in this cycle (in ms).
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    drivingInViolationCycle?: number;
    /**
     * The amount of remaining shift time (in ms).
     * @type {number}
     * @memberof HosLogsSummaryResponseDrivers
     */
    shiftRemaining?: number;
}

/**
 * Contains the current humidity of a sensor.
 * @export
 * @interface HumidityResponse
 */
export interface HumidityResponse {
    /**
     * 
     * @type {number}
     * @memberof HumidityResponse
     */
    groupId?: number;
    /**
     * 
     * @type {Array<HumidityResponseSensors>}
     * @memberof HumidityResponse
     */
    sensors?: Array<HumidityResponseSensors>;
}

/**
 * 
 * @export
 * @interface HumidityResponseSensors
 */
export interface HumidityResponseSensors {
    /**
     * Name of the sensor.
     * @type {string}
     * @memberof HumidityResponseSensors
     */
    name?: string;
    /**
     * Currently reported relative humidity in percent, from 0-100.
     * @type {number}
     * @memberof HumidityResponseSensors
     */
    humidity?: number;
    /**
     * ID of the sensor.
     * @type {number}
     * @memberof HumidityResponseSensors
     */
    id?: number;
}

/**
 * 
 * @export
 * @interface InlineObject
 */
export interface InlineObject {
    /**
     * 
     * @type {Array<AddressesAddresses>}
     * @memberof InlineObject
     */
    addresses: Array<AddressesAddresses>;
}

/**
 * 
 * @export
 * @interface InlineObject1
 */
export interface InlineObject1 {
    /**
     * A list of IDs for contact book entries.
     * @type {Array<number>}
     * @memberof InlineObject1
     */
    contactIds?: Array<number>;
    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     * @type {string}
     * @memberof InlineObject1
     */
    formattedAddress?: string;
    /**
     * 
     * @type {AddressGeofence}
     * @memberof InlineObject1
     */
    geofence?: AddressGeofence;
    /**
     * The name of this address/geofence
     * @type {string}
     * @memberof InlineObject1
     */
    name?: string;
    /**
     * Notes associated with an address.
     * @type {string}
     * @memberof InlineObject1
     */
    notes?: string;
    /**
     * A list of tag IDs.
     * @type {Array<number>}
     * @memberof InlineObject1
     */
    tagIds?: Array<number>;
}

/**
 * 
 * @export
 * @interface InlineObject10
 */
export interface InlineObject10 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject10
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineObject11
 */
export interface InlineObject11 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject11
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineObject12
 */
export interface InlineObject12 {
    /**
     * Only type 'mechanic' is currently accepted.
     * @type {string}
     * @memberof InlineObject12
     */
    inspectionType: InlineObject12.InspectionTypeEnum;
    /**
     * Any notes from the mechanic.
     * @type {string}
     * @memberof InlineObject12
     */
    mechanicNotes?: string;
    /**
     * The current odometer of the vehicle.
     * @type {number}
     * @memberof InlineObject12
     */
    odometerMiles?: number;
    /**
     * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
     * @type {boolean}
     * @memberof InlineObject12
     */
    previousDefectsCorrected?: boolean;
    /**
     * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
     * @type {boolean}
     * @memberof InlineObject12
     */
    previousDefectsIgnored?: boolean;
    /**
     * Whether or not this vehicle or trailer is safe to drive.
     * @type {string}
     * @memberof InlineObject12
     */
    safe: InlineObject12.SafeEnum;
    /**
     * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
     * @type {number}
     * @memberof InlineObject12
     */
    trailerId?: number;
    /**
     * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
     * @type {string}
     * @memberof InlineObject12
     */
    userEmail: string;
    /**
     * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
     * @type {number}
     * @memberof InlineObject12
     */
    vehicleId?: number;
}

/**
 * @export
 * @namespace InlineObject12
 */
export namespace InlineObject12 {
    /**
     * @export
     * @enum {string}
     */
    export enum InspectionTypeEnum {
        Mechanic = 'mechanic'
    }
    /**
     * @export
     * @enum {string}
     */
    export enum SafeEnum {
        Safe = 'safe',
        Unsafe = 'unsafe'
    }
}

/**
 * 
 * @export
 * @interface InlineObject13
 */
export interface InlineObject13 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject13
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineObject14
 */
export interface InlineObject14 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject14
     */
    groupId: number;
    /**
     * 
     * @type {Array<Vehicle>}
     * @memberof InlineObject14
     */
    vehicles: Array<Vehicle>;
}

/**
 * 
 * @export
 * @interface InlineObject15
 */
export interface InlineObject15 {
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject15
     */
    endMs: number;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject15
     */
    groupId: number;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
     * @type {number}
     * @memberof InlineObject15
     */
    startMs: number;
    /**
     * Vehicle ID to query.
     * @type {number}
     * @memberof InlineObject15
     */
    vehicleId: number;
}

/**
 * 
 * @export
 * @interface InlineObject16
 */
export interface InlineObject16 {
    /**
     * 
     * @type {{ [key: string]: string; }}
     * @memberof InlineObject16
     */
    externalIds?: { [key: string]: string; };
    /**
     * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
     * @type {number}
     * @memberof InlineObject16
     */
    harshAccelSetting?: number;
    /**
     * Name
     * @type {string}
     * @memberof InlineObject16
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface InlineObject17
 */
export interface InlineObject17 {
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject17
     */
    endMs: number;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject17
     */
    groupId: number;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject17
     */
    startMs: number;
}

/**
 * 
 * @export
 * @interface InlineObject18
 */
export interface InlineObject18 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject18
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineObject19
 */
export interface InlineObject19 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject19
     */
    groupId: number;
    /**
     * List of sensor IDs to query.
     * @type {Array<number>}
     * @memberof InlineObject19
     */
    sensors: Array<number>;
}

/**
 * 
 * @export
 * @interface InlineObject2
 */
export interface InlineObject2 {
    /**
     * The address of the entry to add, as it would be recognized if provided to maps.google.com.
     * @type {string}
     * @memberof InlineObject2
     */
    address: string;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject2
     */
    groupId: number;
    /**
     * Name of the location to add to the address book.
     * @type {string}
     * @memberof InlineObject2
     */
    name: string;
    /**
     * Radius in meters of the address (used for matching vehicle trip stops to this location).
     * @type {number}
     * @memberof InlineObject2
     */
    radius: number;
}

/**
 * 
 * @export
 * @interface InlineObject20
 */
export interface InlineObject20 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject20
     */
    groupId: number;
    /**
     * List of sensor IDs to query.
     * @type {Array<number>}
     * @memberof InlineObject20
     */
    sensors: Array<number>;
}

/**
 * 
 * @export
 * @interface InlineObject21
 */
export interface InlineObject21 {
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject21
     */
    endMs: number;
    /**
     * 
     * @type {string}
     * @memberof InlineObject21
     */
    fillMissing?: InlineObject21.FillMissingEnum;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject21
     */
    groupId: number;
    /**
     * 
     * @type {Array<SensorsHistorySeries>}
     * @memberof InlineObject21
     */
    series: Array<SensorsHistorySeries>;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject21
     */
    startMs: number;
    /**
     * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
     * @type {number}
     * @memberof InlineObject21
     */
    stepMs: number;
}

/**
 * @export
 * @namespace InlineObject21
 */
export namespace InlineObject21 {
    /**
     * @export
     * @enum {string}
     */
    export enum FillMissingEnum {
        WithNull = 'withNull',
        WithPrevious = 'withPrevious'
    }
}

/**
 * 
 * @export
 * @interface InlineObject22
 */
export interface InlineObject22 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject22
     */
    groupId: number;
    /**
     * List of sensor IDs to query.
     * @type {Array<number>}
     * @memberof InlineObject22
     */
    sensors: Array<number>;
}

/**
 * 
 * @export
 * @interface InlineObject23
 */
export interface InlineObject23 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject23
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineObject24
 */
export interface InlineObject24 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject24
     */
    groupId: number;
    /**
     * List of sensor IDs to query.
     * @type {Array<number>}
     * @memberof InlineObject24
     */
    sensors: Array<number>;
}

/**
 * 
 * @export
 * @interface InlineObject3
 */
export interface InlineObject3 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject3
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineObject4
 */
export interface InlineObject4 {
    /**
     * True indicates that this driver should be reactivated.
     * @type {boolean}
     * @memberof InlineObject4
     */
    reactivate: boolean;
}

/**
 * 
 * @export
 * @interface InlineObject5
 */
export interface InlineObject5 {
    /**
     * End time (ms) of queried time period.
     * @type {number}
     * @memberof InlineObject5
     */
    endMs: number;
    /**
     * Org ID to query.
     * @type {number}
     * @memberof InlineObject5
     */
    orgId: number;
    /**
     * Start time (ms) of queried time period.
     * @type {number}
     * @memberof InlineObject5
     */
    startMs: number;
}

/**
 * 
 * @export
 * @interface InlineObject6
 */
export interface InlineObject6 {
    /**
     * Driver ID to query.
     * @type {number}
     * @memberof InlineObject6
     */
    driverId: number;
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject6
     */
    endMs: number;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject6
     */
    groupId: number;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject6
     */
    startMs: number;
}

/**
 * 
 * @export
 * @interface InlineObject7
 */
export interface InlineObject7 {
    /**
     * Driver ID to query.
     * @type {number}
     * @memberof InlineObject7
     */
    driverId: number;
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject7
     */
    endMs: number;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject7
     */
    groupId: number;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject7
     */
    startMs: number;
}

/**
 * 
 * @export
 * @interface InlineObject8
 */
export interface InlineObject8 {
    /**
     * Driver ID to query.
     * @type {number}
     * @memberof InlineObject8
     */
    driverId: number;
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject8
     */
    endMs: number;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject8
     */
    groupId: number;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @type {number}
     * @memberof InlineObject8
     */
    startMs: number;
}

/**
 * 
 * @export
 * @interface InlineObject9
 */
export interface InlineObject9 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject9
     */
    groupId: number;
}

/**
 * 
 * @export
 * @interface InlineResponse200
 */
export interface InlineResponse200 {
    /**
     * 
     * @type {Array<Asset>}
     * @memberof InlineResponse200
     */
    assets?: Array<Asset>;
}

/**
 * 
 * @export
 * @interface InlineResponse2001
 */
export interface InlineResponse2001 {
    /**
     * 
     * @type {Array<AssetCurrentLocationsResponse>}
     * @memberof InlineResponse2001
     */
    assets?: Array<AssetCurrentLocationsResponse>;
}

/**
 * 
 * @export
 * @interface InlineResponse2002
 */
export interface InlineResponse2002 {
    /**
     * 
     * @type {Pagination}
     * @memberof InlineResponse2002
     */
    pagination?: Pagination;
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineResponse2002
     */
    groupId?: number;
    /**
     * 
     * @type {Array<Vehicle>}
     * @memberof InlineResponse2002
     */
    vehicles?: Array<Vehicle>;
}

/**
 * 
 * @export
 * @interface InlineResponse2003
 */
export interface InlineResponse2003 {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineResponse2003
     */
    groupId?: number;
    /**
     * 
     * @type {Array<VehicleLocation>}
     * @memberof InlineResponse2003
     */
    vehicles?: Array<VehicleLocation>;
}

/**
 * 
 * @export
 * @interface InlineResponse2004
 */
export interface InlineResponse2004 {
    /**
     * 
     * @type {Array<VehicleMaintenance>}
     * @memberof InlineResponse2004
     */
    vehicles?: Array<VehicleMaintenance>;
}

/**
 * 
 * @export
 * @interface InlineResponse2005
 */
export interface InlineResponse2005 {
    /**
     * 
     * @type {Pagination}
     * @memberof InlineResponse2005
     */
    pagination?: Pagination;
    /**
     * 
     * @type {Array<InlineResponse2005VehicleStats>}
     * @memberof InlineResponse2005
     */
    vehicleStats: Array<InlineResponse2005VehicleStats>;
}

/**
 * 
 * @export
 * @interface InlineResponse2005VehicleStats
 */
export interface InlineResponse2005VehicleStats {
    /**
     * 
     * @type {Array<EngineState>}
     * @memberof InlineResponse2005VehicleStats
     */
    engineState?: Array<EngineState>;
    /**
     * 
     * @type {AuxInputSeries}
     * @memberof InlineResponse2005VehicleStats
     */
    auxInput2?: AuxInputSeries;
    /**
     * ID of the vehicle.
     * @type {number}
     * @memberof InlineResponse2005VehicleStats
     */
    vehicleId: number;
    /**
     * 
     * @type {AuxInputSeries}
     * @memberof InlineResponse2005VehicleStats
     */
    auxInput1?: AuxInputSeries;
}

/**
 * 
 * @export
 * @interface InlineResponse2006
 */
export interface InlineResponse2006 {
    /**
     * 
     * @type {Array<DataInputHistoryResponse>}
     * @memberof InlineResponse2006
     */
    dataInputs?: Array<DataInputHistoryResponse>;
}

/**
 * 
 * @export
 * @interface InlineResponse2007
 */
export interface InlineResponse2007 {
    /**
     * 
     * @type {Array<Machine>}
     * @memberof InlineResponse2007
     */
    machines?: Array<Machine>;
}

/**
 * 
 * @export
 * @interface InlineResponse2008
 */
export interface InlineResponse2008 {
    /**
     * 
     * @type {Array<Sensor>}
     * @memberof InlineResponse2008
     */
    sensors?: Array<Sensor>;
}

/**
 * 
 * @export
 * @interface InlineResponse2009
 */
export interface InlineResponse2009 {
    /**
     * 
     * @type {Array<Tag>}
     * @memberof InlineResponse2009
     */
    tags?: Array<Tag>;
}

/**
 * The current state of the dispatch job.
 * @export
 * @enum {string}
 */
export enum JobStatus {
    Unassigned = 'JobState_Unassigned',
    Scheduled = 'JobState_Scheduled',
    EnRoute = 'JobState_EnRoute',
    Arrived = 'JobState_Arrived',
    Completed = 'JobState_Completed',
    Skipped = 'JobState_Skipped'
}

/**
 * 
 * @export
 * @interface JobUpdateObject
 */
export interface JobUpdateObject {
    /**
     * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
     * @type {number}
     * @memberof JobUpdateObject
     */
    changedAtMs?: number;
    /**
     * ID of the Samsara job.
     * @type {number}
     * @memberof JobUpdateObject
     */
    jobId?: number;
    /**
     * 
     * @type {JobStatus}
     * @memberof JobUpdateObject
     */
    jobState?: JobStatus;
    /**
     * 
     * @type {PrevJobStatus}
     * @memberof JobUpdateObject
     */
    prevJobState?: PrevJobStatus;
    /**
     * 
     * @type {DispatchRoute}
     * @memberof JobUpdateObject
     */
    route?: DispatchRoute;
    /**
     * ID of the Samsara dispatch route.
     * @type {number}
     * @memberof JobUpdateObject
     */
    routeId?: number;
}

/**
 * Contains information about a machine.
 * @export
 * @interface Machine
 */
export interface Machine {
    /**
     * ID of the machine.
     * @type {number}
     * @memberof Machine
     */
    id: number;
    /**
     * Name of the machine.
     * @type {string}
     * @memberof Machine
     */
    name?: string;
    /**
     * Notes about the machine
     * @type {string}
     * @memberof Machine
     */
    notes?: string;
}

/**
 * Contains the results for a machine history request
 * @export
 * @interface MachineHistoryResponse
 */
export interface MachineHistoryResponse {
    /**
     * 
     * @type {Array<MachineHistoryResponseMachines>}
     * @memberof MachineHistoryResponse
     */
    machines?: Array<MachineHistoryResponseMachines>;
}

/**
 * 
 * @export
 * @interface MachineHistoryResponseMachines
 */
export interface MachineHistoryResponseMachines {
    /**
     * Machine name
     * @type {string}
     * @memberof MachineHistoryResponseMachines
     */
    name?: string;
    /**
     * Machine ID
     * @type {number}
     * @memberof MachineHistoryResponseMachines
     */
    id?: number;
    /**
     * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
     * @type {Array<MachineHistoryResponseVibrations>}
     * @memberof MachineHistoryResponseMachines
     */
    vibrations?: Array<MachineHistoryResponseVibrations>;
}

/**
 * 
 * @export
 * @interface MachineHistoryResponseVibrations
 */
export interface MachineHistoryResponseVibrations {
    /**
     * 
     * @type {number}
     * @memberof MachineHistoryResponseVibrations
     */
    X?: number;
    /**
     * 
     * @type {number}
     * @memberof MachineHistoryResponseVibrations
     */
    Y?: number;
    /**
     * 
     * @type {number}
     * @memberof MachineHistoryResponseVibrations
     */
    Z?: number;
    /**
     * 
     * @type {number}
     * @memberof MachineHistoryResponseVibrations
     */
    time?: number;
}

/**
 * 
 * @export
 * @interface Pagination
 */
export interface Pagination {
    /**
     * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
     * @type {string}
     * @memberof Pagination
     */
    endCursor: string;
    /**
     * True if there are more pages of results after this response.
     * @type {boolean}
     * @memberof Pagination
     */
    hasNextPage: boolean;
    /**
     * True if there are more pages of results before this response.
     * @type {boolean}
     * @memberof Pagination
     */
    hasPrevPage: boolean;
    /**
     * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
     * @type {string}
     * @memberof Pagination
     */
    startCursor: string;
}

/**
 * The previous state of the dispatch job.
 * @export
 * @enum {string}
 */
export enum PrevJobStatus {
    Unassigned = 'JobState_Unassigned',
    Scheduled = 'JobState_Scheduled',
    EnRoute = 'JobState_EnRoute',
    Arrived = 'JobState_Arrived',
    Completed = 'JobState_Completed',
    Skipped = 'JobState_Skipped'
}

/**
 * List of harsh events
 * @export
 * @interface SafetyReportHarshEvent
 */
export interface SafetyReportHarshEvent {
    /**
     * Type of the harsh event
     * @type {string}
     * @memberof SafetyReportHarshEvent
     */
    harshEventType?: string;
    /**
     * Timestamp that the harsh event occurred in Unix milliseconds since epoch
     * @type {number}
     * @memberof SafetyReportHarshEvent
     */
    timestampMs?: number;
    /**
     * Vehicle associated with the harsh event
     * @type {number}
     * @memberof SafetyReportHarshEvent
     */
    vehicleId?: number;
}

/**
 * Contains information about a sensor.
 * @export
 * @interface Sensor
 */
export interface Sensor {
    /**
     * ID of the sensor.
     * @type {number}
     * @memberof Sensor
     */
    id: number;
    /**
     * MAC address of the sensor.
     * @type {string}
     * @memberof Sensor
     */
    macAddress?: string;
    /**
     * Name of the sensor.
     * @type {string}
     * @memberof Sensor
     */
    name?: string;
}

/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 * @export
 * @interface SensorHistoryResponse
 */
export interface SensorHistoryResponse {
    /**
     * 
     * @type {Array<SensorHistoryResponseResults>}
     * @memberof SensorHistoryResponse
     */
    results?: Array<SensorHistoryResponseResults>;
}

/**
 * 
 * @export
 * @interface SensorHistoryResponseResults
 */
export interface SensorHistoryResponseResults {
    /**
     * List of datapoints, one for each requested (sensor, field) pair.
     * @type {Array<number>}
     * @memberof SensorHistoryResponseResults
     */
    series?: Array<number>;
    /**
     * Timestamp in UNIX milliseconds.
     * @type {number}
     * @memberof SensorHistoryResponseResults
     */
    timeMs?: number;
}

/**
 * Sensor ID and field to query.
 * @export
 * @interface SensorsHistorySeries
 */
export interface SensorsHistorySeries {
    /**
     * Field to query.
     * @type {string}
     * @memberof SensorsHistorySeries
     */
    field: SensorsHistorySeries.FieldEnum;
    /**
     * Sensor ID to query.
     * @type {number}
     * @memberof SensorsHistorySeries
     */
    widgetId: number;
}

/**
 * @export
 * @namespace SensorsHistorySeries
 */
export namespace SensorsHistorySeries {
    /**
     * @export
     * @enum {string}
     */
    export enum FieldEnum {
        AmbientTemperature = 'ambientTemperature',
        ProbeTemperature = 'probeTemperature',
        CurrentLoop1Raw = 'currentLoop1Raw',
        CurrentLoop1Mapped = 'currentLoop1Mapped',
        CurrentLoop2Raw = 'currentLoop2Raw',
        CurrentLoop2Mapped = 'currentLoop2Mapped',
        PmPowerTotal = 'pmPowerTotal',
        PmPhase1Power = 'pmPhase1Power',
        PmPhase2Power = 'pmPhase2Power',
        PmPhase3Power = 'pmPhase3Power',
        PmPhase1PowerFactor = 'pmPhase1PowerFactor',
        PmPhase2PowerFactor = 'pmPhase2PowerFactor',
        PmPhase3PowerFactor = 'pmPhase3PowerFactor'
    }
}

/**
 * 
 * @export
 * @interface Tag
 */
export interface Tag {
    /**
     * The addresses that belong to this tag.
     * @type {Array<TaggedAddress>}
     * @memberof Tag
     */
    addresses?: Array<TaggedAddress>;
    /**
     * The assets that belong to this tag.
     * @type {Array<TaggedAsset>}
     * @memberof Tag
     */
    assets?: Array<TaggedAsset>;
    /**
     * The drivers that belong to this tag.
     * @type {Array<TaggedDriver>}
     * @memberof Tag
     */
    drivers?: Array<TaggedDriver>;
    /**
     * The GroupID that this tag belongs to.
     * @type {number}
     * @memberof Tag
     */
    groupId?: number;
    /**
     * The ID of this tag.
     * @type {number}
     * @memberof Tag
     */
    id: number;
    /**
     * The machines that belong to this tag.
     * @type {Array<TaggedMachine>}
     * @memberof Tag
     */
    machines?: Array<TaggedMachine>;
    /**
     * Name of this tag.
     * @type {string}
     * @memberof Tag
     */
    name: string;
    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     * @type {number}
     * @memberof Tag
     */
    parentTagId?: number;
    /**
     * The sensors that belong to this tag.
     * @type {Array<TaggedSensor>}
     * @memberof Tag
     */
    sensors?: Array<TaggedSensor>;
    /**
     * The vehicles that belong to this tag.
     * @type {Array<TaggedVehicle>}
     * @memberof Tag
     */
    vehicles?: Array<TaggedVehicle>;
}

/**
 * 
 * @export
 * @interface TagCreate
 */
export interface TagCreate {
    /**
     * The assets that belong to this tag.
     * @type {Array<TaggedAssetBase>}
     * @memberof TagCreate
     */
    assets?: Array<TaggedAssetBase>;
    /**
     * The drivers that belong to this tag.
     * @type {Array<TaggedDriverBase>}
     * @memberof TagCreate
     */
    drivers?: Array<TaggedDriverBase>;
    /**
     * The machines that belong to this tag.
     * @type {Array<TaggedMachineBase>}
     * @memberof TagCreate
     */
    machines?: Array<TaggedMachineBase>;
    /**
     * Name of this tag.
     * @type {string}
     * @memberof TagCreate
     */
    name: string;
    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     * @type {number}
     * @memberof TagCreate
     */
    parentTagId?: number;
    /**
     * The sensors that belong to this tag.
     * @type {Array<TaggedSensorBase>}
     * @memberof TagCreate
     */
    sensors?: Array<TaggedSensorBase>;
    /**
     * The vehicles that belong to this tag.
     * @type {Array<TaggedVehicleBase>}
     * @memberof TagCreate
     */
    vehicles?: Array<TaggedVehicleBase>;
}

/**
 * 
 * @export
 * @interface TagMetadata
 */
export interface TagMetadata {
    /**
     * The ID of this tag.
     * @type {number}
     * @memberof TagMetadata
     */
    id: number;
    /**
     * Name of this tag.
     * @type {string}
     * @memberof TagMetadata
     */
    name: string;
}

/**
 * 
 * @export
 * @interface TagModify
 */
export interface TagModify {
    /**
     * 
     * @type {TagModifyAdd}
     * @memberof TagModify
     */
    add?: TagModifyAdd;
    /**
     * 
     * @type {TagModifyDelete}
     * @memberof TagModify
     */
    _delete?: TagModifyDelete;
    /**
     * Updated name of this tag.
     * @type {string}
     * @memberof TagModify
     */
    name?: string;
    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     * @type {number}
     * @memberof TagModify
     */
    parentTagId?: number;
}

/**
 * Specify devices, etc. that should be added to the tag.
 * @export
 * @interface TagModifyAdd
 */
export interface TagModifyAdd {
    /**
     * The assets to be added to this tag.
     * @type {Array<TaggedAssetBase>}
     * @memberof TagModifyAdd
     */
    assets?: Array<TaggedAssetBase>;
    /**
     * The sensors to be added to this tag.
     * @type {Array<TaggedSensorBase>}
     * @memberof TagModifyAdd
     */
    sensors?: Array<TaggedSensorBase>;
    /**
     * The vehicles to be added to this tag.
     * @type {Array<TaggedVehicleBase>}
     * @memberof TagModifyAdd
     */
    vehicles?: Array<TaggedVehicleBase>;
    /**
     * The machines to be added to this tag.
     * @type {Array<TaggedMachineBase>}
     * @memberof TagModifyAdd
     */
    machines?: Array<TaggedMachineBase>;
    /**
     * The drivers to be added to this tag.
     * @type {Array<TaggedDriverBase>}
     * @memberof TagModifyAdd
     */
    drivers?: Array<TaggedDriverBase>;
}

/**
 * Specify devices, etc. that should be removed from the tag.
 * @export
 * @interface TagModifyDelete
 */
export interface TagModifyDelete {
    /**
     * The assets to be removed from this tag.
     * @type {Array<TaggedAssetBase>}
     * @memberof TagModifyDelete
     */
    assets?: Array<TaggedAssetBase>;
    /**
     * The sensors to be removed from this tag.
     * @type {Array<TaggedSensorBase>}
     * @memberof TagModifyDelete
     */
    sensors?: Array<TaggedSensorBase>;
    /**
     * The vehicles to be removed from this tag.
     * @type {Array<TaggedVehicleBase>}
     * @memberof TagModifyDelete
     */
    vehicles?: Array<TaggedVehicleBase>;
    /**
     * The machines to be removed from this tag.
     * @type {Array<TaggedMachineBase>}
     * @memberof TagModifyDelete
     */
    machines?: Array<TaggedMachineBase>;
    /**
     * The drivers to be removed from this tag.
     * @type {Array<TaggedDriverBase>}
     * @memberof TagModifyDelete
     */
    drivers?: Array<TaggedDriverBase>;
}

/**
 * 
 * @export
 * @interface TagUpdate
 */
export interface TagUpdate {
    /**
     * The assets that belong to this tag.
     * @type {Array<TaggedAssetBase>}
     * @memberof TagUpdate
     */
    assets?: Array<TaggedAssetBase>;
    /**
     * The drivers that belong to this tag.
     * @type {Array<TaggedDriverBase>}
     * @memberof TagUpdate
     */
    drivers?: Array<TaggedDriverBase>;
    /**
     * The machines that belong to this tag.
     * @type {Array<TaggedMachineBase>}
     * @memberof TagUpdate
     */
    machines?: Array<TaggedMachineBase>;
    /**
     * Updated name of this tag.
     * @type {string}
     * @memberof TagUpdate
     */
    name?: string;
    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     * @type {number}
     * @memberof TagUpdate
     */
    parentTagId?: number;
    /**
     * The sensors that belong to this tag.
     * @type {Array<TaggedSensorBase>}
     * @memberof TagUpdate
     */
    sensors?: Array<TaggedSensorBase>;
    /**
     * The vehicles that belong to this tag.
     * @type {Array<TaggedVehicleBase>}
     * @memberof TagUpdate
     */
    vehicles?: Array<TaggedVehicleBase>;
}

/**
 * 
 * @export
 * @interface TaggedAddress
 */
export interface TaggedAddress {
    /**
     * The ID of the address being tagged.
     * @type {number}
     * @memberof TaggedAddress
     */
    id: number;
    /**
     * Name of the address being tagged.
     * @type {string}
     * @memberof TaggedAddress
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface TaggedAddressBase
 */
export interface TaggedAddressBase {
    /**
     * The ID of the address being tagged.
     * @type {number}
     * @memberof TaggedAddressBase
     */
    id: number;
}

/**
 * 
 * @export
 * @interface TaggedAsset
 */
export interface TaggedAsset {
    /**
     * The ID of the Asset being tagged.
     * @type {number}
     * @memberof TaggedAsset
     */
    id: number;
    /**
     * Name of the Asset being tagged.
     * @type {string}
     * @memberof TaggedAsset
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface TaggedAssetBase
 */
export interface TaggedAssetBase {
    /**
     * The ID of the Asset being tagged.
     * @type {number}
     * @memberof TaggedAssetBase
     */
    id: number;
}

/**
 * 
 * @export
 * @interface TaggedDriver
 */
export interface TaggedDriver {
    /**
     * The ID of the Driver being tagged.
     * @type {number}
     * @memberof TaggedDriver
     */
    id: number;
    /**
     * Name of the Driver being tagged.
     * @type {string}
     * @memberof TaggedDriver
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface TaggedDriverBase
 */
export interface TaggedDriverBase {
    /**
     * The ID of the Driver being tagged.
     * @type {number}
     * @memberof TaggedDriverBase
     */
    id: number;
}

/**
 * 
 * @export
 * @interface TaggedMachine
 */
export interface TaggedMachine {
    /**
     * The ID of the Machine being tagged.
     * @type {number}
     * @memberof TaggedMachine
     */
    id: number;
    /**
     * Name of the Machine being tagged.
     * @type {string}
     * @memberof TaggedMachine
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface TaggedMachineBase
 */
export interface TaggedMachineBase {
    /**
     * The ID of the Machine being tagged.
     * @type {number}
     * @memberof TaggedMachineBase
     */
    id: number;
}

/**
 * 
 * @export
 * @interface TaggedSensor
 */
export interface TaggedSensor {
    /**
     * The ID of the Sensor being tagged.
     * @type {number}
     * @memberof TaggedSensor
     */
    id: number;
    /**
     * Name of the Sensor being tagged.
     * @type {string}
     * @memberof TaggedSensor
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface TaggedSensorBase
 */
export interface TaggedSensorBase {
    /**
     * The ID of the Sensor being tagged.
     * @type {number}
     * @memberof TaggedSensorBase
     */
    id: number;
}

/**
 * 
 * @export
 * @interface TaggedVehicle
 */
export interface TaggedVehicle {
    /**
     * The ID of the Vehicle being tagged.
     * @type {number}
     * @memberof TaggedVehicle
     */
    id: number;
    /**
     * Name of the Vehicle being tagged.
     * @type {string}
     * @memberof TaggedVehicle
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface TaggedVehicleBase
 */
export interface TaggedVehicleBase {
    /**
     * The ID of the Vehicle being tagged.
     * @type {number}
     * @memberof TaggedVehicleBase
     */
    id: number;
}

/**
 * Contains the current temperatures of a sensor.
 * @export
 * @interface TemperatureResponse
 */
export interface TemperatureResponse {
    /**
     * 
     * @type {number}
     * @memberof TemperatureResponse
     */
    groupId?: number;
    /**
     * 
     * @type {Array<TemperatureResponseSensors>}
     * @memberof TemperatureResponse
     */
    sensors?: Array<TemperatureResponseSensors>;
}

/**
 * 
 * @export
 * @interface TemperatureResponseSensors
 */
export interface TemperatureResponseSensors {
    /**
     * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
     * @type {number}
     * @memberof TemperatureResponseSensors
     */
    probeTemperature?: number;
    /**
     * Name of the sensor.
     * @type {string}
     * @memberof TemperatureResponseSensors
     */
    name?: string;
    /**
     * ID of the sensor.
     * @type {number}
     * @memberof TemperatureResponseSensors
     */
    id?: number;
    /**
     * Currently reported ambient temperature in millidegrees celsius.
     * @type {number}
     * @memberof TemperatureResponseSensors
     */
    ambientTemperature?: number;
}

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 * @export
 * @interface TripResponse
 */
export interface TripResponse {
    /**
     * 
     * @type {Array<TripResponseTrips>}
     * @memberof TripResponse
     */
    trips?: Array<TripResponseTrips>;
}

/**
 * End (latitude, longitude) in decimal degrees.
 * @export
 * @interface TripResponseEndCoordinates
 */
export interface TripResponseEndCoordinates {
    /**
     * 
     * @type {number}
     * @memberof TripResponseEndCoordinates
     */
    latitude?: number;
    /**
     * 
     * @type {number}
     * @memberof TripResponseEndCoordinates
     */
    longitude?: number;
}

/**
 * Start (latitude, longitude) in decimal degrees.
 * @export
 * @interface TripResponseStartCoordinates
 */
export interface TripResponseStartCoordinates {
    /**
     * 
     * @type {number}
     * @memberof TripResponseStartCoordinates
     */
    latitude?: number;
    /**
     * 
     * @type {number}
     * @memberof TripResponseStartCoordinates
     */
    longitude?: number;
}

/**
 * 
 * @export
 * @interface TripResponseTrips
 */
export interface TripResponseTrips {
    /**
     * Odometer reading at the end of the trip.
     * @type {number}
     * @memberof TripResponseTrips
     */
    endOdometer?: number;
    /**
     * Length of the trip in meters.
     * @type {number}
     * @memberof TripResponseTrips
     */
    distanceMeters?: number;
    /**
     * End of the trip in UNIX milliseconds.
     * @type {number}
     * @memberof TripResponseTrips
     */
    endMs?: number;
    /**
     * Beginning of the trip in UNIX milliseconds.
     * @type {number}
     * @memberof TripResponseTrips
     */
    startMs?: number;
    /**
     * Amount in milliliters of fuel consumed on this trip.
     * @type {number}
     * @memberof TripResponseTrips
     */
    fuelConsumedMl?: number;
    /**
     * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
     * @type {string}
     * @memberof TripResponseTrips
     */
    startAddress?: string;
    /**
     * 
     * @type {TripResponseStartCoordinates}
     * @memberof TripResponseTrips
     */
    startCoordinates?: TripResponseStartCoordinates;
    /**
     * 
     * @type {TripResponseEndCoordinates}
     * @memberof TripResponseTrips
     */
    endCoordinates?: TripResponseEndCoordinates;
    /**
     * Odometer reading at the beginning of the trip.
     * @type {number}
     * @memberof TripResponseTrips
     */
    startOdometer?: number;
    /**
     * ID of the driver.
     * @type {number}
     * @memberof TripResponseTrips
     */
    driverId?: number;
    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     * @type {string}
     * @memberof TripResponseTrips
     */
    startLocation?: string;
    /**
     * Length in meters trip spent on toll roads.
     * @type {number}
     * @memberof TripResponseTrips
     */
    tollMeters?: number;
    /**
     * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
     * @type {string}
     * @memberof TripResponseTrips
     */
    endAddress?: string;
    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     * @type {string}
     * @memberof TripResponseTrips
     */
    endLocation?: string;
}

/**
 * 
 * @export
 * @interface User
 */
export interface User {
    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     * @type {string}
     * @memberof User
     */
    authType: User.AuthTypeEnum;
    /**
     * The email address of this user.
     * @type {string}
     * @memberof User
     */
    email: string;
    /**
     * The first and last name of the user.
     * @type {string}
     * @memberof User
     */
    name?: string;
    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     * @type {string}
     * @memberof User
     */
    organizationRoleId?: string;
    /**
     * The ID of the User record.
     * @type {number}
     * @memberof User
     */
    id?: number;
    /**
     * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     * @type {string}
     * @memberof User
     */
    organizationRole?: string;
    /**
     * The specific tags this user has access to. This will be blank for users that have full access to the organization.
     * @type {Array<UserTagRole>}
     * @memberof User
     */
    tagRoles?: Array<UserTagRole>;
}

/**
 * @export
 * @namespace User
 */
export namespace User {
    /**
     * @export
     * @enum {string}
     */
    export enum AuthTypeEnum {
        Default = 'default',
        Saml = 'saml'
    }
}

/**
 * 
 * @export
 * @interface UserBase
 */
export interface UserBase {
    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     * @type {string}
     * @memberof UserBase
     */
    authType: UserBase.AuthTypeEnum;
    /**
     * The email address of this user.
     * @type {string}
     * @memberof UserBase
     */
    email: string;
    /**
     * The first and last name of the user.
     * @type {string}
     * @memberof UserBase
     */
    name?: string;
    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     * @type {string}
     * @memberof UserBase
     */
    organizationRoleId?: string;
}

/**
 * @export
 * @namespace UserBase
 */
export namespace UserBase {
    /**
     * @export
     * @enum {string}
     */
    export enum AuthTypeEnum {
        Default = 'default',
        Saml = 'saml'
    }
}

/**
 * 
 * @export
 * @interface UserRole
 */
export interface UserRole {
    /**
     * 
     * @type {string}
     * @memberof UserRole
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof UserRole
     */
    name?: string;
}

/**
 * 
 * @export
 * @interface UserTagRole
 */
export interface UserTagRole {
    /**
     * The name of the role the user has been granted on this tag.
     * @type {string}
     * @memberof UserTagRole
     */
    role?: string;
    /**
     * The id of the role the user has been granted on this tag.
     * @type {string}
     * @memberof UserTagRole
     */
    roleId: string;
    /**
     * 
     * @type {UserTagRoleTag}
     * @memberof UserTagRole
     */
    tag: UserTagRoleTag;
}

/**
 * 
 * @export
 * @interface UserTagRoleTag
 */
export interface UserTagRoleTag {
    /**
     * The ID of this tag.
     * @type {number}
     * @memberof UserTagRoleTag
     */
    parentTagId?: number;
    /**
     * Name of this tag.
     * @type {string}
     * @memberof UserTagRoleTag
     */
    name: string;
    /**
     * The ID of this tag.
     * @type {number}
     * @memberof UserTagRoleTag
     */
    id: number;
}

/**
 * A vehicle object.
 * @export
 * @interface Vehicle
 */
export interface Vehicle {
    /**
     * Total engine hours for the vehicle.
     * @type {number}
     * @memberof Vehicle
     */
    engineHours?: number;
    /**
     * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
     * @type {number}
     * @memberof Vehicle
     */
    fuelLevelPercent?: number;
    /**
     * ID of the vehicle.
     * @type {number}
     * @memberof Vehicle
     */
    id: number;
    /**
     * Name of the vehicle.
     * @type {string}
     * @memberof Vehicle
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof Vehicle
     */
    note?: string;
    /**
     * The number of meters reported by the odometer.
     * @type {number}
     * @memberof Vehicle
     */
    odometerMeters?: number;
    /**
     * Vehicle Identification Number.
     * @type {string}
     * @memberof Vehicle
     */
    vin?: string;
}

/**
 * Harsh event details for a vehicle
 * @export
 * @interface VehicleHarshEventResponse
 */
export interface VehicleHarshEventResponse {
    /**
     * URL for downloading the forward facing video
     * @type {string}
     * @memberof VehicleHarshEventResponse
     */
    downloadForwardVideoUrl?: string;
    /**
     * URL for downloading the inward facing video
     * @type {string}
     * @memberof VehicleHarshEventResponse
     */
    downloadInwardVideoUrl?: string;
    /**
     * URL for downloading the tracked inward facing video
     * @type {string}
     * @memberof VehicleHarshEventResponse
     */
    downloadTrackedInwardVideoUrl?: string;
    /**
     * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
     * @type {string}
     * @memberof VehicleHarshEventResponse
     */
    harshEventType: string;
    /**
     * URL of the associated incident report page
     * @type {string}
     * @memberof VehicleHarshEventResponse
     */
    incidentReportUrl: string;
    /**
     * Whether the driver was deemed distracted during this harsh event
     * @type {boolean}
     * @memberof VehicleHarshEventResponse
     */
    isDistracted?: boolean;
    /**
     * 
     * @type {VehicleHarshEventResponseLocation}
     * @memberof VehicleHarshEventResponse
     */
    location?: VehicleHarshEventResponseLocation;
}

/**
 * 
 * @export
 * @interface VehicleHarshEventResponseLocation
 */
export interface VehicleHarshEventResponseLocation {
    /**
     * Address of location where the harsh event occurred
     * @type {string}
     * @memberof VehicleHarshEventResponseLocation
     */
    address?: string;
    /**
     * Latitude of location where the harsh event occurred
     * @type {string}
     * @memberof VehicleHarshEventResponseLocation
     */
    latitude?: string;
    /**
     * Longitude of location where the harsh event occurred
     * @type {string}
     * @memberof VehicleHarshEventResponseLocation
     */
    longitude?: string;
}

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 * @export
 * @interface VehicleLocation
 */
export interface VehicleLocation {
    /**
     * Heading in degrees.
     * @type {number}
     * @memberof VehicleLocation
     */
    heading?: number;
    /**
     * ID of the vehicle.
     * @type {number}
     * @memberof VehicleLocation
     */
    id: number;
    /**
     * Latitude in decimal degrees.
     * @type {number}
     * @memberof VehicleLocation
     */
    latitude?: number;
    /**
     * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
     * @type {string}
     * @memberof VehicleLocation
     */
    location?: string;
    /**
     * Longitude in decimal degrees.
     * @type {number}
     * @memberof VehicleLocation
     */
    longitude?: number;
    /**
     * Name of the vehicle.
     * @type {string}
     * @memberof VehicleLocation
     */
    name?: string;
    /**
     * The number of meters reported by the odometer.
     * @type {number}
     * @memberof VehicleLocation
     */
    odometerMeters?: number;
    /**
     * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
     * @type {boolean}
     * @memberof VehicleLocation
     */
    onTrip?: boolean;
    /**
     * Speed in miles per hour.
     * @type {number}
     * @memberof VehicleLocation
     */
    speed?: number;
    /**
     * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
     * @type {number}
     * @memberof VehicleLocation
     */
    time?: number;
    /**
     * Vehicle Identification Number (VIN) of the vehicle.
     * @type {string}
     * @memberof VehicleLocation
     */
    vin?: string;
}

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 * @export
 * @interface VehicleMaintenance
 */
export interface VehicleMaintenance {
    /**
     * ID of the vehicle.
     * @type {number}
     * @memberof VehicleMaintenance
     */
    id: number;
    /**
     * 
     * @type {VehicleMaintenanceJ1939}
     * @memberof VehicleMaintenance
     */
    j1939?: VehicleMaintenanceJ1939;
    /**
     * 
     * @type {VehicleMaintenancePassenger}
     * @memberof VehicleMaintenance
     */
    passenger?: VehicleMaintenancePassenger;
}

/**
 * J1939 based data. Null if no data is available.
 * @export
 * @interface VehicleMaintenanceJ1939
 */
export interface VehicleMaintenanceJ1939 {
    /**
     * 
     * @type {VehicleMaintenanceJ1939CheckEngineLight}
     * @memberof VehicleMaintenanceJ1939
     */
    checkEngineLight?: VehicleMaintenanceJ1939CheckEngineLight;
    /**
     * J1939 DTCs.
     * @type {Array<VehicleMaintenanceJ1939DiagnosticTroubleCodes>}
     * @memberof VehicleMaintenanceJ1939
     */
    diagnosticTroubleCodes?: Array<VehicleMaintenanceJ1939DiagnosticTroubleCodes>;
}

/**
 * J1939 check engine lights.
 * @export
 * @interface VehicleMaintenanceJ1939CheckEngineLight
 */
export interface VehicleMaintenanceJ1939CheckEngineLight {
    /**
     * 
     * @type {boolean}
     * @memberof VehicleMaintenanceJ1939CheckEngineLight
     */
    protectIsOn?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof VehicleMaintenanceJ1939CheckEngineLight
     */
    stopIsOn?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof VehicleMaintenanceJ1939CheckEngineLight
     */
    warningIsOn?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof VehicleMaintenanceJ1939CheckEngineLight
     */
    emissionsIsOn?: boolean;
}

/**
 * 
 * @export
 * @interface VehicleMaintenanceJ1939DiagnosticTroubleCodes
 */
export interface VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    /**
     * 
     * @type {string}
     * @memberof VehicleMaintenanceJ1939DiagnosticTroubleCodes
     */
    spnDescription?: string;
    /**
     * 
     * @type {string}
     * @memberof VehicleMaintenanceJ1939DiagnosticTroubleCodes
     */
    fmiText?: string;
    /**
     * 
     * @type {number}
     * @memberof VehicleMaintenanceJ1939DiagnosticTroubleCodes
     */
    spnId?: number;
    /**
     * 
     * @type {number}
     * @memberof VehicleMaintenanceJ1939DiagnosticTroubleCodes
     */
    occurrenceCount?: number;
    /**
     * 
     * @type {number}
     * @memberof VehicleMaintenanceJ1939DiagnosticTroubleCodes
     */
    txId?: number;
    /**
     * 
     * @type {number}
     * @memberof VehicleMaintenanceJ1939DiagnosticTroubleCodes
     */
    fmiId?: number;
}

/**
 * Passenger vehicle data. Null if no data is available.
 * @export
 * @interface VehicleMaintenancePassenger
 */
export interface VehicleMaintenancePassenger {
    /**
     * 
     * @type {VehicleMaintenancePassengerCheckEngineLight}
     * @memberof VehicleMaintenancePassenger
     */
    checkEngineLight?: VehicleMaintenancePassengerCheckEngineLight;
    /**
     * Passenger vehicle DTCs.
     * @type {Array<VehicleMaintenancePassengerDiagnosticTroubleCodes>}
     * @memberof VehicleMaintenancePassenger
     */
    diagnosticTroubleCodes?: Array<VehicleMaintenancePassengerDiagnosticTroubleCodes>;
}

/**
 * Passenger vehicle check engine light.
 * @export
 * @interface VehicleMaintenancePassengerCheckEngineLight
 */
export interface VehicleMaintenancePassengerCheckEngineLight {
    /**
     * 
     * @type {boolean}
     * @memberof VehicleMaintenancePassengerCheckEngineLight
     */
    isOn?: boolean;
}

/**
 * 
 * @export
 * @interface VehicleMaintenancePassengerDiagnosticTroubleCodes
 */
export interface VehicleMaintenancePassengerDiagnosticTroubleCodes {
    /**
     * 
     * @type {string}
     * @memberof VehicleMaintenancePassengerDiagnosticTroubleCodes
     */
    dtcShortCode?: string;
    /**
     * 
     * @type {number}
     * @memberof VehicleMaintenancePassengerDiagnosticTroubleCodes
     */
    dtcId?: number;
    /**
     * 
     * @type {string}
     * @memberof VehicleMaintenancePassengerDiagnosticTroubleCodes
     */
    dtcDescription?: string;
}

/**
 * Safety score details for a vehicle
 * @export
 * @interface VehicleSafetyScoreResponse
 */
export interface VehicleSafetyScoreResponse {
    /**
     * Crash event count
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    crashCount?: number;
    /**
     * Harsh acceleration event count
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    harshAccelCount?: number;
    /**
     * Harsh braking event count
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    harshBrakingCount?: number;
    /**
     * 
     * @type {Array<SafetyReportHarshEvent>}
     * @memberof VehicleSafetyScoreResponse
     */
    harshEvents?: Array<SafetyReportHarshEvent>;
    /**
     * Harsh turning event count
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    harshTurningCount?: number;
    /**
     * Safety Score
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    safetyScore?: number;
    /**
     * Safety Score Rank
     * @type {string}
     * @memberof VehicleSafetyScoreResponse
     */
    safetyScoreRank?: string;
    /**
     * Amount of time driven over the speed limit in milliseconds
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    timeOverSpeedLimitMs?: number;
    /**
     * Total distance driven in meters
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    totalDistanceDrivenMeters?: number;
    /**
     * Total harsh event count
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    totalHarshEventCount?: number;
    /**
     * Amount of time driven in milliseconds
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    totalTimeDrivenMs?: number;
    /**
     * Vehicle ID
     * @type {number}
     * @memberof VehicleSafetyScoreResponse
     */
    vehicleId?: number;
}


/**
 * AssetsApi - axios parameter creator
 * @export
 */
export const AssetsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
            }
            const localVarPath = `/fleet/assets/locations`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssets.');
            }
            const localVarPath = `/fleet/assets`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAssetLocation.');
            }
            // verify required parameter 'assetId' is not null or undefined
            if (assetId === null || assetId === undefined) {
                throw new RequiredError('assetId','Required parameter assetId was null or undefined when calling getAssetLocation.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getAssetLocation.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getAssetLocation.');
            }
            const localVarPath = `/fleet/assets/{asset_id}/locations`
                .replace(`{${"asset_id"}}`, encodeURIComponent(String(assetId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAssetReefer.');
            }
            // verify required parameter 'assetId' is not null or undefined
            if (assetId === null || assetId === undefined) {
                throw new RequiredError('assetId','Required parameter assetId was null or undefined when calling getAssetReefer.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getAssetReefer.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getAssetReefer.');
            }
            const localVarPath = `/fleet/assets/{asset_id}/reefer`
                .replace(`{${"asset_id"}}`, encodeURIComponent(String(assetId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * AssetsApi - functional programming interface
 * @export
 */
export const AssetsApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2001> {
            const localVarAxiosArgs = AssetsApiAxiosParamCreator(configuration).getAllAssetCurrentLocations(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse200> {
            const localVarAxiosArgs = AssetsApiAxiosParamCreator(configuration).getAllAssets(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<any>> {
            const localVarAxiosArgs = AssetsApiAxiosParamCreator(configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<AssetReeferResponse> {
            const localVarAxiosArgs = AssetsApiAxiosParamCreator(configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * AssetsApi - factory interface
 * @export
 */
export const AssetsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: any) {
            return AssetsApiFp(configuration).getAllAssetCurrentLocations(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options?: any) {
            return AssetsApiFp(configuration).getAllAssets(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
            return AssetsApiFp(configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
            return AssetsApiFp(configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options)(axios, basePath);
        },
    };
};

/**
 * AssetsApi - object-oriented interface
 * @export
 * @class AssetsApi
 * @extends {BaseAPI}
 */
export class AssetsApi extends BaseAPI {
    /**
     * Fetch current locations of all assets for the group.
     * @summary /fleet/assets/locations
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AssetsApi
     */
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: any) {
        return AssetsApiFp(this.configuration).getAllAssetCurrentLocations(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the assets for the group.
     * @summary /fleet/assets
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AssetsApi
     */
    public getAllAssets(accessToken: string, groupId?: number, options?: any) {
        return AssetsApiFp(this.configuration).getAllAssets(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the historical locations for the asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/locations
     * @param {string} accessToken Samsara API access token.
     * @param {number} assetId ID of the asset
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AssetsApi
     */
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
        return AssetsApiFp(this.configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the reefer-specific stats of an asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/reefer
     * @param {string} accessToken Samsara API access token.
     * @param {number} assetId ID of the asset
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AssetsApi
     */
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
        return AssetsApiFp(this.configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options)(this.axios, this.basePath);
    }

}

/**
 * DriversApi - axios parameter creator
 * @export
 */
export const DriversApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @param {string} accessToken Samsara API access token.
         * @param {DriverForCreate} createDriverParam Driver creation body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDriver.');
            }
            // verify required parameter 'createDriverParam' is not null or undefined
            if (createDriverParam === null || createDriverParam === undefined) {
                throw new RequiredError('createDriverParam','Required parameter createDriverParam was null or undefined when calling createDriver.');
            }
            const localVarPath = `/fleet/drivers/create`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DriverForCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDriverParam || {}) : (createDriverParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deactivateDriver.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
            }
            const localVarPath = `/fleet/drivers/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
            }
            const localVarPath = `/fleet/drivers/inactive`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
            }
            const localVarPath = `/fleet/drivers/inactive/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDriverById.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
            }
            const localVarPath = `/fleet/drivers/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {InlineObject4} reactivateDriverParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling reactivateDriverById.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
            }
            // verify required parameter 'reactivateDriverParam' is not null or undefined
            if (reactivateDriverParam === null || reactivateDriverParam === undefined) {
                throw new RequiredError('reactivateDriverParam','Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
            }
            const localVarPath = `/fleet/drivers/inactive/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject4" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(reactivateDriverParam || {}) : (reactivateDriverParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DriversApi - functional programming interface
 * @export
 */
export const DriversApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @param {string} accessToken Samsara API access token.
         * @param {DriverForCreate} createDriverParam Driver creation body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = DriversApiAxiosParamCreator(configuration).createDriver(accessToken, createDriverParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = DriversApiAxiosParamCreator(configuration).deactivateDriver(accessToken, driverIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Driver>> {
            const localVarAxiosArgs = DriversApiAxiosParamCreator(configuration).getAllDeactivatedDrivers(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = DriversApiAxiosParamCreator(configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = DriversApiAxiosParamCreator(configuration).getDriverById(accessToken, driverIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {InlineObject4} reactivateDriverParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = DriversApiAxiosParamCreator(configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * DriversApi - factory interface
 * @export
 */
export const DriversApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @param {string} accessToken Samsara API access token.
         * @param {DriverForCreate} createDriverParam Driver creation body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: any) {
            return DriversApiFp(configuration).createDriver(accessToken, createDriverParam, options)(axios, basePath);
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: any) {
            return DriversApiFp(configuration).deactivateDriver(accessToken, driverIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: any) {
            return DriversApiFp(configuration).getAllDeactivatedDrivers(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
            return DriversApiFp(configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
            return DriversApiFp(configuration).getDriverById(accessToken, driverIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {InlineObject4} reactivateDriverParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: any) {
            return DriversApiFp(configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options)(axios, basePath);
        },
    };
};

/**
 * DriversApi - object-oriented interface
 * @export
 * @class DriversApi
 * @extends {BaseAPI}
 */
export class DriversApi extends BaseAPI {
    /**
     * Create a new driver.
     * @summary /fleet/drivers/create
     * @param {string} accessToken Samsara API access token.
     * @param {DriverForCreate} createDriverParam Driver creation body
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DriversApi
     */
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: any) {
        return DriversApiFp(this.configuration).createDriver(accessToken, createDriverParam, options)(this.axios, this.basePath);
    }

    /**
     * Deactivate a driver with the given id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DriversApi
     */
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: any) {
        return DriversApiFp(this.configuration).deactivateDriver(accessToken, driverIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all deactivated drivers for the group.
     * @summary /fleet/drivers/inactive
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DriversApi
     */
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: any) {
        return DriversApiFp(this.configuration).getAllDeactivatedDrivers(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch deactivated driver by id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DriversApi
     */
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
        return DriversApiFp(this.configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch driver by id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DriversApi
     */
    public getDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
        return DriversApiFp(this.configuration).getDriverById(accessToken, driverIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Reactivate the inactive driver having id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {InlineObject4} reactivateDriverParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DriversApi
     */
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: any) {
        return DriversApiFp(this.configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options)(this.axios, this.basePath);
    }

}

/**
 * FleetApi - axios parameter creator
 * @export
 */
export const FleetApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This method adds an address book entry to the specified group.
         * @summary /fleet/add_address
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject2} addressParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        addFleetAddress(accessToken: string, addressParam: InlineObject2, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling addFleetAddress.');
            }
            // verify required parameter 'addressParam' is not null or undefined
            if (addressParam === null || addressParam === undefined) {
                throw new RequiredError('addressParam','Required parameter addressParam was null or undefined when calling addFleetAddress.');
            }
            const localVarPath = `/fleet/add_address`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject2" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(addressParam || {}) : (addressParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Add one or more addresses to the organization
         * @summary /addresses
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject} addresses 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        addOrganizationAddresses(accessToken: string, addresses: InlineObject, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling addOrganizationAddresses.');
            }
            // verify required parameter 'addresses' is not null or undefined
            if (addresses === null || addresses === undefined) {
                throw new RequiredError('addresses','Required parameter addresses was null or undefined when calling addOrganizationAddresses.');
            }
            const localVarPath = `/addresses`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(addresses || {}) : (addresses || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDispatchRoute.');
            }
            // verify required parameter 'createDispatchRouteParams' is not null or undefined
            if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
                throw new RequiredError('createDispatchRouteParams','Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
            }
            const localVarPath = `/fleet/dispatch/routes`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRouteCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (createDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @param {string} accessToken Samsara API access token.
         * @param {DriverForCreate} createDriverParam Driver creation body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDriver.');
            }
            // verify required parameter 'createDriverParam' is not null or undefined
            if (createDriverParam === null || createDriverParam === undefined) {
                throw new RequiredError('createDriverParam','Required parameter createDriverParam was null or undefined when calling createDriver.');
            }
            const localVarPath = `/fleet/drivers/create`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DriverForCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDriverParam || {}) : (createDriverParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
            }
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
            }
            // verify required parameter 'createDispatchRouteParams' is not null or undefined
            if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
                throw new RequiredError('createDispatchRouteParams','Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
            }
            const localVarPath = `/fleet/drivers/{driver_id}/dispatch/routes`
                .replace(`{${"driver_id"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRouteCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (createDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a driver document for the given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver for whom the document is created.
         * @param {DocumentCreate} createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDriverDocument.');
            }
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling createDriverDocument.');
            }
            // verify required parameter 'createDocumentParams' is not null or undefined
            if (createDocumentParams === null || createDocumentParams === undefined) {
                throw new RequiredError('createDocumentParams','Required parameter createDocumentParams was null or undefined when calling createDriverDocument.');
            }
            const localVarPath = `/fleet/drivers/{driver_id}/documents`
                .replace(`{${"driver_id"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DocumentCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDocumentParams || {}) : (createDocumentParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dvir, marking a vehicle or trailer safe or unsafe.
         * @summary /fleet/maintenance/dvirs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject12} createDvirParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDvir(accessToken: string, createDvirParam: InlineObject12, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDvir.');
            }
            // verify required parameter 'createDvirParam' is not null or undefined
            if (createDvirParam === null || createDvirParam === undefined) {
                throw new RequiredError('createDvirParam','Required parameter createDvirParam was null or undefined when calling createDvir.');
            }
            const localVarPath = `/fleet/maintenance/dvirs`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject12" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDvirParam || {}) : (createDvirParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
            }
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
            }
            // verify required parameter 'createDispatchRouteParams' is not null or undefined
            if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
                throw new RequiredError('createDispatchRouteParams','Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id}/dispatch/routes`
                .replace(`{${"vehicle_id"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRouteCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (createDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deactivateDriver.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
            }
            const localVarPath = `/fleet/drivers/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete an address.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteOrganizationAddress(accessToken: string, addressId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deleteOrganizationAddress.');
            }
            // verify required parameter 'addressId' is not null or undefined
            if (addressId === null || addressId === undefined) {
                throw new RequiredError('addressId','Required parameter addressId was null or undefined when calling deleteOrganizationAddress.');
            }
            const localVarPath = `/addresses/{addressId}`
                .replace(`{${"addressId"}}`, encodeURIComponent(String(addressId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
            }
            const localVarPath = `/fleet/dispatch/routes`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = duration;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
         * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
            }
            const localVarPath = `/fleet/dispatch/routes/job_updates`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }

            if (sequenceId !== undefined) {
                localVarQueryParameter['sequence_id'] = sequenceId;
            }

            if (include !== undefined) {
                localVarQueryParameter['include'] = include;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
            }
            const localVarPath = `/fleet/assets/locations`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssets.');
            }
            const localVarPath = `/fleet/assets`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
            }
            const localVarPath = `/fleet/drivers/inactive`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAssetLocation.');
            }
            // verify required parameter 'assetId' is not null or undefined
            if (assetId === null || assetId === undefined) {
                throw new RequiredError('assetId','Required parameter assetId was null or undefined when calling getAssetLocation.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getAssetLocation.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getAssetLocation.');
            }
            const localVarPath = `/fleet/assets/{asset_id}/locations`
                .replace(`{${"asset_id"}}`, encodeURIComponent(String(assetId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAssetReefer.');
            }
            // verify required parameter 'assetId' is not null or undefined
            if (assetId === null || assetId === undefined) {
                throw new RequiredError('assetId','Required parameter assetId was null or undefined when calling getAssetReefer.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getAssetReefer.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getAssetReefer.');
            }
            const localVarPath = `/fleet/assets/{asset_id}/reefer`
                .replace(`{${"asset_id"}}`, encodeURIComponent(String(assetId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
            }
            const localVarPath = `/fleet/drivers/inactive/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling getDispatchRouteById.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the route with history.
         * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
         * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}/history`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startTime !== undefined) {
                localVarQueryParameter['start_time'] = startTime;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
            }
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
            }
            const localVarPath = `/fleet/drivers/{driver_id}/dispatch/routes`
                .replace(`{${"driver_id"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = duration;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
            }
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id}/dispatch/routes`
                .replace(`{${"vehicle_id"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = duration;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDriverById.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
            }
            const localVarPath = `/fleet/drivers/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the document types.
         * @summary /fleet/drivers/document_types
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverDocumentTypesByOrgId(options: any = {}): RequestArgs {
            const localVarPath = `/fleet/drivers/document_types`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the documents.
         * @summary /fleet/drivers/documents
         * @param {string} accessToken Samsara API access token.
         * @param {number} [endMs] Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
         * @param {number} [durationMs] Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
            }
            const localVarPath = `/fleet/drivers/documents`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }

            if (durationMs !== undefined) {
                localVarQueryParameter['durationMs'] = durationMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @param {number} driverId ID of the driver
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
            }
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
            }
            const localVarPath = `/fleet/drivers/{driverId}/safety/score`
                .replace(`{${"driverId"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get DVIRs for the org within provided time constraints
         * @summary /fleet/maintenance/dvirs
         * @param {string} accessToken Samsara API access token.
         * @param {number} endMs time in millis until the last dvir log.
         * @param {number} durationMs time in millis which corresponds to the duration before the end_ms.
         * @param {number} [groupId] Group ID to query.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDvirs.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getDvirs.');
            }
            // verify required parameter 'durationMs' is not null or undefined
            if (durationMs === null || durationMs === undefined) {
                throw new RequiredError('durationMs','Required parameter durationMs was null or undefined when calling getDvirs.');
            }
            const localVarPath = `/fleet/maintenance/dvirs`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['end_ms'] = endMs;
            }

            if (durationMs !== undefined) {
                localVarQueryParameter['duration_ms'] = durationMs;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get all the drivers for the specified group.
         * @summary /fleet/drivers
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject3} groupDriversParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetDrivers.');
            }
            // verify required parameter 'groupDriversParam' is not null or undefined
            if (groupDriversParam === null || groupDriversParam === undefined) {
                throw new RequiredError('groupDriversParam','Required parameter groupDriversParam was null or undefined when calling getFleetDrivers.');
            }
            const localVarPath = `/fleet/drivers`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject3" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(groupDriversParam || {}) : (groupDriversParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get summarized daily HOS charts for a specified driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with HOS logs.
         * @param {InlineObject6} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
            }
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
            }
            // verify required parameter 'hosLogsParam' is not null or undefined
            if (hosLogsParam === null || hosLogsParam === undefined) {
                throw new RequiredError('hosLogsParam','Required parameter hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
            }
            const localVarPath = `/fleet/drivers/{driver_id}/hos_daily_logs`
                .replace(`{${"driver_id"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject6" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(hosLogsParam || {}) : (hosLogsParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the distance and time each driver in an organization has driven in a given time period.
         * @summary /fleet/drivers/summary
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject5} driversSummaryParam 
         * @param {boolean} [snapToDayBounds] Snap query result to HOS day boundaries.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetDriversSummary.');
            }
            // verify required parameter 'driversSummaryParam' is not null or undefined
            if (driversSummaryParam === null || driversSummaryParam === undefined) {
                throw new RequiredError('driversSummaryParam','Required parameter driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
            }
            const localVarPath = `/fleet/drivers/summary`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (snapToDayBounds !== undefined) {
                localVarQueryParameter['snap_to_day_bounds'] = snapToDayBounds;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject5" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(driversSummaryParam || {}) : (driversSummaryParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
         * @summary /fleet/hos_authentication_logs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject7} hosAuthenticationLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
            }
            // verify required parameter 'hosAuthenticationLogsParam' is not null or undefined
            if (hosAuthenticationLogsParam === null || hosAuthenticationLogsParam === undefined) {
                throw new RequiredError('hosAuthenticationLogsParam','Required parameter hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
            }
            const localVarPath = `/fleet/hos_authentication_logs`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject7" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(hosAuthenticationLogsParam || {}) : (hosAuthenticationLogsParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
         * @summary /fleet/hos_logs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject8} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetHosLogs.');
            }
            // verify required parameter 'hosLogsParam' is not null or undefined
            if (hosLogsParam === null || hosLogsParam === undefined) {
                throw new RequiredError('hosLogsParam','Required parameter hosLogsParam was null or undefined when calling getFleetHosLogs.');
            }
            const localVarPath = `/fleet/hos_logs`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject8" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(hosLogsParam || {}) : (hosLogsParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the current HOS status for all drivers in the group.
         * @summary /fleet/hos_logs_summary
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject9} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetHosLogsSummary.');
            }
            // verify required parameter 'hosLogsParam' is not null or undefined
            if (hosLogsParam === null || hosLogsParam === undefined) {
                throw new RequiredError('hosLogsParam','Required parameter hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
            }
            const localVarPath = `/fleet/hos_logs_summary`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject9" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(hosLogsParam || {}) : (hosLogsParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
         * @summary /fleet/locations
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject11} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetLocations(accessToken: string, groupParam: InlineObject11, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetLocations.');
            }
            // verify required parameter 'groupParam' is not null or undefined
            if (groupParam === null || groupParam === undefined) {
                throw new RequiredError('groupParam','Required parameter groupParam was null or undefined when calling getFleetLocations.');
            }
            const localVarPath = `/fleet/locations`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject11" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(groupParam || {}) : (groupParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get list of the vehicles with any engine faults or check light data.
         * @summary /fleet/maintenance/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject13} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetMaintenanceList.');
            }
            // verify required parameter 'groupParam' is not null or undefined
            if (groupParam === null || groupParam === undefined) {
                throw new RequiredError('groupParam','Required parameter groupParam was null or undefined when calling getFleetMaintenanceList.');
            }
            const localVarPath = `/fleet/maintenance/list`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject13" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(groupParam || {}) : (groupParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
         * @summary /fleet/trips
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject15} tripsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetTrips(accessToken: string, tripsParam: InlineObject15, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetTrips.');
            }
            // verify required parameter 'tripsParam' is not null or undefined
            if (tripsParam === null || tripsParam === undefined) {
                throw new RequiredError('tripsParam','Required parameter tripsParam was null or undefined when calling getFleetTrips.');
            }
            const localVarPath = `/fleet/trips`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject15" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(tripsParam || {}) : (tripsParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Gets a specific vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getFleetVehicle.');
            }
            // verify required parameter 'vehicleIdOrExternalId' is not null or undefined
            if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
                throw new RequiredError('vehicleIdOrExternalId','Required parameter vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id_or_external_id}`
                .replace(`{${"vehicle_id_or_external_id"}}`, encodeURIComponent(String(vehicleIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch an address by its id.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationAddress(accessToken: string, addressId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getOrganizationAddress.');
            }
            // verify required parameter 'addressId' is not null or undefined
            if (addressId === null || addressId === undefined) {
                throw new RequiredError('addressId','Required parameter addressId was null or undefined when calling getOrganizationAddress.');
            }
            const localVarPath = `/addresses/{addressId}`
                .replace(`{${"addressId"}}`, encodeURIComponent(String(addressId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
         * @summary /addresses
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationAddresses(accessToken: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getOrganizationAddresses.');
            }
            const localVarPath = `/addresses`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a contact by its id.
         * @summary /contacts/{contact_id}
         * @param {string} accessToken Samsara API access token.
         * @param {number} contactId ID of the contact
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationContact(accessToken: string, contactId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getOrganizationContact.');
            }
            // verify required parameter 'contactId' is not null or undefined
            if (contactId === null || contactId === undefined) {
                throw new RequiredError('contactId','Required parameter contactId was null or undefined when calling getOrganizationContact.');
            }
            const localVarPath = `/contacts/{contact_id}`
                .replace(`{${"contact_id"}}`, encodeURIComponent(String(contactId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options: any = {}): RequestArgs {
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
            }
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
            }
            // verify required parameter 'timestamp' is not null or undefined
            if (timestamp === null || timestamp === undefined) {
                throw new RequiredError('timestamp','Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
            }
            const localVarPath = `/fleet/vehicles/{vehicleId}/safety/harsh_event`
                .replace(`{${"vehicleId"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (timestamp !== undefined) {
                localVarQueryParameter['timestamp'] = timestamp;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehicleLocations.');
            }
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getVehicleLocations.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getVehicleLocations.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getVehicleLocations.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id}/locations`
                .replace(`{${"vehicle_id"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
            }
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
            }
            const localVarPath = `/fleet/vehicles/{vehicleId}/safety/score`
                .replace(`{${"vehicleId"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
         * @summary /fleet/vehicles/stats
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query.
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query.
         * @param {'engineState' | 'auxInput1' | 'auxInput2'} [series] Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
         * @param {string} [tagIds] Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
         * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
         * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
         * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehicleStats.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getVehicleStats.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getVehicleStats.');
            }
            const localVarPath = `/fleet/vehicles/stats`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }

            if (series !== undefined) {
                localVarQueryParameter['series'] = series;
            }

            if (tagIds !== undefined) {
                localVarQueryParameter['tagIds'] = tagIds;
            }

            if (startingAfter !== undefined) {
                localVarQueryParameter['startingAfter'] = startingAfter;
            }

            if (endingBefore !== undefined) {
                localVarQueryParameter['endingBefore'] = endingBefore;
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = limit;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
         * @summary /fleet/vehicles/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehiclesLocations.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getVehiclesLocations.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getVehiclesLocations.');
            }
            const localVarPath = `/fleet/vehicles/locations`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all contacts for the organization.
         * @summary /contacts
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listContacts(accessToken: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listContacts.');
            }
            const localVarPath = `/contacts`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
         * @summary /fleet/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject10} groupParam 
         * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
         * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
         * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listFleet.');
            }
            // verify required parameter 'groupParam' is not null or undefined
            if (groupParam === null || groupParam === undefined) {
                throw new RequiredError('groupParam','Required parameter groupParam was null or undefined when calling listFleet.');
            }
            const localVarPath = `/fleet/list`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startingAfter !== undefined) {
                localVarQueryParameter['startingAfter'] = startingAfter;
            }

            if (endingBefore !== undefined) {
                localVarQueryParameter['endingBefore'] = endingBefore;
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = limit;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject10" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(groupParam || {}) : (groupParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
         * @param {InlineObject16} data 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling patchFleetVehicle.');
            }
            // verify required parameter 'vehicleIdOrExternalId' is not null or undefined
            if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
                throw new RequiredError('vehicleIdOrExternalId','Required parameter vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
            }
            // verify required parameter 'data' is not null or undefined
            if (data === null || data === undefined) {
                throw new RequiredError('data','Required parameter data was null or undefined when calling patchFleetVehicle.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id_or_external_id}`
                .replace(`{${"vehicle_id_or_external_id"}}`, encodeURIComponent(String(vehicleIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PATCH', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject16" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(data || {}) : (data || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {InlineObject4} reactivateDriverParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling reactivateDriverById.');
            }
            // verify required parameter 'driverIdOrExternalId' is not null or undefined
            if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
                throw new RequiredError('driverIdOrExternalId','Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
            }
            // verify required parameter 'reactivateDriverParam' is not null or undefined
            if (reactivateDriverParam === null || reactivateDriverParam === undefined) {
                throw new RequiredError('reactivateDriverParam','Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
            }
            const localVarPath = `/fleet/drivers/inactive/{driver_id_or_external_id}`
                .replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(driverIdOrExternalId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject4" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(reactivateDriverParam || {}) : (reactivateDriverParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {DispatchRoute} updateDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
            }
            // verify required parameter 'updateDispatchRouteParams' is not null or undefined
            if (updateDispatchRouteParams === null || updateDispatchRouteParams === undefined) {
                throw new RequiredError('updateDispatchRouteParams','Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRoute" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(updateDispatchRouteParams || {}) : (updateDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {InlineObject1} address 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling updateOrganizationAddress.');
            }
            // verify required parameter 'addressId' is not null or undefined
            if (addressId === null || addressId === undefined) {
                throw new RequiredError('addressId','Required parameter addressId was null or undefined when calling updateOrganizationAddress.');
            }
            // verify required parameter 'address' is not null or undefined
            if (address === null || address === undefined) {
                throw new RequiredError('address','Required parameter address was null or undefined when calling updateOrganizationAddress.');
            }
            const localVarPath = `/addresses/{addressId}`
                .replace(`{${"addressId"}}`, encodeURIComponent(String(addressId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PATCH', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject1" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(address || {}) : (address || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
         * @summary /fleet/set_data
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject14} vehicleUpdateParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling updateVehicles.');
            }
            // verify required parameter 'vehicleUpdateParam' is not null or undefined
            if (vehicleUpdateParam === null || vehicleUpdateParam === undefined) {
                throw new RequiredError('vehicleUpdateParam','Required parameter vehicleUpdateParam was null or undefined when calling updateVehicles.');
            }
            const localVarPath = `/fleet/set_data`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject14" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(vehicleUpdateParam || {}) : (vehicleUpdateParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * FleetApi - functional programming interface
 * @export
 */
export const FleetApiFp = function(configuration?: Configuration) {
    return {
        /**
         * This method adds an address book entry to the specified group.
         * @summary /fleet/add_address
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject2} addressParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        addFleetAddress(accessToken: string, addressParam: InlineObject2, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).addFleetAddress(accessToken, addressParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Add one or more addresses to the organization
         * @summary /addresses
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject} addresses 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        addOrganizationAddresses(accessToken: string, addresses: InlineObject, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Address>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).addOrganizationAddresses(accessToken, addresses, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @param {string} accessToken Samsara API access token.
         * @param {DriverForCreate} createDriverParam Driver creation body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).createDriver(accessToken, createDriverParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a driver document for the given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver for whom the document is created.
         * @param {DocumentCreate} createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Document> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).createDriverDocument(accessToken, driverId, createDocumentParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new dvir, marking a vehicle or trailer safe or unsafe.
         * @summary /fleet/maintenance/dvirs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject12} createDvirParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDvir(accessToken: string, createDvirParam: InlineObject12, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DvirBase> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).createDvir(accessToken, createDvirParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).deactivateDriver(accessToken, driverIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).deleteDispatchRouteById(accessToken, routeId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Delete an address.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteOrganizationAddress(accessToken: string, addressId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).deleteOrganizationAddress(accessToken, addressId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DispatchRoute>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
         * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<AllRouteJobUpdates> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2001> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getAllAssetCurrentLocations(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse200> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getAllAssets(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Driver>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getAllDeactivatedDrivers(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<any>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<AssetReeferResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDispatchRouteById(accessToken, routeId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the route with history.
         * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
         * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRouteHistory> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DispatchRoute>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DispatchRoute>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDriverById(accessToken, driverIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the document types.
         * @summary /fleet/drivers/document_types
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverDocumentTypesByOrgId(options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DocumentType>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDriverDocumentTypesByOrgId(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the documents.
         * @summary /fleet/drivers/documents
         * @param {string} accessToken Samsara API access token.
         * @param {number} [endMs] Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
         * @param {number} [durationMs] Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Document>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDriverDocumentsByOrgId(accessToken, endMs, durationMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @param {number} driverId ID of the driver
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DriverSafetyScoreResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get DVIRs for the org within provided time constraints
         * @summary /fleet/maintenance/dvirs
         * @param {string} accessToken Samsara API access token.
         * @param {number} endMs time in millis until the last dvir log.
         * @param {number} durationMs time in millis which corresponds to the duration before the end_ms.
         * @param {number} [groupId] Group ID to query.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DvirListResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getDvirs(accessToken, endMs, durationMs, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get all the drivers for the specified group.
         * @summary /fleet/drivers
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject3} groupDriversParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DriversResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetDrivers(accessToken, groupDriversParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get summarized daily HOS charts for a specified driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with HOS logs.
         * @param {InlineObject6} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DriverDailyLogResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get the distance and time each driver in an organization has driven in a given time period.
         * @summary /fleet/drivers/summary
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject5} driversSummaryParam 
         * @param {boolean} [snapToDayBounds] Snap query result to HOS day boundaries.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DriversSummaryResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
         * @summary /fleet/hos_authentication_logs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject7} hosAuthenticationLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<HosAuthenticationLogsResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
         * @summary /fleet/hos_logs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject8} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<HosLogsResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetHosLogs(accessToken, hosLogsParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get the current HOS status for all drivers in the group.
         * @summary /fleet/hos_logs_summary
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject9} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<HosLogsSummaryResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetHosLogsSummary(accessToken, hosLogsParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
         * @summary /fleet/locations
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject11} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetLocations(accessToken: string, groupParam: InlineObject11, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2003> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetLocations(accessToken, groupParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get list of the vehicles with any engine faults or check light data.
         * @summary /fleet/maintenance/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject13} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2004> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetMaintenanceList(accessToken, groupParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
         * @summary /fleet/trips
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject15} tripsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetTrips(accessToken: string, tripsParam: InlineObject15, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<TripResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetTrips(accessToken, tripsParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Gets a specific vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<FleetVehicleResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getFleetVehicle(accessToken, vehicleIdOrExternalId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch an address by its id.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationAddress(accessToken: string, addressId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Address> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getOrganizationAddress(accessToken, addressId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
         * @summary /addresses
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationAddresses(accessToken: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Address>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getOrganizationAddresses(accessToken, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch a contact by its id.
         * @summary /contacts/{contact_id}
         * @param {string} accessToken Samsara API access token.
         * @param {number} contactId ID of the contact
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationContact(accessToken: string, contactId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Contact> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getOrganizationContact(accessToken, contactId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<VehicleHarshEventResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<FleetVehicleLocation>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getVehicleLocations(accessToken, vehicleId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<VehicleSafetyScoreResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
         * @summary /fleet/vehicles/stats
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query.
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query.
         * @param {'engineState' | 'auxInput1' | 'auxInput2'} [series] Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
         * @param {string} [tagIds] Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
         * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
         * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
         * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2005> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
         * @summary /fleet/vehicles/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<any>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).getVehiclesLocations(accessToken, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all contacts for the organization.
         * @summary /contacts
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listContacts(accessToken: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Contact>> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).listContacts(accessToken, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
         * @summary /fleet/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject10} groupParam 
         * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
         * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
         * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2002> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).listFleet(accessToken, groupParam, startingAfter, endingBefore, limit, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
         * @param {InlineObject16} data 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<FleetVehicleResponse> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {InlineObject4} reactivateDriverParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Driver> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {DispatchRoute} updateDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {InlineObject1} address 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).updateOrganizationAddress(accessToken, addressId, address, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
         * @summary /fleet/set_data
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject14} vehicleUpdateParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = FleetApiAxiosParamCreator(configuration).updateVehicles(accessToken, vehicleUpdateParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * FleetApi - factory interface
 * @export
 */
export const FleetApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * This method adds an address book entry to the specified group.
         * @summary /fleet/add_address
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject2} addressParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        addFleetAddress(accessToken: string, addressParam: InlineObject2, options?: any) {
            return FleetApiFp(configuration).addFleetAddress(accessToken, addressParam, options)(axios, basePath);
        },
        /**
         * Add one or more addresses to the organization
         * @summary /addresses
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject} addresses 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        addOrganizationAddresses(accessToken: string, addresses: InlineObject, options?: any) {
            return FleetApiFp(configuration).addOrganizationAddresses(accessToken, addresses, options)(axios, basePath);
        },
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
            return FleetApiFp(configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @param {string} accessToken Samsara API access token.
         * @param {DriverForCreate} createDriverParam Driver creation body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: any) {
            return FleetApiFp(configuration).createDriver(accessToken, createDriverParam, options)(axios, basePath);
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
            return FleetApiFp(configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Create a driver document for the given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver for whom the document is created.
         * @param {DocumentCreate} createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options?: any) {
            return FleetApiFp(configuration).createDriverDocument(accessToken, driverId, createDocumentParams, options)(axios, basePath);
        },
        /**
         * Create a new dvir, marking a vehicle or trailer safe or unsafe.
         * @summary /fleet/maintenance/dvirs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject12} createDvirParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDvir(accessToken: string, createDvirParam: InlineObject12, options?: any) {
            return FleetApiFp(configuration).createDvir(accessToken, createDvirParam, options)(axios, basePath);
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
            return FleetApiFp(configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: any) {
            return FleetApiFp(configuration).deactivateDriver(accessToken, driverIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options?: any) {
            return FleetApiFp(configuration).deleteDispatchRouteById(accessToken, routeId, options)(axios, basePath);
        },
        /**
         * Delete an address.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteOrganizationAddress(accessToken: string, addressId: number, options?: any) {
            return FleetApiFp(configuration).deleteOrganizationAddress(accessToken, addressId, options)(axios, basePath);
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: any) {
            return FleetApiFp(configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options)(axios, basePath);
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
         * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: any) {
            return FleetApiFp(configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options)(axios, basePath);
        },
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: any) {
            return FleetApiFp(configuration).getAllAssetCurrentLocations(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options?: any) {
            return FleetApiFp(configuration).getAllAssets(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: any) {
            return FleetApiFp(configuration).getAllDeactivatedDrivers(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
            return FleetApiFp(configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @param {string} accessToken Samsara API access token.
         * @param {number} assetId ID of the asset
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
            return FleetApiFp(configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
            return FleetApiFp(configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options?: any) {
            return FleetApiFp(configuration).getDispatchRouteById(accessToken, routeId, options)(axios, basePath);
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the route with history.
         * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
         * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: any) {
            return FleetApiFp(configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options)(axios, basePath);
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: any) {
            return FleetApiFp(configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options)(axios, basePath);
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: any) {
            return FleetApiFp(configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options)(axios, basePath);
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
            return FleetApiFp(configuration).getDriverById(accessToken, driverIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Fetch all of the document types.
         * @summary /fleet/drivers/document_types
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverDocumentTypesByOrgId(options?: any) {
            return FleetApiFp(configuration).getDriverDocumentTypesByOrgId(options)(axios, basePath);
        },
        /**
         * Fetch all of the documents.
         * @summary /fleet/drivers/documents
         * @param {string} accessToken Samsara API access token.
         * @param {number} [endMs] Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
         * @param {number} [durationMs] Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options?: any) {
            return FleetApiFp(configuration).getDriverDocumentsByOrgId(accessToken, endMs, durationMs, options)(axios, basePath);
        },
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @param {number} driverId ID of the driver
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
            return FleetApiFp(configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Get DVIRs for the org within provided time constraints
         * @summary /fleet/maintenance/dvirs
         * @param {string} accessToken Samsara API access token.
         * @param {number} endMs time in millis until the last dvir log.
         * @param {number} durationMs time in millis which corresponds to the duration before the end_ms.
         * @param {number} [groupId] Group ID to query.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options?: any) {
            return FleetApiFp(configuration).getDvirs(accessToken, endMs, durationMs, groupId, options)(axios, basePath);
        },
        /**
         * Get all the drivers for the specified group.
         * @summary /fleet/drivers
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject3} groupDriversParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options?: any) {
            return FleetApiFp(configuration).getFleetDrivers(accessToken, groupDriversParam, options)(axios, basePath);
        },
        /**
         * Get summarized daily HOS charts for a specified driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with HOS logs.
         * @param {InlineObject6} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options?: any) {
            return FleetApiFp(configuration).getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, options)(axios, basePath);
        },
        /**
         * Get the distance and time each driver in an organization has driven in a given time period.
         * @summary /fleet/drivers/summary
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject5} driversSummaryParam 
         * @param {boolean} [snapToDayBounds] Snap query result to HOS day boundaries.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options?: any) {
            return FleetApiFp(configuration).getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, options)(axios, basePath);
        },
        /**
         * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
         * @summary /fleet/hos_authentication_logs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject7} hosAuthenticationLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options?: any) {
            return FleetApiFp(configuration).getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, options)(axios, basePath);
        },
        /**
         * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
         * @summary /fleet/hos_logs
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject8} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options?: any) {
            return FleetApiFp(configuration).getFleetHosLogs(accessToken, hosLogsParam, options)(axios, basePath);
        },
        /**
         * Get the current HOS status for all drivers in the group.
         * @summary /fleet/hos_logs_summary
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject9} hosLogsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options?: any) {
            return FleetApiFp(configuration).getFleetHosLogsSummary(accessToken, hosLogsParam, options)(axios, basePath);
        },
        /**
         * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
         * @summary /fleet/locations
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject11} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetLocations(accessToken: string, groupParam: InlineObject11, options?: any) {
            return FleetApiFp(configuration).getFleetLocations(accessToken, groupParam, options)(axios, basePath);
        },
        /**
         * Get list of the vehicles with any engine faults or check light data.
         * @summary /fleet/maintenance/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject13} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options?: any) {
            return FleetApiFp(configuration).getFleetMaintenanceList(accessToken, groupParam, options)(axios, basePath);
        },
        /**
         * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
         * @summary /fleet/trips
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject15} tripsParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetTrips(accessToken: string, tripsParam: InlineObject15, options?: any) {
            return FleetApiFp(configuration).getFleetTrips(accessToken, tripsParam, options)(axios, basePath);
        },
        /**
         * Gets a specific vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options?: any) {
            return FleetApiFp(configuration).getFleetVehicle(accessToken, vehicleIdOrExternalId, options)(axios, basePath);
        },
        /**
         * Fetch an address by its id.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationAddress(accessToken: string, addressId: number, options?: any) {
            return FleetApiFp(configuration).getOrganizationAddress(accessToken, addressId, options)(axios, basePath);
        },
        /**
         * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
         * @summary /addresses
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationAddresses(accessToken: string, options?: any) {
            return FleetApiFp(configuration).getOrganizationAddresses(accessToken, options)(axios, basePath);
        },
        /**
         * Fetch a contact by its id.
         * @summary /contacts/{contact_id}
         * @param {string} accessToken Samsara API access token.
         * @param {number} contactId ID of the contact
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getOrganizationContact(accessToken: string, contactId: number, options?: any) {
            return FleetApiFp(configuration).getOrganizationContact(accessToken, contactId, options)(axios, basePath);
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: any) {
            return FleetApiFp(configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options)(axios, basePath);
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options?: any) {
            return FleetApiFp(configuration).getVehicleLocations(accessToken, vehicleId, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
            return FleetApiFp(configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
         * @summary /fleet/vehicles/stats
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query.
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query.
         * @param {'engineState' | 'auxInput1' | 'auxInput2'} [series] Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
         * @param {string} [tagIds] Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
         * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
         * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
         * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options?: any) {
            return FleetApiFp(configuration).getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, options)(axios, basePath);
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
         * @summary /fleet/vehicles/locations
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
         * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options?: any) {
            return FleetApiFp(configuration).getVehiclesLocations(accessToken, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch all contacts for the organization.
         * @summary /contacts
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listContacts(accessToken: string, options?: any) {
            return FleetApiFp(configuration).listContacts(accessToken, options)(axios, basePath);
        },
        /**
         * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
         * @summary /fleet/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject10} groupParam 
         * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
         * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
         * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options?: any) {
            return FleetApiFp(configuration).listFleet(accessToken, groupParam, startingAfter, endingBefore, limit, options)(axios, basePath);
        },
        /**
         * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
         * @param {InlineObject16} data 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options?: any) {
            return FleetApiFp(configuration).patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, options)(axios, basePath);
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
         * @param {InlineObject4} reactivateDriverParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: any) {
            return FleetApiFp(configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options)(axios, basePath);
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {DispatchRoute} updateDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: any) {
            return FleetApiFp(configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
         * @summary /addresses/{addressId}
         * @param {string} accessToken Samsara API access token.
         * @param {number} addressId ID of the address/geofence
         * @param {InlineObject1} address 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options?: any) {
            return FleetApiFp(configuration).updateOrganizationAddress(accessToken, addressId, address, options)(axios, basePath);
        },
        /**
         * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
         * @summary /fleet/set_data
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject14} vehicleUpdateParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options?: any) {
            return FleetApiFp(configuration).updateVehicles(accessToken, vehicleUpdateParam, options)(axios, basePath);
        },
    };
};

/**
 * FleetApi - object-oriented interface
 * @export
 * @class FleetApi
 * @extends {BaseAPI}
 */
export class FleetApi extends BaseAPI {
    /**
     * This method adds an address book entry to the specified group.
     * @summary /fleet/add_address
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject2} addressParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public addFleetAddress(accessToken: string, addressParam: InlineObject2, options?: any) {
        return FleetApiFp(this.configuration).addFleetAddress(accessToken, addressParam, options)(this.axios, this.basePath);
    }

    /**
     * Add one or more addresses to the organization
     * @summary /addresses
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject} addresses 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public addOrganizationAddresses(accessToken: string, addresses: InlineObject, options?: any) {
        return FleetApiFp(this.configuration).addOrganizationAddresses(accessToken, addresses, options)(this.axios, this.basePath);
    }

    /**
     * Create a new dispatch route.
     * @summary /fleet/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {DispatchRouteCreate} createDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
        return FleetApiFp(this.configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Create a new driver.
     * @summary /fleet/drivers/create
     * @param {string} accessToken Samsara API access token.
     * @param {DriverForCreate} createDriverParam Driver creation body
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: any) {
        return FleetApiFp(this.configuration).createDriver(accessToken, createDriverParam, options)(this.axios, this.basePath);
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} driverId ID of the driver with the associated routes.
     * @param {DispatchRouteCreate} createDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
        return FleetApiFp(this.configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Create a driver document for the given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
     * @param {string} accessToken Samsara API access token.
     * @param {number} driverId ID of the driver for whom the document is created.
     * @param {DocumentCreate} createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options?: any) {
        return FleetApiFp(this.configuration).createDriverDocument(accessToken, driverId, createDocumentParams, options)(this.axios, this.basePath);
    }

    /**
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @summary /fleet/maintenance/dvirs
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject12} createDvirParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public createDvir(accessToken: string, createDvirParam: InlineObject12, options?: any) {
        return FleetApiFp(this.configuration).createDvir(accessToken, createDvirParam, options)(this.axios, this.basePath);
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} vehicleId ID of the vehicle with the associated routes.
     * @param {DispatchRouteCreate} createDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
        return FleetApiFp(this.configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Deactivate a driver with the given id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: any) {
        return FleetApiFp(this.configuration).deactivateDriver(accessToken, driverIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the dispatch route.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public deleteDispatchRouteById(accessToken: string, routeId: number, options?: any) {
        return FleetApiFp(this.configuration).deleteDispatchRouteById(accessToken, routeId, options)(this.axios, this.basePath);
    }

    /**
     * Delete an address.
     * @summary /addresses/{addressId}
     * @param {string} accessToken Samsara API access token.
     * @param {number} addressId ID of the address/geofence
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public deleteOrganizationAddress(accessToken: string, addressId: number, options?: any) {
        return FleetApiFp(this.configuration).deleteOrganizationAddress(accessToken, addressId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * @summary /fleet/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: any) {
        return FleetApiFp(this.configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @summary /fleet/dispatch/routes/job_updates
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: any) {
        return FleetApiFp(this.configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options)(this.axios, this.basePath);
    }

    /**
     * Fetch current locations of all assets for the group.
     * @summary /fleet/assets/locations
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: any) {
        return FleetApiFp(this.configuration).getAllAssetCurrentLocations(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the assets for the group.
     * @summary /fleet/assets
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getAllAssets(accessToken: string, groupId?: number, options?: any) {
        return FleetApiFp(this.configuration).getAllAssets(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all deactivated drivers for the group.
     * @summary /fleet/drivers/inactive
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: any) {
        return FleetApiFp(this.configuration).getAllDeactivatedDrivers(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the historical locations for the asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/locations
     * @param {string} accessToken Samsara API access token.
     * @param {number} assetId ID of the asset
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
        return FleetApiFp(this.configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the reefer-specific stats of an asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/reefer
     * @param {string} accessToken Samsara API access token.
     * @param {number} assetId ID of the asset
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: any) {
        return FleetApiFp(this.configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch deactivated driver by id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
        return FleetApiFp(this.configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch a dispatch route by id.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the dispatch route.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDispatchRouteById(accessToken: string, routeId: number, options?: any) {
        return FleetApiFp(this.configuration).getDispatchRouteById(accessToken, routeId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the history of a dispatch route.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the route with history.
     * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: any) {
        return FleetApiFp(this.configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} driverId ID of the driver with the associated routes.
     * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: any) {
        return FleetApiFp(this.configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} vehicleId ID of the vehicle with the associated routes.
     * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: any) {
        return FleetApiFp(this.configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options)(this.axios, this.basePath);
    }

    /**
     * Fetch driver by id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDriverById(accessToken: string, driverIdOrExternalId: string, options?: any) {
        return FleetApiFp(this.configuration).getDriverById(accessToken, driverIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the document types.
     * @summary /fleet/drivers/document_types
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDriverDocumentTypesByOrgId(options?: any) {
        return FleetApiFp(this.configuration).getDriverDocumentTypesByOrgId(options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the documents.
     * @summary /fleet/drivers/documents
     * @param {string} accessToken Samsara API access token.
     * @param {number} [endMs] Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
     * @param {number} [durationMs] Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options?: any) {
        return FleetApiFp(this.configuration).getDriverDocumentsByOrgId(accessToken, endMs, durationMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the safety score for the driver.
     * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
     * @param {number} driverId ID of the driver
     * @param {string} accessToken Samsara API access token.
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
        return FleetApiFp(this.configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Get DVIRs for the org within provided time constraints
     * @summary /fleet/maintenance/dvirs
     * @param {string} accessToken Samsara API access token.
     * @param {number} endMs time in millis until the last dvir log.
     * @param {number} durationMs time in millis which corresponds to the duration before the end_ms.
     * @param {number} [groupId] Group ID to query.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options?: any) {
        return FleetApiFp(this.configuration).getDvirs(accessToken, endMs, durationMs, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Get all the drivers for the specified group.
     * @summary /fleet/drivers
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject3} groupDriversParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options?: any) {
        return FleetApiFp(this.configuration).getFleetDrivers(accessToken, groupDriversParam, options)(this.axios, this.basePath);
    }

    /**
     * Get summarized daily HOS charts for a specified driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * @param {string} accessToken Samsara API access token.
     * @param {number} driverId ID of the driver with HOS logs.
     * @param {InlineObject6} hosLogsParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options?: any) {
        return FleetApiFp(this.configuration).getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, options)(this.axios, this.basePath);
    }

    /**
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @summary /fleet/drivers/summary
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject5} driversSummaryParam 
     * @param {boolean} [snapToDayBounds] Snap query result to HOS day boundaries.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options?: any) {
        return FleetApiFp(this.configuration).getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, options)(this.axios, this.basePath);
    }

    /**
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @summary /fleet/hos_authentication_logs
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject7} hosAuthenticationLogsParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options?: any) {
        return FleetApiFp(this.configuration).getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, options)(this.axios, this.basePath);
    }

    /**
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @summary /fleet/hos_logs
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject8} hosLogsParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options?: any) {
        return FleetApiFp(this.configuration).getFleetHosLogs(accessToken, hosLogsParam, options)(this.axios, this.basePath);
    }

    /**
     * Get the current HOS status for all drivers in the group.
     * @summary /fleet/hos_logs_summary
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject9} hosLogsParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options?: any) {
        return FleetApiFp(this.configuration).getFleetHosLogsSummary(accessToken, hosLogsParam, options)(this.axios, this.basePath);
    }

    /**
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @summary /fleet/locations
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject11} groupParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetLocations(accessToken: string, groupParam: InlineObject11, options?: any) {
        return FleetApiFp(this.configuration).getFleetLocations(accessToken, groupParam, options)(this.axios, this.basePath);
    }

    /**
     * Get list of the vehicles with any engine faults or check light data.
     * @summary /fleet/maintenance/list
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject13} groupParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options?: any) {
        return FleetApiFp(this.configuration).getFleetMaintenanceList(accessToken, groupParam, options)(this.axios, this.basePath);
    }

    /**
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @summary /fleet/trips
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject15} tripsParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetTrips(accessToken: string, tripsParam: InlineObject15, options?: any) {
        return FleetApiFp(this.configuration).getFleetTrips(accessToken, tripsParam, options)(this.axios, this.basePath);
    }

    /**
     * Gets a specific vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options?: any) {
        return FleetApiFp(this.configuration).getFleetVehicle(accessToken, vehicleIdOrExternalId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch an address by its id.
     * @summary /addresses/{addressId}
     * @param {string} accessToken Samsara API access token.
     * @param {number} addressId ID of the address/geofence
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getOrganizationAddress(accessToken: string, addressId: number, options?: any) {
        return FleetApiFp(this.configuration).getOrganizationAddress(accessToken, addressId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @summary /addresses
     * @param {string} accessToken Samsara API access token.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getOrganizationAddresses(accessToken: string, options?: any) {
        return FleetApiFp(this.configuration).getOrganizationAddresses(accessToken, options)(this.axios, this.basePath);
    }

    /**
     * Fetch a contact by its id.
     * @summary /contacts/{contact_id}
     * @param {string} accessToken Samsara API access token.
     * @param {number} contactId ID of the contact
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getOrganizationContact(accessToken: string, contactId: number, options?: any) {
        return FleetApiFp(this.configuration).getOrganizationContact(accessToken, contactId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch harsh event details for a vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * @param {number} vehicleId ID of the vehicle
     * @param {string} accessToken Samsara API access token.
     * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: any) {
        return FleetApiFp(this.configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options)(this.axios, this.basePath);
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * @param {string} accessToken Samsara API access token.
     * @param {number} vehicleId ID of the vehicle with the associated routes.
     * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
     * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options?: any) {
        return FleetApiFp(this.configuration).getVehicleLocations(accessToken, vehicleId, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the safety score for the vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * @param {number} vehicleId ID of the vehicle
     * @param {string} accessToken Samsara API access token.
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
        return FleetApiFp(this.configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @summary /fleet/vehicles/stats
     * @param {string} accessToken Samsara API access token.
     * @param {number} startMs Time in Unix epoch milliseconds for the start of the query.
     * @param {number} endMs Time in Unix epoch milliseconds for the end of the query.
     * @param {'engineState' | 'auxInput1' | 'auxInput2'} [series] Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
     * @param {string} [tagIds] Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
     * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options?: any) {
        return FleetApiFp(this.configuration).getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, options)(this.axios, this.basePath);
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @summary /fleet/vehicles/locations
     * @param {string} accessToken Samsara API access token.
     * @param {number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
     * @param {number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options?: any) {
        return FleetApiFp(this.configuration).getVehiclesLocations(accessToken, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all contacts for the organization.
     * @summary /contacts
     * @param {string} accessToken Samsara API access token.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public listContacts(accessToken: string, options?: any) {
        return FleetApiFp(this.configuration).listContacts(accessToken, options)(this.axios, this.basePath);
    }

    /**
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @summary /fleet/list
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject10} groupParam 
     * @param {string} [startingAfter] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param {string} [endingBefore] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param {number} [limit] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options?: any) {
        return FleetApiFp(this.configuration).listFleet(accessToken, groupParam, startingAfter, endingBefore, limit, options)(this.axios, this.basePath);
    }

    /**
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param {InlineObject16} data 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options?: any) {
        return FleetApiFp(this.configuration).patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, options)(this.axios, this.basePath);
    }

    /**
     * Reactivate the inactive driver having id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {string} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {InlineObject4} reactivateDriverParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: any) {
        return FleetApiFp(this.configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options)(this.axios, this.basePath);
    }

    /**
     * Update a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the dispatch route.
     * @param {DispatchRoute} updateDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: any) {
        return FleetApiFp(this.configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @summary /addresses/{addressId}
     * @param {string} accessToken Samsara API access token.
     * @param {number} addressId ID of the address/geofence
     * @param {InlineObject1} address 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options?: any) {
        return FleetApiFp(this.configuration).updateOrganizationAddress(accessToken, addressId, address, options)(this.axios, this.basePath);
    }

    /**
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @summary /fleet/set_data
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject14} vehicleUpdateParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FleetApi
     */
    public updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options?: any) {
        return FleetApiFp(this.configuration).updateVehicles(accessToken, vehicleUpdateParam, options)(this.axios, this.basePath);
    }

}

/**
 * IndustrialApi - axios parameter creator
 * @export
 */
export const IndustrialApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetch all of the data inputs for a group.
         * @summary /industrial/data
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
         * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllDataInputs.');
            }
            const localVarPath = `/industrial/data`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch datapoints from a given data input.
         * @summary /industrial/data/{data_input_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} dataInputId ID of the data input
         * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
         * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDataInput.');
            }
            // verify required parameter 'dataInputId' is not null or undefined
            if (dataInputId === null || dataInputId === undefined) {
                throw new RequiredError('dataInputId','Required parameter dataInputId was null or undefined when calling getDataInput.');
            }
            const localVarPath = `/industrial/data/{data_input_id}`
                .replace(`{${"data_input_id"}}`, encodeURIComponent(String(dataInputId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
         * @summary /machines/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject18} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMachines(accessToken: string, groupParam: InlineObject18, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getMachines.');
            }
            // verify required parameter 'groupParam' is not null or undefined
            if (groupParam === null || groupParam === undefined) {
                throw new RequiredError('groupParam','Required parameter groupParam was null or undefined when calling getMachines.');
            }
            const localVarPath = `/machines/list`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject18" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(groupParam || {}) : (groupParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
         * @summary /machines/history
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject17} historyParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMachinesHistory(accessToken: string, historyParam: InlineObject17, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getMachinesHistory.');
            }
            // verify required parameter 'historyParam' is not null or undefined
            if (historyParam === null || historyParam === undefined) {
                throw new RequiredError('historyParam','Required parameter historyParam was null or undefined when calling getMachinesHistory.');
            }
            const localVarPath = `/machines/history`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject17" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(historyParam || {}) : (historyParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * IndustrialApi - functional programming interface
 * @export
 */
export const IndustrialApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Fetch all of the data inputs for a group.
         * @summary /industrial/data
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
         * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2006> {
            const localVarAxiosArgs = IndustrialApiAxiosParamCreator(configuration).getAllDataInputs(accessToken, groupId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch datapoints from a given data input.
         * @summary /industrial/data/{data_input_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} dataInputId ID of the data input
         * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
         * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DataInputHistoryResponse> {
            const localVarAxiosArgs = IndustrialApiAxiosParamCreator(configuration).getDataInput(accessToken, dataInputId, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
         * @summary /machines/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject18} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMachines(accessToken: string, groupParam: InlineObject18, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2007> {
            const localVarAxiosArgs = IndustrialApiAxiosParamCreator(configuration).getMachines(accessToken, groupParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
         * @summary /machines/history
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject17} historyParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMachinesHistory(accessToken: string, historyParam: InlineObject17, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<MachineHistoryResponse> {
            const localVarAxiosArgs = IndustrialApiAxiosParamCreator(configuration).getMachinesHistory(accessToken, historyParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * IndustrialApi - factory interface
 * @export
 */
export const IndustrialApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Fetch all of the data inputs for a group.
         * @summary /industrial/data
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
         * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options?: any) {
            return IndustrialApiFp(configuration).getAllDataInputs(accessToken, groupId, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch datapoints from a given data input.
         * @summary /industrial/data/{data_input_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} dataInputId ID of the data input
         * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
         * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options?: any) {
            return IndustrialApiFp(configuration).getDataInput(accessToken, dataInputId, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
         * @summary /machines/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject18} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMachines(accessToken: string, groupParam: InlineObject18, options?: any) {
            return IndustrialApiFp(configuration).getMachines(accessToken, groupParam, options)(axios, basePath);
        },
        /**
         * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
         * @summary /machines/history
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject17} historyParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMachinesHistory(accessToken: string, historyParam: InlineObject17, options?: any) {
            return IndustrialApiFp(configuration).getMachinesHistory(accessToken, historyParam, options)(axios, basePath);
        },
    };
};

/**
 * IndustrialApi - object-oriented interface
 * @export
 * @class IndustrialApi
 * @extends {BaseAPI}
 */
export class IndustrialApi extends BaseAPI {
    /**
     * Fetch all of the data inputs for a group.
     * @summary /industrial/data
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
     * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof IndustrialApi
     */
    public getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options?: any) {
        return IndustrialApiFp(this.configuration).getAllDataInputs(accessToken, groupId, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch datapoints from a given data input.
     * @summary /industrial/data/{data_input_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} dataInputId ID of the data input
     * @param {number} [startMs] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
     * @param {number} [endMs] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof IndustrialApi
     */
    public getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options?: any) {
        return IndustrialApiFp(this.configuration).getDataInput(accessToken, dataInputId, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * @summary /machines/list
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject18} groupParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof IndustrialApi
     */
    public getMachines(accessToken: string, groupParam: InlineObject18, options?: any) {
        return IndustrialApiFp(this.configuration).getMachines(accessToken, groupParam, options)(this.axios, this.basePath);
    }

    /**
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * @summary /machines/history
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject17} historyParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof IndustrialApi
     */
    public getMachinesHistory(accessToken: string, historyParam: InlineObject17, options?: any) {
        return IndustrialApiFp(this.configuration).getMachinesHistory(accessToken, historyParam, options)(this.axios, this.basePath);
    }

}

/**
 * RoutesApi - axios parameter creator
 * @export
 */
export const RoutesApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDispatchRoute.');
            }
            // verify required parameter 'createDispatchRouteParams' is not null or undefined
            if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
                throw new RequiredError('createDispatchRouteParams','Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
            }
            const localVarPath = `/fleet/dispatch/routes`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRouteCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (createDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
            }
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
            }
            // verify required parameter 'createDispatchRouteParams' is not null or undefined
            if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
                throw new RequiredError('createDispatchRouteParams','Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
            }
            const localVarPath = `/fleet/drivers/{driver_id}/dispatch/routes`
                .replace(`{${"driver_id"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRouteCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (createDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
            }
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
            }
            // verify required parameter 'createDispatchRouteParams' is not null or undefined
            if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
                throw new RequiredError('createDispatchRouteParams','Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id}/dispatch/routes`
                .replace(`{${"vehicle_id"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRouteCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (createDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
            }
            const localVarPath = `/fleet/dispatch/routes`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = duration;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
         * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
            }
            const localVarPath = `/fleet/dispatch/routes/job_updates`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }

            if (sequenceId !== undefined) {
                localVarQueryParameter['sequence_id'] = sequenceId;
            }

            if (include !== undefined) {
                localVarQueryParameter['include'] = include;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling getDispatchRouteById.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the route with history.
         * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
         * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}/history`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startTime !== undefined) {
                localVarQueryParameter['start_time'] = startTime;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
            }
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
            }
            const localVarPath = `/fleet/drivers/{driver_id}/dispatch/routes`
                .replace(`{${"driver_id"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = duration;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
            }
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
            }
            const localVarPath = `/fleet/vehicles/{vehicle_id}/dispatch/routes`
                .replace(`{${"vehicle_id"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = endTime;
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = duration;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {DispatchRoute} updateDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
            }
            // verify required parameter 'routeId' is not null or undefined
            if (routeId === null || routeId === undefined) {
                throw new RequiredError('routeId','Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
            }
            // verify required parameter 'updateDispatchRouteParams' is not null or undefined
            if (updateDispatchRouteParams === null || updateDispatchRouteParams === undefined) {
                throw new RequiredError('updateDispatchRouteParams','Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
            }
            const localVarPath = `/fleet/dispatch/routes/{route_id}`
                .replace(`{${"route_id"}}`, encodeURIComponent(String(routeId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"DispatchRoute" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(updateDispatchRouteParams || {}) : (updateDispatchRouteParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * RoutesApi - functional programming interface
 * @export
 */
export const RoutesApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).deleteDispatchRouteById(accessToken, routeId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DispatchRoute>> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
         * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<AllRouteJobUpdates> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).getDispatchRouteById(accessToken, routeId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the route with history.
         * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
         * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRouteHistory> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DispatchRoute>> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<DispatchRoute>> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {DispatchRoute} updateDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DispatchRoute> {
            const localVarAxiosArgs = RoutesApiAxiosParamCreator(configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * RoutesApi - factory interface
 * @export
 */
export const RoutesApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
            return RoutesApiFp(configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
            return RoutesApiFp(configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {DispatchRouteCreate} createDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
            return RoutesApiFp(configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options)(axios, basePath);
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options?: any) {
            return RoutesApiFp(configuration).deleteDispatchRouteById(accessToken, routeId, options)(axios, basePath);
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: any) {
            return RoutesApiFp(configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options)(axios, basePath);
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
         * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: any) {
            return RoutesApiFp(configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options)(axios, basePath);
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options?: any) {
            return RoutesApiFp(configuration).getDispatchRouteById(accessToken, routeId, options)(axios, basePath);
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the route with history.
         * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
         * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: any) {
            return RoutesApiFp(configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options)(axios, basePath);
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} driverId ID of the driver with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: any) {
            return RoutesApiFp(configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options)(axios, basePath);
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @param {string} accessToken Samsara API access token.
         * @param {number} vehicleId ID of the vehicle with the associated routes.
         * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
         * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: any) {
            return RoutesApiFp(configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options)(axios, basePath);
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @param {string} accessToken Samsara API access token.
         * @param {number} routeId ID of the dispatch route.
         * @param {DispatchRoute} updateDispatchRouteParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: any) {
            return RoutesApiFp(configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options)(axios, basePath);
        },
    };
};

/**
 * RoutesApi - object-oriented interface
 * @export
 * @class RoutesApi
 * @extends {BaseAPI}
 */
export class RoutesApi extends BaseAPI {
    /**
     * Create a new dispatch route.
     * @summary /fleet/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {DispatchRouteCreate} createDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
        return RoutesApiFp(this.configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} driverId ID of the driver with the associated routes.
     * @param {DispatchRouteCreate} createDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
        return RoutesApiFp(this.configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} vehicleId ID of the vehicle with the associated routes.
     * @param {DispatchRouteCreate} createDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: any) {
        return RoutesApiFp(this.configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options)(this.axios, this.basePath);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the dispatch route.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public deleteDispatchRouteById(accessToken: string, routeId: number, options?: any) {
        return RoutesApiFp(this.configuration).deleteDispatchRouteById(accessToken, routeId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * @summary /fleet/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: any) {
        return RoutesApiFp(this.configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @summary /fleet/dispatch/routes/job_updates
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {string} [sequenceId] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param {string} [include] Optionally set include&#x3D;route to include route object in response payload.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: any) {
        return RoutesApiFp(this.configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options)(this.axios, this.basePath);
    }

    /**
     * Fetch a dispatch route by id.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the dispatch route.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public getDispatchRouteById(accessToken: string, routeId: number, options?: any) {
        return RoutesApiFp(this.configuration).getDispatchRouteById(accessToken, routeId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the history of a dispatch route.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the route with history.
     * @param {number} [startTime] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param {number} [endTime] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: any) {
        return RoutesApiFp(this.configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} driverId ID of the driver with the associated routes.
     * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: any) {
        return RoutesApiFp(this.configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param {string} accessToken Samsara API access token.
     * @param {number} vehicleId ID of the vehicle with the associated routes.
     * @param {number} [endTime] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {number} [duration] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: any) {
        return RoutesApiFp(this.configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options)(this.axios, this.basePath);
    }

    /**
     * Update a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param {string} accessToken Samsara API access token.
     * @param {number} routeId ID of the dispatch route.
     * @param {DispatchRoute} updateDispatchRouteParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoutesApi
     */
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: any) {
        return RoutesApiFp(this.configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options)(this.axios, this.basePath);
    }

}

/**
 * SafetyApi - axios parameter creator
 * @export
 */
export const SafetyApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @param {number} driverId ID of the driver
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'driverId' is not null or undefined
            if (driverId === null || driverId === undefined) {
                throw new RequiredError('driverId','Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
            }
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
            }
            const localVarPath = `/fleet/drivers/{driverId}/safety/score`
                .replace(`{${"driverId"}}`, encodeURIComponent(String(driverId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options: any = {}): RequestArgs {
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
            }
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
            }
            // verify required parameter 'timestamp' is not null or undefined
            if (timestamp === null || timestamp === undefined) {
                throw new RequiredError('timestamp','Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
            }
            const localVarPath = `/fleet/vehicles/{vehicleId}/safety/harsh_event`
                .replace(`{${"vehicleId"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (timestamp !== undefined) {
                localVarQueryParameter['timestamp'] = timestamp;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options: any = {}): RequestArgs {
            // verify required parameter 'vehicleId' is not null or undefined
            if (vehicleId === null || vehicleId === undefined) {
                throw new RequiredError('vehicleId','Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
            }
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
            }
            // verify required parameter 'startMs' is not null or undefined
            if (startMs === null || startMs === undefined) {
                throw new RequiredError('startMs','Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
            }
            // verify required parameter 'endMs' is not null or undefined
            if (endMs === null || endMs === undefined) {
                throw new RequiredError('endMs','Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
            }
            const localVarPath = `/fleet/vehicles/{vehicleId}/safety/score`
                .replace(`{${"vehicleId"}}`, encodeURIComponent(String(vehicleId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = startMs;
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = endMs;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * SafetyApi - functional programming interface
 * @export
 */
export const SafetyApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @param {number} driverId ID of the driver
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DriverSafetyScoreResponse> {
            const localVarAxiosArgs = SafetyApiAxiosParamCreator(configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<VehicleHarshEventResponse> {
            const localVarAxiosArgs = SafetyApiAxiosParamCreator(configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<VehicleSafetyScoreResponse> {
            const localVarAxiosArgs = SafetyApiAxiosParamCreator(configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * SafetyApi - factory interface
 * @export
 */
export const SafetyApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @param {number} driverId ID of the driver
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
            return SafetyApiFp(configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options)(axios, basePath);
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: any) {
            return SafetyApiFp(configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options)(axios, basePath);
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @param {number} vehicleId ID of the vehicle
         * @param {string} accessToken Samsara API access token.
         * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
         * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
            return SafetyApiFp(configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options)(axios, basePath);
        },
    };
};

/**
 * SafetyApi - object-oriented interface
 * @export
 * @class SafetyApi
 * @extends {BaseAPI}
 */
export class SafetyApi extends BaseAPI {
    /**
     * Fetch the safety score for the driver.
     * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
     * @param {number} driverId ID of the driver
     * @param {string} accessToken Samsara API access token.
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SafetyApi
     */
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
        return SafetyApiFp(this.configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options)(this.axios, this.basePath);
    }

    /**
     * Fetch harsh event details for a vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * @param {number} vehicleId ID of the vehicle
     * @param {string} accessToken Samsara API access token.
     * @param {number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SafetyApi
     */
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: any) {
        return SafetyApiFp(this.configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options)(this.axios, this.basePath);
    }

    /**
     * Fetch the safety score for the vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * @param {number} vehicleId ID of the vehicle
     * @param {string} accessToken Samsara API access token.
     * @param {number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SafetyApi
     */
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: any) {
        return SafetyApiFp(this.configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options)(this.axios, this.basePath);
    }

}

/**
 * SensorsApi - axios parameter creator
 * @export
 */
export const SensorsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
         * @summary /sensors/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject23} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensors(accessToken: string, groupParam: InlineObject23, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getSensors.');
            }
            // verify required parameter 'groupParam' is not null or undefined
            if (groupParam === null || groupParam === undefined) {
                throw new RequiredError('groupParam','Required parameter groupParam was null or undefined when calling getSensors.');
            }
            const localVarPath = `/sensors/list`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject23" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(groupParam || {}) : (groupParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get cargo monitor status (empty / full) for requested sensors.
         * @summary /sensors/cargo
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject19} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getSensorsCargo.');
            }
            // verify required parameter 'sensorParam' is not null or undefined
            if (sensorParam === null || sensorParam === undefined) {
                throw new RequiredError('sensorParam','Required parameter sensorParam was null or undefined when calling getSensorsCargo.');
            }
            const localVarPath = `/sensors/cargo`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject19" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(sensorParam || {}) : (sensorParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get door monitor status (closed / open) for requested sensors.
         * @summary /sensors/door
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject20} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getSensorsDoor.');
            }
            // verify required parameter 'sensorParam' is not null or undefined
            if (sensorParam === null || sensorParam === undefined) {
                throw new RequiredError('sensorParam','Required parameter sensorParam was null or undefined when calling getSensorsDoor.');
            }
            const localVarPath = `/sensors/door`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject20" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(sensorParam || {}) : (sensorParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
         * @summary /sensors/history
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject21} historyParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsHistory(accessToken: string, historyParam: InlineObject21, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getSensorsHistory.');
            }
            // verify required parameter 'historyParam' is not null or undefined
            if (historyParam === null || historyParam === undefined) {
                throw new RequiredError('historyParam','Required parameter historyParam was null or undefined when calling getSensorsHistory.');
            }
            const localVarPath = `/sensors/history`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject21" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(historyParam || {}) : (historyParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
         * @summary /sensors/humidity
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject22} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getSensorsHumidity.');
            }
            // verify required parameter 'sensorParam' is not null or undefined
            if (sensorParam === null || sensorParam === undefined) {
                throw new RequiredError('sensorParam','Required parameter sensorParam was null or undefined when calling getSensorsHumidity.');
            }
            const localVarPath = `/sensors/humidity`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject22" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(sensorParam || {}) : (sensorParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
         * @summary /sensors/temperature
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject24} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getSensorsTemperature.');
            }
            // verify required parameter 'sensorParam' is not null or undefined
            if (sensorParam === null || sensorParam === undefined) {
                throw new RequiredError('sensorParam','Required parameter sensorParam was null or undefined when calling getSensorsTemperature.');
            }
            const localVarPath = `/sensors/temperature`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"InlineObject24" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(sensorParam || {}) : (sensorParam || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * SensorsApi - functional programming interface
 * @export
 */
export const SensorsApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
         * @summary /sensors/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject23} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensors(accessToken: string, groupParam: InlineObject23, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2008> {
            const localVarAxiosArgs = SensorsApiAxiosParamCreator(configuration).getSensors(accessToken, groupParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get cargo monitor status (empty / full) for requested sensors.
         * @summary /sensors/cargo
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject19} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<CargoResponse> {
            const localVarAxiosArgs = SensorsApiAxiosParamCreator(configuration).getSensorsCargo(accessToken, sensorParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get door monitor status (closed / open) for requested sensors.
         * @summary /sensors/door
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject20} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<DoorResponse> {
            const localVarAxiosArgs = SensorsApiAxiosParamCreator(configuration).getSensorsDoor(accessToken, sensorParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
         * @summary /sensors/history
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject21} historyParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsHistory(accessToken: string, historyParam: InlineObject21, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<SensorHistoryResponse> {
            const localVarAxiosArgs = SensorsApiAxiosParamCreator(configuration).getSensorsHistory(accessToken, historyParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
         * @summary /sensors/humidity
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject22} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<HumidityResponse> {
            const localVarAxiosArgs = SensorsApiAxiosParamCreator(configuration).getSensorsHumidity(accessToken, sensorParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
         * @summary /sensors/temperature
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject24} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<TemperatureResponse> {
            const localVarAxiosArgs = SensorsApiAxiosParamCreator(configuration).getSensorsTemperature(accessToken, sensorParam, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * SensorsApi - factory interface
 * @export
 */
export const SensorsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
         * @summary /sensors/list
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject23} groupParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensors(accessToken: string, groupParam: InlineObject23, options?: any) {
            return SensorsApiFp(configuration).getSensors(accessToken, groupParam, options)(axios, basePath);
        },
        /**
         * Get cargo monitor status (empty / full) for requested sensors.
         * @summary /sensors/cargo
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject19} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options?: any) {
            return SensorsApiFp(configuration).getSensorsCargo(accessToken, sensorParam, options)(axios, basePath);
        },
        /**
         * Get door monitor status (closed / open) for requested sensors.
         * @summary /sensors/door
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject20} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options?: any) {
            return SensorsApiFp(configuration).getSensorsDoor(accessToken, sensorParam, options)(axios, basePath);
        },
        /**
         * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
         * @summary /sensors/history
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject21} historyParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsHistory(accessToken: string, historyParam: InlineObject21, options?: any) {
            return SensorsApiFp(configuration).getSensorsHistory(accessToken, historyParam, options)(axios, basePath);
        },
        /**
         * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
         * @summary /sensors/humidity
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject22} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options?: any) {
            return SensorsApiFp(configuration).getSensorsHumidity(accessToken, sensorParam, options)(axios, basePath);
        },
        /**
         * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
         * @summary /sensors/temperature
         * @param {string} accessToken Samsara API access token.
         * @param {InlineObject24} sensorParam 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options?: any) {
            return SensorsApiFp(configuration).getSensorsTemperature(accessToken, sensorParam, options)(axios, basePath);
        },
    };
};

/**
 * SensorsApi - object-oriented interface
 * @export
 * @class SensorsApi
 * @extends {BaseAPI}
 */
export class SensorsApi extends BaseAPI {
    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @summary /sensors/list
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject23} groupParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SensorsApi
     */
    public getSensors(accessToken: string, groupParam: InlineObject23, options?: any) {
        return SensorsApiFp(this.configuration).getSensors(accessToken, groupParam, options)(this.axios, this.basePath);
    }

    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     * @summary /sensors/cargo
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject19} sensorParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SensorsApi
     */
    public getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options?: any) {
        return SensorsApiFp(this.configuration).getSensorsCargo(accessToken, sensorParam, options)(this.axios, this.basePath);
    }

    /**
     * Get door monitor status (closed / open) for requested sensors.
     * @summary /sensors/door
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject20} sensorParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SensorsApi
     */
    public getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options?: any) {
        return SensorsApiFp(this.configuration).getSensorsDoor(accessToken, sensorParam, options)(this.axios, this.basePath);
    }

    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @summary /sensors/history
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject21} historyParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SensorsApi
     */
    public getSensorsHistory(accessToken: string, historyParam: InlineObject21, options?: any) {
        return SensorsApiFp(this.configuration).getSensorsHistory(accessToken, historyParam, options)(this.axios, this.basePath);
    }

    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @summary /sensors/humidity
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject22} sensorParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SensorsApi
     */
    public getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options?: any) {
        return SensorsApiFp(this.configuration).getSensorsHumidity(accessToken, sensorParam, options)(this.axios, this.basePath);
    }

    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @summary /sensors/temperature
     * @param {string} accessToken Samsara API access token.
     * @param {InlineObject24} sensorParam 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SensorsApi
     */
    public getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options?: any) {
        return SensorsApiFp(this.configuration).getSensorsTemperature(accessToken, sensorParam, options)(this.axios, this.basePath);
    }

}

/**
 * TagsApi - axios parameter creator
 * @export
 */
export const TagsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new tag for the group.
         * @summary /tags
         * @param {string} accessToken Samsara API access token.
         * @param {TagCreate} tagCreateParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTag(accessToken: string, tagCreateParams: TagCreate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling createTag.');
            }
            // verify required parameter 'tagCreateParams' is not null or undefined
            if (tagCreateParams === null || tagCreateParams === undefined) {
                throw new RequiredError('tagCreateParams','Required parameter tagCreateParams was null or undefined when calling createTag.');
            }
            const localVarPath = `/tags`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"TagCreate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(tagCreateParams || {}) : (tagCreateParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Permanently deletes a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTagById(accessToken: string, tagId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deleteTagById.');
            }
            // verify required parameter 'tagId' is not null or undefined
            if (tagId === null || tagId === undefined) {
                throw new RequiredError('tagId','Required parameter tagId was null or undefined when calling deleteTagById.');
            }
            const localVarPath = `/tags/{tag_id}`
                .replace(`{${"tag_id"}}`, encodeURIComponent(String(tagId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the tags for a group.
         * @summary /tags
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllTags(accessToken: string, groupId?: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllTags.');
            }
            const localVarPath = `/tags`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = groupId;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a tag by id.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTagById(accessToken: string, tagId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getTagById.');
            }
            // verify required parameter 'tagId' is not null or undefined
            if (tagId === null || tagId === undefined) {
                throw new RequiredError('tagId','Required parameter tagId was null or undefined when calling getTagById.');
            }
            const localVarPath = `/tags/{tag_id}`
                .replace(`{${"tag_id"}}`, encodeURIComponent(String(tagId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Add or delete specific members from a tag, or modify the name of a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {TagModify} tagModifyParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling modifyTagById.');
            }
            // verify required parameter 'tagId' is not null or undefined
            if (tagId === null || tagId === undefined) {
                throw new RequiredError('tagId','Required parameter tagId was null or undefined when calling modifyTagById.');
            }
            // verify required parameter 'tagModifyParams' is not null or undefined
            if (tagModifyParams === null || tagModifyParams === undefined) {
                throw new RequiredError('tagModifyParams','Required parameter tagModifyParams was null or undefined when calling modifyTagById.');
            }
            const localVarPath = `/tags/{tag_id}`
                .replace(`{${"tag_id"}}`, encodeURIComponent(String(tagId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PATCH', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"TagModify" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(tagModifyParams || {}) : (tagModifyParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {TagUpdate} updateTagParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling updateTagById.');
            }
            // verify required parameter 'tagId' is not null or undefined
            if (tagId === null || tagId === undefined) {
                throw new RequiredError('tagId','Required parameter tagId was null or undefined when calling updateTagById.');
            }
            // verify required parameter 'updateTagParams' is not null or undefined
            if (updateTagParams === null || updateTagParams === undefined) {
                throw new RequiredError('updateTagParams','Required parameter updateTagParams was null or undefined when calling updateTagById.');
            }
            const localVarPath = `/tags/{tag_id}`
                .replace(`{${"tag_id"}}`, encodeURIComponent(String(tagId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};
            const needsSerialization = (<any>"TagUpdate" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(updateTagParams || {}) : (updateTagParams || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * TagsApi - functional programming interface
 * @export
 */
export const TagsApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Create a new tag for the group.
         * @summary /tags
         * @param {string} accessToken Samsara API access token.
         * @param {TagCreate} tagCreateParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTag(accessToken: string, tagCreateParams: TagCreate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Tag> {
            const localVarAxiosArgs = TagsApiAxiosParamCreator(configuration).createTag(accessToken, tagCreateParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Permanently deletes a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTagById(accessToken: string, tagId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = TagsApiAxiosParamCreator(configuration).deleteTagById(accessToken, tagId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch all of the tags for a group.
         * @summary /tags
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllTags(accessToken: string, groupId?: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<InlineResponse2009> {
            const localVarAxiosArgs = TagsApiAxiosParamCreator(configuration).getAllTags(accessToken, groupId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Fetch a tag by id.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTagById(accessToken: string, tagId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Tag> {
            const localVarAxiosArgs = TagsApiAxiosParamCreator(configuration).getTagById(accessToken, tagId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Add or delete specific members from a tag, or modify the name of a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {TagModify} tagModifyParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Tag> {
            const localVarAxiosArgs = TagsApiAxiosParamCreator(configuration).modifyTagById(accessToken, tagId, tagModifyParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {TagUpdate} updateTagParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Tag> {
            const localVarAxiosArgs = TagsApiAxiosParamCreator(configuration).updateTagById(accessToken, tagId, updateTagParams, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * TagsApi - factory interface
 * @export
 */
export const TagsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Create a new tag for the group.
         * @summary /tags
         * @param {string} accessToken Samsara API access token.
         * @param {TagCreate} tagCreateParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTag(accessToken: string, tagCreateParams: TagCreate, options?: any) {
            return TagsApiFp(configuration).createTag(accessToken, tagCreateParams, options)(axios, basePath);
        },
        /**
         * Permanently deletes a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTagById(accessToken: string, tagId: number, options?: any) {
            return TagsApiFp(configuration).deleteTagById(accessToken, tagId, options)(axios, basePath);
        },
        /**
         * Fetch all of the tags for a group.
         * @summary /tags
         * @param {string} accessToken Samsara API access token.
         * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getAllTags(accessToken: string, groupId?: number, options?: any) {
            return TagsApiFp(configuration).getAllTags(accessToken, groupId, options)(axios, basePath);
        },
        /**
         * Fetch a tag by id.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTagById(accessToken: string, tagId: number, options?: any) {
            return TagsApiFp(configuration).getTagById(accessToken, tagId, options)(axios, basePath);
        },
        /**
         * Add or delete specific members from a tag, or modify the name of a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {TagModify} tagModifyParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options?: any) {
            return TagsApiFp(configuration).modifyTagById(accessToken, tagId, tagModifyParams, options)(axios, basePath);
        },
        /**
         * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
         * @summary /tags/{tag_id:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} tagId ID of the tag.
         * @param {TagUpdate} updateTagParams 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options?: any) {
            return TagsApiFp(configuration).updateTagById(accessToken, tagId, updateTagParams, options)(axios, basePath);
        },
    };
};

/**
 * TagsApi - object-oriented interface
 * @export
 * @class TagsApi
 * @extends {BaseAPI}
 */
export class TagsApi extends BaseAPI {
    /**
     * Create a new tag for the group.
     * @summary /tags
     * @param {string} accessToken Samsara API access token.
     * @param {TagCreate} tagCreateParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TagsApi
     */
    public createTag(accessToken: string, tagCreateParams: TagCreate, options?: any) {
        return TagsApiFp(this.configuration).createTag(accessToken, tagCreateParams, options)(this.axios, this.basePath);
    }

    /**
     * Permanently deletes a tag.
     * @summary /tags/{tag_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} tagId ID of the tag.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TagsApi
     */
    public deleteTagById(accessToken: string, tagId: number, options?: any) {
        return TagsApiFp(this.configuration).deleteTagById(accessToken, tagId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch all of the tags for a group.
     * @summary /tags
     * @param {string} accessToken Samsara API access token.
     * @param {number} [groupId] Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TagsApi
     */
    public getAllTags(accessToken: string, groupId?: number, options?: any) {
        return TagsApiFp(this.configuration).getAllTags(accessToken, groupId, options)(this.axios, this.basePath);
    }

    /**
     * Fetch a tag by id.
     * @summary /tags/{tag_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} tagId ID of the tag.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TagsApi
     */
    public getTagById(accessToken: string, tagId: number, options?: any) {
        return TagsApiFp(this.configuration).getTagById(accessToken, tagId, options)(this.axios, this.basePath);
    }

    /**
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @summary /tags/{tag_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} tagId ID of the tag.
     * @param {TagModify} tagModifyParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TagsApi
     */
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options?: any) {
        return TagsApiFp(this.configuration).modifyTagById(accessToken, tagId, tagModifyParams, options)(this.axios, this.basePath);
    }

    /**
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @summary /tags/{tag_id:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} tagId ID of the tag.
     * @param {TagUpdate} updateTagParams 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TagsApi
     */
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options?: any) {
        return TagsApiFp(this.configuration).updateTagById(accessToken, tagId, updateTagParams, options)(this.axios, this.basePath);
    }

}

/**
 * UsersApi - axios parameter creator
 * @export
 */
export const UsersApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Remove a user from the organization.
         * @summary /users/{userId:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} userId ID of the user.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteUserById(accessToken: string, userId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling deleteUserById.');
            }
            // verify required parameter 'userId' is not null or undefined
            if (userId === null || userId === undefined) {
                throw new RequiredError('userId','Required parameter userId was null or undefined when calling deleteUserById.');
            }
            const localVarPath = `/users/{userId}`
                .replace(`{${"userId"}}`, encodeURIComponent(String(userId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get a user.
         * @summary /users/{userId:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} userId ID of the user.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUserById(accessToken: string, userId: number, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getUserById.');
            }
            // verify required parameter 'userId' is not null or undefined
            if (userId === null || userId === undefined) {
                throw new RequiredError('userId','Required parameter userId was null or undefined when calling getUserById.');
            }
            const localVarPath = `/users/{userId}`
                .replace(`{${"userId"}}`, encodeURIComponent(String(userId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get all roles in the organization.
         * @summary /user_roles
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUserRoles(accessToken: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listUserRoles.');
            }
            const localVarPath = `/user_roles`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * List all users in the organization.
         * @summary /users
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUsers(accessToken: string, options: any = {}): RequestArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listUsers.');
            }
            const localVarPath = `/users`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = accessToken;
            }


                localVarUrlObj.query = {...localVarUrlObj.query, ...localVarQueryParameter, ...options.query};
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...options.headers};

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * UsersApi - functional programming interface
 * @export
 */
export const UsersApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Remove a user from the organization.
         * @summary /users/{userId:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} userId ID of the user.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteUserById(accessToken: string, userId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Response> {
            const localVarAxiosArgs = UsersApiAxiosParamCreator(configuration).deleteUserById(accessToken, userId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get a user.
         * @summary /users/{userId:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} userId ID of the user.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUserById(accessToken: string, userId: number, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<User> {
            const localVarAxiosArgs = UsersApiAxiosParamCreator(configuration).getUserById(accessToken, userId, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * Get all roles in the organization.
         * @summary /user_roles
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUserRoles(accessToken: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<UserRole>> {
            const localVarAxiosArgs = UsersApiAxiosParamCreator(configuration).listUserRoles(accessToken, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
        /**
         * List all users in the organization.
         * @summary /users
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUsers(accessToken: string, options?: any): (axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<User>> {
            const localVarAxiosArgs = UsersApiAxiosParamCreator(configuration).listUsers(accessToken, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);                
            };
        },
    }
};

/**
 * UsersApi - factory interface
 * @export
 */
export const UsersApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Remove a user from the organization.
         * @summary /users/{userId:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} userId ID of the user.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteUserById(accessToken: string, userId: number, options?: any) {
            return UsersApiFp(configuration).deleteUserById(accessToken, userId, options)(axios, basePath);
        },
        /**
         * Get a user.
         * @summary /users/{userId:[0-9]+}
         * @param {string} accessToken Samsara API access token.
         * @param {number} userId ID of the user.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUserById(accessToken: string, userId: number, options?: any) {
            return UsersApiFp(configuration).getUserById(accessToken, userId, options)(axios, basePath);
        },
        /**
         * Get all roles in the organization.
         * @summary /user_roles
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUserRoles(accessToken: string, options?: any) {
            return UsersApiFp(configuration).listUserRoles(accessToken, options)(axios, basePath);
        },
        /**
         * List all users in the organization.
         * @summary /users
         * @param {string} accessToken Samsara API access token.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUsers(accessToken: string, options?: any) {
            return UsersApiFp(configuration).listUsers(accessToken, options)(axios, basePath);
        },
    };
};

/**
 * UsersApi - object-oriented interface
 * @export
 * @class UsersApi
 * @extends {BaseAPI}
 */
export class UsersApi extends BaseAPI {
    /**
     * Remove a user from the organization.
     * @summary /users/{userId:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} userId ID of the user.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UsersApi
     */
    public deleteUserById(accessToken: string, userId: number, options?: any) {
        return UsersApiFp(this.configuration).deleteUserById(accessToken, userId, options)(this.axios, this.basePath);
    }

    /**
     * Get a user.
     * @summary /users/{userId:[0-9]+}
     * @param {string} accessToken Samsara API access token.
     * @param {number} userId ID of the user.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UsersApi
     */
    public getUserById(accessToken: string, userId: number, options?: any) {
        return UsersApiFp(this.configuration).getUserById(accessToken, userId, options)(this.axios, this.basePath);
    }

    /**
     * Get all roles in the organization.
     * @summary /user_roles
     * @param {string} accessToken Samsara API access token.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UsersApi
     */
    public listUserRoles(accessToken: string, options?: any) {
        return UsersApiFp(this.configuration).listUserRoles(accessToken, options)(this.axios, this.basePath);
    }

    /**
     * List all users in the organization.
     * @summary /users
     * @param {string} accessToken Samsara API access token.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UsersApi
     */
    public listUsers(accessToken: string, options?: any) {
        return UsersApiFp(this.configuration).listUsers(accessToken, options)(this.axios, this.basePath);
    }

}

