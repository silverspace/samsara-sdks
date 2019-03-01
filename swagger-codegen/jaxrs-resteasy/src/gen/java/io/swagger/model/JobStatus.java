package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
public enum JobStatus {
    {values&#x3D;[JobState_Unassigned, JobState_Scheduled, JobState_EnRoute, JobState_Arrived, JobState_Completed, JobState_Skipped], enumVars&#x3D;[{name&#x3D;UNASSIGNED, value&#x3D;&quot;JobState_Unassigned&quot;}, {name&#x3D;SCHEDULED, value&#x3D;&quot;JobState_Scheduled&quot;}, {name&#x3D;ENROUTE, value&#x3D;&quot;JobState_EnRoute&quot;}, {name&#x3D;ARRIVED, value&#x3D;&quot;JobState_Arrived&quot;}, {name&#x3D;COMPLETED, value&#x3D;&quot;JobState_Completed&quot;}, {name&#x3D;SKIPPED, value&#x3D;&quot;JobState_Skipped&quot;}]}, 
}
