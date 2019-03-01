package io.swagger.model;

import io.swagger.model.DispatchRoute;
import io.swagger.model.JobStatus;
import io.swagger.model.PrevJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class JobUpdateObject   {
  
  private @Valid Long changedAtMs = null;
  private @Valid Long jobId = null;
  private @Valid JobStatus jobState = null;
  private @Valid PrevJobStatus prevJobState = null;
  private @Valid DispatchRoute route = null;
  private @Valid Long routeId = null;

  /**
   * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
   **/
  public JobUpdateObject changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "Timestamp that this event was updated, represented as Unix milliseconds since epoch.")
  @JsonProperty("changed_at_ms")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  /**
   * ID of the Samsara job.
   **/
  public JobUpdateObject jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  
  @ApiModelProperty(example = "773", value = "ID of the Samsara job.")
  @JsonProperty("job_id")
  public Long getJobId() {
    return jobId;
  }
  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  /**
   **/
  public JobUpdateObject jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job_state")
  public JobStatus getJobState() {
    return jobState;
  }
  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

  /**
   **/
  public JobUpdateObject prevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prev_job_state")
  public PrevJobStatus getPrevJobState() {
    return prevJobState;
  }
  public void setPrevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
  }

  /**
   **/
  public JobUpdateObject route(DispatchRoute route) {
    this.route = route;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("route")
  public DispatchRoute getRoute() {
    return route;
  }
  public void setRoute(DispatchRoute route) {
    this.route = route;
  }

  /**
   * ID of the Samsara dispatch route.
   **/
  public JobUpdateObject routeId(Long routeId) {
    this.routeId = routeId;
    return this;
  }

  
  @ApiModelProperty(example = "556", value = "ID of the Samsara dispatch route.")
  @JsonProperty("route_id")
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

