package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineResponse200   {
  
  private List<Asset> assets = null;


  /**
   **/
  public InlineResponse200 assets(List<Asset> assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assets")
  public List<Asset> getAssets() {
    return assets;
  }
  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

  public InlineResponse200 addAssetsItem(Asset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<Asset>();
    }
    this.assets.add(assetsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(assets, inlineResponse200.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

