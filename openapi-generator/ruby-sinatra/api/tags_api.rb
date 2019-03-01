require 'json'


MyApp.add_route('POST', '/v1/tags', {
  "resourcePath" => "/Tags",
  "summary" => "/tags",
  "nickname" => "create_tag", 
  "responseClass" => "Tag",
  "endpoint" => "/tags", 
  "notes" => "Create a new tag for the group.",
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
      "dataType" => "TagCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/tags/{tag_id}', {
  "resourcePath" => "/Tags",
  "summary" => "/tags/{tag_id:[0-9]+}",
  "nickname" => "delete_tag_by_id", 
  "responseClass" => "void",
  "endpoint" => "/tags/{tag_id}", 
  "notes" => "Permanently deletes a tag.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tag_id",
      "description" => "ID of the tag.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/tags', {
  "resourcePath" => "/Tags",
  "summary" => "/tags",
  "nickname" => "get_all_tags", 
  "responseClass" => "inline_response_200_9",
  "endpoint" => "/tags", 
  "notes" => "Fetch all of the tags for a group.",
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


MyApp.add_route('GET', '/v1/tags/{tag_id}', {
  "resourcePath" => "/Tags",
  "summary" => "/tags/{tag_id:[0-9]+}",
  "nickname" => "get_tag_by_id", 
  "responseClass" => "Tag",
  "endpoint" => "/tags/{tag_id}", 
  "notes" => "Fetch a tag by id.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tag_id",
      "description" => "ID of the tag.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/tags/{tag_id}', {
  "resourcePath" => "/Tags",
  "summary" => "/tags/{tag_id:[0-9]+}",
  "nickname" => "modify_tag_by_id", 
  "responseClass" => "Tag",
  "endpoint" => "/tags/{tag_id}", 
  "notes" => "Add or delete specific members from a tag, or modify the name of a tag.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tag_id",
      "description" => "ID of the tag.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "TagModify",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/tags/{tag_id}', {
  "resourcePath" => "/Tags",
  "summary" => "/tags/{tag_id:[0-9]+}",
  "nickname" => "update_tag_by_id", 
  "responseClass" => "Tag",
  "endpoint" => "/tags/{tag_id}", 
  "notes" => "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tag_id",
      "description" => "ID of the tag.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "TagUpdate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

