package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.JobUpdateObject;

/**
 * AllRouteJobUpdates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class AllRouteJobUpdates   {
  @JsonProperty("job_updates")
  private List<JobUpdateObject> jobUpdates = null;

  @JsonProperty("sequence_id")
  private String sequenceId;

  public AllRouteJobUpdates jobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
    return this;
  }

  public AllRouteJobUpdates addJobUpdatesItem(JobUpdateObject jobUpdatesItem) {
    if (this.jobUpdates == null) {
      this.jobUpdates = new ArrayList<JobUpdateObject>();
    }
    this.jobUpdates.add(jobUpdatesItem);
    return this;
  }

   /**
   * Get jobUpdates
   * @return jobUpdates
  **/
  @ApiModelProperty(value = "")
  public List<JobUpdateObject> getJobUpdates() {
    return jobUpdates;
  }

  public void setJobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
  }

  public AllRouteJobUpdates sequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

   /**
   * Sequence ID of the last update returned in the response
   * @return sequenceId
  **/
  @ApiModelProperty(example = "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=", value = "Sequence ID of the last update returned in the response")
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
    return Objects.equals(this.jobUpdates, allRouteJobUpdates.jobUpdates) &&
        Objects.equals(this.sequenceId, allRouteJobUpdates.sequenceId);
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

