import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'prev_job_status.jser.dart';

@Entity()
class PrevJobStatus {
  /// The underlying value of this enum member.
  final String value;

  const PrevJobStatus._internal(this.value);

  /// The previous state of the dispatch job.
  static const PrevJobStatus unassigned_} = const PrevJobStatus._internal("JobState_Unassigned");
  /// The previous state of the dispatch job.
  static const PrevJobStatus scheduled_} = const PrevJobStatus._internal("JobState_Scheduled");
  /// The previous state of the dispatch job.
  static const PrevJobStatus enRoute_} = const PrevJobStatus._internal("JobState_EnRoute");
  /// The previous state of the dispatch job.
  static const PrevJobStatus arrived_} = const PrevJobStatus._internal("JobState_Arrived");
  /// The previous state of the dispatch job.
  static const PrevJobStatus completed_} = const PrevJobStatus._internal("JobState_Completed");
  /// The previous state of the dispatch job.
  static const PrevJobStatus skipped_} = const PrevJobStatus._internal("JobState_Skipped");
}

class PrevJobStatusTypeTransformer extends TypeTransformer<PrevJobStatus> {

  @override
  dynamic encode(PrevJobStatus data) {
    return data.value;
  }

  @override
  PrevJobStatus decode(dynamic data) {
    switch (data) {
      case "JobState_Unassigned": return PrevJobStatus.unassigned_};
      case "JobState_Scheduled": return PrevJobStatus.scheduled_};
      case "JobState_EnRoute": return PrevJobStatus.enRoute_};
      case "JobState_Arrived": return PrevJobStatus.arrived_};
      case "JobState_Completed": return PrevJobStatus.completed_};
      case "JobState_Skipped": return PrevJobStatus.skipped_};
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

