#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


/// Information about an address/geofence. Geofences are either a circle or a polygon.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Address {
    #[serde(rename = "contacts")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub contacts: Option<Vec<models::Contact>>,

    /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
    #[serde(rename = "formattedAddress")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub formatted_address: Option<String>,

    #[serde(rename = "geofence")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub geofence: Option<models::AddressGeofence>,

    /// ID of the address
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

    /// Name of the address or geofence
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Notes associated with an address.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    #[serde(rename = "tags")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tags: Option<Vec<models::TagMetadata>>,

}

impl Address {
    pub fn new() -> Address {
        Address {
            contacts: None,
            formatted_address: None,
            geofence: None,
            id: None,
            name: None,
            notes: None,
            tags: None,
        }
    }
}

/// The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AddressGeofence {
    #[serde(rename = "circle")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub circle: Option<models::AddressGeofenceCircle>,

    #[serde(rename = "polygon")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub polygon: Option<models::AddressGeofencePolygon>,

}

impl AddressGeofence {
    pub fn new() -> AddressGeofence {
        AddressGeofence {
            circle: None,
            polygon: None,
        }
    }
}

/// Information about a circular geofence. This field is only populated if the geofence is a circle.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AddressGeofenceCircle {
    /// The latitude of the center of the circular geofence
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    /// The radius of the circular geofence
    #[serde(rename = "radiusMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub radius_meters: Option<i64>,

    /// The longitude of the center of the circular geofence
    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

}

impl AddressGeofenceCircle {
    pub fn new() -> AddressGeofenceCircle {
        AddressGeofenceCircle {
            latitude: None,
            radius_meters: None,
            longitude: None,
        }
    }
}

/// Information about a polygon geofence. This field is only populated if the geofence is a polygon.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AddressGeofencePolygon {
    /// The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
    #[serde(rename = "vertices")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vertices: Option<Vec<models::AddressGeofencePolygonVertices>>,

}

impl AddressGeofencePolygon {
    pub fn new() -> AddressGeofencePolygon {
        AddressGeofencePolygon {
            vertices: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AddressGeofencePolygonVertices {
    /// The longitude of a geofence vertex
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    /// The longitude of a geofence vertex
    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

}

impl AddressGeofencePolygonVertices {
    pub fn new() -> AddressGeofencePolygonVertices {
        AddressGeofencePolygonVertices {
            latitude: None,
            longitude: None,
        }
    }
}

/// Notes associated with an address.
#[derive(Debug, Clone, PartialEq, PartialOrd, Serialize, Deserialize)]

pub struct AddressNotes(String);

impl ::std::convert::From<String> for AddressNotes {
    fn from(x: String) -> Self {
        AddressNotes(x)
    }
}

impl ::std::convert::From<AddressNotes> for String {
    fn from(x: AddressNotes) -> Self {
        x.0
    }
}

impl ::std::ops::Deref for AddressNotes {
    type Target = String;
    fn deref(&self) -> &String {
        &self.0
    }
}

impl ::std::ops::DerefMut for AddressNotes {
    fn deref_mut(&mut self) -> &mut String {
        &mut self.0
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AddressesAddresses {
    /// Notes associated with an address.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
    #[serde(rename = "formattedAddress")]
    pub formatted_address: String,

    #[serde(rename = "geofence")]
    pub geofence: models::AddressGeofence,

    /// A list of tag IDs.
    #[serde(rename = "tagIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tag_ids: Option<Vec<i64>>,

    /// The name of this address/geofence
    #[serde(rename = "name")]
    pub name: String,

    /// A list of IDs for contact book entries.
    #[serde(rename = "contactIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub contact_ids: Option<Vec<i64>>,

}

impl AddressesAddresses {
    pub fn new(formatted_address: String, geofence: models::AddressGeofence, name: String, ) -> AddressesAddresses {
        AddressesAddresses {
            notes: None,
            formatted_address: formatted_address,
            geofence: geofence,
            tag_ids: None,
            name: name,
            contact_ids: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AllRouteJobUpdates {
    #[serde(rename = "job_updates")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub job_updates: Option<Vec<models::JobUpdateObject>>,

    /// Sequence ID of the last update returned in the response
    #[serde(rename = "sequence_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sequence_id: Option<String>,

}

impl AllRouteJobUpdates {
    pub fn new() -> AllRouteJobUpdates {
        AllRouteJobUpdates {
            job_updates: None,
            sequence_id: None,
        }
    }
}

/// Basic information of an asset
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Asset {
    /// Serial number of the host asset
    #[serde(rename = "assetSerialNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asset_serial_number: Option<String>,

    /// The cable connected to the asset
    #[serde(rename = "cable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cable: Option<Vec<models::AssetCable>>,

    /// Engine hours
    #[serde(rename = "engineHours")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub engine_hours: Option<isize>,

    /// Asset ID
    #[serde(rename = "id")]
    pub id: i64,

    /// Asset name
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl Asset {
    pub fn new(id: i64, ) -> Asset {
        Asset {
            asset_serial_number: None,
            cable: None,
            engine_hours: None,
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetCable {
    /// Asset type
    #[serde(rename = "assetType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asset_type: Option<String>,

}

impl AssetCable {
    pub fn new() -> AssetCable {
        AssetCable {
            asset_type: None,
        }
    }
}

/// Current location of an asset
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetCurrentLocation {
    /// The latitude of the location in degrees.
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    /// The best effort (street,city,state) for the latitude and longitude.
    #[serde(rename = "location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub location: Option<String>,

    /// The longitude of the location in degrees.
    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

    /// The speed calculated from GPS that the asset was traveling at in miles per hour.
    #[serde(rename = "speedMilesPerHour")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub speed_miles_per_hour: Option<f64>,

    /// Time in Unix milliseconds since epoch when the asset was at the location.
    #[serde(rename = "timeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_ms: Option<i64>,

}

impl AssetCurrentLocation {
    pub fn new() -> AssetCurrentLocation {
        AssetCurrentLocation {
            latitude: None,
            location: None,
            longitude: None,
            speed_miles_per_hour: None,
            time_ms: None,
        }
    }
}

/// Basic information of an asset
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetCurrentLocationsResponse {
    /// The cable connected to the asset
    #[serde(rename = "cable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cable: Option<Vec<models::AssetCable>>,

    /// Engine hours
    #[serde(rename = "engineHours")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub engine_hours: Option<isize>,

    /// Asset ID
    #[serde(rename = "id")]
    pub id: i64,

    /// Current location of an asset
    #[serde(rename = "location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub location: Option<Vec<models::AssetCurrentLocation>>,

    /// Asset name
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl AssetCurrentLocationsResponse {
    pub fn new(id: i64, ) -> AssetCurrentLocationsResponse {
        AssetCurrentLocationsResponse {
            cable: None,
            engine_hours: None,
            id: id,
            location: None,
            name: None,
        }
    }
}

/// Reefer-specific asset details
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponse {
    /// Asset type
    #[serde(rename = "assetType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asset_type: Option<String>,

    /// Asset ID
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// Asset name
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    #[serde(rename = "reeferStats")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reefer_stats: Option<models::AssetReeferResponseReeferStats>,

}

impl AssetReeferResponse {
    pub fn new() -> AssetReeferResponse {
        AssetReeferResponse {
            asset_type: None,
            id: None,
            name: None,
            reefer_stats: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStats {
    /// Fuel percentage of the reefer
    #[serde(rename = "fuelPercentage")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fuel_percentage: Option<Vec<models::AssetReeferResponseReeferStatsFuelPercentage>>,

    /// Power status of the reefer
    #[serde(rename = "powerStatus")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub power_status: Option<Vec<models::AssetReeferResponseReeferStatsPowerStatus>>,

    /// Engine hours of the reefer
    #[serde(rename = "engineHours")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub engine_hours: Option<Vec<models::AssetReeferResponseReeferStatsEngineHours>>,

    /// Set point temperature of the reefer
    #[serde(rename = "setPoint")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub set_point: Option<Vec<models::AssetReeferResponseReeferStatsSetPoint>>,

    /// Return air temperature of the reefer
    #[serde(rename = "returnAirTemp")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub return_air_temp: Option<Vec<models::AssetReeferResponseReeferStatsReturnAirTemp>>,

    /// Reefer alarms
    #[serde(rename = "alarms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alarms: Option<Vec<models::AssetReeferResponseReeferStatsAlarms1>>,

}

impl AssetReeferResponseReeferStats {
    pub fn new() -> AssetReeferResponseReeferStats {
        AssetReeferResponseReeferStats {
            fuel_percentage: None,
            power_status: None,
            engine_hours: None,
            set_point: None,
            return_air_temp: None,
            alarms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsAlarms {
    /// Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
    #[serde(rename = "severity")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub severity: Option<i64>,

    /// Recommended operator action
    #[serde(rename = "operatorAction")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub operator_action: Option<String>,

    /// Description of the alarm
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// ID of the alarm
    #[serde(rename = "alarmCode")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alarm_code: Option<i64>,

}

impl AssetReeferResponseReeferStatsAlarms {
    pub fn new() -> AssetReeferResponseReeferStatsAlarms {
        AssetReeferResponseReeferStatsAlarms {
            severity: None,
            operator_action: None,
            description: None,
            alarm_code: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsAlarms1 {
    #[serde(rename = "alarms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alarms: Option<Vec<models::AssetReeferResponseReeferStatsAlarms>>,

    /// Timestamp when the alarms were reported, in Unix milliseconds since epoch
    #[serde(rename = "changedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

}

impl AssetReeferResponseReeferStatsAlarms1 {
    pub fn new() -> AssetReeferResponseReeferStatsAlarms1 {
        AssetReeferResponseReeferStatsAlarms1 {
            alarms: None,
            changed_at_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsEngineHours {
    /// Engine hours of the reefer.
    #[serde(rename = "engineHours")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub engine_hours: Option<i64>,

    /// Timestamp in Unix milliseconds since epoch.
    #[serde(rename = "changedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

}

impl AssetReeferResponseReeferStatsEngineHours {
    pub fn new() -> AssetReeferResponseReeferStatsEngineHours {
        AssetReeferResponseReeferStatsEngineHours {
            engine_hours: None,
            changed_at_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsFuelPercentage {
    /// Fuel percentage of the reefer.
    #[serde(rename = "fuelPercentage")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fuel_percentage: Option<i64>,

    /// Timestamp in Unix milliseconds since epoch.
    #[serde(rename = "changedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

}

impl AssetReeferResponseReeferStatsFuelPercentage {
    pub fn new() -> AssetReeferResponseReeferStatsFuelPercentage {
        AssetReeferResponseReeferStatsFuelPercentage {
            fuel_percentage: None,
            changed_at_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsPowerStatus {
    /// Timestamp in Unix milliseconds since epoch.
    #[serde(rename = "changedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

    /// Power status of the reefer.
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

}

impl AssetReeferResponseReeferStatsPowerStatus {
    pub fn new() -> AssetReeferResponseReeferStatsPowerStatus {
        AssetReeferResponseReeferStatsPowerStatus {
            changed_at_ms: None,
            status: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsReturnAirTemp {
    /// Return air temperature in millidegree Celsius.
    #[serde(rename = "tempInMilliC")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub temp_in_milli_c: Option<i64>,

    /// Timestamp in Unix milliseconds since epoch.
    #[serde(rename = "changedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

}

impl AssetReeferResponseReeferStatsReturnAirTemp {
    pub fn new() -> AssetReeferResponseReeferStatsReturnAirTemp {
        AssetReeferResponseReeferStatsReturnAirTemp {
            temp_in_milli_c: None,
            changed_at_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AssetReeferResponseReeferStatsSetPoint {
    /// Set point temperature in millidegree Celsius.
    #[serde(rename = "tempInMilliC")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub temp_in_milli_c: Option<i64>,

    /// Timestamp in Unix milliseconds since epoch.
    #[serde(rename = "changedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

}

impl AssetReeferResponseReeferStatsSetPoint {
    pub fn new() -> AssetReeferResponseReeferStatsSetPoint {
        AssetReeferResponseReeferStatsSetPoint {
            temp_in_milli_c: None,
            changed_at_ms: None,
        }
    }
}

/// Digital value of an aux input.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AuxInput {
    /// Timestamp in Unix epoch milliseconds.
    #[serde(rename = "timeMs")]
    pub time_ms: Object,

    /// Boolean representing the digital value of the aux input.
    #[serde(rename = "value")]
    pub value: bool,

}

impl AuxInput {
    pub fn new(time_ms: Object, value: bool, ) -> AuxInput {
        AuxInput {
            time_ms: time_ms,
            value: value,
        }
    }
}

/// A list of aux input values over a timerange.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AuxInputSeries {
    /// The name of the aux input.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "name")]
    pub name: String,

    #[serde(rename = "values")]
    pub values: Vec<models::AuxInput>,

}

impl AuxInputSeries {
    pub fn new(name: String, values: Vec<models::AuxInput>, ) -> AuxInputSeries {
        AuxInputSeries {
            name: name,
            values: values,
        }
    }
}

/// Contains the current cargo status of a sensor.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct CargoResponse {
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::CargoResponseSensors>>,

}

impl CargoResponse {
    pub fn new() -> CargoResponse {
        CargoResponse {
            group_id: None,
            sensors: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct CargoResponseSensors {
    /// Flag indicating whether the current cargo is empty or loaded.
    #[serde(rename = "cargoEmpty")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cargo_empty: Option<bool>,

    /// Name of the sensor.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// ID of the sensor.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

}

impl CargoResponseSensors {
    pub fn new() -> CargoResponseSensors {
        CargoResponseSensors {
            cargo_empty: None,
            name: None,
            id: None,
        }
    }
}

/// Information about a notification contact for alerts.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Contact {
    /// Email address of the contact
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// First name of the contact
    #[serde(rename = "firstName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub first_name: Option<String>,

    /// ID of the contact
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

    /// Last name of the contact
    #[serde(rename = "lastName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub last_name: Option<String>,

    /// Phone number of the contact
    #[serde(rename = "phone")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub phone: Option<String>,

}

impl Contact {
    pub fn new() -> Contact {
        Contact {
            email: None,
            first_name: None,
            id: None,
            last_name: None,
            phone: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct CurrentDriver {
}

impl CurrentDriver {
    pub fn new() -> CurrentDriver {
        CurrentDriver {
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DataInputHistoryResponse {
    /// The ID of this data input
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

    /// Name of this data input
    #[serde(rename = "name")]
    pub name: String,

    /// Data points from this data input
    #[serde(rename = "points")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub points: Option<Vec<models::DataInputHistoryResponsePoints>>,

}

impl DataInputHistoryResponse {
    pub fn new(name: String, ) -> DataInputHistoryResponse {
        DataInputHistoryResponse {
            id: None,
            name: name,
            points: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DataInputHistoryResponsePoints {
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<f64>,

    #[serde(rename = "timeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_ms: Option<i64>,

}

impl DataInputHistoryResponsePoints {
    pub fn new() -> DataInputHistoryResponsePoints {
        DataInputHistoryResponsePoints {
            value: None,
            time_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchJob {
    /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    #[serde(rename = "destination_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_address: Option<String>,

    /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    #[serde(rename = "destination_address_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_address_id: Option<i64>,

    /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    #[serde(rename = "destination_lat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_lat: Option<f64>,

    /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    #[serde(rename = "destination_lng")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_lng: Option<f64>,

    /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    #[serde(rename = "destination_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_name: Option<String>,

    /// Notes regarding the details of this job.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// The time at which the assigned driver is scheduled to arrive at the job destination.
    #[serde(rename = "scheduled_arrival_time_ms")]
    pub scheduled_arrival_time_ms: i64,

    /// The time at which the assigned driver is scheduled to depart from the job destination.
    #[serde(rename = "scheduled_departure_time_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub scheduled_departure_time_ms: Option<i64>,

    /// The time at which the driver arrived at the job destination.
    #[serde(rename = "arrived_at_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub arrived_at_ms: Option<i64>,

    /// The time at which the job was marked complete (e.g. started driving to the next destination).
    #[serde(rename = "completed_at_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub completed_at_ms: Option<i64>,

    /// ID of the route that this job belongs to.
    #[serde(rename = "dispatch_route_id")]
    pub dispatch_route_id: i64,

    /// ID of the driver assigned to the dispatch job.
    #[serde(rename = "driver_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
    #[serde(rename = "en_route_at_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub en_route_at_ms: Option<i64>,

    /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
    #[serde(rename = "estimated_arrival_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub estimated_arrival_ms: Option<i64>,

    /// Fleet viewer url of the dispatch job.
    #[serde(rename = "fleet_viewer_url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fleet_viewer_url: Option<String>,

    #[serde(rename = "group_id")]
    pub group_id: i64,

    /// ID of the Samsara dispatch job.
    #[serde(rename = "id")]
    pub id: i64,

    #[serde(rename = "job_state")]
    pub job_state: models::JobStatus,

    /// The time at which the job was marked skipped.
    #[serde(rename = "skipped_at_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub skipped_at_ms: Option<i64>,

    /// ID of the vehicle used for the dispatch job.
    #[serde(rename = "vehicle_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

}

impl DispatchJob {
    pub fn new(scheduled_arrival_time_ms: i64, dispatch_route_id: i64, group_id: i64, id: i64, job_state: models::JobStatus, ) -> DispatchJob {
        DispatchJob {
            destination_address: None,
            destination_address_id: None,
            destination_lat: None,
            destination_lng: None,
            destination_name: None,
            notes: None,
            scheduled_arrival_time_ms: scheduled_arrival_time_ms,
            scheduled_departure_time_ms: None,
            arrived_at_ms: None,
            completed_at_ms: None,
            dispatch_route_id: dispatch_route_id,
            driver_id: None,
            en_route_at_ms: None,
            estimated_arrival_ms: None,
            fleet_viewer_url: None,
            group_id: group_id,
            id: id,
            job_state: job_state,
            skipped_at_ms: None,
            vehicle_id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchJobCreate {
    /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    #[serde(rename = "destination_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_address: Option<String>,

    /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    #[serde(rename = "destination_address_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_address_id: Option<i64>,

    /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    #[serde(rename = "destination_lat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_lat: Option<f64>,

    /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    #[serde(rename = "destination_lng")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_lng: Option<f64>,

    /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    #[serde(rename = "destination_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub destination_name: Option<String>,

    /// Notes regarding the details of this job.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// The time at which the assigned driver is scheduled to arrive at the job destination.
    #[serde(rename = "scheduled_arrival_time_ms")]
    pub scheduled_arrival_time_ms: i64,

    /// The time at which the assigned driver is scheduled to depart from the job destination.
    #[serde(rename = "scheduled_departure_time_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub scheduled_departure_time_ms: Option<i64>,

}

impl DispatchJobCreate {
    pub fn new(scheduled_arrival_time_ms: i64, ) -> DispatchJobCreate {
        DispatchJobCreate {
            destination_address: None,
            destination_address_id: None,
            destination_lat: None,
            destination_lng: None,
            destination_name: None,
            notes: None,
            scheduled_arrival_time_ms: scheduled_arrival_time_ms,
            scheduled_departure_time_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchRoute {
    /// The time in Unix epoch milliseconds that the route actually ended.
    #[serde(rename = "actual_end_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_end_ms: Option<i64>,

    /// The time in Unix epoch milliseconds that the route actually started.
    #[serde(rename = "actual_start_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_start_ms: Option<i64>,

    /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    #[serde(rename = "driver_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// ID of the group if the organization has multiple groups (optional).
    #[serde(rename = "group_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Descriptive name of this route.
    #[serde(rename = "name")]
    pub name: String,

    /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    #[serde(rename = "scheduled_end_ms")]
    pub scheduled_end_ms: i64,

    /// The distance expected to be traveled for this route in meters.
    #[serde(rename = "scheduled_meters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub scheduled_meters: Option<i64>,

    /// The time in Unix epoch milliseconds that the route is scheduled to start.
    #[serde(rename = "scheduled_start_ms")]
    pub scheduled_start_ms: i64,

    /// The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_address: Option<String>,

    /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    #[serde(rename = "start_location_address_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_address_id: Option<i64>,

    /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_lat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_lat: Option<f64>,

    /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_lng")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_lng: Option<f64>,

    /// The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    #[serde(rename = "start_location_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_name: Option<String>,

    /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    #[serde(rename = "trailer_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_id: Option<i64>,

    /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    #[serde(rename = "vehicle_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

    /// The dispatch jobs associated with this route.
    #[serde(rename = "dispatch_jobs")]
    pub dispatch_jobs: Vec<models::DispatchJob>,

    /// ID of the Samsara dispatch route.
    #[serde(rename = "id")]
    pub id: i64,

}

impl DispatchRoute {
    pub fn new(name: String, scheduled_end_ms: i64, scheduled_start_ms: i64, dispatch_jobs: Vec<models::DispatchJob>, id: i64, ) -> DispatchRoute {
        DispatchRoute {
            actual_end_ms: None,
            actual_start_ms: None,
            driver_id: None,
            group_id: None,
            name: name,
            scheduled_end_ms: scheduled_end_ms,
            scheduled_meters: None,
            scheduled_start_ms: scheduled_start_ms,
            start_location_address: None,
            start_location_address_id: None,
            start_location_lat: None,
            start_location_lng: None,
            start_location_name: None,
            trailer_id: None,
            vehicle_id: None,
            dispatch_jobs: dispatch_jobs,
            id: id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchRouteBase {
    /// The time in Unix epoch milliseconds that the route actually ended.
    #[serde(rename = "actual_end_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_end_ms: Option<i64>,

    /// The time in Unix epoch milliseconds that the route actually started.
    #[serde(rename = "actual_start_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_start_ms: Option<i64>,

    /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    #[serde(rename = "driver_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// ID of the group if the organization has multiple groups (optional).
    #[serde(rename = "group_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Descriptive name of this route.
    #[serde(rename = "name")]
    pub name: String,

    /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    #[serde(rename = "scheduled_end_ms")]
    pub scheduled_end_ms: i64,

    /// The distance expected to be traveled for this route in meters.
    #[serde(rename = "scheduled_meters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub scheduled_meters: Option<i64>,

    /// The time in Unix epoch milliseconds that the route is scheduled to start.
    #[serde(rename = "scheduled_start_ms")]
    pub scheduled_start_ms: i64,

    /// The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_address: Option<String>,

    /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    #[serde(rename = "start_location_address_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_address_id: Option<i64>,

    /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_lat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_lat: Option<f64>,

    /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_lng")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_lng: Option<f64>,

    /// The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    #[serde(rename = "start_location_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_name: Option<String>,

    /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    #[serde(rename = "trailer_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_id: Option<i64>,

    /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    #[serde(rename = "vehicle_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

}

impl DispatchRouteBase {
    pub fn new(name: String, scheduled_end_ms: i64, scheduled_start_ms: i64, ) -> DispatchRouteBase {
        DispatchRouteBase {
            actual_end_ms: None,
            actual_start_ms: None,
            driver_id: None,
            group_id: None,
            name: name,
            scheduled_end_ms: scheduled_end_ms,
            scheduled_meters: None,
            scheduled_start_ms: scheduled_start_ms,
            start_location_address: None,
            start_location_address_id: None,
            start_location_lat: None,
            start_location_lng: None,
            start_location_name: None,
            trailer_id: None,
            vehicle_id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchRouteCreate {
    /// The time in Unix epoch milliseconds that the route actually ended.
    #[serde(rename = "actual_end_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_end_ms: Option<i64>,

    /// The time in Unix epoch milliseconds that the route actually started.
    #[serde(rename = "actual_start_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_start_ms: Option<i64>,

    /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    #[serde(rename = "driver_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// ID of the group if the organization has multiple groups (optional).
    #[serde(rename = "group_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Descriptive name of this route.
    #[serde(rename = "name")]
    pub name: String,

    /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    #[serde(rename = "scheduled_end_ms")]
    pub scheduled_end_ms: i64,

    /// The distance expected to be traveled for this route in meters.
    #[serde(rename = "scheduled_meters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub scheduled_meters: Option<i64>,

    /// The time in Unix epoch milliseconds that the route is scheduled to start.
    #[serde(rename = "scheduled_start_ms")]
    pub scheduled_start_ms: i64,

    /// The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_address: Option<String>,

    /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    #[serde(rename = "start_location_address_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_address_id: Option<i64>,

    /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_lat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_lat: Option<f64>,

    /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    #[serde(rename = "start_location_lng")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_lng: Option<f64>,

    /// The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    #[serde(rename = "start_location_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location_name: Option<String>,

    /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    #[serde(rename = "trailer_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_id: Option<i64>,

    /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    #[serde(rename = "vehicle_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

    /// The dispatch jobs to create for this route.
    #[serde(rename = "dispatch_jobs")]
    pub dispatch_jobs: Vec<models::DispatchJobCreate>,

}

impl DispatchRouteCreate {
    pub fn new(name: String, scheduled_end_ms: i64, scheduled_start_ms: i64, dispatch_jobs: Vec<models::DispatchJobCreate>, ) -> DispatchRouteCreate {
        DispatchRouteCreate {
            actual_end_ms: None,
            actual_start_ms: None,
            driver_id: None,
            group_id: None,
            name: name,
            scheduled_end_ms: scheduled_end_ms,
            scheduled_meters: None,
            scheduled_start_ms: scheduled_start_ms,
            start_location_address: None,
            start_location_address_id: None,
            start_location_lat: None,
            start_location_lng: None,
            start_location_name: None,
            trailer_id: None,
            vehicle_id: None,
            dispatch_jobs: dispatch_jobs,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchRouteHistoricalEntry {
    /// Timestamp that the route was updated, represented as Unix milliseconds since epoch.
    #[serde(rename = "changed_at_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

    #[serde(rename = "route")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub route: Option<models::DispatchRoute>,

}

impl DispatchRouteHistoricalEntry {
    pub fn new() -> DispatchRouteHistoricalEntry {
        DispatchRouteHistoricalEntry {
            changed_at_ms: None,
            route: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DispatchRouteHistory {
    /// History of the route's state changes.
    #[serde(rename = "history")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub history: Option<Vec<models::DispatchRouteHistoricalEntry>>,

}

impl DispatchRouteHistory {
    pub fn new() -> DispatchRouteHistory {
        DispatchRouteHistory {
            history: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Document {
    /// ID of the Samsara dispatch job for which the document is submitted
    #[serde(rename = "dispatchJobId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dispatch_job_id: Option<i64>,

    /// Notes submitted with this document.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// Descriptive name of this type of document.
    #[serde(rename = "documentType")]
    pub document_type: String,

    /// The time in Unix epoch milliseconds that the document is created.
    #[serde(rename = "driverCreatedAtMs")]
    pub driver_created_at_ms: i64,

    /// ID of the driver for whom the document is submitted
    #[serde(rename = "driverId")]
    pub driver_id: i64,

    /// The fields associated with this document.
    #[serde(rename = "fields")]
    pub fields: Vec<models::DocumentField>,

    /// VehicleID of the driver at document creation.
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

}

impl Document {
    pub fn new(document_type: String, driver_created_at_ms: i64, driver_id: i64, fields: Vec<models::DocumentField>, ) -> Document {
        Document {
            dispatch_job_id: None,
            notes: None,
            document_type: document_type,
            driver_created_at_ms: driver_created_at_ms,
            driver_id: driver_id,
            fields: fields,
            vehicle_id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentBase {
    /// ID of the Samsara dispatch job for which the document is submitted
    #[serde(rename = "dispatchJobId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dispatch_job_id: Option<i64>,

    /// Notes submitted with this document.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

}

impl DocumentBase {
    pub fn new() -> DocumentBase {
        DocumentBase {
            dispatch_job_id: None,
            notes: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentCreate {
    /// ID of the Samsara dispatch job for which the document is submitted
    #[serde(rename = "dispatchJobId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dispatch_job_id: Option<i64>,

    /// Notes submitted with this document.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// Universally unique identifier for the document type this document is being created for.
    #[serde(rename = "documentTypeUuid")]
    pub document_type_uuid: String,

    /// List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    #[serde(rename = "fields")]
    pub fields: Vec<models::DocumentField>,

}

impl DocumentCreate {
    pub fn new(document_type_uuid: String, fields: Vec<models::DocumentField>, ) -> DocumentCreate {
        DocumentCreate {
            dispatch_job_id: None,
            notes: None,
            document_type_uuid: document_type_uuid,
            fields: fields,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentField {
    /// Value of this field if this document field has valueType: ValueType_Number.
    #[serde(rename = "numberValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub number_value: Option<f64>,

    /// Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
    #[serde(rename = "photoValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub photo_value: Option<Vec<models::DocumentFieldCreatePhotoValue>>,

    /// Value of this field if this document field has valueType: ValueType_String.
    #[serde(rename = "stringValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub string_value: Option<String>,

    /// Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    #[serde(rename = "valueType")]
    pub value_type: String,

    /// Descriptive name of this field.
    #[serde(rename = "label")]
    pub label: String,

    /// DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<Object>,

}

impl DocumentField {
    pub fn new(value_type: String, label: String, ) -> DocumentField {
        DocumentField {
            number_value: None,
            photo_value: None,
            string_value: None,
            value_type: value_type,
            label: label,
            value: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentFieldCreate {
    /// Value of this field if this document field has valueType: ValueType_Number.
    #[serde(rename = "numberValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub number_value: Option<f64>,

    /// Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
    #[serde(rename = "photoValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub photo_value: Option<Vec<models::DocumentFieldCreatePhotoValue>>,

    /// Value of this field if this document field has valueType: ValueType_String.
    #[serde(rename = "stringValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub string_value: Option<String>,

    /// Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    #[serde(rename = "valueType")]
    pub value_type: String,

}

impl DocumentFieldCreate {
    pub fn new(value_type: String, ) -> DocumentFieldCreate {
        DocumentFieldCreate {
            number_value: None,
            photo_value: None,
            string_value: None,
            value_type: value_type,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentFieldCreatePhotoValue {
    /// Photo URL for a JPG image
    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url: Option<String>,

}

impl DocumentFieldCreatePhotoValue {
    pub fn new() -> DocumentFieldCreatePhotoValue {
        DocumentFieldCreatePhotoValue {
            url: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentFieldType {
    /// Descriptive name of this field type.
    #[serde(rename = "label")]
    pub label: String,

    #[serde(rename = "numberValueTypeMetadata")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub number_value_type_metadata: Option<models::DocumentFieldTypeNumberValueTypeMetadata>,

    /// The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    #[serde(rename = "valueType")]
    pub value_type: String,

}

impl DocumentFieldType {
    pub fn new(label: String, value_type: String, ) -> DocumentFieldType {
        DocumentFieldType {
            label: label,
            number_value_type_metadata: None,
            value_type: value_type,
        }
    }
}

/// Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentFieldTypeNumberValueTypeMetadata {
    /// Number of decimal places that values for this field type can have.
    #[serde(rename = "numDecimalPlaces")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub num_decimal_places: Option<i64>,

}

impl DocumentFieldTypeNumberValueTypeMetadata {
    pub fn new() -> DocumentFieldTypeNumberValueTypeMetadata {
        DocumentFieldTypeNumberValueTypeMetadata {
            num_decimal_places: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DocumentType {
    /// The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
    #[serde(rename = "fieldTypes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub field_types: Option<Vec<Vec<models::DocumentFieldType>>>,

    /// Name of the document type.
    #[serde(rename = "name")]
    pub name: String,

    /// ID for the organization this document belongs to.
    #[serde(rename = "orgId")]
    pub org_id: i64,

    /// Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
    #[serde(rename = "uuid")]
    pub uuid: String,

}

impl DocumentType {
    pub fn new(name: String, org_id: i64, uuid: String, ) -> DocumentType {
        DocumentType {
            field_types: None,
            name: name,
            org_id: org_id,
            uuid: uuid,
        }
    }
}

/// Contains the current door status of a sensor.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DoorResponse {
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::DoorResponseSensors>>,

}

impl DoorResponse {
    pub fn new() -> DoorResponse {
        DoorResponse {
            group_id: None,
            sensors: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DoorResponseSensors {
    /// Flag indicating whether the current door is closed or open.
    #[serde(rename = "doorClosed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub door_closed: Option<bool>,

    /// Name of the sensor.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// ID of the sensor.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

}

impl DoorResponseSensors {
    pub fn new() -> DoorResponseSensors {
        DoorResponseSensors {
            door_closed: None,
            name: None,
            id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Driver {
    /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    #[serde(rename = "eldAdverseWeatherExemptionEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_adverse_weather_exemption_enabled: Option<bool>,

    /// Flag indicating this driver may use Big Day excemptions in ELD logs.
    #[serde(rename = "eldBigDayExemptionEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_big_day_exemption_enabled: Option<bool>,

    /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    #[serde(rename = "eldDayStartHour")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_day_start_hour: Option<isize>,

    /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
    #[serde(rename = "eldExempt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_exempt: Option<bool>,

    /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    #[serde(rename = "eldExemptReason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_exempt_reason: Option<String>,

    /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    #[serde(rename = "eldPcEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_pc_enabled: Option<bool>,

    /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
    #[serde(rename = "eldYmEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_ym_enabled: Option<bool>,

    /// Dictionary of external IDs (string key-value pairs)
    #[serde(rename = "externalIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub external_ids: Option<HashMap<String, String>>,

    /// ID of the group if the organization has multiple groups (uncommon).
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Driver's state issued license number.
    #[serde(rename = "licenseNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub license_number: Option<String>,

    /// Abbreviation of state that issued driver's license.
    #[serde(rename = "licenseState")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub license_state: Option<String>,

    /// Driver's name.
    #[serde(rename = "name")]
    pub name: String,

    /// Notes about the driver.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// Driver's phone number. Please include only digits, ex. 4157771234
    #[serde(rename = "phone")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub phone: Option<String>,

    /// Driver's login username into the driver app.
    #[serde(rename = "username")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub username: Option<String>,

    /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

    /// ID of the driver.
    #[serde(rename = "id")]
    pub id: i64,

    /// True if the driver account has been deactivated.
    #[serde(rename = "isDeactivated")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_deactivated: Option<bool>,

    #[serde(rename = "tags")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tags: Option<Vec<models::TagMetadata>>,

}

impl Driver {
    pub fn new(name: String, id: i64, ) -> Driver {
        Driver {
            eld_adverse_weather_exemption_enabled: None,
            eld_big_day_exemption_enabled: None,
            eld_day_start_hour: None,
            eld_exempt: None,
            eld_exempt_reason: None,
            eld_pc_enabled: Some(false),
            eld_ym_enabled: Some(false),
            external_ids: None,
            group_id: None,
            license_number: None,
            license_state: None,
            name: name,
            notes: None,
            phone: None,
            username: None,
            vehicle_id: None,
            id: id,
            is_deactivated: None,
            tags: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriverBase {
    /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    #[serde(rename = "eldAdverseWeatherExemptionEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_adverse_weather_exemption_enabled: Option<bool>,

    /// Flag indicating this driver may use Big Day excemptions in ELD logs.
    #[serde(rename = "eldBigDayExemptionEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_big_day_exemption_enabled: Option<bool>,

    /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    #[serde(rename = "eldDayStartHour")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_day_start_hour: Option<isize>,

    /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
    #[serde(rename = "eldExempt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_exempt: Option<bool>,

    /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    #[serde(rename = "eldExemptReason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_exempt_reason: Option<String>,

    /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    #[serde(rename = "eldPcEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_pc_enabled: Option<bool>,

    /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
    #[serde(rename = "eldYmEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_ym_enabled: Option<bool>,

    /// Dictionary of external IDs (string key-value pairs)
    #[serde(rename = "externalIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub external_ids: Option<HashMap<String, String>>,

    /// ID of the group if the organization has multiple groups (uncommon).
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Driver's state issued license number.
    #[serde(rename = "licenseNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub license_number: Option<String>,

    /// Abbreviation of state that issued driver's license.
    #[serde(rename = "licenseState")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub license_state: Option<String>,

    /// Driver's name.
    #[serde(rename = "name")]
    pub name: String,

    /// Notes about the driver.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// Driver's phone number. Please include only digits, ex. 4157771234
    #[serde(rename = "phone")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub phone: Option<String>,

    /// Driver's login username into the driver app.
    #[serde(rename = "username")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub username: Option<String>,

    /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

}

impl DriverBase {
    pub fn new(name: String, ) -> DriverBase {
        DriverBase {
            eld_adverse_weather_exemption_enabled: None,
            eld_big_day_exemption_enabled: None,
            eld_day_start_hour: None,
            eld_exempt: None,
            eld_exempt_reason: None,
            eld_pc_enabled: Some(false),
            eld_ym_enabled: Some(false),
            external_ids: None,
            group_id: None,
            license_number: None,
            license_state: None,
            name: name,
            notes: None,
            phone: None,
            username: None,
            vehicle_id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriverDailyLogResponse {
    #[serde(rename = "days")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub days: Option<Vec<models::DriverDailyLogResponseDays>>,

}

impl DriverDailyLogResponse {
    pub fn new() -> DriverDailyLogResponse {
        DriverDailyLogResponse {
            days: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriverDailyLogResponseDays {
    /// Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
    #[serde(rename = "certifiedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub certified_at_ms: Option<i64>,

    /// End of the HOS day, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub end_ms: Option<isize>,

    /// End of the HOS day, specified in milliseconds UNIX time.
    #[serde(rename = "startMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_ms: Option<isize>,

    /// List of trailer ID's associated with the driver for the day.
    #[serde(rename = "trailerIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_ids: Option<Object>,

    /// Hours spent on duty or driving, rounded to two decimal places.
    #[serde(rename = "activeHours")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub active_hours: Option<f64>,

    /// Distance driven in miles, rounded to two decimal places.
    #[serde(rename = "distanceMiles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub distance_miles: Option<f64>,

    /// Milliseconds spent on duty or driving.
    #[serde(rename = "activeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub active_ms: Option<i64>,

    /// Whether this HOS day chart was certified by the driver.
    #[serde(rename = "certified")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub certified: Option<bool>,

    /// List of vehicle ID's associated with the driver for the day.
    #[serde(rename = "vehicleIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_ids: Option<Object>,

}

impl DriverDailyLogResponseDays {
    pub fn new() -> DriverDailyLogResponseDays {
        DriverDailyLogResponseDays {
            certified_at_ms: None,
            end_ms: None,
            start_ms: None,
            trailer_ids: None,
            active_hours: None,
            distance_miles: None,
            active_ms: None,
            certified: None,
            vehicle_ids: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriverForCreate {
    /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    #[serde(rename = "eldAdverseWeatherExemptionEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_adverse_weather_exemption_enabled: Option<bool>,

    /// Flag indicating this driver may use Big Day excemptions in ELD logs.
    #[serde(rename = "eldBigDayExemptionEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_big_day_exemption_enabled: Option<bool>,

    /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    #[serde(rename = "eldDayStartHour")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_day_start_hour: Option<isize>,

    /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
    #[serde(rename = "eldExempt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_exempt: Option<bool>,

    /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    #[serde(rename = "eldExemptReason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_exempt_reason: Option<String>,

    /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    #[serde(rename = "eldPcEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_pc_enabled: Option<bool>,

    /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
    #[serde(rename = "eldYmEnabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eld_ym_enabled: Option<bool>,

    /// Dictionary of external IDs (string key-value pairs)
    #[serde(rename = "externalIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub external_ids: Option<HashMap<String, String>>,

    /// ID of the group if the organization has multiple groups (uncommon).
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Driver's state issued license number.
    #[serde(rename = "licenseNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub license_number: Option<String>,

    /// Abbreviation of state that issued driver's license.
    #[serde(rename = "licenseState")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub license_state: Option<String>,

    /// Driver's name.
    #[serde(rename = "name")]
    pub name: String,

    /// Notes about the driver.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// Driver's phone number. Please include only digits, ex. 4157771234
    #[serde(rename = "phone")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub phone: Option<String>,

    /// Driver's login username into the driver app.
    #[serde(rename = "username")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub username: Option<String>,

    /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

    /// Driver's password for the driver app.
    #[serde(rename = "password")]
    pub password: String,

    /// A list of tag IDs.
    #[serde(rename = "tagIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tag_ids: Option<Vec<i64>>,

}

impl DriverForCreate {
    pub fn new(name: String, password: String, ) -> DriverForCreate {
        DriverForCreate {
            eld_adverse_weather_exemption_enabled: None,
            eld_big_day_exemption_enabled: None,
            eld_day_start_hour: None,
            eld_exempt: None,
            eld_exempt_reason: None,
            eld_pc_enabled: Some(false),
            eld_ym_enabled: Some(false),
            external_ids: None,
            group_id: None,
            license_number: None,
            license_state: None,
            name: name,
            notes: None,
            phone: None,
            username: None,
            vehicle_id: None,
            password: password,
            tag_ids: None,
        }
    }
}

/// Safety score details for a driver
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriverSafetyScoreResponse {
    /// Crash event count
    #[serde(rename = "crashCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub crash_count: Option<isize>,

    /// Driver ID
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<isize>,

    /// Harsh acceleration event count
    #[serde(rename = "harshAccelCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_accel_count: Option<isize>,

    /// Harsh braking event count
    #[serde(rename = "harshBrakingCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_braking_count: Option<isize>,

    #[serde(rename = "harshEvents")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_events: Option<Vec<models::SafetyReportHarshEvent>>,

    /// Harsh turning event count
    #[serde(rename = "harshTurningCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_turning_count: Option<isize>,

    /// Safety Score
    #[serde(rename = "safetyScore")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub safety_score: Option<isize>,

    /// Safety Score Rank
    #[serde(rename = "safetyScoreRank")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub safety_score_rank: Option<String>,

    /// Amount of time driven over the speed limit in milliseconds
    #[serde(rename = "timeOverSpeedLimitMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_over_speed_limit_ms: Option<isize>,

    /// Total distance driven in meters
    #[serde(rename = "totalDistanceDrivenMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_distance_driven_meters: Option<isize>,

    /// Total harsh event count
    #[serde(rename = "totalHarshEventCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_harsh_event_count: Option<isize>,

    /// Amount of time driven in milliseconds
    #[serde(rename = "totalTimeDrivenMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_time_driven_ms: Option<isize>,

}

impl DriverSafetyScoreResponse {
    pub fn new() -> DriverSafetyScoreResponse {
        DriverSafetyScoreResponse {
            crash_count: None,
            driver_id: None,
            harsh_accel_count: None,
            harsh_braking_count: None,
            harsh_events: None,
            harsh_turning_count: None,
            safety_score: None,
            safety_score_rank: None,
            time_over_speed_limit_ms: None,
            total_distance_driven_meters: None,
            total_harsh_event_count: None,
            total_time_driven_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriversResponse {
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::Driver>>,

}

impl DriversResponse {
    pub fn new() -> DriversResponse {
        DriversResponse {
            drivers: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriversSummaryResponse {
    #[serde(rename = "Summaries")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub summaries: Option<Vec<models::DriversSummaryResponseSummaries>>,

}

impl DriversSummaryResponse {
    pub fn new() -> DriversSummaryResponse {
        DriversSummaryResponse {
            summaries: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DriversSummaryResponseSummaries {
    /// ID of the driver.
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// Distance driven in miles, rounded to two decimal places.
    #[serde(rename = "distanceMiles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub distance_miles: Option<f64>,

    /// Duration in milliseconds that driver was driving during the requested time range
    #[serde(rename = "driveMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drive_ms: Option<i64>,

    /// Duration in milliseconds that driver was on duty or driving during the requested time range
    #[serde(rename = "activeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub active_ms: Option<i64>,

    /// Username of the driver.
    #[serde(rename = "driverUsername")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_username: Option<String>,

    /// Group of the driver.
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Name of the driver.
    #[serde(rename = "driverName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_name: Option<String>,

    /// Duration in milliseconds that driver was on duty during the requested time range
    #[serde(rename = "onDutyMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub on_duty_ms: Option<i64>,

}

impl DriversSummaryResponseSummaries {
    pub fn new() -> DriversSummaryResponseSummaries {
        DriversSummaryResponseSummaries {
            driver_id: None,
            distance_miles: None,
            drive_ms: None,
            active_ms: None,
            driver_username: None,
            group_id: None,
            driver_name: None,
            on_duty_ms: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirBase {
    #[serde(rename = "authorSignature")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub author_signature: Option<models::DvirBaseAuthorSignature>,

    /// Signifies if the defects on the vehicle corrected after the DVIR is done.
    #[serde(rename = "defectsCorrected")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub defects_corrected: Option<bool>,

    /// Signifies if the defects on this vehicle can be ignored.
    #[serde(rename = "defectsNeedNotBeCorrected")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub defects_need_not_be_corrected: Option<bool>,

    /// The id of this DVIR record.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

    /// Inspection type of the DVIR.
    #[serde(rename = "inspectionType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub inspection_type: Option<String>,

    /// The mechanics notes on the DVIR.
    #[serde(rename = "mechanicNotes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mechanic_notes: Option<String>,

    #[serde(rename = "mechanicOrAgentSignature")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mechanic_or_agent_signature: Option<models::DvirBaseMechanicOrAgentSignature>,

    #[serde(rename = "nextDriverSignature")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub next_driver_signature: Option<models::DvirBaseNextDriverSignature>,

    /// The odometer reading in miles for the vehicle when the DVIR was done.
    #[serde(rename = "odometerMiles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub odometer_miles: Option<i64>,

    /// Timestamp of this DVIR in UNIX milliseconds.
    #[serde(rename = "timeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_ms: Option<i64>,

    /// Defects registered for the trailer which was part of the DVIR.
    #[serde(rename = "trailerDefects")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_defects: Option<Vec<models::DvirBaseTrailerDefects>>,

    /// The id of the trailer which was part of the DVIR.
    #[serde(rename = "trailerId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_id: Option<isize>,

    /// The name of the trailer which was part of the DVIR.
    #[serde(rename = "trailerName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_name: Option<String>,

    #[serde(rename = "vehicle")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle: Option<models::DvirBaseVehicle>,

    /// The condition of vechile on which DVIR was done.
    #[serde(rename = "vehicleCondition")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_condition: Option<String>,

    /// Defects registered for the vehicle which was part of the DVIR.
    #[serde(rename = "vehicleDefects")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_defects: Option<Vec<models::DvirBaseTrailerDefects>>,

}

impl DvirBase {
    pub fn new() -> DvirBase {
        DvirBase {
            author_signature: None,
            defects_corrected: None,
            defects_need_not_be_corrected: None,
            id: None,
            inspection_type: None,
            mechanic_notes: None,
            mechanic_or_agent_signature: None,
            next_driver_signature: None,
            odometer_miles: None,
            time_ms: None,
            trailer_defects: None,
            trailer_id: None,
            trailer_name: None,
            vehicle: None,
            vehicle_condition: None,
            vehicle_defects: None,
        }
    }
}

/// The authors signature for the DVIR.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirBaseAuthorSignature {
    /// ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
    #[serde(rename = "mechanicUserId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mechanic_user_id: Option<i64>,

    /// ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// The name of the driver or mechanic who signed the DVIR.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The time in millis when the DVIR was signed
    #[serde(rename = "signedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signed_at: Option<i64>,

    /// Type corresponds to whether the signature corresponds to driver|mechanic.
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    /// Email of the  driver|mechanic who signed the DVIR.
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// Username of the  driver|mechanic who signed the DVIR.
    #[serde(rename = "username")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub username: Option<String>,

}

impl DvirBaseAuthorSignature {
    pub fn new() -> DvirBaseAuthorSignature {
        DvirBaseAuthorSignature {
            mechanic_user_id: None,
            driver_id: None,
            name: None,
            signed_at: None,
            _type: None,
            email: None,
            username: None,
        }
    }
}

/// The mechanic's or agent's signature for the DVIR.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirBaseMechanicOrAgentSignature {
    /// ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
    #[serde(rename = "mechanicUserId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mechanic_user_id: Option<i64>,

    /// ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// The name of the agent or mechanic who signed the DVIR.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The time in millis when the DVIR was signed
    #[serde(rename = "signedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signed_at: Option<i64>,

    /// Type corresponds to whether the signature corresponds to driver|mechanic.
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    /// Email of the  agent|mechanic who signed the DVIR.
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// Username of the  agent|mechanic who signed the DVIR.
    #[serde(rename = "username")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub username: Option<String>,

}

impl DvirBaseMechanicOrAgentSignature {
    pub fn new() -> DvirBaseMechanicOrAgentSignature {
        DvirBaseMechanicOrAgentSignature {
            mechanic_user_id: None,
            driver_id: None,
            name: None,
            signed_at: None,
            _type: None,
            email: None,
            username: None,
        }
    }
}

/// The next driver signature for the DVIR.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirBaseNextDriverSignature {
    /// ID of the driver who signed the DVIR
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// The name of the driver who signed the next DVIR on this vehicle.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The time in millis when the next driver signed the DVIR on this vehicle.
    #[serde(rename = "signedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signed_at: Option<i64>,

    /// Type corresponds to driver.
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    /// Email of the  driver who signed the next DVIR on this vehicle.
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// Username of the  driver who signed the next DVIR on this vehicle.
    #[serde(rename = "username")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub username: Option<String>,

}

impl DvirBaseNextDriverSignature {
    pub fn new() -> DvirBaseNextDriverSignature {
        DvirBaseNextDriverSignature {
            driver_id: None,
            name: None,
            signed_at: None,
            _type: None,
            email: None,
            username: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirBaseTrailerDefects {
    /// The comment describing the type of DVIR defect
    #[serde(rename = "comment")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub comment: Option<String>,

    /// The type of DVIR defect
    #[serde(rename = "defectType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub defect_type: Option<String>,

}

impl DvirBaseTrailerDefects {
    pub fn new() -> DvirBaseTrailerDefects {
        DvirBaseTrailerDefects {
            comment: None,
            defect_type: None,
        }
    }
}

/// The vehicle on which DVIR was done.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirBaseVehicle {
    /// The vehicle on which DVIR was done.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The vehicle id on which DVIR was done.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

}

impl DvirBaseVehicle {
    pub fn new() -> DvirBaseVehicle {
        DvirBaseVehicle {
            name: None,
            id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct DvirListResponse {
    #[serde(rename = "dvirs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dvirs: Option<Vec<models::DvirBase>>,

}

impl DvirListResponse {
    pub fn new() -> DvirListResponse {
        DvirListResponse {
            dvirs: None,
        }
    }
}

/// The state of the vehicle over time. State can be Running, Off, or Idle.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct EngineState {
    /// Timestamp in Unix epoch milliseconds.
    #[serde(rename = "timeMs")]
    pub time_ms: Object,

    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "value")]
    pub value: String,

}

impl EngineState {
    pub fn new(time_ms: Object, value: String, ) -> EngineState {
        EngineState {
            time_ms: time_ms,
            value: value,
        }
    }
}

/// Error message describing why the request failed.
#[derive(Debug, Clone, PartialEq, PartialOrd, Serialize, Deserialize)]

pub struct ErrorResponse(String);

impl ::std::convert::From<String> for ErrorResponse {
    fn from(x: String) -> Self {
        ErrorResponse(x)
    }
}

impl ::std::convert::From<ErrorResponse> for String {
    fn from(x: ErrorResponse) -> Self {
        x.0
    }
}

impl ::std::ops::Deref for ErrorResponse {
    type Target = String;
    fn deref(&self) -> &String {
        &self.0
    }
}

impl ::std::ops::DerefMut for ErrorResponse {
    fn deref_mut(&mut self) -> &mut String {
        &mut self.0
    }
}


/// Contains the location and speed of a vehicle at a particular time
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct FleetVehicleLocation {
    /// The latitude of the location in degrees.
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    /// The best effort (street,city,state) for the latitude and longitude.
    #[serde(rename = "location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub location: Option<String>,

    /// The longitude of the location in degrees.
    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

    /// The speed calculated from GPS that the asset was traveling at in miles per hour.
    #[serde(rename = "speedMilesPerHour")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub speed_miles_per_hour: Option<f64>,

    /// Time in Unix milliseconds since epoch when the asset was at the location.
    #[serde(rename = "timeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_ms: Option<i64>,

}

impl FleetVehicleLocation {
    pub fn new() -> FleetVehicleLocation {
        FleetVehicleLocation {
            latitude: None,
            location: None,
            longitude: None,
            speed_miles_per_hour: None,
            time_ms: None,
        }
    }
}

/// A vehicle object as returned for fleet/vehicle
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct FleetVehicleResponse {
    #[serde(rename = "externalIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub external_ids: Option<HashMap<String, String>>,

    /// Harsh event detection setting.
    #[serde(rename = "harshAccelSetting")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_accel_setting: Option<String>,

    /// ID of the vehicle.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the vehicle.
    #[serde(rename = "name")]
    pub name: String,

    #[serde(rename = "vehicleInfo")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_info: Option<models::FleetVehicleResponseVehicleInfo>,

}

impl FleetVehicleResponse {
    pub fn new(id: i64, name: String, ) -> FleetVehicleResponse {
        FleetVehicleResponse {
            external_ids: None,
            harsh_accel_setting: None,
            id: id,
            name: name,
            vehicle_info: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct FleetVehicleResponseVehicleInfo {
    /// Year of the vehicle.
    #[serde(rename = "year")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub year: Option<i64>,

    /// Model of the Vehicle.
    #[serde(rename = "model")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub model: Option<String>,

    /// Vehicle Identification Number.
    #[serde(rename = "vin")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vin: Option<String>,

    /// Make of the vehicle.
    #[serde(rename = "make")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub make: Option<String>,

}

impl FleetVehicleResponseVehicleInfo {
    pub fn new() -> FleetVehicleResponseVehicleInfo {
        FleetVehicleResponseVehicleInfo {
            year: None,
            model: None,
            vin: None,
            make: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HosAuthenticationLogsResponse {
    #[serde(rename = "authenticationLogs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub authentication_logs: Option<Vec<models::HosAuthenticationLogsResponseAuthenticationLogs>>,

}

impl HosAuthenticationLogsResponse {
    pub fn new() -> HosAuthenticationLogsResponse {
        HosAuthenticationLogsResponse {
            authentication_logs: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HosAuthenticationLogsResponseAuthenticationLogs {
    /// The log type - one of 'signin' or 'signout'
    #[serde(rename = "actionType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub action_type: Option<String>,

    /// Address at which the log was recorded, if applicable.
    #[serde(rename = "address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub address: Option<String>,

    /// City in which the log was recorded, if applicable.
    #[serde(rename = "city")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub city: Option<String>,

    /// The time at which the event was recorded in UNIX milliseconds.
    #[serde(rename = "happenedAtMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub happened_at_ms: Option<i64>,

    /// Address name from the group address book at which the log was recorded, if applicable.
    #[serde(rename = "addressName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub address_name: Option<String>,

    /// State in which the log was recorded, if applicable.
    #[serde(rename = "state")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub state: Option<String>,

}

impl HosAuthenticationLogsResponseAuthenticationLogs {
    pub fn new() -> HosAuthenticationLogsResponseAuthenticationLogs {
        HosAuthenticationLogsResponseAuthenticationLogs {
            action_type: None,
            address: None,
            city: None,
            happened_at_ms: None,
            address_name: None,
            state: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HosLogsResponse {
    #[serde(rename = "logs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logs: Option<Vec<models::HosLogsResponseLogs>>,

}

impl HosLogsResponse {
    pub fn new() -> HosLogsResponse {
        HosLogsResponse {
            logs: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HosLogsResponseLogs {
    /// Longitude at which the log was recorded.
    #[serde(rename = "locLng")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub loc_lng: Option<f64>,

    /// The time at which the log/HOS status started in UNIX milliseconds.
    #[serde(rename = "logStartMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub log_start_ms: Option<i64>,

    /// ID of the driver.
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    #[serde(rename = "statusType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status_type: Option<String>,

    /// City in which the log was recorded.
    #[serde(rename = "locCity")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub loc_city: Option<String>,

    /// ID of the group.
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// Name of location at which the log was recorded.
    #[serde(rename = "locName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub loc_name: Option<String>,

    /// Latitude at which the log was recorded.
    #[serde(rename = "locLat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub loc_lat: Option<f64>,

    /// Remark associated with the log entry.
    #[serde(rename = "remark")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub remark: Option<String>,

    /// State in which the log was recorded.
    #[serde(rename = "locState")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub loc_state: Option<String>,

    /// ID of the vehicle.
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<i64>,

    #[serde(rename = "codriverIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub codriver_ids: Option<Vec<i64>>,

}

impl HosLogsResponseLogs {
    pub fn new() -> HosLogsResponseLogs {
        HosLogsResponseLogs {
            loc_lng: None,
            log_start_ms: None,
            driver_id: None,
            status_type: None,
            loc_city: None,
            group_id: None,
            loc_name: None,
            loc_lat: None,
            remark: None,
            loc_state: None,
            vehicle_id: None,
            codriver_ids: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HosLogsSummaryResponse {
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::HosLogsSummaryResponseDrivers>>,

}

impl HosLogsSummaryResponse {
    pub fn new() -> HosLogsSummaryResponse {
        HosLogsSummaryResponse {
            drivers: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HosLogsSummaryResponseDrivers {
    /// The amount of time (in ms) remaining until the driver cannot drive without a rest break.
    #[serde(rename = "timeUntilBreak")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_until_break: Option<i64>,

    /// Name of the vehicle.
    #[serde(rename = "vehicleName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_name: Option<String>,

    /// The amount of driving time in violation today (in ms).
    #[serde(rename = "drivingInViolationToday")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driving_in_violation_today: Option<i64>,

    /// ID of the driver.
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<i64>,

    /// The amount of remaining cycle time (in ms).
    #[serde(rename = "cycleRemaining")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cycle_remaining: Option<i64>,

    /// Name of the driver.
    #[serde(rename = "driverName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_name: Option<String>,

    /// The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    #[serde(rename = "dutyStatus")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub duty_status: Option<String>,

    /// The amount of cycle time (in ms) available tomorrow.
    #[serde(rename = "cycleTomorrow")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cycle_tomorrow: Option<i64>,

    /// The amount of remaining shift drive time (in ms).
    #[serde(rename = "shiftDriveRemaining")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub shift_drive_remaining: Option<i64>,

    /// The amount of time (in ms) that the driver has been in the current `dutyStatus`.
    #[serde(rename = "timeInCurrentStatus")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_in_current_status: Option<i64>,

    /// The amount of driving time in violation in this cycle (in ms).
    #[serde(rename = "drivingInViolationCycle")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driving_in_violation_cycle: Option<i64>,

    /// The amount of remaining shift time (in ms).
    #[serde(rename = "shiftRemaining")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub shift_remaining: Option<i64>,

}

impl HosLogsSummaryResponseDrivers {
    pub fn new() -> HosLogsSummaryResponseDrivers {
        HosLogsSummaryResponseDrivers {
            time_until_break: None,
            vehicle_name: None,
            driving_in_violation_today: None,
            driver_id: None,
            cycle_remaining: None,
            driver_name: None,
            duty_status: None,
            cycle_tomorrow: None,
            shift_drive_remaining: None,
            time_in_current_status: None,
            driving_in_violation_cycle: None,
            shift_remaining: None,
        }
    }
}

/// Contains the current humidity of a sensor.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HumidityResponse {
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::HumidityResponseSensors>>,

}

impl HumidityResponse {
    pub fn new() -> HumidityResponse {
        HumidityResponse {
            group_id: None,
            sensors: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct HumidityResponseSensors {
    /// Name of the sensor.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Currently reported relative humidity in percent, from 0-100.
    #[serde(rename = "humidity")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub humidity: Option<isize>,

    /// ID of the sensor.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

}

impl HumidityResponseSensors {
    pub fn new() -> HumidityResponseSensors {
        HumidityResponseSensors {
            name: None,
            humidity: None,
            id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject {
    #[serde(rename = "addresses")]
    pub addresses: Vec<models::AddressesAddresses>,

}

impl InlineObject {
    pub fn new(addresses: Vec<models::AddressesAddresses>, ) -> InlineObject {
        InlineObject {
            addresses: addresses,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject1 {
    /// A list of IDs for contact book entries.
    #[serde(rename = "contactIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub contact_ids: Option<Vec<i64>>,

    /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
    #[serde(rename = "formattedAddress")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub formatted_address: Option<String>,

    #[serde(rename = "geofence")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub geofence: Option<models::AddressGeofence>,

    /// The name of this address/geofence
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Notes associated with an address.
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

    /// A list of tag IDs.
    #[serde(rename = "tagIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tag_ids: Option<Vec<i64>>,

}

impl InlineObject1 {
    pub fn new() -> InlineObject1 {
        InlineObject1 {
            contact_ids: None,
            formatted_address: None,
            geofence: None,
            name: None,
            notes: None,
            tag_ids: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject10 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject10 {
    pub fn new(group_id: i64, ) -> InlineObject10 {
        InlineObject10 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject11 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject11 {
    pub fn new(group_id: i64, ) -> InlineObject11 {
        InlineObject11 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject12 {
    /// Only type 'mechanic' is currently accepted.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "inspectionType")]
    pub inspection_type: String,

    /// Any notes from the mechanic.
    #[serde(rename = "mechanicNotes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mechanic_notes: Option<String>,

    /// The current odometer of the vehicle.
    #[serde(rename = "odometerMiles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub odometer_miles: Option<isize>,

    /// Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    #[serde(rename = "previousDefectsCorrected")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub previous_defects_corrected: Option<bool>,

    /// Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    #[serde(rename = "previousDefectsIgnored")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub previous_defects_ignored: Option<bool>,

    /// Whether or not this vehicle or trailer is safe to drive.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "safe")]
    pub safe: String,

    /// Id of trailer being inspected. Either vehicleId or trailerId must be provided.
    #[serde(rename = "trailerId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trailer_id: Option<isize>,

    /// The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
    #[serde(rename = "userEmail")]
    pub user_email: String,

    /// Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<isize>,

}

impl InlineObject12 {
    pub fn new(inspection_type: String, safe: String, user_email: String, ) -> InlineObject12 {
        InlineObject12 {
            inspection_type: inspection_type,
            mechanic_notes: None,
            odometer_miles: None,
            previous_defects_corrected: None,
            previous_defects_ignored: None,
            safe: safe,
            trailer_id: None,
            user_email: user_email,
            vehicle_id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject13 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject13 {
    pub fn new(group_id: i64, ) -> InlineObject13 {
        InlineObject13 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject14 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    #[serde(rename = "vehicles")]
    pub vehicles: Vec<models::Vehicle>,

}

impl InlineObject14 {
    pub fn new(group_id: i64, vehicles: Vec<models::Vehicle>, ) -> InlineObject14 {
        InlineObject14 {
            group_id: group_id,
            vehicles: vehicles,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject15 {
    /// End of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    pub end_ms: isize,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
    #[serde(rename = "startMs")]
    pub start_ms: isize,

    /// Vehicle ID to query.
    #[serde(rename = "vehicleId")]
    pub vehicle_id: i64,

}

impl InlineObject15 {
    pub fn new(end_ms: isize, group_id: i64, start_ms: isize, vehicle_id: i64, ) -> InlineObject15 {
        InlineObject15 {
            end_ms: end_ms,
            group_id: group_id,
            start_ms: start_ms,
            vehicle_id: vehicle_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject16 {
    #[serde(rename = "externalIds")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub external_ids: Option<HashMap<String, String>>,

    /// Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
    #[serde(rename = "harsh_accel_setting")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_accel_setting: Option<isize>,

    /// Name
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl InlineObject16 {
    pub fn new() -> InlineObject16 {
        InlineObject16 {
            external_ids: None,
            harsh_accel_setting: None,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject17 {
    /// End of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    pub end_ms: isize,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// Beginning of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "startMs")]
    pub start_ms: isize,

}

impl InlineObject17 {
    pub fn new(end_ms: isize, group_id: i64, start_ms: isize, ) -> InlineObject17 {
        InlineObject17 {
            end_ms: end_ms,
            group_id: group_id,
            start_ms: start_ms,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject18 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject18 {
    pub fn new(group_id: i64, ) -> InlineObject18 {
        InlineObject18 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject19 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// List of sensor IDs to query.
    #[serde(rename = "sensors")]
    pub sensors: Vec<i64>,

}

impl InlineObject19 {
    pub fn new(group_id: i64, sensors: Vec<i64>, ) -> InlineObject19 {
        InlineObject19 {
            group_id: group_id,
            sensors: sensors,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject2 {
    /// The address of the entry to add, as it would be recognized if provided to maps.google.com.
    #[serde(rename = "address")]
    pub address: String,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// Name of the location to add to the address book.
    #[serde(rename = "name")]
    pub name: String,

    /// Radius in meters of the address (used for matching vehicle trip stops to this location).
    #[serde(rename = "radius")]
    pub radius: isize,

}

impl InlineObject2 {
    pub fn new(address: String, group_id: i64, name: String, radius: isize, ) -> InlineObject2 {
        InlineObject2 {
            address: address,
            group_id: group_id,
            name: name,
            radius: radius,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject20 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// List of sensor IDs to query.
    #[serde(rename = "sensors")]
    pub sensors: Vec<i64>,

}

impl InlineObject20 {
    pub fn new(group_id: i64, sensors: Vec<i64>, ) -> InlineObject20 {
        InlineObject20 {
            group_id: group_id,
            sensors: sensors,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject21 {
    /// End of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    pub end_ms: isize,

    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "fillMissing")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fill_missing: Option<String>,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    #[serde(rename = "series")]
    pub series: Vec<models::SensorsHistorySeries>,

    /// Beginning of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "startMs")]
    pub start_ms: isize,

    /// Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
    #[serde(rename = "stepMs")]
    pub step_ms: isize,

}

impl InlineObject21 {
    pub fn new(end_ms: isize, group_id: i64, series: Vec<models::SensorsHistorySeries>, start_ms: isize, step_ms: isize, ) -> InlineObject21 {
        InlineObject21 {
            end_ms: end_ms,
            fill_missing: Some("withNull".to_string()),
            group_id: group_id,
            series: series,
            start_ms: start_ms,
            step_ms: step_ms,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject22 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// List of sensor IDs to query.
    #[serde(rename = "sensors")]
    pub sensors: Vec<i64>,

}

impl InlineObject22 {
    pub fn new(group_id: i64, sensors: Vec<i64>, ) -> InlineObject22 {
        InlineObject22 {
            group_id: group_id,
            sensors: sensors,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject23 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject23 {
    pub fn new(group_id: i64, ) -> InlineObject23 {
        InlineObject23 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject24 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// List of sensor IDs to query.
    #[serde(rename = "sensors")]
    pub sensors: Vec<i64>,

}

impl InlineObject24 {
    pub fn new(group_id: i64, sensors: Vec<i64>, ) -> InlineObject24 {
        InlineObject24 {
            group_id: group_id,
            sensors: sensors,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject3 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject3 {
    pub fn new(group_id: i64, ) -> InlineObject3 {
        InlineObject3 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject4 {
    /// True indicates that this driver should be reactivated.
    #[serde(rename = "reactivate")]
    pub reactivate: bool,

}

impl InlineObject4 {
    pub fn new(reactivate: bool, ) -> InlineObject4 {
        InlineObject4 {
            reactivate: reactivate,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject5 {
    /// End time (ms) of queried time period.
    #[serde(rename = "endMs")]
    pub end_ms: i64,

    /// Org ID to query.
    #[serde(rename = "orgId")]
    pub org_id: i64,

    /// Start time (ms) of queried time period.
    #[serde(rename = "startMs")]
    pub start_ms: i64,

}

impl InlineObject5 {
    pub fn new(end_ms: i64, org_id: i64, start_ms: i64, ) -> InlineObject5 {
        InlineObject5 {
            end_ms: end_ms,
            org_id: org_id,
            start_ms: start_ms,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject6 {
    /// Driver ID to query.
    #[serde(rename = "driverId")]
    pub driver_id: i64,

    /// End of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    pub end_ms: isize,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// Beginning of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "startMs")]
    pub start_ms: isize,

}

impl InlineObject6 {
    pub fn new(driver_id: i64, end_ms: isize, group_id: i64, start_ms: isize, ) -> InlineObject6 {
        InlineObject6 {
            driver_id: driver_id,
            end_ms: end_ms,
            group_id: group_id,
            start_ms: start_ms,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject7 {
    /// Driver ID to query.
    #[serde(rename = "driverId")]
    pub driver_id: i64,

    /// End of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    pub end_ms: isize,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// Beginning of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "startMs")]
    pub start_ms: isize,

}

impl InlineObject7 {
    pub fn new(driver_id: i64, end_ms: isize, group_id: i64, start_ms: isize, ) -> InlineObject7 {
        InlineObject7 {
            driver_id: driver_id,
            end_ms: end_ms,
            group_id: group_id,
            start_ms: start_ms,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject8 {
    /// Driver ID to query.
    #[serde(rename = "driverId")]
    pub driver_id: i64,

    /// End of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "endMs")]
    pub end_ms: isize,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

    /// Beginning of the time range, specified in milliseconds UNIX time.
    #[serde(rename = "startMs")]
    pub start_ms: isize,

}

impl InlineObject8 {
    pub fn new(driver_id: i64, end_ms: isize, group_id: i64, start_ms: isize, ) -> InlineObject8 {
        InlineObject8 {
            driver_id: driver_id,
            end_ms: end_ms,
            group_id: group_id,
            start_ms: start_ms,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject9 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    pub group_id: i64,

}

impl InlineObject9 {
    pub fn new(group_id: i64, ) -> InlineObject9 {
        InlineObject9 {
            group_id: group_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse200 {
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::Asset>>,

}

impl InlineResponse200 {
    pub fn new() -> InlineResponse200 {
        InlineResponse200 {
            assets: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2001 {
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::AssetCurrentLocationsResponse>>,

}

impl InlineResponse2001 {
    pub fn new() -> InlineResponse2001 {
        InlineResponse2001 {
            assets: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2002 {
    #[serde(rename = "pagination")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pagination: Option<models::Pagination>,

    /// Group ID to query.
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::Vehicle>>,

}

impl InlineResponse2002 {
    pub fn new() -> InlineResponse2002 {
        InlineResponse2002 {
            pagination: None,
            group_id: None,
            vehicles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2003 {
    /// Group ID to query.
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::VehicleLocation>>,

}

impl InlineResponse2003 {
    pub fn new() -> InlineResponse2003 {
        InlineResponse2003 {
            group_id: None,
            vehicles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2004 {
    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::VehicleMaintenance>>,

}

impl InlineResponse2004 {
    pub fn new() -> InlineResponse2004 {
        InlineResponse2004 {
            vehicles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2005 {
    #[serde(rename = "pagination")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pagination: Option<models::Pagination>,

    #[serde(rename = "vehicleStats")]
    pub vehicle_stats: Vec<models::InlineResponse2005VehicleStats>,

}

impl InlineResponse2005 {
    pub fn new(vehicle_stats: Vec<models::InlineResponse2005VehicleStats>, ) -> InlineResponse2005 {
        InlineResponse2005 {
            pagination: None,
            vehicle_stats: vehicle_stats,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2005VehicleStats {
    #[serde(rename = "engineState")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub engine_state: Option<Vec<models::EngineState>>,

    #[serde(rename = "auxInput2")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aux_input2: Option<models::AuxInputSeries>,

    /// ID of the vehicle.
    #[serde(rename = "vehicleId")]
    pub vehicle_id: i64,

    #[serde(rename = "auxInput1")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aux_input1: Option<models::AuxInputSeries>,

}

impl InlineResponse2005VehicleStats {
    pub fn new(vehicle_id: i64, ) -> InlineResponse2005VehicleStats {
        InlineResponse2005VehicleStats {
            engine_state: None,
            aux_input2: None,
            vehicle_id: vehicle_id,
            aux_input1: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2006 {
    #[serde(rename = "dataInputs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_inputs: Option<Vec<models::DataInputHistoryResponse>>,

}

impl InlineResponse2006 {
    pub fn new() -> InlineResponse2006 {
        InlineResponse2006 {
            data_inputs: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2007 {
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::Machine>>,

}

impl InlineResponse2007 {
    pub fn new() -> InlineResponse2007 {
        InlineResponse2007 {
            machines: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2008 {
    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::Sensor>>,

}

impl InlineResponse2008 {
    pub fn new() -> InlineResponse2008 {
        InlineResponse2008 {
            sensors: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse2009 {
    #[serde(rename = "tags")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tags: Option<Vec<models::Tag>>,

}

impl InlineResponse2009 {
    pub fn new() -> InlineResponse2009 {
        InlineResponse2009 {
            tags: None,
        }
    }
}

/// The current state of the dispatch job.
/// Enumeration of values.
/// Since this enum's variants do not hold data, we can easily define them them as `#[repr(C)]`
/// which helps with FFI.
#[allow(non_camel_case_types)]
#[repr(C)]
#[derive(Debug, Clone, Copy, PartialEq, PartialOrd, Serialize, Deserialize, Eq, Ord)]
pub enum JobStatus { 
    #[serde(rename = "JobState_Unassigned")]
    UNASSIGNED,
    #[serde(rename = "JobState_Scheduled")]
    SCHEDULED,
    #[serde(rename = "JobState_EnRoute")]
    ENROUTE,
    #[serde(rename = "JobState_Arrived")]
    ARRIVED,
    #[serde(rename = "JobState_Completed")]
    COMPLETED,
    #[serde(rename = "JobState_Skipped")]
    SKIPPED,
}

impl ::std::fmt::Display for JobStatus {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        match *self { 
            JobStatus::UNASSIGNED => write!(f, "{}", "JobState_Unassigned"),
            JobStatus::SCHEDULED => write!(f, "{}", "JobState_Scheduled"),
            JobStatus::ENROUTE => write!(f, "{}", "JobState_EnRoute"),
            JobStatus::ARRIVED => write!(f, "{}", "JobState_Arrived"),
            JobStatus::COMPLETED => write!(f, "{}", "JobState_Completed"),
            JobStatus::SKIPPED => write!(f, "{}", "JobState_Skipped"),
        }
    }
}

impl ::std::str::FromStr for JobStatus {
    type Err = ();
    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "JobState_Unassigned" => Ok(JobStatus::UNASSIGNED),
            "JobState_Scheduled" => Ok(JobStatus::SCHEDULED),
            "JobState_EnRoute" => Ok(JobStatus::ENROUTE),
            "JobState_Arrived" => Ok(JobStatus::ARRIVED),
            "JobState_Completed" => Ok(JobStatus::COMPLETED),
            "JobState_Skipped" => Ok(JobStatus::SKIPPED),
            _ => Err(()),
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct JobUpdateObject {
    /// Timestamp that this event was updated, represented as Unix milliseconds since epoch.
    #[serde(rename = "changed_at_ms")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_at_ms: Option<i64>,

    /// ID of the Samsara job.
    #[serde(rename = "job_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub job_id: Option<i64>,

    #[serde(rename = "job_state")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub job_state: Option<models::JobStatus>,

    #[serde(rename = "prev_job_state")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub prev_job_state: Option<models::PrevJobStatus>,

    #[serde(rename = "route")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub route: Option<models::DispatchRoute>,

    /// ID of the Samsara dispatch route.
    #[serde(rename = "route_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub route_id: Option<i64>,

}

impl JobUpdateObject {
    pub fn new() -> JobUpdateObject {
        JobUpdateObject {
            changed_at_ms: None,
            job_id: None,
            job_state: None,
            prev_job_state: None,
            route: None,
            route_id: None,
        }
    }
}

/// Contains information about a machine.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Machine {
    /// ID of the machine.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the machine.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Notes about the machine
    #[serde(rename = "notes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub notes: Option<String>,

}

impl Machine {
    pub fn new(id: i64, ) -> Machine {
        Machine {
            id: id,
            name: None,
            notes: None,
        }
    }
}

/// Contains the results for a machine history request
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct MachineHistoryResponse {
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::MachineHistoryResponseMachines>>,

}

impl MachineHistoryResponse {
    pub fn new() -> MachineHistoryResponse {
        MachineHistoryResponse {
            machines: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct MachineHistoryResponseMachines {
    /// Machine name
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Machine ID
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
    #[serde(rename = "vibrations")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vibrations: Option<Vec<models::MachineHistoryResponseVibrations>>,

}

impl MachineHistoryResponseMachines {
    pub fn new() -> MachineHistoryResponseMachines {
        MachineHistoryResponseMachines {
            name: None,
            id: None,
            vibrations: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct MachineHistoryResponseVibrations {
    #[serde(rename = "X")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub x: Option<f64>,

    #[serde(rename = "Y")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub y: Option<f64>,

    #[serde(rename = "Z")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub z: Option<f64>,

    #[serde(rename = "time")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<i64>,

}

impl MachineHistoryResponseVibrations {
    pub fn new() -> MachineHistoryResponseVibrations {
        MachineHistoryResponseVibrations {
            x: None,
            y: None,
            z: None,
            time: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Pagination {
    /// Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
    #[serde(rename = "endCursor")]
    pub end_cursor: String,

    /// True if there are more pages of results after this response.
    #[serde(rename = "hasNextPage")]
    pub has_next_page: bool,

    /// True if there are more pages of results before this response.
    #[serde(rename = "hasPrevPage")]
    pub has_prev_page: bool,

    /// Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
    #[serde(rename = "startCursor")]
    pub start_cursor: String,

}

impl Pagination {
    pub fn new(end_cursor: String, has_next_page: bool, has_prev_page: bool, start_cursor: String, ) -> Pagination {
        Pagination {
            end_cursor: end_cursor,
            has_next_page: has_next_page,
            has_prev_page: has_prev_page,
            start_cursor: start_cursor,
        }
    }
}

/// The previous state of the dispatch job.
/// Enumeration of values.
/// Since this enum's variants do not hold data, we can easily define them them as `#[repr(C)]`
/// which helps with FFI.
#[allow(non_camel_case_types)]
#[repr(C)]
#[derive(Debug, Clone, Copy, PartialEq, PartialOrd, Serialize, Deserialize, Eq, Ord)]
pub enum PrevJobStatus { 
    #[serde(rename = "JobState_Unassigned")]
    UNASSIGNED,
    #[serde(rename = "JobState_Scheduled")]
    SCHEDULED,
    #[serde(rename = "JobState_EnRoute")]
    ENROUTE,
    #[serde(rename = "JobState_Arrived")]
    ARRIVED,
    #[serde(rename = "JobState_Completed")]
    COMPLETED,
    #[serde(rename = "JobState_Skipped")]
    SKIPPED,
}

impl ::std::fmt::Display for PrevJobStatus {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        match *self { 
            PrevJobStatus::UNASSIGNED => write!(f, "{}", "JobState_Unassigned"),
            PrevJobStatus::SCHEDULED => write!(f, "{}", "JobState_Scheduled"),
            PrevJobStatus::ENROUTE => write!(f, "{}", "JobState_EnRoute"),
            PrevJobStatus::ARRIVED => write!(f, "{}", "JobState_Arrived"),
            PrevJobStatus::COMPLETED => write!(f, "{}", "JobState_Completed"),
            PrevJobStatus::SKIPPED => write!(f, "{}", "JobState_Skipped"),
        }
    }
}

impl ::std::str::FromStr for PrevJobStatus {
    type Err = ();
    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "JobState_Unassigned" => Ok(PrevJobStatus::UNASSIGNED),
            "JobState_Scheduled" => Ok(PrevJobStatus::SCHEDULED),
            "JobState_EnRoute" => Ok(PrevJobStatus::ENROUTE),
            "JobState_Arrived" => Ok(PrevJobStatus::ARRIVED),
            "JobState_Completed" => Ok(PrevJobStatus::COMPLETED),
            "JobState_Skipped" => Ok(PrevJobStatus::SKIPPED),
            _ => Err(()),
        }
    }
}

/// List of harsh events
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SafetyReportHarshEvent {
    /// Type of the harsh event
    #[serde(rename = "harshEventType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_event_type: Option<String>,

    /// Timestamp that the harsh event occurred in Unix milliseconds since epoch
    #[serde(rename = "timestampMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp_ms: Option<isize>,

    /// Vehicle associated with the harsh event
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<isize>,

}

impl SafetyReportHarshEvent {
    pub fn new() -> SafetyReportHarshEvent {
        SafetyReportHarshEvent {
            harsh_event_type: None,
            timestamp_ms: None,
            vehicle_id: None,
        }
    }
}

/// Contains information about a sensor.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Sensor {
    /// ID of the sensor.
    #[serde(rename = "id")]
    pub id: i64,

    /// MAC address of the sensor.
    #[serde(rename = "macAddress")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mac_address: Option<String>,

    /// Name of the sensor.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl Sensor {
    pub fn new(id: i64, ) -> Sensor {
        Sensor {
            id: id,
            mac_address: None,
            name: None,
        }
    }
}

/// Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SensorHistoryResponse {
    #[serde(rename = "results")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub results: Option<Vec<models::SensorHistoryResponseResults>>,

}

impl SensorHistoryResponse {
    pub fn new() -> SensorHistoryResponse {
        SensorHistoryResponse {
            results: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SensorHistoryResponseResults {
    /// List of datapoints, one for each requested (sensor, field) pair.
    #[serde(rename = "series")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub series: Option<Vec<i64>>,

    /// Timestamp in UNIX milliseconds.
    #[serde(rename = "timeMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_ms: Option<isize>,

}

impl SensorHistoryResponseResults {
    pub fn new() -> SensorHistoryResponseResults {
        SensorHistoryResponseResults {
            series: None,
            time_ms: None,
        }
    }
}

/// Sensor ID and field to query.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SensorsHistorySeries {
    /// Field to query.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "field")]
    pub field: String,

    /// Sensor ID to query.
    #[serde(rename = "widgetId")]
    pub widget_id: i64,

}

impl SensorsHistorySeries {
    pub fn new(field: String, widget_id: i64, ) -> SensorsHistorySeries {
        SensorsHistorySeries {
            field: field,
            widget_id: widget_id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Tag {
    /// The addresses that belong to this tag.
    #[serde(rename = "addresses")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub addresses: Option<Vec<models::TaggedAddress>>,

    /// The assets that belong to this tag.
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::TaggedAsset>>,

    /// The drivers that belong to this tag.
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::TaggedDriver>>,

    /// The GroupID that this tag belongs to.
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    /// The ID of this tag.
    #[serde(rename = "id")]
    pub id: i64,

    /// The machines that belong to this tag.
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::TaggedMachine>>,

    /// Name of this tag.
    #[serde(rename = "name")]
    pub name: String,

    /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    #[serde(rename = "parentTagId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub parent_tag_id: Option<i64>,

    /// The sensors that belong to this tag.
    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::TaggedSensor>>,

    /// The vehicles that belong to this tag.
    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::TaggedVehicle>>,

}

impl Tag {
    pub fn new(id: i64, name: String, ) -> Tag {
        Tag {
            addresses: None,
            assets: None,
            drivers: None,
            group_id: None,
            id: id,
            machines: None,
            name: name,
            parent_tag_id: None,
            sensors: None,
            vehicles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TagCreate {
    /// The assets that belong to this tag.
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::TaggedAssetBase>>,

    /// The drivers that belong to this tag.
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::TaggedDriverBase>>,

    /// The machines that belong to this tag.
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::TaggedMachineBase>>,

    /// Name of this tag.
    #[serde(rename = "name")]
    pub name: String,

    /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    #[serde(rename = "parentTagId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub parent_tag_id: Option<i64>,

    /// The sensors that belong to this tag.
    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::TaggedSensorBase>>,

    /// The vehicles that belong to this tag.
    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::TaggedVehicleBase>>,

}

impl TagCreate {
    pub fn new(name: String, ) -> TagCreate {
        TagCreate {
            assets: None,
            drivers: None,
            machines: None,
            name: name,
            parent_tag_id: None,
            sensors: None,
            vehicles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TagMetadata {
    /// The ID of this tag.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of this tag.
    #[serde(rename = "name")]
    pub name: String,

}

impl TagMetadata {
    pub fn new(id: i64, name: String, ) -> TagMetadata {
        TagMetadata {
            id: id,
            name: name,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TagModify {
    #[serde(rename = "add")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub add: Option<models::TagModifyAdd>,

    #[serde(rename = "delete")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub delete: Option<models::TagModifyDelete>,

    /// Updated name of this tag.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    #[serde(rename = "parentTagId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub parent_tag_id: Option<i64>,

}

impl TagModify {
    pub fn new() -> TagModify {
        TagModify {
            add: None,
            delete: None,
            name: None,
            parent_tag_id: None,
        }
    }
}

/// Specify devices, etc. that should be added to the tag.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TagModifyAdd {
    /// The assets to be added to this tag.
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::TaggedAssetBase>>,

    /// The sensors to be added to this tag.
    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::TaggedSensorBase>>,

    /// The vehicles to be added to this tag.
    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::TaggedVehicleBase>>,

    /// The machines to be added to this tag.
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::TaggedMachineBase>>,

    /// The drivers to be added to this tag.
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::TaggedDriverBase>>,

}

impl TagModifyAdd {
    pub fn new() -> TagModifyAdd {
        TagModifyAdd {
            assets: None,
            sensors: None,
            vehicles: None,
            machines: None,
            drivers: None,
        }
    }
}

/// Specify devices, etc. that should be removed from the tag.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TagModifyDelete {
    /// The assets to be removed from this tag.
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::TaggedAssetBase>>,

    /// The sensors to be removed from this tag.
    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::TaggedSensorBase>>,

    /// The vehicles to be removed from this tag.
    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::TaggedVehicleBase>>,

    /// The machines to be removed from this tag.
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::TaggedMachineBase>>,

    /// The drivers to be removed from this tag.
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::TaggedDriverBase>>,

}

impl TagModifyDelete {
    pub fn new() -> TagModifyDelete {
        TagModifyDelete {
            assets: None,
            sensors: None,
            vehicles: None,
            machines: None,
            drivers: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TagUpdate {
    /// The assets that belong to this tag.
    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<Vec<models::TaggedAssetBase>>,

    /// The drivers that belong to this tag.
    #[serde(rename = "drivers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub drivers: Option<Vec<models::TaggedDriverBase>>,

    /// The machines that belong to this tag.
    #[serde(rename = "machines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub machines: Option<Vec<models::TaggedMachineBase>>,

    /// Updated name of this tag.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    #[serde(rename = "parentTagId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub parent_tag_id: Option<i64>,

    /// The sensors that belong to this tag.
    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::TaggedSensorBase>>,

    /// The vehicles that belong to this tag.
    #[serde(rename = "vehicles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicles: Option<Vec<models::TaggedVehicleBase>>,

}

impl TagUpdate {
    pub fn new() -> TagUpdate {
        TagUpdate {
            assets: None,
            drivers: None,
            machines: None,
            name: None,
            parent_tag_id: None,
            sensors: None,
            vehicles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedAddress {
    /// The ID of the address being tagged.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the address being tagged.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl TaggedAddress {
    pub fn new(id: i64, ) -> TaggedAddress {
        TaggedAddress {
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedAddressBase {
    /// The ID of the address being tagged.
    #[serde(rename = "id")]
    pub id: i64,

}

impl TaggedAddressBase {
    pub fn new(id: i64, ) -> TaggedAddressBase {
        TaggedAddressBase {
            id: id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedAsset {
    /// The ID of the Asset being tagged.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the Asset being tagged.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl TaggedAsset {
    pub fn new(id: i64, ) -> TaggedAsset {
        TaggedAsset {
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedAssetBase {
    /// The ID of the Asset being tagged.
    #[serde(rename = "id")]
    pub id: i64,

}

impl TaggedAssetBase {
    pub fn new(id: i64, ) -> TaggedAssetBase {
        TaggedAssetBase {
            id: id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedDriver {
    /// The ID of the Driver being tagged.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the Driver being tagged.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl TaggedDriver {
    pub fn new(id: i64, ) -> TaggedDriver {
        TaggedDriver {
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedDriverBase {
    /// The ID of the Driver being tagged.
    #[serde(rename = "id")]
    pub id: i64,

}

impl TaggedDriverBase {
    pub fn new(id: i64, ) -> TaggedDriverBase {
        TaggedDriverBase {
            id: id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedMachine {
    /// The ID of the Machine being tagged.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the Machine being tagged.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl TaggedMachine {
    pub fn new(id: i64, ) -> TaggedMachine {
        TaggedMachine {
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedMachineBase {
    /// The ID of the Machine being tagged.
    #[serde(rename = "id")]
    pub id: i64,

}

impl TaggedMachineBase {
    pub fn new(id: i64, ) -> TaggedMachineBase {
        TaggedMachineBase {
            id: id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedSensor {
    /// The ID of the Sensor being tagged.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the Sensor being tagged.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl TaggedSensor {
    pub fn new(id: i64, ) -> TaggedSensor {
        TaggedSensor {
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedSensorBase {
    /// The ID of the Sensor being tagged.
    #[serde(rename = "id")]
    pub id: i64,

}

impl TaggedSensorBase {
    pub fn new(id: i64, ) -> TaggedSensorBase {
        TaggedSensorBase {
            id: id,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedVehicle {
    /// The ID of the Vehicle being tagged.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the Vehicle being tagged.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl TaggedVehicle {
    pub fn new(id: i64, ) -> TaggedVehicle {
        TaggedVehicle {
            id: id,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TaggedVehicleBase {
    /// The ID of the Vehicle being tagged.
    #[serde(rename = "id")]
    pub id: i64,

}

impl TaggedVehicleBase {
    pub fn new(id: i64, ) -> TaggedVehicleBase {
        TaggedVehicleBase {
            id: id,
        }
    }
}

/// Contains the current temperatures of a sensor.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TemperatureResponse {
    #[serde(rename = "groupId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_id: Option<i64>,

    #[serde(rename = "sensors")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sensors: Option<Vec<models::TemperatureResponseSensors>>,

}

impl TemperatureResponse {
    pub fn new() -> TemperatureResponse {
        TemperatureResponse {
            group_id: None,
            sensors: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TemperatureResponseSensors {
    /// Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
    #[serde(rename = "probeTemperature")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub probe_temperature: Option<isize>,

    /// Name of the sensor.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// ID of the sensor.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

    /// Currently reported ambient temperature in millidegrees celsius.
    #[serde(rename = "ambientTemperature")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ambient_temperature: Option<isize>,

}

impl TemperatureResponseSensors {
    pub fn new() -> TemperatureResponseSensors {
        TemperatureResponseSensors {
            probe_temperature: None,
            name: None,
            id: None,
            ambient_temperature: None,
        }
    }
}

/// Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TripResponse {
    #[serde(rename = "trips")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trips: Option<Vec<models::TripResponseTrips>>,

}

impl TripResponse {
    pub fn new() -> TripResponse {
        TripResponse {
            trips: None,
        }
    }
}

/// End (latitude, longitude) in decimal degrees.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TripResponseEndCoordinates {
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

}

impl TripResponseEndCoordinates {
    pub fn new() -> TripResponseEndCoordinates {
        TripResponseEndCoordinates {
            latitude: None,
            longitude: None,
        }
    }
}

/// Start (latitude, longitude) in decimal degrees.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TripResponseStartCoordinates {
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

}

impl TripResponseStartCoordinates {
    pub fn new() -> TripResponseStartCoordinates {
        TripResponseStartCoordinates {
            latitude: None,
            longitude: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TripResponseTrips {
    /// Odometer reading at the end of the trip.
    #[serde(rename = "endOdometer")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub end_odometer: Option<isize>,

    /// Length of the trip in meters.
    #[serde(rename = "distanceMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub distance_meters: Option<isize>,

    /// End of the trip in UNIX milliseconds.
    #[serde(rename = "endMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub end_ms: Option<isize>,

    /// Beginning of the trip in UNIX milliseconds.
    #[serde(rename = "startMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_ms: Option<isize>,

    /// Amount in milliliters of fuel consumed on this trip.
    #[serde(rename = "fuelConsumedMl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fuel_consumed_ml: Option<isize>,

    /// Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
    #[serde(rename = "startAddress")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_address: Option<String>,

    #[serde(rename = "startCoordinates")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_coordinates: Option<models::TripResponseStartCoordinates>,

    #[serde(rename = "endCoordinates")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub end_coordinates: Option<models::TripResponseEndCoordinates>,

    /// Odometer reading at the beginning of the trip.
    #[serde(rename = "startOdometer")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_odometer: Option<isize>,

    /// ID of the driver.
    #[serde(rename = "driverId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub driver_id: Option<isize>,

    /// Geocoded street address of start (latitude, longitude) coordinates.
    #[serde(rename = "startLocation")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start_location: Option<String>,

    /// Length in meters trip spent on toll roads.
    #[serde(rename = "tollMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub toll_meters: Option<isize>,

    /// Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
    #[serde(rename = "endAddress")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub end_address: Option<String>,

    /// Geocoded street address of start (latitude, longitude) coordinates.
    #[serde(rename = "endLocation")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub end_location: Option<String>,

}

impl TripResponseTrips {
    pub fn new() -> TripResponseTrips {
        TripResponseTrips {
            end_odometer: None,
            distance_meters: None,
            end_ms: None,
            start_ms: None,
            fuel_consumed_ml: None,
            start_address: None,
            start_coordinates: None,
            end_coordinates: None,
            start_odometer: None,
            driver_id: None,
            start_location: None,
            toll_meters: None,
            end_address: None,
            end_location: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct User {
    /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "authType")]
    pub auth_type: String,

    /// The email address of this user.
    #[serde(rename = "email")]
    pub email: String,

    /// The first and last name of the user.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    #[serde(rename = "organizationRoleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub organization_role_id: Option<String>,

    /// The ID of the User record.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i64>,

    /// The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    #[serde(rename = "organizationRole")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub organization_role: Option<String>,

    /// The specific tags this user has access to. This will be blank for users that have full access to the organization.
    #[serde(rename = "tagRoles")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tag_roles: Option<Vec<models::UserTagRole>>,

}

impl User {
    pub fn new(auth_type: String, email: String, ) -> User {
        User {
            auth_type: auth_type,
            email: email,
            name: None,
            organization_role_id: None,
            id: None,
            organization_role: None,
            tag_roles: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct UserBase {
    /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "authType")]
    pub auth_type: String,

    /// The email address of this user.
    #[serde(rename = "email")]
    pub email: String,

    /// The first and last name of the user.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    #[serde(rename = "organizationRoleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub organization_role_id: Option<String>,

}

impl UserBase {
    pub fn new(auth_type: String, email: String, ) -> UserBase {
        UserBase {
            auth_type: auth_type,
            email: email,
            name: None,
            organization_role_id: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct UserRole {
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl UserRole {
    pub fn new() -> UserRole {
        UserRole {
            id: None,
            name: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct UserTagRole {
    /// The name of the role the user has been granted on this tag.
    #[serde(rename = "role")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub role: Option<String>,

    /// The id of the role the user has been granted on this tag.
    #[serde(rename = "roleId")]
    pub role_id: String,

    #[serde(rename = "tag")]
    pub tag: models::UserTagRoleTag,

}

impl UserTagRole {
    pub fn new(role_id: String, tag: models::UserTagRoleTag, ) -> UserTagRole {
        UserTagRole {
            role: None,
            role_id: role_id,
            tag: tag,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct UserTagRoleTag {
    /// The ID of this tag.
    #[serde(rename = "parentTagId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub parent_tag_id: Option<i64>,

    /// Name of this tag.
    #[serde(rename = "name")]
    pub name: String,

    /// The ID of this tag.
    #[serde(rename = "id")]
    pub id: i64,

}

impl UserTagRoleTag {
    pub fn new(name: String, id: i64, ) -> UserTagRoleTag {
        UserTagRoleTag {
            parent_tag_id: None,
            name: name,
            id: id,
        }
    }
}

/// A vehicle object.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Vehicle {
    /// Total engine hours for the vehicle.
    #[serde(rename = "engineHours")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub engine_hours: Option<i64>,

    /// The fuel level of the vehicle as a percentage. (0.0 to 1.0)
    #[serde(rename = "fuelLevelPercent")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fuel_level_percent: Option<f64>,

    /// ID of the vehicle.
    #[serde(rename = "id")]
    pub id: i64,

    /// Name of the vehicle.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    #[serde(rename = "note")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub note: Option<String>,

    /// The number of meters reported by the odometer.
    #[serde(rename = "odometerMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub odometer_meters: Option<i64>,

    /// Vehicle Identification Number.
    #[serde(rename = "vin")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vin: Option<String>,

}

impl Vehicle {
    pub fn new(id: i64, ) -> Vehicle {
        Vehicle {
            engine_hours: None,
            fuel_level_percent: None,
            id: id,
            name: None,
            note: None,
            odometer_meters: None,
            vin: None,
        }
    }
}

/// Harsh event details for a vehicle
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleHarshEventResponse {
    /// URL for downloading the forward facing video
    #[serde(rename = "downloadForwardVideoUrl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub download_forward_video_url: Option<String>,

    /// URL for downloading the inward facing video
    #[serde(rename = "downloadInwardVideoUrl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub download_inward_video_url: Option<String>,

    /// URL for downloading the tracked inward facing video
    #[serde(rename = "downloadTrackedInwardVideoUrl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub download_tracked_inward_video_url: Option<String>,

    /// Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
    #[serde(rename = "harshEventType")]
    pub harsh_event_type: String,

    /// URL of the associated incident report page
    #[serde(rename = "incidentReportUrl")]
    pub incident_report_url: String,

    /// Whether the driver was deemed distracted during this harsh event
    #[serde(rename = "isDistracted")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_distracted: Option<bool>,

    #[serde(rename = "location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub location: Option<models::VehicleHarshEventResponseLocation>,

}

impl VehicleHarshEventResponse {
    pub fn new(harsh_event_type: String, incident_report_url: String, ) -> VehicleHarshEventResponse {
        VehicleHarshEventResponse {
            download_forward_video_url: None,
            download_inward_video_url: None,
            download_tracked_inward_video_url: None,
            harsh_event_type: harsh_event_type,
            incident_report_url: incident_report_url,
            is_distracted: None,
            location: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleHarshEventResponseLocation {
    /// Address of location where the harsh event occurred
    #[serde(rename = "address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub address: Option<String>,

    /// Latitude of location where the harsh event occurred
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<String>,

    /// Longitude of location where the harsh event occurred
    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<String>,

}

impl VehicleHarshEventResponseLocation {
    pub fn new() -> VehicleHarshEventResponseLocation {
        VehicleHarshEventResponseLocation {
            address: None,
            latitude: None,
            longitude: None,
        }
    }
}

/// Contains the location, in latitude and longitude, of a vehicle.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleLocation {
    /// Heading in degrees.
    #[serde(rename = "heading")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub heading: Option<f64>,

    /// ID of the vehicle.
    #[serde(rename = "id")]
    pub id: i64,

    /// Latitude in decimal degrees.
    #[serde(rename = "latitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latitude: Option<f64>,

    /// Text representation of nearest identifiable location to (latitude, longitude) coordinates.
    #[serde(rename = "location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub location: Option<String>,

    /// Longitude in decimal degrees.
    #[serde(rename = "longitude")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub longitude: Option<f64>,

    /// Name of the vehicle.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The number of meters reported by the odometer.
    #[serde(rename = "odometerMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub odometer_meters: Option<i64>,

    /// Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
    #[serde(rename = "onTrip")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub on_trip: Option<bool>,

    /// Speed in miles per hour.
    #[serde(rename = "speed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub speed: Option<f64>,

    /// The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
    #[serde(rename = "time")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<isize>,

    /// Vehicle Identification Number (VIN) of the vehicle.
    #[serde(rename = "vin")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vin: Option<String>,

}

impl VehicleLocation {
    pub fn new(id: i64, ) -> VehicleLocation {
        VehicleLocation {
            heading: None,
            id: id,
            latitude: None,
            location: None,
            longitude: None,
            name: None,
            odometer_meters: None,
            on_trip: None,
            speed: None,
            time: None,
            vin: None,
        }
    }
}

/// Contains any J1939/Passenger engine light warnings and engine faults.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenance {
    /// ID of the vehicle.
    #[serde(rename = "id")]
    pub id: i64,

    #[serde(rename = "j1939")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub j1939: Option<models::VehicleMaintenanceJ1939>,

    #[serde(rename = "passenger")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub passenger: Option<models::VehicleMaintenancePassenger>,

}

impl VehicleMaintenance {
    pub fn new(id: i64, ) -> VehicleMaintenance {
        VehicleMaintenance {
            id: id,
            j1939: None,
            passenger: None,
        }
    }
}

/// J1939 based data. Null if no data is available.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenanceJ1939 {
    #[serde(rename = "checkEngineLight")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub check_engine_light: Option<models::VehicleMaintenanceJ1939CheckEngineLight>,

    /// J1939 DTCs.
    #[serde(rename = "diagnosticTroubleCodes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub diagnostic_trouble_codes: Option<Vec<models::VehicleMaintenanceJ1939DiagnosticTroubleCodes>>,

}

impl VehicleMaintenanceJ1939 {
    pub fn new() -> VehicleMaintenanceJ1939 {
        VehicleMaintenanceJ1939 {
            check_engine_light: None,
            diagnostic_trouble_codes: None,
        }
    }
}

/// J1939 check engine lights.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenanceJ1939CheckEngineLight {
    #[serde(rename = "protectIsOn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub protect_is_on: Option<bool>,

    #[serde(rename = "stopIsOn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stop_is_on: Option<bool>,

    #[serde(rename = "warningIsOn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub warning_is_on: Option<bool>,

    #[serde(rename = "emissionsIsOn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emissions_is_on: Option<bool>,

}

impl VehicleMaintenanceJ1939CheckEngineLight {
    pub fn new() -> VehicleMaintenanceJ1939CheckEngineLight {
        VehicleMaintenanceJ1939CheckEngineLight {
            protect_is_on: None,
            stop_is_on: None,
            warning_is_on: None,
            emissions_is_on: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    #[serde(rename = "spnDescription")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub spn_description: Option<String>,

    #[serde(rename = "fmiText")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fmi_text: Option<String>,

    #[serde(rename = "spnId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub spn_id: Option<isize>,

    #[serde(rename = "occurrenceCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub occurrence_count: Option<isize>,

    #[serde(rename = "txId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tx_id: Option<isize>,

    #[serde(rename = "fmiId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fmi_id: Option<isize>,

}

impl VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    pub fn new() -> VehicleMaintenanceJ1939DiagnosticTroubleCodes {
        VehicleMaintenanceJ1939DiagnosticTroubleCodes {
            spn_description: None,
            fmi_text: None,
            spn_id: None,
            occurrence_count: None,
            tx_id: None,
            fmi_id: None,
        }
    }
}

/// Passenger vehicle data. Null if no data is available.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenancePassenger {
    #[serde(rename = "checkEngineLight")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub check_engine_light: Option<models::VehicleMaintenancePassengerCheckEngineLight>,

    /// Passenger vehicle DTCs.
    #[serde(rename = "diagnosticTroubleCodes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub diagnostic_trouble_codes: Option<Vec<models::VehicleMaintenancePassengerDiagnosticTroubleCodes>>,

}

impl VehicleMaintenancePassenger {
    pub fn new() -> VehicleMaintenancePassenger {
        VehicleMaintenancePassenger {
            check_engine_light: None,
            diagnostic_trouble_codes: None,
        }
    }
}

/// Passenger vehicle check engine light.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenancePassengerCheckEngineLight {
    #[serde(rename = "isOn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_on: Option<bool>,

}

impl VehicleMaintenancePassengerCheckEngineLight {
    pub fn new() -> VehicleMaintenancePassengerCheckEngineLight {
        VehicleMaintenancePassengerCheckEngineLight {
            is_on: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleMaintenancePassengerDiagnosticTroubleCodes {
    #[serde(rename = "dtcShortCode")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dtc_short_code: Option<String>,

    #[serde(rename = "dtcId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dtc_id: Option<isize>,

    #[serde(rename = "dtcDescription")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dtc_description: Option<String>,

}

impl VehicleMaintenancePassengerDiagnosticTroubleCodes {
    pub fn new() -> VehicleMaintenancePassengerDiagnosticTroubleCodes {
        VehicleMaintenancePassengerDiagnosticTroubleCodes {
            dtc_short_code: None,
            dtc_id: None,
            dtc_description: None,
        }
    }
}

/// Safety score details for a vehicle
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct VehicleSafetyScoreResponse {
    /// Crash event count
    #[serde(rename = "crashCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub crash_count: Option<isize>,

    /// Harsh acceleration event count
    #[serde(rename = "harshAccelCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_accel_count: Option<isize>,

    /// Harsh braking event count
    #[serde(rename = "harshBrakingCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_braking_count: Option<isize>,

    #[serde(rename = "harshEvents")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_events: Option<Vec<models::SafetyReportHarshEvent>>,

    /// Harsh turning event count
    #[serde(rename = "harshTurningCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub harsh_turning_count: Option<isize>,

    /// Safety Score
    #[serde(rename = "safetyScore")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub safety_score: Option<isize>,

    /// Safety Score Rank
    #[serde(rename = "safetyScoreRank")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub safety_score_rank: Option<String>,

    /// Amount of time driven over the speed limit in milliseconds
    #[serde(rename = "timeOverSpeedLimitMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time_over_speed_limit_ms: Option<isize>,

    /// Total distance driven in meters
    #[serde(rename = "totalDistanceDrivenMeters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_distance_driven_meters: Option<isize>,

    /// Total harsh event count
    #[serde(rename = "totalHarshEventCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_harsh_event_count: Option<isize>,

    /// Amount of time driven in milliseconds
    #[serde(rename = "totalTimeDrivenMs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_time_driven_ms: Option<isize>,

    /// Vehicle ID
    #[serde(rename = "vehicleId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub vehicle_id: Option<isize>,

}

impl VehicleSafetyScoreResponse {
    pub fn new() -> VehicleSafetyScoreResponse {
        VehicleSafetyScoreResponse {
            crash_count: None,
            harsh_accel_count: None,
            harsh_braking_count: None,
            harsh_events: None,
            harsh_turning_count: None,
            safety_score: None,
            safety_score_rank: None,
            time_over_speed_limit_ms: None,
            total_distance_driven_meters: None,
            total_harsh_event_count: None,
            total_time_driven_ms: None,
            vehicle_id: None,
        }
    }
}
