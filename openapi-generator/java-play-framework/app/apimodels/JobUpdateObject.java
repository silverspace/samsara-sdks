package apimodels;

import apimodels.DispatchRoute;
import apimodels.JobStatus;
import apimodels.PrevJobStatus;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * JobUpdateObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class JobUpdateObject   {
  @JsonProperty("changed_at_ms")
  private Long changedAtMs;

  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("job_state")
  private JobStatus jobState;

  @JsonProperty("prev_job_state")
  private PrevJobStatus prevJobState;

  @JsonProperty("route")
  private DispatchRoute route = null;

  @JsonProperty("route_id")
  private Long routeId;

  public JobUpdateObject changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

   /**
   * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
   * @return changedAtMs
  **/
    public Long getChangedAtMs() {
    return changedAtMs;
  }

  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  public JobUpdateObject jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * ID of the Samsara job.
   * @return jobId
  **/
    public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public JobUpdateObject jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

   /**
   * Get jobState
   * @return jobState
  **/
  @Valid
  public JobStatus getJobState() {
    return jobState;
  }

  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

  public JobUpdateObject prevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
    return this;
  }

   /**
   * Get prevJobState
   * @return prevJobState
  **/
  @Valid
  public PrevJobStatus getPrevJobState() {
    return prevJobState;
  }

  public void setPrevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
  }

  public JobUpdateObject route(DispatchRoute route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @Valid
  public DispatchRoute getRoute() {
    return route;
  }

  public void setRoute(DispatchRoute route) {
    this.route = route;
  }

  public JobUpdateObject routeId(Long routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * ID of the Samsara dispatch route.
   * @return routeId
  **/
    public Long getRouteId() {
    return routeId;
  }

  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobUpdateObject jobUpdateObject = (JobUpdateObject) o;
    return Objects.equals(changedAtMs, jobUpdateObject.changedAtMs) &&
        Objects.equals(jobId, jobUpdateObject.jobId) &&
        Objects.equals(jobState, jobUpdateObject.jobState) &&
        Objects.equals(prevJobState, jobUpdateObject.prevJobState) &&
        Objects.equals(route, jobUpdateObject.route) &&
        Objects.equals(routeId, jobUpdateObject.routeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, jobId, jobState, prevJobState, route, routeId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobUpdateObject {\n");
    
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
    sb.append("    prevJobState: ").append(toIndentedString(prevJobState)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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

