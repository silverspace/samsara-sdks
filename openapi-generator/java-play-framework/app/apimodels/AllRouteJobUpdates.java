package apimodels;

import apimodels.JobUpdateObject;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AllRouteJobUpdates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    if (jobUpdates == null) {
      jobUpdates = new ArrayList<>();
    }
    jobUpdates.add(jobUpdatesItem);
    return this;
  }

   /**
   * Get jobUpdates
   * @return jobUpdates
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

