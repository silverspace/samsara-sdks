-module(openapi_user_base).

-export([encode/1]).

-export_type([openapi_user_base/0]).

-type openapi_user_base() ::
    #{ 'authType' := binary(),
       'email' := binary(),
       'name' => binary(),
       'organizationRoleId' => binary()
     }.

encode(#{ 'authType' := AuthType,
          'email' := Email,
          'name' := Name,
          'organizationRoleId' := OrganizationRoleId
        }) ->
    #{ 'authType' => AuthType,
       'email' => Email,
       'name' => Name,
       'organizationRoleId' => OrganizationRoleId
     }.
