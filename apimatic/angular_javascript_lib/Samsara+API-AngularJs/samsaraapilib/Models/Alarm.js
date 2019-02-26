/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Alarm
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Alarm', ['BaseModel', AlarmModel]);

    function AlarmModel(BaseModel) {
        var Alarm = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.alarms = this.getValue(obj.alarms);
            this.changedAtMs = this.getValue(obj.changedAtMs);
        };

        Alarm.prototype = new BaseModel();
        Alarm.prototype.constructor = Alarm;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Alarm.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'alarms', realName: 'alarms', array: true, type: 'Alarm1' },
                { name: 'changedAtMs', realName: 'changedAtMs' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Alarm.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        Alarm.prototype.getAlarms = function () {
            return this.alarms;
        };
    
        /**
         * Setter for Alarms
         * 
         * @param {array|null} value 
         */
        Alarm.prototype.setAlarms = function (value) {
            this.alarms = value;
        };
    
        /**
         * Timestamp when the alarms were reported, in Unix milliseconds since epoch
         *
         * @return {long|null}
         */
        Alarm.prototype.getChangedAtMs = function () {
            return this.changedAtMs;
        };
    
        /**
         * Setter for ChangedAtMs
         * 
         * @param {long|null} value 
         */
        Alarm.prototype.setChangedAtMs = function (value) {
            this.changedAtMs = value;
        };
    
        return Alarm;
    }

}(angular));
