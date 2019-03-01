-module(openapi_dispatch_route_history).

-export([encode/1]).

-export_type([openapi_dispatch_route_history/0]).

-type openapi_dispatch_route_history() ::
    #{ 'history' => list()
     }.

encode(#{ 'history' := History
        }) ->
    #{ 'history' => History
     }.
