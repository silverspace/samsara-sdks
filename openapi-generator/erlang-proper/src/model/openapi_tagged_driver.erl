-module(openapi_tagged_driver).

-include("openapi.hrl").

-export([openapi_tagged_driver/0]).

-export([openapi_tagged_driver/1]).

-export_type([openapi_tagged_driver/0]).

-type openapi_tagged_driver() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tagged_driver() ->
    openapi_tagged_driver([]).

openapi_tagged_driver(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

