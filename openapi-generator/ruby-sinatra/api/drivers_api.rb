require 'json'


MyApp.add_route('POST', '/v1/fleet/drivers/create', {
  "resourcePath" => "/Drivers",
  "summary" => "/fleet/drivers/create",
  "nickname" => "create_driver", 
  "responseClass" => "Driver",
  "endpoint" => "/fleet/drivers/create", 
  "notes" => "Create a new driver.",
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
      "description" => "Driver creation body",
      "dataType" => "DriverForCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/fleet/drivers/{driver_id_or_external_id}', {
  "resourcePath" => "/Drivers",
  "summary" => "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}",
  "nickname" => "deactivate_driver", 
  "responseClass" => "void",
  "endpoint" => "/fleet/drivers/{driver_id_or_external_id}", 
  "notes" => "Deactivate a driver with the given id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id_or_external_id",
      "description" => "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/inactive', {
  "resourcePath" => "/Drivers",
  "summary" => "/fleet/drivers/inactive",
  "nickname" => "get_all_deactivated_drivers", 
  "responseClass" => "Array<Driver>",
  "endpoint" => "/fleet/drivers/inactive", 
  "notes" => "Fetch all deactivated drivers for the group.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_id",
      "description" => "Optional group ID if the organization has multiple groups (uncommon).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/inactive/{driver_id_or_external_id}', {
  "resourcePath" => "/Drivers",
  "summary" => "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}",
  "nickname" => "get_deactivated_driver_by_id", 
  "responseClass" => "Driver",
  "endpoint" => "/fleet/drivers/inactive/{driver_id_or_external_id}", 
  "notes" => "Fetch deactivated driver by id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id_or_external_id",
      "description" => "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/{driver_id_or_external_id}', {
  "resourcePath" => "/Drivers",
  "summary" => "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}",
  "nickname" => "get_driver_by_id", 
  "responseClass" => "Driver",
  "endpoint" => "/fleet/drivers/{driver_id_or_external_id}", 
  "notes" => "Fetch driver by id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id_or_external_id",
      "description" => "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/fleet/drivers/inactive/{driver_id_or_external_id}', {
  "resourcePath" => "/Drivers",
  "summary" => "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}",
  "nickname" => "reactivate_driver_by_id", 
  "responseClass" => "Driver",
  "endpoint" => "/fleet/drivers/inactive/{driver_id_or_external_id}", 
  "notes" => "Reactivate the inactive driver having id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id_or_external_id",
      "description" => "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject4",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

