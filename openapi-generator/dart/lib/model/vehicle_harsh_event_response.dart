part of openapi.api;

class VehicleHarshEventResponse {
  /* URL for downloading the forward facing video */
  String downloadForwardVideoUrl = null;
  /* URL for downloading the inward facing video */
  String downloadInwardVideoUrl = null;
  /* URL for downloading the tracked inward facing video */
  String downloadTrackedInwardVideoUrl = null;
  /* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
  String harshEventType = null;
  /* URL of the associated incident report page */
  String incidentReportUrl = null;
  /* Whether the driver was deemed distracted during this harsh event */
  bool isDistracted = null;
  
  VehicleHarshEventResponseLocation location = null;
  VehicleHarshEventResponse();

  @override
  String toString() {
    return 'VehicleHarshEventResponse[downloadForwardVideoUrl=$downloadForwardVideoUrl, downloadInwardVideoUrl=$downloadInwardVideoUrl, downloadTrackedInwardVideoUrl=$downloadTrackedInwardVideoUrl, harshEventType=$harshEventType, incidentReportUrl=$incidentReportUrl, isDistracted=$isDistracted, location=$location, ]';
  }

  VehicleHarshEventResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['downloadForwardVideoUrl'] == null) {
      downloadForwardVideoUrl = null;
    } else {
          downloadForwardVideoUrl = json['downloadForwardVideoUrl'];
    }
    if (json['downloadInwardVideoUrl'] == null) {
      downloadInwardVideoUrl = null;
    } else {
          downloadInwardVideoUrl = json['downloadInwardVideoUrl'];
    }
    if (json['downloadTrackedInwardVideoUrl'] == null) {
      downloadTrackedInwardVideoUrl = null;
    } else {
          downloadTrackedInwardVideoUrl = json['downloadTrackedInwardVideoUrl'];
    }
    if (json['harshEventType'] == null) {
      harshEventType = null;
    } else {
          harshEventType = json['harshEventType'];
    }
    if (json['incidentReportUrl'] == null) {
      incidentReportUrl = null;
    } else {
          incidentReportUrl = json['incidentReportUrl'];
    }
    if (json['isDistracted'] == null) {
      isDistracted = null;
    } else {
          isDistracted = json['isDistracted'];
    }
    if (json['location'] == null) {
      location = null;
    } else {
      location = new VehicleHarshEventResponseLocation.fromJson(json['location']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'downloadForwardVideoUrl': downloadForwardVideoUrl,
      'downloadInwardVideoUrl': downloadInwardVideoUrl,
      'downloadTrackedInwardVideoUrl': downloadTrackedInwardVideoUrl,
      'harshEventType': harshEventType,
      'incidentReportUrl': incidentReportUrl,
      'isDistracted': isDistracted,
      'location': location
    };
  }

  static List<VehicleHarshEventResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleHarshEventResponse>() : json.map((value) => new VehicleHarshEventResponse.fromJson(value)).toList();
  }

  static Map<String, VehicleHarshEventResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleHarshEventResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleHarshEventResponse.fromJson(value));
    }
    return map;
  }
}

