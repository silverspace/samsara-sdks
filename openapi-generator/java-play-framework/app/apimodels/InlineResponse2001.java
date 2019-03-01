package apimodels;

import apimodels.AssetCurrentLocationsResponse;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse2001   {
  @JsonProperty("assets")
  private List<AssetCurrentLocationsResponse> assets = null;

  public InlineResponse2001 assets(List<AssetCurrentLocationsResponse> assets) {
    this.assets = assets;
    return this;
  }

  public InlineResponse2001 addAssetsItem(AssetCurrentLocationsResponse assetsItem) {
    if (assets == null) {
      assets = new ArrayList<>();
    }
    assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @Valid
  public List<AssetCurrentLocationsResponse> getAssets() {
    return assets;
  }

  public void setAssets(List<AssetCurrentLocationsResponse> assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

