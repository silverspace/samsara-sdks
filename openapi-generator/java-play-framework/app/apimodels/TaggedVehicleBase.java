package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TaggedVehicleBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TaggedVehicleBase   {
  @JsonProperty("id")
  private Long id;

  public TaggedVehicleBase id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Vehicle being tagged.
   * @return id
  **/
  @NotNull
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
    TaggedVehicleBase taggedVehicleBase = (TaggedVehicleBase) o;
    return Objects.equals(id, taggedVehicleBase.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedVehicleBase {\n");
    
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

