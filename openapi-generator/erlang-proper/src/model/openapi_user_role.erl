-module(openapi_user_role).

-include("openapi.hrl").

-export([openapi_user_role/0]).

-export([openapi_user_role/1]).

-export_type([openapi_user_role/0]).

-type openapi_user_role() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].


openapi_user_role() ->
    openapi_user_role([]).

openapi_user_role(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

