-module(openapi_inline_response_200_3).

-include("openapi.hrl").

-export([openapi_inline_response_200_3/0]).

-export([openapi_inline_response_200_3/1]).

-export_type([openapi_inline_response_200_3/0]).

-type openapi_inline_response_200_3() ::
  [ {'groupId', integer() }
  | {'vehicles', list(openapi_vehicle_location:openapi_vehicle_location()) }
  ].


openapi_inline_response_200_3() ->
    openapi_inline_response_200_3([]).

openapi_inline_response_200_3(Fields) ->
  Default = [ {'groupId', integer() }
            , {'vehicles', list(openapi_vehicle_location:openapi_vehicle_location()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

