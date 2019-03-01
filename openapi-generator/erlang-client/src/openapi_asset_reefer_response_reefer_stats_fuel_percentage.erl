-module(openapi_asset_reefer_response_reefer_stats_fuel_percentage).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_fuel_percentage/0]).

-type openapi_asset_reefer_response_reefer_stats_fuel_percentage() ::
    #{ 'fuelPercentage' => integer(),
       'changedAtMs' => integer()
     }.

encode(#{ 'fuelPercentage' := FuelPercentage,
          'changedAtMs' := ChangedAtMs
        }) ->
    #{ 'fuelPercentage' => FuelPercentage,
       'changedAtMs' => ChangedAtMs
     }.
