-module(openapi_dvir_base_vehicle).

-export([encode/1]).

-export_type([openapi_dvir_base_vehicle/0]).

-type openapi_dvir_base_vehicle() ::
    #{ 'name' => binary(),
       'id' => integer()
     }.

encode(#{ 'name' := Name,
          'id' := Id
        }) ->
    #{ 'name' => Name,
       'id' => Id
     }.
