-module(openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes/0]).

-export([openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes/1]).

-export_type([openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes/0]).

-type openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes() ::
  [ {'spnDescription', binary() }
  | {'fmiText', binary() }
  | {'spnId', integer() }
  | {'occurrenceCount', integer() }
  | {'txId', integer() }
  | {'fmiId', integer() }
  ].


openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes() ->
    openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes([]).

openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes(Fields) ->
  Default = [ {'spnDescription', binary() }
            , {'fmiText', binary() }
            , {'spnId', integer() }
            , {'occurrenceCount', integer() }
            , {'txId', integer() }
            , {'fmiId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

