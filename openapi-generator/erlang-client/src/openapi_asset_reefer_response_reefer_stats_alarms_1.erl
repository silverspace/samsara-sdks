-module(openapi_asset_reefer_response_reefer_stats_alarms_1).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_alarms_1/0]).

-type openapi_asset_reefer_response_reefer_stats_alarms_1() ::
    #{ 'alarms' => list(),
       'changedAtMs' => integer()
     }.

encode(#{ 'alarms' := Alarms,
          'changedAtMs' := ChangedAtMs
        }) ->
    #{ 'alarms' => Alarms,
       'changedAtMs' => ChangedAtMs
     }.
