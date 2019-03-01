-module(openapi_user_base).

-include("openapi.hrl").

-export([openapi_user_base/0]).

-export([openapi_user_base/1]).

-export_type([openapi_user_base/0]).

-type openapi_user_base() ::
  [ {'authType', binary() }
  | {'email', binary() }
  | {'name', binary() }
  | {'organizationRoleId', binary() }
  ].


openapi_user_base() ->
    openapi_user_base([]).

openapi_user_base(Fields) ->
  Default = [ {'authType', elements([<<"default">>, <<"saml">>]) }
            , {'email', binary() }
            , {'name', binary() }
            , {'organizationRoleId', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

