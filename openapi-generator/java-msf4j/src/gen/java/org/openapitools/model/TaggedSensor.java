package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedSensorBase;

/**
 * TaggedSensor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class TaggedSensor   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public TaggedSensor id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Sensor being tagged.
   * @return id
  **/
  @ApiModelProperty(example = "345", required = true, value = "The ID of the Sensor being tagged.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaggedSensor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Sensor being tagged.
   * @return name
  **/
  @ApiModelProperty(example = "Temperature Sensor 345", value = "Name of the Sensor being tagged.")
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
    TaggedSensor taggedSensor = (TaggedSensor) o;
    return Objects.equals(this.id, taggedSensor.id) &&
        Objects.equals(this.name, taggedSensor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedSensor {\n");
    
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

