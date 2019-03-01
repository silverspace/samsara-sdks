-module(openapi_pagination).

-include("openapi.hrl").

-export([openapi_pagination/0]).

-export([openapi_pagination/1]).

-export_type([openapi_pagination/0]).

-type openapi_pagination() ::
  [ {'endCursor', binary() }
  | {'hasNextPage', boolean() }
  | {'hasPrevPage', boolean() }
  | {'startCursor', binary() }
  ].


openapi_pagination() ->
    openapi_pagination([]).

openapi_pagination(Fields) ->
  Default = [ {'endCursor', binary() }
            , {'hasNextPage', boolean() }
            , {'hasPrevPage', boolean() }
            , {'startCursor', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

