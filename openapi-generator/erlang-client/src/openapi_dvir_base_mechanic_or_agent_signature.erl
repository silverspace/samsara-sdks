-module(openapi_dvir_base_mechanic_or_agent_signature).

-export([encode/1]).

-export_type([openapi_dvir_base_mechanic_or_agent_signature/0]).

-type openapi_dvir_base_mechanic_or_agent_signature() ::
    #{ 'mechanicUserId' => integer(),
       'driverId' => integer(),
       'name' => binary(),
       'signedAt' => integer(),
       'type' => binary(),
       'email' => binary(),
       'username' => binary()
     }.

encode(#{ 'mechanicUserId' := MechanicUserId,
          'driverId' := DriverId,
          'name' := Name,
          'signedAt' := SignedAt,
          'type' := Type,
          'email' := Email,
          'username' := Username
        }) ->
    #{ 'mechanicUserId' => MechanicUserId,
       'driverId' => DriverId,
       'name' => Name,
       'signedAt' => SignedAt,
       'type' => Type,
       'email' => Email,
       'username' => Username
     }.
