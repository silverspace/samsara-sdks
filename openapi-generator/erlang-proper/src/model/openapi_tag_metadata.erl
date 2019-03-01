-module(openapi_tag_metadata).

-include("openapi.hrl").

-export([openapi_tag_metadata/0]).

-export([openapi_tag_metadata/1]).

-export_type([openapi_tag_metadata/0]).

-type openapi_tag_metadata() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tag_metadata() ->
    openapi_tag_metadata([]).

openapi_tag_metadata(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

