/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DiagnosticTroubleCodeBuilder {
    //the instance to build
    private DiagnosticTroubleCode diagnosticTroubleCode;

    /**
     * Default constructor to initialize the instance
     */
    public DiagnosticTroubleCodeBuilder() {
        diagnosticTroubleCode = new DiagnosticTroubleCode();
    }

    public DiagnosticTroubleCodeBuilder fmiId(Integer fmiId) {
        diagnosticTroubleCode.setFmiId(fmiId);
        return this;
    }

    public DiagnosticTroubleCodeBuilder fmiText(String fmiText) {
        diagnosticTroubleCode.setFmiText(fmiText);
        return this;
    }

    public DiagnosticTroubleCodeBuilder occurrenceCount(Integer occurrenceCount) {
        diagnosticTroubleCode.setOccurrenceCount(occurrenceCount);
        return this;
    }

    public DiagnosticTroubleCodeBuilder spnDescription(String spnDescription) {
        diagnosticTroubleCode.setSpnDescription(spnDescription);
        return this;
    }

    public DiagnosticTroubleCodeBuilder spnId(Integer spnId) {
        diagnosticTroubleCode.setSpnId(spnId);
        return this;
    }

    public DiagnosticTroubleCodeBuilder txId(Integer txId) {
        diagnosticTroubleCode.setTxId(txId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DiagnosticTroubleCode build() {
        return diagnosticTroubleCode;
    }
}