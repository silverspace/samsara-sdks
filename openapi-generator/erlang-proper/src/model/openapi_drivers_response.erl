-module(openapi_drivers_response).

-include("openapi.hrl").

-export([openapi_drivers_response/0]).

-export([openapi_drivers_response/1]).

-export_type([openapi_drivers_response/0]).

-type openapi_drivers_response() ::
  [ {'drivers', list(openapi_driver:openapi_driver()) }
  ].


openapi_drivers_response() ->
    openapi_drivers_response([]).

openapi_drivers_response(Fields) ->
  Default = [ {'drivers', list(openapi_driver:openapi_driver()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

