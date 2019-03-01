package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetCurrentLocationsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse2001  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<AssetCurrentLocationsResponse> assets = null;
 /**
   * Get assets
   * @return assets
  **/
  @JsonProperty("assets")
  public List<AssetCurrentLocationsResponse> getAssets() {
    return assets;
  }

  public void setAssets(List<AssetCurrentLocationsResponse> assets) {
    this.assets = assets;
  }

  public InlineResponse2001 assets(List<AssetCurrentLocationsResponse> assets) {
    this.assets = assets;
    return this;
  }

  public InlineResponse2001 addAssetsItem(AssetCurrentLocationsResponse assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

