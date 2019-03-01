package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AssetCable   {
  
  private String assetType;


  /**
   * Asset type
   **/
  public AssetCable assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  
  @ApiModelProperty(example = "Reefer (Thermo King)", value = "Asset type")
  @JsonProperty("assetType")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetCable assetCable = (AssetCable) o;
    return Objects.equals(assetType, assetCable.assetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCable {\n");
    
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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

