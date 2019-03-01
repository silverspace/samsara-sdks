-module(openapi_inline_response_200_1).

-include("openapi.hrl").

-export([openapi_inline_response_200_1/0]).

-export([openapi_inline_response_200_1/1]).

-export_type([openapi_inline_response_200_1/0]).

-type openapi_inline_response_200_1() ::
  [ {'assets', list(openapi_asset_current_locations_response:openapi_asset_current_locations_response()) }
  ].


openapi_inline_response_200_1() ->
    openapi_inline_response_200_1([]).

openapi_inline_response_200_1(Fields) ->
  Default = [ {'assets', list(openapi_asset_current_locations_response:openapi_asset_current_locations_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

