/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a JobUpdateObject.
 */
class JobUpdateObject {
  /**
   * Create a JobUpdateObject.
   * @property {number} [changedAtMs] Timestamp that this event was updated,
   * represented as Unix milliseconds since epoch.
   * @property {number} [jobId] ID of the Samsara job.
   * @property {string} [jobState] Possible values include:
   * 'JobState_Unassigned', 'JobState_Scheduled', 'JobState_EnRoute',
   * 'JobState_Arrived', 'JobState_Completed', 'JobState_Skipped'
   * @property {string} [prevJobState] Possible values include:
   * 'JobState_Unassigned', 'JobState_Scheduled', 'JobState_EnRoute',
   * 'JobState_Arrived', 'JobState_Completed', 'JobState_Skipped'
   * @property {object} [route]
   * @property {array} [route.dispatchJobs] The dispatch jobs associated with
   * this route.
   * @property {number} [route.id] ID of the Samsara dispatch route.
   * @property {number} [routeId] ID of the Samsara dispatch route.
   */
  constructor() {
  }

  /**
   * Defines the metadata of JobUpdateObject
   *
   * @returns {object} metadata of JobUpdateObject
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'jobUpdateObject',
      type: {
        name: 'Composite',
        className: 'JobUpdateObject',
        modelProperties: {
          changedAtMs: {
            required: false,
            serializedName: 'changed_at_ms',
            type: {
              name: 'Number'
            }
          },
          jobId: {
            required: false,
            serializedName: 'job_id',
            type: {
              name: 'Number'
            }
          },
          jobState: {
            required: false,
            serializedName: 'job_state',
            type: {
              name: 'String'
            }
          },
          prevJobState: {
            required: false,
            serializedName: 'prev_job_state',
            type: {
              name: 'String'
            }
          },
          route: {
            required: false,
            serializedName: 'route',
            type: {
              name: 'Composite',
              className: 'DispatchRoute'
            }
          },
          routeId: {
            required: false,
            serializedName: 'route_id',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = JobUpdateObject;
