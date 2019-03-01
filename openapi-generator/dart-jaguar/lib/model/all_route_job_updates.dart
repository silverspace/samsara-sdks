import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/job_update_object.dart';
part 'all_route_job_updates.jser.dart';

class AllRouteJobUpdates {
  
  @Alias('job_updates')
  final List<JobUpdateObject> jobUpdates;
   /* Sequence ID of the last update returned in the response */
  @Alias('sequence_id')
  final String sequenceId;
  

  AllRouteJobUpdates(
      

{
     this.jobUpdates = const [],  
     this.sequenceId = null 
    
    }
  );

  @override
  String toString() {
    return 'AllRouteJobUpdates[jobUpdates=$jobUpdates, sequenceId=$sequenceId, ]';
  }
}

@GenSerializer(nullableFields: true)
class AllRouteJobUpdatesSerializer extends Serializer<AllRouteJobUpdates> with _$AllRouteJobUpdatesSerializer {

}
