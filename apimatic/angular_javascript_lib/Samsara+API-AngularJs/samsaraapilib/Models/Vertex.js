/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Vertex
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Vertex', ['BaseModel', VertexModel]);

    function VertexModel(BaseModel) {
        var Vertex = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.latitude = this.getValue(obj.latitude);
            this.longitude = this.getValue(obj.longitude);
        };

        Vertex.prototype = new BaseModel();
        Vertex.prototype.constructor = Vertex;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Vertex.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'latitude', realName: 'latitude' },
                { name: 'longitude', realName: 'longitude' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Vertex.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The longitude of a geofence vertex
         *
         * @return {double|null}
         */
        Vertex.prototype.getLatitude = function () {
            return this.latitude;
        };
    
        /**
         * Setter for Latitude
         * 
         * @param {double|null} value 
         */
        Vertex.prototype.setLatitude = function (value) {
            this.latitude = value;
        };
    
        /**
         * The longitude of a geofence vertex
         *
         * @return {double|null}
         */
        Vertex.prototype.getLongitude = function () {
            return this.longitude;
        };
    
        /**
         * Setter for Longitude
         * 
         * @param {double|null} value 
         */
        Vertex.prototype.setLongitude = function (value) {
            this.longitude = value;
        };
    
        return Vertex;
    }

}(angular));
