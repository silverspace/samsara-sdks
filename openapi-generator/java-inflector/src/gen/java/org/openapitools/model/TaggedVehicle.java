package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedVehicleBase;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class TaggedVehicle   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  /**
   * The ID of the Vehicle being tagged.
   **/
  public TaggedVehicle id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "123", required = true, value = "The ID of the Vehicle being tagged.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of the Vehicle being tagged.
   **/
  public TaggedVehicle name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Heavy Duty 123", value = "Name of the Vehicle being tagged.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaggedVehicle taggedVehicle = (TaggedVehicle) o;
    return Objects.equals(id, taggedVehicle.id) &&
        Objects.equals(name, taggedVehicle.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedVehicle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

