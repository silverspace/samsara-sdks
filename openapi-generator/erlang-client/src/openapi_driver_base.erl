-module(openapi_driver_base).

-export([encode/1]).

-export_type([openapi_driver_base/0]).

-type openapi_driver_base() ::
    #{ 'eldAdverseWeatherExemptionEnabled' => boolean(),
       'eldBigDayExemptionEnabled' => boolean(),
       'eldDayStartHour' => integer(),
       'eldExempt' => boolean(),
       'eldExemptReason' => binary(),
       'eldPcEnabled' => boolean(),
       'eldYmEnabled' => boolean(),
       'externalIds' => maps:map(),
       'groupId' => integer(),
       'licenseNumber' => binary(),
       'licenseState' => binary(),
       'name' := binary(),
       'notes' => binary(),
       'phone' => binary(),
       'username' => binary(),
       'vehicleId' => integer()
     }.

encode(#{ 'eldAdverseWeatherExemptionEnabled' := EldAdverseWeatherExemptionEnabled,
          'eldBigDayExemptionEnabled' := EldBigDayExemptionEnabled,
          'eldDayStartHour' := EldDayStartHour,
          'eldExempt' := EldExempt,
          'eldExemptReason' := EldExemptReason,
          'eldPcEnabled' := EldPcEnabled,
          'eldYmEnabled' := EldYmEnabled,
          'externalIds' := ExternalIds,
          'groupId' := GroupId,
          'licenseNumber' := LicenseNumber,
          'licenseState' := LicenseState,
          'name' := Name,
          'notes' := Notes,
          'phone' := Phone,
          'username' := Username,
          'vehicleId' := VehicleId
        }) ->
    #{ 'eldAdverseWeatherExemptionEnabled' => EldAdverseWeatherExemptionEnabled,
       'eldBigDayExemptionEnabled' => EldBigDayExemptionEnabled,
       'eldDayStartHour' => EldDayStartHour,
       'eldExempt' => EldExempt,
       'eldExemptReason' => EldExemptReason,
       'eldPcEnabled' => EldPcEnabled,
       'eldYmEnabled' => EldYmEnabled,
       'externalIds' => ExternalIds,
       'groupId' => GroupId,
       'licenseNumber' => LicenseNumber,
       'licenseState' => LicenseState,
       'name' => Name,
       'notes' => Notes,
       'phone' => Phone,
       'username' => Username,
       'vehicleId' => VehicleId
     }.
