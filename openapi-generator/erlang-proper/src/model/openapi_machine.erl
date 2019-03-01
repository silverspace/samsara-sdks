-module(openapi_machine).

-include("openapi.hrl").

-export([openapi_machine/0]).

-export([openapi_machine/1]).

-export_type([openapi_machine/0]).

-type openapi_machine() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'notes', binary() }
  ].


openapi_machine() ->
    openapi_machine([]).

openapi_machine(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'notes', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

