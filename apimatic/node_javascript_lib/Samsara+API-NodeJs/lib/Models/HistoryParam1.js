/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of HistoryParam1
 */
class HistoryParam1 extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.endMs = this.constructor.getValue(obj.endMs);
        this.fillMissing = this.constructor.getValue(obj.fillMissing, 'withNull');
        this.groupId = this.constructor.getValue(obj.groupId);
        this.series = this.constructor.getValue(obj.series);
        this.startMs = this.constructor.getValue(obj.startMs);
        this.stepMs = this.constructor.getValue(obj.stepMs);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'endMs', realName: 'endMs' },
            { name: 'fillMissing', realName: 'fillMissing' },
            { name: 'groupId', realName: 'groupId' },
            { name: 'series', realName: 'series', array: true, type: 'Series1' },
            { name: 'startMs', realName: 'startMs' },
            { name: 'stepMs', realName: 'stepMs' },
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

module.exports = HistoryParam1;
