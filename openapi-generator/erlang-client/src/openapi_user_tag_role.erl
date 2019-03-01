-module(openapi_user_tag_role).

-export([encode/1]).

-export_type([openapi_user_tag_role/0]).

-type openapi_user_tag_role() ::
    #{ 'role' => binary(),
       'roleId' := binary(),
       'tag' := openapi_user_tag_role_tag:openapi_user_tag_role_tag()
     }.

encode(#{ 'role' := Role,
          'roleId' := RoleId,
          'tag' := Tag
        }) ->
    #{ 'role' => Role,
       'roleId' => RoleId,
       'tag' => Tag
     }.
