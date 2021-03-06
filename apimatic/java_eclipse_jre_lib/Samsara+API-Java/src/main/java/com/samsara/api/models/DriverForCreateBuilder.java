/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DriverForCreateBuilder {
    //the instance to build
    private DriverForCreate driverForCreate;

    /**
     * Default constructor to initialize the instance
     */
    public DriverForCreateBuilder() {
        driverForCreate = new DriverForCreate();
    }

    /**
     * Driver's password for the driver app.
     */
    public DriverForCreateBuilder password(String password) {
        driverForCreate.setPassword(password);
        return this;
    }

    /**
     * A list of tag IDs.
     */
    public DriverForCreateBuilder tagIds(List<Long> tagIds) {
        driverForCreate.setTagIds(tagIds);
        return this;
    }

    /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     */
    public DriverForCreateBuilder eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
        driverForCreate.setEldAdverseWeatherExemptionEnabled(eldAdverseWeatherExemptionEnabled);
        return this;
    }

    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     */
    public DriverForCreateBuilder eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
        driverForCreate.setEldBigDayExemptionEnabled(eldBigDayExemptionEnabled);
        return this;
    }

    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     */
    public DriverForCreateBuilder eldDayStartHour(Integer eldDayStartHour) {
        driverForCreate.setEldDayStartHour(eldDayStartHour);
        return this;
    }

    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     */
    public DriverForCreateBuilder eldExempt(Boolean eldExempt) {
        driverForCreate.setEldExempt(eldExempt);
        return this;
    }

    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     */
    public DriverForCreateBuilder eldExemptReason(String eldExemptReason) {
        driverForCreate.setEldExemptReason(eldExemptReason);
        return this;
    }

    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     */
    public DriverForCreateBuilder eldPcEnabled(Boolean eldPcEnabled) {
        driverForCreate.setEldPcEnabled(eldPcEnabled);
        return this;
    }

    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     */
    public DriverForCreateBuilder eldYmEnabled(Boolean eldYmEnabled) {
        driverForCreate.setEldYmEnabled(eldYmEnabled);
        return this;
    }

    /**
     * Dictionary of external IDs (string key-value pairs)
     */
    public DriverForCreateBuilder externalIds(LinkedHashMap<String, String> externalIds) {
        driverForCreate.setExternalIds(externalIds);
        return this;
    }

    /**
     * ID of the group if the organization has multiple groups (uncommon).
     */
    public DriverForCreateBuilder groupId(Long groupId) {
        driverForCreate.setGroupId(groupId);
        return this;
    }

    /**
     * Driver's state issued license number.
     */
    public DriverForCreateBuilder licenseNumber(String licenseNumber) {
        driverForCreate.setLicenseNumber(licenseNumber);
        return this;
    }

    /**
     * Abbreviation of state that issued driver's license.
     */
    public DriverForCreateBuilder licenseState(String licenseState) {
        driverForCreate.setLicenseState(licenseState);
        return this;
    }

    /**
     * Driver's name.
     */
    public DriverForCreateBuilder name(String name) {
        driverForCreate.setName(name);
        return this;
    }

    /**
     * Notes about the driver.
     */
    public DriverForCreateBuilder notes(String notes) {
        driverForCreate.setNotes(notes);
        return this;
    }

    /**
     * Driver's phone number. Please include only digits, ex. 4157771234
     */
    public DriverForCreateBuilder phone(String phone) {
        driverForCreate.setPhone(phone);
        return this;
    }

    /**
     * Driver's login username into the driver app.
     */
    public DriverForCreateBuilder username(String username) {
        driverForCreate.setUsername(username);
        return this;
    }

    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     */
    public DriverForCreateBuilder vehicleId(Long vehicleId) {
        driverForCreate.setVehicleId(vehicleId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DriverForCreate build() {
        return driverForCreate;
    }
}