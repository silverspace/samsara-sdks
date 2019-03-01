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

import localVarRequest = require('request');
import http = require('http');
import Promise = require('bluebird');

let defaultBasePath = 'https://api.samsara.com/v1';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

class ObjectSerializer {

    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    return data[discriminatorProperty]; // use the type given in the discriminator
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export class Address {
    'contactIds'?: ContactIds;
    /**
    * The full address associated with this address/geofence, as it might be recognized by maps.google.com
    */
    'formattedAddress'?: string;
    'geofence'?: AddressGeofence;
    /**
    * The name of this address/geofence
    */
    'name'?: string;
    'notes'?: AddressNotes;
    'tagIds'?: TagIds;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "contactIds",
            "baseName": "contactIds",
            "type": "ContactIds"
        },
        {
            "name": "formattedAddress",
            "baseName": "formattedAddress",
            "type": "string"
        },
        {
            "name": "geofence",
            "baseName": "geofence",
            "type": "AddressGeofence"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "AddressNotes"
        },
        {
            "name": "tagIds",
            "baseName": "tagIds",
            "type": "TagIds"
        }    ];

    static getAttributeTypeMap() {
        return Address.attributeTypeMap;
    }
}

/**
* The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
*/
export class AddressGeofence {
    'circle'?: AddressGeofenceCircle;
    'polygon'?: AddressGeofencePolygon;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "circle",
            "baseName": "circle",
            "type": "AddressGeofenceCircle"
        },
        {
            "name": "polygon",
            "baseName": "polygon",
            "type": "AddressGeofencePolygon"
        }    ];

    static getAttributeTypeMap() {
        return AddressGeofence.attributeTypeMap;
    }
}

/**
* Information about a circular geofence. This field is only populated if the geofence is a circle.
*/
export class AddressGeofenceCircle {
    /**
    * The latitude of the center of the circular geofence
    */
    'latitude'?: number;
    /**
    * The longitude of the center of the circular geofence
    */
    'longitude'?: number;
    /**
    * The radius of the circular geofence
    */
    'radiusMeters'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        },
        {
            "name": "radiusMeters",
            "baseName": "radiusMeters",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AddressGeofenceCircle.attributeTypeMap;
    }
}

/**
* Information about a polygon geofence. This field is only populated if the geofence is a polygon.
*/
export class AddressGeofencePolygon {
    /**
    * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
    */
    'vertices'?: Array<AddressGeofencePolygonVertices>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "vertices",
            "baseName": "vertices",
            "type": "Array<AddressGeofencePolygonVertices>"
        }    ];

    static getAttributeTypeMap() {
        return AddressGeofencePolygon.attributeTypeMap;
    }
}

export class AddressGeofencePolygonVertices {
    /**
    * The longitude of a geofence vertex
    */
    'latitude'?: number;
    /**
    * The longitude of a geofence vertex
    */
    'longitude'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AddressGeofencePolygonVertices.attributeTypeMap;
    }
}

/**
* Notes associated with an address.
*/
export class AddressNotes {

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
    ];

    static getAttributeTypeMap() {
        return AddressNotes.attributeTypeMap;
    }
}

export class AddressParam {
    /**
    * The address of the entry to add, as it would be recognized if provided to maps.google.com.
    */
    'address': string;
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * Name of the location to add to the address book.
    */
    'name': string;
    /**
    * Radius in meters of the address (used for matching vehicle trip stops to this location).
    */
    'radius': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "address",
            "baseName": "address",
            "type": "string"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "radius",
            "baseName": "radius",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AddressParam.attributeTypeMap;
    }
}

export class Addresses {
    'addresses': Array<AddressesAddresses>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "addresses",
            "baseName": "addresses",
            "type": "Array<AddressesAddresses>"
        }    ];

    static getAttributeTypeMap() {
        return Addresses.attributeTypeMap;
    }
}

export class AddressesAddresses {
    'contactIds'?: ContactIds;
    /**
    * The full address associated with this address/geofence, as it might be recognized by maps.google.com
    */
    'formattedAddress': string;
    'geofence': AddressGeofence;
    /**
    * The name of this address/geofence
    */
    'name': string;
    'notes'?: AddressNotes;
    'tagIds'?: TagIds;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "contactIds",
            "baseName": "contactIds",
            "type": "ContactIds"
        },
        {
            "name": "formattedAddress",
            "baseName": "formattedAddress",
            "type": "string"
        },
        {
            "name": "geofence",
            "baseName": "geofence",
            "type": "AddressGeofence"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "AddressNotes"
        },
        {
            "name": "tagIds",
            "baseName": "tagIds",
            "type": "TagIds"
        }    ];

    static getAttributeTypeMap() {
        return AddressesAddresses.attributeTypeMap;
    }
}

export class AllRouteJobUpdates {
    'jobUpdates'?: Array<JobUpdateObject>;
    /**
    * Sequence ID of the last update returned in the response
    */
    'sequenceId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "jobUpdates",
            "baseName": "job_updates",
            "type": "Array<JobUpdateObject>"
        },
        {
            "name": "sequenceId",
            "baseName": "sequence_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return AllRouteJobUpdates.attributeTypeMap;
    }
}

/**
* Basic information of an asset
*/
export class Asset {
    /**
    * Serial number of the host asset
    */
    'assetSerialNumber'?: string;
    /**
    * The cable connected to the asset
    */
    'cable'?: Array<AssetCable>;
    /**
    * Engine hours
    */
    'engineHours'?: number;
    /**
    * Asset ID
    */
    'id': number;
    /**
    * Asset name
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assetSerialNumber",
            "baseName": "assetSerialNumber",
            "type": "string"
        },
        {
            "name": "cable",
            "baseName": "cable",
            "type": "Array<AssetCable>"
        },
        {
            "name": "engineHours",
            "baseName": "engineHours",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Asset.attributeTypeMap;
    }
}

export class AssetCable {
    /**
    * Asset type
    */
    'assetType'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assetType",
            "baseName": "assetType",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return AssetCable.attributeTypeMap;
    }
}

/**
* Current location of an asset
*/
export class AssetCurrentLocation {
    /**
    * The latitude of the location in degrees.
    */
    'latitude'?: number;
    /**
    * The best effort (street,city,state) for the latitude and longitude.
    */
    'location'?: string;
    /**
    * The longitude of the location in degrees.
    */
    'longitude'?: number;
    /**
    * The speed calculated from GPS that the asset was traveling at in miles per hour.
    */
    'speedMilesPerHour'?: number;
    /**
    * Time in Unix milliseconds since epoch when the asset was at the location.
    */
    'timeMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "string"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        },
        {
            "name": "speedMilesPerHour",
            "baseName": "speedMilesPerHour",
            "type": "number"
        },
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetCurrentLocation.attributeTypeMap;
    }
}

/**
* Basic information of an asset
*/
export class AssetCurrentLocationsResponse {
    /**
    * The cable connected to the asset
    */
    'cable'?: Array<AssetCable>;
    /**
    * Engine hours
    */
    'engineHours'?: number;
    /**
    * Asset ID
    */
    'id': number;
    /**
    * Current location of an asset
    */
    'location'?: Array<AssetCurrentLocation>;
    /**
    * Asset name
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cable",
            "baseName": "cable",
            "type": "Array<AssetCable>"
        },
        {
            "name": "engineHours",
            "baseName": "engineHours",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "Array<AssetCurrentLocation>"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return AssetCurrentLocationsResponse.attributeTypeMap;
    }
}

/**
* A list of historical asset locations.
*/
export class AssetLocationResponse extends Array<AssetLocationResponseInner> {

    static discriminator: string | undefined = undefined;

}

/**
* Asset location details.
*/
export class AssetLocationResponseInner {
    /**
    * The latitude of the location in degrees.
    */
    'latitude'?: number;
    /**
    * The best effort (street,city,state) for the latitude and longitude.
    */
    'location'?: string;
    /**
    * The longitude of the location in degrees.
    */
    'longitude'?: number;
    /**
    * The speed calculated from GPS that the asset was traveling at in miles per hour.
    */
    'speedMilesPerHour'?: number;
    /**
    * Time in Unix milliseconds since epoch when the asset was at the location.
    */
    'time'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "string"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        },
        {
            "name": "speedMilesPerHour",
            "baseName": "speedMilesPerHour",
            "type": "number"
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetLocationResponseInner.attributeTypeMap;
    }
}

/**
* Reefer-specific asset details
*/
export class AssetReeferResponse {
    /**
    * Asset type
    */
    'assetType'?: string;
    /**
    * Asset ID
    */
    'id'?: number;
    /**
    * Asset name
    */
    'name'?: string;
    'reeferStats'?: AssetReeferResponseReeferStats;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assetType",
            "baseName": "assetType",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "reeferStats",
            "baseName": "reeferStats",
            "type": "AssetReeferResponseReeferStats"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponse.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStats {
    /**
    * Reefer alarms
    */
    'alarms'?: Array<AssetReeferResponseReeferStatsAlarms1>;
    /**
    * Engine hours of the reefer
    */
    'engineHours'?: Array<AssetReeferResponseReeferStatsEngineHours>;
    /**
    * Fuel percentage of the reefer
    */
    'fuelPercentage'?: Array<AssetReeferResponseReeferStatsFuelPercentage>;
    /**
    * Power status of the reefer
    */
    'powerStatus'?: Array<AssetReeferResponseReeferStatsPowerStatus>;
    /**
    * Return air temperature of the reefer
    */
    'returnAirTemp'?: Array<AssetReeferResponseReeferStatsReturnAirTemp>;
    /**
    * Set point temperature of the reefer
    */
    'setPoint'?: Array<AssetReeferResponseReeferStatsSetPoint>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "alarms",
            "baseName": "alarms",
            "type": "Array<AssetReeferResponseReeferStatsAlarms1>"
        },
        {
            "name": "engineHours",
            "baseName": "engineHours",
            "type": "Array<AssetReeferResponseReeferStatsEngineHours>"
        },
        {
            "name": "fuelPercentage",
            "baseName": "fuelPercentage",
            "type": "Array<AssetReeferResponseReeferStatsFuelPercentage>"
        },
        {
            "name": "powerStatus",
            "baseName": "powerStatus",
            "type": "Array<AssetReeferResponseReeferStatsPowerStatus>"
        },
        {
            "name": "returnAirTemp",
            "baseName": "returnAirTemp",
            "type": "Array<AssetReeferResponseReeferStatsReturnAirTemp>"
        },
        {
            "name": "setPoint",
            "baseName": "setPoint",
            "type": "Array<AssetReeferResponseReeferStatsSetPoint>"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStats.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsAlarms {
    /**
    * ID of the alarm
    */
    'alarmCode'?: number;
    /**
    * Description of the alarm
    */
    'description'?: string;
    /**
    * Recommended operator action
    */
    'operatorAction'?: string;
    /**
    * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
    */
    'severity'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "alarmCode",
            "baseName": "alarmCode",
            "type": "number"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "operatorAction",
            "baseName": "operatorAction",
            "type": "string"
        },
        {
            "name": "severity",
            "baseName": "severity",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsAlarms.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsAlarms1 {
    'alarms'?: Array<AssetReeferResponseReeferStatsAlarms>;
    /**
    * Timestamp when the alarms were reported, in Unix milliseconds since epoch
    */
    'changedAtMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "alarms",
            "baseName": "alarms",
            "type": "Array<AssetReeferResponseReeferStatsAlarms>"
        },
        {
            "name": "changedAtMs",
            "baseName": "changedAtMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsAlarms1.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsEngineHours {
    /**
    * Timestamp in Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    /**
    * Engine hours of the reefer.
    */
    'engineHours'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changedAtMs",
            "type": "number"
        },
        {
            "name": "engineHours",
            "baseName": "engineHours",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsEngineHours.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsFuelPercentage {
    /**
    * Timestamp in Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    /**
    * Fuel percentage of the reefer.
    */
    'fuelPercentage'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changedAtMs",
            "type": "number"
        },
        {
            "name": "fuelPercentage",
            "baseName": "fuelPercentage",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsFuelPercentage.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsPowerStatus {
    /**
    * Timestamp in Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    /**
    * Power status of the reefer.
    */
    'status'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changedAtMs",
            "type": "number"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsPowerStatus.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsReturnAirTemp {
    /**
    * Timestamp in Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    /**
    * Return air temperature in millidegree Celsius.
    */
    'tempInMilliC'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changedAtMs",
            "type": "number"
        },
        {
            "name": "tempInMilliC",
            "baseName": "tempInMilliC",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsReturnAirTemp.attributeTypeMap;
    }
}

export class AssetReeferResponseReeferStatsSetPoint {
    /**
    * Timestamp in Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    /**
    * Set point temperature in millidegree Celsius.
    */
    'tempInMilliC'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changedAtMs",
            "type": "number"
        },
        {
            "name": "tempInMilliC",
            "baseName": "tempInMilliC",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetReeferResponseReeferStatsSetPoint.attributeTypeMap;
    }
}

/**
* Digital value of an aux input.
*/
export class AuxInput {
    /**
    * Timestamp in Unix epoch milliseconds.
    */
    'timeMs': number;
    /**
    * Boolean representing the digital value of the aux input.
    */
    'value': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return AuxInput.attributeTypeMap;
    }
}

/**
* A list of aux input values over a timerange.
*/
export class AuxInputSeries {
    /**
    * The name of the aux input.
    */
    'name': AuxInputSeries.NameEnum;
    'values': Array<AuxInput>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "AuxInputSeries.NameEnum"
        },
        {
            "name": "values",
            "baseName": "values",
            "type": "Array<AuxInput>"
        }    ];

    static getAttributeTypeMap() {
        return AuxInputSeries.attributeTypeMap;
    }
}

export namespace AuxInputSeries {
    export enum NameEnum {
        EmergencyLights = <any> 'Emergency Lights',
        EmergencyAlarm = <any> 'Emergency Alarm',
        StopPaddle = <any> 'Stop Paddle',
        PowerTakeOff = <any> 'Power Take-Off',
        Plow = <any> 'Plow',
        Sweeper = <any> 'Sweeper',
        Salter = <any> 'Salter',
        Boom = <any> 'Boom'
    }
}
/**
* Contains the current cargo status of a sensor.
*/
export class CargoResponse {
    'groupId'?: number;
    'sensors'?: Array<CargoResponseSensors>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<CargoResponseSensors>"
        }    ];

    static getAttributeTypeMap() {
        return CargoResponse.attributeTypeMap;
    }
}

export class CargoResponseSensors {
    /**
    * Flag indicating whether the current cargo is empty or loaded.
    */
    'cargoEmpty'?: boolean;
    /**
    * ID of the sensor.
    */
    'id'?: number;
    /**
    * Name of the sensor.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cargoEmpty",
            "baseName": "cargoEmpty",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CargoResponseSensors.attributeTypeMap;
    }
}

/**
* Information about a notification contact for alerts.
*/
export class Contact {
    /**
    * Email address of the contact
    */
    'email'?: string;
    /**
    * First name of the contact
    */
    'firstName'?: string;
    /**
    * ID of the contact
    */
    'id'?: number;
    /**
    * Last name of the contact
    */
    'lastName'?: string;
    /**
    * Phone number of the contact
    */
    'phone'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "firstName",
            "baseName": "firstName",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "lastName",
            "baseName": "lastName",
            "type": "string"
        },
        {
            "name": "phone",
            "baseName": "phone",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Contact.attributeTypeMap;
    }
}

/**
* A list of IDs for contact book entries.
*/
export class ContactIds extends Array<number> {

    static discriminator: string | undefined = undefined;

}

export class CreateDvirParam {
    /**
    * Only type 'mechanic' is currently accepted.
    */
    'inspectionType': CreateDvirParam.InspectionTypeEnum;
    /**
    * Any notes from the mechanic.
    */
    'mechanicNotes'?: string;
    /**
    * The current odometer of the vehicle.
    */
    'odometerMiles'?: number;
    /**
    * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    */
    'previousDefectsCorrected'?: boolean;
    /**
    * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    */
    'previousDefectsIgnored'?: boolean;
    /**
    * Whether or not this vehicle or trailer is safe to drive.
    */
    'safe': CreateDvirParam.SafeEnum;
    /**
    * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
    */
    'trailerId'?: number;
    /**
    * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
    */
    'userEmail': string;
    /**
    * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "inspectionType",
            "baseName": "inspectionType",
            "type": "CreateDvirParam.InspectionTypeEnum"
        },
        {
            "name": "mechanicNotes",
            "baseName": "mechanicNotes",
            "type": "string"
        },
        {
            "name": "odometerMiles",
            "baseName": "odometerMiles",
            "type": "number"
        },
        {
            "name": "previousDefectsCorrected",
            "baseName": "previousDefectsCorrected",
            "type": "boolean"
        },
        {
            "name": "previousDefectsIgnored",
            "baseName": "previousDefectsIgnored",
            "type": "boolean"
        },
        {
            "name": "safe",
            "baseName": "safe",
            "type": "CreateDvirParam.SafeEnum"
        },
        {
            "name": "trailerId",
            "baseName": "trailerId",
            "type": "number"
        },
        {
            "name": "userEmail",
            "baseName": "userEmail",
            "type": "string"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CreateDvirParam.attributeTypeMap;
    }
}

export namespace CreateDvirParam {
    export enum InspectionTypeEnum {
        Mechanic = <any> 'mechanic'
    }
    export enum SafeEnum {
        Safe = <any> 'safe',
        Unsafe = <any> 'unsafe'
    }
}
export class CurrentDriver {

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
    ];

    static getAttributeTypeMap() {
        return CurrentDriver.attributeTypeMap;
    }
}

export class Data {
    'externalIds'?: { [key: string]: string; };
    /**
    * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
    */
    'harshAccelSetting'?: number;
    /**
    * Name
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "externalIds",
            "baseName": "externalIds",
            "type": "{ [key: string]: string; }"
        },
        {
            "name": "harshAccelSetting",
            "baseName": "harsh_accel_setting",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Data.attributeTypeMap;
    }
}

export class DataInputHistoryResponse {
    /**
    * The ID of this data input
    */
    'id'?: number;
    /**
    * Name of this data input
    */
    'name': string;
    /**
    * Data points from this data input
    */
    'points'?: Array<DataInputHistoryResponsePoints>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "points",
            "baseName": "points",
            "type": "Array<DataInputHistoryResponsePoints>"
        }    ];

    static getAttributeTypeMap() {
        return DataInputHistoryResponse.attributeTypeMap;
    }
}

export class DataInputHistoryResponsePoints {
    'timeMs'?: number;
    'value'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DataInputHistoryResponsePoints.attributeTypeMap;
    }
}

export class DispatchJobCreate {
    /**
    * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    */
    'destinationAddress'?: string;
    /**
    * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    */
    'destinationAddressId'?: number;
    /**
    * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    */
    'destinationLat'?: number;
    /**
    * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    */
    'destinationLng'?: number;
    /**
    * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    */
    'destinationName'?: string;
    /**
    * Notes regarding the details of this job.
    */
    'notes'?: string;
    /**
    * The time at which the assigned driver is scheduled to arrive at the job destination.
    */
    'scheduledArrivalTimeMs': number;
    /**
    * The time at which the assigned driver is scheduled to depart from the job destination.
    */
    'scheduledDepartureTimeMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "destinationAddress",
            "baseName": "destination_address",
            "type": "string"
        },
        {
            "name": "destinationAddressId",
            "baseName": "destination_address_id",
            "type": "number"
        },
        {
            "name": "destinationLat",
            "baseName": "destination_lat",
            "type": "number"
        },
        {
            "name": "destinationLng",
            "baseName": "destination_lng",
            "type": "number"
        },
        {
            "name": "destinationName",
            "baseName": "destination_name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "scheduledArrivalTimeMs",
            "baseName": "scheduled_arrival_time_ms",
            "type": "number"
        },
        {
            "name": "scheduledDepartureTimeMs",
            "baseName": "scheduled_departure_time_ms",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DispatchJobCreate.attributeTypeMap;
    }
}

export class DispatchRouteBase {
    /**
    * The time in Unix epoch milliseconds that the route actually ended.
    */
    'actualEndMs'?: number;
    /**
    * The time in Unix epoch milliseconds that the route actually started.
    */
    'actualStartMs'?: number;
    /**
    * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    */
    'driverId'?: number;
    /**
    * ID of the group if the organization has multiple groups (optional).
    */
    'groupId'?: number;
    /**
    * Descriptive name of this route.
    */
    'name': string;
    /**
    * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    */
    'scheduledEndMs': number;
    /**
    * The distance expected to be traveled for this route in meters.
    */
    'scheduledMeters'?: number;
    /**
    * The time in Unix epoch milliseconds that the route is scheduled to start.
    */
    'scheduledStartMs': number;
    /**
    * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    */
    'startLocationAddress'?: string;
    /**
    * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    */
    'startLocationAddressId'?: number;
    /**
    * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    */
    'startLocationLat'?: number;
    /**
    * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    */
    'startLocationLng'?: number;
    /**
    * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    */
    'startLocationName'?: string;
    /**
    * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    */
    'trailerId'?: number;
    /**
    * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "actualEndMs",
            "baseName": "actual_end_ms",
            "type": "number"
        },
        {
            "name": "actualStartMs",
            "baseName": "actual_start_ms",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driver_id",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "group_id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "scheduledEndMs",
            "baseName": "scheduled_end_ms",
            "type": "number"
        },
        {
            "name": "scheduledMeters",
            "baseName": "scheduled_meters",
            "type": "number"
        },
        {
            "name": "scheduledStartMs",
            "baseName": "scheduled_start_ms",
            "type": "number"
        },
        {
            "name": "startLocationAddress",
            "baseName": "start_location_address",
            "type": "string"
        },
        {
            "name": "startLocationAddressId",
            "baseName": "start_location_address_id",
            "type": "number"
        },
        {
            "name": "startLocationLat",
            "baseName": "start_location_lat",
            "type": "number"
        },
        {
            "name": "startLocationLng",
            "baseName": "start_location_lng",
            "type": "number"
        },
        {
            "name": "startLocationName",
            "baseName": "start_location_name",
            "type": "string"
        },
        {
            "name": "trailerId",
            "baseName": "trailer_id",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicle_id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DispatchRouteBase.attributeTypeMap;
    }
}

export class DispatchRouteHistoricalEntry {
    /**
    * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    'route'?: DispatchRoute;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changed_at_ms",
            "type": "number"
        },
        {
            "name": "route",
            "baseName": "route",
            "type": "DispatchRoute"
        }    ];

    static getAttributeTypeMap() {
        return DispatchRouteHistoricalEntry.attributeTypeMap;
    }
}

export class DispatchRouteHistory {
    /**
    * History of the route's state changes.
    */
    'history'?: Array<DispatchRouteHistoricalEntry>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "history",
            "baseName": "history",
            "type": "Array<DispatchRouteHistoricalEntry>"
        }    ];

    static getAttributeTypeMap() {
        return DispatchRouteHistory.attributeTypeMap;
    }
}

export class DispatchRoutes extends Array<DispatchRoute> {

    static discriminator: string | undefined = undefined;

}

export class DocumentBase {
    /**
    * ID of the Samsara dispatch job for which the document is submitted
    */
    'dispatchJobId'?: number;
    /**
    * Notes submitted with this document.
    */
    'notes'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dispatchJobId",
            "baseName": "dispatchJobId",
            "type": "number"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DocumentBase.attributeTypeMap;
    }
}

export class DocumentFieldCreate {
    /**
    * Value of this field if this document field has valueType: ValueType_Number.
    */
    'numberValue'?: number;
    /**
    * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
    */
    'photoValue'?: Array<DocumentFieldCreatePhotoValue>;
    /**
    * Value of this field if this document field has valueType: ValueType_String.
    */
    'stringValue'?: string;
    /**
    * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    */
    'valueType': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "numberValue",
            "baseName": "numberValue",
            "type": "number"
        },
        {
            "name": "photoValue",
            "baseName": "photoValue",
            "type": "Array<DocumentFieldCreatePhotoValue>"
        },
        {
            "name": "stringValue",
            "baseName": "stringValue",
            "type": "string"
        },
        {
            "name": "valueType",
            "baseName": "valueType",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DocumentFieldCreate.attributeTypeMap;
    }
}

export class DocumentFieldCreatePhotoValue {
    /**
    * Photo URL for a JPG image
    */
    'url'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DocumentFieldCreatePhotoValue.attributeTypeMap;
    }
}

export class DocumentFieldType {
    /**
    * Descriptive name of this field type.
    */
    'label': string;
    'numberValueTypeMetadata'?: DocumentFieldTypeNumberValueTypeMetadata;
    /**
    * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    */
    'valueType': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "label",
            "baseName": "label",
            "type": "string"
        },
        {
            "name": "numberValueTypeMetadata",
            "baseName": "numberValueTypeMetadata",
            "type": "DocumentFieldTypeNumberValueTypeMetadata"
        },
        {
            "name": "valueType",
            "baseName": "valueType",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DocumentFieldType.attributeTypeMap;
    }
}

/**
* Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
*/
export class DocumentFieldTypeNumberValueTypeMetadata {
    /**
    * Number of decimal places that values for this field type can have.
    */
    'numDecimalPlaces'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "numDecimalPlaces",
            "baseName": "numDecimalPlaces",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DocumentFieldTypeNumberValueTypeMetadata.attributeTypeMap;
    }
}

export class DocumentFieldTypes extends Array<DocumentFieldType> {

    static discriminator: string | undefined = undefined;

}

export class DocumentType {
    /**
    * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
    */
    'fieldTypes'?: Array<DocumentFieldTypes>;
    /**
    * Name of the document type.
    */
    'name': string;
    /**
    * ID for the organization this document belongs to.
    */
    'orgId': number;
    /**
    * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
    */
    'uuid': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fieldTypes",
            "baseName": "fieldTypes",
            "type": "Array<DocumentFieldTypes>"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "orgId",
            "baseName": "orgId",
            "type": "number"
        },
        {
            "name": "uuid",
            "baseName": "uuid",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DocumentType.attributeTypeMap;
    }
}

export class DocumentTypes extends Array<DocumentType> {

    static discriminator: string | undefined = undefined;

}

export class Documents extends Array<Document> {

    static discriminator: string | undefined = undefined;

}

/**
* Contains the current door status of a sensor.
*/
export class DoorResponse {
    'groupId'?: number;
    'sensors'?: Array<DoorResponseSensors>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<DoorResponseSensors>"
        }    ];

    static getAttributeTypeMap() {
        return DoorResponse.attributeTypeMap;
    }
}

export class DoorResponseSensors {
    /**
    * Flag indicating whether the current door is closed or open.
    */
    'doorClosed'?: boolean;
    /**
    * ID of the sensor.
    */
    'id'?: number;
    /**
    * Name of the sensor.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "doorClosed",
            "baseName": "doorClosed",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DoorResponseSensors.attributeTypeMap;
    }
}

export class DriverBase {
    /**
    * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    */
    'eldAdverseWeatherExemptionEnabled'?: boolean;
    /**
    * Flag indicating this driver may use Big Day excemptions in ELD logs.
    */
    'eldBigDayExemptionEnabled'?: boolean;
    /**
    * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    */
    'eldDayStartHour'?: number;
    /**
    * Flag indicating this driver is exempt from the Electronic Logging Mandate.
    */
    'eldExempt'?: boolean;
    /**
    * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    */
    'eldExemptReason'?: string;
    /**
    * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    */
    'eldPcEnabled'?: boolean;
    /**
    * Flag indicating this driver may select the Yard Move duty status in ELD logs.
    */
    'eldYmEnabled'?: boolean;
    /**
    * Dictionary of external IDs (string key-value pairs)
    */
    'externalIds'?: { [key: string]: string; };
    /**
    * ID of the group if the organization has multiple groups (uncommon).
    */
    'groupId'?: number;
    /**
    * Driver's state issued license number.
    */
    'licenseNumber'?: string;
    /**
    * Abbreviation of state that issued driver's license.
    */
    'licenseState'?: string;
    /**
    * Driver's name.
    */
    'name': string;
    /**
    * Notes about the driver.
    */
    'notes'?: string;
    /**
    * Driver's phone number. Please include only digits, ex. 4157771234
    */
    'phone'?: string;
    /**
    * Driver's login username into the driver app.
    */
    'username'?: string;
    /**
    * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "eldAdverseWeatherExemptionEnabled",
            "baseName": "eldAdverseWeatherExemptionEnabled",
            "type": "boolean"
        },
        {
            "name": "eldBigDayExemptionEnabled",
            "baseName": "eldBigDayExemptionEnabled",
            "type": "boolean"
        },
        {
            "name": "eldDayStartHour",
            "baseName": "eldDayStartHour",
            "type": "number"
        },
        {
            "name": "eldExempt",
            "baseName": "eldExempt",
            "type": "boolean"
        },
        {
            "name": "eldExemptReason",
            "baseName": "eldExemptReason",
            "type": "string"
        },
        {
            "name": "eldPcEnabled",
            "baseName": "eldPcEnabled",
            "type": "boolean"
        },
        {
            "name": "eldYmEnabled",
            "baseName": "eldYmEnabled",
            "type": "boolean"
        },
        {
            "name": "externalIds",
            "baseName": "externalIds",
            "type": "{ [key: string]: string; }"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "licenseNumber",
            "baseName": "licenseNumber",
            "type": "string"
        },
        {
            "name": "licenseState",
            "baseName": "licenseState",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "phone",
            "baseName": "phone",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DriverBase.attributeTypeMap;
    }
}

export class DriverDailyLogResponse {
    'days'?: Array<DriverDailyLogResponseDays>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "days",
            "baseName": "days",
            "type": "Array<DriverDailyLogResponseDays>"
        }    ];

    static getAttributeTypeMap() {
        return DriverDailyLogResponse.attributeTypeMap;
    }
}

export class DriverDailyLogResponseDays {
    /**
    * Hours spent on duty or driving, rounded to two decimal places.
    */
    'activeHours'?: number;
    /**
    * Milliseconds spent on duty or driving.
    */
    'activeMs'?: number;
    /**
    * Whether this HOS day chart was certified by the driver.
    */
    'certified'?: boolean;
    /**
    * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
    */
    'certifiedAtMs'?: number;
    /**
    * Distance driven in miles, rounded to two decimal places.
    */
    'distanceMiles'?: number;
    /**
    * End of the HOS day, specified in milliseconds UNIX time.
    */
    'endMs'?: number;
    /**
    * End of the HOS day, specified in milliseconds UNIX time.
    */
    'startMs'?: number;
    /**
    * List of trailer ID's associated with the driver for the day.
    */
    'trailerIds'?: any;
    /**
    * List of vehicle ID's associated with the driver for the day.
    */
    'vehicleIds'?: any;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activeHours",
            "baseName": "activeHours",
            "type": "number"
        },
        {
            "name": "activeMs",
            "baseName": "activeMs",
            "type": "number"
        },
        {
            "name": "certified",
            "baseName": "certified",
            "type": "boolean"
        },
        {
            "name": "certifiedAtMs",
            "baseName": "certifiedAtMs",
            "type": "number"
        },
        {
            "name": "distanceMiles",
            "baseName": "distanceMiles",
            "type": "number"
        },
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        },
        {
            "name": "trailerIds",
            "baseName": "trailerIds",
            "type": "any"
        },
        {
            "name": "vehicleIds",
            "baseName": "vehicleIds",
            "type": "any"
        }    ];

    static getAttributeTypeMap() {
        return DriverDailyLogResponseDays.attributeTypeMap;
    }
}

/**
* Safety score details for a driver
*/
export class DriverSafetyScoreResponse {
    /**
    * Crash event count
    */
    'crashCount'?: number;
    /**
    * Driver ID
    */
    'driverId'?: number;
    /**
    * Harsh acceleration event count
    */
    'harshAccelCount'?: number;
    /**
    * Harsh braking event count
    */
    'harshBrakingCount'?: number;
    'harshEvents'?: Array<SafetyReportHarshEvent>;
    /**
    * Harsh turning event count
    */
    'harshTurningCount'?: number;
    /**
    * Safety Score
    */
    'safetyScore'?: number;
    /**
    * Safety Score Rank
    */
    'safetyScoreRank'?: string;
    /**
    * Amount of time driven over the speed limit in milliseconds
    */
    'timeOverSpeedLimitMs'?: number;
    /**
    * Total distance driven in meters
    */
    'totalDistanceDrivenMeters'?: number;
    /**
    * Total harsh event count
    */
    'totalHarshEventCount'?: number;
    /**
    * Amount of time driven in milliseconds
    */
    'totalTimeDrivenMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "crashCount",
            "baseName": "crashCount",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "harshAccelCount",
            "baseName": "harshAccelCount",
            "type": "number"
        },
        {
            "name": "harshBrakingCount",
            "baseName": "harshBrakingCount",
            "type": "number"
        },
        {
            "name": "harshEvents",
            "baseName": "harshEvents",
            "type": "Array<SafetyReportHarshEvent>"
        },
        {
            "name": "harshTurningCount",
            "baseName": "harshTurningCount",
            "type": "number"
        },
        {
            "name": "safetyScore",
            "baseName": "safetyScore",
            "type": "number"
        },
        {
            "name": "safetyScoreRank",
            "baseName": "safetyScoreRank",
            "type": "string"
        },
        {
            "name": "timeOverSpeedLimitMs",
            "baseName": "timeOverSpeedLimitMs",
            "type": "number"
        },
        {
            "name": "totalDistanceDrivenMeters",
            "baseName": "totalDistanceDrivenMeters",
            "type": "number"
        },
        {
            "name": "totalHarshEventCount",
            "baseName": "totalHarshEventCount",
            "type": "number"
        },
        {
            "name": "totalTimeDrivenMs",
            "baseName": "totalTimeDrivenMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DriverSafetyScoreResponse.attributeTypeMap;
    }
}

export class DriversResponse {
    'drivers'?: Array<Driver>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<Driver>"
        }    ];

    static getAttributeTypeMap() {
        return DriversResponse.attributeTypeMap;
    }
}

export class DriversSummaryParam {
    /**
    * End time (ms) of queried time period.
    */
    'endMs': number;
    /**
    * Org ID to query.
    */
    'orgId': number;
    /**
    * Start time (ms) of queried time period.
    */
    'startMs': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "orgId",
            "baseName": "orgId",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DriversSummaryParam.attributeTypeMap;
    }
}

export class DriversSummaryResponse {
    'summaries'?: Array<DriversSummaryResponseSummaries>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "summaries",
            "baseName": "Summaries",
            "type": "Array<DriversSummaryResponseSummaries>"
        }    ];

    static getAttributeTypeMap() {
        return DriversSummaryResponse.attributeTypeMap;
    }
}

export class DriversSummaryResponseSummaries {
    /**
    * Duration in milliseconds that driver was on duty or driving during the requested time range
    */
    'activeMs'?: number;
    /**
    * Distance driven in miles, rounded to two decimal places.
    */
    'distanceMiles'?: number;
    /**
    * Duration in milliseconds that driver was driving during the requested time range
    */
    'driveMs'?: number;
    /**
    * ID of the driver.
    */
    'driverId'?: number;
    /**
    * Name of the driver.
    */
    'driverName'?: string;
    /**
    * Username of the driver.
    */
    'driverUsername'?: string;
    /**
    * Group of the driver.
    */
    'groupId'?: number;
    /**
    * Duration in milliseconds that driver was on duty during the requested time range
    */
    'onDutyMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activeMs",
            "baseName": "activeMs",
            "type": "number"
        },
        {
            "name": "distanceMiles",
            "baseName": "distanceMiles",
            "type": "number"
        },
        {
            "name": "driveMs",
            "baseName": "driveMs",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "driverName",
            "baseName": "driverName",
            "type": "string"
        },
        {
            "name": "driverUsername",
            "baseName": "driverUsername",
            "type": "string"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "onDutyMs",
            "baseName": "onDutyMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DriversSummaryResponseSummaries.attributeTypeMap;
    }
}

export class DvirBase {
    'authorSignature'?: DvirBaseAuthorSignature;
    /**
    * Signifies if the defects on the vehicle corrected after the DVIR is done.
    */
    'defectsCorrected'?: boolean;
    /**
    * Signifies if the defects on this vehicle can be ignored.
    */
    'defectsNeedNotBeCorrected'?: boolean;
    /**
    * The id of this DVIR record.
    */
    'id'?: number;
    /**
    * Inspection type of the DVIR.
    */
    'inspectionType'?: string;
    /**
    * The mechanics notes on the DVIR.
    */
    'mechanicNotes'?: string;
    'mechanicOrAgentSignature'?: DvirBaseMechanicOrAgentSignature;
    'nextDriverSignature'?: DvirBaseNextDriverSignature;
    /**
    * The odometer reading in miles for the vehicle when the DVIR was done.
    */
    'odometerMiles'?: number;
    /**
    * Timestamp of this DVIR in UNIX milliseconds.
    */
    'timeMs'?: number;
    /**
    * Defects registered for the trailer which was part of the DVIR.
    */
    'trailerDefects'?: Array<DvirBaseTrailerDefects>;
    /**
    * The id of the trailer which was part of the DVIR.
    */
    'trailerId'?: number;
    /**
    * The name of the trailer which was part of the DVIR.
    */
    'trailerName'?: string;
    'vehicle'?: DvirBaseVehicle;
    /**
    * The condition of vechile on which DVIR was done.
    */
    'vehicleCondition'?: string;
    /**
    * Defects registered for the vehicle which was part of the DVIR.
    */
    'vehicleDefects'?: Array<DvirBaseTrailerDefects>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "authorSignature",
            "baseName": "authorSignature",
            "type": "DvirBaseAuthorSignature"
        },
        {
            "name": "defectsCorrected",
            "baseName": "defectsCorrected",
            "type": "boolean"
        },
        {
            "name": "defectsNeedNotBeCorrected",
            "baseName": "defectsNeedNotBeCorrected",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "inspectionType",
            "baseName": "inspectionType",
            "type": "string"
        },
        {
            "name": "mechanicNotes",
            "baseName": "mechanicNotes",
            "type": "string"
        },
        {
            "name": "mechanicOrAgentSignature",
            "baseName": "mechanicOrAgentSignature",
            "type": "DvirBaseMechanicOrAgentSignature"
        },
        {
            "name": "nextDriverSignature",
            "baseName": "nextDriverSignature",
            "type": "DvirBaseNextDriverSignature"
        },
        {
            "name": "odometerMiles",
            "baseName": "odometerMiles",
            "type": "number"
        },
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        },
        {
            "name": "trailerDefects",
            "baseName": "trailerDefects",
            "type": "Array<DvirBaseTrailerDefects>"
        },
        {
            "name": "trailerId",
            "baseName": "trailerId",
            "type": "number"
        },
        {
            "name": "trailerName",
            "baseName": "trailerName",
            "type": "string"
        },
        {
            "name": "vehicle",
            "baseName": "vehicle",
            "type": "DvirBaseVehicle"
        },
        {
            "name": "vehicleCondition",
            "baseName": "vehicleCondition",
            "type": "string"
        },
        {
            "name": "vehicleDefects",
            "baseName": "vehicleDefects",
            "type": "Array<DvirBaseTrailerDefects>"
        }    ];

    static getAttributeTypeMap() {
        return DvirBase.attributeTypeMap;
    }
}

/**
* The authors signature for the DVIR.
*/
export class DvirBaseAuthorSignature {
    /**
    * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
    */
    'driverId'?: number;
    /**
    * Email of the  driver|mechanic who signed the DVIR.
    */
    'email'?: string;
    /**
    * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
    */
    'mechanicUserId'?: number;
    /**
    * The name of the driver or mechanic who signed the DVIR.
    */
    'name'?: string;
    /**
    * The time in millis when the DVIR was signed
    */
    'signedAt'?: number;
    /**
    * Type corresponds to whether the signature corresponds to driver|mechanic.
    */
    'type'?: string;
    /**
    * Username of the  driver|mechanic who signed the DVIR.
    */
    'username'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "mechanicUserId",
            "baseName": "mechanicUserId",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "signedAt",
            "baseName": "signedAt",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DvirBaseAuthorSignature.attributeTypeMap;
    }
}

/**
* The mechanic's or agent's signature for the DVIR.
*/
export class DvirBaseMechanicOrAgentSignature {
    /**
    * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
    */
    'driverId'?: number;
    /**
    * Email of the  agent|mechanic who signed the DVIR.
    */
    'email'?: string;
    /**
    * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
    */
    'mechanicUserId'?: number;
    /**
    * The name of the agent or mechanic who signed the DVIR.
    */
    'name'?: string;
    /**
    * The time in millis when the DVIR was signed
    */
    'signedAt'?: number;
    /**
    * Type corresponds to whether the signature corresponds to driver|mechanic.
    */
    'type'?: string;
    /**
    * Username of the  agent|mechanic who signed the DVIR.
    */
    'username'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "mechanicUserId",
            "baseName": "mechanicUserId",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "signedAt",
            "baseName": "signedAt",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DvirBaseMechanicOrAgentSignature.attributeTypeMap;
    }
}

/**
* The next driver signature for the DVIR.
*/
export class DvirBaseNextDriverSignature {
    /**
    * ID of the driver who signed the DVIR
    */
    'driverId'?: number;
    /**
    * Email of the  driver who signed the next DVIR on this vehicle.
    */
    'email'?: string;
    /**
    * The name of the driver who signed the next DVIR on this vehicle.
    */
    'name'?: string;
    /**
    * The time in millis when the next driver signed the DVIR on this vehicle.
    */
    'signedAt'?: number;
    /**
    * Type corresponds to driver.
    */
    'type'?: string;
    /**
    * Username of the  driver who signed the next DVIR on this vehicle.
    */
    'username'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "signedAt",
            "baseName": "signedAt",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DvirBaseNextDriverSignature.attributeTypeMap;
    }
}

export class DvirBaseTrailerDefects {
    /**
    * The comment describing the type of DVIR defect
    */
    'comment'?: string;
    /**
    * The type of DVIR defect
    */
    'defectType'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "comment",
            "baseName": "comment",
            "type": "string"
        },
        {
            "name": "defectType",
            "baseName": "defectType",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DvirBaseTrailerDefects.attributeTypeMap;
    }
}

/**
* The vehicle on which DVIR was done.
*/
export class DvirBaseVehicle {
    /**
    * The vehicle id on which DVIR was done.
    */
    'id'?: number;
    /**
    * The vehicle on which DVIR was done.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DvirBaseVehicle.attributeTypeMap;
    }
}

export class DvirListResponse {
    'dvirs'?: Array<DvirBase>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dvirs",
            "baseName": "dvirs",
            "type": "Array<DvirBase>"
        }    ];

    static getAttributeTypeMap() {
        return DvirListResponse.attributeTypeMap;
    }
}

/**
* The state of the vehicle over time. State can be Running, Off, or Idle.
*/
export class EngineState {
    /**
    * Timestamp in Unix epoch milliseconds.
    */
    'timeMs': number;
    'value': EngineState.ValueEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "EngineState.ValueEnum"
        }    ];

    static getAttributeTypeMap() {
        return EngineState.attributeTypeMap;
    }
}

export namespace EngineState {
    export enum ValueEnum {
        Running = <any> 'Running',
        Off = <any> 'Off',
        Idle = <any> 'Idle'
    }
}
/**
* Error message describing why the request failed.
*/
export class ErrorResponse {

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
    ];

    static getAttributeTypeMap() {
        return ErrorResponse.attributeTypeMap;
    }
}

/**
* Contains the location and speed of a vehicle at a particular time
*/
export class FleetVehicleLocation {
    /**
    * The latitude of the location in degrees.
    */
    'latitude'?: number;
    /**
    * The best effort (street,city,state) for the latitude and longitude.
    */
    'location'?: string;
    /**
    * The longitude of the location in degrees.
    */
    'longitude'?: number;
    /**
    * The speed calculated from GPS that the asset was traveling at in miles per hour.
    */
    'speedMilesPerHour'?: number;
    /**
    * Time in Unix milliseconds since epoch when the asset was at the location.
    */
    'timeMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "string"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        },
        {
            "name": "speedMilesPerHour",
            "baseName": "speedMilesPerHour",
            "type": "number"
        },
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return FleetVehicleLocation.attributeTypeMap;
    }
}

export class FleetVehicleLocations extends Array<FleetVehicleLocation> {

    static discriminator: string | undefined = undefined;

}

/**
* A vehicle object as returned for fleet/vehicle
*/
export class FleetVehicleResponse {
    'externalIds'?: { [key: string]: string; };
    /**
    * Harsh event detection setting.
    */
    'harshAccelSetting'?: string;
    /**
    * ID of the vehicle.
    */
    'id': number;
    /**
    * Name of the vehicle.
    */
    'name': string;
    'vehicleInfo'?: FleetVehicleResponseVehicleInfo;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "externalIds",
            "baseName": "externalIds",
            "type": "{ [key: string]: string; }"
        },
        {
            "name": "harshAccelSetting",
            "baseName": "harshAccelSetting",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "vehicleInfo",
            "baseName": "vehicleInfo",
            "type": "FleetVehicleResponseVehicleInfo"
        }    ];

    static getAttributeTypeMap() {
        return FleetVehicleResponse.attributeTypeMap;
    }
}

export class FleetVehicleResponseVehicleInfo {
    /**
    * Make of the vehicle.
    */
    'make'?: string;
    /**
    * Model of the Vehicle.
    */
    'model'?: string;
    /**
    * Vehicle Identification Number.
    */
    'vin'?: string;
    /**
    * Year of the vehicle.
    */
    'year'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "make",
            "baseName": "make",
            "type": "string"
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "string"
        },
        {
            "name": "vin",
            "baseName": "vin",
            "type": "string"
        },
        {
            "name": "year",
            "baseName": "year",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return FleetVehicleResponseVehicleInfo.attributeTypeMap;
    }
}

export class FleetVehiclesLocations extends Array<FleetVehiclesLocationsInner> {

    static discriminator: string | undefined = undefined;

}

export class FleetVehiclesLocationsInner {
    /**
    * ID of the vehicle.
    */
    'id'?: number;
    'locations'?: FleetVehicleLocations;
    /**
    * Name of the vehicle.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "locations",
            "baseName": "locations",
            "type": "FleetVehicleLocations"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return FleetVehiclesLocationsInner.attributeTypeMap;
    }
}

export class GroupDriversParam {
    /**
    * Group ID to query.
    */
    'groupId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return GroupDriversParam.attributeTypeMap;
    }
}

export class GroupParam {
    /**
    * Group ID to query.
    */
    'groupId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return GroupParam.attributeTypeMap;
    }
}

export class HistoryParam {
    /**
    * End of the time range, specified in milliseconds UNIX time.
    */
    'endMs': number;
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * Beginning of the time range, specified in milliseconds UNIX time.
    */
    'startMs': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HistoryParam.attributeTypeMap;
    }
}

export class HistoryParam1 {
    /**
    * End of the time range, specified in milliseconds UNIX time.
    */
    'endMs': number;
    'fillMissing'?: HistoryParam1.FillMissingEnum;
    /**
    * Group ID to query.
    */
    'groupId': number;
    'series': Array<SensorshistorySeries>;
    /**
    * Beginning of the time range, specified in milliseconds UNIX time.
    */
    'startMs': number;
    /**
    * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
    */
    'stepMs': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "fillMissing",
            "baseName": "fillMissing",
            "type": "HistoryParam1.FillMissingEnum"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "series",
            "baseName": "series",
            "type": "Array<SensorshistorySeries>"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        },
        {
            "name": "stepMs",
            "baseName": "stepMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HistoryParam1.attributeTypeMap;
    }
}

export namespace HistoryParam1 {
    export enum FillMissingEnum {
        WithNull = <any> 'withNull',
        WithPrevious = <any> 'withPrevious'
    }
}
export class HosAuthenticationLogsParam {
    /**
    * Driver ID to query.
    */
    'driverId': number;
    /**
    * End of the time range, specified in milliseconds UNIX time.
    */
    'endMs': number;
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * Beginning of the time range, specified in milliseconds UNIX time.
    */
    'startMs': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HosAuthenticationLogsParam.attributeTypeMap;
    }
}

export class HosAuthenticationLogsResponse {
    'authenticationLogs'?: Array<HosAuthenticationLogsResponseAuthenticationLogs>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "authenticationLogs",
            "baseName": "authenticationLogs",
            "type": "Array<HosAuthenticationLogsResponseAuthenticationLogs>"
        }    ];

    static getAttributeTypeMap() {
        return HosAuthenticationLogsResponse.attributeTypeMap;
    }
}

export class HosAuthenticationLogsResponseAuthenticationLogs {
    /**
    * The log type - one of 'signin' or 'signout'
    */
    'actionType'?: string;
    /**
    * Address at which the log was recorded, if applicable.
    */
    'address'?: string;
    /**
    * Address name from the group address book at which the log was recorded, if applicable.
    */
    'addressName'?: string;
    /**
    * City in which the log was recorded, if applicable.
    */
    'city'?: string;
    /**
    * The time at which the event was recorded in UNIX milliseconds.
    */
    'happenedAtMs'?: number;
    /**
    * State in which the log was recorded, if applicable.
    */
    'state'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "actionType",
            "baseName": "actionType",
            "type": "string"
        },
        {
            "name": "address",
            "baseName": "address",
            "type": "string"
        },
        {
            "name": "addressName",
            "baseName": "addressName",
            "type": "string"
        },
        {
            "name": "city",
            "baseName": "city",
            "type": "string"
        },
        {
            "name": "happenedAtMs",
            "baseName": "happenedAtMs",
            "type": "number"
        },
        {
            "name": "state",
            "baseName": "state",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return HosAuthenticationLogsResponseAuthenticationLogs.attributeTypeMap;
    }
}

export class HosLogsParam {
    /**
    * Driver ID to query.
    */
    'driverId': number;
    /**
    * End of the time range, specified in milliseconds UNIX time.
    */
    'endMs': number;
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * Beginning of the time range, specified in milliseconds UNIX time.
    */
    'startMs': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsParam.attributeTypeMap;
    }
}

export class HosLogsParam1 {
    /**
    * Driver ID to query.
    */
    'driverId': number;
    /**
    * End of the time range, specified in milliseconds UNIX time.
    */
    'endMs': number;
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * Beginning of the time range, specified in milliseconds UNIX time.
    */
    'startMs': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsParam1.attributeTypeMap;
    }
}

export class HosLogsParam2 {
    /**
    * Group ID to query.
    */
    'groupId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsParam2.attributeTypeMap;
    }
}

export class HosLogsResponse {
    'logs'?: Array<HosLogsResponseLogs>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "logs",
            "baseName": "logs",
            "type": "Array<HosLogsResponseLogs>"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsResponse.attributeTypeMap;
    }
}

export class HosLogsResponseLogs {
    'codriverIds'?: Array<number>;
    /**
    * ID of the driver.
    */
    'driverId'?: number;
    /**
    * ID of the group.
    */
    'groupId'?: number;
    /**
    * City in which the log was recorded.
    */
    'locCity'?: string;
    /**
    * Latitude at which the log was recorded.
    */
    'locLat'?: number;
    /**
    * Longitude at which the log was recorded.
    */
    'locLng'?: number;
    /**
    * Name of location at which the log was recorded.
    */
    'locName'?: string;
    /**
    * State in which the log was recorded.
    */
    'locState'?: string;
    /**
    * The time at which the log/HOS status started in UNIX milliseconds.
    */
    'logStartMs'?: number;
    /**
    * Remark associated with the log entry.
    */
    'remark'?: string;
    /**
    * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    */
    'statusType'?: string;
    /**
    * ID of the vehicle.
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "codriverIds",
            "baseName": "codriverIds",
            "type": "Array<number>"
        },
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "locCity",
            "baseName": "locCity",
            "type": "string"
        },
        {
            "name": "locLat",
            "baseName": "locLat",
            "type": "number"
        },
        {
            "name": "locLng",
            "baseName": "locLng",
            "type": "number"
        },
        {
            "name": "locName",
            "baseName": "locName",
            "type": "string"
        },
        {
            "name": "locState",
            "baseName": "locState",
            "type": "string"
        },
        {
            "name": "logStartMs",
            "baseName": "logStartMs",
            "type": "number"
        },
        {
            "name": "remark",
            "baseName": "remark",
            "type": "string"
        },
        {
            "name": "statusType",
            "baseName": "statusType",
            "type": "string"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsResponseLogs.attributeTypeMap;
    }
}

export class HosLogsSummaryResponse {
    'drivers'?: Array<HosLogsSummaryResponseDrivers>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<HosLogsSummaryResponseDrivers>"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsSummaryResponse.attributeTypeMap;
    }
}

export class HosLogsSummaryResponseDrivers {
    /**
    * The amount of remaining cycle time (in ms).
    */
    'cycleRemaining'?: number;
    /**
    * The amount of cycle time (in ms) available tomorrow.
    */
    'cycleTomorrow'?: number;
    /**
    * ID of the driver.
    */
    'driverId'?: number;
    /**
    * Name of the driver.
    */
    'driverName'?: string;
    /**
    * The amount of driving time in violation in this cycle (in ms).
    */
    'drivingInViolationCycle'?: number;
    /**
    * The amount of driving time in violation today (in ms).
    */
    'drivingInViolationToday'?: number;
    /**
    * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    */
    'dutyStatus'?: string;
    /**
    * The amount of remaining shift drive time (in ms).
    */
    'shiftDriveRemaining'?: number;
    /**
    * The amount of remaining shift time (in ms).
    */
    'shiftRemaining'?: number;
    /**
    * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
    */
    'timeInCurrentStatus'?: number;
    /**
    * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
    */
    'timeUntilBreak'?: number;
    /**
    * Name of the vehicle.
    */
    'vehicleName'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cycleRemaining",
            "baseName": "cycleRemaining",
            "type": "number"
        },
        {
            "name": "cycleTomorrow",
            "baseName": "cycleTomorrow",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "driverName",
            "baseName": "driverName",
            "type": "string"
        },
        {
            "name": "drivingInViolationCycle",
            "baseName": "drivingInViolationCycle",
            "type": "number"
        },
        {
            "name": "drivingInViolationToday",
            "baseName": "drivingInViolationToday",
            "type": "number"
        },
        {
            "name": "dutyStatus",
            "baseName": "dutyStatus",
            "type": "string"
        },
        {
            "name": "shiftDriveRemaining",
            "baseName": "shiftDriveRemaining",
            "type": "number"
        },
        {
            "name": "shiftRemaining",
            "baseName": "shiftRemaining",
            "type": "number"
        },
        {
            "name": "timeInCurrentStatus",
            "baseName": "timeInCurrentStatus",
            "type": "number"
        },
        {
            "name": "timeUntilBreak",
            "baseName": "timeUntilBreak",
            "type": "number"
        },
        {
            "name": "vehicleName",
            "baseName": "vehicleName",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return HosLogsSummaryResponseDrivers.attributeTypeMap;
    }
}

/**
* Contains the current humidity of a sensor.
*/
export class HumidityResponse {
    'groupId'?: number;
    'sensors'?: Array<HumidityResponseSensors>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<HumidityResponseSensors>"
        }    ];

    static getAttributeTypeMap() {
        return HumidityResponse.attributeTypeMap;
    }
}

export class HumidityResponseSensors {
    /**
    * Currently reported relative humidity in percent, from 0-100.
    */
    'humidity'?: number;
    /**
    * ID of the sensor.
    */
    'id'?: number;
    /**
    * Name of the sensor.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "humidity",
            "baseName": "humidity",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return HumidityResponseSensors.attributeTypeMap;
    }
}

export class InlineResponse200 {
    'assets'?: Array<Asset>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<Asset>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse200.attributeTypeMap;
    }
}

export class InlineResponse2001 {
    'assets'?: Array<AssetCurrentLocationsResponse>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<AssetCurrentLocationsResponse>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2001.attributeTypeMap;
    }
}

export class InlineResponse2002 {
    /**
    * Group ID to query.
    */
    'groupId'?: number;
    'pagination'?: Pagination;
    'vehicles'?: Array<Vehicle>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "pagination",
            "baseName": "pagination",
            "type": "Pagination"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<Vehicle>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2002.attributeTypeMap;
    }
}

export class InlineResponse2003 {
    /**
    * Group ID to query.
    */
    'groupId'?: number;
    'vehicles'?: Array<VehicleLocation>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<VehicleLocation>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2003.attributeTypeMap;
    }
}

export class InlineResponse2004 {
    'vehicles'?: Array<VehicleMaintenance>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<VehicleMaintenance>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2004.attributeTypeMap;
    }
}

export class InlineResponse2005 {
    'pagination'?: Pagination;
    'vehicleStats': Array<InlineResponse2005VehicleStats>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "pagination",
            "baseName": "pagination",
            "type": "Pagination"
        },
        {
            "name": "vehicleStats",
            "baseName": "vehicleStats",
            "type": "Array<InlineResponse2005VehicleStats>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2005.attributeTypeMap;
    }
}

export class InlineResponse2005VehicleStats {
    'auxInput1'?: AuxInputSeries;
    'auxInput2'?: AuxInputSeries;
    'engineState'?: Array<EngineState>;
    /**
    * ID of the vehicle.
    */
    'vehicleId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "auxInput1",
            "baseName": "auxInput1",
            "type": "AuxInputSeries"
        },
        {
            "name": "auxInput2",
            "baseName": "auxInput2",
            "type": "AuxInputSeries"
        },
        {
            "name": "engineState",
            "baseName": "engineState",
            "type": "Array<EngineState>"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2005VehicleStats.attributeTypeMap;
    }
}

export class InlineResponse2006 {
    'dataInputs'?: Array<DataInputHistoryResponse>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dataInputs",
            "baseName": "dataInputs",
            "type": "Array<DataInputHistoryResponse>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2006.attributeTypeMap;
    }
}

export class InlineResponse2007 {
    'machines'?: Array<Machine>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<Machine>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2007.attributeTypeMap;
    }
}

export class InlineResponse2008 {
    'sensors'?: Array<Sensor>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<Sensor>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2008.attributeTypeMap;
    }
}

export class InlineResponse2009 {
    'tags'?: Array<Tag>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<Tag>"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2009.attributeTypeMap;
    }
}

/**
* The current state of the dispatch job.
*/
export class JobStatus {

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
    ];

    static getAttributeTypeMap() {
        return JobStatus.attributeTypeMap;
    }
}

export class JobUpdateObject {
    /**
    * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
    */
    'changedAtMs'?: number;
    /**
    * ID of the Samsara job.
    */
    'jobId'?: number;
    'jobState'?: JobStatus;
    'prevJobState'?: PrevJobStatus;
    'route'?: DispatchRoute;
    /**
    * ID of the Samsara dispatch route.
    */
    'routeId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changedAtMs",
            "baseName": "changed_at_ms",
            "type": "number"
        },
        {
            "name": "jobId",
            "baseName": "job_id",
            "type": "number"
        },
        {
            "name": "jobState",
            "baseName": "job_state",
            "type": "JobStatus"
        },
        {
            "name": "prevJobState",
            "baseName": "prev_job_state",
            "type": "PrevJobStatus"
        },
        {
            "name": "route",
            "baseName": "route",
            "type": "DispatchRoute"
        },
        {
            "name": "routeId",
            "baseName": "route_id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return JobUpdateObject.attributeTypeMap;
    }
}

/**
* Contains information about a machine.
*/
export class Machine {
    /**
    * ID of the machine.
    */
    'id': number;
    /**
    * Name of the machine.
    */
    'name'?: string;
    /**
    * Notes about the machine
    */
    'notes'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Machine.attributeTypeMap;
    }
}

/**
* Contains the results for a machine history request
*/
export class MachineHistoryResponse {
    'machines'?: Array<MachineHistoryResponseMachines>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<MachineHistoryResponseMachines>"
        }    ];

    static getAttributeTypeMap() {
        return MachineHistoryResponse.attributeTypeMap;
    }
}

export class MachineHistoryResponseMachines {
    /**
    * Machine ID
    */
    'id'?: number;
    /**
    * Machine name
    */
    'name'?: string;
    /**
    * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
    */
    'vibrations'?: Array<MachineHistoryResponseVibrations>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "vibrations",
            "baseName": "vibrations",
            "type": "Array<MachineHistoryResponseVibrations>"
        }    ];

    static getAttributeTypeMap() {
        return MachineHistoryResponseMachines.attributeTypeMap;
    }
}

export class MachineHistoryResponseVibrations {
    'X'?: number;
    'Y'?: number;
    'Z'?: number;
    'time'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "X",
            "baseName": "X",
            "type": "number"
        },
        {
            "name": "Y",
            "baseName": "Y",
            "type": "number"
        },
        {
            "name": "Z",
            "baseName": "Z",
            "type": "number"
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return MachineHistoryResponseVibrations.attributeTypeMap;
    }
}

export class Pagination {
    /**
    * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
    */
    'endCursor': string;
    /**
    * True if there are more pages of results after this response.
    */
    'hasNextPage': boolean;
    /**
    * True if there are more pages of results before this response.
    */
    'hasPrevPage': boolean;
    /**
    * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
    */
    'startCursor': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endCursor",
            "baseName": "endCursor",
            "type": "string"
        },
        {
            "name": "hasNextPage",
            "baseName": "hasNextPage",
            "type": "boolean"
        },
        {
            "name": "hasPrevPage",
            "baseName": "hasPrevPage",
            "type": "boolean"
        },
        {
            "name": "startCursor",
            "baseName": "startCursor",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Pagination.attributeTypeMap;
    }
}

/**
* The previous state of the dispatch job.
*/
export class PrevJobStatus {

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
    ];

    static getAttributeTypeMap() {
        return PrevJobStatus.attributeTypeMap;
    }
}

export class ReactivateDriverParam {
    /**
    * True indicates that this driver should be reactivated.
    */
    'reactivate': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "reactivate",
            "baseName": "reactivate",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ReactivateDriverParam.attributeTypeMap;
    }
}

/**
* List of harsh events
*/
export class SafetyReportHarshEvent {
    /**
    * Type of the harsh event
    */
    'harshEventType'?: string;
    /**
    * Timestamp that the harsh event occurred in Unix milliseconds since epoch
    */
    'timestampMs'?: number;
    /**
    * Vehicle associated with the harsh event
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "harshEventType",
            "baseName": "harshEventType",
            "type": "string"
        },
        {
            "name": "timestampMs",
            "baseName": "timestampMs",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return SafetyReportHarshEvent.attributeTypeMap;
    }
}

/**
* Contains information about a sensor.
*/
export class Sensor {
    /**
    * ID of the sensor.
    */
    'id': number;
    /**
    * MAC address of the sensor.
    */
    'macAddress'?: string;
    /**
    * Name of the sensor.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "macAddress",
            "baseName": "macAddress",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Sensor.attributeTypeMap;
    }
}

/**
* Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
*/
export class SensorHistoryResponse {
    'results'?: Array<SensorHistoryResponseResults>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "results",
            "baseName": "results",
            "type": "Array<SensorHistoryResponseResults>"
        }    ];

    static getAttributeTypeMap() {
        return SensorHistoryResponse.attributeTypeMap;
    }
}

export class SensorHistoryResponseResults {
    /**
    * List of datapoints, one for each requested (sensor, field) pair.
    */
    'series'?: Array<number>;
    /**
    * Timestamp in UNIX milliseconds.
    */
    'timeMs'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "series",
            "baseName": "series",
            "type": "Array<number>"
        },
        {
            "name": "timeMs",
            "baseName": "timeMs",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return SensorHistoryResponseResults.attributeTypeMap;
    }
}

export class SensorParam {
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * List of sensor IDs to query.
    */
    'sensors': Array<number>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<number>"
        }    ];

    static getAttributeTypeMap() {
        return SensorParam.attributeTypeMap;
    }
}

/**
* Sensor ID and field to query.
*/
export class SensorshistorySeries {
    /**
    * Field to query.
    */
    'field': SensorshistorySeries.FieldEnum;
    /**
    * Sensor ID to query.
    */
    'widgetId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "field",
            "baseName": "field",
            "type": "SensorshistorySeries.FieldEnum"
        },
        {
            "name": "widgetId",
            "baseName": "widgetId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return SensorshistorySeries.attributeTypeMap;
    }
}

export namespace SensorshistorySeries {
    export enum FieldEnum {
        AmbientTemperature = <any> 'ambientTemperature',
        ProbeTemperature = <any> 'probeTemperature',
        CurrentLoop1Raw = <any> 'currentLoop1Raw',
        CurrentLoop1Mapped = <any> 'currentLoop1Mapped',
        CurrentLoop2Raw = <any> 'currentLoop2Raw',
        CurrentLoop2Mapped = <any> 'currentLoop2Mapped',
        PmPowerTotal = <any> 'pmPowerTotal',
        PmPhase1Power = <any> 'pmPhase1Power',
        PmPhase2Power = <any> 'pmPhase2Power',
        PmPhase3Power = <any> 'pmPhase3Power',
        PmPhase1PowerFactor = <any> 'pmPhase1PowerFactor',
        PmPhase2PowerFactor = <any> 'pmPhase2PowerFactor',
        PmPhase3PowerFactor = <any> 'pmPhase3PowerFactor'
    }
}
export class Tag {
    /**
    * The addresses that belong to this tag.
    */
    'addresses'?: Array<TaggedAddress>;
    /**
    * The assets that belong to this tag.
    */
    'assets'?: Array<TaggedAsset>;
    /**
    * The drivers that belong to this tag.
    */
    'drivers'?: Array<TaggedDriver>;
    /**
    * The GroupID that this tag belongs to.
    */
    'groupId'?: number;
    /**
    * The ID of this tag.
    */
    'id': number;
    /**
    * The machines that belong to this tag.
    */
    'machines'?: Array<TaggedMachine>;
    /**
    * Name of this tag.
    */
    'name': string;
    /**
    * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    */
    'parentTagId'?: number;
    /**
    * The sensors that belong to this tag.
    */
    'sensors'?: Array<TaggedSensor>;
    /**
    * The vehicles that belong to this tag.
    */
    'vehicles'?: Array<TaggedVehicle>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "addresses",
            "baseName": "addresses",
            "type": "Array<TaggedAddress>"
        },
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<TaggedAsset>"
        },
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<TaggedDriver>"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<TaggedMachine>"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parentTagId",
            "baseName": "parentTagId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<TaggedSensor>"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<TaggedVehicle>"
        }    ];

    static getAttributeTypeMap() {
        return Tag.attributeTypeMap;
    }
}

export class TagCreate {
    /**
    * The assets that belong to this tag.
    */
    'assets'?: Array<TaggedAssetBase>;
    /**
    * The drivers that belong to this tag.
    */
    'drivers'?: Array<TaggedDriverBase>;
    /**
    * The machines that belong to this tag.
    */
    'machines'?: Array<TaggedMachineBase>;
    /**
    * Name of this tag.
    */
    'name': string;
    /**
    * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    */
    'parentTagId'?: number;
    /**
    * The sensors that belong to this tag.
    */
    'sensors'?: Array<TaggedSensorBase>;
    /**
    * The vehicles that belong to this tag.
    */
    'vehicles'?: Array<TaggedVehicleBase>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<TaggedAssetBase>"
        },
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<TaggedDriverBase>"
        },
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<TaggedMachineBase>"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parentTagId",
            "baseName": "parentTagId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<TaggedSensorBase>"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<TaggedVehicleBase>"
        }    ];

    static getAttributeTypeMap() {
        return TagCreate.attributeTypeMap;
    }
}

/**
* A list of tag IDs.
*/
export class TagIds extends Array<number> {

    static discriminator: string | undefined = undefined;

}

export class TagMetadata {
    /**
    * The ID of this tag.
    */
    'id': number;
    /**
    * Name of this tag.
    */
    'name': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TagMetadata.attributeTypeMap;
    }
}

export class TagModify {
    'add'?: TagModifyAdd;
    '_delete'?: TagModifyDelete;
    /**
    * Updated name of this tag.
    */
    'name'?: string;
    /**
    * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    */
    'parentTagId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "add",
            "baseName": "add",
            "type": "TagModifyAdd"
        },
        {
            "name": "_delete",
            "baseName": "delete",
            "type": "TagModifyDelete"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parentTagId",
            "baseName": "parentTagId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TagModify.attributeTypeMap;
    }
}

/**
* Specify devices, etc. that should be added to the tag.
*/
export class TagModifyAdd {
    /**
    * The assets to be added to this tag.
    */
    'assets'?: Array<TaggedAssetBase>;
    /**
    * The drivers to be added to this tag.
    */
    'drivers'?: Array<TaggedDriverBase>;
    /**
    * The machines to be added to this tag.
    */
    'machines'?: Array<TaggedMachineBase>;
    /**
    * The sensors to be added to this tag.
    */
    'sensors'?: Array<TaggedSensorBase>;
    /**
    * The vehicles to be added to this tag.
    */
    'vehicles'?: Array<TaggedVehicleBase>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<TaggedAssetBase>"
        },
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<TaggedDriverBase>"
        },
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<TaggedMachineBase>"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<TaggedSensorBase>"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<TaggedVehicleBase>"
        }    ];

    static getAttributeTypeMap() {
        return TagModifyAdd.attributeTypeMap;
    }
}

/**
* Specify devices, etc. that should be removed from the tag.
*/
export class TagModifyDelete {
    /**
    * The assets to be removed from this tag.
    */
    'assets'?: Array<TaggedAssetBase>;
    /**
    * The drivers to be removed from this tag.
    */
    'drivers'?: Array<TaggedDriverBase>;
    /**
    * The machines to be removed from this tag.
    */
    'machines'?: Array<TaggedMachineBase>;
    /**
    * The sensors to be removed from this tag.
    */
    'sensors'?: Array<TaggedSensorBase>;
    /**
    * The vehicles to be removed from this tag.
    */
    'vehicles'?: Array<TaggedVehicleBase>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<TaggedAssetBase>"
        },
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<TaggedDriverBase>"
        },
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<TaggedMachineBase>"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<TaggedSensorBase>"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<TaggedVehicleBase>"
        }    ];

    static getAttributeTypeMap() {
        return TagModifyDelete.attributeTypeMap;
    }
}

export class TagUpdate {
    /**
    * The assets that belong to this tag.
    */
    'assets'?: Array<TaggedAssetBase>;
    /**
    * The drivers that belong to this tag.
    */
    'drivers'?: Array<TaggedDriverBase>;
    /**
    * The machines that belong to this tag.
    */
    'machines'?: Array<TaggedMachineBase>;
    /**
    * Updated name of this tag.
    */
    'name'?: string;
    /**
    * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    */
    'parentTagId'?: number;
    /**
    * The sensors that belong to this tag.
    */
    'sensors'?: Array<TaggedSensorBase>;
    /**
    * The vehicles that belong to this tag.
    */
    'vehicles'?: Array<TaggedVehicleBase>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<TaggedAssetBase>"
        },
        {
            "name": "drivers",
            "baseName": "drivers",
            "type": "Array<TaggedDriverBase>"
        },
        {
            "name": "machines",
            "baseName": "machines",
            "type": "Array<TaggedMachineBase>"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parentTagId",
            "baseName": "parentTagId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<TaggedSensorBase>"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<TaggedVehicleBase>"
        }    ];

    static getAttributeTypeMap() {
        return TagUpdate.attributeTypeMap;
    }
}

export class TaggedAddressBase {
    /**
    * The ID of the address being tagged.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TaggedAddressBase.attributeTypeMap;
    }
}

export class TaggedAssetBase {
    /**
    * The ID of the Asset being tagged.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TaggedAssetBase.attributeTypeMap;
    }
}

export class TaggedDriverBase {
    /**
    * The ID of the Driver being tagged.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TaggedDriverBase.attributeTypeMap;
    }
}

export class TaggedMachineBase {
    /**
    * The ID of the Machine being tagged.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TaggedMachineBase.attributeTypeMap;
    }
}

export class TaggedSensorBase {
    /**
    * The ID of the Sensor being tagged.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TaggedSensorBase.attributeTypeMap;
    }
}

export class TaggedVehicleBase {
    /**
    * The ID of the Vehicle being tagged.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TaggedVehicleBase.attributeTypeMap;
    }
}

/**
* Contains the current temperatures of a sensor.
*/
export class TemperatureResponse {
    'groupId'?: number;
    'sensors'?: Array<TemperatureResponseSensors>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "sensors",
            "baseName": "sensors",
            "type": "Array<TemperatureResponseSensors>"
        }    ];

    static getAttributeTypeMap() {
        return TemperatureResponse.attributeTypeMap;
    }
}

export class TemperatureResponseSensors {
    /**
    * Currently reported ambient temperature in millidegrees celsius.
    */
    'ambientTemperature'?: number;
    /**
    * ID of the sensor.
    */
    'id'?: number;
    /**
    * Name of the sensor.
    */
    'name'?: string;
    /**
    * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
    */
    'probeTemperature'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "ambientTemperature",
            "baseName": "ambientTemperature",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "probeTemperature",
            "baseName": "probeTemperature",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TemperatureResponseSensors.attributeTypeMap;
    }
}

/**
* Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
*/
export class TripResponse {
    'trips'?: Array<TripResponseTrips>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "trips",
            "baseName": "trips",
            "type": "Array<TripResponseTrips>"
        }    ];

    static getAttributeTypeMap() {
        return TripResponse.attributeTypeMap;
    }
}

/**
* End (latitude, longitude) in decimal degrees.
*/
export class TripResponseEndCoordinates {
    'latitude'?: number;
    'longitude'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TripResponseEndCoordinates.attributeTypeMap;
    }
}

/**
* Start (latitude, longitude) in decimal degrees.
*/
export class TripResponseStartCoordinates {
    'latitude'?: number;
    'longitude'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TripResponseStartCoordinates.attributeTypeMap;
    }
}

export class TripResponseTrips {
    /**
    * Length of the trip in meters.
    */
    'distanceMeters'?: number;
    /**
    * ID of the driver.
    */
    'driverId'?: number;
    /**
    * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
    */
    'endAddress'?: string;
    'endCoordinates'?: TripResponseEndCoordinates;
    /**
    * Geocoded street address of start (latitude, longitude) coordinates.
    */
    'endLocation'?: string;
    /**
    * End of the trip in UNIX milliseconds.
    */
    'endMs'?: number;
    /**
    * Odometer reading at the end of the trip.
    */
    'endOdometer'?: number;
    /**
    * Amount in milliliters of fuel consumed on this trip.
    */
    'fuelConsumedMl'?: number;
    /**
    * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
    */
    'startAddress'?: string;
    'startCoordinates'?: TripResponseStartCoordinates;
    /**
    * Geocoded street address of start (latitude, longitude) coordinates.
    */
    'startLocation'?: string;
    /**
    * Beginning of the trip in UNIX milliseconds.
    */
    'startMs'?: number;
    /**
    * Odometer reading at the beginning of the trip.
    */
    'startOdometer'?: number;
    /**
    * Length in meters trip spent on toll roads.
    */
    'tollMeters'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "distanceMeters",
            "baseName": "distanceMeters",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "endAddress",
            "baseName": "endAddress",
            "type": "string"
        },
        {
            "name": "endCoordinates",
            "baseName": "endCoordinates",
            "type": "TripResponseEndCoordinates"
        },
        {
            "name": "endLocation",
            "baseName": "endLocation",
            "type": "string"
        },
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "endOdometer",
            "baseName": "endOdometer",
            "type": "number"
        },
        {
            "name": "fuelConsumedMl",
            "baseName": "fuelConsumedMl",
            "type": "number"
        },
        {
            "name": "startAddress",
            "baseName": "startAddress",
            "type": "string"
        },
        {
            "name": "startCoordinates",
            "baseName": "startCoordinates",
            "type": "TripResponseStartCoordinates"
        },
        {
            "name": "startLocation",
            "baseName": "startLocation",
            "type": "string"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        },
        {
            "name": "startOdometer",
            "baseName": "startOdometer",
            "type": "number"
        },
        {
            "name": "tollMeters",
            "baseName": "tollMeters",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TripResponseTrips.attributeTypeMap;
    }
}

export class TripsParam {
    /**
    * End of the time range, specified in milliseconds UNIX time.
    */
    'endMs': number;
    /**
    * Group ID to query.
    */
    'groupId': number;
    /**
    * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
    */
    'startMs': number;
    /**
    * Vehicle ID to query.
    */
    'vehicleId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endMs",
            "baseName": "endMs",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "startMs",
            "baseName": "startMs",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TripsParam.attributeTypeMap;
    }
}

export class UserBase {
    /**
    * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
    */
    'authType': UserBase.AuthTypeEnum;
    /**
    * The email address of this user.
    */
    'email': string;
    /**
    * The first and last name of the user.
    */
    'name'?: string;
    /**
    * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    */
    'organizationRoleId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "authType",
            "baseName": "authType",
            "type": "UserBase.AuthTypeEnum"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "organizationRoleId",
            "baseName": "organizationRoleId",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return UserBase.attributeTypeMap;
    }
}

export namespace UserBase {
    export enum AuthTypeEnum {
        Default = <any> 'default',
        Saml = <any> 'saml'
    }
}
export class UserRole {
    'id'?: string;
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return UserRole.attributeTypeMap;
    }
}

export class UserTagRole {
    /**
    * The name of the role the user has been granted on this tag.
    */
    'role'?: string;
    /**
    * The id of the role the user has been granted on this tag.
    */
    'roleId': string;
    'tag': UserTagRoleTag;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "role",
            "baseName": "role",
            "type": "string"
        },
        {
            "name": "roleId",
            "baseName": "roleId",
            "type": "string"
        },
        {
            "name": "tag",
            "baseName": "tag",
            "type": "UserTagRoleTag"
        }    ];

    static getAttributeTypeMap() {
        return UserTagRole.attributeTypeMap;
    }
}

export class UserTagRoleTag {
    /**
    * The ID of this tag.
    */
    'id': number;
    /**
    * Name of this tag.
    */
    'name': string;
    /**
    * The ID of this tag.
    */
    'parentTagId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parentTagId",
            "baseName": "parentTagId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return UserTagRoleTag.attributeTypeMap;
    }
}

/**
* A vehicle object.
*/
export class Vehicle {
    /**
    * Total engine hours for the vehicle.
    */
    'engineHours'?: number;
    /**
    * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
    */
    'fuelLevelPercent'?: number;
    /**
    * ID of the vehicle.
    */
    'id': number;
    /**
    * Name of the vehicle.
    */
    'name'?: string;
    'note'?: string;
    /**
    * The number of meters reported by the odometer.
    */
    'odometerMeters'?: number;
    /**
    * Vehicle Identification Number.
    */
    'vin'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "engineHours",
            "baseName": "engineHours",
            "type": "number"
        },
        {
            "name": "fuelLevelPercent",
            "baseName": "fuelLevelPercent",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "note",
            "baseName": "note",
            "type": "string"
        },
        {
            "name": "odometerMeters",
            "baseName": "odometerMeters",
            "type": "number"
        },
        {
            "name": "vin",
            "baseName": "vin",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Vehicle.attributeTypeMap;
    }
}

/**
* Harsh event details for a vehicle
*/
export class VehicleHarshEventResponse {
    /**
    * URL for downloading the forward facing video
    */
    'downloadForwardVideoUrl'?: string;
    /**
    * URL for downloading the inward facing video
    */
    'downloadInwardVideoUrl'?: string;
    /**
    * URL for downloading the tracked inward facing video
    */
    'downloadTrackedInwardVideoUrl'?: string;
    /**
    * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
    */
    'harshEventType': string;
    /**
    * URL of the associated incident report page
    */
    'incidentReportUrl': string;
    /**
    * Whether the driver was deemed distracted during this harsh event
    */
    'isDistracted'?: boolean;
    'location'?: VehicleHarshEventResponseLocation;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "downloadForwardVideoUrl",
            "baseName": "downloadForwardVideoUrl",
            "type": "string"
        },
        {
            "name": "downloadInwardVideoUrl",
            "baseName": "downloadInwardVideoUrl",
            "type": "string"
        },
        {
            "name": "downloadTrackedInwardVideoUrl",
            "baseName": "downloadTrackedInwardVideoUrl",
            "type": "string"
        },
        {
            "name": "harshEventType",
            "baseName": "harshEventType",
            "type": "string"
        },
        {
            "name": "incidentReportUrl",
            "baseName": "incidentReportUrl",
            "type": "string"
        },
        {
            "name": "isDistracted",
            "baseName": "isDistracted",
            "type": "boolean"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "VehicleHarshEventResponseLocation"
        }    ];

    static getAttributeTypeMap() {
        return VehicleHarshEventResponse.attributeTypeMap;
    }
}

export class VehicleHarshEventResponseLocation {
    /**
    * Address of location where the harsh event occurred
    */
    'address'?: string;
    /**
    * Latitude of location where the harsh event occurred
    */
    'latitude'?: string;
    /**
    * Longitude of location where the harsh event occurred
    */
    'longitude'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "address",
            "baseName": "address",
            "type": "string"
        },
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "string"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return VehicleHarshEventResponseLocation.attributeTypeMap;
    }
}

/**
* Contains the location, in latitude and longitude, of a vehicle.
*/
export class VehicleLocation {
    /**
    * Heading in degrees.
    */
    'heading'?: number;
    /**
    * ID of the vehicle.
    */
    'id': number;
    /**
    * Latitude in decimal degrees.
    */
    'latitude'?: number;
    /**
    * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
    */
    'location'?: string;
    /**
    * Longitude in decimal degrees.
    */
    'longitude'?: number;
    /**
    * Name of the vehicle.
    */
    'name'?: string;
    /**
    * The number of meters reported by the odometer.
    */
    'odometerMeters'?: number;
    /**
    * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
    */
    'onTrip'?: boolean;
    /**
    * Speed in miles per hour.
    */
    'speed'?: number;
    /**
    * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
    */
    'time'?: number;
    /**
    * Vehicle Identification Number (VIN) of the vehicle.
    */
    'vin'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "heading",
            "baseName": "heading",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "latitude",
            "baseName": "latitude",
            "type": "number"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "string"
        },
        {
            "name": "longitude",
            "baseName": "longitude",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "odometerMeters",
            "baseName": "odometerMeters",
            "type": "number"
        },
        {
            "name": "onTrip",
            "baseName": "onTrip",
            "type": "boolean"
        },
        {
            "name": "speed",
            "baseName": "speed",
            "type": "number"
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "number"
        },
        {
            "name": "vin",
            "baseName": "vin",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return VehicleLocation.attributeTypeMap;
    }
}

/**
* Contains any J1939/Passenger engine light warnings and engine faults.
*/
export class VehicleMaintenance {
    /**
    * ID of the vehicle.
    */
    'id': number;
    'j1939'?: VehicleMaintenanceJ1939;
    'passenger'?: VehicleMaintenancePassenger;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "j1939",
            "baseName": "j1939",
            "type": "VehicleMaintenanceJ1939"
        },
        {
            "name": "passenger",
            "baseName": "passenger",
            "type": "VehicleMaintenancePassenger"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenance.attributeTypeMap;
    }
}

/**
* J1939 based data. Null if no data is available.
*/
export class VehicleMaintenanceJ1939 {
    'checkEngineLight'?: VehicleMaintenanceJ1939CheckEngineLight;
    /**
    * J1939 DTCs.
    */
    'diagnosticTroubleCodes'?: Array<VehicleMaintenanceJ1939DiagnosticTroubleCodes>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "checkEngineLight",
            "baseName": "checkEngineLight",
            "type": "VehicleMaintenanceJ1939CheckEngineLight"
        },
        {
            "name": "diagnosticTroubleCodes",
            "baseName": "diagnosticTroubleCodes",
            "type": "Array<VehicleMaintenanceJ1939DiagnosticTroubleCodes>"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenanceJ1939.attributeTypeMap;
    }
}

/**
* J1939 check engine lights.
*/
export class VehicleMaintenanceJ1939CheckEngineLight {
    'emissionsIsOn'?: boolean;
    'protectIsOn'?: boolean;
    'stopIsOn'?: boolean;
    'warningIsOn'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "emissionsIsOn",
            "baseName": "emissionsIsOn",
            "type": "boolean"
        },
        {
            "name": "protectIsOn",
            "baseName": "protectIsOn",
            "type": "boolean"
        },
        {
            "name": "stopIsOn",
            "baseName": "stopIsOn",
            "type": "boolean"
        },
        {
            "name": "warningIsOn",
            "baseName": "warningIsOn",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenanceJ1939CheckEngineLight.attributeTypeMap;
    }
}

export class VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    'fmiId'?: number;
    'fmiText'?: string;
    'occurrenceCount'?: number;
    'spnDescription'?: string;
    'spnId'?: number;
    'txId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fmiId",
            "baseName": "fmiId",
            "type": "number"
        },
        {
            "name": "fmiText",
            "baseName": "fmiText",
            "type": "string"
        },
        {
            "name": "occurrenceCount",
            "baseName": "occurrenceCount",
            "type": "number"
        },
        {
            "name": "spnDescription",
            "baseName": "spnDescription",
            "type": "string"
        },
        {
            "name": "spnId",
            "baseName": "spnId",
            "type": "number"
        },
        {
            "name": "txId",
            "baseName": "txId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenanceJ1939DiagnosticTroubleCodes.attributeTypeMap;
    }
}

/**
* Passenger vehicle data. Null if no data is available.
*/
export class VehicleMaintenancePassenger {
    'checkEngineLight'?: VehicleMaintenancePassengerCheckEngineLight;
    /**
    * Passenger vehicle DTCs.
    */
    'diagnosticTroubleCodes'?: Array<VehicleMaintenancePassengerDiagnosticTroubleCodes>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "checkEngineLight",
            "baseName": "checkEngineLight",
            "type": "VehicleMaintenancePassengerCheckEngineLight"
        },
        {
            "name": "diagnosticTroubleCodes",
            "baseName": "diagnosticTroubleCodes",
            "type": "Array<VehicleMaintenancePassengerDiagnosticTroubleCodes>"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenancePassenger.attributeTypeMap;
    }
}

/**
* Passenger vehicle check engine light.
*/
export class VehicleMaintenancePassengerCheckEngineLight {
    'isOn'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "isOn",
            "baseName": "isOn",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenancePassengerCheckEngineLight.attributeTypeMap;
    }
}

export class VehicleMaintenancePassengerDiagnosticTroubleCodes {
    'dtcDescription'?: string;
    'dtcId'?: number;
    'dtcShortCode'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dtcDescription",
            "baseName": "dtcDescription",
            "type": "string"
        },
        {
            "name": "dtcId",
            "baseName": "dtcId",
            "type": "number"
        },
        {
            "name": "dtcShortCode",
            "baseName": "dtcShortCode",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return VehicleMaintenancePassengerDiagnosticTroubleCodes.attributeTypeMap;
    }
}

/**
* Safety score details for a vehicle
*/
export class VehicleSafetyScoreResponse {
    /**
    * Crash event count
    */
    'crashCount'?: number;
    /**
    * Harsh acceleration event count
    */
    'harshAccelCount'?: number;
    /**
    * Harsh braking event count
    */
    'harshBrakingCount'?: number;
    'harshEvents'?: Array<SafetyReportHarshEvent>;
    /**
    * Harsh turning event count
    */
    'harshTurningCount'?: number;
    /**
    * Safety Score
    */
    'safetyScore'?: number;
    /**
    * Safety Score Rank
    */
    'safetyScoreRank'?: string;
    /**
    * Amount of time driven over the speed limit in milliseconds
    */
    'timeOverSpeedLimitMs'?: number;
    /**
    * Total distance driven in meters
    */
    'totalDistanceDrivenMeters'?: number;
    /**
    * Total harsh event count
    */
    'totalHarshEventCount'?: number;
    /**
    * Amount of time driven in milliseconds
    */
    'totalTimeDrivenMs'?: number;
    /**
    * Vehicle ID
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "crashCount",
            "baseName": "crashCount",
            "type": "number"
        },
        {
            "name": "harshAccelCount",
            "baseName": "harshAccelCount",
            "type": "number"
        },
        {
            "name": "harshBrakingCount",
            "baseName": "harshBrakingCount",
            "type": "number"
        },
        {
            "name": "harshEvents",
            "baseName": "harshEvents",
            "type": "Array<SafetyReportHarshEvent>"
        },
        {
            "name": "harshTurningCount",
            "baseName": "harshTurningCount",
            "type": "number"
        },
        {
            "name": "safetyScore",
            "baseName": "safetyScore",
            "type": "number"
        },
        {
            "name": "safetyScoreRank",
            "baseName": "safetyScoreRank",
            "type": "string"
        },
        {
            "name": "timeOverSpeedLimitMs",
            "baseName": "timeOverSpeedLimitMs",
            "type": "number"
        },
        {
            "name": "totalDistanceDrivenMeters",
            "baseName": "totalDistanceDrivenMeters",
            "type": "number"
        },
        {
            "name": "totalHarshEventCount",
            "baseName": "totalHarshEventCount",
            "type": "number"
        },
        {
            "name": "totalTimeDrivenMs",
            "baseName": "totalTimeDrivenMs",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return VehicleSafetyScoreResponse.attributeTypeMap;
    }
}

export class VehicleUpdateParam {
    /**
    * Group ID to query.
    */
    'groupId': number;
    'vehicles': Array<Vehicle>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "vehicles",
            "baseName": "vehicles",
            "type": "Array<Vehicle>"
        }    ];

    static getAttributeTypeMap() {
        return VehicleUpdateParam.attributeTypeMap;
    }
}

export class DispatchJob {
    /**
    * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    */
    'destinationAddress'?: string;
    /**
    * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    */
    'destinationAddressId'?: number;
    /**
    * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    */
    'destinationLat'?: number;
    /**
    * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    */
    'destinationLng'?: number;
    /**
    * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    */
    'destinationName'?: string;
    /**
    * Notes regarding the details of this job.
    */
    'notes'?: string;
    /**
    * The time at which the assigned driver is scheduled to arrive at the job destination.
    */
    'scheduledArrivalTimeMs': number;
    /**
    * The time at which the assigned driver is scheduled to depart from the job destination.
    */
    'scheduledDepartureTimeMs'?: number;
    /**
    * The time at which the driver arrived at the job destination.
    */
    'arrivedAtMs'?: number;
    /**
    * The time at which the job was marked complete (e.g. started driving to the next destination).
    */
    'completedAtMs'?: number;
    /**
    * ID of the route that this job belongs to.
    */
    'dispatchRouteId': number;
    /**
    * ID of the driver assigned to the dispatch job.
    */
    'driverId'?: number;
    /**
    * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
    */
    'enRouteAtMs'?: number;
    /**
    * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
    */
    'estimatedArrivalMs'?: number;
    /**
    * Fleet viewer url of the dispatch job.
    */
    'fleetViewerUrl'?: string;
    'groupId': number;
    /**
    * ID of the Samsara dispatch job.
    */
    'id': number;
    'jobState': JobStatus;
    /**
    * The time at which the job was marked skipped.
    */
    'skippedAtMs'?: number;
    /**
    * ID of the vehicle used for the dispatch job.
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "destinationAddress",
            "baseName": "destination_address",
            "type": "string"
        },
        {
            "name": "destinationAddressId",
            "baseName": "destination_address_id",
            "type": "number"
        },
        {
            "name": "destinationLat",
            "baseName": "destination_lat",
            "type": "number"
        },
        {
            "name": "destinationLng",
            "baseName": "destination_lng",
            "type": "number"
        },
        {
            "name": "destinationName",
            "baseName": "destination_name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "scheduledArrivalTimeMs",
            "baseName": "scheduled_arrival_time_ms",
            "type": "number"
        },
        {
            "name": "scheduledDepartureTimeMs",
            "baseName": "scheduled_departure_time_ms",
            "type": "number"
        },
        {
            "name": "arrivedAtMs",
            "baseName": "arrived_at_ms",
            "type": "number"
        },
        {
            "name": "completedAtMs",
            "baseName": "completed_at_ms",
            "type": "number"
        },
        {
            "name": "dispatchRouteId",
            "baseName": "dispatch_route_id",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driver_id",
            "type": "number"
        },
        {
            "name": "enRouteAtMs",
            "baseName": "en_route_at_ms",
            "type": "number"
        },
        {
            "name": "estimatedArrivalMs",
            "baseName": "estimated_arrival_ms",
            "type": "number"
        },
        {
            "name": "fleetViewerUrl",
            "baseName": "fleet_viewer_url",
            "type": "string"
        },
        {
            "name": "groupId",
            "baseName": "group_id",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "jobState",
            "baseName": "job_state",
            "type": "JobStatus"
        },
        {
            "name": "skippedAtMs",
            "baseName": "skipped_at_ms",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicle_id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DispatchJob.attributeTypeMap;
    }
}

export class DispatchRoute {
    /**
    * The time in Unix epoch milliseconds that the route actually ended.
    */
    'actualEndMs'?: number;
    /**
    * The time in Unix epoch milliseconds that the route actually started.
    */
    'actualStartMs'?: number;
    /**
    * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    */
    'driverId'?: number;
    /**
    * ID of the group if the organization has multiple groups (optional).
    */
    'groupId'?: number;
    /**
    * Descriptive name of this route.
    */
    'name': string;
    /**
    * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    */
    'scheduledEndMs': number;
    /**
    * The distance expected to be traveled for this route in meters.
    */
    'scheduledMeters'?: number;
    /**
    * The time in Unix epoch milliseconds that the route is scheduled to start.
    */
    'scheduledStartMs': number;
    /**
    * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    */
    'startLocationAddress'?: string;
    /**
    * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    */
    'startLocationAddressId'?: number;
    /**
    * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    */
    'startLocationLat'?: number;
    /**
    * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    */
    'startLocationLng'?: number;
    /**
    * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    */
    'startLocationName'?: string;
    /**
    * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    */
    'trailerId'?: number;
    /**
    * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    */
    'vehicleId'?: number;
    /**
    * The dispatch jobs associated with this route.
    */
    'dispatchJobs': Array<DispatchJob>;
    /**
    * ID of the Samsara dispatch route.
    */
    'id': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "actualEndMs",
            "baseName": "actual_end_ms",
            "type": "number"
        },
        {
            "name": "actualStartMs",
            "baseName": "actual_start_ms",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driver_id",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "group_id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "scheduledEndMs",
            "baseName": "scheduled_end_ms",
            "type": "number"
        },
        {
            "name": "scheduledMeters",
            "baseName": "scheduled_meters",
            "type": "number"
        },
        {
            "name": "scheduledStartMs",
            "baseName": "scheduled_start_ms",
            "type": "number"
        },
        {
            "name": "startLocationAddress",
            "baseName": "start_location_address",
            "type": "string"
        },
        {
            "name": "startLocationAddressId",
            "baseName": "start_location_address_id",
            "type": "number"
        },
        {
            "name": "startLocationLat",
            "baseName": "start_location_lat",
            "type": "number"
        },
        {
            "name": "startLocationLng",
            "baseName": "start_location_lng",
            "type": "number"
        },
        {
            "name": "startLocationName",
            "baseName": "start_location_name",
            "type": "string"
        },
        {
            "name": "trailerId",
            "baseName": "trailer_id",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicle_id",
            "type": "number"
        },
        {
            "name": "dispatchJobs",
            "baseName": "dispatch_jobs",
            "type": "Array<DispatchJob>"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DispatchRoute.attributeTypeMap;
    }
}

export class DispatchRouteCreate {
    /**
    * The time in Unix epoch milliseconds that the route actually ended.
    */
    'actualEndMs'?: number;
    /**
    * The time in Unix epoch milliseconds that the route actually started.
    */
    'actualStartMs'?: number;
    /**
    * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    */
    'driverId'?: number;
    /**
    * ID of the group if the organization has multiple groups (optional).
    */
    'groupId'?: number;
    /**
    * Descriptive name of this route.
    */
    'name': string;
    /**
    * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    */
    'scheduledEndMs': number;
    /**
    * The distance expected to be traveled for this route in meters.
    */
    'scheduledMeters'?: number;
    /**
    * The time in Unix epoch milliseconds that the route is scheduled to start.
    */
    'scheduledStartMs': number;
    /**
    * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    */
    'startLocationAddress'?: string;
    /**
    * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    */
    'startLocationAddressId'?: number;
    /**
    * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    */
    'startLocationLat'?: number;
    /**
    * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    */
    'startLocationLng'?: number;
    /**
    * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    */
    'startLocationName'?: string;
    /**
    * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    */
    'trailerId'?: number;
    /**
    * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    */
    'vehicleId'?: number;
    /**
    * The dispatch jobs to create for this route.
    */
    'dispatchJobs': Array<DispatchJobCreate>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "actualEndMs",
            "baseName": "actual_end_ms",
            "type": "number"
        },
        {
            "name": "actualStartMs",
            "baseName": "actual_start_ms",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driver_id",
            "type": "number"
        },
        {
            "name": "groupId",
            "baseName": "group_id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "scheduledEndMs",
            "baseName": "scheduled_end_ms",
            "type": "number"
        },
        {
            "name": "scheduledMeters",
            "baseName": "scheduled_meters",
            "type": "number"
        },
        {
            "name": "scheduledStartMs",
            "baseName": "scheduled_start_ms",
            "type": "number"
        },
        {
            "name": "startLocationAddress",
            "baseName": "start_location_address",
            "type": "string"
        },
        {
            "name": "startLocationAddressId",
            "baseName": "start_location_address_id",
            "type": "number"
        },
        {
            "name": "startLocationLat",
            "baseName": "start_location_lat",
            "type": "number"
        },
        {
            "name": "startLocationLng",
            "baseName": "start_location_lng",
            "type": "number"
        },
        {
            "name": "startLocationName",
            "baseName": "start_location_name",
            "type": "string"
        },
        {
            "name": "trailerId",
            "baseName": "trailer_id",
            "type": "number"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicle_id",
            "type": "number"
        },
        {
            "name": "dispatchJobs",
            "baseName": "dispatch_jobs",
            "type": "Array<DispatchJobCreate>"
        }    ];

    static getAttributeTypeMap() {
        return DispatchRouteCreate.attributeTypeMap;
    }
}

export class Document {
    /**
    * ID of the Samsara dispatch job for which the document is submitted
    */
    'dispatchJobId'?: number;
    /**
    * Notes submitted with this document.
    */
    'notes'?: string;
    /**
    * Descriptive name of this type of document.
    */
    'documentType': string;
    /**
    * The time in Unix epoch milliseconds that the document is created.
    */
    'driverCreatedAtMs': number;
    /**
    * ID of the driver for whom the document is submitted
    */
    'driverId': number;
    /**
    * The fields associated with this document.
    */
    'fields': Array<DocumentField>;
    /**
    * VehicleID of the driver at document creation.
    */
    'vehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dispatchJobId",
            "baseName": "dispatchJobId",
            "type": "number"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "documentType",
            "baseName": "documentType",
            "type": "string"
        },
        {
            "name": "driverCreatedAtMs",
            "baseName": "driverCreatedAtMs",
            "type": "number"
        },
        {
            "name": "driverId",
            "baseName": "driverId",
            "type": "number"
        },
        {
            "name": "fields",
            "baseName": "fields",
            "type": "Array<DocumentField>"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return Document.attributeTypeMap;
    }
}

export class DocumentCreate {
    /**
    * ID of the Samsara dispatch job for which the document is submitted
    */
    'dispatchJobId'?: number;
    /**
    * Notes submitted with this document.
    */
    'notes'?: string;
    /**
    * Universally unique identifier for the document type this document is being created for.
    */
    'documentTypeUuid': string;
    /**
    * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    */
    'fields': Array<DocumentField>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dispatchJobId",
            "baseName": "dispatchJobId",
            "type": "number"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "documentTypeUuid",
            "baseName": "documentTypeUuid",
            "type": "string"
        },
        {
            "name": "fields",
            "baseName": "fields",
            "type": "Array<DocumentField>"
        }    ];

    static getAttributeTypeMap() {
        return DocumentCreate.attributeTypeMap;
    }
}

export class DocumentField {
    /**
    * Value of this field if this document field has valueType: ValueType_Number.
    */
    'numberValue'?: number;
    /**
    * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
    */
    'photoValue'?: Array<DocumentFieldCreatePhotoValue>;
    /**
    * Value of this field if this document field has valueType: ValueType_String.
    */
    'stringValue'?: string;
    /**
    * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    */
    'valueType': string;
    /**
    * Descriptive name of this field.
    */
    'label': string;
    /**
    * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
    */
    'value'?: ERRORUNKNOWN;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "numberValue",
            "baseName": "numberValue",
            "type": "number"
        },
        {
            "name": "photoValue",
            "baseName": "photoValue",
            "type": "Array<DocumentFieldCreatePhotoValue>"
        },
        {
            "name": "stringValue",
            "baseName": "stringValue",
            "type": "string"
        },
        {
            "name": "valueType",
            "baseName": "valueType",
            "type": "string"
        },
        {
            "name": "label",
            "baseName": "label",
            "type": "string"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "ERRORUNKNOWN"
        }    ];

    static getAttributeTypeMap() {
        return DocumentField.attributeTypeMap;
    }
}

export class Driver {
    /**
    * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    */
    'eldAdverseWeatherExemptionEnabled'?: boolean;
    /**
    * Flag indicating this driver may use Big Day excemptions in ELD logs.
    */
    'eldBigDayExemptionEnabled'?: boolean;
    /**
    * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    */
    'eldDayStartHour'?: number;
    /**
    * Flag indicating this driver is exempt from the Electronic Logging Mandate.
    */
    'eldExempt'?: boolean;
    /**
    * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    */
    'eldExemptReason'?: string;
    /**
    * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    */
    'eldPcEnabled'?: boolean;
    /**
    * Flag indicating this driver may select the Yard Move duty status in ELD logs.
    */
    'eldYmEnabled'?: boolean;
    /**
    * Dictionary of external IDs (string key-value pairs)
    */
    'externalIds'?: { [key: string]: string; };
    /**
    * ID of the group if the organization has multiple groups (uncommon).
    */
    'groupId'?: number;
    /**
    * Driver's state issued license number.
    */
    'licenseNumber'?: string;
    /**
    * Abbreviation of state that issued driver's license.
    */
    'licenseState'?: string;
    /**
    * Driver's name.
    */
    'name': string;
    /**
    * Notes about the driver.
    */
    'notes'?: string;
    /**
    * Driver's phone number. Please include only digits, ex. 4157771234
    */
    'phone'?: string;
    /**
    * Driver's login username into the driver app.
    */
    'username'?: string;
    /**
    * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    */
    'vehicleId'?: number;
    /**
    * ID of the vehicle that this driver is currently assigned to. Omitted if there is no current vehicle assignment for this driver.
    */
    'currentVehicleId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "eldAdverseWeatherExemptionEnabled",
            "baseName": "eldAdverseWeatherExemptionEnabled",
            "type": "boolean"
        },
        {
            "name": "eldBigDayExemptionEnabled",
            "baseName": "eldBigDayExemptionEnabled",
            "type": "boolean"
        },
        {
            "name": "eldDayStartHour",
            "baseName": "eldDayStartHour",
            "type": "number"
        },
        {
            "name": "eldExempt",
            "baseName": "eldExempt",
            "type": "boolean"
        },
        {
            "name": "eldExemptReason",
            "baseName": "eldExemptReason",
            "type": "string"
        },
        {
            "name": "eldPcEnabled",
            "baseName": "eldPcEnabled",
            "type": "boolean"
        },
        {
            "name": "eldYmEnabled",
            "baseName": "eldYmEnabled",
            "type": "boolean"
        },
        {
            "name": "externalIds",
            "baseName": "externalIds",
            "type": "{ [key: string]: string; }"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "licenseNumber",
            "baseName": "licenseNumber",
            "type": "string"
        },
        {
            "name": "licenseState",
            "baseName": "licenseState",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "phone",
            "baseName": "phone",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        },
        {
            "name": "currentVehicleId",
            "baseName": "currentVehicleId",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return Driver.attributeTypeMap;
    }
}

export class DriverForCreate {
    /**
    * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    */
    'eldAdverseWeatherExemptionEnabled'?: boolean;
    /**
    * Flag indicating this driver may use Big Day excemptions in ELD logs.
    */
    'eldBigDayExemptionEnabled'?: boolean;
    /**
    * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    */
    'eldDayStartHour'?: number;
    /**
    * Flag indicating this driver is exempt from the Electronic Logging Mandate.
    */
    'eldExempt'?: boolean;
    /**
    * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    */
    'eldExemptReason'?: string;
    /**
    * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    */
    'eldPcEnabled'?: boolean;
    /**
    * Flag indicating this driver may select the Yard Move duty status in ELD logs.
    */
    'eldYmEnabled'?: boolean;
    /**
    * Dictionary of external IDs (string key-value pairs)
    */
    'externalIds'?: { [key: string]: string; };
    /**
    * ID of the group if the organization has multiple groups (uncommon).
    */
    'groupId'?: number;
    /**
    * Driver's state issued license number.
    */
    'licenseNumber'?: string;
    /**
    * Abbreviation of state that issued driver's license.
    */
    'licenseState'?: string;
    /**
    * Driver's name.
    */
    'name': string;
    /**
    * Notes about the driver.
    */
    'notes'?: string;
    /**
    * Driver's phone number. Please include only digits, ex. 4157771234
    */
    'phone'?: string;
    /**
    * Driver's login username into the driver app.
    */
    'username'?: string;
    /**
    * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    */
    'vehicleId'?: number;
    /**
    * Driver's password for the driver app.
    */
    'password': string;
    'tagIds'?: TagIds;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "eldAdverseWeatherExemptionEnabled",
            "baseName": "eldAdverseWeatherExemptionEnabled",
            "type": "boolean"
        },
        {
            "name": "eldBigDayExemptionEnabled",
            "baseName": "eldBigDayExemptionEnabled",
            "type": "boolean"
        },
        {
            "name": "eldDayStartHour",
            "baseName": "eldDayStartHour",
            "type": "number"
        },
        {
            "name": "eldExempt",
            "baseName": "eldExempt",
            "type": "boolean"
        },
        {
            "name": "eldExemptReason",
            "baseName": "eldExemptReason",
            "type": "string"
        },
        {
            "name": "eldPcEnabled",
            "baseName": "eldPcEnabled",
            "type": "boolean"
        },
        {
            "name": "eldYmEnabled",
            "baseName": "eldYmEnabled",
            "type": "boolean"
        },
        {
            "name": "externalIds",
            "baseName": "externalIds",
            "type": "{ [key: string]: string; }"
        },
        {
            "name": "groupId",
            "baseName": "groupId",
            "type": "number"
        },
        {
            "name": "licenseNumber",
            "baseName": "licenseNumber",
            "type": "string"
        },
        {
            "name": "licenseState",
            "baseName": "licenseState",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notes",
            "baseName": "notes",
            "type": "string"
        },
        {
            "name": "phone",
            "baseName": "phone",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        },
        {
            "name": "vehicleId",
            "baseName": "vehicleId",
            "type": "number"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "tagIds",
            "baseName": "tagIds",
            "type": "TagIds"
        }    ];

    static getAttributeTypeMap() {
        return DriverForCreate.attributeTypeMap;
    }
}

export class TaggedAddress {
    /**
    * The ID of the address being tagged.
    */
    'id': number;
    /**
    * Name of the address being tagged.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TaggedAddress.attributeTypeMap;
    }
}

export class TaggedAsset {
    /**
    * The ID of the Asset being tagged.
    */
    'id': number;
    /**
    * Name of the Asset being tagged.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TaggedAsset.attributeTypeMap;
    }
}

export class TaggedDriver {
    /**
    * The ID of the Driver being tagged.
    */
    'id': number;
    /**
    * Name of the Driver being tagged.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TaggedDriver.attributeTypeMap;
    }
}

export class TaggedMachine {
    /**
    * The ID of the Machine being tagged.
    */
    'id': number;
    /**
    * Name of the Machine being tagged.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TaggedMachine.attributeTypeMap;
    }
}

export class TaggedSensor {
    /**
    * The ID of the Sensor being tagged.
    */
    'id': number;
    /**
    * Name of the Sensor being tagged.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TaggedSensor.attributeTypeMap;
    }
}

export class TaggedVehicle {
    /**
    * The ID of the Vehicle being tagged.
    */
    'id': number;
    /**
    * Name of the Vehicle being tagged.
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TaggedVehicle.attributeTypeMap;
    }
}

export class User {
    /**
    * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
    */
    'authType': User.AuthTypeEnum;
    /**
    * The email address of this user.
    */
    'email': string;
    /**
    * The first and last name of the user.
    */
    'name'?: string;
    /**
    * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    */
    'organizationRoleId'?: string;
    /**
    * The ID of the User record.
    */
    'id'?: number;
    /**
    * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    */
    'organizationRole'?: string;
    /**
    * The specific tags this user has access to. This will be blank for users that have full access to the organization.
    */
    'tagRoles'?: Array<UserTagRole>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "authType",
            "baseName": "authType",
            "type": "User.AuthTypeEnum"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "organizationRoleId",
            "baseName": "organizationRoleId",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "organizationRole",
            "baseName": "organizationRole",
            "type": "string"
        },
        {
            "name": "tagRoles",
            "baseName": "tagRoles",
            "type": "Array<UserTagRole>"
        }    ];

    static getAttributeTypeMap() {
        return User.attributeTypeMap;
    }
}

export namespace User {
    export enum AuthTypeEnum {
        Default = <any> 'default',
        Saml = <any> 'saml'
    }
}

let enumsMap: {[index: string]: any} = {
        "AuxInputSeries.NameEnum": AuxInputSeries.NameEnum,
        "CreateDvirParam.InspectionTypeEnum": CreateDvirParam.InspectionTypeEnum,
        "CreateDvirParam.SafeEnum": CreateDvirParam.SafeEnum,
        "EngineState.ValueEnum": EngineState.ValueEnum,
        "HistoryParam1.FillMissingEnum": HistoryParam1.FillMissingEnum,
        "SensorshistorySeries.FieldEnum": SensorshistorySeries.FieldEnum,
        "UserBase.AuthTypeEnum": UserBase.AuthTypeEnum,
        "User.AuthTypeEnum": User.AuthTypeEnum,
}

let typeMap: {[index: string]: any} = {
    "Address": Address,
    "AddressGeofence": AddressGeofence,
    "AddressGeofenceCircle": AddressGeofenceCircle,
    "AddressGeofencePolygon": AddressGeofencePolygon,
    "AddressGeofencePolygonVertices": AddressGeofencePolygonVertices,
    "AddressNotes": AddressNotes,
    "AddressParam": AddressParam,
    "Addresses": Addresses,
    "AddressesAddresses": AddressesAddresses,
    "AllRouteJobUpdates": AllRouteJobUpdates,
    "Asset": Asset,
    "AssetCable": AssetCable,
    "AssetCurrentLocation": AssetCurrentLocation,
    "AssetCurrentLocationsResponse": AssetCurrentLocationsResponse,
    "AssetLocationResponse": AssetLocationResponse,
    "AssetLocationResponseInner": AssetLocationResponseInner,
    "AssetReeferResponse": AssetReeferResponse,
    "AssetReeferResponseReeferStats": AssetReeferResponseReeferStats,
    "AssetReeferResponseReeferStatsAlarms": AssetReeferResponseReeferStatsAlarms,
    "AssetReeferResponseReeferStatsAlarms1": AssetReeferResponseReeferStatsAlarms1,
    "AssetReeferResponseReeferStatsEngineHours": AssetReeferResponseReeferStatsEngineHours,
    "AssetReeferResponseReeferStatsFuelPercentage": AssetReeferResponseReeferStatsFuelPercentage,
    "AssetReeferResponseReeferStatsPowerStatus": AssetReeferResponseReeferStatsPowerStatus,
    "AssetReeferResponseReeferStatsReturnAirTemp": AssetReeferResponseReeferStatsReturnAirTemp,
    "AssetReeferResponseReeferStatsSetPoint": AssetReeferResponseReeferStatsSetPoint,
    "AuxInput": AuxInput,
    "AuxInputSeries": AuxInputSeries,
    "CargoResponse": CargoResponse,
    "CargoResponseSensors": CargoResponseSensors,
    "Contact": Contact,
    "ContactIds": ContactIds,
    "CreateDvirParam": CreateDvirParam,
    "CurrentDriver": CurrentDriver,
    "Data": Data,
    "DataInputHistoryResponse": DataInputHistoryResponse,
    "DataInputHistoryResponsePoints": DataInputHistoryResponsePoints,
    "DispatchJobCreate": DispatchJobCreate,
    "DispatchRouteBase": DispatchRouteBase,
    "DispatchRouteHistoricalEntry": DispatchRouteHistoricalEntry,
    "DispatchRouteHistory": DispatchRouteHistory,
    "DispatchRoutes": DispatchRoutes,
    "DocumentBase": DocumentBase,
    "DocumentFieldCreate": DocumentFieldCreate,
    "DocumentFieldCreatePhotoValue": DocumentFieldCreatePhotoValue,
    "DocumentFieldType": DocumentFieldType,
    "DocumentFieldTypeNumberValueTypeMetadata": DocumentFieldTypeNumberValueTypeMetadata,
    "DocumentFieldTypes": DocumentFieldTypes,
    "DocumentType": DocumentType,
    "DocumentTypes": DocumentTypes,
    "Documents": Documents,
    "DoorResponse": DoorResponse,
    "DoorResponseSensors": DoorResponseSensors,
    "DriverBase": DriverBase,
    "DriverDailyLogResponse": DriverDailyLogResponse,
    "DriverDailyLogResponseDays": DriverDailyLogResponseDays,
    "DriverSafetyScoreResponse": DriverSafetyScoreResponse,
    "DriversResponse": DriversResponse,
    "DriversSummaryParam": DriversSummaryParam,
    "DriversSummaryResponse": DriversSummaryResponse,
    "DriversSummaryResponseSummaries": DriversSummaryResponseSummaries,
    "DvirBase": DvirBase,
    "DvirBaseAuthorSignature": DvirBaseAuthorSignature,
    "DvirBaseMechanicOrAgentSignature": DvirBaseMechanicOrAgentSignature,
    "DvirBaseNextDriverSignature": DvirBaseNextDriverSignature,
    "DvirBaseTrailerDefects": DvirBaseTrailerDefects,
    "DvirBaseVehicle": DvirBaseVehicle,
    "DvirListResponse": DvirListResponse,
    "EngineState": EngineState,
    "ErrorResponse": ErrorResponse,
    "FleetVehicleLocation": FleetVehicleLocation,
    "FleetVehicleLocations": FleetVehicleLocations,
    "FleetVehicleResponse": FleetVehicleResponse,
    "FleetVehicleResponseVehicleInfo": FleetVehicleResponseVehicleInfo,
    "FleetVehiclesLocations": FleetVehiclesLocations,
    "FleetVehiclesLocationsInner": FleetVehiclesLocationsInner,
    "GroupDriversParam": GroupDriversParam,
    "GroupParam": GroupParam,
    "HistoryParam": HistoryParam,
    "HistoryParam1": HistoryParam1,
    "HosAuthenticationLogsParam": HosAuthenticationLogsParam,
    "HosAuthenticationLogsResponse": HosAuthenticationLogsResponse,
    "HosAuthenticationLogsResponseAuthenticationLogs": HosAuthenticationLogsResponseAuthenticationLogs,
    "HosLogsParam": HosLogsParam,
    "HosLogsParam1": HosLogsParam1,
    "HosLogsParam2": HosLogsParam2,
    "HosLogsResponse": HosLogsResponse,
    "HosLogsResponseLogs": HosLogsResponseLogs,
    "HosLogsSummaryResponse": HosLogsSummaryResponse,
    "HosLogsSummaryResponseDrivers": HosLogsSummaryResponseDrivers,
    "HumidityResponse": HumidityResponse,
    "HumidityResponseSensors": HumidityResponseSensors,
    "InlineResponse200": InlineResponse200,
    "InlineResponse2001": InlineResponse2001,
    "InlineResponse2002": InlineResponse2002,
    "InlineResponse2003": InlineResponse2003,
    "InlineResponse2004": InlineResponse2004,
    "InlineResponse2005": InlineResponse2005,
    "InlineResponse2005VehicleStats": InlineResponse2005VehicleStats,
    "InlineResponse2006": InlineResponse2006,
    "InlineResponse2007": InlineResponse2007,
    "InlineResponse2008": InlineResponse2008,
    "InlineResponse2009": InlineResponse2009,
    "JobStatus": JobStatus,
    "JobUpdateObject": JobUpdateObject,
    "Machine": Machine,
    "MachineHistoryResponse": MachineHistoryResponse,
    "MachineHistoryResponseMachines": MachineHistoryResponseMachines,
    "MachineHistoryResponseVibrations": MachineHistoryResponseVibrations,
    "Pagination": Pagination,
    "PrevJobStatus": PrevJobStatus,
    "ReactivateDriverParam": ReactivateDriverParam,
    "SafetyReportHarshEvent": SafetyReportHarshEvent,
    "Sensor": Sensor,
    "SensorHistoryResponse": SensorHistoryResponse,
    "SensorHistoryResponseResults": SensorHistoryResponseResults,
    "SensorParam": SensorParam,
    "SensorshistorySeries": SensorshistorySeries,
    "Tag": Tag,
    "TagCreate": TagCreate,
    "TagIds": TagIds,
    "TagMetadata": TagMetadata,
    "TagModify": TagModify,
    "TagModifyAdd": TagModifyAdd,
    "TagModifyDelete": TagModifyDelete,
    "TagUpdate": TagUpdate,
    "TaggedAddressBase": TaggedAddressBase,
    "TaggedAssetBase": TaggedAssetBase,
    "TaggedDriverBase": TaggedDriverBase,
    "TaggedMachineBase": TaggedMachineBase,
    "TaggedSensorBase": TaggedSensorBase,
    "TaggedVehicleBase": TaggedVehicleBase,
    "TemperatureResponse": TemperatureResponse,
    "TemperatureResponseSensors": TemperatureResponseSensors,
    "TripResponse": TripResponse,
    "TripResponseEndCoordinates": TripResponseEndCoordinates,
    "TripResponseStartCoordinates": TripResponseStartCoordinates,
    "TripResponseTrips": TripResponseTrips,
    "TripsParam": TripsParam,
    "UserBase": UserBase,
    "UserRole": UserRole,
    "UserTagRole": UserTagRole,
    "UserTagRoleTag": UserTagRoleTag,
    "Vehicle": Vehicle,
    "VehicleHarshEventResponse": VehicleHarshEventResponse,
    "VehicleHarshEventResponseLocation": VehicleHarshEventResponseLocation,
    "VehicleLocation": VehicleLocation,
    "VehicleMaintenance": VehicleMaintenance,
    "VehicleMaintenanceJ1939": VehicleMaintenanceJ1939,
    "VehicleMaintenanceJ1939CheckEngineLight": VehicleMaintenanceJ1939CheckEngineLight,
    "VehicleMaintenanceJ1939DiagnosticTroubleCodes": VehicleMaintenanceJ1939DiagnosticTroubleCodes,
    "VehicleMaintenancePassenger": VehicleMaintenancePassenger,
    "VehicleMaintenancePassengerCheckEngineLight": VehicleMaintenancePassengerCheckEngineLight,
    "VehicleMaintenancePassengerDiagnosticTroubleCodes": VehicleMaintenancePassengerDiagnosticTroubleCodes,
    "VehicleSafetyScoreResponse": VehicleSafetyScoreResponse,
    "VehicleUpdateParam": VehicleUpdateParam,
    "DispatchJob": DispatchJob,
    "DispatchRoute": DispatchRoute,
    "DispatchRouteCreate": DispatchRouteCreate,
    "Document": Document,
    "DocumentCreate": DocumentCreate,
    "DocumentField": DocumentField,
    "Driver": Driver,
    "DriverForCreate": DriverForCreate,
    "TaggedAddress": TaggedAddress,
    "TaggedAsset": TaggedAsset,
    "TaggedDriver": TaggedDriver,
    "TaggedMachine": TaggedMachine,
    "TaggedSensor": TaggedSensor,
    "TaggedVehicle": TaggedVehicle,
    "User": User,
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export enum AssetsApiApiKeys {
}

export class AssetsApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: AssetsApiApiKeys, value: string) {
        (this.authentications as any)[AssetsApiApiKeys[key]].apiKey = value;
    }
    /**
     * Fetch current locations of all assets for the group.
     * @summary /fleet/assets/locations
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllAssetCurrentLocations (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2001;  }> {
        const localVarPath = this.basePath + '/fleet/assets/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2001;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2001");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the assets for the group.
     * @summary /fleet/assets
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllAssets (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse200;  }> {
        const localVarPath = this.basePath + '/fleet/assets';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssets.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse200;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse200");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the historical locations for the asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/locations
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getAssetLocation (accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: AssetLocationResponse;  }> {
        const localVarPath = this.basePath + '/fleet/assets/{asset_id}/locations'
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetLocation.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AssetLocationResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AssetLocationResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the reefer-specific stats of an asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/reefer
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getAssetReefer (accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: AssetReeferResponse;  }> {
        const localVarPath = this.basePath + '/fleet/assets/{asset_id}/reefer'
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetReefer.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AssetReeferResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AssetReeferResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum DriversApiApiKeys {
}

export class DriversApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: DriversApiApiKeys, value: string) {
        (this.authentications as any)[DriversApiApiKeys[key]].apiKey = value;
    }
    /**
     * Create a new driver.
     * @summary /fleet/drivers/create
     * @param accessToken Samsara API access token.
     * @param createDriverParam Driver creation body
     * @param {*} [options] Override http request options.
     */
    public createDriver (accessToken: string, createDriverParam: DriverForCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/create';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriver.');
        }

        // verify required parameter 'createDriverParam' is not null or undefined
        if (createDriverParam === null || createDriverParam === undefined) {
            throw new Error('Required parameter createDriverParam was null or undefined when calling createDriver.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDriverParam, "DriverForCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Deactivate a driver with the given id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public deactivateDriver (accessToken: string, driverIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deactivateDriver.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all deactivated drivers for the group.
     * @summary /fleet/drivers/inactive
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllDeactivatedDrivers (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<Driver>;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Driver>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Driver>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch deactivated driver by id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public getDeactivatedDriverById (accessToken: string, driverIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch driver by id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public getDriverById (accessToken: string, driverIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: CurrentDriver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: CurrentDriver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "CurrentDriver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Reactivate the inactive driver having id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param reactivateDriverParam Driver reactivation body
     * @param {*} [options] Override http request options.
     */
    public reactivateDriverById (accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: ReactivateDriverParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: CurrentDriver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling reactivateDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        // verify required parameter 'reactivateDriverParam' is not null or undefined
        if (reactivateDriverParam === null || reactivateDriverParam === undefined) {
            throw new Error('Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(reactivateDriverParam, "ReactivateDriverParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: CurrentDriver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "CurrentDriver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum FleetApiApiKeys {
}

export class FleetApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: FleetApiApiKeys, value: string) {
        (this.authentications as any)[FleetApiApiKeys[key]].apiKey = value;
    }
    /**
     * This method adds an address book entry to the specified group.
     * @summary /fleet/add_address
     * @param accessToken Samsara API access token.
     * @param addressParam 
     * @param {*} [options] Override http request options.
     */
    public addFleetAddress (accessToken: string, addressParam: AddressParam, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/add_address';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling addFleetAddress.');
        }

        // verify required parameter 'addressParam' is not null or undefined
        if (addressParam === null || addressParam === undefined) {
            throw new Error('Required parameter addressParam was null or undefined when calling addFleetAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(addressParam, "AddressParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Add one or more addresses to the organization
     * @summary /addresses
     * @param accessToken Samsara API access token.
     * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.
     * @param {*} [options] Override http request options.
     */
    public addOrganizationAddresses (accessToken: string, addresses: Addresses, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<Address>;  }> {
        const localVarPath = this.basePath + '/addresses';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling addOrganizationAddresses.');
        }

        // verify required parameter 'addresses' is not null or undefined
        if (addresses === null || addresses === undefined) {
            throw new Error('Required parameter addresses was null or undefined when calling addOrganizationAddresses.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(addresses, "Addresses")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Address>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Address>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new dispatch route.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param createDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public createDispatchRoute (accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new driver.
     * @summary /fleet/drivers/create
     * @param accessToken Samsara API access token.
     * @param createDriverParam Driver creation body
     * @param {*} [options] Override http request options.
     */
    public createDriver (accessToken: string, createDriverParam: DriverForCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/create';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriver.');
        }

        // verify required parameter 'createDriverParam' is not null or undefined
        if (createDriverParam === null || createDriverParam === undefined) {
            throw new Error('Required parameter createDriverParam was null or undefined when calling createDriver.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDriverParam, "DriverForCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new dispatch route for the driver with driver_id.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param createDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public createDriverDispatchRoute (accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a driver document for the given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver for whom the document is created.
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     * @param {*} [options] Override http request options.
     */
    public createDriverDocument (accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: Document;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/documents'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDocument.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDocument.');
        }

        // verify required parameter 'createDocumentParams' is not null or undefined
        if (createDocumentParams === null || createDocumentParams === undefined) {
            throw new Error('Required parameter createDocumentParams was null or undefined when calling createDriverDocument.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDocumentParams, "DocumentCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Document;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Document");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @summary /fleet/maintenance/dvirs
     * @param accessToken Samsara API access token.
     * @param createDvirParam DVIR creation body
     * @param {*} [options] Override http request options.
     */
    public createDvir (accessToken: string, createDvirParam: CreateDvirParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: DvirBase;  }> {
        const localVarPath = this.basePath + '/fleet/maintenance/dvirs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDvir.');
        }

        // verify required parameter 'createDvirParam' is not null or undefined
        if (createDvirParam === null || createDvirParam === undefined) {
            throw new Error('Required parameter createDvirParam was null or undefined when calling createDvir.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDvirParam, "CreateDvirParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DvirBase;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DvirBase");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param createDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public createVehicleDispatchRoute (accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Deactivate a driver with the given id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public deactivateDriver (accessToken: string, driverIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deactivateDriver.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Delete a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param {*} [options] Override http request options.
     */
    public deleteDispatchRouteById (accessToken: string, routeId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Delete an address.
     * @summary /addresses/{addressId}
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     * @param {*} [options] Override http request options.
     */
    public deleteOrganizationAddress (accessToken: string, addressId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/addresses/{addressId}'
            .replace('{' + 'addressId' + '}', encodeURIComponent(String(addressId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteOrganizationAddress.');
        }

        // verify required parameter 'addressId' is not null or undefined
        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling deleteOrganizationAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the dispatch routes for the group.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public fetchAllDispatchRoutes (accessToken: string, groupId?: number, endTime?: number, duration?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoutes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @summary /fleet/dispatch/routes/job_updates
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param include Optionally set include&#x3D;route to include route object in response payload.
     * @param {*} [options] Override http request options.
     */
    public fetchAllRouteJobUpdates (accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: AllRouteJobUpdates;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/job_updates';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (sequenceId !== undefined) {
            localVarQueryParameters['sequence_id'] = ObjectSerializer.serialize(sequenceId, "string");
        }

        if (include !== undefined) {
            localVarQueryParameters['include'] = ObjectSerializer.serialize(include, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AllRouteJobUpdates;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AllRouteJobUpdates");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch current locations of all assets for the group.
     * @summary /fleet/assets/locations
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllAssetCurrentLocations (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2001;  }> {
        const localVarPath = this.basePath + '/fleet/assets/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2001;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2001");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the assets for the group.
     * @summary /fleet/assets
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllAssets (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse200;  }> {
        const localVarPath = this.basePath + '/fleet/assets';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssets.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse200;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse200");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all deactivated drivers for the group.
     * @summary /fleet/drivers/inactive
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllDeactivatedDrivers (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<Driver>;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Driver>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Driver>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the historical locations for the asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/locations
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getAssetLocation (accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: AssetLocationResponse;  }> {
        const localVarPath = this.basePath + '/fleet/assets/{asset_id}/locations'
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetLocation.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AssetLocationResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AssetLocationResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the reefer-specific stats of an asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/reefer
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getAssetReefer (accessToken: string, assetId: number, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: AssetReeferResponse;  }> {
        const localVarPath = this.basePath + '/fleet/assets/{asset_id}/reefer'
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetReefer.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AssetReeferResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AssetReeferResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch deactivated driver by id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public getDeactivatedDriverById (accessToken: string, driverIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch a dispatch route by id.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRouteById (accessToken: string, routeId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the history of a dispatch route.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * @param accessToken Samsara API access token.
     * @param routeId ID of the route with history.
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRouteHistory (accessToken: string, routeId: number, startTime?: number, endTime?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRouteHistory;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}/history'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startTime !== undefined) {
            localVarQueryParameters['start_time'] = ObjectSerializer.serialize(startTime, "number");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRouteHistory;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRouteHistory");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the dispatch routes for a given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRoutesByDriverId (accessToken: string, driverId: number, endTime?: number, duration?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoutes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRoutesByVehicleId (accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoutes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch driver by id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public getDriverById (accessToken: string, driverIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: CurrentDriver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: CurrentDriver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "CurrentDriver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the document types.
     * @summary /fleet/drivers/document_types
     * @param {*} [options] Override http request options.
     */
    public getDriverDocumentTypesByOrgId (options: any = {}) : Promise<{ response: http.ClientResponse; body: DocumentTypes;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/document_types';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DocumentTypes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DocumentTypes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the documents.
     * @summary /fleet/drivers/documents
     * @param accessToken Samsara API access token.
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public getDriverDocumentsByOrgId (accessToken: string, endMs?: number, durationMs?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: Documents;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/documents';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        if (durationMs !== undefined) {
            localVarQueryParameters['durationMs'] = ObjectSerializer.serialize(durationMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Documents;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Documents");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the safety score for the driver.
     * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
     * @param driverId ID of the driver
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getDriverSafetyScore (driverId: number, accessToken: string, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DriverSafetyScoreResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driverId}/safety/score'
            .replace('{' + 'driverId' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriverSafetyScoreResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriverSafetyScoreResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get DVIRs for the org within provided time constraints
     * @summary /fleet/maintenance/dvirs
     * @param accessToken Samsara API access token.
     * @param endMs time in millis until the last dvir log.
     * @param durationMs time in millis which corresponds to the duration before the end_ms.
     * @param groupId Group ID to query.
     * @param {*} [options] Override http request options.
     */
    public getDvirs (accessToken: string, endMs: number, durationMs: number, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DvirListResponse;  }> {
        const localVarPath = this.basePath + '/fleet/maintenance/dvirs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDvirs.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDvirs.');
        }

        // verify required parameter 'durationMs' is not null or undefined
        if (durationMs === null || durationMs === undefined) {
            throw new Error('Required parameter durationMs was null or undefined when calling getDvirs.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['end_ms'] = ObjectSerializer.serialize(endMs, "number");
        }

        if (durationMs !== undefined) {
            localVarQueryParameters['duration_ms'] = ObjectSerializer.serialize(durationMs, "number");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DvirListResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DvirListResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get all the drivers for the specified group.
     * @summary /fleet/drivers
     * @param accessToken Samsara API access token.
     * @param groupDriversParam 
     * @param {*} [options] Override http request options.
     */
    public getFleetDrivers (accessToken: string, groupDriversParam: GroupDriversParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: DriversResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDrivers.');
        }

        // verify required parameter 'groupDriversParam' is not null or undefined
        if (groupDriversParam === null || groupDriversParam === undefined) {
            throw new Error('Required parameter groupDriversParam was null or undefined when calling getFleetDrivers.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupDriversParam, "GroupDriversParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriversResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriversResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get summarized daily HOS charts for a specified driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with HOS logs.
     * @param hosLogsParam 
     * @param {*} [options] Override http request options.
     */
    public getFleetDriversHosDailyLogs (accessToken: string, driverId: number, hosLogsParam: HosLogsParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: DriverDailyLogResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/hos_daily_logs'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        // verify required parameter 'hosLogsParam' is not null or undefined
        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(hosLogsParam, "HosLogsParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriverDailyLogResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriverDailyLogResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @summary /fleet/drivers/summary
     * @param accessToken Samsara API access token.
     * @param driversSummaryParam Org ID and time range to query.
     * @param snapToDayBounds Snap query result to HOS day boundaries.
     * @param {*} [options] Override http request options.
     */
    public getFleetDriversSummary (accessToken: string, driversSummaryParam: DriversSummaryParam, snapToDayBounds?: boolean, options: any = {}) : Promise<{ response: http.ClientResponse; body: DriversSummaryResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/summary';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversSummary.');
        }

        // verify required parameter 'driversSummaryParam' is not null or undefined
        if (driversSummaryParam === null || driversSummaryParam === undefined) {
            throw new Error('Required parameter driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (snapToDayBounds !== undefined) {
            localVarQueryParameters['snap_to_day_bounds'] = ObjectSerializer.serialize(snapToDayBounds, "boolean");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(driversSummaryParam, "DriversSummaryParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriversSummaryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriversSummaryResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @summary /fleet/hos_authentication_logs
     * @param accessToken Samsara API access token.
     * @param hosAuthenticationLogsParam 
     * @param {*} [options] Override http request options.
     */
    public getFleetHosAuthenticationLogs (accessToken: string, hosAuthenticationLogsParam: HosAuthenticationLogsParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: HosAuthenticationLogsResponse;  }> {
        const localVarPath = this.basePath + '/fleet/hos_authentication_logs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        // verify required parameter 'hosAuthenticationLogsParam' is not null or undefined
        if (hosAuthenticationLogsParam === null || hosAuthenticationLogsParam === undefined) {
            throw new Error('Required parameter hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(hosAuthenticationLogsParam, "HosAuthenticationLogsParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HosAuthenticationLogsResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HosAuthenticationLogsResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @summary /fleet/hos_logs
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     * @param {*} [options] Override http request options.
     */
    public getFleetHosLogs (accessToken: string, hosLogsParam: HosLogsParam1, options: any = {}) : Promise<{ response: http.ClientResponse; body: HosLogsResponse;  }> {
        const localVarPath = this.basePath + '/fleet/hos_logs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogs.');
        }

        // verify required parameter 'hosLogsParam' is not null or undefined
        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogs.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(hosLogsParam, "HosLogsParam1")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HosLogsResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HosLogsResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get the current HOS status for all drivers in the group.
     * @summary /fleet/hos_logs_summary
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     * @param {*} [options] Override http request options.
     */
    public getFleetHosLogsSummary (accessToken: string, hosLogsParam: HosLogsParam2, options: any = {}) : Promise<{ response: http.ClientResponse; body: HosLogsSummaryResponse;  }> {
        const localVarPath = this.basePath + '/fleet/hos_logs_summary';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogsSummary.');
        }

        // verify required parameter 'hosLogsParam' is not null or undefined
        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(hosLogsParam, "HosLogsParam2")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HosLogsSummaryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HosLogsSummaryResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @summary /fleet/locations
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param {*} [options] Override http request options.
     */
    public getFleetLocations (accessToken: string, groupParam: GroupParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2003;  }> {
        const localVarPath = this.basePath + '/fleet/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetLocations.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupParam, "GroupParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2003;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2003");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get list of the vehicles with any engine faults or check light data.
     * @summary /fleet/maintenance/list
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param {*} [options] Override http request options.
     */
    public getFleetMaintenanceList (accessToken: string, groupParam: GroupParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2004;  }> {
        const localVarPath = this.basePath + '/fleet/maintenance/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetMaintenanceList.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetMaintenanceList.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupParam, "GroupParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2004;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2004");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @summary /fleet/trips
     * @param accessToken Samsara API access token.
     * @param tripsParam Group ID, vehicle ID and time range to query.
     * @param {*} [options] Override http request options.
     */
    public getFleetTrips (accessToken: string, tripsParam: TripsParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: TripResponse;  }> {
        const localVarPath = this.basePath + '/fleet/trips';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetTrips.');
        }

        // verify required parameter 'tripsParam' is not null or undefined
        if (tripsParam === null || tripsParam === undefined) {
            throw new Error('Required parameter tripsParam was null or undefined when calling getFleetTrips.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(tripsParam, "TripsParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: TripResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "TripResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Gets a specific vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param {*} [options] Override http request options.
     */
    public getFleetVehicle (accessToken: string, vehicleIdOrExternalId: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id_or_external_id}'
            .replace('{' + 'vehicle_id_or_external_id' + '}', encodeURIComponent(String(vehicleIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetVehicle.');
        }

        // verify required parameter 'vehicleIdOrExternalId' is not null or undefined
        if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "FleetVehicleResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch an address by its id.
     * @summary /addresses/{addressId}
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     * @param {*} [options] Override http request options.
     */
    public getOrganizationAddress (accessToken: string, addressId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: Address;  }> {
        const localVarPath = this.basePath + '/addresses/{addressId}'
            .replace('{' + 'addressId' + '}', encodeURIComponent(String(addressId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddress.');
        }

        // verify required parameter 'addressId' is not null or undefined
        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling getOrganizationAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Address;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Address");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @summary /addresses
     * @param accessToken Samsara API access token.
     * @param {*} [options] Override http request options.
     */
    public getOrganizationAddresses (accessToken: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<Address>;  }> {
        const localVarPath = this.basePath + '/addresses';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddresses.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Address>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Address>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch a contact by its id.
     * @summary /contacts/{contact_id}
     * @param accessToken Samsara API access token.
     * @param contactId ID of the contact
     * @param {*} [options] Override http request options.
     */
    public getOrganizationContact (accessToken: string, contactId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: Contact;  }> {
        const localVarPath = this.basePath + '/contacts/{contact_id}'
            .replace('{' + 'contact_id' + '}', encodeURIComponent(String(contactId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationContact.');
        }

        // verify required parameter 'contactId' is not null or undefined
        if (contactId === null || contactId === undefined) {
            throw new Error('Required parameter contactId was null or undefined when calling getOrganizationContact.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Contact;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Contact");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch harsh event details for a vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param {*} [options] Override http request options.
     */
    public getVehicleHarshEvent (vehicleId: number, accessToken: string, timestamp: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: VehicleHarshEventResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicleId}/safety/harsh_event'
            .replace('{' + 'vehicleId' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        // verify required parameter 'timestamp' is not null or undefined
        if (timestamp === null || timestamp === undefined) {
            throw new Error('Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (timestamp !== undefined) {
            localVarQueryParameters['timestamp'] = ObjectSerializer.serialize(timestamp, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: VehicleHarshEventResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "VehicleHarshEventResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
     * @param {*} [options] Override http request options.
     */
    public getVehicleLocations (accessToken: string, vehicleId: number, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: FleetVehicleLocations;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/locations'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleLocations.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleLocations.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleLocations.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: FleetVehicleLocations;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "FleetVehicleLocations");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the safety score for the vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getVehicleSafetyScore (vehicleId: number, accessToken: string, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: VehicleSafetyScoreResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicleId}/safety/score'
            .replace('{' + 'vehicleId' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: VehicleSafetyScoreResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "VehicleSafetyScoreResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @summary /fleet/vehicles/stats
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query.
     * @param endMs Time in Unix epoch milliseconds for the end of the query.
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param {*} [options] Override http request options.
     */
    public getVehicleStats (accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2005;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/stats';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleStats.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleStats.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleStats.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        if (series !== undefined) {
            localVarQueryParameters['series'] = ObjectSerializer.serialize(series, "'engineState' | 'auxInput1' | 'auxInput2'");
        }

        if (tagIds !== undefined) {
            localVarQueryParameters['tagIds'] = ObjectSerializer.serialize(tagIds, "string");
        }

        if (startingAfter !== undefined) {
            localVarQueryParameters['startingAfter'] = ObjectSerializer.serialize(startingAfter, "string");
        }

        if (endingBefore !== undefined) {
            localVarQueryParameters['endingBefore'] = ObjectSerializer.serialize(endingBefore, "string");
        }

        if (limit !== undefined) {
            localVarQueryParameters['limit'] = ObjectSerializer.serialize(limit, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2005;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2005");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @summary /fleet/vehicles/locations
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
     * @param {*} [options] Override http request options.
     */
    public getVehiclesLocations (accessToken: string, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: FleetVehiclesLocations;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehiclesLocations.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehiclesLocations.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehiclesLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: FleetVehiclesLocations;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "FleetVehiclesLocations");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all contacts for the organization.
     * @summary /contacts
     * @param accessToken Samsara API access token.
     * @param {*} [options] Override http request options.
     */
    public listContacts (accessToken: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<Contact>;  }> {
        const localVarPath = this.basePath + '/contacts';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listContacts.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Contact>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Contact>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @summary /fleet/list
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param {*} [options] Override http request options.
     */
    public listFleet (accessToken: string, groupParam: GroupParam, startingAfter?: string, endingBefore?: string, limit?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2002;  }> {
        const localVarPath = this.basePath + '/fleet/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listFleet.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling listFleet.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startingAfter !== undefined) {
            localVarQueryParameters['startingAfter'] = ObjectSerializer.serialize(startingAfter, "string");
        }

        if (endingBefore !== undefined) {
            localVarQueryParameters['endingBefore'] = ObjectSerializer.serialize(endingBefore, "string");
        }

        if (limit !== undefined) {
            localVarQueryParameters['limit'] = ObjectSerializer.serialize(limit, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupParam, "GroupParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2002;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2002");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param data 
     * @param {*} [options] Override http request options.
     */
    public patchFleetVehicle (accessToken: string, vehicleIdOrExternalId: string, data: Data, options: any = {}) : Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id_or_external_id}'
            .replace('{' + 'vehicle_id_or_external_id' + '}', encodeURIComponent(String(vehicleIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling patchFleetVehicle.');
        }

        // verify required parameter 'vehicleIdOrExternalId' is not null or undefined
        if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
        }

        // verify required parameter 'data' is not null or undefined
        if (data === null || data === undefined) {
            throw new Error('Required parameter data was null or undefined when calling patchFleetVehicle.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(data, "Data")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "FleetVehicleResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Reactivate the inactive driver having id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param reactivateDriverParam Driver reactivation body
     * @param {*} [options] Override http request options.
     */
    public reactivateDriverById (accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: ReactivateDriverParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: CurrentDriver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling reactivateDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        // verify required parameter 'reactivateDriverParam' is not null or undefined
        if (reactivateDriverParam === null || reactivateDriverParam === undefined) {
            throw new Error('Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(reactivateDriverParam, "ReactivateDriverParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: CurrentDriver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "CurrentDriver");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Update a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param updateDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public updateDispatchRouteById (accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
        }

        // verify required parameter 'updateDispatchRouteParams' is not null or undefined
        if (updateDispatchRouteParams === null || updateDispatchRouteParams === undefined) {
            throw new Error('Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(updateDispatchRouteParams, "DispatchRoute")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @summary /addresses/{addressId}
     * @param accessToken Samsara API access token.
     * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.
     * @param addressId ID of the address/geofence
     * @param {*} [options] Override http request options.
     */
    public updateOrganizationAddress (accessToken: string, address: Address, addressId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/addresses/{addressId}'
            .replace('{' + 'addressId' + '}', encodeURIComponent(String(addressId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateOrganizationAddress.');
        }

        // verify required parameter 'address' is not null or undefined
        if (address === null || address === undefined) {
            throw new Error('Required parameter address was null or undefined when calling updateOrganizationAddress.');
        }

        // verify required parameter 'addressId' is not null or undefined
        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling updateOrganizationAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(address, "Address")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @summary /fleet/set_data
     * @param accessToken Samsara API access token.
     * @param vehicleUpdateParam 
     * @param {*} [options] Override http request options.
     */
    public updateVehicles (accessToken: string, vehicleUpdateParam: VehicleUpdateParam, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/set_data';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateVehicles.');
        }

        // verify required parameter 'vehicleUpdateParam' is not null or undefined
        if (vehicleUpdateParam === null || vehicleUpdateParam === undefined) {
            throw new Error('Required parameter vehicleUpdateParam was null or undefined when calling updateVehicles.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(vehicleUpdateParam, "VehicleUpdateParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum IndustrialApiApiKeys {
}

export class IndustrialApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: IndustrialApiApiKeys, value: string) {
        (this.authentications as any)[IndustrialApiApiKeys[key]].apiKey = value;
    }
    /**
     * Fetch all of the data inputs for a group.
     * @summary /industrial/data
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
     * @param {*} [options] Override http request options.
     */
    public getAllDataInputs (accessToken: string, groupId?: number, startMs?: number, endMs?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2006;  }> {
        const localVarPath = this.basePath + '/industrial/data';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllDataInputs.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2006;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2006");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch datapoints from a given data input.
     * @summary /industrial/data/{data_input_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param dataInputId ID of the data input
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
     * @param {*} [options] Override http request options.
     */
    public getDataInput (accessToken: string, dataInputId: number, startMs?: number, endMs?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DataInputHistoryResponse;  }> {
        const localVarPath = this.basePath + '/industrial/data/{data_input_id}'
            .replace('{' + 'data_input_id' + '}', encodeURIComponent(String(dataInputId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDataInput.');
        }

        // verify required parameter 'dataInputId' is not null or undefined
        if (dataInputId === null || dataInputId === undefined) {
            throw new Error('Required parameter dataInputId was null or undefined when calling getDataInput.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DataInputHistoryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DataInputHistoryResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * @summary /machines/list
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param {*} [options] Override http request options.
     */
    public getMachines (accessToken: string, groupParam: GroupParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2007;  }> {
        const localVarPath = this.basePath + '/machines/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getMachines.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getMachines.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupParam, "GroupParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2007;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2007");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * @summary /machines/history
     * @param accessToken Samsara API access token.
     * @param historyParam Group ID and time range to query for events
     * @param {*} [options] Override http request options.
     */
    public getMachinesHistory (accessToken: string, historyParam: HistoryParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: MachineHistoryResponse;  }> {
        const localVarPath = this.basePath + '/machines/history';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getMachinesHistory.');
        }

        // verify required parameter 'historyParam' is not null or undefined
        if (historyParam === null || historyParam === undefined) {
            throw new Error('Required parameter historyParam was null or undefined when calling getMachinesHistory.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(historyParam, "HistoryParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: MachineHistoryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "MachineHistoryResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum RoutesApiApiKeys {
}

export class RoutesApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: RoutesApiApiKeys, value: string) {
        (this.authentications as any)[RoutesApiApiKeys[key]].apiKey = value;
    }
    /**
     * Create a new dispatch route.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param createDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public createDispatchRoute (accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new dispatch route for the driver with driver_id.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param createDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public createDriverDispatchRoute (accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param createDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public createVehicleDispatchRoute (accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Delete a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param {*} [options] Override http request options.
     */
    public deleteDispatchRouteById (accessToken: string, routeId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the dispatch routes for the group.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public fetchAllDispatchRoutes (accessToken: string, groupId?: number, endTime?: number, duration?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoutes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @summary /fleet/dispatch/routes/job_updates
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param include Optionally set include&#x3D;route to include route object in response payload.
     * @param {*} [options] Override http request options.
     */
    public fetchAllRouteJobUpdates (accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: AllRouteJobUpdates;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/job_updates';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (sequenceId !== undefined) {
            localVarQueryParameters['sequence_id'] = ObjectSerializer.serialize(sequenceId, "string");
        }

        if (include !== undefined) {
            localVarQueryParameters['include'] = ObjectSerializer.serialize(include, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AllRouteJobUpdates;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AllRouteJobUpdates");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch a dispatch route by id.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRouteById (accessToken: string, routeId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the history of a dispatch route.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * @param accessToken Samsara API access token.
     * @param routeId ID of the route with history.
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRouteHistory (accessToken: string, routeId: number, startTime?: number, endTime?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRouteHistory;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}/history'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startTime !== undefined) {
            localVarQueryParameters['start_time'] = ObjectSerializer.serialize(startTime, "number");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRouteHistory;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRouteHistory");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the dispatch routes for a given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRoutesByDriverId (accessToken: string, driverId: number, endTime?: number, duration?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoutes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {*} [options] Override http request options.
     */
    public getDispatchRoutesByVehicleId (accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoutes;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoutes");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Update a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param updateDispatchRouteParams 
     * @param {*} [options] Override http request options.
     */
    public updateDispatchRouteById (accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: any = {}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
        }

        // verify required parameter 'updateDispatchRouteParams' is not null or undefined
        if (updateDispatchRouteParams === null || updateDispatchRouteParams === undefined) {
            throw new Error('Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(updateDispatchRouteParams, "DispatchRoute")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum SafetyApiApiKeys {
}

export class SafetyApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: SafetyApiApiKeys, value: string) {
        (this.authentications as any)[SafetyApiApiKeys[key]].apiKey = value;
    }
    /**
     * Fetch the safety score for the driver.
     * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
     * @param driverId ID of the driver
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getDriverSafetyScore (driverId: number, accessToken: string, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: DriverSafetyScoreResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driverId}/safety/score'
            .replace('{' + 'driverId' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriverSafetyScoreResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriverSafetyScoreResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch harsh event details for a vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param {*} [options] Override http request options.
     */
    public getVehicleHarshEvent (vehicleId: number, accessToken: string, timestamp: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: VehicleHarshEventResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicleId}/safety/harsh_event'
            .replace('{' + 'vehicleId' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        // verify required parameter 'timestamp' is not null or undefined
        if (timestamp === null || timestamp === undefined) {
            throw new Error('Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (timestamp !== undefined) {
            localVarQueryParameters['timestamp'] = ObjectSerializer.serialize(timestamp, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: VehicleHarshEventResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "VehicleHarshEventResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch the safety score for the vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {*} [options] Override http request options.
     */
    public getVehicleSafetyScore (vehicleId: number, accessToken: string, startMs: number, endMs: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: VehicleSafetyScoreResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicleId}/safety/score'
            .replace('{' + 'vehicleId' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: VehicleSafetyScoreResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "VehicleSafetyScoreResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum SensorsApiApiKeys {
}

export class SensorsApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: SensorsApiApiKeys, value: string) {
        (this.authentications as any)[SensorsApiApiKeys[key]].apiKey = value;
    }
    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @summary /sensors/list
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param {*} [options] Override http request options.
     */
    public getSensors (accessToken: string, groupParam: GroupParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2008;  }> {
        const localVarPath = this.basePath + '/sensors/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensors.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getSensors.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupParam, "GroupParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2008;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2008");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     * @summary /sensors/cargo
     * @param accessToken Samsara API access token.
     * @param sensorParam Group ID and list of sensor IDs to query.
     * @param {*} [options] Override http request options.
     */
    public getSensorsCargo (accessToken: string, sensorParam: SensorParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: CargoResponse;  }> {
        const localVarPath = this.basePath + '/sensors/cargo';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsCargo.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsCargo.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "SensorParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: CargoResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "CargoResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get door monitor status (closed / open) for requested sensors.
     * @summary /sensors/door
     * @param accessToken Samsara API access token.
     * @param sensorParam Group ID and list of sensor IDs to query.
     * @param {*} [options] Override http request options.
     */
    public getSensorsDoor (accessToken: string, sensorParam: SensorParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: DoorResponse;  }> {
        const localVarPath = this.basePath + '/sensors/door';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsDoor.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsDoor.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "SensorParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DoorResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DoorResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @summary /sensors/history
     * @param accessToken Samsara API access token.
     * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to query.
     * @param {*} [options] Override http request options.
     */
    public getSensorsHistory (accessToken: string, historyParam: HistoryParam1, options: any = {}) : Promise<{ response: http.ClientResponse; body: SensorHistoryResponse;  }> {
        const localVarPath = this.basePath + '/sensors/history';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsHistory.');
        }

        // verify required parameter 'historyParam' is not null or undefined
        if (historyParam === null || historyParam === undefined) {
            throw new Error('Required parameter historyParam was null or undefined when calling getSensorsHistory.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(historyParam, "HistoryParam1")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: SensorHistoryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "SensorHistoryResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @summary /sensors/humidity
     * @param accessToken Samsara API access token.
     * @param sensorParam Group ID and list of sensor IDs to query.
     * @param {*} [options] Override http request options.
     */
    public getSensorsHumidity (accessToken: string, sensorParam: SensorParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: HumidityResponse;  }> {
        const localVarPath = this.basePath + '/sensors/humidity';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsHumidity.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsHumidity.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "SensorParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HumidityResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HumidityResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @summary /sensors/temperature
     * @param accessToken Samsara API access token.
     * @param sensorParam Group ID and list of sensor IDs to query.
     * @param {*} [options] Override http request options.
     */
    public getSensorsTemperature (accessToken: string, sensorParam: SensorParam, options: any = {}) : Promise<{ response: http.ClientResponse; body: TemperatureResponse;  }> {
        const localVarPath = this.basePath + '/sensors/temperature';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsTemperature.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsTemperature.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "SensorParam")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: TemperatureResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "TemperatureResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum TagsApiApiKeys {
}

export class TagsApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: TagsApiApiKeys, value: string) {
        (this.authentications as any)[TagsApiApiKeys[key]].apiKey = value;
    }
    /**
     * Create a new tag for the group.
     * @summary /tags
     * @param accessToken Samsara API access token.
     * @param tagCreateParams 
     * @param {*} [options] Override http request options.
     */
    public createTag (accessToken: string, tagCreateParams: TagCreate, options: any = {}) : Promise<{ response: http.ClientResponse; body: Tag;  }> {
        const localVarPath = this.basePath + '/tags';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createTag.');
        }

        // verify required parameter 'tagCreateParams' is not null or undefined
        if (tagCreateParams === null || tagCreateParams === undefined) {
            throw new Error('Required parameter tagCreateParams was null or undefined when calling createTag.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(tagCreateParams, "TagCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Tag;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Tag");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Permanently deletes a tag.
     * @summary /tags/{tag_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param {*} [options] Override http request options.
     */
    public deleteTagById (accessToken: string, tagId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/tags/{tag_id}'
            .replace('{' + 'tag_id' + '}', encodeURIComponent(String(tagId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteTagById.');
        }

        // verify required parameter 'tagId' is not null or undefined
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling deleteTagById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch all of the tags for a group.
     * @summary /tags
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {*} [options] Override http request options.
     */
    public getAllTags (accessToken: string, groupId?: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: InlineResponse2009;  }> {
        const localVarPath = this.basePath + '/tags';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllTags.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2009;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2009");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Fetch a tag by id.
     * @summary /tags/{tag_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param {*} [options] Override http request options.
     */
    public getTagById (accessToken: string, tagId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: Tag;  }> {
        const localVarPath = this.basePath + '/tags/{tag_id}'
            .replace('{' + 'tag_id' + '}', encodeURIComponent(String(tagId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getTagById.');
        }

        // verify required parameter 'tagId' is not null or undefined
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling getTagById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Tag;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Tag");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @summary /tags/{tag_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param tagModifyParams 
     * @param {*} [options] Override http request options.
     */
    public modifyTagById (accessToken: string, tagId: number, tagModifyParams: TagModify, options: any = {}) : Promise<{ response: http.ClientResponse; body: Tag;  }> {
        const localVarPath = this.basePath + '/tags/{tag_id}'
            .replace('{' + 'tag_id' + '}', encodeURIComponent(String(tagId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling modifyTagById.');
        }

        // verify required parameter 'tagId' is not null or undefined
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling modifyTagById.');
        }

        // verify required parameter 'tagModifyParams' is not null or undefined
        if (tagModifyParams === null || tagModifyParams === undefined) {
            throw new Error('Required parameter tagModifyParams was null or undefined when calling modifyTagById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(tagModifyParams, "TagModify")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Tag;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Tag");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @summary /tags/{tag_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param updateTagParams 
     * @param {*} [options] Override http request options.
     */
    public updateTagById (accessToken: string, tagId: number, updateTagParams: TagUpdate, options: any = {}) : Promise<{ response: http.ClientResponse; body: Tag;  }> {
        const localVarPath = this.basePath + '/tags/{tag_id}'
            .replace('{' + 'tag_id' + '}', encodeURIComponent(String(tagId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateTagById.');
        }

        // verify required parameter 'tagId' is not null or undefined
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling updateTagById.');
        }

        // verify required parameter 'updateTagParams' is not null or undefined
        if (updateTagParams === null || updateTagParams === undefined) {
            throw new Error('Required parameter updateTagParams was null or undefined when calling updateTagById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(updateTagParams, "TagUpdate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Tag;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Tag");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
export enum UsersApiApiKeys {
}

export class UsersApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
	this.authentications.default = auth;
    }

    public setApiKey(key: UsersApiApiKeys, value: string) {
        (this.authentications as any)[UsersApiApiKeys[key]].apiKey = value;
    }
    /**
     * Remove a user from the organization.
     * @summary /users/{userId:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param userId ID of the user.
     * @param {*} [options] Override http request options.
     */
    public deleteUserById (accessToken: string, userId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/users/{userId}'
            .replace('{' + 'userId' + '}', encodeURIComponent(String(userId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteUserById.');
        }

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new Error('Required parameter userId was null or undefined when calling deleteUserById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get a user.
     * @summary /users/{userId:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param userId ID of the user.
     * @param {*} [options] Override http request options.
     */
    public getUserById (accessToken: string, userId: number, options: any = {}) : Promise<{ response: http.ClientResponse; body: User;  }> {
        const localVarPath = this.basePath + '/users/{userId}'
            .replace('{' + 'userId' + '}', encodeURIComponent(String(userId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getUserById.');
        }

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new Error('Required parameter userId was null or undefined when calling getUserById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: User;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "User");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get all roles in the organization.
     * @summary /user_roles
     * @param accessToken Samsara API access token.
     * @param {*} [options] Override http request options.
     */
    public listUserRoles (accessToken: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<UserRole>;  }> {
        const localVarPath = this.basePath + '/user_roles';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listUserRoles.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<UserRole>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<UserRole>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * List all users in the organization.
     * @summary /users
     * @param accessToken Samsara API access token.
     * @param {*} [options] Override http request options.
     */
    public listUsers (accessToken: string, options: any = {}) : Promise<{ response: http.ClientResponse; body: Array<User>;  }> {
        const localVarPath = this.basePath + '/users';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listUsers.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<User>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<User>");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
