-module(openapi_tagged_asset).

-include("openapi.hrl").

-export([openapi_tagged_asset/0]).

-export([openapi_tagged_asset/1]).

-export_type([openapi_tagged_asset/0]).

-type openapi_tagged_asset() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tagged_asset() ->
    openapi_tagged_asset([]).

openapi_tagged_asset(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

