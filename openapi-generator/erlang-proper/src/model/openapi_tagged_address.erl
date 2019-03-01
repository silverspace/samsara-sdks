-module(openapi_tagged_address).

-include("openapi.hrl").

-export([openapi_tagged_address/0]).

-export([openapi_tagged_address/1]).

-export_type([openapi_tagged_address/0]).

-type openapi_tagged_address() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tagged_address() ->
    openapi_tagged_address([]).

openapi_tagged_address(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

