/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DocumentBuilder {
    //the instance to build
    private Document document;

    /**
     * Default constructor to initialize the instance
     */
    public DocumentBuilder() {
        document = new Document();
    }

    /**
     * Descriptive name of this type of document.
     */
    public DocumentBuilder documentType(String documentType) {
        document.setDocumentType(documentType);
        return this;
    }

    /**
     * The time in Unix epoch milliseconds that the document is created.
     */
    public DocumentBuilder driverCreatedAtMs(long driverCreatedAtMs) {
        document.setDriverCreatedAtMs(driverCreatedAtMs);
        return this;
    }

    /**
     * ID of the driver for whom the document is submitted
     */
    public DocumentBuilder driverId(long driverId) {
        document.setDriverId(driverId);
        return this;
    }

    /**
     * The fields associated with this document.
     */
    public DocumentBuilder fields(List<DocumentField> fields) {
        document.setFields(fields);
        return this;
    }

    /**
     * VehicleID of the driver at document creation.
     */
    public DocumentBuilder vehicleId(Long vehicleId) {
        document.setVehicleId(vehicleId);
        return this;
    }

    /**
     * ID of the Samsara dispatch job for which the document is submitted
     */
    public DocumentBuilder dispatchJobId(Long dispatchJobId) {
        document.setDispatchJobId(dispatchJobId);
        return this;
    }

    /**
     * Notes submitted with this document.
     */
    public DocumentBuilder notes(String notes) {
        document.setNotes(notes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Document build() {
        return document;
    }
}