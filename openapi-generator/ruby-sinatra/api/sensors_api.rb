require 'json'


MyApp.add_route('POST', '/v1/sensors/list', {
  "resourcePath" => "/Sensors",
  "summary" => "/sensors/list",
  "nickname" => "get_sensors", 
  "responseClass" => "inline_response_200_8",
  "endpoint" => "/sensors/list", 
  "notes" => "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject23",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/sensors/cargo', {
  "resourcePath" => "/Sensors",
  "summary" => "/sensors/cargo",
  "nickname" => "get_sensors_cargo", 
  "responseClass" => "CargoResponse",
  "endpoint" => "/sensors/cargo", 
  "notes" => "Get cargo monitor status (empty / full) for requested sensors.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject19",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/sensors/door', {
  "resourcePath" => "/Sensors",
  "summary" => "/sensors/door",
  "nickname" => "get_sensors_door", 
  "responseClass" => "DoorResponse",
  "endpoint" => "/sensors/door", 
  "notes" => "Get door monitor status (closed / open) for requested sensors.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject20",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/sensors/history', {
  "resourcePath" => "/Sensors",
  "summary" => "/sensors/history",
  "nickname" => "get_sensors_history", 
  "responseClass" => "SensorHistoryResponse",
  "endpoint" => "/sensors/history", 
  "notes" => "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject21",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/sensors/humidity', {
  "resourcePath" => "/Sensors",
  "summary" => "/sensors/humidity",
  "nickname" => "get_sensors_humidity", 
  "responseClass" => "HumidityResponse",
  "endpoint" => "/sensors/humidity", 
  "notes" => "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject22",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/sensors/temperature', {
  "resourcePath" => "/Sensors",
  "summary" => "/sensors/temperature",
  "nickname" => "get_sensors_temperature", 
  "responseClass" => "TemperatureResponse",
  "endpoint" => "/sensors/temperature", 
  "notes" => "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject24",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

