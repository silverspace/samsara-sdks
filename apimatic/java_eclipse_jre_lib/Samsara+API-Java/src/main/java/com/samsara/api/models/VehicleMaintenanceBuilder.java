/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class VehicleMaintenanceBuilder {
    //the instance to build
    private VehicleMaintenance vehicleMaintenance;

    /**
     * Default constructor to initialize the instance
     */
    public VehicleMaintenanceBuilder() {
        vehicleMaintenance = new VehicleMaintenance();
    }

    /**
     * ID of the vehicle.
     */
    public VehicleMaintenanceBuilder id(long id) {
        vehicleMaintenance.setId(id);
        return this;
    }

    /**
     * J1939 based data. Null if no data is available.
     */
    public VehicleMaintenanceBuilder j1939(J1939 j1939) {
        vehicleMaintenance.setJ1939(j1939);
        return this;
    }

    /**
     * Passenger vehicle data. Null if no data is available.
     */
    public VehicleMaintenanceBuilder passenger(Passenger passenger) {
        vehicleMaintenance.setPassenger(passenger);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VehicleMaintenance build() {
        return vehicleMaintenance;
    }
}