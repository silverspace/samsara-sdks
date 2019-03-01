-module(openapi_asset_reefer_response_reefer_stats_alarms_1).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_alarms_1/0]).

-export([openapi_asset_reefer_response_reefer_stats_alarms_1/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_alarms_1/0]).

-type openapi_asset_reefer_response_reefer_stats_alarms_1() ::
  [ {'alarms', list(openapi_asset_reefer_response_reefer_stats_alarms:openapi_asset_reefer_response_reefer_stats_alarms()) }
  | {'changedAtMs', integer() }
  ].


openapi_asset_reefer_response_reefer_stats_alarms_1() ->
    openapi_asset_reefer_response_reefer_stats_alarms_1([]).

openapi_asset_reefer_response_reefer_stats_alarms_1(Fields) ->
  Default = [ {'alarms', list(openapi_asset_reefer_response_reefer_stats_alarms:openapi_asset_reefer_response_reefer_stats_alarms()) }
            , {'changedAtMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

