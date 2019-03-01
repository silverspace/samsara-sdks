package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SensorsHistorySeries;

/**
 * InlineObject21
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class InlineObject21   {
  @JsonProperty("endMs")
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

    @JsonCreator
    public static FillMissingEnum fromValue(String text) {
      for (FillMissingEnum b : FillMissingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("fillMissing")
  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("series")
  private List<SensorsHistorySeries> series = new ArrayList<SensorsHistorySeries>();

  @JsonProperty("startMs")
  private Integer startMs;

  @JsonProperty("stepMs")
  private Integer stepMs;

  public InlineObject21 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public InlineObject21 fillMissing(FillMissingEnum fillMissing) {
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

  public InlineObject21 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject21 series(List<SensorsHistorySeries> series) {
    this.series = series;
    return this;
  }

  public InlineObject21 addSeriesItem(SensorsHistorySeries seriesItem) {
    this.series.add(seriesItem);
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SensorsHistorySeries> getSeries() {
    return series;
  }

  public void setSeries(List<SensorsHistorySeries> series) {
    this.series = series;
  }

  public InlineObject21 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public InlineObject21 stepMs(Integer stepMs) {
    this.stepMs = stepMs;
    return this;
  }

   /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
   * @return stepMs
  **/
  @ApiModelProperty(example = "3600000", required = true, value = "Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.")
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
    return Objects.equals(this.endMs, inlineObject21.endMs) &&
        Objects.equals(this.fillMissing, inlineObject21.fillMissing) &&
        Objects.equals(this.groupId, inlineObject21.groupId) &&
        Objects.equals(this.series, inlineObject21.series) &&
        Objects.equals(this.startMs, inlineObject21.startMs) &&
        Objects.equals(this.stepMs, inlineObject21.stepMs);
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

