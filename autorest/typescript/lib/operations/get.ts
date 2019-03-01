/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import * as msRest from "@azure/ms-rest-js";
import * as Models from "../models";
import * as Mappers from "../models/getMappers";
import * as Parameters from "../models/parameters";
import { SamsaraAPIContext } from "../samsaraAPIContext";

/** Class representing a Get. */
export class Get {
  private readonly client: SamsaraAPIContext;

  /**
   * Create a Get.
   * @param {SamsaraAPIContext} client Reference to the service client.
   */
  constructor(client: SamsaraAPIContext) {
    this.client = client;
  }

  /**
   * Get all the drivers for the specified group.
   * @summary /fleet/drivers
   * @param groupDriversParam
   * @param [options] The optional parameters
   * @returns Promise<Models.GetDriversResponse>
   */
  drivers(groupDriversParam: Models.GroupDriversParam, options?: msRest.RequestOptionsBase): Promise<Models.GetDriversResponse>;
  /**
   * @param groupDriversParam
   * @param callback The callback
   */
  drivers(groupDriversParam: Models.GroupDriversParam, callback: msRest.ServiceCallback<Models.DriversResponse>): void;
  /**
   * @param groupDriversParam
   * @param options The optional parameters
   * @param callback The callback
   */
  drivers(groupDriversParam: Models.GroupDriversParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.DriversResponse>): void;
  drivers(groupDriversParam: Models.GroupDriversParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.DriversResponse>, callback?: msRest.ServiceCallback<Models.DriversResponse>): Promise<Models.GetDriversResponse> {
    return this.client.sendOperationRequest(
      {
        groupDriversParam,
        options
      },
      driversOperationSpec,
      callback) as Promise<Models.GetDriversResponse>;
  }

  /**
   * Get the distance and time each driver in an organization has driven in a given time period.
   * @summary /fleet/drivers/summary
   * @param driversSummaryParam Org ID and time range to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetSummaryResponse>
   */
  summary(driversSummaryParam: Models.DriversSummaryParam, options?: Models.GetSummaryOptionalParams): Promise<Models.GetSummaryResponse>;
  /**
   * @param driversSummaryParam Org ID and time range to query.
   * @param callback The callback
   */
  summary(driversSummaryParam: Models.DriversSummaryParam, callback: msRest.ServiceCallback<Models.DriversSummaryResponse>): void;
  /**
   * @param driversSummaryParam Org ID and time range to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  summary(driversSummaryParam: Models.DriversSummaryParam, options: Models.GetSummaryOptionalParams, callback: msRest.ServiceCallback<Models.DriversSummaryResponse>): void;
  summary(driversSummaryParam: Models.DriversSummaryParam, options?: Models.GetSummaryOptionalParams | msRest.ServiceCallback<Models.DriversSummaryResponse>, callback?: msRest.ServiceCallback<Models.DriversSummaryResponse>): Promise<Models.GetSummaryResponse> {
    return this.client.sendOperationRequest(
      {
        driversSummaryParam,
        options
      },
      summaryOperationSpec,
      callback) as Promise<Models.GetSummaryResponse>;
  }

  /**
   * Get summarized daily HOS charts for a specified driver.
   * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
   * @param driverId ID of the driver with HOS logs.
   * @param hosLogsParam
   * @param [options] The optional parameters
   * @returns Promise<Models.GetLogsResponse>
   */
  logs(driverId: number, hosLogsParam: Models.Body, options?: msRest.RequestOptionsBase): Promise<Models.GetLogsResponse>;
  /**
   * @param driverId ID of the driver with HOS logs.
   * @param hosLogsParam
   * @param callback The callback
   */
  logs(driverId: number, hosLogsParam: Models.Body, callback: msRest.ServiceCallback<Models.DriverDailyLogResponse>): void;
  /**
   * @param driverId ID of the driver with HOS logs.
   * @param hosLogsParam
   * @param options The optional parameters
   * @param callback The callback
   */
  logs(driverId: number, hosLogsParam: Models.Body, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.DriverDailyLogResponse>): void;
  logs(driverId: number, hosLogsParam: Models.Body, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.DriverDailyLogResponse>, callback?: msRest.ServiceCallback<Models.DriverDailyLogResponse>): Promise<Models.GetLogsResponse> {
    return this.client.sendOperationRequest(
      {
        driverId,
        hosLogsParam,
        options
      },
      logsOperationSpec,
      callback) as Promise<Models.GetLogsResponse>;
  }

  /**
   * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout
   * logs include location information.
   * @summary /fleet/hos_authentication_logs
   * @param hosAuthenticationLogsParam
   * @param [options] The optional parameters
   * @returns Promise<Models.GetLogs1Response>
   */
  logs1(hosAuthenticationLogsParam: Models.HosAuthenticationLogsParam, options?: msRest.RequestOptionsBase): Promise<Models.GetLogs1Response>;
  /**
   * @param hosAuthenticationLogsParam
   * @param callback The callback
   */
  logs1(hosAuthenticationLogsParam: Models.HosAuthenticationLogsParam, callback: msRest.ServiceCallback<Models.HosAuthenticationLogsResponse>): void;
  /**
   * @param hosAuthenticationLogsParam
   * @param options The optional parameters
   * @param callback The callback
   */
  logs1(hosAuthenticationLogsParam: Models.HosAuthenticationLogsParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.HosAuthenticationLogsResponse>): void;
  logs1(hosAuthenticationLogsParam: Models.HosAuthenticationLogsParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.HosAuthenticationLogsResponse>, callback?: msRest.ServiceCallback<Models.HosAuthenticationLogsResponse>): Promise<Models.GetLogs1Response> {
    return this.client.sendOperationRequest(
      {
        hosAuthenticationLogsParam,
        options
      },
      logs1OperationSpec,
      callback) as Promise<Models.GetLogs1Response>;
  }

  /**
   * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS
   * statuses that the driver was in during this time period.
   * @summary /fleet/hos_logs
   * @param hosLogsParam
   * @param [options] The optional parameters
   * @returns Promise<Models.GetLogs2Response>
   */
  logs2(hosLogsParam: Models.Body, options?: msRest.RequestOptionsBase): Promise<Models.GetLogs2Response>;
  /**
   * @param hosLogsParam
   * @param callback The callback
   */
  logs2(hosLogsParam: Models.Body, callback: msRest.ServiceCallback<Models.HosLogsResponse>): void;
  /**
   * @param hosLogsParam
   * @param options The optional parameters
   * @param callback The callback
   */
  logs2(hosLogsParam: Models.Body, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.HosLogsResponse>): void;
  logs2(hosLogsParam: Models.Body, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.HosLogsResponse>, callback?: msRest.ServiceCallback<Models.HosLogsResponse>): Promise<Models.GetLogs2Response> {
    return this.client.sendOperationRequest(
      {
        hosLogsParam,
        options
      },
      logs2OperationSpec,
      callback) as Promise<Models.GetLogs2Response>;
  }

  /**
   * Get the current HOS status for all drivers in the group.
   * @summary /fleet/hos_logs_summary
   * @param hosLogsParam
   * @param [options] The optional parameters
   * @returns Promise<Models.GetSummary1Response>
   */
  summary1(hosLogsParam: Models.HosLogsParam, options?: msRest.RequestOptionsBase): Promise<Models.GetSummary1Response>;
  /**
   * @param hosLogsParam
   * @param callback The callback
   */
  summary1(hosLogsParam: Models.HosLogsParam, callback: msRest.ServiceCallback<Models.HosLogsSummaryResponse>): void;
  /**
   * @param hosLogsParam
   * @param options The optional parameters
   * @param callback The callback
   */
  summary1(hosLogsParam: Models.HosLogsParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.HosLogsSummaryResponse>): void;
  summary1(hosLogsParam: Models.HosLogsParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.HosLogsSummaryResponse>, callback?: msRest.ServiceCallback<Models.HosLogsSummaryResponse>): Promise<Models.GetSummary1Response> {
    return this.client.sendOperationRequest(
      {
        hosLogsParam,
        options
      },
      summary1OperationSpec,
      callback) as Promise<Models.GetSummary1Response>;
  }

  /**
   * Get current location of vehicles in a group. This method returns the current location in
   * latitude and longitude of all vehicles in a requested group.
   * @summary /fleet/locations
   * @param groupParam Group ID to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetLocationsResponse>
   */
  locations(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase): Promise<Models.GetLocationsResponse>;
  /**
   * @param groupParam Group ID to query.
   * @param callback The callback
   */
  locations(groupParam: Models.BodyModel, callback: msRest.ServiceCallback<Models.LocationsOKResponse>): void;
  /**
   * @param groupParam Group ID to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  locations(groupParam: Models.BodyModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.LocationsOKResponse>): void;
  locations(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.LocationsOKResponse>, callback?: msRest.ServiceCallback<Models.LocationsOKResponse>): Promise<Models.GetLocationsResponse> {
    return this.client.sendOperationRequest(
      {
        groupParam,
        options
      },
      locationsOperationSpec,
      callback) as Promise<Models.GetLocationsResponse>;
  }

  /**
   * Get DVIRs for the org within provided time constraints
   * @summary /fleet/maintenance/dvirs
   * @param endMs time in millis until the last dvir log.
   * @param durationMs time in millis which corresponds to the duration before the end_ms.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetDvirsResponse>
   */
  dvirs(endMs: number, durationMs: number, options?: Models.GetDvirsOptionalParams): Promise<Models.GetDvirsResponse>;
  /**
   * @param endMs time in millis until the last dvir log.
   * @param durationMs time in millis which corresponds to the duration before the end_ms.
   * @param callback The callback
   */
  dvirs(endMs: number, durationMs: number, callback: msRest.ServiceCallback<Models.DvirListResponse>): void;
  /**
   * @param endMs time in millis until the last dvir log.
   * @param durationMs time in millis which corresponds to the duration before the end_ms.
   * @param options The optional parameters
   * @param callback The callback
   */
  dvirs(endMs: number, durationMs: number, options: Models.GetDvirsOptionalParams, callback: msRest.ServiceCallback<Models.DvirListResponse>): void;
  dvirs(endMs: number, durationMs: number, options?: Models.GetDvirsOptionalParams | msRest.ServiceCallback<Models.DvirListResponse>, callback?: msRest.ServiceCallback<Models.DvirListResponse>): Promise<Models.GetDvirsResponse> {
    return this.client.sendOperationRequest(
      {
        endMs,
        durationMs,
        options
      },
      dvirsOperationSpec,
      callback) as Promise<Models.GetDvirsResponse>;
  }

  /**
   * Get list of the vehicles with any engine faults or check light data.
   * @summary /fleet/maintenance/list
   * @param groupParam Group ID to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetListMethodResponse>
   */
  listMethod(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase): Promise<Models.GetListMethodResponse>;
  /**
   * @param groupParam Group ID to query.
   * @param callback The callback
   */
  listMethod(groupParam: Models.BodyModel, callback: msRest.ServiceCallback<Models.ListOKResponse>): void;
  /**
   * @param groupParam Group ID to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  listMethod(groupParam: Models.BodyModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.ListOKResponse>): void;
  listMethod(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.ListOKResponse>, callback?: msRest.ServiceCallback<Models.ListOKResponse>): Promise<Models.GetListMethodResponse> {
    return this.client.sendOperationRequest(
      {
        groupParam,
        options
      },
      listMethodOperationSpec,
      callback) as Promise<Models.GetListMethodResponse>;
  }

  /**
   * Get historical trips data for specified vehicle. This method returns a set of historical trips
   * data for the specified vehicle in the specified time range.
   * @summary /fleet/trips
   * @param tripsParam Group ID, vehicle ID and time range to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetTripsResponse>
   */
  trips(tripsParam: Models.TripsParam, options?: msRest.RequestOptionsBase): Promise<Models.GetTripsResponse>;
  /**
   * @param tripsParam Group ID, vehicle ID and time range to query.
   * @param callback The callback
   */
  trips(tripsParam: Models.TripsParam, callback: msRest.ServiceCallback<Models.TripResponse>): void;
  /**
   * @param tripsParam Group ID, vehicle ID and time range to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  trips(tripsParam: Models.TripsParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.TripResponse>): void;
  trips(tripsParam: Models.TripsParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.TripResponse>, callback?: msRest.ServiceCallback<Models.TripResponse>): Promise<Models.GetTripsResponse> {
    return this.client.sendOperationRequest(
      {
        tripsParam,
        options
      },
      tripsOperationSpec,
      callback) as Promise<Models.GetTripsResponse>;
  }

  /**
   * Get historical data for machine objects. This method returns a set of historical data for all
   * machines in a group
   * @summary /machines/history
   * @param historyParam Group ID and time range to query for events
   * @param [options] The optional parameters
   * @returns Promise<Models.GetHistoryResponse>
   */
  history(historyParam: Models.HistoryParam, options?: msRest.RequestOptionsBase): Promise<Models.GetHistoryResponse>;
  /**
   * @param historyParam Group ID and time range to query for events
   * @param callback The callback
   */
  history(historyParam: Models.HistoryParam, callback: msRest.ServiceCallback<Models.MachineHistoryResponse>): void;
  /**
   * @param historyParam Group ID and time range to query for events
   * @param options The optional parameters
   * @param callback The callback
   */
  history(historyParam: Models.HistoryParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.MachineHistoryResponse>): void;
  history(historyParam: Models.HistoryParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.MachineHistoryResponse>, callback?: msRest.ServiceCallback<Models.MachineHistoryResponse>): Promise<Models.GetHistoryResponse> {
    return this.client.sendOperationRequest(
      {
        historyParam,
        options
      },
      historyOperationSpec,
      callback) as Promise<Models.GetHistoryResponse>;
  }

  /**
   * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and
   * information about them.
   * @summary /machines/list
   * @param groupParam Group ID to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetMachinesResponse>
   */
  machines(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase): Promise<Models.GetMachinesResponse>;
  /**
   * @param groupParam Group ID to query.
   * @param callback The callback
   */
  machines(groupParam: Models.BodyModel, callback: msRest.ServiceCallback<Models.MachinesOKResponse>): void;
  /**
   * @param groupParam Group ID to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  machines(groupParam: Models.BodyModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.MachinesOKResponse>): void;
  machines(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.MachinesOKResponse>, callback?: msRest.ServiceCallback<Models.MachinesOKResponse>): Promise<Models.GetMachinesResponse> {
    return this.client.sendOperationRequest(
      {
        groupParam,
        options
      },
      machinesOperationSpec,
      callback) as Promise<Models.GetMachinesResponse>;
  }

  /**
   * Get cargo monitor status (empty / full) for requested sensors.
   * @summary /sensors/cargo
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetCargoResponse>
   */
  cargo(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase): Promise<Models.GetCargoResponse>;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param callback The callback
   */
  cargo(sensorParam: Models.BodyModelModel, callback: msRest.ServiceCallback<Models.CargoResponse>): void;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  cargo(sensorParam: Models.BodyModelModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.CargoResponse>): void;
  cargo(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.CargoResponse>, callback?: msRest.ServiceCallback<Models.CargoResponse>): Promise<Models.GetCargoResponse> {
    return this.client.sendOperationRequest(
      {
        sensorParam,
        options
      },
      cargoOperationSpec,
      callback) as Promise<Models.GetCargoResponse>;
  }

  /**
   * Get door monitor status (closed / open) for requested sensors.
   * @summary /sensors/door
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetDoorResponse>
   */
  door(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase): Promise<Models.GetDoorResponse>;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param callback The callback
   */
  door(sensorParam: Models.BodyModelModel, callback: msRest.ServiceCallback<Models.DoorResponse>): void;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  door(sensorParam: Models.BodyModelModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.DoorResponse>): void;
  door(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.DoorResponse>, callback?: msRest.ServiceCallback<Models.DoorResponse>): Promise<Models.GetDoorResponse> {
    return this.client.sendOperationRequest(
      {
        sensorParam,
        options
      },
      doorOperationSpec,
      callback) as Promise<Models.GetDoorResponse>;
  }

  /**
   * Get historical data for specified sensors. This method returns a set of historical data for the
   * specified sensors in the specified time range and at the specified time resolution.
   * @summary /sensors/history
   * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to
   * query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetHistory1Response>
   */
  history1(historyParam: Models.HistoryParamModel, options?: msRest.RequestOptionsBase): Promise<Models.GetHistory1Response>;
  /**
   * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to
   * query.
   * @param callback The callback
   */
  history1(historyParam: Models.HistoryParamModel, callback: msRest.ServiceCallback<Models.SensorHistoryResponse>): void;
  /**
   * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to
   * query.
   * @param options The optional parameters
   * @param callback The callback
   */
  history1(historyParam: Models.HistoryParamModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.SensorHistoryResponse>): void;
  history1(historyParam: Models.HistoryParamModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.SensorHistoryResponse>, callback?: msRest.ServiceCallback<Models.SensorHistoryResponse>): Promise<Models.GetHistory1Response> {
    return this.client.sendOperationRequest(
      {
        historyParam,
        options
      },
      history1OperationSpec,
      callback) as Promise<Models.GetHistory1Response>;
  }

  /**
   * Get humidity for requested sensors. This method returns the current relative humidity for the
   * requested sensors.
   * @summary /sensors/humidity
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetHumidityResponse>
   */
  humidity(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase): Promise<Models.GetHumidityResponse>;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param callback The callback
   */
  humidity(sensorParam: Models.BodyModelModel, callback: msRest.ServiceCallback<Models.HumidityResponse>): void;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  humidity(sensorParam: Models.BodyModelModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.HumidityResponse>): void;
  humidity(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.HumidityResponse>, callback?: msRest.ServiceCallback<Models.HumidityResponse>): Promise<Models.GetHumidityResponse> {
    return this.client.sendOperationRequest(
      {
        sensorParam,
        options
      },
      humidityOperationSpec,
      callback) as Promise<Models.GetHumidityResponse>;
  }

  /**
   * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and
   * information about them.
   * @summary /sensors/list
   * @param groupParam Group ID to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetSensorsResponse>
   */
  sensors(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase): Promise<Models.GetSensorsResponse>;
  /**
   * @param groupParam Group ID to query.
   * @param callback The callback
   */
  sensors(groupParam: Models.BodyModel, callback: msRest.ServiceCallback<Models.SensorsOKResponse>): void;
  /**
   * @param groupParam Group ID to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  sensors(groupParam: Models.BodyModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.SensorsOKResponse>): void;
  sensors(groupParam: Models.BodyModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.SensorsOKResponse>, callback?: msRest.ServiceCallback<Models.SensorsOKResponse>): Promise<Models.GetSensorsResponse> {
    return this.client.sendOperationRequest(
      {
        groupParam,
        options
      },
      sensorsOperationSpec,
      callback) as Promise<Models.GetSensorsResponse>;
  }

  /**
   * Get temperature for requested sensors. This method returns the current ambient temperature (and
   * probe temperature if applicable) for the requested sensors.
   * @summary /sensors/temperature
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param [options] The optional parameters
   * @returns Promise<Models.GetTemperatureResponse>
   */
  temperature(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase): Promise<Models.GetTemperatureResponse>;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param callback The callback
   */
  temperature(sensorParam: Models.BodyModelModel, callback: msRest.ServiceCallback<Models.TemperatureResponse>): void;
  /**
   * @param sensorParam Group ID and list of sensor IDs to query.
   * @param options The optional parameters
   * @param callback The callback
   */
  temperature(sensorParam: Models.BodyModelModel, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.TemperatureResponse>): void;
  temperature(sensorParam: Models.BodyModelModel, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.TemperatureResponse>, callback?: msRest.ServiceCallback<Models.TemperatureResponse>): Promise<Models.GetTemperatureResponse> {
    return this.client.sendOperationRequest(
      {
        sensorParam,
        options
      },
      temperatureOperationSpec,
      callback) as Promise<Models.GetTemperatureResponse>;
  }
}

// Operation Specifications
const serializer = new msRest.Serializer(Mappers);
const driversOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/drivers",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "groupDriversParam",
    mapper: {
      ...Mappers.GroupDriversParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.DriversResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const summaryOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/drivers/summary",
  queryParameters: [
    Parameters.accessToken,
    Parameters.snapToDayBounds
  ],
  requestBody: {
    parameterPath: "driversSummaryParam",
    mapper: {
      ...Mappers.DriversSummaryParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.DriversSummaryResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const logsOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/drivers/{driver_id}/hos_daily_logs",
  urlParameters: [
    Parameters.driverId1
  ],
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "hosLogsParam",
    mapper: {
      ...Mappers.Body,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.DriverDailyLogResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const logs1OperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/hos_authentication_logs",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "hosAuthenticationLogsParam",
    mapper: {
      ...Mappers.HosAuthenticationLogsParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.HosAuthenticationLogsResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const logs2OperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/hos_logs",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "hosLogsParam",
    mapper: {
      ...Mappers.Body,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.HosLogsResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const summary1OperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/hos_logs_summary",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "hosLogsParam",
    mapper: {
      ...Mappers.HosLogsParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.HosLogsSummaryResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const locationsOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/locations",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "groupParam",
    mapper: {
      ...Mappers.BodyModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.LocationsOKResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const dvirsOperationSpec: msRest.OperationSpec = {
  httpMethod: "GET",
  path: "v1/fleet/maintenance/dvirs",
  queryParameters: [
    Parameters.accessToken,
    Parameters.endMs2,
    Parameters.durationMs1,
    Parameters.groupId1
  ],
  responses: {
    200: {
      bodyMapper: Mappers.DvirListResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const listMethodOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/maintenance/list",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "groupParam",
    mapper: {
      ...Mappers.BodyModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.ListOKResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const tripsOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/trips",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "tripsParam",
    mapper: {
      ...Mappers.TripsParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.TripResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const historyOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/machines/history",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "historyParam",
    mapper: {
      ...Mappers.HistoryParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.MachineHistoryResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const machinesOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/machines/list",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "groupParam",
    mapper: {
      ...Mappers.BodyModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.MachinesOKResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const cargoOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/sensors/cargo",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "sensorParam",
    mapper: {
      ...Mappers.BodyModelModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.CargoResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const doorOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/sensors/door",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "sensorParam",
    mapper: {
      ...Mappers.BodyModelModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.DoorResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const history1OperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/sensors/history",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "historyParam",
    mapper: {
      ...Mappers.HistoryParamModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.SensorHistoryResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const humidityOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/sensors/humidity",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "sensorParam",
    mapper: {
      ...Mappers.BodyModelModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.HumidityResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const sensorsOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/sensors/list",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "groupParam",
    mapper: {
      ...Mappers.BodyModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.SensorsOKResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};

const temperatureOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/sensors/temperature",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "sensorParam",
    mapper: {
      ...Mappers.BodyModelModel,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.TemperatureResponse
    },
    default: {
      bodyMapper: {
        serializedName: "parsedResponse",
        type: {
          name: "String"
        }
      }
    }
  },
  serializer
};