package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DoorResponseSensors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DoorResponseSensors   {
  @JsonProperty("doorClosed")
  private Boolean doorClosed;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  public DoorResponseSensors doorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
    return this;
  }

   /**
   * Flag indicating whether the current door is closed or open.
   * @return doorClosed
  **/
    public Boolean getDoorClosed() {
    return doorClosed;
  }

  public void setDoorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
  }

  public DoorResponseSensors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sensor.
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DoorResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the sensor.
   * @return id
  **/
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
    DoorResponseSensors doorResponseSensors = (DoorResponseSensors) o;
    return Objects.equals(doorClosed, doorResponseSensors.doorClosed) &&
        Objects.equals(name, doorResponseSensors.name) &&
        Objects.equals(id, doorResponseSensors.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doorClosed, name, id);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoorResponseSensors {\n");
    
    sb.append("    doorClosed: ").append(toIndentedString(doorClosed)).append("\n");
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

