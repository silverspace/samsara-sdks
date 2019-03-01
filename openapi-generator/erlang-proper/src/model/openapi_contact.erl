-module(openapi_contact).

-include("openapi.hrl").

-export([openapi_contact/0]).

-export([openapi_contact/1]).

-export_type([openapi_contact/0]).

-type openapi_contact() ::
  [ {'email', binary() }
  | {'firstName', binary() }
  | {'id', integer() }
  | {'lastName', binary() }
  | {'phone', binary() }
  ].


openapi_contact() ->
    openapi_contact([]).

openapi_contact(Fields) ->
  Default = [ {'email', binary() }
            , {'firstName', binary() }
            , {'id', integer() }
            , {'lastName', binary() }
            , {'phone', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

