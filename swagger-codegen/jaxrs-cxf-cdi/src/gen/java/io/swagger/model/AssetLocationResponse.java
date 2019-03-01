package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AssetLocationResponseInner;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * A list of historical asset locations.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A list of historical asset locations.")

public class AssetLocationResponse extends ArrayList<AssetLocationResponseInner>  {
  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetLocationResponse assetLocationResponse = (AssetLocationResponse) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetLocationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

