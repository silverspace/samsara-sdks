-module(openapi_dispatch_route_historical_entry).

-include("openapi.hrl").

-export([openapi_dispatch_route_historical_entry/0]).

-export([openapi_dispatch_route_historical_entry/1]).

-export_type([openapi_dispatch_route_historical_entry/0]).

-type openapi_dispatch_route_historical_entry() ::
  [ {'changed_at_ms', integer() }
  | {'route', openapi_dispatch_route:openapi_dispatch_route() }
  ].


openapi_dispatch_route_historical_entry() ->
    openapi_dispatch_route_historical_entry([]).

openapi_dispatch_route_historical_entry(Fields) ->
  Default = [ {'changed_at_ms', integer() }
            , {'route', openapi_dispatch_route:openapi_dispatch_route() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

