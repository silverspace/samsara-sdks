-module(openapi__addresses_addresses).

-export([encode/1]).

-export_type([openapi__addresses_addresses/0]).

-type openapi__addresses_addresses() ::
    #{ 'notes' => binary(),
       'formattedAddress' := binary(),
       'geofence' := openapi_address_geofence:openapi_address_geofence(),
       'tagIds' => list(),
       'name' := binary(),
       'contactIds' => list()
     }.

encode(#{ 'notes' := Notes,
          'formattedAddress' := FormattedAddress,
          'geofence' := Geofence,
          'tagIds' := TagIds,
          'name' := Name,
          'contactIds' := ContactIds
        }) ->
    #{ 'notes' => Notes,
       'formattedAddress' => FormattedAddress,
       'geofence' => Geofence,
       'tagIds' => TagIds,
       'name' => Name,
       'contactIds' => ContactIds
     }.
