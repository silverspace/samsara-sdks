-module(openapi_vehicle_maintenance).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance/0]).

-type openapi_vehicle_maintenance() ::
    #{ 'id' := integer(),
       'j1939' => openapi_vehicle_maintenance_j1939:openapi_vehicle_maintenance_j1939(),
       'passenger' => openapi_vehicle_maintenance_passenger:openapi_vehicle_maintenance_passenger()
     }.

encode(#{ 'id' := Id,
          'j1939' := J1939,
          'passenger' := Passenger
        }) ->
    #{ 'id' => Id,
       'j1939' => J1939,
       'passenger' => Passenger
     }.
