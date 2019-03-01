package io.swagger.model;

import io.swagger.model.JobUpdateObject;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AllRouteJobUpdates  {
  
  @ApiModelProperty(value = "")
  private List<JobUpdateObject> jobUpdates = null;

  @ApiModelProperty(example = "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=", value = "Sequence ID of the last update returned in the response")
 /**
   * Sequence ID of the last update returned in the response
  **/
  private String sequenceId = null;
 /**
   * Get jobUpdates
   * @return jobUpdates
  **/
  @JsonProperty("job_updates")
  public List<JobUpdateObject> getJobUpdates() {
    return jobUpdates;
  }

  public void setJobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
  }

  public AllRouteJobUpdates jobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
    return this;
  }

  public AllRouteJobUpdates addJobUpdatesItem(JobUpdateObject jobUpdatesItem) {
    this.jobUpdates.add(jobUpdatesItem);
    return this;
  }

 /**
   * Sequence ID of the last update returned in the response
   * @return sequenceId
  **/
  @JsonProperty("sequence_id")
  public String getSequenceId() {
    return sequenceId;
  }

  public void setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
  }

  public AllRouteJobUpdates sequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

