package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.JobUpdateObject;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AllRouteJobUpdates   {
  
  private List<JobUpdateObject> jobUpdates = new ArrayList<>();
  private String sequenceId;

  public AllRouteJobUpdates () {

  }

  public AllRouteJobUpdates (List<JobUpdateObject> jobUpdates, String sequenceId) {
    this.jobUpdates = jobUpdates;
    this.sequenceId = sequenceId;
  }

    
  @JsonProperty("job_updates")
  public List<JobUpdateObject> getJobUpdates() {
    return jobUpdates;
  }
  public void setJobUpdates(List<JobUpdateObject> jobUpdates) {
    this.jobUpdates = jobUpdates;
  }

    
  @JsonProperty("sequence_id")
  public String getSequenceId() {
    return sequenceId;
  }
  public void setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
