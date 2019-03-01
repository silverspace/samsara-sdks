package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SensorshistorySeries;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HistoryParam1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class HistoryParam1   {
  @JsonProperty("endMs")
  private Integer endMs = null;

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

    @JsonCreator
    public static FillMissingEnum fromValue(String text) {
      for (FillMissingEnum b : FillMissingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("fillMissing")
  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("series")
  @Valid
  private List<SensorshistorySeries> series = new ArrayList<SensorshistorySeries>();

  @JsonProperty("startMs")
  private Integer startMs = null;

  @JsonProperty("stepMs")
  private Integer stepMs = null;

  public HistoryParam1 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  @NotNull


  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public HistoryParam1 fillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
    return this;
  }

  /**
   * Get fillMissing
   * @return fillMissing
  **/
  @ApiModelProperty(value = "")


  public FillMissingEnum getFillMissing() {
    return fillMissing;
  }

  public void setFillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
  }

  public HistoryParam1 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @NotNull


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HistoryParam1 series(List<SensorshistorySeries> series) {
    this.series = series;
    return this;
  }

  public HistoryParam1 addSeriesItem(SensorshistorySeries seriesItem) {
    this.series.add(seriesItem);
    return this;
  }

  /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<SensorshistorySeries> getSeries() {
    return series;
  }

  public void setSeries(List<SensorshistorySeries> series) {
    this.series = series;
  }

  public HistoryParam1 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
  @NotNull


  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public HistoryParam1 stepMs(Integer stepMs) {
    this.stepMs = stepMs;
    return this;
  }

  /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
   * @return stepMs
  **/
  @ApiModelProperty(example = "3600000", required = true, value = "Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.")
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
    return Objects.equals(this.endMs, historyParam1.endMs) &&
        Objects.equals(this.fillMissing, historyParam1.fillMissing) &&
        Objects.equals(this.groupId, historyParam1.groupId) &&
        Objects.equals(this.series, historyParam1.series) &&
        Objects.equals(this.startMs, historyParam1.startMs) &&
        Objects.equals(this.stepMs, historyParam1.stepMs);
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

