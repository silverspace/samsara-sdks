/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class J1939 
        implements java.io.Serializable {
    private static final long serialVersionUID = -3690834968068238709L;
    private CheckEngineLight checkEngineLight;
    private List<DiagnosticTroubleCode> diagnosticTroubleCodes;
    /** GETTER
     * J1939 check engine lights.
     */
    @JsonGetter("checkEngineLight")
    public CheckEngineLight getCheckEngineLight ( ) { 
        return this.checkEngineLight;
    }
    
    /** SETTER
     * J1939 check engine lights.
     */
    @JsonSetter("checkEngineLight")
    public void setCheckEngineLight (CheckEngineLight value) { 
        this.checkEngineLight = value;
    }
 
    /** GETTER
     * J1939 DTCs.
     */
    @JsonGetter("diagnosticTroubleCodes")
    public List<DiagnosticTroubleCode> getDiagnosticTroubleCodes ( ) { 
        return this.diagnosticTroubleCodes;
    }
    
    /** SETTER
     * J1939 DTCs.
     */
    @JsonSetter("diagnosticTroubleCodes")
    public void setDiagnosticTroubleCodes (List<DiagnosticTroubleCode> value) { 
        this.diagnosticTroubleCodes = value;
    }
 
}