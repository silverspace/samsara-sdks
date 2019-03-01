-module(openapi_driver_base).

-include("openapi.hrl").

-export([openapi_driver_base/0]).

-export([openapi_driver_base/1]).

-export_type([openapi_driver_base/0]).

-type openapi_driver_base() ::
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
  ].


openapi_driver_base() ->
    openapi_driver_base([]).

openapi_driver_base(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

