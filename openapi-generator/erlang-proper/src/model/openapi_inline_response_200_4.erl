-module(openapi_inline_response_200_4).

-include("openapi.hrl").

-export([openapi_inline_response_200_4/0]).

-export([openapi_inline_response_200_4/1]).

-export_type([openapi_inline_response_200_4/0]).

-type openapi_inline_response_200_4() ::
  [ {'vehicles', list(openapi_vehicle_maintenance:openapi_vehicle_maintenance()) }
  ].


openapi_inline_response_200_4() ->
    openapi_inline_response_200_4([]).

openapi_inline_response_200_4(Fields) ->
  Default = [ {'vehicles', list(openapi_vehicle_maintenance:openapi_vehicle_maintenance()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

