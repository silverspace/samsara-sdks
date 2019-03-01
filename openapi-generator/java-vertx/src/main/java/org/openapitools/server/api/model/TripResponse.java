package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.TripResponseTrips;

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TripResponse   {
  
  private List<TripResponseTrips> trips = new ArrayList<>();

  public TripResponse () {

  }

  public TripResponse (List<TripResponseTrips> trips) {
    this.trips = trips;
  }

    
  @JsonProperty("trips")
  public List<TripResponseTrips> getTrips() {
    return trips;
  }
  public void setTrips(List<TripResponseTrips> trips) {
    this.trips = trips;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripResponse tripResponse = (TripResponse) o;
    return Objects.equals(trips, tripResponse.trips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripResponse {\n");
    
    sb.append("    trips: ").append(toIndentedString(trips)).append("\n");
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
