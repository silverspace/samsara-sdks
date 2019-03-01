part of openapi.api;

class DriverDailyLogResponseDays {
  /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
  int certifiedAtMs = null;
  /* End of the HOS day, specified in milliseconds UNIX time. */
  int endMs = null;
  /* End of the HOS day, specified in milliseconds UNIX time. */
  int startMs = null;
  /* List of trailer ID's associated with the driver for the day. */
  Object trailerIds = null;
  /* Hours spent on duty or driving, rounded to two decimal places. */
  double activeHours = null;
  /* Distance driven in miles, rounded to two decimal places. */
  double distanceMiles = null;
  /* Milliseconds spent on duty or driving. */
  int activeMs = null;
  /* Whether this HOS day chart was certified by the driver. */
  bool certified = null;
  /* List of vehicle ID's associated with the driver for the day. */
  Object vehicleIds = null;
  DriverDailyLogResponseDays();

  @override
  String toString() {
    return 'DriverDailyLogResponseDays[certifiedAtMs=$certifiedAtMs, endMs=$endMs, startMs=$startMs, trailerIds=$trailerIds, activeHours=$activeHours, distanceMiles=$distanceMiles, activeMs=$activeMs, certified=$certified, vehicleIds=$vehicleIds, ]';
  }

  DriverDailyLogResponseDays.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['certifiedAtMs'] == null) {
      certifiedAtMs = null;
    } else {
          certifiedAtMs = json['certifiedAtMs'];
    }
    if (json['endMs'] == null) {
      endMs = null;
    } else {
          endMs = json['endMs'];
    }
    if (json['startMs'] == null) {
      startMs = null;
    } else {
          startMs = json['startMs'];
    }
    if (json['trailerIds'] == null) {
      trailerIds = null;
    } else {
          trailerIds = json['trailerIds'];
    }
    if (json['activeHours'] == null) {
      activeHours = null;
    } else {
          activeHours = json['activeHours'];
    }
    if (json['distanceMiles'] == null) {
      distanceMiles = null;
    } else {
          distanceMiles = json['distanceMiles'];
    }
    if (json['activeMs'] == null) {
      activeMs = null;
    } else {
          activeMs = json['activeMs'];
    }
    if (json['certified'] == null) {
      certified = null;
    } else {
          certified = json['certified'];
    }
    if (json['vehicleIds'] == null) {
      vehicleIds = null;
    } else {
          vehicleIds = json['vehicleIds'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'certifiedAtMs': certifiedAtMs,
      'endMs': endMs,
      'startMs': startMs,
      'trailerIds': trailerIds,
      'activeHours': activeHours,
      'distanceMiles': distanceMiles,
      'activeMs': activeMs,
      'certified': certified,
      'vehicleIds': vehicleIds
    };
  }

  static List<DriverDailyLogResponseDays> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriverDailyLogResponseDays>() : json.map((value) => new DriverDailyLogResponseDays.fromJson(value)).toList();
  }

  static Map<String, DriverDailyLogResponseDays> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriverDailyLogResponseDays>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriverDailyLogResponseDays.fromJson(value));
    }
    return map;
  }
}

