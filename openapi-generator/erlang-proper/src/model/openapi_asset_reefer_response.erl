-module(openapi_asset_reefer_response).

-include("openapi.hrl").

-export([openapi_asset_reefer_response/0]).

-export([openapi_asset_reefer_response/1]).

-export_type([openapi_asset_reefer_response/0]).

-type openapi_asset_reefer_response() ::
  [ {'assetType', binary() }
  | {'id', integer() }
  | {'name', binary() }
  | {'reeferStats', openapi_asset_reefer_response_reefer_stats:openapi_asset_reefer_response_reefer_stats() }
  ].


openapi_asset_reefer_response() ->
    openapi_asset_reefer_response([]).

openapi_asset_reefer_response(Fields) ->
  Default = [ {'assetType', binary() }
            , {'id', integer() }
            , {'name', binary() }
            , {'reeferStats', openapi_asset_reefer_response_reefer_stats:openapi_asset_reefer_response_reefer_stats() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

