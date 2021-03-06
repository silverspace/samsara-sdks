/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class HosAuthenticationLogsResponseBuilder {
    //the instance to build
    private HosAuthenticationLogsResponse hosAuthenticationLogsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HosAuthenticationLogsResponseBuilder() {
        hosAuthenticationLogsResponse = new HosAuthenticationLogsResponse();
    }

    public HosAuthenticationLogsResponseBuilder authenticationLogs(List<AuthenticationLog> authenticationLogs) {
        hosAuthenticationLogsResponse.setAuthenticationLogs(authenticationLogs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HosAuthenticationLogsResponse build() {
        return hosAuthenticationLogsResponse;
    }
}