-module(openapi_vehicle_maintenance_j1939_check_engine_light).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance_j1939_check_engine_light/0]).

-export([openapi_vehicle_maintenance_j1939_check_engine_light/1]).

-export_type([openapi_vehicle_maintenance_j1939_check_engine_light/0]).

-type openapi_vehicle_maintenance_j1939_check_engine_light() ::
  [ {'protectIsOn', boolean() }
  | {'stopIsOn', boolean() }
  | {'warningIsOn', boolean() }
  | {'emissionsIsOn', boolean() }
  ].


openapi_vehicle_maintenance_j1939_check_engine_light() ->
    openapi_vehicle_maintenance_j1939_check_engine_light([]).

openapi_vehicle_maintenance_j1939_check_engine_light(Fields) ->
  Default = [ {'protectIsOn', boolean() }
            , {'stopIsOn', boolean() }
            , {'warningIsOn', boolean() }
            , {'emissionsIsOn', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

