/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

angular.module('SamsaraAPILib')
    .factory('Configuration', [Configuration]);

    function Configuration() {
        return {
            //The base Uri for API calls
            BASEURI : 'https://api.samsara.com/v1',

            //API Access Token
            accessToken : ''

        };
    }

}(angular));
