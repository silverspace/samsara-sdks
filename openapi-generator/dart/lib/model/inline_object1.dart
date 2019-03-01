part of openapi.api;

class InlineObject1 {
  /* A list of IDs for contact book entries. */
  List<int> contactIds = [];
  /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  String formattedAddress = null;
  
  AddressGeofence geofence = null;
  /* The name of this address/geofence */
  String name = null;
  /* Notes associated with an address. */
  String notes = null;
  /* A list of tag IDs. */
  List<int> tagIds = [];
  InlineObject1();

  @override
  String toString() {
    return 'InlineObject1[contactIds=$contactIds, formattedAddress=$formattedAddress, geofence=$geofence, name=$name, notes=$notes, tagIds=$tagIds, ]';
  }

  InlineObject1.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['contactIds'] == null) {
      contactIds = null;
    } else {
      contactIds = (json['contactIds'] as List).cast<int>();
    }
    if (json['formattedAddress'] == null) {
      formattedAddress = null;
    } else {
          formattedAddress = json['formattedAddress'];
    }
    if (json['geofence'] == null) {
      geofence = null;
    } else {
      geofence = new AddressGeofence.fromJson(json['geofence']);
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['notes'] == null) {
      notes = null;
    } else {
          notes = json['notes'];
    }
    if (json['tagIds'] == null) {
      tagIds = null;
    } else {
      tagIds = (json['tagIds'] as List).cast<int>();
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'contactIds': contactIds,
      'formattedAddress': formattedAddress,
      'geofence': geofence,
      'name': name,
      'notes': notes,
      'tagIds': tagIds
    };
  }

  static List<InlineObject1> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject1>() : json.map((value) => new InlineObject1.fromJson(value)).toList();
  }

  static Map<String, InlineObject1> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject1>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject1.fromJson(value));
    }
    return map;
  }
}

