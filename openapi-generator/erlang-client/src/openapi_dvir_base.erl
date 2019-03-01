-module(openapi_dvir_base).

-export([encode/1]).

-export_type([openapi_dvir_base/0]).

-type openapi_dvir_base() ::
    #{ 'authorSignature' => openapi_dvir_base_author_signature:openapi_dvir_base_author_signature(),
       'defectsCorrected' => boolean(),
       'defectsNeedNotBeCorrected' => boolean(),
       'id' => integer(),
       'inspectionType' => binary(),
       'mechanicNotes' => binary(),
       'mechanicOrAgentSignature' => openapi_dvir_base_mechanic_or_agent_signature:openapi_dvir_base_mechanic_or_agent_signature(),
       'nextDriverSignature' => openapi_dvir_base_next_driver_signature:openapi_dvir_base_next_driver_signature(),
       'odometerMiles' => integer(),
       'timeMs' => integer(),
       'trailerDefects' => list(),
       'trailerId' => integer(),
       'trailerName' => binary(),
       'vehicle' => openapi_dvir_base_vehicle:openapi_dvir_base_vehicle(),
       'vehicleCondition' => binary(),
       'vehicleDefects' => list()
     }.

encode(#{ 'authorSignature' := AuthorSignature,
          'defectsCorrected' := DefectsCorrected,
          'defectsNeedNotBeCorrected' := DefectsNeedNotBeCorrected,
          'id' := Id,
          'inspectionType' := InspectionType,
          'mechanicNotes' := MechanicNotes,
          'mechanicOrAgentSignature' := MechanicOrAgentSignature,
          'nextDriverSignature' := NextDriverSignature,
          'odometerMiles' := OdometerMiles,
          'timeMs' := TimeMs,
          'trailerDefects' := TrailerDefects,
          'trailerId' := TrailerId,
          'trailerName' := TrailerName,
          'vehicle' := Vehicle,
          'vehicleCondition' := VehicleCondition,
          'vehicleDefects' := VehicleDefects
        }) ->
    #{ 'authorSignature' => AuthorSignature,
       'defectsCorrected' => DefectsCorrected,
       'defectsNeedNotBeCorrected' => DefectsNeedNotBeCorrected,
       'id' => Id,
       'inspectionType' => InspectionType,
       'mechanicNotes' => MechanicNotes,
       'mechanicOrAgentSignature' => MechanicOrAgentSignature,
       'nextDriverSignature' => NextDriverSignature,
       'odometerMiles' => OdometerMiles,
       'timeMs' => TimeMs,
       'trailerDefects' => TrailerDefects,
       'trailerId' => TrailerId,
       'trailerName' => TrailerName,
       'vehicle' => Vehicle,
       'vehicleCondition' => VehicleCondition,
       'vehicleDefects' => VehicleDefects
     }.
