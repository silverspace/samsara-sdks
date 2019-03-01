part of openapi.api;

class VehicleSafetyScoreResponse {
  /* Crash event count */
  int crashCount = null;
  /* Harsh acceleration event count */
  int harshAccelCount = null;
  /* Harsh braking event count */
  int harshBrakingCount = null;
  
  List<SafetyReportHarshEvent> harshEvents = [];
  /* Harsh turning event count */
  int harshTurningCount = null;
  /* Safety Score */
  int safetyScore = null;
  /* Safety Score Rank */
  String safetyScoreRank = null;
  /* Amount of time driven over the speed limit in milliseconds */
  int timeOverSpeedLimitMs = null;
  /* Total distance driven in meters */
  int totalDistanceDrivenMeters = null;
  /* Total harsh event count */
  int totalHarshEventCount = null;
  /* Amount of time driven in milliseconds */
  int totalTimeDrivenMs = null;
  /* Vehicle ID */
  int vehicleId = null;
  VehicleSafetyScoreResponse();

  @override
  String toString() {
    return 'VehicleSafetyScoreResponse[crashCount=$crashCount, harshAccelCount=$harshAccelCount, harshBrakingCount=$harshBrakingCount, harshEvents=$harshEvents, harshTurningCount=$harshTurningCount, safetyScore=$safetyScore, safetyScoreRank=$safetyScoreRank, timeOverSpeedLimitMs=$timeOverSpeedLimitMs, totalDistanceDrivenMeters=$totalDistanceDrivenMeters, totalHarshEventCount=$totalHarshEventCount, totalTimeDrivenMs=$totalTimeDrivenMs, vehicleId=$vehicleId, ]';
  }

  VehicleSafetyScoreResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['crashCount'] == null) {
      crashCount = null;
    } else {
          crashCount = json['crashCount'];
    }
    if (json['harshAccelCount'] == null) {
      harshAccelCount = null;
    } else {
          harshAccelCount = json['harshAccelCount'];
    }
    if (json['harshBrakingCount'] == null) {
      harshBrakingCount = null;
    } else {
          harshBrakingCount = json['harshBrakingCount'];
    }
    if (json['harshEvents'] == null) {
      harshEvents = null;
    } else {
      harshEvents = SafetyReportHarshEvent.listFromJson(json['harshEvents']);
    }
    if (json['harshTurningCount'] == null) {
      harshTurningCount = null;
    } else {
          harshTurningCount = json['harshTurningCount'];
    }
    if (json['safetyScore'] == null) {
      safetyScore = null;
    } else {
          safetyScore = json['safetyScore'];
    }
    if (json['safetyScoreRank'] == null) {
      safetyScoreRank = null;
    } else {
          safetyScoreRank = json['safetyScoreRank'];
    }
    if (json['timeOverSpeedLimitMs'] == null) {
      timeOverSpeedLimitMs = null;
    } else {
          timeOverSpeedLimitMs = json['timeOverSpeedLimitMs'];
    }
    if (json['totalDistanceDrivenMeters'] == null) {
      totalDistanceDrivenMeters = null;
    } else {
          totalDistanceDrivenMeters = json['totalDistanceDrivenMeters'];
    }
    if (json['totalHarshEventCount'] == null) {
      totalHarshEventCount = null;
    } else {
          totalHarshEventCount = json['totalHarshEventCount'];
    }
    if (json['totalTimeDrivenMs'] == null) {
      totalTimeDrivenMs = null;
    } else {
          totalTimeDrivenMs = json['totalTimeDrivenMs'];
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'crashCount': crashCount,
      'harshAccelCount': harshAccelCount,
      'harshBrakingCount': harshBrakingCount,
      'harshEvents': harshEvents,
      'harshTurningCount': harshTurningCount,
      'safetyScore': safetyScore,
      'safetyScoreRank': safetyScoreRank,
      'timeOverSpeedLimitMs': timeOverSpeedLimitMs,
      'totalDistanceDrivenMeters': totalDistanceDrivenMeters,
      'totalHarshEventCount': totalHarshEventCount,
      'totalTimeDrivenMs': totalTimeDrivenMs,
      'vehicleId': vehicleId
    };
  }

  static List<VehicleSafetyScoreResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleSafetyScoreResponse>() : json.map((value) => new VehicleSafetyScoreResponse.fromJson(value)).toList();
  }

  static Map<String, VehicleSafetyScoreResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleSafetyScoreResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleSafetyScoreResponse.fromJson(value));
    }
    return map;
  }
}

