/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class PaginationBuilder {
    //the instance to build
    private Pagination pagination;

    /**
     * Default constructor to initialize the instance
     */
    public PaginationBuilder() {
        pagination = new Pagination();
    }

    /**
     * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
     */
    public PaginationBuilder endCursor(String endCursor) {
        pagination.setEndCursor(endCursor);
        return this;
    }

    /**
     * True if there are more pages of results after this response.
     */
    public PaginationBuilder hasNextPage(boolean hasNextPage) {
        pagination.setHasNextPage(hasNextPage);
        return this;
    }

    /**
     * True if there are more pages of results before this response.
     */
    public PaginationBuilder hasPrevPage(boolean hasPrevPage) {
        pagination.setHasPrevPage(hasPrevPage);
        return this;
    }

    /**
     * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
     */
    public PaginationBuilder startCursor(String startCursor) {
        pagination.setStartCursor(startCursor);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Pagination build() {
        return pagination;
    }
}