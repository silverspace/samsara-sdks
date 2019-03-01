-module(openapi_user).

-include("openapi.hrl").

-export([openapi_user/0]).

-export([openapi_user/1]).

-export_type([openapi_user/0]).

-type openapi_user() ::
  [ {'authType', binary() }
  | {'email', binary() }
  | {'name', binary() }
  | {'organizationRoleId', binary() }
  | {'id', integer() }
  | {'organizationRole', binary() }
  | {'tagRoles', list(openapi_user_tag_role:openapi_user_tag_role()) }
  ].


openapi_user() ->
    openapi_user([]).

openapi_user(Fields) ->
  Default = [ {'authType', elements([<<"default">>, <<"saml">>]) }
            , {'email', binary() }
            , {'name', binary() }
            , {'organizationRoleId', binary() }
            , {'id', integer() }
            , {'organizationRole', binary() }
            , {'tagRoles', list(openapi_user_tag_role:openapi_user_tag_role()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

