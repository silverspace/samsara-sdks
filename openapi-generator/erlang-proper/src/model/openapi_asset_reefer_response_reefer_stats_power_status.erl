-module(openapi_asset_reefer_response_reefer_stats_power_status).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_power_status/0]).

-export([openapi_asset_reefer_response_reefer_stats_power_status/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_power_status/0]).

-type openapi_asset_reefer_response_reefer_stats_power_status() ::
  [ {'changedAtMs', integer() }
  | {'status', binary() }
  ].


openapi_asset_reefer_response_reefer_stats_power_status() ->
    openapi_asset_reefer_response_reefer_stats_power_status([]).

openapi_asset_reefer_response_reefer_stats_power_status(Fields) ->
  Default = [ {'changedAtMs', integer() }
            , {'status', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

