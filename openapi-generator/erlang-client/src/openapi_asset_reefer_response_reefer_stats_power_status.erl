-module(openapi_asset_reefer_response_reefer_stats_power_status).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_power_status/0]).

-type openapi_asset_reefer_response_reefer_stats_power_status() ::
    #{ 'changedAtMs' => integer(),
       'status' => binary()
     }.

encode(#{ 'changedAtMs' := ChangedAtMs,
          'status' := Status
        }) ->
    #{ 'changedAtMs' => ChangedAtMs,
       'status' => Status
     }.
