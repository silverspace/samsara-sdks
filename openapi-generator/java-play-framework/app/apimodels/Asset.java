package apimodels;

import apimodels.AssetCable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Basic information of an asset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Asset   {
  @JsonProperty("assetSerialNumber")
  private String assetSerialNumber;

  @JsonProperty("cable")
  private List<AssetCable> cable = null;

  @JsonProperty("engineHours")
  private Integer engineHours;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public Asset assetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
    return this;
  }

   /**
   * Serial number of the host asset
   * @return assetSerialNumber
  **/
    public String getAssetSerialNumber() {
    return assetSerialNumber;
  }

  public void setAssetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
  }

  public Asset cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public Asset addCableItem(AssetCable cableItem) {
    if (cable == null) {
      cable = new ArrayList<>();
    }
    cable.add(cableItem);
    return this;
  }

   /**
   * The cable connected to the asset
   * @return cable
  **/
  @Valid
  public List<AssetCable> getCable() {
    return cable;
  }

  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

  public Asset engineHours(Integer engineHours) {
    this.engineHours = engineHours;
    return this;
  }

   /**
   * Engine hours
   * @return engineHours
  **/
    public Integer getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

  public Asset id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Asset ID
   * @return id
  **/
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Asset name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Asset name
   * @return name
  **/
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
    Asset asset = (Asset) o;
    return Objects.equals(assetSerialNumber, asset.assetSerialNumber) &&
        Objects.equals(cable, asset.cable) &&
        Objects.equals(engineHours, asset.engineHours) &&
        Objects.equals(id, asset.id) &&
        Objects.equals(name, asset.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetSerialNumber, cable, engineHours, id, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    assetSerialNumber: ").append(toIndentedString(assetSerialNumber)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
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

