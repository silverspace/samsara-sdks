-module(openapi_dispatch_route_base).

-include("openapi.hrl").

-export([openapi_dispatch_route_base/0]).

-export([openapi_dispatch_route_base/1]).

-export_type([openapi_dispatch_route_base/0]).

-type openapi_dispatch_route_base() ::
  [ {'actual_end_ms', integer() }
  | {'actual_start_ms', integer() }
  | {'driver_id', integer() }
  | {'group_id', integer() }
  | {'name', binary() }
  | {'scheduled_end_ms', integer() }
  | {'scheduled_meters', integer() }
  | {'scheduled_start_ms', integer() }
  | {'start_location_address', binary() }
  | {'start_location_address_id', integer() }
  | {'start_location_lat', float() }
  | {'start_location_lng', float() }
  | {'start_location_name', binary() }
  | {'trailer_id', integer() }
  | {'vehicle_id', integer() }
  ].


openapi_dispatch_route_base() ->
    openapi_dispatch_route_base([]).

openapi_dispatch_route_base(Fields) ->
  Default = [ {'actual_end_ms', integer() }
            , {'actual_start_ms', integer() }
            , {'driver_id', integer() }
            , {'group_id', integer() }
            , {'name', binary() }
            , {'scheduled_end_ms', integer() }
            , {'scheduled_meters', integer() }
            , {'scheduled_start_ms', integer() }
            , {'start_location_address', binary() }
            , {'start_location_address_id', integer() }
            , {'start_location_lat', float() }
            , {'start_location_lng', float() }
            , {'start_location_name', binary() }
            , {'trailer_id', integer() }
            , {'vehicle_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

