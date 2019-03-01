part of openapi.api;

class MachineHistoryResponse {
  
  List<MachineHistoryResponseMachines> machines = [];
  MachineHistoryResponse();

  @override
  String toString() {
    return 'MachineHistoryResponse[machines=$machines, ]';
  }

  MachineHistoryResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['machines'] == null) {
      machines = null;
    } else {
      machines = MachineHistoryResponseMachines.listFromJson(json['machines']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'machines': machines
    };
  }

  static List<MachineHistoryResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<MachineHistoryResponse>() : json.map((value) => new MachineHistoryResponse.fromJson(value)).toList();
  }

  static Map<String, MachineHistoryResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, MachineHistoryResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new MachineHistoryResponse.fromJson(value));
    }
    return map;
  }
}

