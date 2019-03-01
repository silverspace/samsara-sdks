// tslint:disable
/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Observable, of } from 'rxjs';
import { ajax, AjaxResponse } from 'rxjs/ajax';
import { map, concatMap } from 'rxjs/operators';

export const BASE_PATH = 'https://api.samsara.com/v1'.replace(/\/+$/, '');

export interface ConfigurationParameters {
    basePath?: string; // override base path
    middleware?: Middleware[]; // middleware to apply before/after rxjs requests
    username?: string; // parameter for basic security
    password?: string; // parameter for basic security
    apiKey?: string | ((name: string) => string); // parameter for apiKey security
    accessToken?: string | ((name: string, scopes?: string[]) => string); // parameter for oauth2 security
}

export class Configuration {
    constructor(private configuration: ConfigurationParameters = {}) {}

    get basePath(): string {
        return this.configuration.basePath || BASE_PATH;
    }

    get middleware(): Middleware[] {
        return this.configuration.middleware || [];
    }

    get username(): string | undefined {
        return this.configuration.username;
    }

    get password(): string | undefined {
        return this.configuration.password;
    }

    get apiKey(): ((name: string) => string) | undefined {
        const apiKey = this.configuration.apiKey;
        if (apiKey) {
            return typeof apiKey === 'function' ? apiKey : () => apiKey;
        }
        return undefined;
    }

    get accessToken(): ((name: string, scopes?: string[]) => string) | undefined {
        const accessToken = this.configuration.accessToken;
        if (accessToken) {
            return typeof accessToken === 'function' ? accessToken : () => accessToken;
        }
        return undefined;
    }
}

/**
 * This is the base class for all generated API classes.
 */
export class BaseAPI {
    private middleware: Middleware[];

    constructor(protected configuration = new Configuration()) {
        this.middleware = configuration.middleware;
    }

    withMiddleware<T extends BaseAPI>(this: T, ...middlewares: Middleware[]) {
        const next = this.clone<T>();
        next.middleware = next.middleware.concat(...middlewares);
        return next;
    }

    withPreMiddleware<T extends BaseAPI>(this: T, ...preMiddlewares: Array<Middleware['pre']>) {
        const middlewares = preMiddlewares.map((pre) => ({ pre }));
        return this.withMiddleware<T>(...middlewares);
    }

    withPostMiddleware<T extends BaseAPI>(this: T, ...postMiddlewares: Array<Middleware['post']>) {
        const middlewares = postMiddlewares.map((post) => ({ post }));
        return this.withMiddleware<T>(...middlewares);
    }

    protected request<T>(context: RequestOpts): Observable<T> {
        return this.rxjsRequest(this.createRequestArgs(context)).pipe(
            map((res) => {
                if (res.status >= 200 && res.status < 300) {
                    return res.response as T;
                }
                throw res;
            })
        );
    }

    private createRequestArgs(context: RequestOpts): RequestArgs {
        let url = this.configuration.basePath + context.path;
        if (context.query !== undefined && Object.keys(context.query).length !== 0) {
            // only add the querystring to the URL if there are query parameters.
            // this is done to avoid urls ending with a '?' character which buggy webservers
            // do not handle correctly sometimes.
            url += '?' + querystring(context.query);
        }
        const body = context.body instanceof FormData ? context.body : JSON.stringify(context.body);
        const options = {
            method: context.method,
            headers: context.headers,
            body,
        };
        return { url, options };
    }

    private rxjsRequest(params: RequestContext): Observable<AjaxResponse> {
        const preMiddlewares = this.middleware && this.middleware.filter((item) => item.pre);
        const postMiddlewares = this.middleware && this.middleware.filter((item) => item.post);

        return of(params).pipe(
            map((args) => {
                if (preMiddlewares) {
                    preMiddlewares.forEach((mw) => (args = mw.pre({ ...args })));
                }
                return args;
            }),
            concatMap((args) =>
                ajax({ url: args.url, ...args.options }).pipe(
                    map((response) => {
                        if (postMiddlewares) {
                            postMiddlewares.forEach((mw) => (response = mw.post({ ...params, response })));
                        }
                        return response;
                    })
                )
            )
        );
    }

    /**
     * Create a shallow clone of `this` by constructing a new instance
     * and then shallow cloning data members.
     */
    private clone<T extends BaseAPI>(this: T): T {
        const constructor = this.constructor as any;
        const next = new constructor(this.configuration);
        next.middleware = this.middleware.slice();
        return next;
    }
}

export class RequiredError extends Error {
    name: 'RequiredError' = 'RequiredError';
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}

export const COLLECTION_FORMATS = {
    csv: ',',
    ssv: ' ',
    tsv: '\t',
    pipes: '|',
};

export type Json = any;
export type HttpMethod = 'GET' | 'POST' | 'PUT' | 'PATCH' | 'DELETE' | 'OPTIONS';
export type HttpHeaders = { [key: string]: string };
export type HttpQuery = { [key: string]: string | number | null | boolean | Array<string | number | null | boolean> };
export type HttpBody = Json | FormData;
export type ModelPropertyNaming = 'camelCase' | 'snake_case' | 'PascalCase' | 'original';

export interface RequestArgs {
    url: string;
    options: RequestInit;
}

export interface RequestOpts {
    path: string;
    method: HttpMethod;
    headers: HttpHeaders;
    query?: HttpQuery;
    body?: HttpBody;
}

export function querystring(params: HttpQuery): string {
    return Object.keys(params)
        .map((key) => {
            const value = params[key];
            if (value instanceof Array) {
                return value.map((val) => `${encodeURIComponent(key)}=${encodeURIComponent(String(val))}`)
                    .join('&');
            }
            return `${encodeURIComponent(key)}=${encodeURIComponent(String(value))}`;
        })
        .join('&');
}

export interface RequestContext extends RequestArgs {}
export interface ResponseContext extends RequestArgs {
    response: AjaxResponse;
}

export interface Middleware {
    pre?(context: RequestContext): RequestArgs;
    post?(context: ResponseContext): AjaxResponse;
}
