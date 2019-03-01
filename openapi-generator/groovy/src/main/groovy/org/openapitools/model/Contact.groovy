package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Contact {
    /* Email address of the contact */
    String email

    /* First name of the contact */
    String firstName

    /* ID of the contact */
    Long id

    /* Last name of the contact */
    String lastName

    /* Phone number of the contact */
    String phone

}
