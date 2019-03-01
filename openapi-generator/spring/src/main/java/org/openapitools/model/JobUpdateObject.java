package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DispatchRoute;
import org.openapitools.model.JobStatus;
import org.openapitools.model.PrevJobStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JobUpdateObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

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
  */
  @ApiModelProperty(example = "1462881998034", value = "Timestamp that this event was updated, represented as Unix milliseconds since epoch.")


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
  */
  @ApiModelProperty(example = "773", value = "ID of the Samsara job.")


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
  */
  @ApiModelProperty(value = "")

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
  */
  @ApiModelProperty(value = "")

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
  */
  @ApiModelProperty(value = "")

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
  */
  @ApiModelProperty(example = "556", value = "ID of the Samsara dispatch route.")


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
    return Objects.equals(this.changedAtMs, jobUpdateObject.changedAtMs) &&
        Objects.equals(this.jobId, jobUpdateObject.jobId) &&
        Objects.equals(this.jobState, jobUpdateObject.jobState) &&
        Objects.equals(this.prevJobState, jobUpdateObject.prevJobState) &&
        Objects.equals(this.route, jobUpdateObject.route) &&
        Objects.equals(this.routeId, jobUpdateObject.routeId);
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

