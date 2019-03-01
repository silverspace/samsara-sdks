package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TripResponseTrips;

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 */
@ApiModel(description = "Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class TripResponse   {
  @JsonProperty("trips")
  private List<TripResponseTrips> trips = null;

  public TripResponse trips(List<TripResponseTrips> trips) {
    this.trips = trips;
    return this;
  }

  public TripResponse addTripsItem(TripResponseTrips tripsItem) {
    if (this.trips == null) {
      this.trips = new ArrayList<TripResponseTrips>();
    }
    this.trips.add(tripsItem);
    return this;
  }

   /**
   * Get trips
   * @return trips
  **/
  @ApiModelProperty(value = "")
  public List<TripResponseTrips> getTrips() {
    return trips;
  }

  public void setTrips(List<TripResponseTrips> trips) {
    this.trips = trips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripResponse tripResponse = (TripResponse) o;
    return Objects.equals(this.trips, tripResponse.trips);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

