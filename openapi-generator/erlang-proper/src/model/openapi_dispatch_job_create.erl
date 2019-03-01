-module(openapi_dispatch_job_create).

-include("openapi.hrl").

-export([openapi_dispatch_job_create/0]).

-export([openapi_dispatch_job_create/1]).

-export_type([openapi_dispatch_job_create/0]).

-type openapi_dispatch_job_create() ::
  [ {'destination_address', binary() }
  | {'destination_address_id', integer() }
  | {'destination_lat', float() }
  | {'destination_lng', float() }
  | {'destination_name', binary() }
  | {'notes', binary() }
  | {'scheduled_arrival_time_ms', integer() }
  | {'scheduled_departure_time_ms', integer() }
  ].


openapi_dispatch_job_create() ->
    openapi_dispatch_job_create([]).

openapi_dispatch_job_create(Fields) ->
  Default = [ {'destination_address', binary() }
            , {'destination_address_id', integer() }
            , {'destination_lat', float() }
            , {'destination_lng', float() }
            , {'destination_name', binary() }
            , {'notes', binary() }
            , {'scheduled_arrival_time_ms', integer() }
            , {'scheduled_departure_time_ms', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

