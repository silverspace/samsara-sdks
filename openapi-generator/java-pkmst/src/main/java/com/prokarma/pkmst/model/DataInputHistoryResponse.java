package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DataInputHistoryResponsePoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DataInputHistoryResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class DataInputHistoryResponse   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("points")
  
  private List<DataInputHistoryResponsePoints> points = null;

  public DataInputHistoryResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this data input
   * @return id
  **/
  @ApiModelProperty(example = "12345", value = "The ID of this data input")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DataInputHistoryResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this data input
   * @return name
  **/
  @ApiModelProperty(example = "Pump Flow", required = true, value = "Name of this data input")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataInputHistoryResponse points(List<DataInputHistoryResponsePoints> points) {
    this.points = points;
    return this;
  }

  public DataInputHistoryResponse addPointsItem(DataInputHistoryResponsePoints pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Data points from this data input
   * @return points
  **/
  @ApiModelProperty(value = "Data points from this data input")
  public List<DataInputHistoryResponsePoints> getPoints() {
    return points;
  }

  public void setPoints(List<DataInputHistoryResponsePoints> points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataInputHistoryResponse dataInputHistoryResponse = (DataInputHistoryResponse) o;
    return Objects.equals(this.id, dataInputHistoryResponse.id) &&
        Objects.equals(this.name, dataInputHistoryResponse.name) &&
        Objects.equals(this.points, dataInputHistoryResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, points);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

