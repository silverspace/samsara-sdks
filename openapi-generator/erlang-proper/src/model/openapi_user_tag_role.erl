-module(openapi_user_tag_role).

-include("openapi.hrl").

-export([openapi_user_tag_role/0]).

-export([openapi_user_tag_role/1]).

-export_type([openapi_user_tag_role/0]).

-type openapi_user_tag_role() ::
  [ {'role', binary() }
  | {'roleId', binary() }
  | {'tag', openapi_user_tag_role_tag:openapi_user_tag_role_tag() }
  ].


openapi_user_tag_role() ->
    openapi_user_tag_role([]).

openapi_user_tag_role(Fields) ->
  Default = [ {'role', binary() }
            , {'roleId', binary() }
            , {'tag', openapi_user_tag_role_tag:openapi_user_tag_role_tag() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

