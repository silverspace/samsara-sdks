-module(openapi_dispatch_route_historical_entry).

-export([encode/1]).

-export_type([openapi_dispatch_route_historical_entry/0]).

-type openapi_dispatch_route_historical_entry() ::
    #{ 'changed_at_ms' => integer(),
       'route' => openapi_dispatch_route:openapi_dispatch_route()
     }.

encode(#{ 'changed_at_ms' := ChangedAtMs,
          'route' := Route
        }) ->
    #{ 'changed_at_ms' => ChangedAtMs,
       'route' => Route
     }.
