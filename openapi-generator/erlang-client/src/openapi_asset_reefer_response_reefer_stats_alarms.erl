-module(openapi_asset_reefer_response_reefer_stats_alarms).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_alarms/0]).

-type openapi_asset_reefer_response_reefer_stats_alarms() ::
    #{ 'severity' => integer(),
       'operatorAction' => binary(),
       'description' => binary(),
       'alarmCode' => integer()
     }.

encode(#{ 'severity' := Severity,
          'operatorAction' := OperatorAction,
          'description' := Description,
          'alarmCode' := AlarmCode
        }) ->
    #{ 'severity' => Severity,
       'operatorAction' => OperatorAction,
       'description' => Description,
       'alarmCode' => AlarmCode
     }.
