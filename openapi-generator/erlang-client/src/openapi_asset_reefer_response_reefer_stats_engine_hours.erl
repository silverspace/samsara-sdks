-module(openapi_asset_reefer_response_reefer_stats_engine_hours).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_engine_hours/0]).

-type openapi_asset_reefer_response_reefer_stats_engine_hours() ::
    #{ 'engineHours' => integer(),
       'changedAtMs' => integer()
     }.

encode(#{ 'engineHours' := EngineHours,
          'changedAtMs' := ChangedAtMs
        }) ->
    #{ 'engineHours' => EngineHours,
       'changedAtMs' => ChangedAtMs
     }.
