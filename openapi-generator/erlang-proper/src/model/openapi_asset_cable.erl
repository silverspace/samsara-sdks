-module(openapi_asset_cable).

-include("openapi.hrl").

-export([openapi_asset_cable/0]).

-export([openapi_asset_cable/1]).

-export_type([openapi_asset_cable/0]).

-type openapi_asset_cable() ::
  [ {'assetType', binary() }
  ].


openapi_asset_cable() ->
    openapi_asset_cable([]).

openapi_asset_cable(Fields) ->
  Default = [ {'assetType', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

