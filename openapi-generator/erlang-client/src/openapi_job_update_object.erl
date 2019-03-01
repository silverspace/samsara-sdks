-module(openapi_job_update_object).

-export([encode/1]).

-export_type([openapi_job_update_object/0]).

-type openapi_job_update_object() ::
    #{ 'changed_at_ms' => integer(),
       'job_id' => integer(),
       'job_state' => openapi_job_status:openapi_job_status(),
       'prev_job_state' => openapi_prev_job_status:openapi_prev_job_status(),
       'route' => openapi_dispatch_route:openapi_dispatch_route(),
       'route_id' => integer()
     }.

encode(#{ 'changed_at_ms' := ChangedAtMs,
          'job_id' := JobId,
          'job_state' := JobState,
          'prev_job_state' := PrevJobState,
          'route' := Route,
          'route_id' := RouteId
        }) ->
    #{ 'changed_at_ms' => ChangedAtMs,
       'job_id' => JobId,
       'job_state' => JobState,
       'prev_job_state' => PrevJobState,
       'route' => Route,
       'route_id' => RouteId
     }.
