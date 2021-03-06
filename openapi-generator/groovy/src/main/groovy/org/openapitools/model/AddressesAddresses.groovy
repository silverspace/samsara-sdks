package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;

@Canonical
class AddressesAddresses {
    /* Notes associated with an address. */
    String notes

    /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
    String formattedAddress

    AddressGeofence geofence = null

    /* A list of tag IDs. */
    List<Long> tagIds = new ArrayList<Long>()

    /* The name of this address/geofence */
    String name

    /* A list of IDs for contact book entries. */
    List<Long> contactIds = new ArrayList<Long>()

}
