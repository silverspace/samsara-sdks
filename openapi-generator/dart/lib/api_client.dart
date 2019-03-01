part of openapi.api;

class QueryParam {
  String name;
  String value;

  QueryParam(this.name, this.value);
}

class ApiClient {

  String basePath;
  var client = BrowserClient();

  Map<String, String> _defaultHeaderMap = {};
  Map<String, Authentication> _authentications = {};

  final _regList = RegExp(r'^List<(.*)>$');
  final _regMap = RegExp(r'^Map<String,(.*)>$');

  ApiClient({this.basePath: "https://api.samsara.com/v1"}) {
    // Setup authentications (key: authentication name, value: authentication).
  }

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  dynamic _deserialize(dynamic value, String targetType) {
    try {
      switch (targetType) {
        case 'String':
          return '$value';
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'bool':
          return value is bool ? value : '$value'.toLowerCase() == 'true';
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'Address':
          return Address.fromJson(value);
        case 'AddressGeofence':
          return AddressGeofence.fromJson(value);
        case 'AddressGeofenceCircle':
          return AddressGeofenceCircle.fromJson(value);
        case 'AddressGeofencePolygon':
          return AddressGeofencePolygon.fromJson(value);
        case 'AddressGeofencePolygonVertices':
          return AddressGeofencePolygonVertices.fromJson(value);
        case 'AddressesAddresses':
          return AddressesAddresses.fromJson(value);
        case 'AllRouteJobUpdates':
          return AllRouteJobUpdates.fromJson(value);
        case 'Asset':
          return Asset.fromJson(value);
        case 'AssetCable':
          return AssetCable.fromJson(value);
        case 'AssetCurrentLocation':
          return AssetCurrentLocation.fromJson(value);
        case 'AssetCurrentLocationsResponse':
          return AssetCurrentLocationsResponse.fromJson(value);
        case 'AssetReeferResponse':
          return AssetReeferResponse.fromJson(value);
        case 'AssetReeferResponseReeferStats':
          return AssetReeferResponseReeferStats.fromJson(value);
        case 'AssetReeferResponseReeferStatsAlarms':
          return AssetReeferResponseReeferStatsAlarms.fromJson(value);
        case 'AssetReeferResponseReeferStatsAlarms1':
          return AssetReeferResponseReeferStatsAlarms1.fromJson(value);
        case 'AssetReeferResponseReeferStatsEngineHours':
          return AssetReeferResponseReeferStatsEngineHours.fromJson(value);
        case 'AssetReeferResponseReeferStatsFuelPercentage':
          return AssetReeferResponseReeferStatsFuelPercentage.fromJson(value);
        case 'AssetReeferResponseReeferStatsPowerStatus':
          return AssetReeferResponseReeferStatsPowerStatus.fromJson(value);
        case 'AssetReeferResponseReeferStatsReturnAirTemp':
          return AssetReeferResponseReeferStatsReturnAirTemp.fromJson(value);
        case 'AssetReeferResponseReeferStatsSetPoint':
          return AssetReeferResponseReeferStatsSetPoint.fromJson(value);
        case 'AuxInput':
          return AuxInput.fromJson(value);
        case 'AuxInputSeries':
          return AuxInputSeries.fromJson(value);
        case 'CargoResponse':
          return CargoResponse.fromJson(value);
        case 'CargoResponseSensors':
          return CargoResponseSensors.fromJson(value);
        case 'Contact':
          return Contact.fromJson(value);
        case 'CurrentDriver':
          return CurrentDriver.fromJson(value);
        case 'DataInputHistoryResponse':
          return DataInputHistoryResponse.fromJson(value);
        case 'DataInputHistoryResponsePoints':
          return DataInputHistoryResponsePoints.fromJson(value);
        case 'DispatchJob':
          return DispatchJob.fromJson(value);
        case 'DispatchJobCreate':
          return DispatchJobCreate.fromJson(value);
        case 'DispatchRoute':
          return DispatchRoute.fromJson(value);
        case 'DispatchRouteBase':
          return DispatchRouteBase.fromJson(value);
        case 'DispatchRouteCreate':
          return DispatchRouteCreate.fromJson(value);
        case 'DispatchRouteHistoricalEntry':
          return DispatchRouteHistoricalEntry.fromJson(value);
        case 'DispatchRouteHistory':
          return DispatchRouteHistory.fromJson(value);
        case 'Document':
          return Document.fromJson(value);
        case 'DocumentBase':
          return DocumentBase.fromJson(value);
        case 'DocumentCreate':
          return DocumentCreate.fromJson(value);
        case 'DocumentField':
          return DocumentField.fromJson(value);
        case 'DocumentFieldCreate':
          return DocumentFieldCreate.fromJson(value);
        case 'DocumentFieldCreatePhotoValue':
          return DocumentFieldCreatePhotoValue.fromJson(value);
        case 'DocumentFieldType':
          return DocumentFieldType.fromJson(value);
        case 'DocumentFieldTypeNumberValueTypeMetadata':
          return DocumentFieldTypeNumberValueTypeMetadata.fromJson(value);
        case 'DocumentType':
          return DocumentType.fromJson(value);
        case 'DoorResponse':
          return DoorResponse.fromJson(value);
        case 'DoorResponseSensors':
          return DoorResponseSensors.fromJson(value);
        case 'Driver':
          return Driver.fromJson(value);
        case 'DriverBase':
          return DriverBase.fromJson(value);
        case 'DriverDailyLogResponse':
          return DriverDailyLogResponse.fromJson(value);
        case 'DriverDailyLogResponseDays':
          return DriverDailyLogResponseDays.fromJson(value);
        case 'DriverForCreate':
          return DriverForCreate.fromJson(value);
        case 'DriverSafetyScoreResponse':
          return DriverSafetyScoreResponse.fromJson(value);
        case 'DriversResponse':
          return DriversResponse.fromJson(value);
        case 'DriversSummaryResponse':
          return DriversSummaryResponse.fromJson(value);
        case 'DriversSummaryResponseSummaries':
          return DriversSummaryResponseSummaries.fromJson(value);
        case 'DvirBase':
          return DvirBase.fromJson(value);
        case 'DvirBaseAuthorSignature':
          return DvirBaseAuthorSignature.fromJson(value);
        case 'DvirBaseMechanicOrAgentSignature':
          return DvirBaseMechanicOrAgentSignature.fromJson(value);
        case 'DvirBaseNextDriverSignature':
          return DvirBaseNextDriverSignature.fromJson(value);
        case 'DvirBaseTrailerDefects':
          return DvirBaseTrailerDefects.fromJson(value);
        case 'DvirBaseVehicle':
          return DvirBaseVehicle.fromJson(value);
        case 'DvirListResponse':
          return DvirListResponse.fromJson(value);
        case 'EngineState':
          return EngineState.fromJson(value);
        case 'FleetVehicleLocation':
          return FleetVehicleLocation.fromJson(value);
        case 'FleetVehicleResponse':
          return FleetVehicleResponse.fromJson(value);
        case 'FleetVehicleResponseVehicleInfo':
          return FleetVehicleResponseVehicleInfo.fromJson(value);
        case 'HosAuthenticationLogsResponse':
          return HosAuthenticationLogsResponse.fromJson(value);
        case 'HosAuthenticationLogsResponseAuthenticationLogs':
          return HosAuthenticationLogsResponseAuthenticationLogs.fromJson(value);
        case 'HosLogsResponse':
          return HosLogsResponse.fromJson(value);
        case 'HosLogsResponseLogs':
          return HosLogsResponseLogs.fromJson(value);
        case 'HosLogsSummaryResponse':
          return HosLogsSummaryResponse.fromJson(value);
        case 'HosLogsSummaryResponseDrivers':
          return HosLogsSummaryResponseDrivers.fromJson(value);
        case 'HumidityResponse':
          return HumidityResponse.fromJson(value);
        case 'HumidityResponseSensors':
          return HumidityResponseSensors.fromJson(value);
        case 'InlineObject':
          return InlineObject.fromJson(value);
        case 'InlineObject1':
          return InlineObject1.fromJson(value);
        case 'InlineObject10':
          return InlineObject10.fromJson(value);
        case 'InlineObject11':
          return InlineObject11.fromJson(value);
        case 'InlineObject12':
          return InlineObject12.fromJson(value);
        case 'InlineObject13':
          return InlineObject13.fromJson(value);
        case 'InlineObject14':
          return InlineObject14.fromJson(value);
        case 'InlineObject15':
          return InlineObject15.fromJson(value);
        case 'InlineObject16':
          return InlineObject16.fromJson(value);
        case 'InlineObject17':
          return InlineObject17.fromJson(value);
        case 'InlineObject18':
          return InlineObject18.fromJson(value);
        case 'InlineObject19':
          return InlineObject19.fromJson(value);
        case 'InlineObject2':
          return InlineObject2.fromJson(value);
        case 'InlineObject20':
          return InlineObject20.fromJson(value);
        case 'InlineObject21':
          return InlineObject21.fromJson(value);
        case 'InlineObject22':
          return InlineObject22.fromJson(value);
        case 'InlineObject23':
          return InlineObject23.fromJson(value);
        case 'InlineObject24':
          return InlineObject24.fromJson(value);
        case 'InlineObject3':
          return InlineObject3.fromJson(value);
        case 'InlineObject4':
          return InlineObject4.fromJson(value);
        case 'InlineObject5':
          return InlineObject5.fromJson(value);
        case 'InlineObject6':
          return InlineObject6.fromJson(value);
        case 'InlineObject7':
          return InlineObject7.fromJson(value);
        case 'InlineObject8':
          return InlineObject8.fromJson(value);
        case 'InlineObject9':
          return InlineObject9.fromJson(value);
        case 'InlineResponse200':
          return InlineResponse200.fromJson(value);
        case 'InlineResponse2001':
          return InlineResponse2001.fromJson(value);
        case 'InlineResponse2002':
          return InlineResponse2002.fromJson(value);
        case 'InlineResponse2003':
          return InlineResponse2003.fromJson(value);
        case 'InlineResponse2004':
          return InlineResponse2004.fromJson(value);
        case 'InlineResponse2005':
          return InlineResponse2005.fromJson(value);
        case 'InlineResponse2005VehicleStats':
          return InlineResponse2005VehicleStats.fromJson(value);
        case 'InlineResponse2006':
          return InlineResponse2006.fromJson(value);
        case 'InlineResponse2007':
          return InlineResponse2007.fromJson(value);
        case 'InlineResponse2008':
          return InlineResponse2008.fromJson(value);
        case 'InlineResponse2009':
          return InlineResponse2009.fromJson(value);
        case 'JobStatus':
          // Enclose the value in a list so that Dartson can use a transformer
          // to decode it.
          final listValue = [value];
          final List<dynamic> listResult = dson.map(listValue, []);
          return listResult[0];
        case 'JobUpdateObject':
          return JobUpdateObject.fromJson(value);
        case 'Machine':
          return Machine.fromJson(value);
        case 'MachineHistoryResponse':
          return MachineHistoryResponse.fromJson(value);
        case 'MachineHistoryResponseMachines':
          return MachineHistoryResponseMachines.fromJson(value);
        case 'MachineHistoryResponseVibrations':
          return MachineHistoryResponseVibrations.fromJson(value);
        case 'Pagination':
          return Pagination.fromJson(value);
        case 'PrevJobStatus':
          // Enclose the value in a list so that Dartson can use a transformer
          // to decode it.
          final listValue = [value];
          final List<dynamic> listResult = dson.map(listValue, []);
          return listResult[0];
        case 'SafetyReportHarshEvent':
          return SafetyReportHarshEvent.fromJson(value);
        case 'Sensor':
          return Sensor.fromJson(value);
        case 'SensorHistoryResponse':
          return SensorHistoryResponse.fromJson(value);
        case 'SensorHistoryResponseResults':
          return SensorHistoryResponseResults.fromJson(value);
        case 'SensorsHistorySeries':
          return SensorsHistorySeries.fromJson(value);
        case 'Tag':
          return Tag.fromJson(value);
        case 'TagCreate':
          return TagCreate.fromJson(value);
        case 'TagMetadata':
          return TagMetadata.fromJson(value);
        case 'TagModify':
          return TagModify.fromJson(value);
        case 'TagModifyAdd':
          return TagModifyAdd.fromJson(value);
        case 'TagModifyDelete':
          return TagModifyDelete.fromJson(value);
        case 'TagUpdate':
          return TagUpdate.fromJson(value);
        case 'TaggedAddress':
          return TaggedAddress.fromJson(value);
        case 'TaggedAddressBase':
          return TaggedAddressBase.fromJson(value);
        case 'TaggedAsset':
          return TaggedAsset.fromJson(value);
        case 'TaggedAssetBase':
          return TaggedAssetBase.fromJson(value);
        case 'TaggedDriver':
          return TaggedDriver.fromJson(value);
        case 'TaggedDriverBase':
          return TaggedDriverBase.fromJson(value);
        case 'TaggedMachine':
          return TaggedMachine.fromJson(value);
        case 'TaggedMachineBase':
          return TaggedMachineBase.fromJson(value);
        case 'TaggedSensor':
          return TaggedSensor.fromJson(value);
        case 'TaggedSensorBase':
          return TaggedSensorBase.fromJson(value);
        case 'TaggedVehicle':
          return TaggedVehicle.fromJson(value);
        case 'TaggedVehicleBase':
          return TaggedVehicleBase.fromJson(value);
        case 'TemperatureResponse':
          return TemperatureResponse.fromJson(value);
        case 'TemperatureResponseSensors':
          return TemperatureResponseSensors.fromJson(value);
        case 'TripResponse':
          return TripResponse.fromJson(value);
        case 'TripResponseEndCoordinates':
          return TripResponseEndCoordinates.fromJson(value);
        case 'TripResponseStartCoordinates':
          return TripResponseStartCoordinates.fromJson(value);
        case 'TripResponseTrips':
          return TripResponseTrips.fromJson(value);
        case 'User':
          return User.fromJson(value);
        case 'UserBase':
          return UserBase.fromJson(value);
        case 'UserRole':
          return UserRole.fromJson(value);
        case 'UserTagRole':
          return UserTagRole.fromJson(value);
        case 'UserTagRoleTag':
          return UserTagRoleTag.fromJson(value);
        case 'Vehicle':
          return Vehicle.fromJson(value);
        case 'VehicleHarshEventResponse':
          return VehicleHarshEventResponse.fromJson(value);
        case 'VehicleHarshEventResponseLocation':
          return VehicleHarshEventResponseLocation.fromJson(value);
        case 'VehicleLocation':
          return VehicleLocation.fromJson(value);
        case 'VehicleMaintenance':
          return VehicleMaintenance.fromJson(value);
        case 'VehicleMaintenanceJ1939':
          return VehicleMaintenanceJ1939.fromJson(value);
        case 'VehicleMaintenanceJ1939CheckEngineLight':
          return VehicleMaintenanceJ1939CheckEngineLight.fromJson(value);
        case 'VehicleMaintenanceJ1939DiagnosticTroubleCodes':
          return VehicleMaintenanceJ1939DiagnosticTroubleCodes.fromJson(value);
        case 'VehicleMaintenancePassenger':
          return VehicleMaintenancePassenger.fromJson(value);
        case 'VehicleMaintenancePassengerCheckEngineLight':
          return VehicleMaintenancePassengerCheckEngineLight.fromJson(value);
        case 'VehicleMaintenancePassengerDiagnosticTroubleCodes':
          return VehicleMaintenancePassengerDiagnosticTroubleCodes.fromJson(value);
        case 'VehicleSafetyScoreResponse':
          return VehicleSafetyScoreResponse.fromJson(value);
        default:
          {
            Match match;
            if (value is List &&
                (match = _regList.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return value.map((v) => _deserialize(v, newTargetType)).toList();
            } else if (value is Map &&
                (match = _regMap.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return Map.fromIterables(value.keys,
                  value.values.map((v) => _deserialize(v, newTargetType)));
            }
          }
      }
    } on Exception catch (e, stack) {
      throw ApiException.withInner(500, 'Exception during deserialization.', e, stack);
    }
    throw ApiException(500, 'Could not find a suitable class for deserialization');
  }

  dynamic deserialize(String json, String targetType) {
    // Remove all spaces.  Necessary for reg expressions as well.
    targetType = targetType.replaceAll(' ', '');

    if (targetType == 'String') return json;

    var decodedJson = jsonDecode(json);
    return _deserialize(decodedJson, targetType);
  }

  String serialize(Object obj) {
    String serialized = '';
    if (obj == null) {
      serialized = '';
    } else {
      serialized = json.encode(obj);
    }
    return serialized;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi' a key might appear multiple times.
  Future<Response> invokeAPI(String path,
                             String method,
                             Iterable<QueryParam> queryParams,
                             Object body,
                             Map<String, String> headerParams,
                             Map<String, String> formParams,
                             String contentType,
                             List<String> authNames) async {

    _updateParamsForAuth(authNames, queryParams, headerParams);

    var ps = queryParams.where((p) => p.value != null).map((p) => '${p.name}=${p.value}');
    String queryString = ps.isNotEmpty ?
                         '?' + ps.join('&') :
                         '';

    String url = basePath + path + queryString;

    headerParams.addAll(_defaultHeaderMap);
    headerParams['Content-Type'] = contentType;

    if(body is MultipartRequest) {
      var request = MultipartRequest(method, Uri.parse(url));
      request.fields.addAll(body.fields);
      request.files.addAll(body.files);
      request.headers.addAll(body.headers);
      request.headers.addAll(headerParams);
      var response = await client.send(request);
      return Response.fromStream(response);
    } else {
      var msgBody = contentType == "application/x-www-form-urlencoded" ? formParams : serialize(body);
      switch(method) {
        case "POST":
          return client.post(url, headers: headerParams, body: msgBody);
        case "PUT":
          return client.put(url, headers: headerParams, body: msgBody);
        case "DELETE":
          return client.delete(url, headers: headerParams);
        case "PATCH":
          return client.patch(url, headers: headerParams, body: msgBody);
        default:
          return client.get(url, headers: headerParams);
      }
    }
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply
  void _updateParamsForAuth(List<String> authNames, List<QueryParam> queryParams, Map<String, String> headerParams) {
    authNames.forEach((authName) {
      Authentication auth = _authentications[authName];
      if (auth == null) throw ArgumentError("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    });
  }

  void setAccessToken(String accessToken) {
    _authentications.forEach((key, auth) {
      if (auth is OAuth) {
        auth.setAccessToken(accessToken);
      }
    });
  }
}
