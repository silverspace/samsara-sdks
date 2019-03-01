package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AssetCurrentLocation {
    /* The latitude of the location in degrees. */
    Double latitude

    /* The best effort (street,city,state) for the latitude and longitude. */
    String location

    /* The longitude of the location in degrees. */
    Double longitude

    /* The speed calculated from GPS that the asset was traveling at in miles per hour. */
    Double speedMilesPerHour

    /* Time in Unix milliseconds since epoch when the asset was at the location. */
    Long timeMs

}
