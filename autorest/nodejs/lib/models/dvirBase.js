/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DvirBase.
 */
class DvirBase {
  /**
   * Create a DvirBase.
   * @property {object} [authorSignature] The authors signature for the DVIR.
   * @property {number} [authorSignature.driverId] ID of the driver who signed
   * the DVIR. Will not be returned if mechanicUserId is returned.
   * @property {string} [authorSignature.email] Email of the  driver|mechanic
   * who signed the DVIR.
   * @property {number} [authorSignature.mechanicUserId] ID of the mechanic who
   * signed the DVIR. Will not be returned if driverId is returned.
   * @property {string} [authorSignature.name] The name of the driver or
   * mechanic who signed the DVIR.
   * @property {number} [authorSignature.signedAt] The time in millis when the
   * DVIR was signed
   * @property {string} [authorSignature.type] Type corresponds to whether the
   * signature corresponds to driver|mechanic.
   * @property {string} [authorSignature.username] Username of the
   * driver|mechanic who signed the DVIR.
   * @property {boolean} [defectsCorrected] Signifies if the defects on the
   * vehicle corrected after the DVIR is done.
   * @property {boolean} [defectsNeedNotBeCorrected] Signifies if the defects
   * on this vehicle can be ignored.
   * @property {number} [id] The id of this DVIR record.
   * @property {string} [inspectionType] Inspection type of the DVIR.
   * @property {string} [mechanicNotes] The mechanics notes on the DVIR.
   * @property {object} [mechanicOrAgentSignature] The mechanic's or agent's
   * signature for the DVIR.
   * @property {number} [mechanicOrAgentSignature.driverId] ID of the driver
   * who signed the DVIR. Will not be returned if mechanicUserId is returned.
   * @property {string} [mechanicOrAgentSignature.email] Email of the
   * agent|mechanic who signed the DVIR.
   * @property {number} [mechanicOrAgentSignature.mechanicUserId] ID of the
   * mechanic who signed the DVIR. Will not be returned if driverId is
   * returned.
   * @property {string} [mechanicOrAgentSignature.name] The name of the agent
   * or mechanic who signed the DVIR.
   * @property {number} [mechanicOrAgentSignature.signedAt] The time in millis
   * when the DVIR was signed
   * @property {string} [mechanicOrAgentSignature.type] Type corresponds to
   * whether the signature corresponds to driver|mechanic.
   * @property {string} [mechanicOrAgentSignature.username] Username of the
   * agent|mechanic who signed the DVIR.
   * @property {object} [nextDriverSignature] The next driver signature for the
   * DVIR.
   * @property {number} [nextDriverSignature.driverId] ID of the driver who
   * signed the DVIR
   * @property {string} [nextDriverSignature.email] Email of the  driver who
   * signed the next DVIR on this vehicle.
   * @property {string} [nextDriverSignature.name] The name of the driver who
   * signed the next DVIR on this vehicle.
   * @property {number} [nextDriverSignature.signedAt] The time in millis when
   * the next driver signed the DVIR on this vehicle.
   * @property {string} [nextDriverSignature.type] Type corresponds to driver.
   * @property {string} [nextDriverSignature.username] Username of the  driver
   * who signed the next DVIR on this vehicle.
   * @property {number} [odometerMiles] The odometer reading in miles for the
   * vehicle when the DVIR was done.
   * @property {number} [timeMs] Timestamp of this DVIR in UNIX milliseconds.
   * @property {array} [trailerDefects] Defects registered for the trailer
   * which was part of the DVIR.
   * @property {number} [trailerId] The id of the trailer which was part of the
   * DVIR.
   * @property {string} [trailerName] The name of the trailer which was part of
   * the DVIR.
   * @property {object} [vehicle] The vehicle on which DVIR was done.
   * @property {number} [vehicle.id] The vehicle id on which DVIR was done.
   * @property {string} [vehicle.name] The vehicle on which DVIR was done.
   * @property {string} [vehicleCondition] The condition of vechile on which
   * DVIR was done.
   * @property {array} [vehicleDefects] Defects registered for the vehicle
   * which was part of the DVIR.
   */
  constructor() {
  }

  /**
   * Defines the metadata of DvirBase
   *
   * @returns {object} metadata of DvirBase
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DvirBase',
      type: {
        name: 'Composite',
        className: 'DvirBase',
        modelProperties: {
          authorSignature: {
            required: false,
            serializedName: 'authorSignature',
            type: {
              name: 'Composite',
              className: 'DvirBaseAuthorSignature'
            }
          },
          defectsCorrected: {
            required: false,
            serializedName: 'defectsCorrected',
            type: {
              name: 'Boolean'
            }
          },
          defectsNeedNotBeCorrected: {
            required: false,
            serializedName: 'defectsNeedNotBeCorrected',
            type: {
              name: 'Boolean'
            }
          },
          id: {
            required: false,
            serializedName: 'id',
            type: {
              name: 'Number'
            }
          },
          inspectionType: {
            required: false,
            serializedName: 'inspectionType',
            type: {
              name: 'String'
            }
          },
          mechanicNotes: {
            required: false,
            serializedName: 'mechanicNotes',
            type: {
              name: 'String'
            }
          },
          mechanicOrAgentSignature: {
            required: false,
            serializedName: 'mechanicOrAgentSignature',
            type: {
              name: 'Composite',
              className: 'DvirBaseMechanicOrAgentSignature'
            }
          },
          nextDriverSignature: {
            required: false,
            serializedName: 'nextDriverSignature',
            type: {
              name: 'Composite',
              className: 'DvirBaseNextDriverSignature'
            }
          },
          odometerMiles: {
            required: false,
            serializedName: 'odometerMiles',
            type: {
              name: 'Number'
            }
          },
          timeMs: {
            required: false,
            serializedName: 'timeMs',
            type: {
              name: 'Number'
            }
          },
          trailerDefects: {
            required: false,
            serializedName: 'trailerDefects',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'DvirBaseTrailerDefectsItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'DvirBaseTrailerDefectsItem'
                  }
              }
            }
          },
          trailerId: {
            required: false,
            serializedName: 'trailerId',
            type: {
              name: 'Number'
            }
          },
          trailerName: {
            required: false,
            serializedName: 'trailerName',
            type: {
              name: 'String'
            }
          },
          vehicle: {
            required: false,
            serializedName: 'vehicle',
            type: {
              name: 'Composite',
              className: 'DvirBaseVehicle'
            }
          },
          vehicleCondition: {
            required: false,
            serializedName: 'vehicleCondition',
            type: {
              name: 'String'
            }
          },
          vehicleDefects: {
            required: false,
            serializedName: 'vehicleDefects',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'DvirBaseVehicleDefectsItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'DvirBaseVehicleDefectsItem'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = DvirBase;