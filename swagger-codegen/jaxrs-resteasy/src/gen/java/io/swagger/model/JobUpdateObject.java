package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DispatchRoute;
import io.swagger.model.JobStatus;
import io.swagger.model.PrevJobStatus;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class JobUpdateObject   {
  
  private Long changedAtMs = null;
  private Long jobId = null;
  private JobStatus jobState = null;
  private PrevJobStatus prevJobState = null;
  private DispatchRoute route = null;
  private Long routeId = null;

  /**
   * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
   **/
  
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

