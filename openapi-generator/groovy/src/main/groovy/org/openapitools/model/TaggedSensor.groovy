package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedSensorBase;

@Canonical
class TaggedSensor {
    /* The ID of the Sensor being tagged. */
    Long id

    /* Name of the Sensor being tagged. */
    String name

}
