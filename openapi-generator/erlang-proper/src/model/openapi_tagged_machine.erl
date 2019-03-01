-module(openapi_tagged_machine).

-include("openapi.hrl").

-export([openapi_tagged_machine/0]).

-export([openapi_tagged_machine/1]).

-export_type([openapi_tagged_machine/0]).

-type openapi_tagged_machine() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tagged_machine() ->
    openapi_tagged_machine([]).

openapi_tagged_machine(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

