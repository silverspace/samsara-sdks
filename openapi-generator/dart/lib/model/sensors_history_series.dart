part of openapi.api;

class SensorsHistorySeries {
  /* Field to query. */
  String field = null;
  //enum fieldEnum {  ambientTemperature,  probeTemperature,  currentLoop1Raw,  currentLoop1Mapped,  currentLoop2Raw,  currentLoop2Mapped,  pmPowerTotal,  pmPhase1Power,  pmPhase2Power,  pmPhase3Power,  pmPhase1PowerFactor,  pmPhase2PowerFactor,  pmPhase3PowerFactor,  };{
  /* Sensor ID to query. */
  int widgetId = null;
  SensorsHistorySeries();

  @override
  String toString() {
    return 'SensorsHistorySeries[field=$field, widgetId=$widgetId, ]';
  }

  SensorsHistorySeries.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['field'] == null) {
      field = null;
    } else {
          field = json['field'];
    }
    if (json['widgetId'] == null) {
      widgetId = null;
    } else {
          widgetId = json['widgetId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'field': field,
      'widgetId': widgetId
    };
  }

  static List<SensorsHistorySeries> listFromJson(List<dynamic> json) {
    return json == null ? new List<SensorsHistorySeries>() : json.map((value) => new SensorsHistorySeries.fromJson(value)).toList();
  }

  static Map<String, SensorsHistorySeries> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SensorsHistorySeries>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SensorsHistorySeries.fromJson(value));
    }
    return map;
  }
}

