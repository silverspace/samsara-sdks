-module(openapi_tagged_vehicle).

-export([encode/1]).

-export_type([openapi_tagged_vehicle/0]).

-type openapi_tagged_vehicle() ::
    #{ 'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
