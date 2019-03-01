package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.TaggedDriverBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TaggedDriver
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class TaggedDriver   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public TaggedDriver id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Driver being tagged.
   * @return id
  **/
  @ApiModelProperty(example = "456", required = true, value = "The ID of the Driver being tagged.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaggedDriver name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Driver being tagged.
   * @return name
  **/
  @ApiModelProperty(example = "John Smith", value = "Name of the Driver being tagged.")
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
    TaggedDriver taggedDriver = (TaggedDriver) o;
    return Objects.equals(this.id, taggedDriver.id) &&
        Objects.equals(this.name, taggedDriver.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedDriver {\n");
    
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

