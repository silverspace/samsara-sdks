export * from './address';
export * from './addressGeofence';
export * from './addressGeofenceCircle';
export * from './addressGeofencePolygon';
export * from './addressGeofencePolygonVertices';
export * from './addressesAddresses';
export * from './allRouteJobUpdates';
export * from './asset';
export * from './assetCable';
export * from './assetCurrentLocation';
export * from './assetCurrentLocationsResponse';
export * from './assetReeferResponse';
export * from './assetReeferResponseReeferStats';
export * from './assetReeferResponseReeferStatsAlarms';
export * from './assetReeferResponseReeferStatsAlarms1';
export * from './assetReeferResponseReeferStatsEngineHours';
export * from './assetReeferResponseReeferStatsFuelPercentage';
export * from './assetReeferResponseReeferStatsPowerStatus';
export * from './assetReeferResponseReeferStatsReturnAirTemp';
export * from './assetReeferResponseReeferStatsSetPoint';
export * from './auxInput';
export * from './auxInputSeries';
export * from './cargoResponse';
export * from './cargoResponseSensors';
export * from './contact';
export * from './currentDriver';
export * from './dataInputHistoryResponse';
export * from './dataInputHistoryResponsePoints';
export * from './dispatchJob';
export * from './dispatchJobCreate';
export * from './dispatchRoute';
export * from './dispatchRouteBase';
export * from './dispatchRouteCreate';
export * from './dispatchRouteHistoricalEntry';
export * from './dispatchRouteHistory';
export * from './document';
export * from './documentBase';
export * from './documentCreate';
export * from './documentField';
export * from './documentFieldCreate';
export * from './documentFieldCreatePhotoValue';
export * from './documentFieldType';
export * from './documentFieldTypeNumberValueTypeMetadata';
export * from './documentType';
export * from './doorResponse';
export * from './doorResponseSensors';
export * from './driver';
export * from './driverBase';
export * from './driverDailyLogResponse';
export * from './driverDailyLogResponseDays';
export * from './driverForCreate';
export * from './driverSafetyScoreResponse';
export * from './driversResponse';
export * from './driversSummaryResponse';
export * from './driversSummaryResponseSummaries';
export * from './dvirBase';
export * from './dvirBaseAuthorSignature';
export * from './dvirBaseMechanicOrAgentSignature';
export * from './dvirBaseNextDriverSignature';
export * from './dvirBaseTrailerDefects';
export * from './dvirBaseVehicle';
export * from './dvirListResponse';
export * from './engineState';
export * from './fleetVehicleLocation';
export * from './fleetVehicleResponse';
export * from './fleetVehicleResponseVehicleInfo';
export * from './hosAuthenticationLogsResponse';
export * from './hosAuthenticationLogsResponseAuthenticationLogs';
export * from './hosLogsResponse';
export * from './hosLogsResponseLogs';
export * from './hosLogsSummaryResponse';
export * from './hosLogsSummaryResponseDrivers';
export * from './humidityResponse';
export * from './humidityResponseSensors';
export * from './inlineObject';
export * from './inlineObject1';
export * from './inlineObject10';
export * from './inlineObject11';
export * from './inlineObject12';
export * from './inlineObject13';
export * from './inlineObject14';
export * from './inlineObject15';
export * from './inlineObject16';
export * from './inlineObject17';
export * from './inlineObject18';
export * from './inlineObject19';
export * from './inlineObject2';
export * from './inlineObject20';
export * from './inlineObject21';
export * from './inlineObject22';
export * from './inlineObject23';
export * from './inlineObject24';
export * from './inlineObject3';
export * from './inlineObject4';
export * from './inlineObject5';
export * from './inlineObject6';
export * from './inlineObject7';
export * from './inlineObject8';
export * from './inlineObject9';
export * from './inlineResponse200';
export * from './inlineResponse2001';
export * from './inlineResponse2002';
export * from './inlineResponse2003';
export * from './inlineResponse2004';
export * from './inlineResponse2005';
export * from './inlineResponse2005VehicleStats';
export * from './inlineResponse2006';
export * from './inlineResponse2007';
export * from './inlineResponse2008';
export * from './inlineResponse2009';
export * from './jobStatus';
export * from './jobUpdateObject';
export * from './machine';
export * from './machineHistoryResponse';
export * from './machineHistoryResponseMachines';
export * from './machineHistoryResponseVibrations';
export * from './pagination';
export * from './prevJobStatus';
export * from './safetyReportHarshEvent';
export * from './sensor';
export * from './sensorHistoryResponse';
export * from './sensorHistoryResponseResults';
export * from './sensorsHistorySeries';
export * from './tag';
export * from './tagCreate';
export * from './tagMetadata';
export * from './tagModify';
export * from './tagModifyAdd';
export * from './tagModifyDelete';
export * from './tagUpdate';
export * from './taggedAddress';
export * from './taggedAddressBase';
export * from './taggedAsset';
export * from './taggedAssetBase';
export * from './taggedDriver';
export * from './taggedDriverBase';
export * from './taggedMachine';
export * from './taggedMachineBase';
export * from './taggedSensor';
export * from './taggedSensorBase';
export * from './taggedVehicle';
export * from './taggedVehicleBase';
export * from './temperatureResponse';
export * from './temperatureResponseSensors';
export * from './tripResponse';
export * from './tripResponseEndCoordinates';
export * from './tripResponseStartCoordinates';
export * from './tripResponseTrips';
export * from './user';
export * from './userBase';
export * from './userRole';
export * from './userTagRole';
export * from './userTagRoleTag';
export * from './vehicle';
export * from './vehicleHarshEventResponse';
export * from './vehicleHarshEventResponseLocation';
export * from './vehicleLocation';
export * from './vehicleMaintenance';
export * from './vehicleMaintenanceJ1939';
export * from './vehicleMaintenanceJ1939CheckEngineLight';
export * from './vehicleMaintenanceJ1939DiagnosticTroubleCodes';
export * from './vehicleMaintenancePassenger';
export * from './vehicleMaintenancePassengerCheckEngineLight';
export * from './vehicleMaintenancePassengerDiagnosticTroubleCodes';
export * from './vehicleSafetyScoreResponse';

import localVarRequest = require('request');

import { Address } from './address';
import { AddressGeofence } from './addressGeofence';
import { AddressGeofenceCircle } from './addressGeofenceCircle';
import { AddressGeofencePolygon } from './addressGeofencePolygon';
import { AddressGeofencePolygonVertices } from './addressGeofencePolygonVertices';
import { AddressesAddresses } from './addressesAddresses';
import { AllRouteJobUpdates } from './allRouteJobUpdates';
import { Asset } from './asset';
import { AssetCable } from './assetCable';
import { AssetCurrentLocation } from './assetCurrentLocation';
import { AssetCurrentLocationsResponse } from './assetCurrentLocationsResponse';
import { AssetReeferResponse } from './assetReeferResponse';
import { AssetReeferResponseReeferStats } from './assetReeferResponseReeferStats';
import { AssetReeferResponseReeferStatsAlarms } from './assetReeferResponseReeferStatsAlarms';
import { AssetReeferResponseReeferStatsAlarms1 } from './assetReeferResponseReeferStatsAlarms1';
import { AssetReeferResponseReeferStatsEngineHours } from './assetReeferResponseReeferStatsEngineHours';
import { AssetReeferResponseReeferStatsFuelPercentage } from './assetReeferResponseReeferStatsFuelPercentage';
import { AssetReeferResponseReeferStatsPowerStatus } from './assetReeferResponseReeferStatsPowerStatus';
import { AssetReeferResponseReeferStatsReturnAirTemp } from './assetReeferResponseReeferStatsReturnAirTemp';
import { AssetReeferResponseReeferStatsSetPoint } from './assetReeferResponseReeferStatsSetPoint';
import { AuxInput } from './auxInput';
import { AuxInputSeries } from './auxInputSeries';
import { CargoResponse } from './cargoResponse';
import { CargoResponseSensors } from './cargoResponseSensors';
import { Contact } from './contact';
import { CurrentDriver } from './currentDriver';
import { DataInputHistoryResponse } from './dataInputHistoryResponse';
import { DataInputHistoryResponsePoints } from './dataInputHistoryResponsePoints';
import { DispatchJob } from './dispatchJob';
import { DispatchJobCreate } from './dispatchJobCreate';
import { DispatchRoute } from './dispatchRoute';
import { DispatchRouteBase } from './dispatchRouteBase';
import { DispatchRouteCreate } from './dispatchRouteCreate';
import { DispatchRouteHistoricalEntry } from './dispatchRouteHistoricalEntry';
import { DispatchRouteHistory } from './dispatchRouteHistory';
import { Document } from './document';
import { DocumentBase } from './documentBase';
import { DocumentCreate } from './documentCreate';
import { DocumentField } from './documentField';
import { DocumentFieldCreate } from './documentFieldCreate';
import { DocumentFieldCreatePhotoValue } from './documentFieldCreatePhotoValue';
import { DocumentFieldType } from './documentFieldType';
import { DocumentFieldTypeNumberValueTypeMetadata } from './documentFieldTypeNumberValueTypeMetadata';
import { DocumentType } from './documentType';
import { DoorResponse } from './doorResponse';
import { DoorResponseSensors } from './doorResponseSensors';
import { Driver } from './driver';
import { DriverBase } from './driverBase';
import { DriverDailyLogResponse } from './driverDailyLogResponse';
import { DriverDailyLogResponseDays } from './driverDailyLogResponseDays';
import { DriverForCreate } from './driverForCreate';
import { DriverSafetyScoreResponse } from './driverSafetyScoreResponse';
import { DriversResponse } from './driversResponse';
import { DriversSummaryResponse } from './driversSummaryResponse';
import { DriversSummaryResponseSummaries } from './driversSummaryResponseSummaries';
import { DvirBase } from './dvirBase';
import { DvirBaseAuthorSignature } from './dvirBaseAuthorSignature';
import { DvirBaseMechanicOrAgentSignature } from './dvirBaseMechanicOrAgentSignature';
import { DvirBaseNextDriverSignature } from './dvirBaseNextDriverSignature';
import { DvirBaseTrailerDefects } from './dvirBaseTrailerDefects';
import { DvirBaseVehicle } from './dvirBaseVehicle';
import { DvirListResponse } from './dvirListResponse';
import { EngineState } from './engineState';
import { FleetVehicleLocation } from './fleetVehicleLocation';
import { FleetVehicleResponse } from './fleetVehicleResponse';
import { FleetVehicleResponseVehicleInfo } from './fleetVehicleResponseVehicleInfo';
import { HosAuthenticationLogsResponse } from './hosAuthenticationLogsResponse';
import { HosAuthenticationLogsResponseAuthenticationLogs } from './hosAuthenticationLogsResponseAuthenticationLogs';
import { HosLogsResponse } from './hosLogsResponse';
import { HosLogsResponseLogs } from './hosLogsResponseLogs';
import { HosLogsSummaryResponse } from './hosLogsSummaryResponse';
import { HosLogsSummaryResponseDrivers } from './hosLogsSummaryResponseDrivers';
import { HumidityResponse } from './humidityResponse';
import { HumidityResponseSensors } from './humidityResponseSensors';
import { InlineObject } from './inlineObject';
import { InlineObject1 } from './inlineObject1';
import { InlineObject10 } from './inlineObject10';
import { InlineObject11 } from './inlineObject11';
import { InlineObject12 } from './inlineObject12';
import { InlineObject13 } from './inlineObject13';
import { InlineObject14 } from './inlineObject14';
import { InlineObject15 } from './inlineObject15';
import { InlineObject16 } from './inlineObject16';
import { InlineObject17 } from './inlineObject17';
import { InlineObject18 } from './inlineObject18';
import { InlineObject19 } from './inlineObject19';
import { InlineObject2 } from './inlineObject2';
import { InlineObject20 } from './inlineObject20';
import { InlineObject21 } from './inlineObject21';
import { InlineObject22 } from './inlineObject22';
import { InlineObject23 } from './inlineObject23';
import { InlineObject24 } from './inlineObject24';
import { InlineObject3 } from './inlineObject3';
import { InlineObject4 } from './inlineObject4';
import { InlineObject5 } from './inlineObject5';
import { InlineObject6 } from './inlineObject6';
import { InlineObject7 } from './inlineObject7';
import { InlineObject8 } from './inlineObject8';
import { InlineObject9 } from './inlineObject9';
import { InlineResponse200 } from './inlineResponse200';
import { InlineResponse2001 } from './inlineResponse2001';
import { InlineResponse2002 } from './inlineResponse2002';
import { InlineResponse2003 } from './inlineResponse2003';
import { InlineResponse2004 } from './inlineResponse2004';
import { InlineResponse2005 } from './inlineResponse2005';
import { InlineResponse2005VehicleStats } from './inlineResponse2005VehicleStats';
import { InlineResponse2006 } from './inlineResponse2006';
import { InlineResponse2007 } from './inlineResponse2007';
import { InlineResponse2008 } from './inlineResponse2008';
import { InlineResponse2009 } from './inlineResponse2009';
import { JobStatus } from './jobStatus';
import { JobUpdateObject } from './jobUpdateObject';
import { Machine } from './machine';
import { MachineHistoryResponse } from './machineHistoryResponse';
import { MachineHistoryResponseMachines } from './machineHistoryResponseMachines';
import { MachineHistoryResponseVibrations } from './machineHistoryResponseVibrations';
import { Pagination } from './pagination';
import { PrevJobStatus } from './prevJobStatus';
import { SafetyReportHarshEvent } from './safetyReportHarshEvent';
import { Sensor } from './sensor';
import { SensorHistoryResponse } from './sensorHistoryResponse';
import { SensorHistoryResponseResults } from './sensorHistoryResponseResults';
import { SensorsHistorySeries } from './sensorsHistorySeries';
import { Tag } from './tag';
import { TagCreate } from './tagCreate';
import { TagMetadata } from './tagMetadata';
import { TagModify } from './tagModify';
import { TagModifyAdd } from './tagModifyAdd';
import { TagModifyDelete } from './tagModifyDelete';
import { TagUpdate } from './tagUpdate';
import { TaggedAddress } from './taggedAddress';
import { TaggedAddressBase } from './taggedAddressBase';
import { TaggedAsset } from './taggedAsset';
import { TaggedAssetBase } from './taggedAssetBase';
import { TaggedDriver } from './taggedDriver';
import { TaggedDriverBase } from './taggedDriverBase';
import { TaggedMachine } from './taggedMachine';
import { TaggedMachineBase } from './taggedMachineBase';
import { TaggedSensor } from './taggedSensor';
import { TaggedSensorBase } from './taggedSensorBase';
import { TaggedVehicle } from './taggedVehicle';
import { TaggedVehicleBase } from './taggedVehicleBase';
import { TemperatureResponse } from './temperatureResponse';
import { TemperatureResponseSensors } from './temperatureResponseSensors';
import { TripResponse } from './tripResponse';
import { TripResponseEndCoordinates } from './tripResponseEndCoordinates';
import { TripResponseStartCoordinates } from './tripResponseStartCoordinates';
import { TripResponseTrips } from './tripResponseTrips';
import { User } from './user';
import { UserBase } from './userBase';
import { UserRole } from './userRole';
import { UserTagRole } from './userTagRole';
import { UserTagRoleTag } from './userTagRoleTag';
import { Vehicle } from './vehicle';
import { VehicleHarshEventResponse } from './vehicleHarshEventResponse';
import { VehicleHarshEventResponseLocation } from './vehicleHarshEventResponseLocation';
import { VehicleLocation } from './vehicleLocation';
import { VehicleMaintenance } from './vehicleMaintenance';
import { VehicleMaintenanceJ1939 } from './vehicleMaintenanceJ1939';
import { VehicleMaintenanceJ1939CheckEngineLight } from './vehicleMaintenanceJ1939CheckEngineLight';
import { VehicleMaintenanceJ1939DiagnosticTroubleCodes } from './vehicleMaintenanceJ1939DiagnosticTroubleCodes';
import { VehicleMaintenancePassenger } from './vehicleMaintenancePassenger';
import { VehicleMaintenancePassengerCheckEngineLight } from './vehicleMaintenancePassengerCheckEngineLight';
import { VehicleMaintenancePassengerDiagnosticTroubleCodes } from './vehicleMaintenancePassengerDiagnosticTroubleCodes';
import { VehicleSafetyScoreResponse } from './vehicleSafetyScoreResponse';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];
                 
let enumsMap: {[index: string]: any} = {
        "AuxInputSeries.NameEnum": AuxInputSeries.NameEnum,
        "EngineState.ValueEnum": EngineState.ValueEnum,
        "InlineObject12.InspectionTypeEnum": InlineObject12.InspectionTypeEnum,
        "InlineObject12.SafeEnum": InlineObject12.SafeEnum,
        "InlineObject21.FillMissingEnum": InlineObject21.FillMissingEnum,
        "SensorsHistorySeries.FieldEnum": SensorsHistorySeries.FieldEnum,
        "User.AuthTypeEnum": User.AuthTypeEnum,
        "UserBase.AuthTypeEnum": UserBase.AuthTypeEnum,
}

let typeMap: {[index: string]: any} = {
    "Address": Address,
    "AddressGeofence": AddressGeofence,
    "AddressGeofenceCircle": AddressGeofenceCircle,
    "AddressGeofencePolygon": AddressGeofencePolygon,
    "AddressGeofencePolygonVertices": AddressGeofencePolygonVertices,
    "AddressesAddresses": AddressesAddresses,
    "AllRouteJobUpdates": AllRouteJobUpdates,
    "Asset": Asset,
    "AssetCable": AssetCable,
    "AssetCurrentLocation": AssetCurrentLocation,
    "AssetCurrentLocationsResponse": AssetCurrentLocationsResponse,
    "AssetReeferResponse": AssetReeferResponse,
    "AssetReeferResponseReeferStats": AssetReeferResponseReeferStats,
    "AssetReeferResponseReeferStatsAlarms": AssetReeferResponseReeferStatsAlarms,
    "AssetReeferResponseReeferStatsAlarms1": AssetReeferResponseReeferStatsAlarms1,
    "AssetReeferResponseReeferStatsEngineHours": AssetReeferResponseReeferStatsEngineHours,
    "AssetReeferResponseReeferStatsFuelPercentage": AssetReeferResponseReeferStatsFuelPercentage,
    "AssetReeferResponseReeferStatsPowerStatus": AssetReeferResponseReeferStatsPowerStatus,
    "AssetReeferResponseReeferStatsReturnAirTemp": AssetReeferResponseReeferStatsReturnAirTemp,
    "AssetReeferResponseReeferStatsSetPoint": AssetReeferResponseReeferStatsSetPoint,
    "AuxInput": AuxInput,
    "AuxInputSeries": AuxInputSeries,
    "CargoResponse": CargoResponse,
    "CargoResponseSensors": CargoResponseSensors,
    "Contact": Contact,
    "CurrentDriver": CurrentDriver,
    "DataInputHistoryResponse": DataInputHistoryResponse,
    "DataInputHistoryResponsePoints": DataInputHistoryResponsePoints,
    "DispatchJob": DispatchJob,
    "DispatchJobCreate": DispatchJobCreate,
    "DispatchRoute": DispatchRoute,
    "DispatchRouteBase": DispatchRouteBase,
    "DispatchRouteCreate": DispatchRouteCreate,
    "DispatchRouteHistoricalEntry": DispatchRouteHistoricalEntry,
    "DispatchRouteHistory": DispatchRouteHistory,
    "Document": Document,
    "DocumentBase": DocumentBase,
    "DocumentCreate": DocumentCreate,
    "DocumentField": DocumentField,
    "DocumentFieldCreate": DocumentFieldCreate,
    "DocumentFieldCreatePhotoValue": DocumentFieldCreatePhotoValue,
    "DocumentFieldType": DocumentFieldType,
    "DocumentFieldTypeNumberValueTypeMetadata": DocumentFieldTypeNumberValueTypeMetadata,
    "DocumentType": DocumentType,
    "DoorResponse": DoorResponse,
    "DoorResponseSensors": DoorResponseSensors,
    "Driver": Driver,
    "DriverBase": DriverBase,
    "DriverDailyLogResponse": DriverDailyLogResponse,
    "DriverDailyLogResponseDays": DriverDailyLogResponseDays,
    "DriverForCreate": DriverForCreate,
    "DriverSafetyScoreResponse": DriverSafetyScoreResponse,
    "DriversResponse": DriversResponse,
    "DriversSummaryResponse": DriversSummaryResponse,
    "DriversSummaryResponseSummaries": DriversSummaryResponseSummaries,
    "DvirBase": DvirBase,
    "DvirBaseAuthorSignature": DvirBaseAuthorSignature,
    "DvirBaseMechanicOrAgentSignature": DvirBaseMechanicOrAgentSignature,
    "DvirBaseNextDriverSignature": DvirBaseNextDriverSignature,
    "DvirBaseTrailerDefects": DvirBaseTrailerDefects,
    "DvirBaseVehicle": DvirBaseVehicle,
    "DvirListResponse": DvirListResponse,
    "EngineState": EngineState,
    "FleetVehicleLocation": FleetVehicleLocation,
    "FleetVehicleResponse": FleetVehicleResponse,
    "FleetVehicleResponseVehicleInfo": FleetVehicleResponseVehicleInfo,
    "HosAuthenticationLogsResponse": HosAuthenticationLogsResponse,
    "HosAuthenticationLogsResponseAuthenticationLogs": HosAuthenticationLogsResponseAuthenticationLogs,
    "HosLogsResponse": HosLogsResponse,
    "HosLogsResponseLogs": HosLogsResponseLogs,
    "HosLogsSummaryResponse": HosLogsSummaryResponse,
    "HosLogsSummaryResponseDrivers": HosLogsSummaryResponseDrivers,
    "HumidityResponse": HumidityResponse,
    "HumidityResponseSensors": HumidityResponseSensors,
    "InlineObject": InlineObject,
    "InlineObject1": InlineObject1,
    "InlineObject10": InlineObject10,
    "InlineObject11": InlineObject11,
    "InlineObject12": InlineObject12,
    "InlineObject13": InlineObject13,
    "InlineObject14": InlineObject14,
    "InlineObject15": InlineObject15,
    "InlineObject16": InlineObject16,
    "InlineObject17": InlineObject17,
    "InlineObject18": InlineObject18,
    "InlineObject19": InlineObject19,
    "InlineObject2": InlineObject2,
    "InlineObject20": InlineObject20,
    "InlineObject21": InlineObject21,
    "InlineObject22": InlineObject22,
    "InlineObject23": InlineObject23,
    "InlineObject24": InlineObject24,
    "InlineObject3": InlineObject3,
    "InlineObject4": InlineObject4,
    "InlineObject5": InlineObject5,
    "InlineObject6": InlineObject6,
    "InlineObject7": InlineObject7,
    "InlineObject8": InlineObject8,
    "InlineObject9": InlineObject9,
    "InlineResponse200": InlineResponse200,
    "InlineResponse2001": InlineResponse2001,
    "InlineResponse2002": InlineResponse2002,
    "InlineResponse2003": InlineResponse2003,
    "InlineResponse2004": InlineResponse2004,
    "InlineResponse2005": InlineResponse2005,
    "InlineResponse2005VehicleStats": InlineResponse2005VehicleStats,
    "InlineResponse2006": InlineResponse2006,
    "InlineResponse2007": InlineResponse2007,
    "InlineResponse2008": InlineResponse2008,
    "InlineResponse2009": InlineResponse2009,
    "JobStatus": JobStatus,
    "JobUpdateObject": JobUpdateObject,
    "Machine": Machine,
    "MachineHistoryResponse": MachineHistoryResponse,
    "MachineHistoryResponseMachines": MachineHistoryResponseMachines,
    "MachineHistoryResponseVibrations": MachineHistoryResponseVibrations,
    "Pagination": Pagination,
    "PrevJobStatus": PrevJobStatus,
    "SafetyReportHarshEvent": SafetyReportHarshEvent,
    "Sensor": Sensor,
    "SensorHistoryResponse": SensorHistoryResponse,
    "SensorHistoryResponseResults": SensorHistoryResponseResults,
    "SensorsHistorySeries": SensorsHistorySeries,
    "Tag": Tag,
    "TagCreate": TagCreate,
    "TagMetadata": TagMetadata,
    "TagModify": TagModify,
    "TagModifyAdd": TagModifyAdd,
    "TagModifyDelete": TagModifyDelete,
    "TagUpdate": TagUpdate,
    "TaggedAddress": TaggedAddress,
    "TaggedAddressBase": TaggedAddressBase,
    "TaggedAsset": TaggedAsset,
    "TaggedAssetBase": TaggedAssetBase,
    "TaggedDriver": TaggedDriver,
    "TaggedDriverBase": TaggedDriverBase,
    "TaggedMachine": TaggedMachine,
    "TaggedMachineBase": TaggedMachineBase,
    "TaggedSensor": TaggedSensor,
    "TaggedSensorBase": TaggedSensorBase,
    "TaggedVehicle": TaggedVehicle,
    "TaggedVehicleBase": TaggedVehicleBase,
    "TemperatureResponse": TemperatureResponse,
    "TemperatureResponseSensors": TemperatureResponseSensors,
    "TripResponse": TripResponse,
    "TripResponseEndCoordinates": TripResponseEndCoordinates,
    "TripResponseStartCoordinates": TripResponseStartCoordinates,
    "TripResponseTrips": TripResponseTrips,
    "User": User,
    "UserBase": UserBase,
    "UserRole": UserRole,
    "UserTagRole": UserTagRole,
    "UserTagRoleTag": UserTagRoleTag,
    "Vehicle": Vehicle,
    "VehicleHarshEventResponse": VehicleHarshEventResponse,
    "VehicleHarshEventResponseLocation": VehicleHarshEventResponseLocation,
    "VehicleLocation": VehicleLocation,
    "VehicleMaintenance": VehicleMaintenance,
    "VehicleMaintenanceJ1939": VehicleMaintenanceJ1939,
    "VehicleMaintenanceJ1939CheckEngineLight": VehicleMaintenanceJ1939CheckEngineLight,
    "VehicleMaintenanceJ1939DiagnosticTroubleCodes": VehicleMaintenanceJ1939DiagnosticTroubleCodes,
    "VehicleMaintenancePassenger": VehicleMaintenancePassenger,
    "VehicleMaintenancePassengerCheckEngineLight": VehicleMaintenancePassengerCheckEngineLight,
    "VehicleMaintenancePassengerDiagnosticTroubleCodes": VehicleMaintenancePassengerDiagnosticTroubleCodes,
    "VehicleSafetyScoreResponse": VehicleSafetyScoreResponse,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }
            
            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}