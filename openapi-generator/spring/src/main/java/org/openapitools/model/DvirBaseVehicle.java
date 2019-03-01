package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The vehicle on which DVIR was done.
 */
@ApiModel(description = "The vehicle on which DVIR was done.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DvirBaseVehicle   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  public DvirBaseVehicle name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The vehicle on which DVIR was done.
   * @return name
  */
  @ApiModelProperty(example = "Storer's vehicle 19", value = "The vehicle on which DVIR was done.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvirBaseVehicle id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The vehicle id on which DVIR was done.
   * @return id
  */
  @ApiModelProperty(example = "19", value = "The vehicle id on which DVIR was done.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBaseVehicle dvirBaseVehicle = (DvirBaseVehicle) o;
    return Objects.equals(this.name, dvirBaseVehicle.name) &&
        Objects.equals(this.id, dvirBaseVehicle.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseVehicle {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

