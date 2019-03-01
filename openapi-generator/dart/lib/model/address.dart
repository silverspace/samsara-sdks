part of openapi.api;

class Address {
  
  List<Contact> contacts = [];
  /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  String formattedAddress = null;
  
  AddressGeofence geofence = null;
  /* ID of the address */
  int id = null;
  /* Name of the address or geofence */
  String name = null;
  /* Notes associated with an address. */
  String notes = null;
  
  List<TagMetadata> tags = [];
  Address();

  @override
  String toString() {
    return 'Address[contacts=$contacts, formattedAddress=$formattedAddress, geofence=$geofence, id=$id, name=$name, notes=$notes, tags=$tags, ]';
  }

  Address.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['contacts'] == null) {
      contacts = null;
    } else {
      contacts = Contact.listFromJson(json['contacts']);
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
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
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
    if (json['tags'] == null) {
      tags = null;
    } else {
      tags = TagMetadata.listFromJson(json['tags']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'contacts': contacts,
      'formattedAddress': formattedAddress,
      'geofence': geofence,
      'id': id,
      'name': name,
      'notes': notes,
      'tags': tags
    };
  }

  static List<Address> listFromJson(List<dynamic> json) {
    return json == null ? new List<Address>() : json.map((value) => new Address.fromJson(value)).toList();
  }

  static Map<String, Address> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Address>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Address.fromJson(value));
    }
    return map;
  }
}

