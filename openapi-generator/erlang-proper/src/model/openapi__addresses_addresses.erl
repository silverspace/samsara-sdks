-module(openapi__addresses_addresses).

-include("openapi.hrl").

-export([openapi__addresses_addresses/0]).

-export([openapi__addresses_addresses/1]).

-export_type([openapi__addresses_addresses/0]).

-type openapi__addresses_addresses() ::
  [ {'notes', binary() }
  | {'formattedAddress', binary() }
  | {'geofence', openapi_address_geofence:openapi_address_geofence() }
  | {'tagIds', list(integer()) }
  | {'name', binary() }
  | {'contactIds', list(integer()) }
  ].


openapi__addresses_addresses() ->
    openapi__addresses_addresses([]).

openapi__addresses_addresses(Fields) ->
  Default = [ {'notes', binary() }
            , {'formattedAddress', binary() }
            , {'geofence', openapi_address_geofence:openapi_address_geofence() }
            , {'tagIds', list(integer()) }
            , {'name', binary() }
            , {'contactIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

