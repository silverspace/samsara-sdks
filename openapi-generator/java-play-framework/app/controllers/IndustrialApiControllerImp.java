package controllers;

import apimodels.DataInputHistoryResponse;
import apimodels.InlineObject17;
import apimodels.InlineObject18;
import apimodels.InlineResponse2006;
import apimodels.InlineResponse2007;
import apimodels.MachineHistoryResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class IndustrialApiControllerImp implements IndustrialApiControllerImpInterface {
    @Override
    public InlineResponse2006 getAllDataInputs( @NotNull String accessToken, Long groupId, Long startMs, Long endMs) throws Exception {
        //Do your magic!!!
        return new InlineResponse2006();
    }

    @Override
    public DataInputHistoryResponse getDataInput( @NotNull String accessToken, Long dataInputId, Long startMs, Long endMs) throws Exception {
        //Do your magic!!!
        return new DataInputHistoryResponse();
    }

    @Override
    public InlineResponse2007 getMachines( @NotNull String accessToken, InlineObject18 groupParam) throws Exception {
        //Do your magic!!!
        return new InlineResponse2007();
    }

    @Override
    public MachineHistoryResponse getMachinesHistory( @NotNull String accessToken, InlineObject17 historyParam) throws Exception {
        //Do your magic!!!
        return new MachineHistoryResponse();
    }

}
