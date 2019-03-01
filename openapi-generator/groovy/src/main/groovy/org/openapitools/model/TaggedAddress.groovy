package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedAddressBase;

@Canonical
class TaggedAddress {
    /* The ID of the address being tagged. */
    Long id

    /* Name of the address being tagged. */
    String name

}
