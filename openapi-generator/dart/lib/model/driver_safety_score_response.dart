part of openapi.api;

class DriverSafetyScoreResponse {
  /* Crash event count */
  int crashCount = null;
  /* Driver ID */
  int driverId = null;
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
  DriverSafetyScoreResponse();

  @override
  String toString() {
    return 'DriverSafetyScoreResponse[crashCount=$crashCount, driverId=$driverId, harshAccelCount=$harshAccelCount, harshBrakingCount=$harshBrakingCount, harshEvents=$harshEvents, harshTurningCount=$harshTurningCount, safetyScore=$safetyScore, safetyScoreRank=$safetyScoreRank, timeOverSpeedLimitMs=$timeOverSpeedLimitMs, totalDistanceDrivenMeters=$totalDistanceDrivenMeters, totalHarshEventCount=$totalHarshEventCount, totalTimeDrivenMs=$totalTimeDrivenMs, ]';
  }

  DriverSafetyScoreResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['crashCount'] == null) {
      crashCount = null;
    } else {
          crashCount = json['crashCount'];
    }
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
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
  }

  Map<String, dynamic> toJson() {
    return {
      'crashCount': crashCount,
      'driverId': driverId,
      'harshAccelCount': harshAccelCount,
      'harshBrakingCount': harshBrakingCount,
      'harshEvents': harshEvents,
      'harshTurningCount': harshTurningCount,
      'safetyScore': safetyScore,
      'safetyScoreRank': safetyScoreRank,
      'timeOverSpeedLimitMs': timeOverSpeedLimitMs,
      'totalDistanceDrivenMeters': totalDistanceDrivenMeters,
      'totalHarshEventCount': totalHarshEventCount,
      'totalTimeDrivenMs': totalTimeDrivenMs
    };
  }

  static List<DriverSafetyScoreResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriverSafetyScoreResponse>() : json.map((value) => new DriverSafetyScoreResponse.fromJson(value)).toList();
  }

  static Map<String, DriverSafetyScoreResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriverSafetyScoreResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriverSafetyScoreResponse.fromJson(value));
    }
    return map;
  }
}

