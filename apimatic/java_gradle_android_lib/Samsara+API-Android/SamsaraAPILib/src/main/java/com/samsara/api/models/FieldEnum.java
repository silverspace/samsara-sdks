/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum FieldEnum {
    AMBIENTTEMPERATURE, //TODO: Write general description for this element
    PROBETEMPERATURE, //TODO: Write general description for this element
    CURRENTLOOP1RAW, //TODO: Write general description for this element
    CURRENTLOOP1MAPPED, //TODO: Write general description for this element
    CURRENTLOOP2RAW, //TODO: Write general description for this element
    CURRENTLOOP2MAPPED, //TODO: Write general description for this element
    PMPOWERTOTAL, //TODO: Write general description for this element
    PMPHASE1POWER, //TODO: Write general description for this element
    PMPHASE2POWER, //TODO: Write general description for this element
    PMPHASE3POWER, //TODO: Write general description for this element
    PMPHASE1POWERFACTOR, //TODO: Write general description for this element
    PMPHASE2POWERFACTOR, //TODO: Write general description for this element
    PMPHASE3POWERFACTOR; //TODO: Write general description for this element

    private static TreeMap<String, FieldEnum> valueMap = new TreeMap<String, FieldEnum>();
    private String value;

    static {
        AMBIENTTEMPERATURE.value = "ambientTemperature";
        PROBETEMPERATURE.value = "probeTemperature";
        CURRENTLOOP1RAW.value = "currentLoop1Raw";
        CURRENTLOOP1MAPPED.value = "currentLoop1Mapped";
        CURRENTLOOP2RAW.value = "currentLoop2Raw";
        CURRENTLOOP2MAPPED.value = "currentLoop2Mapped";
        PMPOWERTOTAL.value = "pmPowerTotal";
        PMPHASE1POWER.value = "pmPhase1Power";
        PMPHASE2POWER.value = "pmPhase2Power";
        PMPHASE3POWER.value = "pmPhase3Power";
        PMPHASE1POWERFACTOR.value = "pmPhase1PowerFactor";
        PMPHASE2POWERFACTOR.value = "pmPhase2PowerFactor";
        PMPHASE3POWERFACTOR.value = "pmPhase3PowerFactor";

        valueMap.put("ambientTemperature", AMBIENTTEMPERATURE);
        valueMap.put("probeTemperature", PROBETEMPERATURE);
        valueMap.put("currentLoop1Raw", CURRENTLOOP1RAW);
        valueMap.put("currentLoop1Mapped", CURRENTLOOP1MAPPED);
        valueMap.put("currentLoop2Raw", CURRENTLOOP2RAW);
        valueMap.put("currentLoop2Mapped", CURRENTLOOP2MAPPED);
        valueMap.put("pmPowerTotal", PMPOWERTOTAL);
        valueMap.put("pmPhase1Power", PMPHASE1POWER);
        valueMap.put("pmPhase2Power", PMPHASE2POWER);
        valueMap.put("pmPhase3Power", PMPHASE3POWER);
        valueMap.put("pmPhase1PowerFactor", PMPHASE1POWERFACTOR);
        valueMap.put("pmPhase2PowerFactor", PMPHASE2POWERFACTOR);
        valueMap.put("pmPhase3PowerFactor", PMPHASE3POWERFACTOR);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static FieldEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of FieldEnum values to list of string values
     * @param toConvert The list of FieldEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<FieldEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (FieldEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 