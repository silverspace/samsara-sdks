/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DiagnosticTroubleCode1Builder {
    //the instance to build
    private DiagnosticTroubleCode1 diagnosticTroubleCode1;

    /**
     * Default constructor to initialize the instance
     */
    public DiagnosticTroubleCode1Builder() {
        diagnosticTroubleCode1 = new DiagnosticTroubleCode1();
    }

    public DiagnosticTroubleCode1Builder dtcDescription(String dtcDescription) {
        diagnosticTroubleCode1.setDtcDescription(dtcDescription);
        return this;
    }

    public DiagnosticTroubleCode1Builder dtcId(Integer dtcId) {
        diagnosticTroubleCode1.setDtcId(dtcId);
        return this;
    }

    public DiagnosticTroubleCode1Builder dtcShortCode(String dtcShortCode) {
        diagnosticTroubleCode1.setDtcShortCode(dtcShortCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DiagnosticTroubleCode1 build() {
        return diagnosticTroubleCode1;
    }
}