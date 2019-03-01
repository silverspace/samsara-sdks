part of openapi.api;

class TagCreate {
  /* The assets that belong to this tag. */
  List<TaggedAssetBase> assets = [];
  /* The drivers that belong to this tag. */
  List<TaggedDriverBase> drivers = [];
  /* The machines that belong to this tag. */
  List<TaggedMachineBase> machines = [];
  /* Name of this tag. */
  String name = null;
  /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  int parentTagId = null;
  /* The sensors that belong to this tag. */
  List<TaggedSensorBase> sensors = [];
  /* The vehicles that belong to this tag. */
  List<TaggedVehicleBase> vehicles = [];
  TagCreate();

  @override
  String toString() {
    return 'TagCreate[assets=$assets, drivers=$drivers, machines=$machines, name=$name, parentTagId=$parentTagId, sensors=$sensors, vehicles=$vehicles, ]';
  }

  TagCreate.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assets'] == null) {
      assets = null;
    } else {
      assets = TaggedAssetBase.listFromJson(json['assets']);
    }
    if (json['drivers'] == null) {
      drivers = null;
    } else {
      drivers = TaggedDriverBase.listFromJson(json['drivers']);
    }
    if (json['machines'] == null) {
      machines = null;
    } else {
      machines = TaggedMachineBase.listFromJson(json['machines']);
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['parentTagId'] == null) {
      parentTagId = null;
    } else {
          parentTagId = json['parentTagId'];
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
  }

  Map<String, dynamic> toJson() {
    return {
      'assets': assets,
      'drivers': drivers,
      'machines': machines,
      'name': name,
      'parentTagId': parentTagId,
      'sensors': sensors,
      'vehicles': vehicles
    };
  }

  static List<TagCreate> listFromJson(List<dynamic> json) {
    return json == null ? new List<TagCreate>() : json.map((value) => new TagCreate.fromJson(value)).toList();
  }

  static Map<String, TagCreate> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TagCreate>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TagCreate.fromJson(value));
    }
    return map;
  }
}

