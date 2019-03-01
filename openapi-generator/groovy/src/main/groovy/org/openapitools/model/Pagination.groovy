package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Pagination {
    /* Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter. */
    String endCursor

    /* True if there are more pages of results after this response. */
    Boolean hasNextPage

    /* True if there are more pages of results before this response. */
    Boolean hasPrevPage

    /* Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter. */
    String startCursor

}
