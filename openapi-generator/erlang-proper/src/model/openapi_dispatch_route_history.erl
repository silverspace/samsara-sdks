-module(openapi_dispatch_route_history).

-include("openapi.hrl").

-export([openapi_dispatch_route_history/0]).

-export([openapi_dispatch_route_history/1]).

-export_type([openapi_dispatch_route_history/0]).

-type openapi_dispatch_route_history() ::
  [ {'history', list(openapi_dispatch_route_historical_entry:openapi_dispatch_route_historical_entry()) }
  ].


openapi_dispatch_route_history() ->
    openapi_dispatch_route_history([]).

openapi_dispatch_route_history(Fields) ->
  Default = [ {'history', list(openapi_dispatch_route_historical_entry:openapi_dispatch_route_historical_entry()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

