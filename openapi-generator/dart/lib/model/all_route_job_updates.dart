part of openapi.api;

class AllRouteJobUpdates {
  
  List<JobUpdateObject> jobUpdates = [];
  /* Sequence ID of the last update returned in the response */
  String sequenceId = null;
  AllRouteJobUpdates();

  @override
  String toString() {
    return 'AllRouteJobUpdates[jobUpdates=$jobUpdates, sequenceId=$sequenceId, ]';
  }

  AllRouteJobUpdates.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['job_updates'] == null) {
      jobUpdates = null;
    } else {
      jobUpdates = JobUpdateObject.listFromJson(json['job_updates']);
    }
    if (json['sequence_id'] == null) {
      sequenceId = null;
    } else {
          sequenceId = json['sequence_id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'job_updates': jobUpdates,
      'sequence_id': sequenceId
    };
  }

  static List<AllRouteJobUpdates> listFromJson(List<dynamic> json) {
    return json == null ? new List<AllRouteJobUpdates>() : json.map((value) => new AllRouteJobUpdates.fromJson(value)).toList();
  }

  static Map<String, AllRouteJobUpdates> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AllRouteJobUpdates>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AllRouteJobUpdates.fromJson(value));
    }
    return map;
  }
}

