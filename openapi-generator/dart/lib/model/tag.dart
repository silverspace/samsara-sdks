part of openapi.api;

class Tag {
  /* The addresses that belong to this tag. */
  List<TaggedAddress> addresses = [];
  /* The assets that belong to this tag. */
  List<TaggedAsset> assets = [];
  /* The drivers that belong to this tag. */
  List<TaggedDriver> drivers = [];
  /* The GroupID that this tag belongs to. */
  int groupId = null;
  /* The ID of this tag. */
  int id = null;
  /* The machines that belong to this tag. */
  List<TaggedMachine> machines = [];
  /* Name of this tag. */
  String name = null;
  /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  int parentTagId = null;
  /* The sensors that belong to this tag. */
  List<TaggedSensor> sensors = [];
  /* The vehicles that belong to this tag. */
  List<TaggedVehicle> vehicles = [];
  Tag();

  @override
  String toString() {
    return 'Tag[addresses=$addresses, assets=$assets, drivers=$drivers, groupId=$groupId, id=$id, machines=$machines, name=$name, parentTagId=$parentTagId, sensors=$sensors, vehicles=$vehicles, ]';
  }

  Tag.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['addresses'] == null) {
      addresses = null;
    } else {
      addresses = TaggedAddress.listFromJson(json['addresses']);
    }
    if (json['assets'] == null) {
      assets = null;
    } else {
      assets = TaggedAsset.listFromJson(json['assets']);
    }
    if (json['drivers'] == null) {
      drivers = null;
    } else {
      drivers = TaggedDriver.listFromJson(json['drivers']);
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['machines'] == null) {
      machines = null;
    } else {
      machines = TaggedMachine.listFromJson(json['machines']);
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
      sensors = TaggedSensor.listFromJson(json['sensors']);
    }
    if (json['vehicles'] == null) {
      vehicles = null;
    } else {
      vehicles = TaggedVehicle.listFromJson(json['vehicles']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'addresses': addresses,
      'assets': assets,
      'drivers': drivers,
      'groupId': groupId,
      'id': id,
      'machines': machines,
      'name': name,
      'parentTagId': parentTagId,
      'sensors': sensors,
      'vehicles': vehicles
    };
  }

  static List<Tag> listFromJson(List<dynamic> json) {
    return json == null ? new List<Tag>() : json.map((value) => new Tag.fromJson(value)).toList();
  }

  static Map<String, Tag> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Tag>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Tag.fromJson(value));
    }
    return map;
  }
}

