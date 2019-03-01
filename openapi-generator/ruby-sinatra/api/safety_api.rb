require 'json'


MyApp.add_route('GET', '/v1/fleet/drivers/{driverId}/safety/score', {
  "resourcePath" => "/Safety",
  "summary" => "/fleet/drivers/{driverId:[0-9]+}/safety/score",
  "nickname" => "get_driver_safety_score", 
  "responseClass" => "DriverSafetyScoreResponse",
  "endpoint" => "/fleet/drivers/{driverId}/safety/score", 
  "notes" => "Fetch the safety score for the driver.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_ms",
      "description" => "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id",
      "description" => "ID of the driver",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicleId}/safety/harsh_event', {
  "resourcePath" => "/Safety",
  "summary" => "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event",
  "nickname" => "get_vehicle_harsh_event", 
  "responseClass" => "VehicleHarshEventResponse",
  "endpoint" => "/fleet/vehicles/{vehicleId}/safety/harsh_event", 
  "notes" => "Fetch harsh event details for a vehicle.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "timestamp",
      "description" => "Timestamp in milliseconds representing the timestamp of a harsh event.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id",
      "description" => "ID of the vehicle",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicleId}/safety/score', {
  "resourcePath" => "/Safety",
  "summary" => "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score",
  "nickname" => "get_vehicle_safety_score", 
  "responseClass" => "VehicleSafetyScoreResponse",
  "endpoint" => "/fleet/vehicles/{vehicleId}/safety/score", 
  "notes" => "Fetch the safety score for the vehicle.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_ms",
      "description" => "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id",
      "description" => "ID of the vehicle",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

