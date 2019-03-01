-module(openapi_driver).

-include("openapi.hrl").

-export([openapi_driver/0]).

-export([openapi_driver/1]).

-export_type([openapi_driver/0]).

-type openapi_driver() ::
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
  | {'id', integer() }
  | {'isDeactivated', boolean() }
  | {'tags', list(openapi_tag_metadata:openapi_tag_metadata()) }
  ].


openapi_driver() ->
    openapi_driver([]).

openapi_driver(Fields) ->
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
            , {'id', integer() }
            , {'isDeactivated', boolean() }
            , {'tags', list(openapi_tag_metadata:openapi_tag_metadata()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

