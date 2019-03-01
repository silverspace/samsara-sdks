part of openapi.api;

class HosLogsResponseLogs {
  /* Longitude at which the log was recorded. */
  double locLng = null;
  /* The time at which the log/HOS status started in UNIX milliseconds. */
  int logStartMs = null;
  /* ID of the driver. */
  int driverId = null;
  /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  String statusType = null;
  /* City in which the log was recorded. */
  String locCity = null;
  /* ID of the group. */
  int groupId = null;
  /* Name of location at which the log was recorded. */
  String locName = null;
  /* Latitude at which the log was recorded. */
  double locLat = null;
  /* Remark associated with the log entry. */
  String remark = null;
  /* State in which the log was recorded. */
  String locState = null;
  /* ID of the vehicle. */
  int vehicleId = null;
  
  List<int> codriverIds = [];
  HosLogsResponseLogs();

  @override
  String toString() {
    return 'HosLogsResponseLogs[locLng=$locLng, logStartMs=$logStartMs, driverId=$driverId, statusType=$statusType, locCity=$locCity, groupId=$groupId, locName=$locName, locLat=$locLat, remark=$remark, locState=$locState, vehicleId=$vehicleId, codriverIds=$codriverIds, ]';
  }

  HosLogsResponseLogs.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['locLng'] == null) {
      locLng = null;
    } else {
          locLng = json['locLng'];
    }
    if (json['logStartMs'] == null) {
      logStartMs = null;
    } else {
          logStartMs = json['logStartMs'];
    }
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
    if (json['statusType'] == null) {
      statusType = null;
    } else {
          statusType = json['statusType'];
    }
    if (json['locCity'] == null) {
      locCity = null;
    } else {
          locCity = json['locCity'];
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['locName'] == null) {
      locName = null;
    } else {
          locName = json['locName'];
    }
    if (json['locLat'] == null) {
      locLat = null;
    } else {
          locLat = json['locLat'];
    }
    if (json['remark'] == null) {
      remark = null;
    } else {
          remark = json['remark'];
    }
    if (json['locState'] == null) {
      locState = null;
    } else {
          locState = json['locState'];
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
    if (json['codriverIds'] == null) {
      codriverIds = null;
    } else {
      codriverIds = (json['codriverIds'] as List).cast<int>();
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'locLng': locLng,
      'logStartMs': logStartMs,
      'driverId': driverId,
      'statusType': statusType,
      'locCity': locCity,
      'groupId': groupId,
      'locName': locName,
      'locLat': locLat,
      'remark': remark,
      'locState': locState,
      'vehicleId': vehicleId,
      'codriverIds': codriverIds
    };
  }

  static List<HosLogsResponseLogs> listFromJson(List<dynamic> json) {
    return json == null ? new List<HosLogsResponseLogs>() : json.map((value) => new HosLogsResponseLogs.fromJson(value)).toList();
  }

  static Map<String, HosLogsResponseLogs> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HosLogsResponseLogs>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HosLogsResponseLogs.fromJson(value));
    }
    return map;
  }
}

