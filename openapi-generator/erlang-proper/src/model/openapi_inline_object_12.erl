-module(openapi_inline_object_12).

-include("openapi.hrl").

-export([openapi_inline_object_12/0]).

-export([openapi_inline_object_12/1]).

-export_type([openapi_inline_object_12/0]).

-type openapi_inline_object_12() ::
  [ {'inspectionType', binary() }
  | {'mechanicNotes', binary() }
  | {'odometerMiles', integer() }
  | {'previousDefectsCorrected', boolean() }
  | {'previousDefectsIgnored', boolean() }
  | {'safe', binary() }
  | {'trailerId', integer() }
  | {'userEmail', binary() }
  | {'vehicleId', integer() }
  ].


openapi_inline_object_12() ->
    openapi_inline_object_12([]).

openapi_inline_object_12(Fields) ->
  Default = [ {'inspectionType', elements([<<"mechanic">>]) }
            , {'mechanicNotes', binary() }
            , {'odometerMiles', integer() }
            , {'previousDefectsCorrected', boolean() }
            , {'previousDefectsIgnored', boolean() }
            , {'safe', elements([<<"safe">>, <<"unsafe">>]) }
            , {'trailerId', integer() }
            , {'userEmail', binary() }
            , {'vehicleId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

