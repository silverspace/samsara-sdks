-module(openapi_aux_input_series).

-include("openapi.hrl").

-export([openapi_aux_input_series/0]).

-export([openapi_aux_input_series/1]).

-export_type([openapi_aux_input_series/0]).

-type openapi_aux_input_series() ::
  [ {'name', binary() }
  | {'values', list(openapi_aux_input:openapi_aux_input()) }
  ].


openapi_aux_input_series() ->
    openapi_aux_input_series([]).

openapi_aux_input_series(Fields) ->
  Default = [ {'name', elements([<<"Emergency Lights">>, <<"Emergency Alarm">>, <<"Stop Paddle">>, <<"Power Take-Off">>, <<"Plow">>, <<"Sweeper">>, <<"Salter">>, <<"Boom">>]) }
            , {'values', list(openapi_aux_input:openapi_aux_input()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

