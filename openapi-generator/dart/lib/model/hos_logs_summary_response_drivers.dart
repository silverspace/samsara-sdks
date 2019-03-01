part of openapi.api;

class HosLogsSummaryResponseDrivers {
  /* The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
  int timeUntilBreak = null;
  /* Name of the vehicle. */
  String vehicleName = null;
  /* The amount of driving time in violation today (in ms). */
  int drivingInViolationToday = null;
  /* ID of the driver. */
  int driverId = null;
  /* The amount of remaining cycle time (in ms). */
  int cycleRemaining = null;
  /* Name of the driver. */
  String driverName = null;
  /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  String dutyStatus = null;
  /* The amount of cycle time (in ms) available tomorrow. */
  int cycleTomorrow = null;
  /* The amount of remaining shift drive time (in ms). */
  int shiftDriveRemaining = null;
  /* The amount of time (in ms) that the driver has been in the current `dutyStatus`. */
  int timeInCurrentStatus = null;
  /* The amount of driving time in violation in this cycle (in ms). */
  int drivingInViolationCycle = null;
  /* The amount of remaining shift time (in ms). */
  int shiftRemaining = null;
  HosLogsSummaryResponseDrivers();

  @override
  String toString() {
    return 'HosLogsSummaryResponseDrivers[timeUntilBreak=$timeUntilBreak, vehicleName=$vehicleName, drivingInViolationToday=$drivingInViolationToday, driverId=$driverId, cycleRemaining=$cycleRemaining, driverName=$driverName, dutyStatus=$dutyStatus, cycleTomorrow=$cycleTomorrow, shiftDriveRemaining=$shiftDriveRemaining, timeInCurrentStatus=$timeInCurrentStatus, drivingInViolationCycle=$drivingInViolationCycle, shiftRemaining=$shiftRemaining, ]';
  }

  HosLogsSummaryResponseDrivers.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['timeUntilBreak'] == null) {
      timeUntilBreak = null;
    } else {
          timeUntilBreak = json['timeUntilBreak'];
    }
    if (json['vehicleName'] == null) {
      vehicleName = null;
    } else {
          vehicleName = json['vehicleName'];
    }
    if (json['drivingInViolationToday'] == null) {
      drivingInViolationToday = null;
    } else {
          drivingInViolationToday = json['drivingInViolationToday'];
    }
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
    if (json['cycleRemaining'] == null) {
      cycleRemaining = null;
    } else {
          cycleRemaining = json['cycleRemaining'];
    }
    if (json['driverName'] == null) {
      driverName = null;
    } else {
          driverName = json['driverName'];
    }
    if (json['dutyStatus'] == null) {
      dutyStatus = null;
    } else {
          dutyStatus = json['dutyStatus'];
    }
    if (json['cycleTomorrow'] == null) {
      cycleTomorrow = null;
    } else {
          cycleTomorrow = json['cycleTomorrow'];
    }
    if (json['shiftDriveRemaining'] == null) {
      shiftDriveRemaining = null;
    } else {
          shiftDriveRemaining = json['shiftDriveRemaining'];
    }
    if (json['timeInCurrentStatus'] == null) {
      timeInCurrentStatus = null;
    } else {
          timeInCurrentStatus = json['timeInCurrentStatus'];
    }
    if (json['drivingInViolationCycle'] == null) {
      drivingInViolationCycle = null;
    } else {
          drivingInViolationCycle = json['drivingInViolationCycle'];
    }
    if (json['shiftRemaining'] == null) {
      shiftRemaining = null;
    } else {
          shiftRemaining = json['shiftRemaining'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'timeUntilBreak': timeUntilBreak,
      'vehicleName': vehicleName,
      'drivingInViolationToday': drivingInViolationToday,
      'driverId': driverId,
      'cycleRemaining': cycleRemaining,
      'driverName': driverName,
      'dutyStatus': dutyStatus,
      'cycleTomorrow': cycleTomorrow,
      'shiftDriveRemaining': shiftDriveRemaining,
      'timeInCurrentStatus': timeInCurrentStatus,
      'drivingInViolationCycle': drivingInViolationCycle,
      'shiftRemaining': shiftRemaining
    };
  }

  static List<HosLogsSummaryResponseDrivers> listFromJson(List<dynamic> json) {
    return json == null ? new List<HosLogsSummaryResponseDrivers>() : json.map((value) => new HosLogsSummaryResponseDrivers.fromJson(value)).toList();
  }

  static Map<String, HosLogsSummaryResponseDrivers> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HosLogsSummaryResponseDrivers>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HosLogsSummaryResponseDrivers.fromJson(value));
    }
    return map;
  }
}

