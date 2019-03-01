-module(openapi__sensors_history_series).

-include("openapi.hrl").

-export([openapi__sensors_history_series/0]).

-export([openapi__sensors_history_series/1]).

-export_type([openapi__sensors_history_series/0]).

-type openapi__sensors_history_series() ::
  [ {'field', binary() }
  | {'widgetId', integer() }
  ].


openapi__sensors_history_series() ->
    openapi__sensors_history_series([]).

openapi__sensors_history_series(Fields) ->
  Default = [ {'field', elements([<<"ambientTemperature">>, <<"probeTemperature">>, <<"currentLoop1Raw">>, <<"currentLoop1Mapped">>, <<"currentLoop2Raw">>, <<"currentLoop2Mapped">>, <<"pmPowerTotal">>, <<"pmPhase1Power">>, <<"pmPhase2Power">>, <<"pmPhase3Power">>, <<"pmPhase1PowerFactor">>, <<"pmPhase2PowerFactor">>, <<"pmPhase3PowerFactor">>]) }
            , {'widgetId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

