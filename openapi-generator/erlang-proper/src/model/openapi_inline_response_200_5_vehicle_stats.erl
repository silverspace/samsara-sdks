-module(openapi_inline_response_200_5_vehicle_stats).

-include("openapi.hrl").

-export([openapi_inline_response_200_5_vehicle_stats/0]).

-export([openapi_inline_response_200_5_vehicle_stats/1]).

-export_type([openapi_inline_response_200_5_vehicle_stats/0]).

-type openapi_inline_response_200_5_vehicle_stats() ::
  [ {'engineState', list(openapi_engine_state:openapi_engine_state()) }
  | {'auxInput2', openapi_aux_input_series:openapi_aux_input_series() }
  | {'vehicleId', integer() }
  | {'auxInput1', openapi_aux_input_series:openapi_aux_input_series() }
  ].


openapi_inline_response_200_5_vehicle_stats() ->
    openapi_inline_response_200_5_vehicle_stats([]).

openapi_inline_response_200_5_vehicle_stats(Fields) ->
  Default = [ {'engineState', list(openapi_engine_state:openapi_engine_state()) }
            , {'auxInput2', openapi_aux_input_series:openapi_aux_input_series() }
            , {'vehicleId', integer() }
            , {'auxInput1', openapi_aux_input_series:openapi_aux_input_series() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

