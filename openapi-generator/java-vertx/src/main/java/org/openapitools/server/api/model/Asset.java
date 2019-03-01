package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AssetCable;

/**
 * Basic information of an asset
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Asset   {
  
  private String assetSerialNumber;
  private List<AssetCable> cable = new ArrayList<>();
  private Integer engineHours;
  private Long id;
  private String name;

  public Asset () {

  }

  public Asset (String assetSerialNumber, List<AssetCable> cable, Integer engineHours, Long id, String name) {
    this.assetSerialNumber = assetSerialNumber;
    this.cable = cable;
    this.engineHours = engineHours;
    this.id = id;
    this.name = name;
  }

    
  @JsonProperty("assetSerialNumber")
  public String getAssetSerialNumber() {
    return assetSerialNumber;
  }
  public void setAssetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
