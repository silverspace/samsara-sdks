-module(openapi_inline_object_12).

-export([encode/1]).

-export_type([openapi_inline_object_12/0]).

-type openapi_inline_object_12() ::
    #{ 'inspectionType' := binary(),
       'mechanicNotes' => binary(),
       'odometerMiles' => integer(),
       'previousDefectsCorrected' => boolean(),
       'previousDefectsIgnored' => boolean(),
       'safe' := binary(),
       'trailerId' => integer(),
       'userEmail' := binary(),
       'vehicleId' => integer()
     }.

encode(#{ 'inspectionType' := InspectionType,
          'mechanicNotes' := MechanicNotes,
          'odometerMiles' := OdometerMiles,
          'previousDefectsCorrected' := PreviousDefectsCorrected,
          'previousDefectsIgnored' := PreviousDefectsIgnored,
          'safe' := Safe,
          'trailerId' := TrailerId,
          'userEmail' := UserEmail,
          'vehicleId' := VehicleId
        }) ->
    #{ 'inspectionType' => InspectionType,
       'mechanicNotes' => MechanicNotes,
       'odometerMiles' => OdometerMiles,
       'previousDefectsCorrected' => PreviousDefectsCorrected,
       'previousDefectsIgnored' => PreviousDefectsIgnored,
       'safe' => Safe,
       'trailerId' => TrailerId,
       'userEmail' => UserEmail,
       'vehicleId' => VehicleId
     }.
