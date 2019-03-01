-module(openapi_vehicle_maintenance).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance/0]).

-export([openapi_vehicle_maintenance/1]).

-export_type([openapi_vehicle_maintenance/0]).

-type openapi_vehicle_maintenance() ::
  [ {'id', integer() }
  | {'j1939', openapi_vehicle_maintenance_j1939:openapi_vehicle_maintenance_j1939() }
  | {'passenger', openapi_vehicle_maintenance_passenger:openapi_vehicle_maintenance_passenger() }
  ].


openapi_vehicle_maintenance() ->
    openapi_vehicle_maintenance([]).

openapi_vehicle_maintenance(Fields) ->
  Default = [ {'id', integer() }
            , {'j1939', openapi_vehicle_maintenance_j1939:openapi_vehicle_maintenance_j1939() }
            , {'passenger', openapi_vehicle_maintenance_passenger:openapi_vehicle_maintenance_passenger() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

