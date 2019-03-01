package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* The previous state of the dispatch job.
* Values: unassigned,scheduled,enRoute,arrived,completed,skipped
*/
enum class PrevJobStatus(val value: String) {

    unassigned("JobState_Unassigned"),

    scheduled("JobState_Scheduled"),

    enRoute("JobState_EnRoute"),

    arrived("JobState_Arrived"),

    completed("JobState_Completed"),

    skipped("JobState_Skipped");

}

