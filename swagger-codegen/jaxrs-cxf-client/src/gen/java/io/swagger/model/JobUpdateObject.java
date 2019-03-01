package io.swagger.model;

import io.swagger.model.DispatchRoute;
import io.swagger.model.JobStatus;
import io.swagger.model.PrevJobStatus;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JobUpdateObject  {
  
  @ApiModelProperty(example = "1462881998034", value = "Timestamp that this event was updated, represented as Unix milliseconds since epoch.")
 /**
   * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
  **/
  private Long changedAtMs = null;

  @ApiModelProperty(example = "773", value = "ID of the Samsara job.")
 /**
   * ID of the Samsara job.
  **/
  private Long jobId = null;

  @ApiModelProperty(value = "")
  private JobStatus jobState = null;

  @ApiModelProperty(value = "")
  private PrevJobStatus prevJobState = null;

  @ApiModelProperty(value = "")
  private DispatchRoute route = null;

  @ApiModelProperty(example = "556", value = "ID of the Samsara dispatch route.")
 /**
   * ID of the Samsara dispatch route.
  **/
  private Long routeId = null;
 /**
   * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
   * @return changedAtMs
  **/
  @JsonProperty("changed_at_ms")
  public Long getChangedAtMs() {
    return changedAtMs;
  }

  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  public JobUpdateObject changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

 /**
   * ID of the Samsara job.
   * @return jobId
  **/
  @JsonProperty("job_id")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public JobUpdateObject jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

 /**
   * Get jobState
   * @return jobState
  **/
  @JsonProperty("job_state")
  public JobStatus getJobState() {
    return jobState;
  }

  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

  public JobUpdateObject jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

 /**
   * Get prevJobState
   * @return prevJobState
  **/
  @JsonProperty("prev_job_state")
  public PrevJobStatus getPrevJobState() {
    return prevJobState;
  }

  public void setPrevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
  }

  public JobUpdateObject prevJobState(PrevJobStatus prevJobState) {
    this.prevJobState = prevJobState;
    return this;
  }

 /**
   * Get route
   * @return route
  **/
  @JsonProperty("route")
  public DispatchRoute getRoute() {
    return route;
  }

  public void setRoute(DispatchRoute route) {
    this.route = route;
  }

  public JobUpdateObject route(DispatchRoute route) {
    this.route = route;
    return this;
  }

 /**
   * ID of the Samsara dispatch route.
   * @return routeId
  **/
  @JsonProperty("route_id")
  public Long getRouteId() {
    return routeId;
  }

  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }

  public JobUpdateObject routeId(Long routeId) {
    this.routeId = routeId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

