package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SensorsHistorySeries;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class InlineObject21   {
  
  private Integer endMs;

  /**
   * Gets or Sets fillMissing
   */
  public enum FillMissingEnum {
    WITHNULL("withNull"),

        WITHPREVIOUS("withPrevious");
    private String value;

    FillMissingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;
  private Long groupId;
  private List<SensorsHistorySeries> series = new ArrayList<SensorsHistorySeries>();
  private Integer startMs;
  private Integer stepMs;

  /**
   * End of the time range, specified in milliseconds UNIX time.
   **/
  
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  @JsonProperty("endMs")
  @NotNull
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fillMissing")
  public FillMissingEnum getFillMissing() {
    return fillMissing;
  }
  public void setFillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
  }

  /**
   * Group ID to query.
   **/
  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("series")
  @NotNull
  public List<SensorsHistorySeries> getSeries() {
    return series;
  }
  public void setSeries(List<SensorsHistorySeries> series) {
    this.series = series;
  }

  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   **/
  
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
  @JsonProperty("startMs")
  @NotNull
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
   **/
  
  @ApiModelProperty(example = "3600000", required = true, value = "Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.")
  @JsonProperty("stepMs")
  @NotNull
  public Integer getStepMs() {
    return stepMs;
  }
  public void setStepMs(Integer stepMs) {
    this.stepMs = stepMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject21 inlineObject21 = (InlineObject21) o;
    return Objects.equals(endMs, inlineObject21.endMs) &&
        Objects.equals(fillMissing, inlineObject21.fillMissing) &&
        Objects.equals(groupId, inlineObject21.groupId) &&
        Objects.equals(series, inlineObject21.series) &&
        Objects.equals(startMs, inlineObject21.startMs) &&
        Objects.equals(stepMs, inlineObject21.stepMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, fillMissing, groupId, series, startMs, stepMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject21 {\n");
    
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    fillMissing: ").append(toIndentedString(fillMissing)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    stepMs: ").append(toIndentedString(stepMs)).append("\n");
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

