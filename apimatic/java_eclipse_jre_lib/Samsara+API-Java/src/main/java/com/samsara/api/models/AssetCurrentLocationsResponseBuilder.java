/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class AssetCurrentLocationsResponseBuilder {
    //the instance to build
    private AssetCurrentLocationsResponse assetCurrentLocationsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public AssetCurrentLocationsResponseBuilder() {
        assetCurrentLocationsResponse = new AssetCurrentLocationsResponse();
    }

    /**
     * The cable connected to the asset
     */
    public AssetCurrentLocationsResponseBuilder cable(List<Cable> cable) {
        assetCurrentLocationsResponse.setCable(cable);
        return this;
    }

    /**
     * Engine hours
     */
    public AssetCurrentLocationsResponseBuilder engineHours(Integer engineHours) {
        assetCurrentLocationsResponse.setEngineHours(engineHours);
        return this;
    }

    /**
     * Asset ID
     */
    public AssetCurrentLocationsResponseBuilder id(long id) {
        assetCurrentLocationsResponse.setId(id);
        return this;
    }

    /**
     * Current location of an asset
     */
    public AssetCurrentLocationsResponseBuilder location(List<AssetCurrentLocation> location) {
        assetCurrentLocationsResponse.setLocation(location);
        return this;
    }

    /**
     * Asset name
     */
    public AssetCurrentLocationsResponseBuilder name(String name) {
        assetCurrentLocationsResponse.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssetCurrentLocationsResponse build() {
        return assetCurrentLocationsResponse;
    }
}