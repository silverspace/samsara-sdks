-module(openapi_asset_reefer_response_reefer_stats_return_air_temp).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_return_air_temp/0]).

-export([openapi_asset_reefer_response_reefer_stats_return_air_temp/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_return_air_temp/0]).

-type openapi_asset_reefer_response_reefer_stats_return_air_temp() ::
  [ {'tempInMilliC', integer() }
  | {'changedAtMs', integer() }
  ].


openapi_asset_reefer_response_reefer_stats_return_air_temp() ->
    openapi_asset_reefer_response_reefer_stats_return_air_temp([]).

openapi_asset_reefer_response_reefer_stats_return_air_temp(Fields) ->
  Default = [ {'tempInMilliC', integer() }
            , {'changedAtMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

