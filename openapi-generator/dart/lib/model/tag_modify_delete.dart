part of openapi.api;

class TagModifyDelete {
  /* The assets to be removed from this tag. */
  List<TaggedAssetBase> assets = [];
  /* The sensors to be removed from this tag. */
  List<TaggedSensorBase> sensors = [];
  /* The vehicles to be removed from this tag. */
  List<TaggedVehicleBase> vehicles = [];
  /* The machines to be removed from this tag. */
  List<TaggedMachineBase> machines = [];
  /* The drivers to be removed from this tag. */
  List<TaggedDriverBase> drivers = [];
  TagModifyDelete();

  @override
  String toString() {
    return 'TagModifyDelete[assets=$assets, sensors=$sensors, vehicles=$vehicles, machines=$machines, drivers=$drivers, ]';
  }

  TagModifyDelete.fromJson(Map<String, dynamic> json) {
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

  static List<TagModifyDelete> listFromJson(List<dynamic> json) {
    return json == null ? new List<TagModifyDelete>() : json.map((value) => new TagModifyDelete.fromJson(value)).toList();
  }

  static Map<String, TagModifyDelete> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TagModifyDelete>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TagModifyDelete.fromJson(value));
    }
    return map;
  }
}

