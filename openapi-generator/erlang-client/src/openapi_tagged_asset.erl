-module(openapi_tagged_asset).

-export([encode/1]).

-export_type([openapi_tagged_asset/0]).

-type openapi_tagged_asset() ::
    #{ 'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
