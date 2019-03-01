package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AssetCable;
import org.openapitools.server.api.model.AssetCurrentLocation;

/**
 * Basic information of an asset
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AssetCurrentLocationsResponse   {
  
  private List<AssetCable> cable = new ArrayList<>();
  private Integer engineHours;
  private Long id;
  private List<AssetCurrentLocation> location = new ArrayList<>();
  private String name;

  public AssetCurrentLocationsResponse () {

  }

  public AssetCurrentLocationsResponse (List<AssetCable> cable, Integer engineHours, Long id, List<AssetCurrentLocation> location, String name) {
    this.cable = cable;
    this.engineHours = engineHours;
    this.id = id;
    this.location = location;
    this.name = name;
  }

    
  @JsonProperty("cable")
  public List<AssetCable> getCable() {
    return cable;
  }
  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

    
  @JsonProperty("engineHours")
  public Integer getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("location")
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }
  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
