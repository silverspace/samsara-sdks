-module(openapi_asset_reefer_response).

-export([encode/1]).

-export_type([openapi_asset_reefer_response/0]).

-type openapi_asset_reefer_response() ::
    #{ 'assetType' => binary(),
       'id' => integer(),
       'name' => binary(),
       'reeferStats' => openapi_asset_reefer_response_reefer_stats:openapi_asset_reefer_response_reefer_stats()
     }.

encode(#{ 'assetType' := AssetType,
          'id' := Id,
          'name' := Name,
          'reeferStats' := ReeferStats
        }) ->
    #{ 'assetType' => AssetType,
       'id' => Id,
       'name' => Name,
       'reeferStats' => ReeferStats
     }.
