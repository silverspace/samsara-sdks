package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject2   {
  
  private String address;
  private Long groupId;
  private String name;
  private Integer radius;

  public InlineObject2 () {

  }

  public InlineObject2 (String address, Long groupId, String name, Integer radius) {
    this.address = address;
    this.groupId = groupId;
    this.name = name;
    this.radius = radius;
  }

    
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("radius")
  public Integer getRadius() {
    return radius;
  }
  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(address, inlineObject2.address) &&
        Objects.equals(groupId, inlineObject2.groupId) &&
        Objects.equals(name, inlineObject2.name) &&
        Objects.equals(radius, inlineObject2.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, groupId, name, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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
