part of openapi.api;

class JobUpdateObject {
  /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
  int changedAtMs = null;
  /* ID of the Samsara job. */
  int jobId = null;
  
  JobStatus jobState = null;
  //enum jobStateEnum {  JobState_Unassigned,  JobState_Scheduled,  JobState_EnRoute,  JobState_Arrived,  JobState_Completed,  JobState_Skipped,  };{
  
  PrevJobStatus prevJobState = null;
  //enum prevJobStateEnum {  JobState_Unassigned,  JobState_Scheduled,  JobState_EnRoute,  JobState_Arrived,  JobState_Completed,  JobState_Skipped,  };{
  
  DispatchRoute route = null;
  /* ID of the Samsara dispatch route. */
  int routeId = null;
  JobUpdateObject();

  @override
  String toString() {
    return 'JobUpdateObject[changedAtMs=$changedAtMs, jobId=$jobId, jobState=$jobState, prevJobState=$prevJobState, route=$route, routeId=$routeId, ]';
  }

  JobUpdateObject.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['changed_at_ms'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changed_at_ms'];
    }
    if (json['job_id'] == null) {
      jobId = null;
    } else {
          jobId = json['job_id'];
    }
    if (json['job_state'] == null) {
      jobState = null;
    } else {
      jobState = new JobStatus.fromJson(json['job_state']);
    }
    if (json['prev_job_state'] == null) {
      prevJobState = null;
    } else {
      prevJobState = new PrevJobStatus.fromJson(json['prev_job_state']);
    }
    if (json['route'] == null) {
      route = null;
    } else {
      route = new DispatchRoute.fromJson(json['route']);
    }
    if (json['route_id'] == null) {
      routeId = null;
    } else {
          routeId = json['route_id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'changed_at_ms': changedAtMs,
      'job_id': jobId,
      'job_state': jobState,
      'prev_job_state': prevJobState,
      'route': route,
      'route_id': routeId
    };
  }

  static List<JobUpdateObject> listFromJson(List<dynamic> json) {
    return json == null ? new List<JobUpdateObject>() : json.map((value) => new JobUpdateObject.fromJson(value)).toList();
  }

  static Map<String, JobUpdateObject> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, JobUpdateObject>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new JobUpdateObject.fromJson(value));
    }
    return map;
  }
}

