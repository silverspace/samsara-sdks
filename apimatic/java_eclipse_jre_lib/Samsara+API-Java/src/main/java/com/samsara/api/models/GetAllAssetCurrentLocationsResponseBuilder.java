/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class GetAllAssetCurrentLocationsResponseBuilder {
    //the instance to build
    private GetAllAssetCurrentLocationsResponse getAllAssetCurrentLocationsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetAllAssetCurrentLocationsResponseBuilder() {
        getAllAssetCurrentLocationsResponse = new GetAllAssetCurrentLocationsResponse();
    }

    public GetAllAssetCurrentLocationsResponseBuilder assets(List<AssetCurrentLocationsResponse> assets) {
        getAllAssetCurrentLocationsResponse.setAssets(assets);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAllAssetCurrentLocationsResponse build() {
        return getAllAssetCurrentLocationsResponse;
    }
}