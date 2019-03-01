package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Pagination   {
  
  private String endCursor;
  private Boolean hasNextPage;
  private Boolean hasPrevPage;
  private String startCursor;

  public Pagination () {

  }

  public Pagination (String endCursor, Boolean hasNextPage, Boolean hasPrevPage, String startCursor) {
    this.endCursor = endCursor;
    this.hasNextPage = hasNextPage;
    this.hasPrevPage = hasPrevPage;
    this.startCursor = startCursor;
  }

    
  @JsonProperty("endCursor")
  public String getEndCursor() {
    return endCursor;
  }
  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

    
  @JsonProperty("hasNextPage")
  public Boolean getHasNextPage() {
    return hasNextPage;
  }
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

    
  @JsonProperty("hasPrevPage")
  public Boolean getHasPrevPage() {
    return hasPrevPage;
  }
  public void setHasPrevPage(Boolean hasPrevPage) {
    this.hasPrevPage = hasPrevPage;
  }

    
  @JsonProperty("startCursor")
  public String getStartCursor() {
    return startCursor;
  }
  public void setStartCursor(String startCursor) {
    this.startCursor = startCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(endCursor, pagination.endCursor) &&
        Objects.equals(hasNextPage, pagination.hasNextPage) &&
        Objects.equals(hasPrevPage, pagination.hasPrevPage) &&
        Objects.equals(startCursor, pagination.startCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCursor, hasNextPage, hasPrevPage, startCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    endCursor: ").append(toIndentedString(endCursor)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    hasPrevPage: ").append(toIndentedString(hasPrevPage)).append("\n");
    sb.append("    startCursor: ").append(toIndentedString(startCursor)).append("\n");
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
