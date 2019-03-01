import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('AssetsApi', api.AssetsApi)
.service('DriversApi', api.DriversApi)
.service('FleetApi', api.FleetApi)
.service('IndustrialApi', api.IndustrialApi)
.service('RoutesApi', api.RoutesApi)
.service('SafetyApi', api.SafetyApi)
.service('SensorsApi', api.SensorsApi)
.service('TagsApi', api.TagsApi)
.service('UsersApi', api.UsersApi)

export default apiModule;
