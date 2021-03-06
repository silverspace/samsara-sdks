/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of AuthenticationLog
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('AuthenticationLog', ['BaseModel', AuthenticationLogModel]);

    function AuthenticationLogModel(BaseModel) {
        var AuthenticationLog = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.actionType = this.getValue(obj.actionType);
            this.address = this.getValue(obj.address);
            this.addressName = this.getValue(obj.addressName);
            this.city = this.getValue(obj.city);
            this.happenedAtMs = this.getValue(obj.happenedAtMs);
            this.state = this.getValue(obj.state);
        };

        AuthenticationLog.prototype = new BaseModel();
        AuthenticationLog.prototype.constructor = AuthenticationLog;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        AuthenticationLog.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'actionType', realName: 'actionType' },
                { name: 'address', realName: 'address' },
                { name: 'addressName', realName: 'addressName' },
                { name: 'city', realName: 'city' },
                { name: 'happenedAtMs', realName: 'happenedAtMs' },
                { name: 'state', realName: 'state' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        AuthenticationLog.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The log type - one of 'signin' or 'signout'
         *
         * @return {string|null}
         */
        AuthenticationLog.prototype.getActionType = function () {
            return this.actionType;
        };
    
        /**
         * Setter for ActionType
         * 
         * @param {string|null} value 
         */
        AuthenticationLog.prototype.setActionType = function (value) {
            this.actionType = value;
        };
    
        /**
         * Address at which the log was recorded, if applicable.
         *
         * @return {string|null}
         */
        AuthenticationLog.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string|null} value 
         */
        AuthenticationLog.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * Address name from the group address book at which the log was recorded, if applicable.
         *
         * @return {string|null}
         */
        AuthenticationLog.prototype.getAddressName = function () {
            return this.addressName;
        };
    
        /**
         * Setter for AddressName
         * 
         * @param {string|null} value 
         */
        AuthenticationLog.prototype.setAddressName = function (value) {
            this.addressName = value;
        };
    
        /**
         * City in which the log was recorded, if applicable.
         *
         * @return {string|null}
         */
        AuthenticationLog.prototype.getCity = function () {
            return this.city;
        };
    
        /**
         * Setter for City
         * 
         * @param {string|null} value 
         */
        AuthenticationLog.prototype.setCity = function (value) {
            this.city = value;
        };
    
        /**
         * The time at which the event was recorded in UNIX milliseconds.
         *
         * @return {long|null}
         */
        AuthenticationLog.prototype.getHappenedAtMs = function () {
            return this.happenedAtMs;
        };
    
        /**
         * Setter for HappenedAtMs
         * 
         * @param {long|null} value 
         */
        AuthenticationLog.prototype.setHappenedAtMs = function (value) {
            this.happenedAtMs = value;
        };
    
        /**
         * State in which the log was recorded, if applicable.
         *
         * @return {string|null}
         */
        AuthenticationLog.prototype.getState = function () {
            return this.state;
        };
    
        /**
         * Setter for State
         * 
         * @param {string|null} value 
         */
        AuthenticationLog.prototype.setState = function (value) {
            this.state = value;
        };
    
        return AuthenticationLog;
    }

}(angular));
