package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject2   {
  @JsonProperty("address")
  private String address;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("radius")
  private Integer radius;

  public InlineObject2 address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the entry to add, as it would be recognized if provided to maps.google.com.
   * @return address
  **/
  @NotNull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public InlineObject2 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
  @NotNull
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the location to add to the address book.
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineObject2 radius(Integer radius) {
    this.radius = radius;
    return this;
  }

   /**
   * Radius in meters of the address (used for matching vehicle trip stops to this location).
   * @return radius
  **/
  @NotNull
  public Integer getRadius() {
    return radius;
  }

  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

