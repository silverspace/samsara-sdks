-module(openapi_hos_authentication_logs_response_authentication_logs).

-export([encode/1]).

-export_type([openapi_hos_authentication_logs_response_authentication_logs/0]).

-type openapi_hos_authentication_logs_response_authentication_logs() ::
    #{ 'actionType' => binary(),
       'address' => binary(),
       'city' => binary(),
       'happenedAtMs' => integer(),
       'addressName' => binary(),
       'state' => binary()
     }.

encode(#{ 'actionType' := ActionType,
          'address' := Address,
          'city' := City,
          'happenedAtMs' := HappenedAtMs,
          'addressName' := AddressName,
          'state' := State
        }) ->
    #{ 'actionType' => ActionType,
       'address' => Address,
       'city' => City,
       'happenedAtMs' => HappenedAtMs,
       'addressName' => AddressName,
       'state' => State
     }.
