part of openapi.api;

class MachineHistoryResponseVibrations {
  
  double X = null;
  
  double Y = null;
  
  double Z = null;
  
  int time = null;
  MachineHistoryResponseVibrations();

  @override
  String toString() {
    return 'MachineHistoryResponseVibrations[X=$X, Y=$Y, Z=$Z, time=$time, ]';
  }

  MachineHistoryResponseVibrations.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['X'] == null) {
      X = null;
    } else {
          X = json['X'];
    }
    if (json['Y'] == null) {
      Y = null;
    } else {
          Y = json['Y'];
    }
    if (json['Z'] == null) {
      Z = null;
    } else {
          Z = json['Z'];
    }
    if (json['time'] == null) {
      time = null;
    } else {
          time = json['time'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'X': X,
      'Y': Y,
      'Z': Z,
      'time': time
    };
  }

  static List<MachineHistoryResponseVibrations> listFromJson(List<dynamic> json) {
    return json == null ? new List<MachineHistoryResponseVibrations>() : json.map((value) => new MachineHistoryResponseVibrations.fromJson(value)).toList();
  }

  static Map<String, MachineHistoryResponseVibrations> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, MachineHistoryResponseVibrations>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new MachineHistoryResponseVibrations.fromJson(value));
    }
    return map;
  }
}

