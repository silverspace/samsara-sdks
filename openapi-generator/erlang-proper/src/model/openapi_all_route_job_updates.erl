-module(openapi_all_route_job_updates).

-include("openapi.hrl").

-export([openapi_all_route_job_updates/0]).

-export([openapi_all_route_job_updates/1]).

-export_type([openapi_all_route_job_updates/0]).

-type openapi_all_route_job_updates() ::
  [ {'job_updates', list(openapi_job_update_object:openapi_job_update_object()) }
  | {'sequence_id', binary() }
  ].


openapi_all_route_job_updates() ->
    openapi_all_route_job_updates([]).

openapi_all_route_job_updates(Fields) ->
  Default = [ {'job_updates', list(openapi_job_update_object:openapi_job_update_object()) }
            , {'sequence_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

