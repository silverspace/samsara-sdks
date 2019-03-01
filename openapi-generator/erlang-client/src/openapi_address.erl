-module(openapi_address).

-export([encode/1]).

-export_type([openapi_address/0]).

-type openapi_address() ::
    #{ 'contacts' => list(),
       'formattedAddress' => binary(),
       'geofence' => openapi_address_geofence:openapi_address_geofence(),
       'id' => integer(),
       'name' => binary(),
       'notes' => binary(),
       'tags' => list()
     }.

encode(#{ 'contacts' := Contacts,
          'formattedAddress' := FormattedAddress,
          'geofence' := Geofence,
          'id' := Id,
          'name' := Name,
          'notes' := Notes,
          'tags' := Tags
        }) ->
    #{ 'contacts' => Contacts,
       'formattedAddress' => FormattedAddress,
       'geofence' => Geofence,
       'id' => Id,
       'name' => Name,
       'notes' => Notes,
       'tags' => Tags
     }.
