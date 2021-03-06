/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api;

import com.samsara.api.controllers.*;
import com.samsara.api.http.client.HttpClient;

public class SamsaraAPIClient {
    /**
     * Singleton access to Tags controller
     * @return	Returns the TagsController instance 
     */
    public TagsController getTags() {
        return TagsController.getInstance();
    }

    /**
     * Singleton access to Fleet controller
     * @return	Returns the FleetController instance 
     */
    public FleetController getFleet() {
        return FleetController.getInstance();
    }

    /**
     * Singleton access to Users controller
     * @return	Returns the UsersController instance 
     */
    public UsersController getUsers() {
        return UsersController.getInstance();
    }

    /**
     * Singleton access to Industrial controller
     * @return	Returns the IndustrialController instance 
     */
    public IndustrialController getIndustrial() {
        return IndustrialController.getInstance();
    }

    /**
     * Singleton access to Sensors controller
     * @return	Returns the SensorsController instance 
     */
    public SensorsController getSensors() {
        return SensorsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public SamsaraAPIClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public SamsaraAPIClient(String accessToken) {
        this();
        Configuration.accessToken = accessToken;
    }
}