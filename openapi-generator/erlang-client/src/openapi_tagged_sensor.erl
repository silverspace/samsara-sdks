-module(openapi_tagged_sensor).

-export([encode/1]).

-export_type([openapi_tagged_sensor/0]).

-type openapi_tagged_sensor() ::
    #{ 'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
