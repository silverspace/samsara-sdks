require 'json'


MyApp.add_route('POST', '/v1/fleet/add_address', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/add_address",
  "nickname" => "add_fleet_address", 
  "responseClass" => "void",
  "endpoint" => "/fleet/add_address", 
  "notes" => "This method adds an address book entry to the specified group.",
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
      "dataType" => "InlineObject2",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/addresses', {
  "resourcePath" => "/Fleet",
  "summary" => "/addresses",
  "nickname" => "add_organization_addresses", 
  "responseClass" => "Array<Address>",
  "endpoint" => "/addresses", 
  "notes" => "Add one or more addresses to the organization",
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
      "dataType" => "InlineObject",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/dispatch/routes', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes",
  "nickname" => "create_dispatch_route", 
  "responseClass" => "DispatchRoute",
  "endpoint" => "/fleet/dispatch/routes", 
  "notes" => "Create a new dispatch route.",
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
      "dataType" => "DispatchRouteCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/drivers/create', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('POST', '/v1/fleet/drivers/{driver_id}/dispatch/routes', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes",
  "nickname" => "create_driver_dispatch_route", 
  "responseClass" => "DispatchRoute",
  "endpoint" => "/fleet/drivers/{driver_id}/dispatch/routes", 
  "notes" => "Create a new dispatch route for the driver with driver_id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id",
      "description" => "ID of the driver with the associated routes.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "DispatchRouteCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/drivers/{driver_id}/documents', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/{driver_id:[0-9]+}/documents",
  "nickname" => "create_driver_document", 
  "responseClass" => "Document",
  "endpoint" => "/fleet/drivers/{driver_id}/documents", 
  "notes" => "Create a driver document for the given driver.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id",
      "description" => "ID of the driver for whom the document is created.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.",
      "dataType" => "DocumentCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/maintenance/dvirs', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/maintenance/dvirs",
  "nickname" => "create_dvir", 
  "responseClass" => "DvirBase",
  "endpoint" => "/fleet/maintenance/dvirs", 
  "notes" => "Create a new dvir, marking a vehicle or trailer safe or unsafe.",
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
      "dataType" => "InlineObject12",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes",
  "nickname" => "create_vehicle_dispatch_route", 
  "responseClass" => "DispatchRoute",
  "endpoint" => "/fleet/vehicles/{vehicle_id}/dispatch/routes", 
  "notes" => "Create a new dispatch route for the vehicle with vehicle_id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id",
      "description" => "ID of the vehicle with the associated routes.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "DispatchRouteCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/fleet/drivers/{driver_id_or_external_id}', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('DELETE', '/v1/fleet/dispatch/routes/{route_id}', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes/{route_id:[0-9]+}/",
  "nickname" => "delete_dispatch_route_by_id", 
  "responseClass" => "void",
  "endpoint" => "/fleet/dispatch/routes/{route_id}", 
  "notes" => "Delete a dispatch route and its associated jobs.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "route_id",
      "description" => "ID of the dispatch route.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/addresses/{addressId}', {
  "resourcePath" => "/Fleet",
  "summary" => "/addresses/{addressId}",
  "nickname" => "delete_organization_address", 
  "responseClass" => "void",
  "endpoint" => "/addresses/{addressId}", 
  "notes" => "Delete an address.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "address_id",
      "description" => "ID of the address/geofence",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/dispatch/routes', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes",
  "nickname" => "fetch_all_dispatch_routes", 
  "responseClass" => "Array<DispatchRoute>",
  "endpoint" => "/fleet/dispatch/routes", 
  "notes" => "Fetch all of the dispatch routes for the group.",
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
    {
      "name" => "end_time",
      "description" => "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration",
      "description" => "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/dispatch/routes/job_updates', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes/job_updates",
  "nickname" => "fetch_all_route_job_updates", 
  "responseClass" => "allRouteJobUpdates",
  "endpoint" => "/fleet/dispatch/routes/job_updates", 
  "notes" => "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID",
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
    {
      "name" => "sequence_id",
      "description" => "Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include",
      "description" => "Optionally set include&#x3D;route to include route object in response payload.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/assets/locations', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/assets/locations",
  "nickname" => "get_all_asset_current_locations", 
  "responseClass" => "inline_response_200_1",
  "endpoint" => "/fleet/assets/locations", 
  "notes" => "Fetch current locations of all assets for the group.",
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


MyApp.add_route('GET', '/v1/fleet/assets', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/assets",
  "nickname" => "get_all_assets", 
  "responseClass" => "inline_response_200",
  "endpoint" => "/fleet/assets", 
  "notes" => "Fetch all of the assets for the group.",
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


MyApp.add_route('GET', '/v1/fleet/drivers/inactive', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('GET', '/v1/fleet/assets/{asset_id}/locations', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/assets/{assetId:[0-9]+}/locations",
  "nickname" => "get_asset_location", 
  "responseClass" => "Array<Object>",
  "endpoint" => "/fleet/assets/{asset_id}/locations", 
  "notes" => "Fetch the historical locations for the asset.",
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
      "name" => "asset_id",
      "description" => "ID of the asset",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/assets/{asset_id}/reefer', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/assets/{assetId:[0-9]+}/reefer",
  "nickname" => "get_asset_reefer", 
  "responseClass" => "AssetReeferResponse",
  "endpoint" => "/fleet/assets/{asset_id}/reefer", 
  "notes" => "Fetch the reefer-specific stats of an asset.",
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
      "name" => "asset_id",
      "description" => "ID of the asset",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/inactive/{driver_id_or_external_id}', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('GET', '/v1/fleet/dispatch/routes/{route_id}', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes/{route_id:[0-9]+}",
  "nickname" => "get_dispatch_route_by_id", 
  "responseClass" => "DispatchRoute",
  "endpoint" => "/fleet/dispatch/routes/{route_id}", 
  "notes" => "Fetch a dispatch route by id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "route_id",
      "description" => "ID of the dispatch route.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/dispatch/routes/{route_id}/history', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes/{route_id:[0-9]+}/history",
  "nickname" => "get_dispatch_route_history", 
  "responseClass" => "DispatchRouteHistory",
  "endpoint" => "/fleet/dispatch/routes/{route_id}/history", 
  "notes" => "Fetch the history of a dispatch route.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_time",
      "description" => "Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "route_id",
      "description" => "ID of the route with history.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/{driver_id}/dispatch/routes', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes",
  "nickname" => "get_dispatch_routes_by_driver_id", 
  "responseClass" => "Array<DispatchRoute>",
  "endpoint" => "/fleet/drivers/{driver_id}/dispatch/routes", 
  "notes" => "Fetch all of the dispatch routes for a given driver.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration",
      "description" => "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id",
      "description" => "ID of the driver with the associated routes.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes",
  "nickname" => "get_dispatch_routes_by_vehicle_id", 
  "responseClass" => "Array<DispatchRoute>",
  "endpoint" => "/fleet/vehicles/{vehicle_id}/dispatch/routes", 
  "notes" => "Fetch all of the dispatch routes for a given vehicle.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration",
      "description" => "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id",
      "description" => "ID of the vehicle with the associated routes.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/{driver_id_or_external_id}', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('GET', '/v1/fleet/drivers/document_types', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/document_types",
  "nickname" => "get_driver_document_types_by_org_id", 
  "responseClass" => "Array<DocumentType>",
  "endpoint" => "/fleet/drivers/document_types", 
  "notes" => "Fetch all of the document types.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/documents', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/documents",
  "nickname" => "get_driver_documents_by_org_id", 
  "responseClass" => "Array<Document>",
  "endpoint" => "/fleet/drivers/documents", 
  "notes" => "Fetch all of the documents.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration_ms",
      "description" => "Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/drivers/{driverId}/safety/score', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('GET', '/v1/fleet/maintenance/dvirs', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/maintenance/dvirs",
  "nickname" => "get_dvirs", 
  "responseClass" => "DvirListResponse",
  "endpoint" => "/fleet/maintenance/dvirs", 
  "notes" => "Get DVIRs for the org within provided time constraints",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "time in millis until the last dvir log.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration_ms",
      "description" => "time in millis which corresponds to the duration before the end_ms.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_id",
      "description" => "Group ID to query.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/drivers', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers",
  "nickname" => "get_fleet_drivers", 
  "responseClass" => "DriversResponse",
  "endpoint" => "/fleet/drivers", 
  "notes" => "Get all the drivers for the specified group.",
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
      "dataType" => "InlineObject3",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/drivers/{driver_id}/hos_daily_logs', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs",
  "nickname" => "get_fleet_drivers_hos_daily_logs", 
  "responseClass" => "DriverDailyLogResponse",
  "endpoint" => "/fleet/drivers/{driver_id}/hos_daily_logs", 
  "notes" => "Get summarized daily HOS charts for a specified driver.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "driver_id",
      "description" => "ID of the driver with HOS logs.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject6",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/drivers/summary', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/drivers/summary",
  "nickname" => "get_fleet_drivers_summary", 
  "responseClass" => "DriversSummaryResponse",
  "endpoint" => "/fleet/drivers/summary", 
  "notes" => "Get the distance and time each driver in an organization has driven in a given time period.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "snap_to_day_bounds",
      "description" => "Snap query result to HOS day boundaries.",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject5",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/hos_authentication_logs', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/hos_authentication_logs",
  "nickname" => "get_fleet_hos_authentication_logs", 
  "responseClass" => "HosAuthenticationLogsResponse",
  "endpoint" => "/fleet/hos_authentication_logs", 
  "notes" => "Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.",
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
      "dataType" => "InlineObject7",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/hos_logs', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/hos_logs",
  "nickname" => "get_fleet_hos_logs", 
  "responseClass" => "HosLogsResponse",
  "endpoint" => "/fleet/hos_logs", 
  "notes" => "Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.",
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
      "dataType" => "InlineObject8",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/hos_logs_summary', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/hos_logs_summary",
  "nickname" => "get_fleet_hos_logs_summary", 
  "responseClass" => "HosLogsSummaryResponse",
  "endpoint" => "/fleet/hos_logs_summary", 
  "notes" => "Get the current HOS status for all drivers in the group.",
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
      "dataType" => "InlineObject9",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/locations', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/locations",
  "nickname" => "get_fleet_locations", 
  "responseClass" => "inline_response_200_3",
  "endpoint" => "/fleet/locations", 
  "notes" => "Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.",
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
      "dataType" => "InlineObject11",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/maintenance/list', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/maintenance/list",
  "nickname" => "get_fleet_maintenance_list", 
  "responseClass" => "inline_response_200_4",
  "endpoint" => "/fleet/maintenance/list", 
  "notes" => "Get list of the vehicles with any engine faults or check light data.",
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
      "dataType" => "InlineObject13",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/trips', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/trips",
  "nickname" => "get_fleet_trips", 
  "responseClass" => "TripResponse",
  "endpoint" => "/fleet/trips", 
  "notes" => "Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.",
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
      "dataType" => "InlineObject15",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicle_id_or_external_id}', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}",
  "nickname" => "get_fleet_vehicle", 
  "responseClass" => "FleetVehicleResponse",
  "endpoint" => "/fleet/vehicles/{vehicle_id_or_external_id}", 
  "notes" => "Gets a specific vehicle.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id_or_external_id",
      "description" => "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/addresses/{addressId}', {
  "resourcePath" => "/Fleet",
  "summary" => "/addresses/{addressId}",
  "nickname" => "get_organization_address", 
  "responseClass" => "Address",
  "endpoint" => "/addresses/{addressId}", 
  "notes" => "Fetch an address by its id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "address_id",
      "description" => "ID of the address/geofence",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/addresses', {
  "resourcePath" => "/Fleet",
  "summary" => "/addresses",
  "nickname" => "get_organization_addresses", 
  "responseClass" => "Array<Address>",
  "endpoint" => "/addresses", 
  "notes" => "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/contacts/{contact_id}', {
  "resourcePath" => "/Fleet",
  "summary" => "/contacts/{contact_id}",
  "nickname" => "get_organization_contact", 
  "responseClass" => "Contact",
  "endpoint" => "/contacts/{contact_id}", 
  "notes" => "Fetch a contact by its id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "contact_id",
      "description" => "ID of the contact",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicleId}/safety/harsh_event', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicle_id}/locations', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/{vehicle_id:[0-9]+}/locations",
  "nickname" => "get_vehicle_locations", 
  "responseClass" => "Array<FleetVehicleLocation>",
  "endpoint" => "/fleet/vehicles/{vehicle_id}/locations", 
  "notes" => "Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.",
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
      "description" => "Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id",
      "description" => "ID of the vehicle with the associated routes.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/{vehicleId}/safety/score', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('GET', '/v1/fleet/vehicles/stats', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/stats",
  "nickname" => "get_vehicle_stats", 
  "responseClass" => "inline_response_200_5",
  "endpoint" => "/fleet/vehicles/stats", 
  "notes" => "Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.",
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
      "description" => "Time in Unix epoch milliseconds for the start of the query.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Time in Unix epoch milliseconds for the end of the query.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "series",
      "description" => "Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2",
      "dataType" => "String",
      "allowableValues" => "[engineState, auxInput1, auxInput2]",
      "paramType" => "query",
    },
    {
      "name" => "tag_ids",
      "description" => "Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "starting_after",
      "description" => "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ending_before",
      "description" => "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fleet/vehicles/locations', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/locations",
  "nickname" => "get_vehicles_locations", 
  "responseClass" => "Array<Object>",
  "endpoint" => "/fleet/vehicles/locations", 
  "notes" => "Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.",
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
      "description" => "Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/contacts', {
  "resourcePath" => "/Fleet",
  "summary" => "/contacts",
  "nickname" => "list_contacts", 
  "responseClass" => "Array<Contact>",
  "endpoint" => "/contacts", 
  "notes" => "Fetch all contacts for the organization.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/list', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/list",
  "nickname" => "list_fleet", 
  "responseClass" => "inline_response_200_2",
  "endpoint" => "/fleet/list", 
  "notes" => "Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "starting_after",
      "description" => "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ending_before",
      "description" => "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject10",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/fleet/vehicles/{vehicle_id_or_external_id}', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}",
  "nickname" => "patch_fleet_vehicle", 
  "responseClass" => "FleetVehicleResponse",
  "endpoint" => "/fleet/vehicles/{vehicle_id_or_external_id}", 
  "notes" => "Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_id_or_external_id",
      "description" => "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject16",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/fleet/drivers/inactive/{driver_id_or_external_id}', {
  "resourcePath" => "/Fleet",
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


MyApp.add_route('PUT', '/v1/fleet/dispatch/routes/{route_id}', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/dispatch/routes/{route_id:[0-9]+}/",
  "nickname" => "update_dispatch_route_by_id", 
  "responseClass" => "DispatchRoute",
  "endpoint" => "/fleet/dispatch/routes/{route_id}", 
  "notes" => "Update a dispatch route and its associated jobs.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "route_id",
      "description" => "ID of the dispatch route.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "DispatchRoute",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/addresses/{addressId}', {
  "resourcePath" => "/Fleet",
  "summary" => "/addresses/{addressId}",
  "nickname" => "update_organization_address", 
  "responseClass" => "void",
  "endpoint" => "/addresses/{addressId}", 
  "notes" => "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "address_id",
      "description" => "ID of the address/geofence",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "InlineObject1",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fleet/set_data', {
  "resourcePath" => "/Fleet",
  "summary" => "/fleet/set_data",
  "nickname" => "update_vehicles", 
  "responseClass" => "void",
  "endpoint" => "/fleet/set_data", 
  "notes" => "This method enables the mutation of metadata for vehicles in the Samsara Cloud.",
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
      "dataType" => "InlineObject14",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

