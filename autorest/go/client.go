// Package  implements the Azure ARM  service API version 1.0.0.
//
// # Introduction
//
// Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and
// custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and
// entire fleets.
//
// The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by
// an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries
// of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP
// authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely
// with our API from a client-side web application (though you should never expose your secret API key).
// [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you
// can build with a REST API, the following API reference guide will be your go-to resource.
//
// API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs
// you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.
//
// If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)
//
// # Endpoints
//
// All our APIs can be accessed through HTTP requests to URLs like:
//
// ```curl
// https://api.samsara.com/<version>/<endpoint>
// ```
//
// All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either
// changes the response format or request parameter, we will increment the version.
//
// # Authentication
//
// To authenticate your API request you will need to include your secret token. You can manage your API tokens in the
// [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.
//
// Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in
// publicly accessible areas such as GitHub, client-side code, and so on.
//
// Authentication to the API is performed via [HTTP Basic
// Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token
// value in the URL. You do not need to provide a password.
//
// ```curl
// https://api.samsara.com/<version>/<endpoint>?access_token={access_token}
// ```
//
// All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or
// without authentication will fail.
//
// # Request Methods
//
// Our API endpoints use [HTTP request
// methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation
// to be performed. The documentation below specified request method supported by each endpoint and the resulting
// action.
//
// ## GET
//
// GET requests are typically used for fetching data (like data for a particular driver).
//
// ## POST
//
// POST requests are typically used for creating or updating a record (like adding new tags to the system). With that
// being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).
//
// ## PUT
//
// PUT requests are typically used for updating an existing record (like updating all devices associated with a
// particular tag).
//
// ## PATCH
//
// PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a
// particular tag).
//
// ## DELETE
//
// DELETE requests are used for deleting a record (like deleting a tag from the system).
//
// # Response Codes
//
// All API requests will respond with appropriate [HTTP status
// code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class
// differently.
//
// ## 2XX
//
// These are successful responses and indicate that the API request returned the expected response.
//
// ## 4XX
//
// These indicate that there was a problem with the request like a missing parameter or invalid values. Check the
// response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code,
// should be modified before retrying.
//
// ## 5XX
//
// These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the
// API request after some delay.
//
// # Error Responses
//
// In case of a 4XX status code, the body of the response will contain information to briefly explain the error
// reported. To help debugging the error, you can refer to the following table for understanding the error message.
//
// | Status Code | Message | Description |
// |-------------|----------------|-------------------------------------------------------------------|
// | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication
// section](#section/Authentication). |
// | 404 | Page not found | The API endpoint being accessed is invalid. |
// | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the
// format specified in the documentation. |
//
// # Versioning
//
// All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further
// and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response
// format or request parameter, we will increment the version. Thus, you can use our current API version worry free.
//
// # FAQs
//
// Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an
// answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
package

// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

import (
    "context"
    "github.com/Azure/go-autorest/autorest"
    "github.com/Azure/go-autorest/autorest/azure"
    "github.com/Azure/go-autorest/autorest/validation"
    "github.com/Azure/go-autorest/tracing"
    "net/http"
)

const (
// DefaultBaseURI is the default URI used for the service
DefaultBaseURI = "https://api.samsara.com/v1")

// BaseClient is the base client for .
type BaseClient struct {
    autorest.Client
    BaseURI string
            AccessToken string
            EndMs int64
            StartMs int64
            AssetID int64
            EndMs1 *int64
            DataInputID int64
            StartMs1 *int64
            DurationMs *int64
            EndMs2 *int64
            DriverIDOrExternalID string
            GroupID *int64
            Timestamp int64
            Include string
            SequenceID string
            EndingBefore string
            Limit *float64
            StartingAfter string
            Duration *int64
            EndTime *int64
            EndTime1 *int64
            StartTime *int64
            EndMs3 int64
            StartMs2 int64
            TagID int64
            VehicleIDOrExternalID string
}

// New creates an instance of the BaseClient client.
func New(accessToken string, endMs int64, startMs int64, assetID int64, endMs1 *int64, dataInputID int64, startMs1 *int64, durationMs *int64, endMs2 *int64, driverIDOrExternalID string, groupID *int64, timestamp int64, include string, sequenceID string, endingBefore string, limit *float64, startingAfter string, duration *int64, endTime *int64, endTime1 *int64, startTime *int64, endMs3 int64, startMs2 int64, tagID int64, vehicleIDOrExternalID string)BaseClient {
    return NewWithBaseURI(DefaultBaseURI, accessToken, endMs, startMs, assetID, endMs1, dataInputID, startMs1, durationMs, endMs2, driverIDOrExternalID, groupID, timestamp, include, sequenceID, endingBefore, limit, startingAfter, duration, endTime, endTime1, startTime, endMs3, startMs2, tagID, vehicleIDOrExternalID)
}

// NewWithBaseURI creates an instance of the BaseClient client.
func NewWithBaseURI(baseURI string, accessToken string, endMs int64, startMs int64, assetID int64, endMs1 *int64, dataInputID int64, startMs1 *int64, durationMs *int64, endMs2 *int64, driverIDOrExternalID string, groupID *int64, timestamp int64, include string, sequenceID string, endingBefore string, limit *float64, startingAfter string, duration *int64, endTime *int64, endTime1 *int64, startTime *int64, endMs3 int64, startMs2 int64, tagID int64, vehicleIDOrExternalID string) BaseClient {
    return BaseClient{
        Client: autorest.NewClientWithUserAgent(UserAgent()),
        BaseURI: baseURI,
                AccessToken: accessToken,
                EndMs: endMs,
                StartMs: startMs,
                AssetID: assetID,
                EndMs1: endMs1,
                DataInputID: dataInputID,
                StartMs1: startMs1,
                DurationMs: durationMs,
                EndMs2: endMs2,
                DriverIDOrExternalID: driverIDOrExternalID,
                GroupID: groupID,
                Timestamp: timestamp,
                Include: include,
                SequenceID: sequenceID,
                EndingBefore: endingBefore,
                Limit: limit,
                StartingAfter: startingAfter,
                Duration: duration,
                EndTime: endTime,
                EndTime1: endTime1,
                StartTime: startTime,
                EndMs3: endMs3,
                StartMs2: startMs2,
                TagID: tagID,
                VehicleIDOrExternalID: vehicleIDOrExternalID,
    }
}

    // AddOrganizationAddressesMethod add one or more addresses to the organization
        // Parameters:
            // addresses - list of addresses/geofences to add. Geofences can be circular or a polygon.
            // For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence
            // will be saved as a polygon.
    func (client BaseClient) AddOrganizationAddressesMethod(ctx context.Context, addresses AddressesType) (result ListAddressType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.AddOrganizationAddressesMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: addresses,
                 Constraints: []validation.Constraint{	{Target: "addresses.Addresses", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "AddOrganizationAddressesMethod", err.Error())
                }

                    req, err := client.AddOrganizationAddressesMethodPreparer(ctx, addresses)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "AddOrganizationAddressesMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.AddOrganizationAddressesMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "AddOrganizationAddressesMethod", resp, "Failure sending request")
                return
                }

                result, err = client.AddOrganizationAddressesMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "AddOrganizationAddressesMethod", resp, "Failure responding to request")
                }

        return
        }

        // AddOrganizationAddressesMethodPreparer prepares the AddOrganizationAddressesMethod request.
        func (client BaseClient) AddOrganizationAddressesMethodPreparer(ctx context.Context, addresses AddressesType) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/addresses"),
        autorest.WithJSON(addresses),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // AddOrganizationAddressesMethodSender sends the AddOrganizationAddressesMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) AddOrganizationAddressesMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // AddOrganizationAddressesMethodResponder handles the response to the AddOrganizationAddressesMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) AddOrganizationAddressesMethodResponder(resp *http.Response) (result ListAddressType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // CreateDispatchRouteMethod create a new dispatch route.
    func (client BaseClient) CreateDispatchRouteMethod(ctx context.Context, createDispatchRouteParams DispatchRouteCreateType) (result DispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.CreateDispatchRouteMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: createDispatchRouteParams,
                 Constraints: []validation.Constraint{	{Target: "createDispatchRouteParams.DispatchJobs", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "CreateDispatchRouteMethod", err.Error())
                }

                    req, err := client.CreateDispatchRouteMethodPreparer(ctx, createDispatchRouteParams)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDispatchRouteMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.CreateDispatchRouteMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDispatchRouteMethod", resp, "Failure sending request")
                return
                }

                result, err = client.CreateDispatchRouteMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDispatchRouteMethod", resp, "Failure responding to request")
                }

        return
        }

        // CreateDispatchRouteMethodPreparer prepares the CreateDispatchRouteMethod request.
        func (client BaseClient) CreateDispatchRouteMethodPreparer(ctx context.Context, createDispatchRouteParams DispatchRouteCreateType) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/dispatch/routes"),
        autorest.WithJSON(createDispatchRouteParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // CreateDispatchRouteMethodSender sends the CreateDispatchRouteMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) CreateDispatchRouteMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // CreateDispatchRouteMethodResponder handles the response to the CreateDispatchRouteMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) CreateDispatchRouteMethodResponder(resp *http.Response) (result DispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // CreateDriverDispatchRouteMethod create a new dispatch route for the driver with driver_id.
        // Parameters:
            // driverID - ID of the driver with the associated routes.
    func (client BaseClient) CreateDriverDispatchRouteMethod(ctx context.Context, createDispatchRouteParams DispatchRouteCreateType, driverID int64) (result DispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.CreateDriverDispatchRouteMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: createDispatchRouteParams,
                 Constraints: []validation.Constraint{	{Target: "createDispatchRouteParams.DispatchJobs", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "CreateDriverDispatchRouteMethod", err.Error())
                }

                    req, err := client.CreateDriverDispatchRouteMethodPreparer(ctx, createDispatchRouteParams, driverID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverDispatchRouteMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.CreateDriverDispatchRouteMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverDispatchRouteMethod", resp, "Failure sending request")
                return
                }

                result, err = client.CreateDriverDispatchRouteMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverDispatchRouteMethod", resp, "Failure responding to request")
                }

        return
        }

        // CreateDriverDispatchRouteMethodPreparer prepares the CreateDriverDispatchRouteMethod request.
        func (client BaseClient) CreateDriverDispatchRouteMethodPreparer(ctx context.Context, createDispatchRouteParams DispatchRouteCreateType, driverID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id": autorest.Encode("path",driverID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/{driver_id}/dispatch/routes",pathParameters),
        autorest.WithJSON(createDispatchRouteParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // CreateDriverDispatchRouteMethodSender sends the CreateDriverDispatchRouteMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) CreateDriverDispatchRouteMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // CreateDriverDispatchRouteMethodResponder handles the response to the CreateDriverDispatchRouteMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) CreateDriverDispatchRouteMethodResponder(resp *http.Response) (result DispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // CreateDriverDocumentMethod create a driver document for the given driver.
        // Parameters:
            // createDocumentParams - to create a document for a given document type, the document type's uuid needs to be
            // passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field
            // types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue,
            // numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
            // driverID - ID of the driver for whom the document is created.
    func (client BaseClient) CreateDriverDocumentMethod(ctx context.Context, createDocumentParams DocumentCreateType, driverID int64) (result DocumentType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.CreateDriverDocumentMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: createDocumentParams,
                 Constraints: []validation.Constraint{	{Target: "createDocumentParams.DocumentTypeUUID", Name: validation.Null, Rule: true, Chain: nil },
                	{Target: "createDocumentParams.Fields", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "CreateDriverDocumentMethod", err.Error())
                }

                    req, err := client.CreateDriverDocumentMethodPreparer(ctx, createDocumentParams, driverID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverDocumentMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.CreateDriverDocumentMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverDocumentMethod", resp, "Failure sending request")
                return
                }

                result, err = client.CreateDriverDocumentMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverDocumentMethod", resp, "Failure responding to request")
                }

        return
        }

        // CreateDriverDocumentMethodPreparer prepares the CreateDriverDocumentMethod request.
        func (client BaseClient) CreateDriverDocumentMethodPreparer(ctx context.Context, createDocumentParams DocumentCreateType, driverID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id": autorest.Encode("path",driverID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/{driver_id}/documents",pathParameters),
        autorest.WithJSON(createDocumentParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // CreateDriverDocumentMethodSender sends the CreateDriverDocumentMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) CreateDriverDocumentMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // CreateDriverDocumentMethodResponder handles the response to the CreateDriverDocumentMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) CreateDriverDocumentMethodResponder(resp *http.Response) (result DocumentType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // CreateDriverMethod create a new driver.
        // Parameters:
            // createDriverParam - driver creation body
    func (client BaseClient) CreateDriverMethod(ctx context.Context, createDriverParam DriverForCreateType) (result CurrentDriverType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.CreateDriverMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: createDriverParam,
                 Constraints: []validation.Constraint{	{Target: "createDriverParam.Password", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "CreateDriverMethod", err.Error())
                }

                    req, err := client.CreateDriverMethodPreparer(ctx, createDriverParam)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.CreateDriverMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverMethod", resp, "Failure sending request")
                return
                }

                result, err = client.CreateDriverMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateDriverMethod", resp, "Failure responding to request")
                }

        return
        }

        // CreateDriverMethodPreparer prepares the CreateDriverMethod request.
        func (client BaseClient) CreateDriverMethodPreparer(ctx context.Context, createDriverParam DriverForCreateType) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/drivers/create"),
        autorest.WithJSON(createDriverParam),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // CreateDriverMethodSender sends the CreateDriverMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) CreateDriverMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // CreateDriverMethodResponder handles the response to the CreateDriverMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) CreateDriverMethodResponder(resp *http.Response) (result CurrentDriverType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // CreateTagMethod create a new tag for the group.
    func (client BaseClient) CreateTagMethod(ctx context.Context, tagCreateParams TagCreateType) (result TagType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.CreateTagMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: tagCreateParams,
                 Constraints: []validation.Constraint{	{Target: "tagCreateParams.Name", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "CreateTagMethod", err.Error())
                }

                    req, err := client.CreateTagMethodPreparer(ctx, tagCreateParams)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "CreateTagMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.CreateTagMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateTagMethod", resp, "Failure sending request")
                return
                }

                result, err = client.CreateTagMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateTagMethod", resp, "Failure responding to request")
                }

        return
        }

        // CreateTagMethodPreparer prepares the CreateTagMethod request.
        func (client BaseClient) CreateTagMethodPreparer(ctx context.Context, tagCreateParams TagCreateType) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/tags"),
        autorest.WithJSON(tagCreateParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // CreateTagMethodSender sends the CreateTagMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) CreateTagMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // CreateTagMethodResponder handles the response to the CreateTagMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) CreateTagMethodResponder(resp *http.Response) (result TagType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // CreateVehicleDispatchRouteMethod create a new dispatch route for the vehicle with vehicle_id.
        // Parameters:
            // vehicleID - ID of the vehicle with the associated routes.
    func (client BaseClient) CreateVehicleDispatchRouteMethod(ctx context.Context, createDispatchRouteParams DispatchRouteCreateType, vehicleID int64) (result DispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.CreateVehicleDispatchRouteMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: createDispatchRouteParams,
                 Constraints: []validation.Constraint{	{Target: "createDispatchRouteParams.DispatchJobs", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "CreateVehicleDispatchRouteMethod", err.Error())
                }

                    req, err := client.CreateVehicleDispatchRouteMethodPreparer(ctx, createDispatchRouteParams, vehicleID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "CreateVehicleDispatchRouteMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.CreateVehicleDispatchRouteMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateVehicleDispatchRouteMethod", resp, "Failure sending request")
                return
                }

                result, err = client.CreateVehicleDispatchRouteMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "CreateVehicleDispatchRouteMethod", resp, "Failure responding to request")
                }

        return
        }

        // CreateVehicleDispatchRouteMethodPreparer prepares the CreateVehicleDispatchRouteMethod request.
        func (client BaseClient) CreateVehicleDispatchRouteMethodPreparer(ctx context.Context, createDispatchRouteParams DispatchRouteCreateType, vehicleID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicle_id": autorest.Encode("path",vehicleID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPost(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicle_id}/dispatch/routes",pathParameters),
        autorest.WithJSON(createDispatchRouteParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // CreateVehicleDispatchRouteMethodSender sends the CreateVehicleDispatchRouteMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) CreateVehicleDispatchRouteMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // CreateVehicleDispatchRouteMethodResponder handles the response to the CreateVehicleDispatchRouteMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) CreateVehicleDispatchRouteMethodResponder(resp *http.Response) (result DispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // DeactivateDriverMethod deactivate a driver with the given id.
    func (client BaseClient) DeactivateDriverMethod(ctx context.Context) (result autorest.Response, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.DeactivateDriverMethod")
            defer func() {
                sc := -1
                if result.Response != nil {
                    sc = result.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.DeactivateDriverMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "DeactivateDriverMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.DeactivateDriverMethodSender(req)
                if err != nil {
                result.Response = resp
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeactivateDriverMethod", resp, "Failure sending request")
                return
                }

                result, err = client.DeactivateDriverMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeactivateDriverMethod", resp, "Failure responding to request")
                }

        return
        }

        // DeactivateDriverMethodPreparer prepares the DeactivateDriverMethod request.
        func (client BaseClient) DeactivateDriverMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id_or_external_id": autorest.Encode("path",client.DriverIDOrExternalID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsDelete(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/{driver_id_or_external_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // DeactivateDriverMethodSender sends the DeactivateDriverMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) DeactivateDriverMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // DeactivateDriverMethodResponder handles the response to the DeactivateDriverMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) DeactivateDriverMethodResponder(resp *http.Response) (result autorest.Response, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByClosing())
        result.Response = resp
            return
        }

    // DeleteDispatchRouteByIDMethod delete a dispatch route and its associated jobs.
        // Parameters:
            // routeID - ID of the dispatch route.
    func (client BaseClient) DeleteDispatchRouteByIDMethod(ctx context.Context, routeID int64) (result autorest.Response, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.DeleteDispatchRouteByIDMethod")
            defer func() {
                sc := -1
                if result.Response != nil {
                    sc = result.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.DeleteDispatchRouteByIDMethodPreparer(ctx, routeID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteDispatchRouteByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.DeleteDispatchRouteByIDMethodSender(req)
                if err != nil {
                result.Response = resp
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteDispatchRouteByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.DeleteDispatchRouteByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteDispatchRouteByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // DeleteDispatchRouteByIDMethodPreparer prepares the DeleteDispatchRouteByIDMethod request.
        func (client BaseClient) DeleteDispatchRouteByIDMethodPreparer(ctx context.Context, routeID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "route_id": autorest.Encode("path",routeID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsDelete(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/dispatch/routes/{route_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // DeleteDispatchRouteByIDMethodSender sends the DeleteDispatchRouteByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) DeleteDispatchRouteByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // DeleteDispatchRouteByIDMethodResponder handles the response to the DeleteDispatchRouteByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) DeleteDispatchRouteByIDMethodResponder(resp *http.Response) (result autorest.Response, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByClosing())
        result.Response = resp
            return
        }

    // DeleteOrganizationAddressMethod delete an address.
        // Parameters:
            // addressID - ID of the address/geofence
    func (client BaseClient) DeleteOrganizationAddressMethod(ctx context.Context, addressID int64) (result autorest.Response, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.DeleteOrganizationAddressMethod")
            defer func() {
                sc := -1
                if result.Response != nil {
                    sc = result.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.DeleteOrganizationAddressMethodPreparer(ctx, addressID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteOrganizationAddressMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.DeleteOrganizationAddressMethodSender(req)
                if err != nil {
                result.Response = resp
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteOrganizationAddressMethod", resp, "Failure sending request")
                return
                }

                result, err = client.DeleteOrganizationAddressMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteOrganizationAddressMethod", resp, "Failure responding to request")
                }

        return
        }

        // DeleteOrganizationAddressMethodPreparer prepares the DeleteOrganizationAddressMethod request.
        func (client BaseClient) DeleteOrganizationAddressMethodPreparer(ctx context.Context, addressID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "addressId": autorest.Encode("path",addressID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsDelete(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/addresses/{addressId}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // DeleteOrganizationAddressMethodSender sends the DeleteOrganizationAddressMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) DeleteOrganizationAddressMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // DeleteOrganizationAddressMethodResponder handles the response to the DeleteOrganizationAddressMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) DeleteOrganizationAddressMethodResponder(resp *http.Response) (result autorest.Response, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByClosing())
        result.Response = resp
            return
        }

    // DeleteTagByIDMethod permanently deletes a tag.
    func (client BaseClient) DeleteTagByIDMethod(ctx context.Context) (result autorest.Response, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.DeleteTagByIDMethod")
            defer func() {
                sc := -1
                if result.Response != nil {
                    sc = result.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.DeleteTagByIDMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteTagByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.DeleteTagByIDMethodSender(req)
                if err != nil {
                result.Response = resp
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteTagByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.DeleteTagByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteTagByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // DeleteTagByIDMethodPreparer prepares the DeleteTagByIDMethod request.
        func (client BaseClient) DeleteTagByIDMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "tag_id": autorest.Encode("path",client.TagID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsDelete(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/tags/{tag_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // DeleteTagByIDMethodSender sends the DeleteTagByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) DeleteTagByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // DeleteTagByIDMethodResponder handles the response to the DeleteTagByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) DeleteTagByIDMethodResponder(resp *http.Response) (result autorest.Response, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByClosing())
        result.Response = resp
            return
        }

    // DeleteUserByIDMethod remove a user from the organization.
        // Parameters:
            // userID - ID of the user.
    func (client BaseClient) DeleteUserByIDMethod(ctx context.Context, userID int64) (result autorest.Response, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.DeleteUserByIDMethod")
            defer func() {
                sc := -1
                if result.Response != nil {
                    sc = result.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.DeleteUserByIDMethodPreparer(ctx, userID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteUserByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.DeleteUserByIDMethodSender(req)
                if err != nil {
                result.Response = resp
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteUserByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.DeleteUserByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "DeleteUserByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // DeleteUserByIDMethodPreparer prepares the DeleteUserByIDMethod request.
        func (client BaseClient) DeleteUserByIDMethodPreparer(ctx context.Context, userID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "userId": autorest.Encode("path",userID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsDelete(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/users/{userId}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // DeleteUserByIDMethodSender sends the DeleteUserByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) DeleteUserByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // DeleteUserByIDMethodResponder handles the response to the DeleteUserByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) DeleteUserByIDMethodResponder(resp *http.Response) (result autorest.Response, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByClosing())
        result.Response = resp
            return
        }

    // FetchAllDispatchRoutesMethod fetch all of the dispatch routes for the group.
    func (client BaseClient) FetchAllDispatchRoutesMethod(ctx context.Context) (result ListDispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.FetchAllDispatchRoutesMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.FetchAllDispatchRoutesMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "FetchAllDispatchRoutesMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.FetchAllDispatchRoutesMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "FetchAllDispatchRoutesMethod", resp, "Failure sending request")
                return
                }

                result, err = client.FetchAllDispatchRoutesMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "FetchAllDispatchRoutesMethod", resp, "Failure responding to request")
                }

        return
        }

        // FetchAllDispatchRoutesMethodPreparer prepares the FetchAllDispatchRoutesMethod request.
        func (client BaseClient) FetchAllDispatchRoutesMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }
                if client.EndTime != nil {
                queryParameters["end_time"] = autorest.Encode("query",*client.EndTime)
                }
                if client.Duration != nil {
                queryParameters["duration"] = autorest.Encode("query",*client.Duration)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/dispatch/routes"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // FetchAllDispatchRoutesMethodSender sends the FetchAllDispatchRoutesMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) FetchAllDispatchRoutesMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // FetchAllDispatchRoutesMethodResponder handles the response to the FetchAllDispatchRoutesMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) FetchAllDispatchRoutesMethodResponder(resp *http.Response) (result ListDispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // FetchAllRouteJobUpdatesMethod fetch all updates to a job including route data in the last 24 hours or subsequent to
    // an sequence ID
    func (client BaseClient) FetchAllRouteJobUpdatesMethod(ctx context.Context) (result AllRouteJobUpdatesType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.FetchAllRouteJobUpdatesMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.FetchAllRouteJobUpdatesMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "FetchAllRouteJobUpdatesMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.FetchAllRouteJobUpdatesMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "FetchAllRouteJobUpdatesMethod", resp, "Failure sending request")
                return
                }

                result, err = client.FetchAllRouteJobUpdatesMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "FetchAllRouteJobUpdatesMethod", resp, "Failure responding to request")
                }

        return
        }

        // FetchAllRouteJobUpdatesMethodPreparer prepares the FetchAllRouteJobUpdatesMethod request.
        func (client BaseClient) FetchAllRouteJobUpdatesMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }
                if len(client.SequenceID) > 0 {
                queryParameters["sequence_id"] = autorest.Encode("query",client.SequenceID)
                }
                if len(client.Include) > 0 {
                queryParameters["include"] = autorest.Encode("query",client.Include)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/dispatch/routes/job_updates"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // FetchAllRouteJobUpdatesMethodSender sends the FetchAllRouteJobUpdatesMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) FetchAllRouteJobUpdatesMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // FetchAllRouteJobUpdatesMethodResponder handles the response to the FetchAllRouteJobUpdatesMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) FetchAllRouteJobUpdatesMethodResponder(resp *http.Response) (result AllRouteJobUpdatesType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAllAssetCurrentLocationsMethod fetch current locations of all assets for the group.
    func (client BaseClient) GetAllAssetCurrentLocationsMethod(ctx context.Context) (result GetAllAssetCurrentLocationsOKResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAllAssetCurrentLocationsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAllAssetCurrentLocationsMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllAssetCurrentLocationsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAllAssetCurrentLocationsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllAssetCurrentLocationsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAllAssetCurrentLocationsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllAssetCurrentLocationsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAllAssetCurrentLocationsMethodPreparer prepares the GetAllAssetCurrentLocationsMethod request.
        func (client BaseClient) GetAllAssetCurrentLocationsMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/assets/locations"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAllAssetCurrentLocationsMethodSender sends the GetAllAssetCurrentLocationsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAllAssetCurrentLocationsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAllAssetCurrentLocationsMethodResponder handles the response to the GetAllAssetCurrentLocationsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAllAssetCurrentLocationsMethodResponder(resp *http.Response) (result GetAllAssetCurrentLocationsOKResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAllAssetsMethod fetch all of the assets for the group.
    func (client BaseClient) GetAllAssetsMethod(ctx context.Context) (result GetAllAssetsOKResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAllAssetsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAllAssetsMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllAssetsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAllAssetsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllAssetsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAllAssetsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllAssetsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAllAssetsMethodPreparer prepares the GetAllAssetsMethod request.
        func (client BaseClient) GetAllAssetsMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/assets"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAllAssetsMethodSender sends the GetAllAssetsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAllAssetsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAllAssetsMethodResponder handles the response to the GetAllAssetsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAllAssetsMethodResponder(resp *http.Response) (result GetAllAssetsOKResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAllDataInputsMethod fetch all of the data inputs for a group.
    func (client BaseClient) GetAllDataInputsMethod(ctx context.Context) (result GetAllDataInputsOKResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAllDataInputsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAllDataInputsMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllDataInputsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAllDataInputsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllDataInputsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAllDataInputsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllDataInputsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAllDataInputsMethodPreparer prepares the GetAllDataInputsMethod request.
        func (client BaseClient) GetAllDataInputsMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }
                if client.StartMs != nil {
                queryParameters["startMs"] = autorest.Encode("query",*client.StartMs)
                }
                if client.EndMs != nil {
                queryParameters["endMs"] = autorest.Encode("query",*client.EndMs)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/industrial/data"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAllDataInputsMethodSender sends the GetAllDataInputsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAllDataInputsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAllDataInputsMethodResponder handles the response to the GetAllDataInputsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAllDataInputsMethodResponder(resp *http.Response) (result GetAllDataInputsOKResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAllDeactivatedDriversMethod fetch all deactivated drivers for the group.
    func (client BaseClient) GetAllDeactivatedDriversMethod(ctx context.Context) (result ListCurrentDriverType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAllDeactivatedDriversMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAllDeactivatedDriversMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllDeactivatedDriversMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAllDeactivatedDriversMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllDeactivatedDriversMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAllDeactivatedDriversMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllDeactivatedDriversMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAllDeactivatedDriversMethodPreparer prepares the GetAllDeactivatedDriversMethod request.
        func (client BaseClient) GetAllDeactivatedDriversMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/drivers/inactive"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAllDeactivatedDriversMethodSender sends the GetAllDeactivatedDriversMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAllDeactivatedDriversMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAllDeactivatedDriversMethodResponder handles the response to the GetAllDeactivatedDriversMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAllDeactivatedDriversMethodResponder(resp *http.Response) (result ListCurrentDriverType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAllTagsMethod fetch all of the tags for a group.
    func (client BaseClient) GetAllTagsMethod(ctx context.Context) (result GetAllTagsOKResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAllTagsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAllTagsMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllTagsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAllTagsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllTagsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAllTagsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAllTagsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAllTagsMethodPreparer prepares the GetAllTagsMethod request.
        func (client BaseClient) GetAllTagsMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.GroupID != nil {
                queryParameters["group_id"] = autorest.Encode("query",*client.GroupID)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/tags"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAllTagsMethodSender sends the GetAllTagsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAllTagsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAllTagsMethodResponder handles the response to the GetAllTagsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAllTagsMethodResponder(resp *http.Response) (result GetAllTagsOKResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAssetLocationMethod fetch the historical locations for the asset.
    func (client BaseClient) GetAssetLocationMethod(ctx context.Context) (result ListAssetLocationResponseItemType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAssetLocationMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAssetLocationMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAssetLocationMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAssetLocationMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAssetLocationMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAssetLocationMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAssetLocationMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAssetLocationMethodPreparer prepares the GetAssetLocationMethod request.
        func (client BaseClient) GetAssetLocationMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "asset_id": autorest.Encode("path",client.AssetID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",client.EndMs),
            "startMs": autorest.Encode("query",client.StartMs),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/assets/{asset_id}/locations",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAssetLocationMethodSender sends the GetAssetLocationMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAssetLocationMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAssetLocationMethodResponder handles the response to the GetAssetLocationMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAssetLocationMethodResponder(resp *http.Response) (result ListAssetLocationResponseItemType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetAssetReeferMethod fetch the reefer-specific stats of an asset.
    func (client BaseClient) GetAssetReeferMethod(ctx context.Context) (result AssetReeferResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetAssetReeferMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetAssetReeferMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetAssetReeferMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetAssetReeferMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAssetReeferMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetAssetReeferMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetAssetReeferMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetAssetReeferMethodPreparer prepares the GetAssetReeferMethod request.
        func (client BaseClient) GetAssetReeferMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "asset_id": autorest.Encode("path",client.AssetID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",client.EndMs),
            "startMs": autorest.Encode("query",client.StartMs),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/assets/{asset_id}/reefer",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetAssetReeferMethodSender sends the GetAssetReeferMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetAssetReeferMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetAssetReeferMethodResponder handles the response to the GetAssetReeferMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetAssetReeferMethodResponder(resp *http.Response) (result AssetReeferResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDataInputMethod fetch datapoints from a given data input.
    func (client BaseClient) GetDataInputMethod(ctx context.Context) (result DataInputHistoryResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDataInputMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDataInputMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDataInputMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDataInputMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDataInputMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDataInputMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDataInputMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDataInputMethodPreparer prepares the GetDataInputMethod request.
        func (client BaseClient) GetDataInputMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "data_input_id": autorest.Encode("path",client.DataInputID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.StartMs != nil {
                queryParameters["startMs"] = autorest.Encode("query",*client.StartMs)
                }
                if client.EndMs != nil {
                queryParameters["endMs"] = autorest.Encode("query",*client.EndMs)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/industrial/data/{data_input_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDataInputMethodSender sends the GetDataInputMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDataInputMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDataInputMethodResponder handles the response to the GetDataInputMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDataInputMethodResponder(resp *http.Response) (result DataInputHistoryResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDeactivatedDriverByIDMethod fetch deactivated driver by id.
    func (client BaseClient) GetDeactivatedDriverByIDMethod(ctx context.Context) (result CurrentDriverType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDeactivatedDriverByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDeactivatedDriverByIDMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDeactivatedDriverByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDeactivatedDriverByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDeactivatedDriverByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDeactivatedDriverByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDeactivatedDriverByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDeactivatedDriverByIDMethodPreparer prepares the GetDeactivatedDriverByIDMethod request.
        func (client BaseClient) GetDeactivatedDriverByIDMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id_or_external_id": autorest.Encode("path",client.DriverIDOrExternalID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/inactive/{driver_id_or_external_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDeactivatedDriverByIDMethodSender sends the GetDeactivatedDriverByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDeactivatedDriverByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDeactivatedDriverByIDMethodResponder handles the response to the GetDeactivatedDriverByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDeactivatedDriverByIDMethodResponder(resp *http.Response) (result CurrentDriverType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDispatchRouteByIDMethod fetch a dispatch route by id.
        // Parameters:
            // routeID - ID of the dispatch route.
    func (client BaseClient) GetDispatchRouteByIDMethod(ctx context.Context, routeID int64) (result DispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDispatchRouteByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDispatchRouteByIDMethodPreparer(ctx, routeID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRouteByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDispatchRouteByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRouteByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDispatchRouteByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRouteByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDispatchRouteByIDMethodPreparer prepares the GetDispatchRouteByIDMethod request.
        func (client BaseClient) GetDispatchRouteByIDMethodPreparer(ctx context.Context, routeID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "route_id": autorest.Encode("path",routeID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/dispatch/routes/{route_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDispatchRouteByIDMethodSender sends the GetDispatchRouteByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDispatchRouteByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDispatchRouteByIDMethodResponder handles the response to the GetDispatchRouteByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDispatchRouteByIDMethodResponder(resp *http.Response) (result DispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDispatchRouteHistoryMethod fetch the history of a dispatch route.
        // Parameters:
            // routeID - ID of the route with history.
    func (client BaseClient) GetDispatchRouteHistoryMethod(ctx context.Context, routeID int64) (result DispatchRouteHistoryType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDispatchRouteHistoryMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDispatchRouteHistoryMethodPreparer(ctx, routeID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRouteHistoryMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDispatchRouteHistoryMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRouteHistoryMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDispatchRouteHistoryMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRouteHistoryMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDispatchRouteHistoryMethodPreparer prepares the GetDispatchRouteHistoryMethod request.
        func (client BaseClient) GetDispatchRouteHistoryMethodPreparer(ctx context.Context, routeID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "route_id": autorest.Encode("path",routeID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.StartTime != nil {
                queryParameters["start_time"] = autorest.Encode("query",*client.StartTime)
                }
                if client.EndTime != nil {
                queryParameters["end_time"] = autorest.Encode("query",*client.EndTime)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/dispatch/routes/{route_id}/history",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDispatchRouteHistoryMethodSender sends the GetDispatchRouteHistoryMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDispatchRouteHistoryMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDispatchRouteHistoryMethodResponder handles the response to the GetDispatchRouteHistoryMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDispatchRouteHistoryMethodResponder(resp *http.Response) (result DispatchRouteHistoryType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDispatchRoutesByDriverIDMethod fetch all of the dispatch routes for a given driver.
        // Parameters:
            // driverID - ID of the driver with the associated routes.
    func (client BaseClient) GetDispatchRoutesByDriverIDMethod(ctx context.Context, driverID int64) (result ListDispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDispatchRoutesByDriverIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDispatchRoutesByDriverIDMethodPreparer(ctx, driverID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRoutesByDriverIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDispatchRoutesByDriverIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRoutesByDriverIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDispatchRoutesByDriverIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRoutesByDriverIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDispatchRoutesByDriverIDMethodPreparer prepares the GetDispatchRoutesByDriverIDMethod request.
        func (client BaseClient) GetDispatchRoutesByDriverIDMethodPreparer(ctx context.Context, driverID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id": autorest.Encode("path",driverID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.EndTime != nil {
                queryParameters["end_time"] = autorest.Encode("query",*client.EndTime)
                }
                if client.Duration != nil {
                queryParameters["duration"] = autorest.Encode("query",*client.Duration)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/{driver_id}/dispatch/routes",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDispatchRoutesByDriverIDMethodSender sends the GetDispatchRoutesByDriverIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDispatchRoutesByDriverIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDispatchRoutesByDriverIDMethodResponder handles the response to the GetDispatchRoutesByDriverIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDispatchRoutesByDriverIDMethodResponder(resp *http.Response) (result ListDispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDispatchRoutesByVehicleIDMethod fetch all of the dispatch routes for a given vehicle.
        // Parameters:
            // vehicleID - ID of the vehicle with the associated routes.
    func (client BaseClient) GetDispatchRoutesByVehicleIDMethod(ctx context.Context, vehicleID int64) (result ListDispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDispatchRoutesByVehicleIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDispatchRoutesByVehicleIDMethodPreparer(ctx, vehicleID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRoutesByVehicleIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDispatchRoutesByVehicleIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRoutesByVehicleIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDispatchRoutesByVehicleIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDispatchRoutesByVehicleIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDispatchRoutesByVehicleIDMethodPreparer prepares the GetDispatchRoutesByVehicleIDMethod request.
        func (client BaseClient) GetDispatchRoutesByVehicleIDMethodPreparer(ctx context.Context, vehicleID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicle_id": autorest.Encode("path",vehicleID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.EndTime != nil {
                queryParameters["end_time"] = autorest.Encode("query",*client.EndTime)
                }
                if client.Duration != nil {
                queryParameters["duration"] = autorest.Encode("query",*client.Duration)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicle_id}/dispatch/routes",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDispatchRoutesByVehicleIDMethodSender sends the GetDispatchRoutesByVehicleIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDispatchRoutesByVehicleIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDispatchRoutesByVehicleIDMethodResponder handles the response to the GetDispatchRoutesByVehicleIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDispatchRoutesByVehicleIDMethodResponder(resp *http.Response) (result ListDispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDriverByIDMethod fetch driver by id.
    func (client BaseClient) GetDriverByIDMethod(ctx context.Context) (result CurrentDriverType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDriverByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDriverByIDMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDriverByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDriverByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDriverByIDMethodPreparer prepares the GetDriverByIDMethod request.
        func (client BaseClient) GetDriverByIDMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id_or_external_id": autorest.Encode("path",client.DriverIDOrExternalID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/{driver_id_or_external_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDriverByIDMethodSender sends the GetDriverByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDriverByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDriverByIDMethodResponder handles the response to the GetDriverByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDriverByIDMethodResponder(resp *http.Response) (result CurrentDriverType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDriverDocumentsByOrgIDMethod fetch all of the documents.
    func (client BaseClient) GetDriverDocumentsByOrgIDMethod(ctx context.Context) (result ListDocumentType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDriverDocumentsByOrgIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDriverDocumentsByOrgIDMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverDocumentsByOrgIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDriverDocumentsByOrgIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverDocumentsByOrgIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDriverDocumentsByOrgIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverDocumentsByOrgIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDriverDocumentsByOrgIDMethodPreparer prepares the GetDriverDocumentsByOrgIDMethod request.
        func (client BaseClient) GetDriverDocumentsByOrgIDMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }
                if client.EndMs != nil {
                queryParameters["endMs"] = autorest.Encode("query",*client.EndMs)
                }
                if client.DurationMs != nil {
                queryParameters["durationMs"] = autorest.Encode("query",*client.DurationMs)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/drivers/documents"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDriverDocumentsByOrgIDMethodSender sends the GetDriverDocumentsByOrgIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDriverDocumentsByOrgIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDriverDocumentsByOrgIDMethodResponder handles the response to the GetDriverDocumentsByOrgIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDriverDocumentsByOrgIDMethodResponder(resp *http.Response) (result ListDocumentType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDriverDocumentTypesByOrgIDMethod fetch all of the document types.
    func (client BaseClient) GetDriverDocumentTypesByOrgIDMethod(ctx context.Context) (result ListDocumentTypeType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDriverDocumentTypesByOrgIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDriverDocumentTypesByOrgIDMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverDocumentTypesByOrgIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDriverDocumentTypesByOrgIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverDocumentTypesByOrgIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDriverDocumentTypesByOrgIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverDocumentTypesByOrgIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDriverDocumentTypesByOrgIDMethodPreparer prepares the GetDriverDocumentTypesByOrgIDMethod request.
        func (client BaseClient) GetDriverDocumentTypesByOrgIDMethodPreparer(ctx context.Context) (*http.Request, error) {
        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/drivers/document_types"))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDriverDocumentTypesByOrgIDMethodSender sends the GetDriverDocumentTypesByOrgIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDriverDocumentTypesByOrgIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDriverDocumentTypesByOrgIDMethodResponder handles the response to the GetDriverDocumentTypesByOrgIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDriverDocumentTypesByOrgIDMethodResponder(resp *http.Response) (result ListDocumentTypeType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetDriverSafetyScoreMethod fetch the safety score for the driver.
        // Parameters:
            // driverID - ID of the driver
    func (client BaseClient) GetDriverSafetyScoreMethod(ctx context.Context, driverID int64) (result DriverSafetyScoreResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetDriverSafetyScoreMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetDriverSafetyScoreMethodPreparer(ctx, driverID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverSafetyScoreMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetDriverSafetyScoreMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverSafetyScoreMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetDriverSafetyScoreMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetDriverSafetyScoreMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetDriverSafetyScoreMethodPreparer prepares the GetDriverSafetyScoreMethod request.
        func (client BaseClient) GetDriverSafetyScoreMethodPreparer(ctx context.Context, driverID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driverId": autorest.Encode("path",driverID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",client.EndMs),
            "startMs": autorest.Encode("query",client.StartMs),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/{driverId}/safety/score",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetDriverSafetyScoreMethodSender sends the GetDriverSafetyScoreMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetDriverSafetyScoreMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetDriverSafetyScoreMethodResponder handles the response to the GetDriverSafetyScoreMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetDriverSafetyScoreMethodResponder(resp *http.Response) (result DriverSafetyScoreResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetFleetVehicleMethod gets a specific vehicle.
    func (client BaseClient) GetFleetVehicleMethod(ctx context.Context) (result FleetVehicleResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetFleetVehicleMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetFleetVehicleMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetFleetVehicleMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetFleetVehicleMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetFleetVehicleMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetFleetVehicleMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetFleetVehicleMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetFleetVehicleMethodPreparer prepares the GetFleetVehicleMethod request.
        func (client BaseClient) GetFleetVehicleMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicle_id_or_external_id": autorest.Encode("path",client.VehicleIDOrExternalID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicle_id_or_external_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetFleetVehicleMethodSender sends the GetFleetVehicleMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetFleetVehicleMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetFleetVehicleMethodResponder handles the response to the GetFleetVehicleMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetFleetVehicleMethodResponder(resp *http.Response) (result FleetVehicleResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetOrganizationAddressesMethod fetch all addresses/geofences for the organization. An address contains either a
    // circle or polygon geofence describing the address boundaries.
    func (client BaseClient) GetOrganizationAddressesMethod(ctx context.Context) (result ListAddressType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetOrganizationAddressesMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetOrganizationAddressesMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationAddressesMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetOrganizationAddressesMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationAddressesMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetOrganizationAddressesMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationAddressesMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetOrganizationAddressesMethodPreparer prepares the GetOrganizationAddressesMethod request.
        func (client BaseClient) GetOrganizationAddressesMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/addresses"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetOrganizationAddressesMethodSender sends the GetOrganizationAddressesMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetOrganizationAddressesMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetOrganizationAddressesMethodResponder handles the response to the GetOrganizationAddressesMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetOrganizationAddressesMethodResponder(resp *http.Response) (result ListAddressType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetOrganizationAddressMethod fetch an address by its id.
        // Parameters:
            // addressID - ID of the address/geofence
    func (client BaseClient) GetOrganizationAddressMethod(ctx context.Context, addressID int64) (result AddressType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetOrganizationAddressMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetOrganizationAddressMethodPreparer(ctx, addressID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationAddressMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetOrganizationAddressMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationAddressMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetOrganizationAddressMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationAddressMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetOrganizationAddressMethodPreparer prepares the GetOrganizationAddressMethod request.
        func (client BaseClient) GetOrganizationAddressMethodPreparer(ctx context.Context, addressID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "addressId": autorest.Encode("path",addressID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/addresses/{addressId}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetOrganizationAddressMethodSender sends the GetOrganizationAddressMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetOrganizationAddressMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetOrganizationAddressMethodResponder handles the response to the GetOrganizationAddressMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetOrganizationAddressMethodResponder(resp *http.Response) (result AddressType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetOrganizationContactMethod fetch a contact by its id.
        // Parameters:
            // contactID - ID of the contact
    func (client BaseClient) GetOrganizationContactMethod(ctx context.Context, contactID int64) (result ContactType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetOrganizationContactMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetOrganizationContactMethodPreparer(ctx, contactID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationContactMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetOrganizationContactMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationContactMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetOrganizationContactMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetOrganizationContactMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetOrganizationContactMethodPreparer prepares the GetOrganizationContactMethod request.
        func (client BaseClient) GetOrganizationContactMethodPreparer(ctx context.Context, contactID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "contact_id": autorest.Encode("path",contactID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/contacts/{contact_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetOrganizationContactMethodSender sends the GetOrganizationContactMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetOrganizationContactMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetOrganizationContactMethodResponder handles the response to the GetOrganizationContactMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetOrganizationContactMethodResponder(resp *http.Response) (result ContactType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetTagByIDMethod fetch a tag by id.
    func (client BaseClient) GetTagByIDMethod(ctx context.Context) (result TagType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetTagByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetTagByIDMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetTagByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetTagByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetTagByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetTagByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetTagByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetTagByIDMethodPreparer prepares the GetTagByIDMethod request.
        func (client BaseClient) GetTagByIDMethodPreparer(ctx context.Context) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "tag_id": autorest.Encode("path",client.TagID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/tags/{tag_id}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetTagByIDMethodSender sends the GetTagByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetTagByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetTagByIDMethodResponder handles the response to the GetTagByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetTagByIDMethodResponder(resp *http.Response) (result TagType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetUserByIDMethod get a user.
        // Parameters:
            // userID - ID of the user.
    func (client BaseClient) GetUserByIDMethod(ctx context.Context, userID int64) (result UserType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetUserByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetUserByIDMethodPreparer(ctx, userID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetUserByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetUserByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetUserByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetUserByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetUserByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetUserByIDMethodPreparer prepares the GetUserByIDMethod request.
        func (client BaseClient) GetUserByIDMethodPreparer(ctx context.Context, userID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "userId": autorest.Encode("path",userID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/users/{userId}",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetUserByIDMethodSender sends the GetUserByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetUserByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetUserByIDMethodResponder handles the response to the GetUserByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetUserByIDMethodResponder(resp *http.Response) (result UserType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetVehicleHarshEventMethod fetch harsh event details for a vehicle.
        // Parameters:
            // vehicleID - ID of the vehicle
    func (client BaseClient) GetVehicleHarshEventMethod(ctx context.Context, vehicleID int64) (result VehicleHarshEventResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetVehicleHarshEventMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetVehicleHarshEventMethodPreparer(ctx, vehicleID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleHarshEventMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetVehicleHarshEventMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleHarshEventMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetVehicleHarshEventMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleHarshEventMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetVehicleHarshEventMethodPreparer prepares the GetVehicleHarshEventMethod request.
        func (client BaseClient) GetVehicleHarshEventMethodPreparer(ctx context.Context, vehicleID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicleId": autorest.Encode("path",vehicleID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "timestamp": autorest.Encode("query",client.Timestamp),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicleId}/safety/harsh_event",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetVehicleHarshEventMethodSender sends the GetVehicleHarshEventMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetVehicleHarshEventMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetVehicleHarshEventMethodResponder handles the response to the GetVehicleHarshEventMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetVehicleHarshEventMethodResponder(resp *http.Response) (result VehicleHarshEventResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetVehicleLocationsMethod fetch locations for a given vehicle between a start/end time. The maximum query duration
    // is one hour.
        // Parameters:
            // vehicleID - ID of the vehicle with the associated routes.
            // startMs - time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
            // endMs - time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
    func (client BaseClient) GetVehicleLocationsMethod(ctx context.Context, vehicleID int64, startMs int64, endMs int64) (result ListFleetVehicleLocationType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetVehicleLocationsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetVehicleLocationsMethodPreparer(ctx, vehicleID, startMs, endMs)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleLocationsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetVehicleLocationsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleLocationsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetVehicleLocationsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleLocationsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetVehicleLocationsMethodPreparer prepares the GetVehicleLocationsMethod request.
        func (client BaseClient) GetVehicleLocationsMethodPreparer(ctx context.Context, vehicleID int64, startMs int64, endMs int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicle_id": autorest.Encode("path",vehicleID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",endMs),
            "startMs": autorest.Encode("query",startMs),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicle_id}/locations",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetVehicleLocationsMethodSender sends the GetVehicleLocationsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetVehicleLocationsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetVehicleLocationsMethodResponder handles the response to the GetVehicleLocationsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetVehicleLocationsMethodResponder(resp *http.Response) (result ListFleetVehicleLocationType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetVehicleSafetyScoreMethod fetch the safety score for the vehicle.
        // Parameters:
            // vehicleID - ID of the vehicle
    func (client BaseClient) GetVehicleSafetyScoreMethod(ctx context.Context, vehicleID int64) (result VehicleSafetyScoreResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetVehicleSafetyScoreMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetVehicleSafetyScoreMethodPreparer(ctx, vehicleID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleSafetyScoreMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetVehicleSafetyScoreMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleSafetyScoreMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetVehicleSafetyScoreMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleSafetyScoreMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetVehicleSafetyScoreMethodPreparer prepares the GetVehicleSafetyScoreMethod request.
        func (client BaseClient) GetVehicleSafetyScoreMethodPreparer(ctx context.Context, vehicleID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicleId": autorest.Encode("path",vehicleID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",client.EndMs),
            "startMs": autorest.Encode("query",client.StartMs),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicleId}/safety/score",pathParameters),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetVehicleSafetyScoreMethodSender sends the GetVehicleSafetyScoreMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetVehicleSafetyScoreMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetVehicleSafetyScoreMethodResponder handles the response to the GetVehicleSafetyScoreMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetVehicleSafetyScoreMethodResponder(resp *http.Response) (result VehicleSafetyScoreResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetVehiclesLocationsMethod fetch locations for a given vehicle between a start/end time. The maximum query duration
    // is 30 minutes.
        // Parameters:
            // startMs - time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
            // endMs - time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
    func (client BaseClient) GetVehiclesLocationsMethod(ctx context.Context, startMs int32, endMs int32) (result ListFleetVehiclesLocationsItemType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetVehiclesLocationsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetVehiclesLocationsMethodPreparer(ctx, startMs, endMs)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehiclesLocationsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetVehiclesLocationsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehiclesLocationsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetVehiclesLocationsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehiclesLocationsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetVehiclesLocationsMethodPreparer prepares the GetVehiclesLocationsMethod request.
        func (client BaseClient) GetVehiclesLocationsMethodPreparer(ctx context.Context, startMs int32, endMs int32) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",endMs),
            "startMs": autorest.Encode("query",startMs),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/vehicles/locations"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetVehiclesLocationsMethodSender sends the GetVehiclesLocationsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetVehiclesLocationsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetVehiclesLocationsMethodResponder handles the response to the GetVehiclesLocationsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetVehiclesLocationsMethodResponder(resp *http.Response) (result ListFleetVehiclesLocationsItemType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // GetVehicleStatsMethod fetch engine state and aux input data for all vehicles in the group between a start/end time.
    // Data returned may be affected by device connectivity and processing time.
        // Parameters:
            // startMs - time in Unix epoch milliseconds for the start of the query.
            // endMs - time in Unix epoch milliseconds for the end of the query.
            // series - comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this
            // parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
            // tagIds - comma-separated list of tag ids. Example: tagIds=1,2,3
    func (client BaseClient) GetVehicleStatsMethod(ctx context.Context, startMs int32, endMs int32, series string, tagIds string) (result GetVehicleStatsOKResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.GetVehicleStatsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.GetVehicleStatsMethodPreparer(ctx, startMs, endMs, series, tagIds)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleStatsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.GetVehicleStatsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleStatsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.GetVehicleStatsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "GetVehicleStatsMethod", resp, "Failure responding to request")
                }

        return
        }

        // GetVehicleStatsMethodPreparer prepares the GetVehicleStatsMethod request.
        func (client BaseClient) GetVehicleStatsMethodPreparer(ctx context.Context, startMs int32, endMs int32, series string, tagIds string) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            "endMs": autorest.Encode("query",endMs),
            "startMs": autorest.Encode("query",startMs),
            }
                if len(string(series)) > 0 {
                queryParameters["series"] = autorest.Encode("query",series)
                }
                if len(tagIds) > 0 {
                queryParameters["tagIds"] = autorest.Encode("query",tagIds)
                }
                if len(client.StartingAfter) > 0 {
                queryParameters["startingAfter"] = autorest.Encode("query",client.StartingAfter)
                }
                if len(client.EndingBefore) > 0 {
                queryParameters["endingBefore"] = autorest.Encode("query",client.EndingBefore)
                }
                if client.Limit != nil {
                queryParameters["limit"] = autorest.Encode("query",*client.Limit)
                }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/fleet/vehicles/stats"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // GetVehicleStatsMethodSender sends the GetVehicleStatsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) GetVehicleStatsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // GetVehicleStatsMethodResponder handles the response to the GetVehicleStatsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) GetVehicleStatsMethodResponder(resp *http.Response) (result GetVehicleStatsOKResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // ListContactsMethod fetch all contacts for the organization.
    func (client BaseClient) ListContactsMethod(ctx context.Context) (result ListContactType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.ListContactsMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.ListContactsMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "ListContactsMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.ListContactsMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "ListContactsMethod", resp, "Failure sending request")
                return
                }

                result, err = client.ListContactsMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "ListContactsMethod", resp, "Failure responding to request")
                }

        return
        }

        // ListContactsMethodPreparer prepares the ListContactsMethod request.
        func (client BaseClient) ListContactsMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/contacts"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // ListContactsMethodSender sends the ListContactsMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) ListContactsMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // ListContactsMethodResponder handles the response to the ListContactsMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) ListContactsMethodResponder(resp *http.Response) (result ListContactType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // ListUserRolesMethod get all roles in the organization.
    func (client BaseClient) ListUserRolesMethod(ctx context.Context) (result ListUserRoleType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.ListUserRolesMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.ListUserRolesMethodPreparer(ctx)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "ListUserRolesMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.ListUserRolesMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "ListUserRolesMethod", resp, "Failure sending request")
                return
                }

                result, err = client.ListUserRolesMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "ListUserRolesMethod", resp, "Failure responding to request")
                }

        return
        }

        // ListUserRolesMethodPreparer prepares the ListUserRolesMethod request.
        func (client BaseClient) ListUserRolesMethodPreparer(ctx context.Context) (*http.Request, error) {
                    queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsGet(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPath("/user_roles"),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // ListUserRolesMethodSender sends the ListUserRolesMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) ListUserRolesMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // ListUserRolesMethodResponder handles the response to the ListUserRolesMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) ListUserRolesMethodResponder(resp *http.Response) (result ListUserRoleType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result.Value),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // ModifyTagByIDMethod add or delete specific members from a tag, or modify the name of a tag.
    func (client BaseClient) ModifyTagByIDMethod(ctx context.Context, tagModifyParams TagModifyType) (result TagType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.ModifyTagByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.ModifyTagByIDMethodPreparer(ctx, tagModifyParams)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "ModifyTagByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.ModifyTagByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "ModifyTagByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.ModifyTagByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "ModifyTagByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // ModifyTagByIDMethodPreparer prepares the ModifyTagByIDMethod request.
        func (client BaseClient) ModifyTagByIDMethodPreparer(ctx context.Context, tagModifyParams TagModifyType) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "tag_id": autorest.Encode("path",client.TagID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPatch(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/tags/{tag_id}",pathParameters),
        autorest.WithJSON(tagModifyParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // ModifyTagByIDMethodSender sends the ModifyTagByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) ModifyTagByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // ModifyTagByIDMethodResponder handles the response to the ModifyTagByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) ModifyTagByIDMethodResponder(resp *http.Response) (result TagType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // PatchFleetVehicleMethod updates the specified vehicle using JSON merge patch format. See IETF RFC 7396:
    // https://tools.ietf.org/html/rfc7396.
    func (client BaseClient) PatchFleetVehicleMethod(ctx context.Context, data DataType) (result FleetVehicleResponseType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.PatchFleetVehicleMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.PatchFleetVehicleMethodPreparer(ctx, data)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "PatchFleetVehicleMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.PatchFleetVehicleMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "PatchFleetVehicleMethod", resp, "Failure sending request")
                return
                }

                result, err = client.PatchFleetVehicleMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "PatchFleetVehicleMethod", resp, "Failure responding to request")
                }

        return
        }

        // PatchFleetVehicleMethodPreparer prepares the PatchFleetVehicleMethod request.
        func (client BaseClient) PatchFleetVehicleMethodPreparer(ctx context.Context, data DataType) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "vehicle_id_or_external_id": autorest.Encode("path",client.VehicleIDOrExternalID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPatch(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/vehicles/{vehicle_id_or_external_id}",pathParameters),
        autorest.WithJSON(data),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // PatchFleetVehicleMethodSender sends the PatchFleetVehicleMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) PatchFleetVehicleMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // PatchFleetVehicleMethodResponder handles the response to the PatchFleetVehicleMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) PatchFleetVehicleMethodResponder(resp *http.Response) (result FleetVehicleResponseType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // ReactivateDriverByIDMethod reactivate the inactive driver having id.
        // Parameters:
            // reactivateDriverParam - driver reactivation body
    func (client BaseClient) ReactivateDriverByIDMethod(ctx context.Context, reactivateDriverParam ReactivateDriverParamType) (result CurrentDriverType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.ReactivateDriverByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: reactivateDriverParam,
                 Constraints: []validation.Constraint{	{Target: "reactivateDriverParam.Reactivate", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "ReactivateDriverByIDMethod", err.Error())
                }

                    req, err := client.ReactivateDriverByIDMethodPreparer(ctx, reactivateDriverParam)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "ReactivateDriverByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.ReactivateDriverByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "ReactivateDriverByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.ReactivateDriverByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "ReactivateDriverByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // ReactivateDriverByIDMethodPreparer prepares the ReactivateDriverByIDMethod request.
        func (client BaseClient) ReactivateDriverByIDMethodPreparer(ctx context.Context, reactivateDriverParam ReactivateDriverParamType) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "driver_id_or_external_id": autorest.Encode("path",client.DriverIDOrExternalID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPut(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/drivers/inactive/{driver_id_or_external_id}",pathParameters),
        autorest.WithJSON(reactivateDriverParam),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // ReactivateDriverByIDMethodSender sends the ReactivateDriverByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) ReactivateDriverByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // ReactivateDriverByIDMethodResponder handles the response to the ReactivateDriverByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) ReactivateDriverByIDMethodResponder(resp *http.Response) (result CurrentDriverType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // UpdateDispatchRouteByIDMethod update a dispatch route and its associated jobs.
        // Parameters:
            // routeID - ID of the dispatch route.
    func (client BaseClient) UpdateDispatchRouteByIDMethod(ctx context.Context, updateDispatchRouteParams DispatchRouteType, routeID int64) (result DispatchRouteType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.UpdateDispatchRouteByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
                if err := validation.Validate([]validation.Validation{
                { TargetValue: updateDispatchRouteParams,
                 Constraints: []validation.Constraint{	{Target: "updateDispatchRouteParams.DispatchJobs", Name: validation.Null, Rule: true, Chain: nil },
                	{Target: "updateDispatchRouteParams.ID", Name: validation.Null, Rule: true, Chain: nil }}}}); err != nil {
                return result, validation.NewError(".BaseClient", "UpdateDispatchRouteByIDMethod", err.Error())
                }

                    req, err := client.UpdateDispatchRouteByIDMethodPreparer(ctx, updateDispatchRouteParams, routeID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateDispatchRouteByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.UpdateDispatchRouteByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateDispatchRouteByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.UpdateDispatchRouteByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateDispatchRouteByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // UpdateDispatchRouteByIDMethodPreparer prepares the UpdateDispatchRouteByIDMethod request.
        func (client BaseClient) UpdateDispatchRouteByIDMethodPreparer(ctx context.Context, updateDispatchRouteParams DispatchRouteType, routeID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "route_id": autorest.Encode("path",routeID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPut(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/fleet/dispatch/routes/{route_id}",pathParameters),
        autorest.WithJSON(updateDispatchRouteParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // UpdateDispatchRouteByIDMethodSender sends the UpdateDispatchRouteByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) UpdateDispatchRouteByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // UpdateDispatchRouteByIDMethodResponder handles the response to the UpdateDispatchRouteByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) UpdateDispatchRouteByIDMethodResponder(resp *http.Response) (result DispatchRouteType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

    // UpdateOrganizationAddressMethod update the name, formatted address, geofence, notes, or tag and contact Ids for an
    // address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs
    // passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty
    // string.
        // Parameters:
            // address - update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the
            // update will change the type of geofence accordingly.
            // addressID - ID of the address/geofence
    func (client BaseClient) UpdateOrganizationAddressMethod(ctx context.Context, address AddressModelType, addressID int64) (result autorest.Response, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.UpdateOrganizationAddressMethod")
            defer func() {
                sc := -1
                if result.Response != nil {
                    sc = result.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.UpdateOrganizationAddressMethodPreparer(ctx, address, addressID)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateOrganizationAddressMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.UpdateOrganizationAddressMethodSender(req)
                if err != nil {
                result.Response = resp
                err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateOrganizationAddressMethod", resp, "Failure sending request")
                return
                }

                result, err = client.UpdateOrganizationAddressMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateOrganizationAddressMethod", resp, "Failure responding to request")
                }

        return
        }

        // UpdateOrganizationAddressMethodPreparer prepares the UpdateOrganizationAddressMethod request.
        func (client BaseClient) UpdateOrganizationAddressMethodPreparer(ctx context.Context, address AddressModelType, addressID int64) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "addressId": autorest.Encode("path",addressID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPatch(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/addresses/{addressId}",pathParameters),
        autorest.WithJSON(address),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // UpdateOrganizationAddressMethodSender sends the UpdateOrganizationAddressMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) UpdateOrganizationAddressMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // UpdateOrganizationAddressMethodResponder handles the response to the UpdateOrganizationAddressMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) UpdateOrganizationAddressMethodResponder(resp *http.Response) (result autorest.Response, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByClosing())
        result.Response = resp
            return
        }

    // UpdateTagByIDMethod update a tag with a new name and new members. This API call would replace all old members of a
    // tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH
    // endpoint.
    func (client BaseClient) UpdateTagByIDMethod(ctx context.Context, updateTagParams TagUpdateType) (result TagType, err error) {
        if tracing.IsEnabled() {
            ctx = tracing.StartSpan(ctx, fqdn + "/BaseClient.UpdateTagByIDMethod")
            defer func() {
                sc := -1
                if result.Response.Response != nil {
                    sc = result.Response.Response.StatusCode
                }
                tracing.EndSpan(ctx, sc, err)
            }()
        }
            req, err := client.UpdateTagByIDMethodPreparer(ctx, updateTagParams)
        if err != nil {
        err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateTagByIDMethod", nil , "Failure preparing request")
        return
        }

                resp, err := client.UpdateTagByIDMethodSender(req)
                if err != nil {
                result.Response = autorest.Response{Response: resp}
                err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateTagByIDMethod", resp, "Failure sending request")
                return
                }

                result, err = client.UpdateTagByIDMethodResponder(resp)
                if err != nil {
                err = autorest.NewErrorWithError(err, ".BaseClient", "UpdateTagByIDMethod", resp, "Failure responding to request")
                }

        return
        }

        // UpdateTagByIDMethodPreparer prepares the UpdateTagByIDMethod request.
        func (client BaseClient) UpdateTagByIDMethodPreparer(ctx context.Context, updateTagParams TagUpdateType) (*http.Request, error) {
                pathParameters := map[string]interface{} {
                "tag_id": autorest.Encode("path",client.TagID),
                }

                        queryParameters := map[string]interface{} {
            "access_token": autorest.Encode("query",client.AccessToken),
            }

        preparer := autorest.CreatePreparer(
        autorest.AsContentType("application/json; charset=utf-8"),
        autorest.AsPut(),
        autorest.WithBaseURL(client.BaseURI),
        autorest.WithPathParameters("/tags/{tag_id}",pathParameters),
        autorest.WithJSON(updateTagParams),
        autorest.WithQueryParameters(queryParameters))
        return preparer.Prepare((&http.Request{}).WithContext(ctx))
        }

        // UpdateTagByIDMethodSender sends the UpdateTagByIDMethod request. The method will close the
        // http.Response Body if it receives an error.
        func (client BaseClient) UpdateTagByIDMethodSender(req *http.Request) (*http.Response, error) {
                return autorest.SendWithSender(client, req,
                autorest.DoRetryForStatusCodes(client.RetryAttempts, client.RetryDuration, autorest.StatusCodesForRetry...))
                }

    // UpdateTagByIDMethodResponder handles the response to the UpdateTagByIDMethod request. The method always
    // closes the http.Response Body.
    func (client BaseClient) UpdateTagByIDMethodResponder(resp *http.Response) (result TagType, err error) {
        err = autorest.Respond(
        resp,
        client.ByInspecting(),
        azure.WithErrorUnlessStatusCode(http.StatusOK),
        autorest.ByUnmarshallingJSON(&result),
        autorest.ByClosing())
        result.Response = autorest.Response{Response: resp}
            return
        }

