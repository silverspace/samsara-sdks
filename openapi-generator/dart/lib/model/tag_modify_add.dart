part of openapi.api;

class TagModifyAdd {
  /* The assets to be added to this tag. */
  List<TaggedAssetBase> assets = [];
  /* The sensors to be added to this tag. */
  List<TaggedSensorBase> sensors = [];
  /* The vehicles to be added to this tag. */
  List<TaggedVehicleBase> vehicles = [];
  /* The machines to be added to this tag. */
  List<TaggedMachineBase> machines = [];
  /* The drivers to be added to this tag. */
  List<TaggedDriverBase> drivers = [];
  TagModifyAdd();

  @override
  String toString() {
    return 'TagModifyAdd[assets=$assets, sensors=$sensors, vehicles=$vehicles, machines=$machines, drivers=$drivers, ]';
  }

  TagModifyAdd.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assets'] == null) {
      assets = null;
    } else {
      assets = TaggedAssetBase.listFromJson(json['assets']);
    }
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = TaggedSensorBase.listFromJson(json['sensors']);
    }
    if (json['vehicles'] == null) {
      vehicles = null;
    } else {
      vehicles = TaggedVehicleBase.listFromJson(json['vehicles']);
    }
    if (json['machines'] == null) {
      machines = null;
    } else {
      machines = TaggedMachineBase.listFromJson(json['machines']);
    }
    if (json['drivers'] == null) {
      drivers = null;
    } else {
      drivers = TaggedDriverBase.listFromJson(json['drivers']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'assets': assets,
      'sensors': sensors,
      'vehicles': vehicles,
      'machines': machines,
      'drivers': drivers
    };
  }

  static List<TagModifyAdd> listFromJson(List<dynamic> json) {
    return json == null ? new List<TagModifyAdd>() : json.map((value) => new TagModifyAdd.fromJson(value)).toList();
  }

  static Map<String, TagModifyAdd> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TagModifyAdd>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TagModifyAdd.fromJson(value));
    }
    return map;
  }
}

