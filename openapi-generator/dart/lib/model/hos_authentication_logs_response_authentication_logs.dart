part of openapi.api;

class HosAuthenticationLogsResponseAuthenticationLogs {
  /* The log type - one of 'signin' or 'signout' */
  String actionType = null;
  /* Address at which the log was recorded, if applicable. */
  String address = null;
  /* City in which the log was recorded, if applicable. */
  String city = null;
  /* The time at which the event was recorded in UNIX milliseconds. */
  int happenedAtMs = null;
  /* Address name from the group address book at which the log was recorded, if applicable. */
  String addressName = null;
  /* State in which the log was recorded, if applicable. */
  String state = null;
  HosAuthenticationLogsResponseAuthenticationLogs();

  @override
  String toString() {
    return 'HosAuthenticationLogsResponseAuthenticationLogs[actionType=$actionType, address=$address, city=$city, happenedAtMs=$happenedAtMs, addressName=$addressName, state=$state, ]';
  }

  HosAuthenticationLogsResponseAuthenticationLogs.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['actionType'] == null) {
      actionType = null;
    } else {
          actionType = json['actionType'];
    }
    if (json['address'] == null) {
      address = null;
    } else {
          address = json['address'];
    }
    if (json['city'] == null) {
      city = null;
    } else {
          city = json['city'];
    }
    if (json['happenedAtMs'] == null) {
      happenedAtMs = null;
    } else {
          happenedAtMs = json['happenedAtMs'];
    }
    if (json['addressName'] == null) {
      addressName = null;
    } else {
          addressName = json['addressName'];
    }
    if (json['state'] == null) {
      state = null;
    } else {
          state = json['state'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'actionType': actionType,
      'address': address,
      'city': city,
      'happenedAtMs': happenedAtMs,
      'addressName': addressName,
      'state': state
    };
  }

  static List<HosAuthenticationLogsResponseAuthenticationLogs> listFromJson(List<dynamic> json) {
    return json == null ? new List<HosAuthenticationLogsResponseAuthenticationLogs>() : json.map((value) => new HosAuthenticationLogsResponseAuthenticationLogs.fromJson(value)).toList();
  }

  static Map<String, HosAuthenticationLogsResponseAuthenticationLogs> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HosAuthenticationLogsResponseAuthenticationLogs>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HosAuthenticationLogsResponseAuthenticationLogs.fromJson(value));
    }
    return map;
  }
}

