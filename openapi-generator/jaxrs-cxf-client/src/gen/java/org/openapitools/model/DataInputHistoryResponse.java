package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataInputHistoryResponsePoints;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataInputHistoryResponse  {
  
  @ApiModelProperty(example = "12345", value = "The ID of this data input")
 /**
   * The ID of this data input
  **/
  private Long id;

  @ApiModelProperty(example = "Pump Flow", required = true, value = "Name of this data input")
 /**
   * Name of this data input
  **/
  private String name;

  @ApiModelProperty(value = "Data points from this data input")
 /**
   * Data points from this data input
  **/
  private List<DataInputHistoryResponsePoints> points = null;
 /**
   * The ID of this data input
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DataInputHistoryResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Name of this data input
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataInputHistoryResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Data points from this data input
   * @return points
  **/
  @JsonProperty("points")
  public List<DataInputHistoryResponsePoints> getPoints() {
    return points;
  }

  public void setPoints(List<DataInputHistoryResponsePoints> points) {
    this.points = points;
  }

  public DataInputHistoryResponse points(List<DataInputHistoryResponsePoints> points) {
    this.points = points;
    return this;
  }

  public DataInputHistoryResponse addPointsItem(DataInputHistoryResponsePoints pointsItem) {
    this.points.add(pointsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataInputHistoryResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

