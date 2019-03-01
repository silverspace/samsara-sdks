-module(openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes/0]).

-type openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes() ::
    #{ 'spnDescription' => binary(),
       'fmiText' => binary(),
       'spnId' => integer(),
       'occurrenceCount' => integer(),
       'txId' => integer(),
       'fmiId' => integer()
     }.

encode(#{ 'spnDescription' := SpnDescription,
          'fmiText' := FmiText,
          'spnId' := SpnId,
          'occurrenceCount' := OccurrenceCount,
          'txId' := TxId,
          'fmiId' := FmiId
        }) ->
    #{ 'spnDescription' => SpnDescription,
       'fmiText' => FmiText,
       'spnId' => SpnId,
       'occurrenceCount' => OccurrenceCount,
       'txId' => TxId,
       'fmiId' => FmiId
     }.
