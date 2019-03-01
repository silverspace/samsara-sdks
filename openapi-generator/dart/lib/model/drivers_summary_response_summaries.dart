part of openapi.api;

class DriversSummaryResponseSummaries {
  /* ID of the driver. */
  int driverId = null;
  /* Distance driven in miles, rounded to two decimal places. */
  double distanceMiles = null;
  /* Duration in milliseconds that driver was driving during the requested time range */
  int driveMs = null;
  /* Duration in milliseconds that driver was on duty or driving during the requested time range */
  int activeMs = null;
  /* Username of the driver. */
  String driverUsername = null;
  /* Group of the driver. */
  int groupId = null;
  /* Name of the driver. */
  String driverName = null;
  /* Duration in milliseconds that driver was on duty during the requested time range */
  int onDutyMs = null;
  DriversSummaryResponseSummaries();

  @override
  String toString() {
    return 'DriversSummaryResponseSummaries[driverId=$driverId, distanceMiles=$distanceMiles, driveMs=$driveMs, activeMs=$activeMs, driverUsername=$driverUsername, groupId=$groupId, driverName=$driverName, onDutyMs=$onDutyMs, ]';
  }

  DriversSummaryResponseSummaries.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
    if (json['distanceMiles'] == null) {
      distanceMiles = null;
    } else {
          distanceMiles = json['distanceMiles'];
    }
    if (json['driveMs'] == null) {
      driveMs = null;
    } else {
          driveMs = json['driveMs'];
    }
    if (json['activeMs'] == null) {
      activeMs = null;
    } else {
          activeMs = json['activeMs'];
    }
    if (json['driverUsername'] == null) {
      driverUsername = null;
    } else {
          driverUsername = json['driverUsername'];
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['driverName'] == null) {
      driverName = null;
    } else {
          driverName = json['driverName'];
    }
    if (json['onDutyMs'] == null) {
      onDutyMs = null;
    } else {
          onDutyMs = json['onDutyMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'driverId': driverId,
      'distanceMiles': distanceMiles,
      'driveMs': driveMs,
      'activeMs': activeMs,
      'driverUsername': driverUsername,
      'groupId': groupId,
      'driverName': driverName,
      'onDutyMs': onDutyMs
    };
  }

  static List<DriversSummaryResponseSummaries> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriversSummaryResponseSummaries>() : json.map((value) => new DriversSummaryResponseSummaries.fromJson(value)).toList();
  }

  static Map<String, DriversSummaryResponseSummaries> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriversSummaryResponseSummaries>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriversSummaryResponseSummaries.fromJson(value));
    }
    return map;
  }
}

