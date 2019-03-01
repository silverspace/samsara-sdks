part of openapi.api;

class Contact {
  /* Email address of the contact */
  String email = null;
  /* First name of the contact */
  String firstName = null;
  /* ID of the contact */
  int id = null;
  /* Last name of the contact */
  String lastName = null;
  /* Phone number of the contact */
  String phone = null;
  Contact();

  @override
  String toString() {
    return 'Contact[email=$email, firstName=$firstName, id=$id, lastName=$lastName, phone=$phone, ]';
  }

  Contact.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['email'] == null) {
      email = null;
    } else {
          email = json['email'];
    }
    if (json['firstName'] == null) {
      firstName = null;
    } else {
          firstName = json['firstName'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['lastName'] == null) {
      lastName = null;
    } else {
          lastName = json['lastName'];
    }
    if (json['phone'] == null) {
      phone = null;
    } else {
          phone = json['phone'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'email': email,
      'firstName': firstName,
      'id': id,
      'lastName': lastName,
      'phone': phone
    };
  }

  static List<Contact> listFromJson(List<dynamic> json) {
    return json == null ? new List<Contact>() : json.map((value) => new Contact.fromJson(value)).toList();
  }

  static Map<String, Contact> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Contact>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Contact.fromJson(value));
    }
    return map;
  }
}

