package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetCable;
import org.openapitools.model.AssetCurrentLocation;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Basic information of an asset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class AssetCurrentLocationsResponse   {
  
  private List<AssetCable> cable = new ArrayList<AssetCable>();
  private Integer engineHours;
  private Long id;
  private List<AssetCurrentLocation> location = new ArrayList<AssetCurrentLocation>();
  private String name;

  /**
   * The cable connected to the asset
   **/
  
  @ApiModelProperty(value = "The cable connected to the asset")
  @JsonProperty("cable")
  public List<AssetCable> getCable() {
    return cable;
  }
  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

  /**
   * Engine hours
   **/
  
  @ApiModelProperty(example = "104", value = "Engine hours")
  @JsonProperty("engineHours")
  public Integer getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

  /**
   * Asset ID
   **/
  
  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Current location of an asset
   **/
  
  @ApiModelProperty(value = "Current location of an asset")
  @JsonProperty("location")
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }
  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

  /**
   * Asset name
   **/
  
  @ApiModelProperty(example = "Trailer 123", value = "Asset name")
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

