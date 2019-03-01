package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;
import org.openapitools.model.Contact;
import org.openapitools.model.TagMetadata;

@Canonical
class Address {
    List<Contact> contacts = new ArrayList<Contact>()

    /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
    String formattedAddress

    AddressGeofence geofence = null

    /* ID of the address */
    Long id

    /* Name of the address or geofence */
    String name

    /* Notes associated with an address. */
    String notes

    List<TagMetadata> tags = new ArrayList<TagMetadata>()

}
