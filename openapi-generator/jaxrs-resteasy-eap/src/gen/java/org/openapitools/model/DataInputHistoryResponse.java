package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataInputHistoryResponsePoints;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class DataInputHistoryResponse   {
  

  private Long id;

  private String name;

  private List<DataInputHistoryResponsePoints> points = new ArrayList<DataInputHistoryResponsePoints>();

  /**
   * The ID of this data input
   **/
  
  @ApiModelProperty(example = "12345", value = "The ID of this data input")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of this data input
   **/
  
  @ApiModelProperty(example = "Pump Flow", required = true, value = "Name of this data input")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Data points from this data input
   **/
  
  @ApiModelProperty(value = "Data points from this data input")
  @JsonProperty("points")
  public List<DataInputHistoryResponsePoints> getPoints() {
    return points;
  }
  public void setPoints(List<DataInputHistoryResponsePoints> points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataInputHistoryResponse dataInputHistoryResponse = (DataInputHistoryResponse) o;
    return Objects.equals(id, dataInputHistoryResponse.id) &&
        Objects.equals(name, dataInputHistoryResponse.name) &&
        Objects.equals(points, dataInputHistoryResponse.points);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

