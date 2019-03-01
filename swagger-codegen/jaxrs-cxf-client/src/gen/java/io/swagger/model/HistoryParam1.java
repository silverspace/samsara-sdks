package io.swagger.model;

import io.swagger.model.SensorshistorySeries;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoryParam1  {
  
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
 /**
   * End of the time range, specified in milliseconds UNIX time.
  **/
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

  @ApiModelProperty(value = "")
  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;

  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
 /**
   * Group ID to query.
  **/
  private Long groupId = null;

  @ApiModelProperty(required = true, value = "")
  private List<SensorshistorySeries> series = new ArrayList<SensorshistorySeries>();

  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
 /**
   * Beginning of the time range, specified in milliseconds UNIX time.
  **/
  private Integer startMs = null;

  @ApiModelProperty(example = "3600000", required = true, value = "Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.")
 /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
  **/
  private Integer stepMs = null;
 /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public HistoryParam1 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

 /**
   * Get fillMissing
   * @return fillMissing
  **/
  @JsonProperty("fillMissing")
  public String getFillMissing() {
    if (fillMissing == null) {
      return null;
    }
    return fillMissing.value();
  }

  public void setFillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
  }

  public HistoryParam1 fillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
    return this;
  }

 /**
   * Group ID to query.
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HistoryParam1 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Get series
   * @return series
  **/
  @JsonProperty("series")
  public List<SensorshistorySeries> getSeries() {
    return series;
  }

  public void setSeries(List<SensorshistorySeries> series) {
    this.series = series;
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
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public HistoryParam1 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

 /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
   * @return stepMs
  **/
  @JsonProperty("stepMs")
  public Integer getStepMs() {
    return stepMs;
  }

  public void setStepMs(Integer stepMs) {
    this.stepMs = stepMs;
  }

  public HistoryParam1 stepMs(Integer stepMs) {
    this.stepMs = stepMs;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

