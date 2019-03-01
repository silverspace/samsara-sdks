-module(openapi_job_update_object).

-include("openapi.hrl").

-export([openapi_job_update_object/0]).

-export([openapi_job_update_object/1]).

-export_type([openapi_job_update_object/0]).

-type openapi_job_update_object() ::
  [ {'changed_at_ms', integer() }
  | {'job_id', integer() }
  | {'job_state', openapi_job_status:openapi_job_status() }
  | {'prev_job_state', openapi_prev_job_status:openapi_prev_job_status() }
  | {'route', openapi_dispatch_route:openapi_dispatch_route() }
  | {'route_id', integer() }
  ].


openapi_job_update_object() ->
    openapi_job_update_object([]).

openapi_job_update_object(Fields) ->
  Default = [ {'changed_at_ms', integer() }
            , {'job_id', integer() }
            , {'job_state', openapi_job_status:openapi_job_status() }
            , {'prev_job_state', openapi_prev_job_status:openapi_prev_job_status() }
            , {'route', openapi_dispatch_route:openapi_dispatch_route() }
            , {'route_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

