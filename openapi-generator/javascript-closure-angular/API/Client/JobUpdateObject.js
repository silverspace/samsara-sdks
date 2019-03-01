goog.provide('API.Client.jobUpdateObject');

/**
 * @record
 */
API.Client.JobUpdateObject = function() {}

/**
 * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
 * @type {!number}
 * @export
 */
API.Client.JobUpdateObject.prototype.changedAtMs;

/**
 * ID of the Samsara job.
 * @type {!number}
 * @export
 */
API.Client.JobUpdateObject.prototype.jobId;

/**
 * @type {!API.Client.jobStatus}
 * @export
 */
API.Client.JobUpdateObject.prototype.jobState;

/**
 * @type {!API.Client.prevJobStatus}
 * @export
 */
API.Client.JobUpdateObject.prototype.prevJobState;

/**
 * @type {!API.Client.DispatchRoute}
 * @export
 */
API.Client.JobUpdateObject.prototype.route;

/**
 * ID of the Samsara dispatch route.
 * @type {!number}
 * @export
 */
API.Client.JobUpdateObject.prototype.routeId;

