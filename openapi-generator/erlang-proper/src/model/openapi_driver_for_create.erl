-module(openapi_driver_for_create).

-include("openapi.hrl").

-export([openapi_driver_for_create/0]).

-export([openapi_driver_for_create/1]).

-export_type([openapi_driver_for_create/0]).

-type openapi_driver_for_create() ::
  [ {'eldAdverseWeatherExemptionEnabled', boolean() }
  | {'eldBigDayExemptionEnabled', boolean() }
  | {'eldDayStartHour', integer() }
  | {'eldExempt', boolean() }
  | {'eldExemptReason', binary() }
  | {'eldPcEnabled', boolean() }
  | {'eldYmEnabled', boolean() }
  | {'externalIds', map() }
  | {'groupId', integer() }
  | {'licenseNumber', binary() }
  | {'licenseState', binary() }
  | {'name', binary() }
  | {'notes', binary() }
  | {'phone', binary() }
  | {'username', binary() }
  | {'vehicleId', integer() }
  | {'password', binary() }
  | {'tagIds', list(integer()) }
  ].


openapi_driver_for_create() ->
    openapi_driver_for_create([]).

openapi_driver_for_create(Fields) ->
  Default = [ {'eldAdverseWeatherExemptionEnabled', boolean() }
            , {'eldBigDayExemptionEnabled', boolean() }
            , {'eldDayStartHour', integer() }
            , {'eldExempt', boolean() }
            , {'eldExemptReason', binary() }
            , {'eldPcEnabled', boolean() }
            , {'eldYmEnabled', boolean() }
            , {'externalIds', map() }
            , {'groupId', integer() }
            , {'licenseNumber', binary() }
            , {'licenseState', binary() }
            , {'name', binary() }
            , {'notes', binary() }
            , {'phone', binary() }
            , {'username', binary() }
            , {'vehicleId', integer() }
            , {'password', binary() }
            , {'tagIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

