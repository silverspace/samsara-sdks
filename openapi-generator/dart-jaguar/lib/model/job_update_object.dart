import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/dispatch_route.dart';
import 'package:openapi/model/job_status.dart';
import 'package:openapi/model/prev_job_status.dart';
part 'job_update_object.jser.dart';

class JobUpdateObject {
   /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
  @Alias('changed_at_ms')
  final int changedAtMs;
   /* ID of the Samsara job. */
  @Alias('job_id')
  final int jobId;
  
  @Alias('job_state')
  final JobStatus jobState;
  //enum jobStateEnum {  JobState_Unassigned,  JobState_Scheduled,  JobState_EnRoute,  JobState_Arrived,  JobState_Completed,  JobState_Skipped,  };
  @Alias('prev_job_state')
  final PrevJobStatus prevJobState;
  //enum prevJobStateEnum {  JobState_Unassigned,  JobState_Scheduled,  JobState_EnRoute,  JobState_Arrived,  JobState_Completed,  JobState_Skipped,  };
  @Alias('route')
  final DispatchRoute route;
   /* ID of the Samsara dispatch route. */
  @Alias('route_id')
  final int routeId;
  

  JobUpdateObject(
      

{
     this.changedAtMs = null,  
     this.jobId = null,  
     this.jobState = null,  
     this.prevJobState = null,  
     this.route = null,  
     this.routeId = null 
    
    }
  );

  @override
  String toString() {
    return 'JobUpdateObject[changedAtMs=$changedAtMs, jobId=$jobId, jobState=$jobState, prevJobState=$prevJobState, route=$route, routeId=$routeId, ]';
  }
}

@GenSerializer(nullableFields: true)
class JobUpdateObjectSerializer extends Serializer<JobUpdateObject> with _$JobUpdateObjectSerializer {

}
