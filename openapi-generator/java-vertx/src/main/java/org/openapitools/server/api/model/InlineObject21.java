package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.SensorsHistorySeries;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject21   {
  
  private Integer endMs;


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
      return value;
    }
  }

  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;
  private Long groupId;
  private List<SensorsHistorySeries> series = new ArrayList<>();
  private Integer startMs;
  private Integer stepMs;

  public InlineObject21 () {

  }

  public InlineObject21 (Integer endMs, FillMissingEnum fillMissing, Long groupId, List<SensorsHistorySeries> series, Integer startMs, Integer stepMs) {
    this.endMs = endMs;
    this.fillMissing = fillMissing;
    this.groupId = groupId;
    this.series = series;
    this.startMs = startMs;
    this.stepMs = stepMs;
  }

    
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

    
  @JsonProperty("fillMissing")
  public FillMissingEnum getFillMissing() {
    return fillMissing;
  }
  public void setFillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("series")
  public List<SensorsHistorySeries> getSeries() {
    return series;
  }
  public void setSeries(List<SensorsHistorySeries> series) {
    this.series = series;
  }

    
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

    
  @JsonProperty("stepMs")
  public Integer getStepMs() {
    return stepMs;
  }
  public void setStepMs(Integer stepMs) {
    this.stepMs = stepMs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
