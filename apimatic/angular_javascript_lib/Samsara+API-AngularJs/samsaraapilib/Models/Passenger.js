/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Passenger
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Passenger', ['BaseModel', PassengerModel]);

    function PassengerModel(BaseModel) {
        var Passenger = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.checkEngineLight = this.getValue(obj.checkEngineLight);
            this.diagnosticTroubleCodes = this.getValue(obj.diagnosticTroubleCodes);
        };

        Passenger.prototype = new BaseModel();
        Passenger.prototype.constructor = Passenger;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Passenger.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'checkEngineLight', realName: 'checkEngineLight', type: 'CheckEngineLight1' },
                {
                    name: 'diagnosticTroubleCodes',
                    realName: 'diagnosticTroubleCodes',
                    array: true,
                    type: 'DiagnosticTroubleCode1',
                }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Passenger.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Passenger vehicle check engine light.
         *
         * @return {CheckEngineLight1|null}
         */
        Passenger.prototype.getCheckEngineLight = function () {
            return this.checkEngineLight;
        };
    
        /**
         * Setter for CheckEngineLight
         * 
         * @param {CheckEngineLight1|null} value 
         */
        Passenger.prototype.setCheckEngineLight = function (value) {
            this.checkEngineLight = value;
        };
    
        /**
         * Passenger vehicle DTCs.
         *
         * @return {array|null}
         */
        Passenger.prototype.getDiagnosticTroubleCodes = function () {
            return this.diagnosticTroubleCodes;
        };
    
        /**
         * Setter for DiagnosticTroubleCodes
         * 
         * @param {array|null} value 
         */
        Passenger.prototype.setDiagnosticTroubleCodes = function (value) {
            this.diagnosticTroubleCodes = value;
        };
    
        return Passenger;
    }

}(angular));
