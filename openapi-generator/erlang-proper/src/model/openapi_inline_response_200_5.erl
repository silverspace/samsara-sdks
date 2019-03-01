-module(openapi_inline_response_200_5).

-include("openapi.hrl").

-export([openapi_inline_response_200_5/0]).

-export([openapi_inline_response_200_5/1]).

-export_type([openapi_inline_response_200_5/0]).

-type openapi_inline_response_200_5() ::
  [ {'pagination', openapi_pagination:openapi_pagination() }
  | {'vehicleStats', list(openapi_inline_response_200_5_vehicle_stats:openapi_inline_response_200_5_vehicle_stats()) }
  ].


openapi_inline_response_200_5() ->
    openapi_inline_response_200_5([]).

openapi_inline_response_200_5(Fields) ->
  Default = [ {'pagination', openapi_pagination:openapi_pagination() }
            , {'vehicleStats', list(openapi_inline_response_200_5_vehicle_stats:openapi_inline_response_200_5_vehicle_stats()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

