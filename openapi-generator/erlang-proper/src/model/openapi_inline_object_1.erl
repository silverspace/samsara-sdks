-module(openapi_inline_object_1).

-include("openapi.hrl").

-export([openapi_inline_object_1/0]).

-export([openapi_inline_object_1/1]).

-export_type([openapi_inline_object_1/0]).

-type openapi_inline_object_1() ::
  [ {'contactIds', list(integer()) }
  | {'formattedAddress', binary() }
  | {'geofence', openapi_address_geofence:openapi_address_geofence() }
  | {'name', binary() }
  | {'notes', binary() }
  | {'tagIds', list(integer()) }
  ].


openapi_inline_object_1() ->
    openapi_inline_object_1([]).

openapi_inline_object_1(Fields) ->
  Default = [ {'contactIds', list(integer()) }
            , {'formattedAddress', binary() }
            , {'geofence', openapi_address_geofence:openapi_address_geofence() }
            , {'name', binary() }
            , {'notes', binary() }
            , {'tagIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

