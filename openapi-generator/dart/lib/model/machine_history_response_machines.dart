part of openapi.api;

class MachineHistoryResponseMachines {
  /* Machine name */
  String name = null;
  /* Machine ID */
  int id = null;
  /* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
  List<MachineHistoryResponseVibrations> vibrations = [];
  MachineHistoryResponseMachines();

  @override
  String toString() {
    return 'MachineHistoryResponseMachines[name=$name, id=$id, vibrations=$vibrations, ]';
  }

  MachineHistoryResponseMachines.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['vibrations'] == null) {
      vibrations = null;
    } else {
      vibrations = MachineHistoryResponseVibrations.listFromJson(json['vibrations']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'id': id,
      'vibrations': vibrations
    };
  }

  static List<MachineHistoryResponseMachines> listFromJson(List<dynamic> json) {
    return json == null ? new List<MachineHistoryResponseMachines>() : json.map((value) => new MachineHistoryResponseMachines.fromJson(value)).toList();
  }

  static Map<String, MachineHistoryResponseMachines> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, MachineHistoryResponseMachines>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new MachineHistoryResponseMachines.fromJson(value));
    }
    return map;
  }
}

