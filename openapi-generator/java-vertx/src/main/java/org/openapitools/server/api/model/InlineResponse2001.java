package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AssetCurrentLocationsResponse;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineResponse2001   {
  
  private List<AssetCurrentLocationsResponse> assets = new ArrayList<>();

  public InlineResponse2001 () {

  }

  public InlineResponse2001 (List<AssetCurrentLocationsResponse> assets) {
    this.assets = assets;
  }

    
  @JsonProperty("assets")
  public List<AssetCurrentLocationsResponse> getAssets() {
    return assets;
  }
  public void setAssets(List<AssetCurrentLocationsResponse> assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(assets, inlineResponse2001.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
