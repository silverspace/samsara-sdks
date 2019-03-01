package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.DispatchRoute;
import org.openapitools.server.api.model.JobStatus;
import org.openapitools.server.api.model.PrevJobStatus;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class JobUpdateObject   {
  
  private Long changedAtMs;
  private Long jobId;
  private JobStatus jobState;
  private PrevJobStatus prevJobState;
  private DispatchRoute route = null;
  private Long routeId;

  public JobUpdateObject () {

  }

  public JobUpdateObject (Long changedAtMs, Long jobId, JobStatus jobState, PrevJobStatus prevJobState, DispatchRoute route, Long routeId) {
    this.changedAtMs = changedAtMs;
    this.jobId = jobId;
    this.jobState = jobState;
    this.prevJobState = prevJobState;
    this.route = route;
    this.routeId = routeId;
  }

    
  @JsonProperty("changed_at_ms")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

    
  @JsonProperty("job_id")
  public Long getJobId() {
    return jobId;
  }
  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

    
  @JsonProperty("job_state")
  public JobStatus getJobState() {
    return jobState;
  }
  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

    
  @JsonProperty("prev_job_state")
  public PrevJobStatus getPrevJobState() {
    return prevJobState;
  }
  public void setPrevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
  }

    
  @JsonProperty("route")
  public DispatchRoute getRoute() {
    return route;
  }
  public void setRoute(DispatchRoute route) {
    this.route = route;
  }

    
  @JsonProperty("route_id")
  public Long getRouteId() {
    return routeId;
  }
  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
