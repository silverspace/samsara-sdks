/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing FleetApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class FleetApiTests
    {
        private FleetApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new FleetApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of FleetApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' FleetApi
            //Assert.IsInstanceOfType(typeof(FleetApi), instance, "instance is a FleetApi");
        }

        
        /// <summary>
        /// Test AddFleetAddress
        /// </summary>
        [Test]
        public void AddFleetAddressTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject2 addressParam = null;
            //instance.AddFleetAddress(accessToken, addressParam);
            
        }
        
        /// <summary>
        /// Test AddOrganizationAddresses
        /// </summary>
        [Test]
        public void AddOrganizationAddressesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject addresses = null;
            //var response = instance.AddOrganizationAddresses(accessToken, addresses);
            //Assert.IsInstanceOf<List<Address>> (response, "response is List<Address>");
        }
        
        /// <summary>
        /// Test CreateDispatchRoute
        /// </summary>
        [Test]
        public void CreateDispatchRouteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //DispatchRouteCreate createDispatchRouteParams = null;
            //var response = instance.CreateDispatchRoute(accessToken, createDispatchRouteParams);
            //Assert.IsInstanceOf<DispatchRoute> (response, "response is DispatchRoute");
        }
        
        /// <summary>
        /// Test CreateDriver
        /// </summary>
        [Test]
        public void CreateDriverTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //DriverForCreate createDriverParam = null;
            //var response = instance.CreateDriver(accessToken, createDriverParam);
            //Assert.IsInstanceOf<Driver> (response, "response is Driver");
        }
        
        /// <summary>
        /// Test CreateDriverDispatchRoute
        /// </summary>
        [Test]
        public void CreateDriverDispatchRouteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? driverId = null;
            //DispatchRouteCreate createDispatchRouteParams = null;
            //var response = instance.CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
            //Assert.IsInstanceOf<DispatchRoute> (response, "response is DispatchRoute");
        }
        
        /// <summary>
        /// Test CreateDriverDocument
        /// </summary>
        [Test]
        public void CreateDriverDocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? driverId = null;
            //DocumentCreate createDocumentParams = null;
            //var response = instance.CreateDriverDocument(accessToken, driverId, createDocumentParams);
            //Assert.IsInstanceOf<Document> (response, "response is Document");
        }
        
        /// <summary>
        /// Test CreateDvir
        /// </summary>
        [Test]
        public void CreateDvirTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject12 createDvirParam = null;
            //var response = instance.CreateDvir(accessToken, createDvirParam);
            //Assert.IsInstanceOf<DvirBase> (response, "response is DvirBase");
        }
        
        /// <summary>
        /// Test CreateVehicleDispatchRoute
        /// </summary>
        [Test]
        public void CreateVehicleDispatchRouteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? vehicleId = null;
            //DispatchRouteCreate createDispatchRouteParams = null;
            //var response = instance.CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
            //Assert.IsInstanceOf<DispatchRoute> (response, "response is DispatchRoute");
        }
        
        /// <summary>
        /// Test DeactivateDriver
        /// </summary>
        [Test]
        public void DeactivateDriverTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //string driverIdOrExternalId = null;
            //instance.DeactivateDriver(accessToken, driverIdOrExternalId);
            
        }
        
        /// <summary>
        /// Test DeleteDispatchRouteById
        /// </summary>
        [Test]
        public void DeleteDispatchRouteByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? routeId = null;
            //instance.DeleteDispatchRouteById(accessToken, routeId);
            
        }
        
        /// <summary>
        /// Test DeleteOrganizationAddress
        /// </summary>
        [Test]
        public void DeleteOrganizationAddressTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? addressId = null;
            //instance.DeleteOrganizationAddress(accessToken, addressId);
            
        }
        
        /// <summary>
        /// Test FetchAllDispatchRoutes
        /// </summary>
        [Test]
        public void FetchAllDispatchRoutesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? groupId = null;
            //long? endTime = null;
            //long? duration = null;
            //var response = instance.FetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
            //Assert.IsInstanceOf<List<DispatchRoute>> (response, "response is List<DispatchRoute>");
        }
        
        /// <summary>
        /// Test FetchAllRouteJobUpdates
        /// </summary>
        [Test]
        public void FetchAllRouteJobUpdatesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? groupId = null;
            //string sequenceId = null;
            //string include = null;
            //var response = instance.FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
            //Assert.IsInstanceOf<AllRouteJobUpdates> (response, "response is AllRouteJobUpdates");
        }
        
        /// <summary>
        /// Test GetAllAssetCurrentLocations
        /// </summary>
        [Test]
        public void GetAllAssetCurrentLocationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? groupId = null;
            //var response = instance.GetAllAssetCurrentLocations(accessToken, groupId);
            //Assert.IsInstanceOf<InlineResponse2001> (response, "response is InlineResponse2001");
        }
        
        /// <summary>
        /// Test GetAllAssets
        /// </summary>
        [Test]
        public void GetAllAssetsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? groupId = null;
            //var response = instance.GetAllAssets(accessToken, groupId);
            //Assert.IsInstanceOf<InlineResponse200> (response, "response is InlineResponse200");
        }
        
        /// <summary>
        /// Test GetAllDeactivatedDrivers
        /// </summary>
        [Test]
        public void GetAllDeactivatedDriversTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? groupId = null;
            //var response = instance.GetAllDeactivatedDrivers(accessToken, groupId);
            //Assert.IsInstanceOf<List<Driver>> (response, "response is List<Driver>");
        }
        
        /// <summary>
        /// Test GetAssetLocation
        /// </summary>
        [Test]
        public void GetAssetLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? assetId = null;
            //long? startMs = null;
            //long? endMs = null;
            //var response = instance.GetAssetLocation(accessToken, assetId, startMs, endMs);
            //Assert.IsInstanceOf<List<Object>> (response, "response is List<Object>");
        }
        
        /// <summary>
        /// Test GetAssetReefer
        /// </summary>
        [Test]
        public void GetAssetReeferTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? assetId = null;
            //long? startMs = null;
            //long? endMs = null;
            //var response = instance.GetAssetReefer(accessToken, assetId, startMs, endMs);
            //Assert.IsInstanceOf<AssetReeferResponse> (response, "response is AssetReeferResponse");
        }
        
        /// <summary>
        /// Test GetDeactivatedDriverById
        /// </summary>
        [Test]
        public void GetDeactivatedDriverByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //string driverIdOrExternalId = null;
            //var response = instance.GetDeactivatedDriverById(accessToken, driverIdOrExternalId);
            //Assert.IsInstanceOf<Driver> (response, "response is Driver");
        }
        
        /// <summary>
        /// Test GetDispatchRouteById
        /// </summary>
        [Test]
        public void GetDispatchRouteByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? routeId = null;
            //var response = instance.GetDispatchRouteById(accessToken, routeId);
            //Assert.IsInstanceOf<DispatchRoute> (response, "response is DispatchRoute");
        }
        
        /// <summary>
        /// Test GetDispatchRouteHistory
        /// </summary>
        [Test]
        public void GetDispatchRouteHistoryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? routeId = null;
            //long? startTime = null;
            //long? endTime = null;
            //var response = instance.GetDispatchRouteHistory(accessToken, routeId, startTime, endTime);
            //Assert.IsInstanceOf<DispatchRouteHistory> (response, "response is DispatchRouteHistory");
        }
        
        /// <summary>
        /// Test GetDispatchRoutesByDriverId
        /// </summary>
        [Test]
        public void GetDispatchRoutesByDriverIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? driverId = null;
            //long? endTime = null;
            //long? duration = null;
            //var response = instance.GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
            //Assert.IsInstanceOf<List<DispatchRoute>> (response, "response is List<DispatchRoute>");
        }
        
        /// <summary>
        /// Test GetDispatchRoutesByVehicleId
        /// </summary>
        [Test]
        public void GetDispatchRoutesByVehicleIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? vehicleId = null;
            //long? endTime = null;
            //long? duration = null;
            //var response = instance.GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
            //Assert.IsInstanceOf<List<DispatchRoute>> (response, "response is List<DispatchRoute>");
        }
        
        /// <summary>
        /// Test GetDriverById
        /// </summary>
        [Test]
        public void GetDriverByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //string driverIdOrExternalId = null;
            //var response = instance.GetDriverById(accessToken, driverIdOrExternalId);
            //Assert.IsInstanceOf<Driver> (response, "response is Driver");
        }
        
        /// <summary>
        /// Test GetDriverDocumentTypesByOrgId
        /// </summary>
        [Test]
        public void GetDriverDocumentTypesByOrgIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetDriverDocumentTypesByOrgId();
            //Assert.IsInstanceOf<List<DocumentType>> (response, "response is List<DocumentType>");
        }
        
        /// <summary>
        /// Test GetDriverDocumentsByOrgId
        /// </summary>
        [Test]
        public void GetDriverDocumentsByOrgIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? endMs = null;
            //long? durationMs = null;
            //var response = instance.GetDriverDocumentsByOrgId(accessToken, endMs, durationMs);
            //Assert.IsInstanceOf<List<Document>> (response, "response is List<Document>");
        }
        
        /// <summary>
        /// Test GetDriverSafetyScore
        /// </summary>
        [Test]
        public void GetDriverSafetyScoreTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? driverId = null;
            //string accessToken = null;
            //long? startMs = null;
            //long? endMs = null;
            //var response = instance.GetDriverSafetyScore(driverId, accessToken, startMs, endMs);
            //Assert.IsInstanceOf<DriverSafetyScoreResponse> (response, "response is DriverSafetyScoreResponse");
        }
        
        /// <summary>
        /// Test GetDvirs
        /// </summary>
        [Test]
        public void GetDvirsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //int? endMs = null;
            //int? durationMs = null;
            //int? groupId = null;
            //var response = instance.GetDvirs(accessToken, endMs, durationMs, groupId);
            //Assert.IsInstanceOf<DvirListResponse> (response, "response is DvirListResponse");
        }
        
        /// <summary>
        /// Test GetFleetDrivers
        /// </summary>
        [Test]
        public void GetFleetDriversTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject3 groupDriversParam = null;
            //var response = instance.GetFleetDrivers(accessToken, groupDriversParam);
            //Assert.IsInstanceOf<DriversResponse> (response, "response is DriversResponse");
        }
        
        /// <summary>
        /// Test GetFleetDriversHosDailyLogs
        /// </summary>
        [Test]
        public void GetFleetDriversHosDailyLogsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? driverId = null;
            //InlineObject6 hosLogsParam = null;
            //var response = instance.GetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
            //Assert.IsInstanceOf<DriverDailyLogResponse> (response, "response is DriverDailyLogResponse");
        }
        
        /// <summary>
        /// Test GetFleetDriversSummary
        /// </summary>
        [Test]
        public void GetFleetDriversSummaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject5 driversSummaryParam = null;
            //bool? snapToDayBounds = null;
            //var response = instance.GetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
            //Assert.IsInstanceOf<DriversSummaryResponse> (response, "response is DriversSummaryResponse");
        }
        
        /// <summary>
        /// Test GetFleetHosAuthenticationLogs
        /// </summary>
        [Test]
        public void GetFleetHosAuthenticationLogsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject7 hosAuthenticationLogsParam = null;
            //var response = instance.GetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
            //Assert.IsInstanceOf<HosAuthenticationLogsResponse> (response, "response is HosAuthenticationLogsResponse");
        }
        
        /// <summary>
        /// Test GetFleetHosLogs
        /// </summary>
        [Test]
        public void GetFleetHosLogsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject8 hosLogsParam = null;
            //var response = instance.GetFleetHosLogs(accessToken, hosLogsParam);
            //Assert.IsInstanceOf<HosLogsResponse> (response, "response is HosLogsResponse");
        }
        
        /// <summary>
        /// Test GetFleetHosLogsSummary
        /// </summary>
        [Test]
        public void GetFleetHosLogsSummaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject9 hosLogsParam = null;
            //var response = instance.GetFleetHosLogsSummary(accessToken, hosLogsParam);
            //Assert.IsInstanceOf<HosLogsSummaryResponse> (response, "response is HosLogsSummaryResponse");
        }
        
        /// <summary>
        /// Test GetFleetLocations
        /// </summary>
        [Test]
        public void GetFleetLocationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject11 groupParam = null;
            //var response = instance.GetFleetLocations(accessToken, groupParam);
            //Assert.IsInstanceOf<InlineResponse2003> (response, "response is InlineResponse2003");
        }
        
        /// <summary>
        /// Test GetFleetMaintenanceList
        /// </summary>
        [Test]
        public void GetFleetMaintenanceListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject13 groupParam = null;
            //var response = instance.GetFleetMaintenanceList(accessToken, groupParam);
            //Assert.IsInstanceOf<InlineResponse2004> (response, "response is InlineResponse2004");
        }
        
        /// <summary>
        /// Test GetFleetTrips
        /// </summary>
        [Test]
        public void GetFleetTripsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject15 tripsParam = null;
            //var response = instance.GetFleetTrips(accessToken, tripsParam);
            //Assert.IsInstanceOf<TripResponse> (response, "response is TripResponse");
        }
        
        /// <summary>
        /// Test GetFleetVehicle
        /// </summary>
        [Test]
        public void GetFleetVehicleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //string vehicleIdOrExternalId = null;
            //var response = instance.GetFleetVehicle(accessToken, vehicleIdOrExternalId);
            //Assert.IsInstanceOf<FleetVehicleResponse> (response, "response is FleetVehicleResponse");
        }
        
        /// <summary>
        /// Test GetOrganizationAddress
        /// </summary>
        [Test]
        public void GetOrganizationAddressTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? addressId = null;
            //var response = instance.GetOrganizationAddress(accessToken, addressId);
            //Assert.IsInstanceOf<Address> (response, "response is Address");
        }
        
        /// <summary>
        /// Test GetOrganizationAddresses
        /// </summary>
        [Test]
        public void GetOrganizationAddressesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //var response = instance.GetOrganizationAddresses(accessToken);
            //Assert.IsInstanceOf<List<Address>> (response, "response is List<Address>");
        }
        
        /// <summary>
        /// Test GetOrganizationContact
        /// </summary>
        [Test]
        public void GetOrganizationContactTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? contactId = null;
            //var response = instance.GetOrganizationContact(accessToken, contactId);
            //Assert.IsInstanceOf<Contact> (response, "response is Contact");
        }
        
        /// <summary>
        /// Test GetVehicleHarshEvent
        /// </summary>
        [Test]
        public void GetVehicleHarshEventTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? vehicleId = null;
            //string accessToken = null;
            //long? timestamp = null;
            //var response = instance.GetVehicleHarshEvent(vehicleId, accessToken, timestamp);
            //Assert.IsInstanceOf<VehicleHarshEventResponse> (response, "response is VehicleHarshEventResponse");
        }
        
        /// <summary>
        /// Test GetVehicleLocations
        /// </summary>
        [Test]
        public void GetVehicleLocationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? vehicleId = null;
            //long? startMs = null;
            //long? endMs = null;
            //var response = instance.GetVehicleLocations(accessToken, vehicleId, startMs, endMs);
            //Assert.IsInstanceOf<List<FleetVehicleLocation>> (response, "response is List<FleetVehicleLocation>");
        }
        
        /// <summary>
        /// Test GetVehicleSafetyScore
        /// </summary>
        [Test]
        public void GetVehicleSafetyScoreTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? vehicleId = null;
            //string accessToken = null;
            //long? startMs = null;
            //long? endMs = null;
            //var response = instance.GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
            //Assert.IsInstanceOf<VehicleSafetyScoreResponse> (response, "response is VehicleSafetyScoreResponse");
        }
        
        /// <summary>
        /// Test GetVehicleStats
        /// </summary>
        [Test]
        public void GetVehicleStatsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //int? startMs = null;
            //int? endMs = null;
            //string series = null;
            //string tagIds = null;
            //string startingAfter = null;
            //string endingBefore = null;
            //long? limit = null;
            //var response = instance.GetVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
            //Assert.IsInstanceOf<InlineResponse2005> (response, "response is InlineResponse2005");
        }
        
        /// <summary>
        /// Test GetVehiclesLocations
        /// </summary>
        [Test]
        public void GetVehiclesLocationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //int? startMs = null;
            //int? endMs = null;
            //var response = instance.GetVehiclesLocations(accessToken, startMs, endMs);
            //Assert.IsInstanceOf<List<Object>> (response, "response is List<Object>");
        }
        
        /// <summary>
        /// Test ListContacts
        /// </summary>
        [Test]
        public void ListContactsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //var response = instance.ListContacts(accessToken);
            //Assert.IsInstanceOf<List<Contact>> (response, "response is List<Contact>");
        }
        
        /// <summary>
        /// Test ListFleet
        /// </summary>
        [Test]
        public void ListFleetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject10 groupParam = null;
            //string startingAfter = null;
            //string endingBefore = null;
            //long? limit = null;
            //var response = instance.ListFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
            //Assert.IsInstanceOf<InlineResponse2002> (response, "response is InlineResponse2002");
        }
        
        /// <summary>
        /// Test PatchFleetVehicle
        /// </summary>
        [Test]
        public void PatchFleetVehicleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //string vehicleIdOrExternalId = null;
            //InlineObject16 data = null;
            //var response = instance.PatchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
            //Assert.IsInstanceOf<FleetVehicleResponse> (response, "response is FleetVehicleResponse");
        }
        
        /// <summary>
        /// Test ReactivateDriverById
        /// </summary>
        [Test]
        public void ReactivateDriverByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //string driverIdOrExternalId = null;
            //InlineObject4 reactivateDriverParam = null;
            //var response = instance.ReactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
            //Assert.IsInstanceOf<Driver> (response, "response is Driver");
        }
        
        /// <summary>
        /// Test UpdateDispatchRouteById
        /// </summary>
        [Test]
        public void UpdateDispatchRouteByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? routeId = null;
            //DispatchRoute updateDispatchRouteParams = null;
            //var response = instance.UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
            //Assert.IsInstanceOf<DispatchRoute> (response, "response is DispatchRoute");
        }
        
        /// <summary>
        /// Test UpdateOrganizationAddress
        /// </summary>
        [Test]
        public void UpdateOrganizationAddressTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //long? addressId = null;
            //InlineObject1 address = null;
            //instance.UpdateOrganizationAddress(accessToken, addressId, address);
            
        }
        
        /// <summary>
        /// Test UpdateVehicles
        /// </summary>
        [Test]
        public void UpdateVehiclesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //InlineObject14 vehicleUpdateParam = null;
            //instance.UpdateVehicles(accessToken, vehicleUpdateParam);
            
        }
        
    }

}
