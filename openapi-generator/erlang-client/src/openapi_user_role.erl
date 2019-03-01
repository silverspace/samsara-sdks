-module(openapi_user_role).

-export([encode/1]).

-export_type([openapi_user_role/0]).

-type openapi_user_role() ::
    #{ 'id' => binary(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
