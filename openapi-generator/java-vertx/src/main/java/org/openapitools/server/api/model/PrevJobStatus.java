package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * The previous state of the dispatch job.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The previous state of the dispatch job.
 */
public enum PrevJobStatus {
  
  UNASSIGNED("JobState_Unassigned"),
  
  SCHEDULED("JobState_Scheduled"),
  
  ENROUTE("JobState_EnRoute"),
  
  ARRIVED("JobState_Arrived"),
  
  COMPLETED("JobState_Completed"),
  
  SKIPPED("JobState_Skipped");

  private String value;

  PrevJobStatus(String value) {
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

  public static PrevJobStatus fromValue(String text) {
    for (PrevJobStatus b : PrevJobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}