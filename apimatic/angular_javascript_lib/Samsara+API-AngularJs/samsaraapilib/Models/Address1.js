/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Address1
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Address1', ['BaseModel', Address1Model]);

    function Address1Model(BaseModel) {
        var Address1 = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.contactIds = this.getValue(obj.contactIds);
            this.formattedAddress = this.getValue(obj.formattedAddress);
            this.geofence = this.getValue(obj.geofence);
            this.name = this.getValue(obj.name);
            this.notes = this.getValue(obj.notes);
            this.tagIds = this.getValue(obj.tagIds);
        };

        Address1.prototype = new BaseModel();
        Address1.prototype.constructor = Address1;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Address1.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'contactIds', realName: 'contactIds', array: true },
                { name: 'formattedAddress', realName: 'formattedAddress' },
                { name: 'geofence', realName: 'geofence', type: 'AddressGeofence' },
                { name: 'name', realName: 'name' },
                { name: 'notes', realName: 'notes' },
                { name: 'tagIds', realName: 'tagIds', array: true }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Address1.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * A list of IDs for contact book entries.
         *
         * @return {array|null}
         */
        Address1.prototype.getContactIds = function () {
            return this.contactIds;
        };
    
        /**
         * Setter for ContactIds
         * 
         * @param {array|null} value 
         */
        Address1.prototype.setContactIds = function (value) {
            this.contactIds = value;
        };
    
        /**
         * The full address associated with this address/geofence, as it might be recognized by maps.google.com
         *
         * @return {string|null}
         */
        Address1.prototype.getFormattedAddress = function () {
            return this.formattedAddress;
        };
    
        /**
         * Setter for FormattedAddress
         * 
         * @param {string|null} value 
         */
        Address1.prototype.setFormattedAddress = function (value) {
            this.formattedAddress = value;
        };
    
        /**
         * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only
         * one key should be provided, depending on the geofence type.
         *
         * @return {AddressGeofence|null}
         */
        Address1.prototype.getGeofence = function () {
            return this.geofence;
        };
    
        /**
         * Setter for Geofence
         * 
         * @param {AddressGeofence|null} value 
         */
        Address1.prototype.setGeofence = function (value) {
            this.geofence = value;
        };
    
        /**
         * The name of this address/geofence
         *
         * @return {string|null}
         */
        Address1.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        Address1.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * Notes associated with an address.
         *
         * @return {string|null}
         */
        Address1.prototype.getNotes = function () {
            return this.notes;
        };
    
        /**
         * Setter for Notes
         * 
         * @param {string|null} value 
         */
        Address1.prototype.setNotes = function (value) {
            this.notes = value;
        };
    
        /**
         * A list of tag IDs.
         *
         * @return {array|null}
         */
        Address1.prototype.getTagIds = function () {
            return this.tagIds;
        };
    
        /**
         * Setter for TagIds
         * 
         * @param {array|null} value 
         */
        Address1.prototype.setTagIds = function (value) {
            this.tagIds = value;
        };
    
        return Address1;
    }

}(angular));
