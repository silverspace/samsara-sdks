require 'json'


MyApp.add_route('GET', '/v1/industrial/data', {
  "resourcePath" => "/Industrial",
  "summary" => "/industrial/data",
  "nickname" => "get_all_data_inputs", 
  "responseClass" => "inline_response_200_6",
  "endpoint" => "/industrial/data", 
  "notes" => "Fetch all of the data inputs for a group.",
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
      "name" => "start_ms",
      "description" => "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/industrial/data/{data_input_id}', {
  "resourcePath" => "/Industrial",
  "summary" => "/industrial/data/{data_input_id:[0-9]+}",
  "nickname" => "get_data_input", 
  "responseClass" => "DataInputHistoryResponse",
  "endpoint" => "/industrial/data/{data_input_id}", 
  "notes" => "Fetch datapoints from a given data input.",
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
      "description" => "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_ms",
      "description" => "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data_input_id",
      "description" => "ID of the data input",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/machines/list', {
  "resourcePath" => "/Industrial",
  "summary" => "/machines/list",
  "nickname" => "get_machines", 
  "responseClass" => "inline_response_200_7",
  "endpoint" => "/machines/list", 
  "notes" => "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.",
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
      "dataType" => "InlineObject18",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/machines/history', {
  "resourcePath" => "/Industrial",
  "summary" => "/machines/history",
  "nickname" => "get_machines_history", 
  "responseClass" => "MachineHistoryResponse",
  "endpoint" => "/machines/history", 
  "notes" => "Get historical data for machine objects. This method returns a set of historical data for all machines in a group",
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
      "dataType" => "InlineObject17",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

