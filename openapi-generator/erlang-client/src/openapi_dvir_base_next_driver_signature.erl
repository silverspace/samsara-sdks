-module(openapi_dvir_base_next_driver_signature).

-export([encode/1]).

-export_type([openapi_dvir_base_next_driver_signature/0]).

-type openapi_dvir_base_next_driver_signature() ::
    #{ 'driverId' => integer(),
       'name' => binary(),
       'signedAt' => integer(),
       'type' => binary(),
       'email' => binary(),
       'username' => binary()
     }.

encode(#{ 'driverId' := DriverId,
          'name' := Name,
          'signedAt' := SignedAt,
          'type' := Type,
          'email' := Email,
          'username' := Username
        }) ->
    #{ 'driverId' => DriverId,
       'name' => Name,
       'signedAt' => SignedAt,
       'type' => Type,
       'email' => Email,
       'username' => Username
     }.
