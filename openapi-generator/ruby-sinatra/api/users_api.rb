require 'json'


MyApp.add_route('DELETE', '/v1/users/{userId}', {
  "resourcePath" => "/Users",
  "summary" => "/users/{userId:[0-9]+}",
  "nickname" => "delete_user_by_id", 
  "responseClass" => "void",
  "endpoint" => "/users/{userId}", 
  "notes" => "Remove a user from the organization.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/users/{userId}', {
  "resourcePath" => "/Users",
  "summary" => "/users/{userId:[0-9]+}",
  "nickname" => "get_user_by_id", 
  "responseClass" => "User",
  "endpoint" => "/users/{userId}", 
  "notes" => "Get a user.",
  "parameters" => [
    {
      "name" => "access_token",
      "description" => "Samsara API access token.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/user_roles', {
  "resourcePath" => "/Users",
  "summary" => "/user_roles",
  "nickname" => "list_user_roles", 
  "responseClass" => "Array<UserRole>",
  "endpoint" => "/user_roles", 
  "notes" => "Get all roles in the organization.",
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


MyApp.add_route('GET', '/v1/users', {
  "resourcePath" => "/Users",
  "summary" => "/users",
  "nickname" => "list_users", 
  "responseClass" => "Array<User>",
  "endpoint" => "/users", 
  "notes" => "List all users in the organization.",
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

