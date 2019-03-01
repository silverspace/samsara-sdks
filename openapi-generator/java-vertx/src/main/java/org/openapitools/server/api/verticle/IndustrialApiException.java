package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DataInputHistoryResponse;
import org.openapitools.server.api.model.InlineObject17;
import org.openapitools.server.api.model.InlineObject18;
import org.openapitools.server.api.model.InlineResponse2006;
import org.openapitools.server.api.model.InlineResponse2007;
import org.openapitools.server.api.model.MachineHistoryResponse;
import org.openapitools.server.api.MainApiException;

public final class IndustrialApiException extends MainApiException {
    public IndustrialApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final IndustrialApiException Industrial_getAllDataInputs_0_Exception = new IndustrialApiException(0, "Unexpected error.");
    public static final IndustrialApiException Industrial_getDataInput_0_Exception = new IndustrialApiException(0, "Unexpected error.");
    public static final IndustrialApiException Industrial_getMachines_0_Exception = new IndustrialApiException(0, "Unexpected error.");
    public static final IndustrialApiException Industrial_getMachinesHistory_0_Exception = new IndustrialApiException(0, "Unexpected error.");
    

}