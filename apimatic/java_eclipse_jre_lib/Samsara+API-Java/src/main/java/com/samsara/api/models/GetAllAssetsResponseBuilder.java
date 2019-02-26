/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class GetAllAssetsResponseBuilder {
    //the instance to build
    private GetAllAssetsResponse getAllAssetsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetAllAssetsResponseBuilder() {
        getAllAssetsResponse = new GetAllAssetsResponse();
    }

    public GetAllAssetsResponseBuilder assets(List<Asset> assets) {
        getAllAssetsResponse.setAssets(assets);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAllAssetsResponse build() {
        return getAllAssetsResponse;
    }
}