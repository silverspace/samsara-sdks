package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * The current state of the dispatch job.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current state of the dispatch job.
 */
public enum JobStatus {
  
  UNASSIGNED("JobState_Unassigned"),
  
  SCHEDULED("JobState_Scheduled"),
  
  ENROUTE("JobState_EnRoute"),
  
  ARRIVED("JobState_Arrived"),
  
  COMPLETED("JobState_Completed"),
  
  SKIPPED("JobState_Skipped");

  private String value;

  JobStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JobStatus fromValue(String text) {
    for (JobStatus b : JobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}