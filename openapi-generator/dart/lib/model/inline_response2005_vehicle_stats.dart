part of openapi.api;

class InlineResponse2005VehicleStats {
  
  List<EngineState> engineState = [];
  
  AuxInputSeries auxInput2 = null;
  /* ID of the vehicle. */
  int vehicleId = null;
  
  AuxInputSeries auxInput1 = null;
  InlineResponse2005VehicleStats();

  @override
  String toString() {
    return 'InlineResponse2005VehicleStats[engineState=$engineState, auxInput2=$auxInput2, vehicleId=$vehicleId, auxInput1=$auxInput1, ]';
  }

  InlineResponse2005VehicleStats.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['engineState'] == null) {
      engineState = null;
    } else {
      engineState = EngineState.listFromJson(json['engineState']);
    }
    if (json['auxInput2'] == null) {
      auxInput2 = null;
    } else {
      auxInput2 = new AuxInputSeries.fromJson(json['auxInput2']);
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
    if (json['auxInput1'] == null) {
      auxInput1 = null;
    } else {
      auxInput1 = new AuxInputSeries.fromJson(json['auxInput1']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'engineState': engineState,
      'auxInput2': auxInput2,
      'vehicleId': vehicleId,
      'auxInput1': auxInput1
    };
  }

  static List<InlineResponse2005VehicleStats> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2005VehicleStats>() : json.map((value) => new InlineResponse2005VehicleStats.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2005VehicleStats> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2005VehicleStats>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2005VehicleStats.fromJson(value));
    }
    return map;
  }
}

