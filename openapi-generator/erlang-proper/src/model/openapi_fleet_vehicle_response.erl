-module(openapi_fleet_vehicle_response).

-include("openapi.hrl").

-export([openapi_fleet_vehicle_response/0]).

-export([openapi_fleet_vehicle_response/1]).

-export_type([openapi_fleet_vehicle_response/0]).

-type openapi_fleet_vehicle_response() ::
  [ {'externalIds', map() }
  | {'harshAccelSetting', binary() }
  | {'id', integer() }
  | {'name', binary() }
  | {'vehicleInfo', openapi_fleet_vehicle_response_vehicle_info:openapi_fleet_vehicle_response_vehicle_info() }
  ].


openapi_fleet_vehicle_response() ->
    openapi_fleet_vehicle_response([]).

openapi_fleet_vehicle_response(Fields) ->
  Default = [ {'externalIds', map() }
            , {'harshAccelSetting', binary() }
            , {'id', integer() }
            , {'name', binary() }
            , {'vehicleInfo', openapi_fleet_vehicle_response_vehicle_info:openapi_fleet_vehicle_response_vehicle_info() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

