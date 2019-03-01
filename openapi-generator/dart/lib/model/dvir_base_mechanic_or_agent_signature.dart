part of openapi.api;

class DvirBaseMechanicOrAgentSignature {
  /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
  int mechanicUserId = null;
  /* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
  int driverId = null;
  /* The name of the agent or mechanic who signed the DVIR. */
  String name = null;
  /* The time in millis when the DVIR was signed */
  int signedAt = null;
  /* Type corresponds to whether the signature corresponds to driver|mechanic. */
  String type = null;
  /* Email of the  agent|mechanic who signed the DVIR. */
  String email = null;
  /* Username of the  agent|mechanic who signed the DVIR. */
  String username = null;
  DvirBaseMechanicOrAgentSignature();

  @override
  String toString() {
    return 'DvirBaseMechanicOrAgentSignature[mechanicUserId=$mechanicUserId, driverId=$driverId, name=$name, signedAt=$signedAt, type=$type, email=$email, username=$username, ]';
  }

  DvirBaseMechanicOrAgentSignature.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['mechanicUserId'] == null) {
      mechanicUserId = null;
    } else {
          mechanicUserId = json['mechanicUserId'];
    }
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
      'mechanicUserId': mechanicUserId,
      'driverId': driverId,
      'name': name,
      'signedAt': signedAt,
      'type': type,
      'email': email,
      'username': username
    };
  }

  static List<DvirBaseMechanicOrAgentSignature> listFromJson(List<dynamic> json) {
    return json == null ? new List<DvirBaseMechanicOrAgentSignature>() : json.map((value) => new DvirBaseMechanicOrAgentSignature.fromJson(value)).toList();
  }

  static Map<String, DvirBaseMechanicOrAgentSignature> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DvirBaseMechanicOrAgentSignature>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DvirBaseMechanicOrAgentSignature.fromJson(value));
    }
    return map;
  }
}

