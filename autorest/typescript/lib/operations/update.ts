/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import * as msRest from "@azure/ms-rest-js";
import * as Models from "../models";
import * as Mappers from "../models/updateMappers";
import * as Parameters from "../models/parameters";
import { SamsaraAPIContext } from "../samsaraAPIContext";

/** Class representing a Update. */
export class Update {
  private readonly client: SamsaraAPIContext;

  /**
   * Create a Update.
   * @param {SamsaraAPIContext} client Reference to the service client.
   */
  constructor(client: SamsaraAPIContext) {
    this.client = client;
  }

  /**
   * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   * @summary /fleet/set_data
   * @param vehicleUpdateParam
   * @param [options] The optional parameters
   * @returns Promise<msRest.RestResponse>
   */
  vehicles(vehicleUpdateParam: Models.VehicleUpdateParam, options?: msRest.RequestOptionsBase): Promise<msRest.RestResponse>;
  /**
   * @param vehicleUpdateParam
   * @param callback The callback
   */
  vehicles(vehicleUpdateParam: Models.VehicleUpdateParam, callback: msRest.ServiceCallback<void>): void;
  /**
   * @param vehicleUpdateParam
   * @param options The optional parameters
   * @param callback The callback
   */
  vehicles(vehicleUpdateParam: Models.VehicleUpdateParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<void>): void;
  vehicles(vehicleUpdateParam: Models.VehicleUpdateParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<void>, callback?: msRest.ServiceCallback<void>): Promise<msRest.RestResponse> {
    return this.client.sendOperationRequest(
      {
        vehicleUpdateParam,
        options
      },
      vehiclesOperationSpec,
      callback);
  }
}

// Operation Specifications
const serializer = new msRest.Serializer(Mappers);
const vehiclesOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/set_data",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "vehicleUpdateParam",
    mapper: {
      ...Mappers.VehicleUpdateParam,
      required: true
    }
  },
  responses: {
    200: {},
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
