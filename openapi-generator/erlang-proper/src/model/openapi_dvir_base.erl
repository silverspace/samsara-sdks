-module(openapi_dvir_base).

-include("openapi.hrl").

-export([openapi_dvir_base/0]).

-export([openapi_dvir_base/1]).

-export_type([openapi_dvir_base/0]).

-type openapi_dvir_base() ::
  [ {'authorSignature', openapi_dvir_base_author_signature:openapi_dvir_base_author_signature() }
  | {'defectsCorrected', boolean() }
  | {'defectsNeedNotBeCorrected', boolean() }
  | {'id', integer() }
  | {'inspectionType', binary() }
  | {'mechanicNotes', binary() }
  | {'mechanicOrAgentSignature', openapi_dvir_base_mechanic_or_agent_signature:openapi_dvir_base_mechanic_or_agent_signature() }
  | {'nextDriverSignature', openapi_dvir_base_next_driver_signature:openapi_dvir_base_next_driver_signature() }
  | {'odometerMiles', integer() }
  | {'timeMs', integer() }
  | {'trailerDefects', list(openapi_dvir_base_trailer_defects:openapi_dvir_base_trailer_defects()) }
  | {'trailerId', integer() }
  | {'trailerName', binary() }
  | {'vehicle', openapi_dvir_base_vehicle:openapi_dvir_base_vehicle() }
  | {'vehicleCondition', binary() }
  | {'vehicleDefects', list(openapi_dvir_base_trailer_defects:openapi_dvir_base_trailer_defects()) }
  ].


openapi_dvir_base() ->
    openapi_dvir_base([]).

openapi_dvir_base(Fields) ->
  Default = [ {'authorSignature', openapi_dvir_base_author_signature:openapi_dvir_base_author_signature() }
            , {'defectsCorrected', boolean() }
            , {'defectsNeedNotBeCorrected', boolean() }
            , {'id', integer() }
            , {'inspectionType', binary() }
            , {'mechanicNotes', binary() }
            , {'mechanicOrAgentSignature', openapi_dvir_base_mechanic_or_agent_signature:openapi_dvir_base_mechanic_or_agent_signature() }
            , {'nextDriverSignature', openapi_dvir_base_next_driver_signature:openapi_dvir_base_next_driver_signature() }
            , {'odometerMiles', integer() }
            , {'timeMs', integer() }
            , {'trailerDefects', list(openapi_dvir_base_trailer_defects:openapi_dvir_base_trailer_defects()) }
            , {'trailerId', integer() }
            , {'trailerName', binary() }
            , {'vehicle', openapi_dvir_base_vehicle:openapi_dvir_base_vehicle() }
            , {'vehicleCondition', binary() }
            , {'vehicleDefects', list(openapi_dvir_base_trailer_defects:openapi_dvir_base_trailer_defects()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

