-module(openapi_inline_object_1).

-export([encode/1]).

-export_type([openapi_inline_object_1/0]).

-type openapi_inline_object_1() ::
    #{ 'contactIds' => list(),
       'formattedAddress' => binary(),
       'geofence' => openapi_address_geofence:openapi_address_geofence(),
       'name' => binary(),
       'notes' => binary(),
       'tagIds' => list()
     }.

encode(#{ 'contactIds' := ContactIds,
          'formattedAddress' := FormattedAddress,
          'geofence' := Geofence,
          'name' := Name,
          'notes' := Notes,
          'tagIds' := TagIds
        }) ->
    #{ 'contactIds' => ContactIds,
       'formattedAddress' => FormattedAddress,
       'geofence' => Geofence,
       'name' => Name,
       'notes' => Notes,
       'tagIds' => TagIds
     }.
