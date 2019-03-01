-module(openapi_asset_reefer_response_reefer_stats_set_point).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_set_point/0]).

-type openapi_asset_reefer_response_reefer_stats_set_point() ::
    #{ 'tempInMilliC' => integer(),
       'changedAtMs' => integer()
     }.

encode(#{ 'tempInMilliC' := TempInMilliC,
          'changedAtMs' := ChangedAtMs
        }) ->
    #{ 'tempInMilliC' => TempInMilliC,
       'changedAtMs' => ChangedAtMs
     }.
