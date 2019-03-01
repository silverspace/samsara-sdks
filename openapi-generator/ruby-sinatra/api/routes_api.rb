require 'json'


MyApp.add_route('POST', '/v1/fleet/dispatch/routes', {
  "resourcePath" => "/Routes",
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


MyApp.add_route('POST', '/v1/fleet/drivers/{driver_id}/dispatch/routes', {
  "resourcePath" => "/Routes",
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


MyApp.add_route('POST', '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', {
  "resourcePath" => "/Routes",
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


MyApp.add_route('DELETE', '/v1/fleet/dispatch/routes/{route_id}', {
  "resourcePath" => "/Routes",
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


MyApp.add_route('GET', '/v1/fleet/dispatch/routes', {
  "resourcePath" => "/Routes",
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
  "resourcePath" => "/Routes",
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


MyApp.add_route('GET', '/v1/fleet/dispatch/routes/{route_id}', {
  "resourcePath" => "/Routes",
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
  "resourcePath" => "/Routes",
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
  "resourcePath" => "/Routes",
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
  "resourcePath" => "/Routes",
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


MyApp.add_route('PUT', '/v1/fleet/dispatch/routes/{route_id}', {
  "resourcePath" => "/Routes",
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

