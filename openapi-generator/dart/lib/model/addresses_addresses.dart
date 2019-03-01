part of openapi.api;

class AddressesAddresses {
  /* Notes associated with an address. */
  String notes = null;
  /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  String formattedAddress = null;
  
  AddressGeofence geofence = null;
  /* A list of tag IDs. */
  List<int> tagIds = [];
  /* The name of this address/geofence */
  String name = null;
  /* A list of IDs for contact book entries. */
  List<int> contactIds = [];
  AddressesAddresses();

  @override
  String toString() {
    return 'AddressesAddresses[notes=$notes, formattedAddress=$formattedAddress, geofence=$geofence, tagIds=$tagIds, name=$name, contactIds=$contactIds, ]';
  }

  AddressesAddresses.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['notes'] == null) {
      notes = null;
    } else {
          notes = json['notes'];
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
    if (json['tagIds'] == null) {
      tagIds = null;
    } else {
      tagIds = (json['tagIds'] as List).cast<int>();
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['contactIds'] == null) {
      contactIds = null;
    } else {
      contactIds = (json['contactIds'] as List).cast<int>();
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'notes': notes,
      'formattedAddress': formattedAddress,
      'geofence': geofence,
      'tagIds': tagIds,
      'name': name,
      'contactIds': contactIds
    };
  }

  static List<AddressesAddresses> listFromJson(List<dynamic> json) {
    return json == null ? new List<AddressesAddresses>() : json.map((value) => new AddressesAddresses.fromJson(value)).toList();
  }

  static Map<String, AddressesAddresses> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AddressesAddresses>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AddressesAddresses.fromJson(value));
    }
    return map;
  }
}

