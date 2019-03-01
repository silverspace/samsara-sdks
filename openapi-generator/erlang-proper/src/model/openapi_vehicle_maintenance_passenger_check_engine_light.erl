-module(openapi_vehicle_maintenance_passenger_check_engine_light).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance_passenger_check_engine_light/0]).

-export([openapi_vehicle_maintenance_passenger_check_engine_light/1]).

-export_type([openapi_vehicle_maintenance_passenger_check_engine_light/0]).

-type openapi_vehicle_maintenance_passenger_check_engine_light() ::
  [ {'isOn', boolean() }
  ].


openapi_vehicle_maintenance_passenger_check_engine_light() ->
    openapi_vehicle_maintenance_passenger_check_engine_light([]).

openapi_vehicle_maintenance_passenger_check_engine_light(Fields) ->
  Default = [ {'isOn', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

