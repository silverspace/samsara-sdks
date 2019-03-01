package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InlineObject2 {
    /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
    String address

    /* Group ID to query. */
    Long groupId

    /* Name of the location to add to the address book. */
    String name

    /* Radius in meters of the address (used for matching vehicle trip stops to this location). */
    Integer radius

}
