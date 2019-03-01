-module(openapi_user).

-export([encode/1]).

-export_type([openapi_user/0]).

-type openapi_user() ::
    #{ 'authType' := binary(),
       'email' := binary(),
       'name' => binary(),
       'organizationRoleId' => binary(),
       'id' => integer(),
       'organizationRole' => binary(),
       'tagRoles' => list()
     }.

encode(#{ 'authType' := AuthType,
          'email' := Email,
          'name' := Name,
          'organizationRoleId' := OrganizationRoleId,
          'id' := Id,
          'organizationRole' := OrganizationRole,
          'tagRoles' := TagRoles
        }) ->
    #{ 'authType' => AuthType,
       'email' => Email,
       'name' => Name,
       'organizationRoleId' => OrganizationRoleId,
       'id' => Id,
       'organizationRole' => OrganizationRole,
       'tagRoles' => TagRoles
     }.
