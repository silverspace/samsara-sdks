package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.JobUpdateObject;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AllRouteJobUpdates   {
  
  private List<JobUpdateObject> jobUpdates = new ArrayList<JobUpdateObject>();
  private String sequenceId = null;

  /**
   **/
  public AllRouteJobUpdates jobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job_updates")
  public List<JobUpdateObject> getJobUpdates() {
    return jobUpdates;
  }
  public void setJobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
  }

  /**
   * Sequence ID of the last update returned in the response
   **/
  public AllRouteJobUpdates sequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  
  @ApiModelProperty(example = "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=", value = "Sequence ID of the last update returned in the response")
  @JsonProperty("sequence_id")
  public String getSequenceId() {
    return sequenceId;
  }
  public void setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllRouteJobUpdates allRouteJobUpdates = (AllRouteJobUpdates) o;
    return Objects.equals(jobUpdates, allRouteJobUpdates.jobUpdates) &&
        Objects.equals(sequenceId, allRouteJobUpdates.sequenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobUpdates, sequenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllRouteJobUpdates {\n");
    
    sb.append("    jobUpdates: ").append(toIndentedString(jobUpdates)).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

