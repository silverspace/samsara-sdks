-module(openapi_vehicle_harsh_event_response).

-export([encode/1]).

-export_type([openapi_vehicle_harsh_event_response/0]).

-type openapi_vehicle_harsh_event_response() ::
    #{ 'downloadForwardVideoUrl' => binary(),
       'downloadInwardVideoUrl' => binary(),
       'downloadTrackedInwardVideoUrl' => binary(),
       'harshEventType' := binary(),
       'incidentReportUrl' := binary(),
       'isDistracted' => boolean(),
       'location' => openapi_vehicle_harsh_event_response_location:openapi_vehicle_harsh_event_response_location()
     }.

encode(#{ 'downloadForwardVideoUrl' := DownloadForwardVideoUrl,
          'downloadInwardVideoUrl' := DownloadInwardVideoUrl,
          'downloadTrackedInwardVideoUrl' := DownloadTrackedInwardVideoUrl,
          'harshEventType' := HarshEventType,
          'incidentReportUrl' := IncidentReportUrl,
          'isDistracted' := IsDistracted,
          'location' := Location
        }) ->
    #{ 'downloadForwardVideoUrl' => DownloadForwardVideoUrl,
       'downloadInwardVideoUrl' => DownloadInwardVideoUrl,
       'downloadTrackedInwardVideoUrl' => DownloadTrackedInwardVideoUrl,
       'harshEventType' => HarshEventType,
       'incidentReportUrl' => IncidentReportUrl,
       'isDistracted' => IsDistracted,
       'location' => Location
     }.
