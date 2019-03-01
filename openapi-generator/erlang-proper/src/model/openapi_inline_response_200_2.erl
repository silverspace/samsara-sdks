-module(openapi_inline_response_200_2).

-include("openapi.hrl").

-export([openapi_inline_response_200_2/0]).

-export([openapi_inline_response_200_2/1]).

-export_type([openapi_inline_response_200_2/0]).

-type openapi_inline_response_200_2() ::
  [ {'pagination', openapi_pagination:openapi_pagination() }
  | {'groupId', integer() }
  | {'vehicles', list(openapi_vehicle:openapi_vehicle()) }
  ].


openapi_inline_response_200_2() ->
    openapi_inline_response_200_2([]).

openapi_inline_response_200_2(Fields) ->
  Default = [ {'pagination', openapi_pagination:openapi_pagination() }
            , {'groupId', integer() }
            , {'vehicles', list(openapi_vehicle:openapi_vehicle()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

