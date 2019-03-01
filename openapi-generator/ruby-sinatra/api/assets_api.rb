require 'json'


MyApp.add_route('GET', '/v1/fleet/assets/locations', {
  "resourcePath" => "/Assets",
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
  "resourcePath" => "/Assets",
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


MyApp.add_route('GET', '/v1/fleet/assets/{asset_id}/locations', {
  "resourcePath" => "/Assets",
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
  "resourcePath" => "/Assets",
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

