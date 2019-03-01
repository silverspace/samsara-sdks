-module(openapi_inline_response_200_5_vehicle_stats).

-export([encode/1]).

-export_type([openapi_inline_response_200_5_vehicle_stats/0]).

-type openapi_inline_response_200_5_vehicle_stats() ::
    #{ 'engineState' => list(),
       'auxInput2' => openapi_aux_input_series:openapi_aux_input_series(),
       'vehicleId' := integer(),
       'auxInput1' => openapi_aux_input_series:openapi_aux_input_series()
     }.

encode(#{ 'engineState' := EngineState,
          'auxInput2' := AuxInput2,
          'vehicleId' := VehicleId,
          'auxInput1' := AuxInput1
        }) ->
    #{ 'engineState' => EngineState,
       'auxInput2' => AuxInput2,
       'vehicleId' => VehicleId,
       'auxInput1' => AuxInput1
     }.
