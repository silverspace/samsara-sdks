/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of JobUpdateObject
 */
class JobUpdateObject extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.changedAtMs = this.constructor.getValue(obj.changedAtMs || obj.changed_at_ms);
        this.jobId = this.constructor.getValue(obj.jobId || obj.job_id);
        this.jobState = this.constructor.getValue(obj.jobState || obj.job_state);
        this.prevJobState = this.constructor.getValue(obj.prevJobState || obj.prev_job_state);
        this.route = this.constructor.getValue(obj.route);
        this.routeId = this.constructor.getValue(obj.routeId || obj.route_id);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'changedAtMs', realName: 'changed_at_ms' },
            { name: 'jobId', realName: 'job_id' },
            { name: 'jobState', realName: 'job_state' },
            { name: 'prevJobState', realName: 'prev_job_state' },
            { name: 'route', realName: 'route', type: 'DispatchRoute' },
            { name: 'routeId', realName: 'route_id' },
        ]);
    }

    /**
     * Function containing information about discriminator values
     * mapped with their corresponding model class names
     *
     * @return   {object}  Object containing Key-Value pairs mapping discriminator
     *                     values with their corresponding model classes
     */
    static discriminatorMap() {
        return {};
    }
}

module.exports = JobUpdateObject;
