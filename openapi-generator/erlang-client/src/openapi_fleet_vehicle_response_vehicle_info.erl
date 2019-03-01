-module(openapi_fleet_vehicle_response_vehicle_info).

-export([encode/1]).

-export_type([openapi_fleet_vehicle_response_vehicle_info/0]).

-type openapi_fleet_vehicle_response_vehicle_info() ::
    #{ 'year' => integer(),
       'model' => binary(),
       'vin' => binary(),
       'make' => binary()
     }.

encode(#{ 'year' := Year,
          'model' := Model,
          'vin' := Vin,
          'make' := Make
        }) ->
    #{ 'year' => Year,
       'model' => Model,
       'vin' => Vin,
       'make' => Make
     }.
