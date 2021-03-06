package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DocumentBase {
    /* ID of the Samsara dispatch job for which the document is submitted */
    Long dispatchJobId

    /* Notes submitted with this document. */
    String notes

}
