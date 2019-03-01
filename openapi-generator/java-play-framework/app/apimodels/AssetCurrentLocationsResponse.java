package apimodels;

import apimodels.AssetCable;
import apimodels.AssetCurrentLocation;
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
public class AssetCurrentLocationsResponse   {
  @JsonProperty("cable")
  private List<AssetCable> cable = null;

  @JsonProperty("engineHours")
  private Integer engineHours;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("location")
  private List<AssetCurrentLocation> location = null;

  @JsonProperty("name")
  private String name;

  public AssetCurrentLocationsResponse cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public AssetCurrentLocationsResponse addCableItem(AssetCable cableItem) {
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

  public AssetCurrentLocationsResponse engineHours(Integer engineHours) {
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

  public AssetCurrentLocationsResponse id(Long id) {
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

  public AssetCurrentLocationsResponse location(List<AssetCurrentLocation> location) {
    this.location = location;
    return this;
  }

  public AssetCurrentLocationsResponse addLocationItem(AssetCurrentLocation locationItem) {
    if (location == null) {
      location = new ArrayList<>();
    }
    location.add(locationItem);
    return this;
  }

   /**
   * Current location of an asset
   * @return location
  **/
  @Valid
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }

  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

  public AssetCurrentLocationsResponse name(String name) {
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
    AssetCurrentLocationsResponse assetCurrentLocationsResponse = (AssetCurrentLocationsResponse) o;
    return Objects.equals(cable, assetCurrentLocationsResponse.cable) &&
        Objects.equals(engineHours, assetCurrentLocationsResponse.engineHours) &&
        Objects.equals(id, assetCurrentLocationsResponse.id) &&
        Objects.equals(location, assetCurrentLocationsResponse.location) &&
        Objects.equals(name, assetCurrentLocationsResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cable, engineHours, id, location, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCurrentLocationsResponse {\n");
    
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

