/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import * as msRest from "@azure/ms-rest-js";
import * as Models from "../models";
import * as Mappers from "../models/createMappers";
import * as Parameters from "../models/parameters";
import { SamsaraAPIContext } from "../samsaraAPIContext";

/** Class representing a Create. */
export class Create {
  private readonly client: SamsaraAPIContext;

  /**
   * Create a Create.
   * @param {SamsaraAPIContext} client Reference to the service client.
   */
  constructor(client: SamsaraAPIContext) {
    this.client = client;
  }

  /**
   * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   * @summary /fleet/maintenance/dvirs
   * @param createDvirParam DVIR creation body
   * @param [options] The optional parameters
   * @returns Promise<Models.CreateDvirResponse>
   */
  dvir(createDvirParam: Models.CreateDvirParam, options?: msRest.RequestOptionsBase): Promise<Models.CreateDvirResponse>;
  /**
   * @param createDvirParam DVIR creation body
   * @param callback The callback
   */
  dvir(createDvirParam: Models.CreateDvirParam, callback: msRest.ServiceCallback<Models.DvirBase>): void;
  /**
   * @param createDvirParam DVIR creation body
   * @param options The optional parameters
   * @param callback The callback
   */
  dvir(createDvirParam: Models.CreateDvirParam, options: msRest.RequestOptionsBase, callback: msRest.ServiceCallback<Models.DvirBase>): void;
  dvir(createDvirParam: Models.CreateDvirParam, options?: msRest.RequestOptionsBase | msRest.ServiceCallback<Models.DvirBase>, callback?: msRest.ServiceCallback<Models.DvirBase>): Promise<Models.CreateDvirResponse> {
    return this.client.sendOperationRequest(
      {
        createDvirParam,
        options
      },
      dvirOperationSpec,
      callback) as Promise<Models.CreateDvirResponse>;
  }
}

// Operation Specifications
const serializer = new msRest.Serializer(Mappers);
const dvirOperationSpec: msRest.OperationSpec = {
  httpMethod: "POST",
  path: "v1/fleet/maintenance/dvirs",
  queryParameters: [
    Parameters.accessToken
  ],
  requestBody: {
    parameterPath: "createDvirParam",
    mapper: {
      ...Mappers.CreateDvirParam,
      required: true
    }
  },
  responses: {
    200: {
      bodyMapper: Mappers.DvirBase
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
