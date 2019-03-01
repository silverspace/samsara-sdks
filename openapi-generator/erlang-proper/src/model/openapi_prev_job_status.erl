-module(openapi_prev_job_status).

-include("openapi.hrl").

-export([openapi_prev_job_status/0]).

-export_type([openapi_prev_job_status/0]).

-type openapi_prev_job_status() ::
  binary().

openapi_prev_job_status() ->
  elements([<<"JobState_Unassigned">>, <<"JobState_Scheduled">>, <<"JobState_EnRoute">>, <<"JobState_Arrived">>, <<"JobState_Completed">>, <<"JobState_Skipped">>]).

