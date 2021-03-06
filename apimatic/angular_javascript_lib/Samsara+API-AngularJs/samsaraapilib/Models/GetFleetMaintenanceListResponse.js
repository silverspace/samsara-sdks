/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of GetFleetMaintenanceListResponse
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('GetFleetMaintenanceListResponse', ['BaseModel', GetFleetMaintenanceListResponseModel]);

    function GetFleetMaintenanceListResponseModel(BaseModel) {
        var GetFleetMaintenanceListResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.vehicles = this.getValue(obj.vehicles);
        };

        GetFleetMaintenanceListResponse.prototype = new BaseModel();
        GetFleetMaintenanceListResponse.prototype.constructor = GetFleetMaintenanceListResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        GetFleetMaintenanceListResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'vehicles', realName: 'vehicles', array: true, type: 'VehicleMaintenance' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        GetFleetMaintenanceListResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        GetFleetMaintenanceListResponse.prototype.getVehicles = function () {
            return this.vehicles;
        };
    
        /**
         * Setter for Vehicles
         * 
         * @param {array|null} value 
         */
        GetFleetMaintenanceListResponse.prototype.setVehicles = function (value) {
            this.vehicles = value;
        };
    
        return GetFleetMaintenanceListResponse;
    }

}(angular));
