package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PrevJobStatus fromValue(String text) {
    for (PrevJobStatus b : PrevJobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

