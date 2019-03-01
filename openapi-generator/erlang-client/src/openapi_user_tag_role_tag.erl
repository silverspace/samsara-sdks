-module(openapi_user_tag_role_tag).

-export([encode/1]).

-export_type([openapi_user_tag_role_tag/0]).

-type openapi_user_tag_role_tag() ::
    #{ 'parentTagId' => integer(),
       'name' := binary(),
       'id' := integer()
     }.

encode(#{ 'parentTagId' := ParentTagId,
          'name' := Name,
          'id' := Id
        }) ->
    #{ 'parentTagId' => ParentTagId,
       'name' => Name,
       'id' => Id
     }.
