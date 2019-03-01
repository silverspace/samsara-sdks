-module(openapi_user_tag_role_tag).

-include("openapi.hrl").

-export([openapi_user_tag_role_tag/0]).

-export([openapi_user_tag_role_tag/1]).

-export_type([openapi_user_tag_role_tag/0]).

-type openapi_user_tag_role_tag() ::
  [ {'parentTagId', integer() }
  | {'name', binary() }
  | {'id', integer() }
  ].


openapi_user_tag_role_tag() ->
    openapi_user_tag_role_tag([]).

openapi_user_tag_role_tag(Fields) ->
  Default = [ {'parentTagId', integer() }
            , {'name', binary() }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

