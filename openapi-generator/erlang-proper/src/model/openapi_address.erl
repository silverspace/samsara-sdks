-module(openapi_address).

-include("openapi.hrl").

-export([openapi_address/0]).

-export([openapi_address/1]).

-export_type([openapi_address/0]).

-type openapi_address() ::
  [ {'contacts', list(openapi_contact:openapi_contact()) }
  | {'formattedAddress', binary() }
  | {'geofence', openapi_address_geofence:openapi_address_geofence() }
  | {'id', integer() }
  | {'name', binary() }
  | {'notes', binary() }
  | {'tags', list(openapi_tag_metadata:openapi_tag_metadata()) }
  ].


openapi_address() ->
    openapi_address([]).

openapi_address(Fields) ->
  Default = [ {'contacts', list(openapi_contact:openapi_contact()) }
            , {'formattedAddress', binary() }
            , {'geofence', openapi_address_geofence:openapi_address_geofence() }
            , {'id', integer() }
            , {'name', binary() }
            , {'notes', binary() }
            , {'tags', list(openapi_tag_metadata:openapi_tag_metadata()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

