-module(openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes/0]).

-type openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes() ::
    #{ 'dtcShortCode' => binary(),
       'dtcId' => integer(),
       'dtcDescription' => binary()
     }.

encode(#{ 'dtcShortCode' := DtcShortCode,
          'dtcId' := DtcId,
          'dtcDescription' := DtcDescription
        }) ->
    #{ 'dtcShortCode' => DtcShortCode,
       'dtcId' => DtcId,
       'dtcDescription' => DtcDescription
     }.
