// @flow
/* eslint-disable no-use-before-define */
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


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH: string = "https://api.samsara.com/v1".replace(/\/+$/, "");

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
 */
export type FetchAPI = {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 */
export type FetchArgs = {
    url: string;
    options: {};
}


/**
 *
 * @export
 */
export type RequestOptions = {
    headers?: {};
    query?: {};
    body?: string | FormData;
}

/**
 * * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name:string = "RequiredError"
    constructor(field: string, msg?: string) {
        super(msg);
    }
}

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 * @export
 */
export type Address = {
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
 */
export type AddressGeofence = {
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
 */
export type AddressGeofenceCircle = {
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
 */
export type AddressGeofencePolygon = {
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
 */
export type AddressGeofencePolygonVertices = {
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
 */
export type AddressesAddresses = {
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
 */
export type AllRouteJobUpdates = {
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
 */
export type Asset = {
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
 */
export type AssetCable = {
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
 */
export type AssetCurrentLocation = {
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
 */
export type AssetCurrentLocationsResponse = {
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
 */
export type AssetReeferResponse = {
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
 */
export type AssetReeferResponseReeferStats = {
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
 */
export type AssetReeferResponseReeferStatsAlarms = {
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
 */
export type AssetReeferResponseReeferStatsAlarms1 = {
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
 */
export type AssetReeferResponseReeferStatsEngineHours = {
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
 */
export type AssetReeferResponseReeferStatsFuelPercentage = {
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
 */
export type AssetReeferResponseReeferStatsPowerStatus = {
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
 */
export type AssetReeferResponseReeferStatsReturnAirTemp = {
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
 */
export type AssetReeferResponseReeferStatsSetPoint = {
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
 */
export type AuxInput = {
    /**
     * Timestamp in Unix epoch milliseconds.
     * @type {Object}
     * @memberof AuxInput
     */
    timeMs: Object;
    /**
     * Boolean representing the digital value of the aux input.
     * @type {boolean}
     * @memberof AuxInput
     */
    value: boolean;
}



            export type AuxInputSeriesNameEnum = 'Emergency Lights' | 'Emergency Alarm' | 'Stop Paddle' | 'Power Take-Off' | 'Plow' | 'Sweeper' | 'Salter' | 'Boom';
/**
 * A list of aux input values over a timerange.
 * @export
 */
export type AuxInputSeries = {
    /**
     * The name of the aux input.
     * @type {string}
     * @memberof AuxInputSeries
     */
    name: AuxInputSeriesNameEnum;
    /**
     * 
     * @type {Array<AuxInput>}
     * @memberof AuxInputSeries
     */
    values: Array<AuxInput>;
}


/**
 * Contains the current cargo status of a sensor.
 * @export
 */
export type CargoResponse = {
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
 */
export type CargoResponseSensors = {
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
 */
export type Contact = {
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
 */
export type CurrentDriver = {
}


/**
 * 
 * @export
 */
export type DataInputHistoryResponse = {
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
 */
export type DataInputHistoryResponsePoints = {
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
 */
export type DispatchJob = {
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
 */
export type DispatchJobCreate = {
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
 */
export type DispatchRoute = {
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
 */
export type DispatchRouteBase = {
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
 */
export type DispatchRouteCreate = {
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
 */
export type DispatchRouteHistoricalEntry = {
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
 */
export type DispatchRouteHistory = {
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
 */
export type Document = {
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
 */
export type DocumentBase = {
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
 */
export type DocumentCreate = {
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
 */
export type DocumentField = {
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
     * @type {Object}
     * @memberof DocumentField
     */
    value?: Object;
}


/**
 * 
 * @export
 */
export type DocumentFieldCreate = {
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
 */
export type DocumentFieldCreatePhotoValue = {
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
 */
export type DocumentFieldType = {
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
 */
export type DocumentFieldTypeNumberValueTypeMetadata = {
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
 */
export type DocumentType = {
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
 */
export type DoorResponse = {
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
 */
export type DoorResponseSensors = {
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
 */
export type Driver = {
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
 */
export type DriverBase = {
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
 */
export type DriverDailyLogResponse = {
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
 */
export type DriverDailyLogResponseDays = {
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
     * @type {Object}
     * @memberof DriverDailyLogResponseDays
     */
    trailerIds?: Object;
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
     * @type {Object}
     * @memberof DriverDailyLogResponseDays
     */
    vehicleIds?: Object;
}


/**
 * 
 * @export
 */
export type DriverForCreate = {
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
 */
export type DriverSafetyScoreResponse = {
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
 */
export type DriversResponse = {
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
 */
export type DriversSummaryResponse = {
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
 */
export type DriversSummaryResponseSummaries = {
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
 */
export type DvirBase = {
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
 */
export type DvirBaseAuthorSignature = {
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
 */
export type DvirBaseMechanicOrAgentSignature = {
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
 */
export type DvirBaseNextDriverSignature = {
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
 */
export type DvirBaseTrailerDefects = {
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
 */
export type DvirBaseVehicle = {
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
 */
export type DvirListResponse = {
    /**
     * 
     * @type {Array<DvirBase>}
     * @memberof DvirListResponse
     */
    dvirs?: Array<DvirBase>;
}



            export type EngineStateValueEnum = 'Running' | 'Off' | 'Idle';
/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 * @export
 */
export type EngineState = {
    /**
     * Timestamp in Unix epoch milliseconds.
     * @type {Object}
     * @memberof EngineState
     */
    timeMs: Object;
    /**
     * 
     * @type {string}
     * @memberof EngineState
     */
    value: EngineStateValueEnum;
}


/**
 * Contains the location and speed of a vehicle at a particular time
 * @export
 */
export type FleetVehicleLocation = {
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
 */
export type FleetVehicleResponse = {
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
 */
export type FleetVehicleResponseVehicleInfo = {
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
 */
export type HosAuthenticationLogsResponse = {
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
 */
export type HosAuthenticationLogsResponseAuthenticationLogs = {
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
 */
export type HosLogsResponse = {
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
 */
export type HosLogsResponseLogs = {
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
 */
export type HosLogsSummaryResponse = {
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
 */
export type HosLogsSummaryResponseDrivers = {
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
 */
export type HumidityResponse = {
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
 */
export type HumidityResponseSensors = {
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
 */
export type InlineObject = {
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
 */
export type InlineObject1 = {
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
 */
export type InlineObject10 = {
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
 */
export type InlineObject11 = {
    /**
     * Group ID to query.
     * @type {number}
     * @memberof InlineObject11
     */
    groupId: number;
}



            export type InlineObject12InspectionTypeEnum = 'mechanic';

            export type InlineObject12SafeEnum = 'safe' | 'unsafe';
/**
 * 
 * @export
 */
export type InlineObject12 = {
    /**
     * Only type 'mechanic' is currently accepted.
     * @type {string}
     * @memberof InlineObject12
     */
    inspectionType: InlineObject12InspectionTypeEnum;
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
    safe: InlineObject12SafeEnum;
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
 * 
 * @export
 */
export type InlineObject13 = {
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
 */
export type InlineObject14 = {
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
 */
export type InlineObject15 = {
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
 */
export type InlineObject16 = {
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
 */
export type InlineObject17 = {
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
 */
export type InlineObject18 = {
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
 */
export type InlineObject19 = {
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
 */
export type InlineObject2 = {
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
 */
export type InlineObject20 = {
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



            export type InlineObject21FillMissingEnum = 'withNull' | 'withPrevious';
/**
 * 
 * @export
 */
export type InlineObject21 = {
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
    fillMissing?: InlineObject21FillMissingEnum;
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
 * 
 * @export
 */
export type InlineObject22 = {
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
 */
export type InlineObject23 = {
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
 */
export type InlineObject24 = {
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
 */
export type InlineObject3 = {
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
 */
export type InlineObject4 = {
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
 */
export type InlineObject5 = {
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
 */
export type InlineObject6 = {
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
 */
export type InlineObject7 = {
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
 */
export type InlineObject8 = {
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
 */
export type InlineObject9 = {
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
 */
export type InlineResponse200 = {
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
 */
export type InlineResponse2001 = {
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
 */
export type InlineResponse2002 = {
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
 */
export type InlineResponse2003 = {
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
 */
export type InlineResponse2004 = {
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
 */
export type InlineResponse2005 = {
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
 */
export type InlineResponse2005VehicleStats = {
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
 */
export type InlineResponse2006 = {
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
 */
export type InlineResponse2007 = {
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
 */
export type InlineResponse2008 = {
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
 */
export type InlineResponse2009 = {
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
export type JobStatus = 'JobState_Unassigned' | 'JobState_Scheduled' | 'JobState_EnRoute' | 'JobState_Arrived' | 'JobState_Completed' | 'JobState_Skipped';

/**
 * 
 * @export
 */
export type JobUpdateObject = {
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
 */
export type Machine = {
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
 */
export type MachineHistoryResponse = {
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
 */
export type MachineHistoryResponseMachines = {
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
 */
export type MachineHistoryResponseVibrations = {
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
 */
export type Pagination = {
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
export type PrevJobStatus = 'JobState_Unassigned' | 'JobState_Scheduled' | 'JobState_EnRoute' | 'JobState_Arrived' | 'JobState_Completed' | 'JobState_Skipped';

/**
 * List of harsh events
 * @export
 */
export type SafetyReportHarshEvent = {
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
 */
export type Sensor = {
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
 */
export type SensorHistoryResponse = {
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
 */
export type SensorHistoryResponseResults = {
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



            export type SensorsHistorySeriesFieldEnum = 'ambientTemperature' | 'probeTemperature' | 'currentLoop1Raw' | 'currentLoop1Mapped' | 'currentLoop2Raw' | 'currentLoop2Mapped' | 'pmPowerTotal' | 'pmPhase1Power' | 'pmPhase2Power' | 'pmPhase3Power' | 'pmPhase1PowerFactor' | 'pmPhase2PowerFactor' | 'pmPhase3PowerFactor';
/**
 * Sensor ID and field to query.
 * @export
 */
export type SensorsHistorySeries = {
    /**
     * Field to query.
     * @type {string}
     * @memberof SensorsHistorySeries
     */
    field: SensorsHistorySeriesFieldEnum;
    /**
     * Sensor ID to query.
     * @type {number}
     * @memberof SensorsHistorySeries
     */
    widgetId: number;
}


/**
 * 
 * @export
 */
export type Tag = {
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
 */
export type TagCreate = {
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
 */
export type TagMetadata = {
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
 */
export type TagModify = {
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
 */
export type TagModifyAdd = {
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
 */
export type TagModifyDelete = {
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
 */
export type TagUpdate = {
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
 */
export type TaggedAddress = {
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
 */
export type TaggedAddressBase = {
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
 */
export type TaggedAsset = {
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
 */
export type TaggedAssetBase = {
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
 */
export type TaggedDriver = {
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
 */
export type TaggedDriverBase = {
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
 */
export type TaggedMachine = {
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
 */
export type TaggedMachineBase = {
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
 */
export type TaggedSensor = {
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
 */
export type TaggedSensorBase = {
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
 */
export type TaggedVehicle = {
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
 */
export type TaggedVehicleBase = {
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
 */
export type TemperatureResponse = {
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
 */
export type TemperatureResponseSensors = {
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
 */
export type TripResponse = {
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
 */
export type TripResponseEndCoordinates = {
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
 */
export type TripResponseStartCoordinates = {
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
 */
export type TripResponseTrips = {
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



            export type UserAuthTypeEnum = 'default' | 'saml';
/**
 * 
 * @export
 */
export type User = {
    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     * @type {string}
     * @memberof User
     */
    authType: UserAuthTypeEnum;
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



            export type UserBaseAuthTypeEnum = 'default' | 'saml';
/**
 * 
 * @export
 */
export type UserBase = {
    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     * @type {string}
     * @memberof UserBase
     */
    authType: UserBaseAuthTypeEnum;
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
 * 
 * @export
 */
export type UserRole = {
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
 */
export type UserTagRole = {
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
 */
export type UserTagRoleTag = {
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
 */
export type Vehicle = {
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
 */
export type VehicleHarshEventResponse = {
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
 */
export type VehicleHarshEventResponseLocation = {
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
 */
export type VehicleLocation = {
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
 */
export type VehicleMaintenance = {
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
 */
export type VehicleMaintenanceJ1939 = {
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
 */
export type VehicleMaintenanceJ1939CheckEngineLight = {
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
 */
export type VehicleMaintenanceJ1939DiagnosticTroubleCodes = {
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
 */
export type VehicleMaintenancePassenger = {
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
 */
export type VehicleMaintenancePassengerCheckEngineLight = {
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
 */
export type VehicleMaintenancePassengerDiagnosticTroubleCodes = {
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
 */
export type VehicleSafetyScoreResponse = {
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
 * AssetsApi - fetch parameter creator
 * @export
 */
export const AssetsApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
            }
            const localVarPath = `/fleet/assets/locations`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssets.');
            }
            const localVarPath = `/fleet/assets`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type AssetsApiType = { 
    getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: RequestOptions): Promise<InlineResponse2001>,

    getAllAssets(accessToken: string, groupId?: number, options?: RequestOptions): Promise<InlineResponse200>,

    getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions): Promise<Array<Object>>,

    getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions): Promise<AssetReeferResponse>,
}

/**
 * AssetsApi - factory function to inject configuration 
 * @export
 */
export const AssetsApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): AssetsApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<InlineResponse2001> {
            const localVarFetchArgs = AssetsApiFetchParamCreator(configuration).getAllAssetCurrentLocations(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<InlineResponse200> {
            const localVarFetchArgs = AssetsApiFetchParamCreator(configuration).getAllAssets(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<Array<Object>> {
            const localVarFetchArgs = AssetsApiFetchParamCreator(configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<AssetReeferResponse> {
            const localVarFetchArgs = AssetsApiFetchParamCreator(configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * DriversApi - fetch parameter creator
 * @export
 */
export const DriversApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDriverParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDriverParam || {}) : (((createDriverParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
            }
            const localVarPath = `/fleet/drivers/inactive`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PUT' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof reactivateDriverParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(reactivateDriverParam || {}) : (((reactivateDriverParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type DriversApiType = { 
    createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: RequestOptions): Promise<Driver>,

    deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions): Promise<Response>,

    getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: RequestOptions): Promise<Array<Driver>>,

    getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions): Promise<Driver>,

    getDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions): Promise<Driver>,

    reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: RequestOptions): Promise<Driver>,
}

/**
 * DriversApi - factory function to inject configuration 
 * @export
 */
export const DriversApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): DriversApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = DriversApiFetchParamCreator(configuration).createDriver(accessToken, createDriverParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = DriversApiFetchParamCreator(configuration).deactivateDriver(accessToken, driverIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<Array<Driver>> {
            const localVarFetchArgs = DriversApiFetchParamCreator(configuration).getAllDeactivatedDrivers(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = DriversApiFetchParamCreator(configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = DriversApiFetchParamCreator(configuration).getDriverById(accessToken, driverIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = DriversApiFetchParamCreator(configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * FleetApi - fetch parameter creator
 * @export
 */
export const FleetApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This method adds an address book entry to the specified group.
         * @summary /fleet/add_address
         * @throws {RequiredError}
         */
        addFleetAddress(accessToken: string, addressParam: InlineObject2, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof addressParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(addressParam || {}) : (((addressParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Add one or more addresses to the organization
         * @summary /addresses
         * @throws {RequiredError}
         */
        addOrganizationAddresses(accessToken: string, addresses: InlineObject, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof addresses !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(addresses || {}) : (((addresses:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (((createDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDriverParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDriverParam || {}) : (((createDriverParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (((createDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a driver document for the given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
         * @throws {RequiredError}
         */
        createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDocumentParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDocumentParams || {}) : (((createDocumentParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dvir, marking a vehicle or trailer safe or unsafe.
         * @summary /fleet/maintenance/dvirs
         * @throws {RequiredError}
         */
        createDvir(accessToken: string, createDvirParam: InlineObject12, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDvirParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDvirParam || {}) : (((createDvirParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (((createDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete an address.
         * @summary /addresses/{addressId}
         * @throws {RequiredError}
         */
        deleteOrganizationAddress(accessToken: string, addressId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
            }
            const localVarPath = `/fleet/dispatch/routes`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = ((duration:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
            }
            const localVarPath = `/fleet/dispatch/routes/job_updates`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            if (sequenceId !== undefined) {
                localVarQueryParameter['sequence_id'] = ((sequenceId:any):string);
            }

            if (include !== undefined) {
                localVarQueryParameter['include'] = ((include:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
            }
            const localVarPath = `/fleet/assets/locations`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllAssets.');
            }
            const localVarPath = `/fleet/assets`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
            }
            const localVarPath = `/fleet/drivers/inactive`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startTime !== undefined) {
                localVarQueryParameter['start_time'] = ((startTime:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = ((duration:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = ((duration:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the document types.
         * @summary /fleet/drivers/document_types
         * @throws {RequiredError}
         */
        getDriverDocumentTypesByOrgId(options: RequestOptions): FetchArgs {
            const localVarPath = `/fleet/drivers/document_types`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the documents.
         * @summary /fleet/drivers/documents
         * @throws {RequiredError}
         */
        getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
            }
            const localVarPath = `/fleet/drivers/documents`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            if (durationMs !== undefined) {
                localVarQueryParameter['durationMs'] = ((durationMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get DVIRs for the org within provided time constraints
         * @summary /fleet/maintenance/dvirs
         * @throws {RequiredError}
         */
        getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['end_ms'] = ((endMs:any):string);
            }

            if (durationMs !== undefined) {
                localVarQueryParameter['duration_ms'] = ((durationMs:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get all the drivers for the specified group.
         * @summary /fleet/drivers
         * @throws {RequiredError}
         */
        getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof groupDriversParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(groupDriversParam || {}) : (((groupDriversParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get summarized daily HOS charts for a specified driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
         * @throws {RequiredError}
         */
        getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof hosLogsParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(hosLogsParam || {}) : (((hosLogsParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the distance and time each driver in an organization has driven in a given time period.
         * @summary /fleet/drivers/summary
         * @throws {RequiredError}
         */
        getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (snapToDayBounds !== undefined) {
                localVarQueryParameter['snap_to_day_bounds'] = ((snapToDayBounds:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof driversSummaryParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(driversSummaryParam || {}) : (((driversSummaryParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
         * @summary /fleet/hos_authentication_logs
         * @throws {RequiredError}
         */
        getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof hosAuthenticationLogsParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(hosAuthenticationLogsParam || {}) : (((hosAuthenticationLogsParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
         * @summary /fleet/hos_logs
         * @throws {RequiredError}
         */
        getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof hosLogsParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(hosLogsParam || {}) : (((hosLogsParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the current HOS status for all drivers in the group.
         * @summary /fleet/hos_logs_summary
         * @throws {RequiredError}
         */
        getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof hosLogsParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(hosLogsParam || {}) : (((hosLogsParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
         * @summary /fleet/locations
         * @throws {RequiredError}
         */
        getFleetLocations(accessToken: string, groupParam: InlineObject11, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof groupParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(groupParam || {}) : (((groupParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get list of the vehicles with any engine faults or check light data.
         * @summary /fleet/maintenance/list
         * @throws {RequiredError}
         */
        getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof groupParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(groupParam || {}) : (((groupParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
         * @summary /fleet/trips
         * @throws {RequiredError}
         */
        getFleetTrips(accessToken: string, tripsParam: InlineObject15, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof tripsParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(tripsParam || {}) : (((tripsParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Gets a specific vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch an address by its id.
         * @summary /addresses/{addressId}
         * @throws {RequiredError}
         */
        getOrganizationAddress(accessToken: string, addressId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
         * @summary /addresses
         * @throws {RequiredError}
         */
        getOrganizationAddresses(accessToken: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getOrganizationAddresses.');
            }
            const localVarPath = `/addresses`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a contact by its id.
         * @summary /contacts/{contact_id}
         * @throws {RequiredError}
         */
        getOrganizationContact(accessToken: string, contactId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (timestamp !== undefined) {
                localVarQueryParameter['timestamp'] = ((timestamp:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
         * @throws {RequiredError}
         */
        getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
         * @summary /fleet/vehicles/stats
         * @throws {RequiredError}
         */
        getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            if (series !== undefined) {
                localVarQueryParameter['series'] = ((series:any):string);
            }

            if (tagIds !== undefined) {
                localVarQueryParameter['tagIds'] = ((tagIds:any):string);
            }

            if (startingAfter !== undefined) {
                localVarQueryParameter['startingAfter'] = ((startingAfter:any):string);
            }

            if (endingBefore !== undefined) {
                localVarQueryParameter['endingBefore'] = ((endingBefore:any):string);
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = ((limit:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
         * @summary /fleet/vehicles/locations
         * @throws {RequiredError}
         */
        getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all contacts for the organization.
         * @summary /contacts
         * @throws {RequiredError}
         */
        listContacts(accessToken: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listContacts.');
            }
            const localVarPath = `/contacts`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
         * @summary /fleet/list
         * @throws {RequiredError}
         */
        listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startingAfter !== undefined) {
                localVarQueryParameter['startingAfter'] = ((startingAfter:any):string);
            }

            if (endingBefore !== undefined) {
                localVarQueryParameter['endingBefore'] = ((endingBefore:any):string);
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = ((limit:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof groupParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(groupParam || {}) : (((groupParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PATCH' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof data !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(data || {}) : (((data:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PUT' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof reactivateDriverParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(reactivateDriverParam || {}) : (((reactivateDriverParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PUT' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof updateDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(updateDispatchRouteParams || {}) : (((updateDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
         * @summary /addresses/{addressId}
         * @throws {RequiredError}
         */
        updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PATCH' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof address !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(address || {}) : (((address:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
         * @summary /fleet/set_data
         * @throws {RequiredError}
         */
        updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof vehicleUpdateParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(vehicleUpdateParam || {}) : (((vehicleUpdateParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type FleetApiType = { 
    addFleetAddress(accessToken: string, addressParam: InlineObject2, options?: RequestOptions): Promise<Response>,

    addOrganizationAddresses(accessToken: string, addresses: InlineObject, options?: RequestOptions): Promise<Array<Address>>,

    createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions): Promise<DispatchRoute>,

    createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: RequestOptions): Promise<Driver>,

    createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions): Promise<DispatchRoute>,

    createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options?: RequestOptions): Promise<Document>,

    createDvir(accessToken: string, createDvirParam: InlineObject12, options?: RequestOptions): Promise<DvirBase>,

    createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions): Promise<DispatchRoute>,

    deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions): Promise<Response>,

    deleteDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions): Promise<Response>,

    deleteOrganizationAddress(accessToken: string, addressId: number, options?: RequestOptions): Promise<Response>,

    fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: RequestOptions): Promise<Array<DispatchRoute>>,

    fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: RequestOptions): Promise<AllRouteJobUpdates>,

    getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: RequestOptions): Promise<InlineResponse2001>,

    getAllAssets(accessToken: string, groupId?: number, options?: RequestOptions): Promise<InlineResponse200>,

    getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: RequestOptions): Promise<Array<Driver>>,

    getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions): Promise<Array<Object>>,

    getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions): Promise<AssetReeferResponse>,

    getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions): Promise<Driver>,

    getDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions): Promise<DispatchRoute>,

    getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: RequestOptions): Promise<DispatchRouteHistory>,

    getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: RequestOptions): Promise<Array<DispatchRoute>>,

    getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: RequestOptions): Promise<Array<DispatchRoute>>,

    getDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions): Promise<Driver>,

    getDriverDocumentTypesByOrgId(options?: RequestOptions): Promise<Array<DocumentType>>,

    getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options?: RequestOptions): Promise<Array<Document>>,

    getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions): Promise<DriverSafetyScoreResponse>,

    getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options?: RequestOptions): Promise<DvirListResponse>,

    getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options?: RequestOptions): Promise<DriversResponse>,

    getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options?: RequestOptions): Promise<DriverDailyLogResponse>,

    getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options?: RequestOptions): Promise<DriversSummaryResponse>,

    getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options?: RequestOptions): Promise<HosAuthenticationLogsResponse>,

    getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options?: RequestOptions): Promise<HosLogsResponse>,

    getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options?: RequestOptions): Promise<HosLogsSummaryResponse>,

    getFleetLocations(accessToken: string, groupParam: InlineObject11, options?: RequestOptions): Promise<InlineResponse2003>,

    getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options?: RequestOptions): Promise<InlineResponse2004>,

    getFleetTrips(accessToken: string, tripsParam: InlineObject15, options?: RequestOptions): Promise<TripResponse>,

    getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options?: RequestOptions): Promise<FleetVehicleResponse>,

    getOrganizationAddress(accessToken: string, addressId: number, options?: RequestOptions): Promise<Address>,

    getOrganizationAddresses(accessToken: string, options?: RequestOptions): Promise<Array<Address>>,

    getOrganizationContact(accessToken: string, contactId: number, options?: RequestOptions): Promise<Contact>,

    getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: RequestOptions): Promise<VehicleHarshEventResponse>,

    getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options?: RequestOptions): Promise<Array<FleetVehicleLocation>>,

    getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions): Promise<VehicleSafetyScoreResponse>,

    getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options?: RequestOptions): Promise<InlineResponse2005>,

    getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options?: RequestOptions): Promise<Array<Object>>,

    listContacts(accessToken: string, options?: RequestOptions): Promise<Array<Contact>>,

    listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options?: RequestOptions): Promise<InlineResponse2002>,

    patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options?: RequestOptions): Promise<FleetVehicleResponse>,

    reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: RequestOptions): Promise<Driver>,

    updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: RequestOptions): Promise<DispatchRoute>,

    updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options?: RequestOptions): Promise<Response>,

    updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options?: RequestOptions): Promise<Response>,
}

/**
 * FleetApi - factory function to inject configuration 
 * @export
 */
export const FleetApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): FleetApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * This method adds an address book entry to the specified group.
         * @summary /fleet/add_address
         * @throws {RequiredError}
         */
        addFleetAddress(accessToken: string, addressParam: InlineObject2, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).addFleetAddress(accessToken, addressParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Add one or more addresses to the organization
         * @summary /addresses
         * @throws {RequiredError}
         */
        addOrganizationAddresses(accessToken: string, addresses: InlineObject, options?: RequestOptions = {}): Promise<Array<Address>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).addOrganizationAddresses(accessToken, addresses, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new driver.
         * @summary /fleet/drivers/create
         * @throws {RequiredError}
         */
        createDriver(accessToken: string, createDriverParam: DriverForCreate, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).createDriver(accessToken, createDriverParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a driver document for the given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
         * @throws {RequiredError}
         */
        createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options?: RequestOptions = {}): Promise<Document> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).createDriverDocument(accessToken, driverId, createDocumentParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new dvir, marking a vehicle or trailer safe or unsafe.
         * @summary /fleet/maintenance/dvirs
         * @throws {RequiredError}
         */
        createDvir(accessToken: string, createDvirParam: InlineObject12, options?: RequestOptions = {}): Promise<DvirBase> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).createDvir(accessToken, createDvirParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Deactivate a driver with the given id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        deactivateDriver(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).deactivateDriver(accessToken, driverIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).deleteDispatchRouteById(accessToken, routeId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Delete an address.
         * @summary /addresses/{addressId}
         * @throws {RequiredError}
         */
        deleteOrganizationAddress(accessToken: string, addressId: number, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).deleteOrganizationAddress(accessToken, addressId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: RequestOptions = {}): Promise<Array<DispatchRoute>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: RequestOptions = {}): Promise<AllRouteJobUpdates> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch current locations of all assets for the group.
         * @summary /fleet/assets/locations
         * @throws {RequiredError}
         */
        getAllAssetCurrentLocations(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<InlineResponse2001> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getAllAssetCurrentLocations(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the assets for the group.
         * @summary /fleet/assets
         * @throws {RequiredError}
         */
        getAllAssets(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<InlineResponse200> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getAllAssets(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all deactivated drivers for the group.
         * @summary /fleet/drivers/inactive
         * @throws {RequiredError}
         */
        getAllDeactivatedDrivers(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<Array<Driver>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getAllDeactivatedDrivers(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the historical locations for the asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/locations
         * @throws {RequiredError}
         */
        getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<Array<Object>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getAssetLocation(accessToken, assetId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the reefer-specific stats of an asset.
         * @summary /fleet/assets/{assetId:[0-9]+}/reefer
         * @throws {RequiredError}
         */
        getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<AssetReeferResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getAssetReefer(accessToken, assetId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch deactivated driver by id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDeactivatedDriverById(accessToken, driverIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDispatchRouteById(accessToken, routeId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: RequestOptions = {}): Promise<DispatchRouteHistory> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: RequestOptions = {}): Promise<Array<DispatchRoute>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: RequestOptions = {}): Promise<Array<DispatchRoute>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch driver by id.
         * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getDriverById(accessToken: string, driverIdOrExternalId: string, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDriverById(accessToken, driverIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the document types.
         * @summary /fleet/drivers/document_types
         * @throws {RequiredError}
         */
        getDriverDocumentTypesByOrgId(options?: RequestOptions = {}): Promise<Array<DocumentType>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDriverDocumentTypesByOrgId(options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the documents.
         * @summary /fleet/drivers/documents
         * @throws {RequiredError}
         */
        getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, options?: RequestOptions = {}): Promise<Array<Document>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDriverDocumentsByOrgId(accessToken, endMs, durationMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<DriverSafetyScoreResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get DVIRs for the org within provided time constraints
         * @summary /fleet/maintenance/dvirs
         * @throws {RequiredError}
         */
        getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, options?: RequestOptions = {}): Promise<DvirListResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getDvirs(accessToken, endMs, durationMs, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get all the drivers for the specified group.
         * @summary /fleet/drivers
         * @throws {RequiredError}
         */
        getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, options?: RequestOptions = {}): Promise<DriversResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetDrivers(accessToken, groupDriversParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get summarized daily HOS charts for a specified driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
         * @throws {RequiredError}
         */
        getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, options?: RequestOptions = {}): Promise<DriverDailyLogResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get the distance and time each driver in an organization has driven in a given time period.
         * @summary /fleet/drivers/summary
         * @throws {RequiredError}
         */
        getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options?: RequestOptions = {}): Promise<DriversSummaryResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
         * @summary /fleet/hos_authentication_logs
         * @throws {RequiredError}
         */
        getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, options?: RequestOptions = {}): Promise<HosAuthenticationLogsResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
         * @summary /fleet/hos_logs
         * @throws {RequiredError}
         */
        getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, options?: RequestOptions = {}): Promise<HosLogsResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetHosLogs(accessToken, hosLogsParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get the current HOS status for all drivers in the group.
         * @summary /fleet/hos_logs_summary
         * @throws {RequiredError}
         */
        getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, options?: RequestOptions = {}): Promise<HosLogsSummaryResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetHosLogsSummary(accessToken, hosLogsParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
         * @summary /fleet/locations
         * @throws {RequiredError}
         */
        getFleetLocations(accessToken: string, groupParam: InlineObject11, options?: RequestOptions = {}): Promise<InlineResponse2003> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetLocations(accessToken, groupParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get list of the vehicles with any engine faults or check light data.
         * @summary /fleet/maintenance/list
         * @throws {RequiredError}
         */
        getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, options?: RequestOptions = {}): Promise<InlineResponse2004> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetMaintenanceList(accessToken, groupParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
         * @summary /fleet/trips
         * @throws {RequiredError}
         */
        getFleetTrips(accessToken: string, tripsParam: InlineObject15, options?: RequestOptions = {}): Promise<TripResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetTrips(accessToken, tripsParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Gets a specific vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, options?: RequestOptions = {}): Promise<FleetVehicleResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getFleetVehicle(accessToken, vehicleIdOrExternalId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch an address by its id.
         * @summary /addresses/{addressId}
         * @throws {RequiredError}
         */
        getOrganizationAddress(accessToken: string, addressId: number, options?: RequestOptions = {}): Promise<Address> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getOrganizationAddress(accessToken, addressId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
         * @summary /addresses
         * @throws {RequiredError}
         */
        getOrganizationAddresses(accessToken: string, options?: RequestOptions = {}): Promise<Array<Address>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getOrganizationAddresses(accessToken, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch a contact by its id.
         * @summary /contacts/{contact_id}
         * @throws {RequiredError}
         */
        getOrganizationContact(accessToken: string, contactId: number, options?: RequestOptions = {}): Promise<Contact> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getOrganizationContact(accessToken, contactId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: RequestOptions = {}): Promise<VehicleHarshEventResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
         * @throws {RequiredError}
         */
        getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<Array<FleetVehicleLocation>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getVehicleLocations(accessToken, vehicleId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<VehicleSafetyScoreResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
         * @summary /fleet/vehicles/stats
         * @throws {RequiredError}
         */
        getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options?: RequestOptions = {}): Promise<InlineResponse2005> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
         * @summary /fleet/vehicles/locations
         * @throws {RequiredError}
         */
        getVehiclesLocations(accessToken: string, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<Array<Object>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).getVehiclesLocations(accessToken, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all contacts for the organization.
         * @summary /contacts
         * @throws {RequiredError}
         */
        listContacts(accessToken: string, options?: RequestOptions = {}): Promise<Array<Contact>> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).listContacts(accessToken, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
         * @summary /fleet/list
         * @throws {RequiredError}
         */
        listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options?: RequestOptions = {}): Promise<InlineResponse2002> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).listFleet(accessToken, groupParam, startingAfter, endingBefore, limit, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options?: RequestOptions = {}): Promise<FleetVehicleResponse> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Reactivate the inactive driver having id.
         * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
         * @throws {RequiredError}
         */
        reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options?: RequestOptions = {}): Promise<Driver> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
         * @summary /addresses/{addressId}
         * @throws {RequiredError}
         */
        updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).updateOrganizationAddress(accessToken, addressId, address, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
         * @summary /fleet/set_data
         * @throws {RequiredError}
         */
        updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = FleetApiFetchParamCreator(configuration).updateVehicles(accessToken, vehicleUpdateParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * IndustrialApi - fetch parameter creator
 * @export
 */
export const IndustrialApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetch all of the data inputs for a group.
         * @summary /industrial/data
         * @throws {RequiredError}
         */
        getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllDataInputs.');
            }
            const localVarPath = `/industrial/data`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch datapoints from a given data input.
         * @summary /industrial/data/{data_input_id:[0-9]+}
         * @throws {RequiredError}
         */
        getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
         * @summary /machines/list
         * @throws {RequiredError}
         */
        getMachines(accessToken: string, groupParam: InlineObject18, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof groupParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(groupParam || {}) : (((groupParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
         * @summary /machines/history
         * @throws {RequiredError}
         */
        getMachinesHistory(accessToken: string, historyParam: InlineObject17, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof historyParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(historyParam || {}) : (((historyParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type IndustrialApiType = { 
    getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options?: RequestOptions): Promise<InlineResponse2006>,

    getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options?: RequestOptions): Promise<DataInputHistoryResponse>,

    getMachines(accessToken: string, groupParam: InlineObject18, options?: RequestOptions): Promise<InlineResponse2007>,

    getMachinesHistory(accessToken: string, historyParam: InlineObject17, options?: RequestOptions): Promise<MachineHistoryResponse>,
}

/**
 * IndustrialApi - factory function to inject configuration 
 * @export
 */
export const IndustrialApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): IndustrialApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Fetch all of the data inputs for a group.
         * @summary /industrial/data
         * @throws {RequiredError}
         */
        getAllDataInputs(accessToken: string, groupId?: number, startMs?: number, endMs?: number, options?: RequestOptions = {}): Promise<InlineResponse2006> {
            const localVarFetchArgs = IndustrialApiFetchParamCreator(configuration).getAllDataInputs(accessToken, groupId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch datapoints from a given data input.
         * @summary /industrial/data/{data_input_id:[0-9]+}
         * @throws {RequiredError}
         */
        getDataInput(accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options?: RequestOptions = {}): Promise<DataInputHistoryResponse> {
            const localVarFetchArgs = IndustrialApiFetchParamCreator(configuration).getDataInput(accessToken, dataInputId, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
         * @summary /machines/list
         * @throws {RequiredError}
         */
        getMachines(accessToken: string, groupParam: InlineObject18, options?: RequestOptions = {}): Promise<InlineResponse2007> {
            const localVarFetchArgs = IndustrialApiFetchParamCreator(configuration).getMachines(accessToken, groupParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
         * @summary /machines/history
         * @throws {RequiredError}
         */
        getMachinesHistory(accessToken: string, historyParam: InlineObject17, options?: RequestOptions = {}): Promise<MachineHistoryResponse> {
            const localVarFetchArgs = IndustrialApiFetchParamCreator(configuration).getMachinesHistory(accessToken, historyParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * RoutesApi - fetch parameter creator
 * @export
 */
export const RoutesApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (((createDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (((createDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof createDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(createDispatchRouteParams || {}) : (((createDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
            }
            const localVarPath = `/fleet/dispatch/routes`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = ((duration:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
            }
            const localVarPath = `/fleet/dispatch/routes/job_updates`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            if (sequenceId !== undefined) {
                localVarQueryParameter['sequence_id'] = ((sequenceId:any):string);
            }

            if (include !== undefined) {
                localVarQueryParameter['include'] = ((include:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startTime !== undefined) {
                localVarQueryParameter['start_time'] = ((startTime:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = ((duration:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (endTime !== undefined) {
                localVarQueryParameter['end_time'] = ((endTime:any):string);
            }

            if (duration !== undefined) {
                localVarQueryParameter['duration'] = ((duration:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PUT' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof updateDispatchRouteParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(updateDispatchRouteParams || {}) : (((updateDispatchRouteParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type RoutesApiType = { 
    createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions): Promise<DispatchRoute>,

    createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions): Promise<DispatchRoute>,

    createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions): Promise<DispatchRoute>,

    deleteDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions): Promise<Response>,

    fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: RequestOptions): Promise<Array<DispatchRoute>>,

    fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: RequestOptions): Promise<AllRouteJobUpdates>,

    getDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions): Promise<DispatchRoute>,

    getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: RequestOptions): Promise<DispatchRouteHistory>,

    getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: RequestOptions): Promise<Array<DispatchRoute>>,

    getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: RequestOptions): Promise<Array<DispatchRoute>>,

    updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: RequestOptions): Promise<DispatchRoute>,
}

/**
 * RoutesApi - factory function to inject configuration 
 * @export
 */
export const RoutesApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): RoutesApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Create a new dispatch route.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).createDispatchRoute(accessToken, createDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new dispatch route for the driver with driver_id.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Create a new dispatch route for the vehicle with vehicle_id.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Delete a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        deleteDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).deleteDispatchRouteById(accessToken, routeId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the dispatch routes for the group.
         * @summary /fleet/dispatch/routes
         * @throws {RequiredError}
         */
        fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, options?: RequestOptions = {}): Promise<Array<DispatchRoute>> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
         * @summary /fleet/dispatch/routes/job_updates
         * @throws {RequiredError}
         */
        fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, options?: RequestOptions = {}): Promise<AllRouteJobUpdates> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch a dispatch route by id.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
         * @throws {RequiredError}
         */
        getDispatchRouteById(accessToken: string, routeId: number, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).getDispatchRouteById(accessToken, routeId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the history of a dispatch route.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
         * @throws {RequiredError}
         */
        getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, options?: RequestOptions = {}): Promise<DispatchRouteHistory> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).getDispatchRouteHistory(accessToken, routeId, startTime, endTime, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the dispatch routes for a given driver.
         * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, options?: RequestOptions = {}): Promise<Array<DispatchRoute>> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the dispatch routes for a given vehicle.
         * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
         * @throws {RequiredError}
         */
        getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, options?: RequestOptions = {}): Promise<Array<DispatchRoute>> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Update a dispatch route and its associated jobs.
         * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
         * @throws {RequiredError}
         */
        updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options?: RequestOptions = {}): Promise<DispatchRoute> {
            const localVarFetchArgs = RoutesApiFetchParamCreator(configuration).updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * SafetyApi - fetch parameter creator
 * @export
 */
export const SafetyApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (timestamp !== undefined) {
                localVarQueryParameter['timestamp'] = ((timestamp:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (startMs !== undefined) {
                localVarQueryParameter['startMs'] = ((startMs:any):string);
            }

            if (endMs !== undefined) {
                localVarQueryParameter['endMs'] = ((endMs:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type SafetyApiType = { 
    getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions): Promise<DriverSafetyScoreResponse>,

    getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: RequestOptions): Promise<VehicleHarshEventResponse>,

    getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions): Promise<VehicleSafetyScoreResponse>,
}

/**
 * SafetyApi - factory function to inject configuration 
 * @export
 */
export const SafetyApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): SafetyApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Fetch the safety score for the driver.
         * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<DriverSafetyScoreResponse> {
            const localVarFetchArgs = SafetyApiFetchParamCreator(configuration).getDriverSafetyScore(driverId, accessToken, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch harsh event details for a vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
         * @throws {RequiredError}
         */
        getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, options?: RequestOptions = {}): Promise<VehicleHarshEventResponse> {
            const localVarFetchArgs = SafetyApiFetchParamCreator(configuration).getVehicleHarshEvent(vehicleId, accessToken, timestamp, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch the safety score for the vehicle.
         * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
         * @throws {RequiredError}
         */
        getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, options?: RequestOptions = {}): Promise<VehicleSafetyScoreResponse> {
            const localVarFetchArgs = SafetyApiFetchParamCreator(configuration).getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * SensorsApi - fetch parameter creator
 * @export
 */
export const SensorsApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
         * @summary /sensors/list
         * @throws {RequiredError}
         */
        getSensors(accessToken: string, groupParam: InlineObject23, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof groupParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(groupParam || {}) : (((groupParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get cargo monitor status (empty / full) for requested sensors.
         * @summary /sensors/cargo
         * @throws {RequiredError}
         */
        getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof sensorParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(sensorParam || {}) : (((sensorParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get door monitor status (closed / open) for requested sensors.
         * @summary /sensors/door
         * @throws {RequiredError}
         */
        getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof sensorParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(sensorParam || {}) : (((sensorParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
         * @summary /sensors/history
         * @throws {RequiredError}
         */
        getSensorsHistory(accessToken: string, historyParam: InlineObject21, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof historyParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(historyParam || {}) : (((historyParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
         * @summary /sensors/humidity
         * @throws {RequiredError}
         */
        getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof sensorParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(sensorParam || {}) : (((sensorParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
         * @summary /sensors/temperature
         * @throws {RequiredError}
         */
        getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof sensorParam !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(sensorParam || {}) : (((sensorParam:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type SensorsApiType = { 
    getSensors(accessToken: string, groupParam: InlineObject23, options?: RequestOptions): Promise<InlineResponse2008>,

    getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options?: RequestOptions): Promise<CargoResponse>,

    getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options?: RequestOptions): Promise<DoorResponse>,

    getSensorsHistory(accessToken: string, historyParam: InlineObject21, options?: RequestOptions): Promise<SensorHistoryResponse>,

    getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options?: RequestOptions): Promise<HumidityResponse>,

    getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options?: RequestOptions): Promise<TemperatureResponse>,
}

/**
 * SensorsApi - factory function to inject configuration 
 * @export
 */
export const SensorsApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): SensorsApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
         * @summary /sensors/list
         * @throws {RequiredError}
         */
        getSensors(accessToken: string, groupParam: InlineObject23, options?: RequestOptions = {}): Promise<InlineResponse2008> {
            const localVarFetchArgs = SensorsApiFetchParamCreator(configuration).getSensors(accessToken, groupParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get cargo monitor status (empty / full) for requested sensors.
         * @summary /sensors/cargo
         * @throws {RequiredError}
         */
        getSensorsCargo(accessToken: string, sensorParam: InlineObject19, options?: RequestOptions = {}): Promise<CargoResponse> {
            const localVarFetchArgs = SensorsApiFetchParamCreator(configuration).getSensorsCargo(accessToken, sensorParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get door monitor status (closed / open) for requested sensors.
         * @summary /sensors/door
         * @throws {RequiredError}
         */
        getSensorsDoor(accessToken: string, sensorParam: InlineObject20, options?: RequestOptions = {}): Promise<DoorResponse> {
            const localVarFetchArgs = SensorsApiFetchParamCreator(configuration).getSensorsDoor(accessToken, sensorParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
         * @summary /sensors/history
         * @throws {RequiredError}
         */
        getSensorsHistory(accessToken: string, historyParam: InlineObject21, options?: RequestOptions = {}): Promise<SensorHistoryResponse> {
            const localVarFetchArgs = SensorsApiFetchParamCreator(configuration).getSensorsHistory(accessToken, historyParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
         * @summary /sensors/humidity
         * @throws {RequiredError}
         */
        getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, options?: RequestOptions = {}): Promise<HumidityResponse> {
            const localVarFetchArgs = SensorsApiFetchParamCreator(configuration).getSensorsHumidity(accessToken, sensorParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
         * @summary /sensors/temperature
         * @throws {RequiredError}
         */
        getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, options?: RequestOptions = {}): Promise<TemperatureResponse> {
            const localVarFetchArgs = SensorsApiFetchParamCreator(configuration).getSensorsTemperature(accessToken, sensorParam, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * TagsApi - fetch parameter creator
 * @export
 */
export const TagsApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new tag for the group.
         * @summary /tags
         * @throws {RequiredError}
         */
        createTag(accessToken: string, tagCreateParams: TagCreate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof tagCreateParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(tagCreateParams || {}) : (((tagCreateParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Permanently deletes a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        deleteTagById(accessToken: string, tagId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch all of the tags for a group.
         * @summary /tags
         * @throws {RequiredError}
         */
        getAllTags(accessToken: string, groupId?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling getAllTags.');
            }
            const localVarPath = `/tags`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            if (groupId !== undefined) {
                localVarQueryParameter['group_id'] = ((groupId:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a tag by id.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        getTagById(accessToken: string, tagId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Add or delete specific members from a tag, or modify the name of a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PATCH' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof tagModifyParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(tagModifyParams || {}) : (((tagModifyParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PUT' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof updateTagParams !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(updateTagParams || {}) : (((updateTagParams:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type TagsApiType = { 
    createTag(accessToken: string, tagCreateParams: TagCreate, options?: RequestOptions): Promise<Tag>,

    deleteTagById(accessToken: string, tagId: number, options?: RequestOptions): Promise<Response>,

    getAllTags(accessToken: string, groupId?: number, options?: RequestOptions): Promise<InlineResponse2009>,

    getTagById(accessToken: string, tagId: number, options?: RequestOptions): Promise<Tag>,

    modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options?: RequestOptions): Promise<Tag>,

    updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options?: RequestOptions): Promise<Tag>,
}

/**
 * TagsApi - factory function to inject configuration 
 * @export
 */
export const TagsApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): TagsApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Create a new tag for the group.
         * @summary /tags
         * @throws {RequiredError}
         */
        createTag(accessToken: string, tagCreateParams: TagCreate, options?: RequestOptions = {}): Promise<Tag> {
            const localVarFetchArgs = TagsApiFetchParamCreator(configuration).createTag(accessToken, tagCreateParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Permanently deletes a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        deleteTagById(accessToken: string, tagId: number, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = TagsApiFetchParamCreator(configuration).deleteTagById(accessToken, tagId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch all of the tags for a group.
         * @summary /tags
         * @throws {RequiredError}
         */
        getAllTags(accessToken: string, groupId?: number, options?: RequestOptions = {}): Promise<InlineResponse2009> {
            const localVarFetchArgs = TagsApiFetchParamCreator(configuration).getAllTags(accessToken, groupId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Fetch a tag by id.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        getTagById(accessToken: string, tagId: number, options?: RequestOptions = {}): Promise<Tag> {
            const localVarFetchArgs = TagsApiFetchParamCreator(configuration).getTagById(accessToken, tagId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Add or delete specific members from a tag, or modify the name of a tag.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, options?: RequestOptions = {}): Promise<Tag> {
            const localVarFetchArgs = TagsApiFetchParamCreator(configuration).modifyTagById(accessToken, tagId, tagModifyParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
         * @summary /tags/{tag_id:[0-9]+}
         * @throws {RequiredError}
         */
        updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, options?: RequestOptions = {}): Promise<Tag> {
            const localVarFetchArgs = TagsApiFetchParamCreator(configuration).updateTagById(accessToken, tagId, updateTagParams, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * UsersApi - fetch parameter creator
 * @export
 */
export const UsersApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Remove a user from the organization.
         * @summary /users/{userId:[0-9]+}
         * @throws {RequiredError}
         */
        deleteUserById(accessToken: string, userId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get a user.
         * @summary /users/{userId:[0-9]+}
         * @throws {RequiredError}
         */
        getUserById(accessToken: string, userId: number, options: RequestOptions): FetchArgs {
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
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get all roles in the organization.
         * @summary /user_roles
         * @throws {RequiredError}
         */
        listUserRoles(accessToken: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listUserRoles.');
            }
            const localVarPath = `/user_roles`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * List all users in the organization.
         * @summary /users
         * @throws {RequiredError}
         */
        listUsers(accessToken: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessToken' is not null or undefined
            if (accessToken === null || accessToken === undefined) {
                throw new RequiredError('accessToken','Required parameter accessToken was null or undefined when calling listUsers.');
            }
            const localVarPath = `/users`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (accessToken !== undefined) {
                localVarQueryParameter['access_token'] = ((accessToken:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type UsersApiType = { 
    deleteUserById(accessToken: string, userId: number, options?: RequestOptions): Promise<Response>,

    getUserById(accessToken: string, userId: number, options?: RequestOptions): Promise<User>,

    listUserRoles(accessToken: string, options?: RequestOptions): Promise<Array<UserRole>>,

    listUsers(accessToken: string, options?: RequestOptions): Promise<Array<User>>,
}

/**
 * UsersApi - factory function to inject configuration 
 * @export
 */
export const UsersApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): UsersApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Remove a user from the organization.
         * @summary /users/{userId:[0-9]+}
         * @throws {RequiredError}
         */
        deleteUserById(accessToken: string, userId: number, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = UsersApiFetchParamCreator(configuration).deleteUserById(accessToken, userId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get a user.
         * @summary /users/{userId:[0-9]+}
         * @throws {RequiredError}
         */
        getUserById(accessToken: string, userId: number, options?: RequestOptions = {}): Promise<User> {
            const localVarFetchArgs = UsersApiFetchParamCreator(configuration).getUserById(accessToken, userId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get all roles in the organization.
         * @summary /user_roles
         * @throws {RequiredError}
         */
        listUserRoles(accessToken: string, options?: RequestOptions = {}): Promise<Array<UserRole>> {
            const localVarFetchArgs = UsersApiFetchParamCreator(configuration).listUserRoles(accessToken, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * List all users in the organization.
         * @summary /users
         * @throws {RequiredError}
         */
        listUsers(accessToken: string, options?: RequestOptions = {}): Promise<Array<User>> {
            const localVarFetchArgs = UsersApiFetchParamCreator(configuration).listUsers(accessToken, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

export type ApiTypes = { 
    AssetsApi: AssetsApiType,

    DriversApi: DriversApiType,

    FleetApi: FleetApiType,

    IndustrialApi: IndustrialApiType,

    RoutesApi: RoutesApiType,

    SafetyApi: SafetyApiType,

    SensorsApi: SensorsApiType,

    TagsApi: TagsApiType,

    UsersApi: UsersApiType,
 }
