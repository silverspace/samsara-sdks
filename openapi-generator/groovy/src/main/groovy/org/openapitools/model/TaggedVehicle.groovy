package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedVehicleBase;

@Canonical
class TaggedVehicle {
    /* The ID of the Vehicle being tagged. */
    Long id

    /* Name of the Vehicle being tagged. */
    String name

}
