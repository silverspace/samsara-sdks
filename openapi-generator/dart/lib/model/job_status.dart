part of openapi.api;

@Entity()
class JobStatus {
  /// The underlying value of this enum member.
  final String value;

  const JobStatus._internal(this.value);

  /// The current state of the dispatch job.
  static const JobStatus unassigned_ = const JobStatus._internal("JobState_Unassigned");
  /// The current state of the dispatch job.
  static const JobStatus scheduled_ = const JobStatus._internal("JobState_Scheduled");
  /// The current state of the dispatch job.
  static const JobStatus enRoute_ = const JobStatus._internal("JobState_EnRoute");
  /// The current state of the dispatch job.
  static const JobStatus arrived_ = const JobStatus._internal("JobState_Arrived");
  /// The current state of the dispatch job.
  static const JobStatus completed_ = const JobStatus._internal("JobState_Completed");
  /// The current state of the dispatch job.
  static const JobStatus skipped_ = const JobStatus._internal("JobState_Skipped");
}

class JobStatusTypeTransformer extends TypeTransformer<JobStatus> {

  @override
  dynamic encode(JobStatus data) {
    return data.value;
  }

  @override
  JobStatus decode(dynamic data) {
    switch (data) {
      case "JobState_Unassigned": return JobStatus.unassigned_;
      case "JobState_Scheduled": return JobStatus.scheduled_;
      case "JobState_EnRoute": return JobStatus.enRoute_;
      case "JobState_Arrived": return JobStatus.arrived_;
      case "JobState_Completed": return JobStatus.completed_;
      case "JobState_Skipped": return JobStatus.skipped_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

