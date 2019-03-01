-module(openapi_dispatch_job).

-include("openapi.hrl").

-export([openapi_dispatch_job/0]).

-export([openapi_dispatch_job/1]).

-export_type([openapi_dispatch_job/0]).

-type openapi_dispatch_job() ::
  [ {'destination_address', binary() }
  | {'destination_address_id', integer() }
  | {'destination_lat', float() }
  | {'destination_lng', float() }
  | {'destination_name', binary() }
  | {'notes', binary() }
  | {'scheduled_arrival_time_ms', integer() }
  | {'scheduled_departure_time_ms', integer() }
  | {'arrived_at_ms', integer() }
  | {'completed_at_ms', integer() }
  | {'dispatch_route_id', integer() }
  | {'driver_id', integer() }
  | {'en_route_at_ms', integer() }
  | {'estimated_arrival_ms', integer() }
  | {'fleet_viewer_url', binary() }
  | {'group_id', integer() }
  | {'id', integer() }
  | {'job_state', openapi_job_status:openapi_job_status() }
  | {'skipped_at_ms', integer() }
  | {'vehicle_id', integer() }
  ].


openapi_dispatch_job() ->
    openapi_dispatch_job([]).

openapi_dispatch_job(Fields) ->
  Default = [ {'destination_address', binary() }
            , {'destination_address_id', integer() }
            , {'destination_lat', float() }
            , {'destination_lng', float() }
            , {'destination_name', binary() }
            , {'notes', binary() }
            , {'scheduled_arrival_time_ms', integer() }
            , {'scheduled_departure_time_ms', integer() }
            , {'arrived_at_ms', integer() }
            , {'completed_at_ms', integer() }
            , {'dispatch_route_id', integer() }
            , {'driver_id', integer() }
            , {'en_route_at_ms', integer() }
            , {'estimated_arrival_ms', integer() }
            , {'fleet_viewer_url', binary() }
            , {'group_id', integer() }
            , {'id', integer() }
            , {'job_state', openapi_job_status:openapi_job_status() }
            , {'skipped_at_ms', integer() }
            , {'vehicle_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

