-module(openapi_asset_reefer_response_reefer_stats_return_air_temp).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_return_air_temp/0]).

-type openapi_asset_reefer_response_reefer_stats_return_air_temp() ::
    #{ 'tempInMilliC' => integer(),
       'changedAtMs' => integer()
     }.

encode(#{ 'tempInMilliC' := TempInMilliC,
          'changedAtMs' := ChangedAtMs
        }) ->
    #{ 'tempInMilliC' => TempInMilliC,
       'changedAtMs' => ChangedAtMs
     }.
