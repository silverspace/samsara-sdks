-module(openapi_vehicle_maintenance_passenger_check_engine_light).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance_passenger_check_engine_light/0]).

-type openapi_vehicle_maintenance_passenger_check_engine_light() ::
    #{ 'isOn' => boolean()
     }.

encode(#{ 'isOn' := IsOn
        }) ->
    #{ 'isOn' => IsOn
     }.
