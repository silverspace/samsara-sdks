-module(openapi_cargo_response_sensors).

-export([encode/1]).

-export_type([openapi_cargo_response_sensors/0]).

-type openapi_cargo_response_sensors() ::
    #{ 'cargoEmpty' => boolean(),
       'name' => binary(),
       'id' => integer()
     }.

encode(#{ 'cargoEmpty' := CargoEmpty,
          'name' := Name,
          'id' := Id
        }) ->
    #{ 'cargoEmpty' => CargoEmpty,
       'name' => Name,
       'id' => Id
     }.
