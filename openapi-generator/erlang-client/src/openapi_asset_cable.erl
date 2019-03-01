-module(openapi_asset_cable).

-export([encode/1]).

-export_type([openapi_asset_cable/0]).

-type openapi_asset_cable() ::
    #{ 'assetType' => binary()
     }.

encode(#{ 'assetType' := AssetType
        }) ->
    #{ 'assetType' => AssetType
     }.
