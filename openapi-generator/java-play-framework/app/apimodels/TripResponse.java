package apimodels;

import apimodels.TripResponseTrips;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TripResponse   {
  @JsonProperty("trips")
  private List<TripResponseTrips> trips = null;

  public TripResponse trips(List<TripResponseTrips> trips) {
    this.trips = trips;
    return this;
  }

  public TripResponse addTripsItem(TripResponseTrips tripsItem) {
    if (trips == null) {
      trips = new ArrayList<>();
    }
    trips.add(tripsItem);
    return this;
  }

   /**
   * Get trips
   * @return trips
  **/
  @Valid
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
    return Objects.equals(trips, tripResponse.trips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trips);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

