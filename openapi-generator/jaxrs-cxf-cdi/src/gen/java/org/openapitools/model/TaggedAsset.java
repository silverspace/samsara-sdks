package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedAssetBase;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class TaggedAsset   {
  
  private Long id;

  private String name;


  /**
   * The ID of the Asset being tagged.
   **/
  public TaggedAsset id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "789", required = true, value = "The ID of the Asset being tagged.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Name of the Asset being tagged.
   **/
  public TaggedAsset name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Trailer 789", value = "Name of the Asset being tagged.")
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
    TaggedAsset taggedAsset = (TaggedAsset) o;
    return Objects.equals(id, taggedAsset.id) &&
        Objects.equals(name, taggedAsset.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedAsset {\n");
    
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

