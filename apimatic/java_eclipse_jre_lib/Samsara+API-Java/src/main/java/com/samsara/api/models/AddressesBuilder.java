/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class AddressesBuilder {
    //the instance to build
    private Addresses addressesInstance;

    /**
     * Default constructor to initialize the instance
     */
    public AddressesBuilder() {
        addressesInstance = new Addresses();
    }

    public AddressesBuilder addresses(List<Addresses1> addresses) {
        addressesInstance.setAddresses(addresses);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Addresses build() {
        return addressesInstance;
    }
}