part of openapi.api;

class DvirBaseNextDriverSignature {
  /* ID of the driver who signed the DVIR */
  int driverId = null;
  /* The name of the driver who signed the next DVIR on this vehicle. */
  String name = null;
  /* The time in millis when the next driver signed the DVIR on this vehicle. */
  int signedAt = null;
  /* Type corresponds to driver. */
  String type = null;
  /* Email of the  driver who signed the next DVIR on this vehicle. */
  String email = null;
  /* Username of the  driver who signed the next DVIR on this vehicle. */
  String username = null;
  DvirBaseNextDriverSignature();

  @override
  String toString() {
    return 'DvirBaseNextDriverSignature[driverId=$driverId, name=$name, signedAt=$signedAt, type=$type, email=$email, username=$username, ]';
  }

  DvirBaseNextDriverSignature.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['signedAt'] == null) {
      signedAt = null;
    } else {
          signedAt = json['signedAt'];
    }
    if (json['type'] == null) {
      type = null;
    } else {
          type = json['type'];
    }
    if (json['email'] == null) {
      email = null;
    } else {
          email = json['email'];
    }
    if (json['username'] == null) {
      username = null;
    } else {
          username = json['username'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'driverId': driverId,
      'name': name,
      'signedAt': signedAt,
      'type': type,
      'email': email,
      'username': username
    };
  }

  static List<DvirBaseNextDriverSignature> listFromJson(List<dynamic> json) {
    return json == null ? new List<DvirBaseNextDriverSignature>() : json.map((value) => new DvirBaseNextDriverSignature.fromJson(value)).toList();
  }

  static Map<String, DvirBaseNextDriverSignature> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DvirBaseNextDriverSignature>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DvirBaseNextDriverSignature.fromJson(value));
    }
    return map;
  }
}

