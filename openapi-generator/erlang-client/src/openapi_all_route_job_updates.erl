-module(openapi_all_route_job_updates).

-export([encode/1]).

-export_type([openapi_all_route_job_updates/0]).

-type openapi_all_route_job_updates() ::
    #{ 'job_updates' => list(),
       'sequence_id' => binary()
     }.

encode(#{ 'job_updates' := JobUpdates,
          'sequence_id' := SequenceId
        }) ->
    #{ 'job_updates' => JobUpdates,
       'sequence_id' => SequenceId
     }.
