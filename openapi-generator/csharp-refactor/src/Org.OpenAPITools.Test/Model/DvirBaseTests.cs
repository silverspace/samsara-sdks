/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;
using Org.OpenAPITools.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing DvirBase
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class DvirBaseTests
    {
        // TODO uncomment below to declare an instance variable for DvirBase
        //private DvirBase instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of DvirBase
            //instance = new DvirBase();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of DvirBase
        /// </summary>
        [Test]
        public void DvirBaseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" DvirBase
            //Assert.IsInstanceOfType<DvirBase> (instance, "variable 'instance' is a DvirBase");
        }


        /// <summary>
        /// Test the property 'AuthorSignature'
        /// </summary>
        [Test]
        public void AuthorSignatureTest()
        {
            // TODO unit test for the property 'AuthorSignature'
        }
        /// <summary>
        /// Test the property 'DefectsCorrected'
        /// </summary>
        [Test]
        public void DefectsCorrectedTest()
        {
            // TODO unit test for the property 'DefectsCorrected'
        }
        /// <summary>
        /// Test the property 'DefectsNeedNotBeCorrected'
        /// </summary>
        [Test]
        public void DefectsNeedNotBeCorrectedTest()
        {
            // TODO unit test for the property 'DefectsNeedNotBeCorrected'
        }
        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'InspectionType'
        /// </summary>
        [Test]
        public void InspectionTypeTest()
        {
            // TODO unit test for the property 'InspectionType'
        }
        /// <summary>
        /// Test the property 'MechanicNotes'
        /// </summary>
        [Test]
        public void MechanicNotesTest()
        {
            // TODO unit test for the property 'MechanicNotes'
        }
        /// <summary>
        /// Test the property 'MechanicOrAgentSignature'
        /// </summary>
        [Test]
        public void MechanicOrAgentSignatureTest()
        {
            // TODO unit test for the property 'MechanicOrAgentSignature'
        }
        /// <summary>
        /// Test the property 'NextDriverSignature'
        /// </summary>
        [Test]
        public void NextDriverSignatureTest()
        {
            // TODO unit test for the property 'NextDriverSignature'
        }
        /// <summary>
        /// Test the property 'OdometerMiles'
        /// </summary>
        [Test]
        public void OdometerMilesTest()
        {
            // TODO unit test for the property 'OdometerMiles'
        }
        /// <summary>
        /// Test the property 'TimeMs'
        /// </summary>
        [Test]
        public void TimeMsTest()
        {
            // TODO unit test for the property 'TimeMs'
        }
        /// <summary>
        /// Test the property 'TrailerDefects'
        /// </summary>
        [Test]
        public void TrailerDefectsTest()
        {
            // TODO unit test for the property 'TrailerDefects'
        }
        /// <summary>
        /// Test the property 'TrailerId'
        /// </summary>
        [Test]
        public void TrailerIdTest()
        {
            // TODO unit test for the property 'TrailerId'
        }
        /// <summary>
        /// Test the property 'TrailerName'
        /// </summary>
        [Test]
        public void TrailerNameTest()
        {
            // TODO unit test for the property 'TrailerName'
        }
        /// <summary>
        /// Test the property 'Vehicle'
        /// </summary>
        [Test]
        public void VehicleTest()
        {
            // TODO unit test for the property 'Vehicle'
        }
        /// <summary>
        /// Test the property 'VehicleCondition'
        /// </summary>
        [Test]
        public void VehicleConditionTest()
        {
            // TODO unit test for the property 'VehicleCondition'
        }
        /// <summary>
        /// Test the property 'VehicleDefects'
        /// </summary>
        [Test]
        public void VehicleDefectsTest()
        {
            // TODO unit test for the property 'VehicleDefects'
        }

    }

}