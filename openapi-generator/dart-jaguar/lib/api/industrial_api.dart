import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/inline_response2007.dart';
import 'package:openapi/model/inline_response2006.dart';
import 'package:openapi/model/machine_history_response.dart';
import 'package:openapi/model/inline_object18.dart';
import 'package:openapi/model/data_input_history_response.dart';
import 'package:openapi/model/inline_object17.dart';


part 'industrial_api.jretro.dart';

@GenApiClient()
class IndustrialApi extends _$IndustrialApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    IndustrialApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// /industrial/data
    ///
    /// Fetch all of the data inputs for a group.
    @GetReq(path: "/industrial/data")
    Future<InlineResponse2006> getAllDataInputs(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getAllDataInputs(
        
        accessToken, 
        
        groupId, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /industrial/data/{data_input_id:[0-9]+}
    ///
    /// Fetch datapoints from a given data input.
    @GetReq(path: "/industrial/data/:data_input_id")
    Future<DataInputHistoryResponse> getDataInput(
            @PathParam("data_input_id") int dataInputId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getDataInput(
        dataInputId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /machines/list
    ///
    /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
    @PostReq(path: "/machines/list")
    Future<InlineResponse2007> getMachines(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject18 groupParam
        ) {
        return super.getMachines(
        
        accessToken

        ,
        groupParam
        ).timeout(timeout);
    }

    /// /machines/history
    ///
    /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
    @PostReq(path: "/machines/history")
    Future<MachineHistoryResponse> getMachinesHistory(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject17 historyParam
        ) {
        return super.getMachinesHistory(
        
        accessToken

        ,
        historyParam
        ).timeout(timeout);
    }


}
