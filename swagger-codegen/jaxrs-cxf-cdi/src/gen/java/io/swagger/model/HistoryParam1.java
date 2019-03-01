package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SensorshistorySeries;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class HistoryParam1   {
  
  private Integer endMs = null;

@XmlType(name="FillMissingEnum")
@XmlEnum(String.class)
public enum FillMissingEnum {

    @XmlEnumValue("withNull") WITHNULL(String.valueOf("withNull")), @XmlEnumValue("withPrevious") WITHPREVIOUS(String.valueOf("withPrevious"));


    private String value;

    FillMissingEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FillMissingEnum fromValue(String v) {
        for (FillMissingEnum b : FillMissingEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;
  private Long groupId = null;
  private List<SensorshistorySeries> series = new ArrayList<SensorshistorySeries>();
  private Integer startMs = null;
  private Integer stepMs = null;

  /**
   * End of the time range, specified in milliseconds UNIX time.
   **/
  public HistoryParam1 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  
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
  public HistoryParam1 fillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
    return this;
  }

  
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
  public HistoryParam1 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
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
  public HistoryParam1 series(List<SensorshistorySeries> series) {
    this.series = series;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("series")
  @NotNull
  public List<SensorshistorySeries> getSeries() {
    return series;
  }
  public void setSeries(List<SensorshistorySeries> series) {
    this.series = series;
  }

  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   **/
  public HistoryParam1 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  
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
  public HistoryParam1 stepMs(Integer stepMs) {
    this.stepMs = stepMs;
    return this;
  }

  
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
    HistoryParam1 historyParam1 = (HistoryParam1) o;
    return Objects.equals(endMs, historyParam1.endMs) &&
        Objects.equals(fillMissing, historyParam1.fillMissing) &&
        Objects.equals(groupId, historyParam1.groupId) &&
        Objects.equals(series, historyParam1.series) &&
        Objects.equals(startMs, historyParam1.startMs) &&
        Objects.equals(stepMs, historyParam1.stepMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, fillMissing, groupId, series, startMs, stepMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryParam1 {\n");
    
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

