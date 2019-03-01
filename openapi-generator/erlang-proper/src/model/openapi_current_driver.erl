-module(openapi_current_driver).

-include("openapi.hrl").

-export([openapi_current_driver/0]).

-export([openapi_current_driver/1]).

-export_type([openapi_current_driver/0]).

-type openapi_current_driver() ::
  [ 
  ].


openapi_current_driver() ->
    openapi_current_driver([]).

openapi_current_driver(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

