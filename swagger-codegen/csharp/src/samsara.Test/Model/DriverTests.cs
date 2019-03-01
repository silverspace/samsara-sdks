/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using samsara.Api;
using samsara.Model;
using samsara.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace samsara.Test
{
    /// <summary>
    ///  Class for testing Driver
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class DriverTests
    {
        // TODO uncomment below to declare an instance variable for Driver
        //private Driver instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of Driver
            //instance = new Driver();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of Driver
        /// </summary>
        [Test]
        public void DriverInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" Driver
            //Assert.IsInstanceOfType<Driver> (instance, "variable 'instance' is a Driver");
        }


        /// <summary>
        /// Test the property 'EldAdverseWeatherExemptionEnabled'
        /// </summary>
        [Test]
        public void EldAdverseWeatherExemptionEnabledTest()
        {
            // TODO unit test for the property 'EldAdverseWeatherExemptionEnabled'
        }
        /// <summary>
        /// Test the property 'EldBigDayExemptionEnabled'
        /// </summary>
        [Test]
        public void EldBigDayExemptionEnabledTest()
        {
            // TODO unit test for the property 'EldBigDayExemptionEnabled'
        }
        /// <summary>
        /// Test the property 'EldDayStartHour'
        /// </summary>
        [Test]
        public void EldDayStartHourTest()
        {
            // TODO unit test for the property 'EldDayStartHour'
        }
        /// <summary>
        /// Test the property 'EldExempt'
        /// </summary>
        [Test]
        public void EldExemptTest()
        {
            // TODO unit test for the property 'EldExempt'
        }
        /// <summary>
        /// Test the property 'EldExemptReason'
        /// </summary>
        [Test]
        public void EldExemptReasonTest()
        {
            // TODO unit test for the property 'EldExemptReason'
        }
        /// <summary>
        /// Test the property 'EldPcEnabled'
        /// </summary>
        [Test]
        public void EldPcEnabledTest()
        {
            // TODO unit test for the property 'EldPcEnabled'
        }
        /// <summary>
        /// Test the property 'EldYmEnabled'
        /// </summary>
        [Test]
        public void EldYmEnabledTest()
        {
            // TODO unit test for the property 'EldYmEnabled'
        }
        /// <summary>
        /// Test the property 'ExternalIds'
        /// </summary>
        [Test]
        public void ExternalIdsTest()
        {
            // TODO unit test for the property 'ExternalIds'
        }
        /// <summary>
        /// Test the property 'GroupId'
        /// </summary>
        [Test]
        public void GroupIdTest()
        {
            // TODO unit test for the property 'GroupId'
        }
        /// <summary>
        /// Test the property 'LicenseNumber'
        /// </summary>
        [Test]
        public void LicenseNumberTest()
        {
            // TODO unit test for the property 'LicenseNumber'
        }
        /// <summary>
        /// Test the property 'LicenseState'
        /// </summary>
        [Test]
        public void LicenseStateTest()
        {
            // TODO unit test for the property 'LicenseState'
        }
        /// <summary>
        /// Test the property 'Name'
        /// </summary>
        [Test]
        public void NameTest()
        {
            // TODO unit test for the property 'Name'
        }
        /// <summary>
        /// Test the property 'Notes'
        /// </summary>
        [Test]
        public void NotesTest()
        {
            // TODO unit test for the property 'Notes'
        }
        /// <summary>
        /// Test the property 'Phone'
        /// </summary>
        [Test]
        public void PhoneTest()
        {
            // TODO unit test for the property 'Phone'
        }
        /// <summary>
        /// Test the property 'Username'
        /// </summary>
        [Test]
        public void UsernameTest()
        {
            // TODO unit test for the property 'Username'
        }
        /// <summary>
        /// Test the property 'VehicleId'
        /// </summary>
        [Test]
        public void VehicleIdTest()
        {
            // TODO unit test for the property 'VehicleId'
        }
        /// <summary>
        /// Test the property 'CurrentVehicleId'
        /// </summary>
        [Test]
        public void CurrentVehicleIdTest()
        {
            // TODO unit test for the property 'CurrentVehicleId'
        }

    }

}
