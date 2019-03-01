-module(openapi_inline_object_16).

-include("openapi.hrl").

-export([openapi_inline_object_16/0]).

-export([openapi_inline_object_16/1]).

-export_type([openapi_inline_object_16/0]).

-type openapi_inline_object_16() ::
  [ {'externalIds', map() }
  | {'harsh_accel_setting', integer() }
  | {'name', binary() }
  ].


openapi_inline_object_16() ->
    openapi_inline_object_16([]).

openapi_inline_object_16(Fields) ->
  Default = [ {'externalIds', map() }
            , {'harsh_accel_setting', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

