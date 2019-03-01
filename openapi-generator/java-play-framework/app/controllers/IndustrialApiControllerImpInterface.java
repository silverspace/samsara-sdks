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

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface IndustrialApiControllerImpInterface {
    InlineResponse2006 getAllDataInputs( @NotNull String accessToken, Long groupId, Long startMs, Long endMs) throws Exception;

    DataInputHistoryResponse getDataInput( @NotNull String accessToken, Long dataInputId, Long startMs, Long endMs) throws Exception;

    InlineResponse2007 getMachines( @NotNull String accessToken, InlineObject18 groupParam) throws Exception;

    MachineHistoryResponse getMachinesHistory( @NotNull String accessToken, InlineObject17 historyParam) throws Exception;

}
