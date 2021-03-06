package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TripResponseTrips;
import javax.validation.constraints.*;

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.")

public class TripResponse   {
  
  private List<TripResponseTrips> trips = null;


  /**
   **/
  public TripResponse trips(List<TripResponseTrips> trips) {
    this.trips = trips;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("trips")
  public List<TripResponseTrips> getTrips() {
    return trips;
  }
  public void setTrips(List<TripResponseTrips> trips) {
    this.trips = trips;
  }

  public TripResponse addTripsItem(TripResponseTrips tripsItem) {
    if (this.trips == null) {
      this.trips = new ArrayList<TripResponseTrips>();
    }
    this.trips.add(tripsItem);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

