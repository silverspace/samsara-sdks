/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ReeferStats 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8717163703926569648L;
    private List<Alarm> alarms;
    private List<EngineHour> engineHours;
    private List<FuelPercentage> fuelPercentage;
    private List<PowerStatus> powerStatus;
    private List<ReturnAirTemp> returnAirTemp;
    private List<SetPoint> setPoint;
    /** GETTER
     * Reefer alarms
     */
    @JsonGetter("alarms")
    public List<Alarm> getAlarms ( ) { 
        return this.alarms;
    }
    
    /** SETTER
     * Reefer alarms
     */
    @JsonSetter("alarms")
    public void setAlarms (List<Alarm> value) { 
        this.alarms = value;
    }
 
    /** GETTER
     * Engine hours of the reefer
     */
    @JsonGetter("engineHours")
    public List<EngineHour> getEngineHours ( ) { 
        return this.engineHours;
    }
    
    /** SETTER
     * Engine hours of the reefer
     */
    @JsonSetter("engineHours")
    public void setEngineHours (List<EngineHour> value) { 
        this.engineHours = value;
    }
 
    /** GETTER
     * Fuel percentage of the reefer
     */
    @JsonGetter("fuelPercentage")
    public List<FuelPercentage> getFuelPercentage ( ) { 
        return this.fuelPercentage;
    }
    
    /** SETTER
     * Fuel percentage of the reefer
     */
    @JsonSetter("fuelPercentage")
    public void setFuelPercentage (List<FuelPercentage> value) { 
        this.fuelPercentage = value;
    }
 
    /** GETTER
     * Power status of the reefer
     */
    @JsonGetter("powerStatus")
    public List<PowerStatus> getPowerStatus ( ) { 
        return this.powerStatus;
    }
    
    /** SETTER
     * Power status of the reefer
     */
    @JsonSetter("powerStatus")
    public void setPowerStatus (List<PowerStatus> value) { 
        this.powerStatus = value;
    }
 
    /** GETTER
     * Return air temperature of the reefer
     */
    @JsonGetter("returnAirTemp")
    public List<ReturnAirTemp> getReturnAirTemp ( ) { 
        return this.returnAirTemp;
    }
    
    /** SETTER
     * Return air temperature of the reefer
     */
    @JsonSetter("returnAirTemp")
    public void setReturnAirTemp (List<ReturnAirTemp> value) { 
        this.returnAirTemp = value;
    }
 
    /** GETTER
     * Set point temperature of the reefer
     */
    @JsonGetter("setPoint")
    public List<SetPoint> getSetPoint ( ) { 
        return this.setPoint;
    }
    
    /** SETTER
     * Set point temperature of the reefer
     */
    @JsonSetter("setPoint")
    public void setSetPoint (List<SetPoint> value) { 
        this.setPoint = value;
    }
 
}
