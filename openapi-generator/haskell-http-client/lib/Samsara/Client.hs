{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.Client
-}

{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE DeriveFunctor #-}
{-# LANGUAGE DeriveFoldable #-}
{-# LANGUAGE DeriveTraversable #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.Client where

import Samsara.Core
import Samsara.Logging
import Samsara.MimeTypes

import qualified Control.Exception.Safe as E
import qualified Control.Monad.IO.Class as P
import qualified Control.Monad as P
import qualified Data.Aeson.Types as A
import qualified Data.ByteString.Char8 as BC
import qualified Data.ByteString.Lazy as BL
import qualified Data.ByteString.Lazy.Char8 as BCL
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Network.HTTP.Client as NH
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Function ((&))
import Data.Monoid ((<>))
import Data.Text (Text)
import GHC.Exts (IsString(..))

-- * Dispatch

-- ** Lbs

-- | send a request returning the raw http response
dispatchLbs
  :: (Produces req accept, MimeType contentType)
  => NH.Manager -- ^ http-client Connection manager
  -> SamsaraConfig -- ^ config
  -> SamsaraRequest req contentType res accept -- ^ request
  -> IO (NH.Response BCL.ByteString) -- ^ response
dispatchLbs manager config request  = do
  initReq <- _toInitRequest config request
  dispatchInitUnsafe manager config initReq

-- ** Mime

-- | pair of decoded http body and http response
data MimeResult res =
  MimeResult { mimeResult :: Either MimeError res -- ^ decoded http body
             , mimeResultResponse :: NH.Response BCL.ByteString -- ^ http response 
             }
  deriving (Show, Functor, Foldable, Traversable)

-- | pair of unrender/parser error and http response
data MimeError =
  MimeError {
    mimeError :: String -- ^ unrender/parser error
  , mimeErrorResponse :: NH.Response BCL.ByteString -- ^ http response 
  } deriving (Eq, Show)

-- | send a request returning the 'MimeResult'
dispatchMime
  :: forall req contentType res accept. (Produces req accept, MimeUnrender accept res, MimeType contentType)
  => NH.Manager -- ^ http-client Connection manager
  -> SamsaraConfig -- ^ config
  -> SamsaraRequest req contentType res accept -- ^ request
  -> IO (MimeResult res) -- ^ response
dispatchMime manager config request = do
  httpResponse <- dispatchLbs manager config request
  let statusCode = NH.statusCode . NH.responseStatus $ httpResponse
  parsedResult <-
    runConfigLogWithExceptions "Client" config $
    do if (statusCode >= 400 && statusCode < 600)
         then do
           let s = "error statusCode: " ++ show statusCode
           _log "Client" levelError (T.pack s)
           pure (Left (MimeError s httpResponse))
         else case mimeUnrender (P.Proxy :: P.Proxy accept) (NH.responseBody httpResponse) of
           Left s -> do
             _log "Client" levelError (T.pack s)
             pure (Left (MimeError s httpResponse))
           Right r -> pure (Right r)
  return (MimeResult parsedResult httpResponse)

-- | like 'dispatchMime', but only returns the decoded http body
dispatchMime'
  :: (Produces req accept, MimeUnrender accept res, MimeType contentType)
  => NH.Manager -- ^ http-client Connection manager
  -> SamsaraConfig -- ^ config
  -> SamsaraRequest req contentType res accept -- ^ request
  -> IO (Either MimeError res) -- ^ response
dispatchMime' manager config request  = do
    MimeResult parsedResult _ <- dispatchMime manager config request
    return parsedResult

-- ** Unsafe

-- | like 'dispatchReqLbs', but does not validate the operation is a 'Producer' of the "accept" 'MimeType'.  (Useful if the server's response is undocumented)
dispatchLbsUnsafe
  :: (MimeType accept, MimeType contentType)
  => NH.Manager -- ^ http-client Connection manager
  -> SamsaraConfig -- ^ config
  -> SamsaraRequest req contentType res accept -- ^ request
  -> IO (NH.Response BCL.ByteString) -- ^ response
dispatchLbsUnsafe manager config request  = do
  initReq <- _toInitRequest config request
  dispatchInitUnsafe manager config initReq

-- | dispatch an InitRequest
dispatchInitUnsafe
  :: NH.Manager -- ^ http-client Connection manager
  -> SamsaraConfig -- ^ config
  -> InitRequest req contentType res accept -- ^ init request
  -> IO (NH.Response BCL.ByteString) -- ^ response
dispatchInitUnsafe manager config (InitRequest req) = do
  runConfigLogWithExceptions src config $
    do _log src levelInfo requestLogMsg
       _log src levelDebug requestDbgLogMsg
       res <- P.liftIO $ NH.httpLbs req manager
       _log src levelInfo (responseLogMsg res)
       _log src levelDebug ((T.pack . show) res)
       return res
  where
    src = "Client"
    endpoint =
      T.pack $
      BC.unpack $
      NH.method req <> " " <> NH.host req <> NH.path req <> NH.queryString req
    requestLogMsg = "REQ:" <> endpoint
    requestDbgLogMsg =
      "Headers=" <> (T.pack . show) (NH.requestHeaders req) <> " Body=" <>
      (case NH.requestBody req of
         NH.RequestBodyLBS xs -> T.decodeUtf8 (BL.toStrict xs)
         _ -> "<RequestBody>")
    responseStatusCode = (T.pack . show) . NH.statusCode . NH.responseStatus
    responseLogMsg res =
      "RES:statusCode=" <> responseStatusCode res <> " (" <> endpoint <> ")"

-- * InitRequest

-- | wraps an http-client 'Request' with request/response type parameters
newtype InitRequest req contentType res accept = InitRequest
  { unInitRequest :: NH.Request
  } deriving (Show)

-- |  Build an http-client 'Request' record from the supplied config and request
_toInitRequest
  :: (MimeType accept, MimeType contentType)
  => SamsaraConfig -- ^ config
  -> SamsaraRequest req contentType res accept -- ^ request
  -> IO (InitRequest req contentType res accept) -- ^ initialized request
_toInitRequest config req0  = 
  runConfigLogWithExceptions "Client" config $ do
    parsedReq <- P.liftIO $ NH.parseRequest $ BCL.unpack $ BCL.append (configHost config) (BCL.concat (rUrlPath req0))
    req1 <- P.liftIO $ _applyAuthMethods req0 config
    P.when
        (configValidateAuthMethods config && (not . null . rAuthTypes) req1)
        (E.throw $ AuthMethodException $ "AuthMethod not configured: " <> (show . head . rAuthTypes) req1)
    let req2 = req1 & _setContentTypeHeader & _setAcceptHeader
        reqHeaders = ("User-Agent", WH.toHeader (configUserAgent config)) : paramsHeaders (rParams req2)
        reqQuery = NH.renderQuery True (paramsQuery (rParams req2))
        pReq = parsedReq { NH.method = (rMethod req2)
                        , NH.requestHeaders = reqHeaders
                        , NH.queryString = reqQuery
                        }
    outReq <- case paramsBody (rParams req2) of
        ParamBodyNone -> pure (pReq { NH.requestBody = mempty })
        ParamBodyB bs -> pure (pReq { NH.requestBody = NH.RequestBodyBS bs })
        ParamBodyBL bl -> pure (pReq { NH.requestBody = NH.RequestBodyLBS bl })
        ParamBodyFormUrlEncoded form -> pure (pReq { NH.requestBody = NH.RequestBodyLBS (WH.urlEncodeForm form) })
        ParamBodyMultipartFormData parts -> NH.formDataBody parts pReq

    pure (InitRequest outReq)

-- | modify the underlying Request
modifyInitRequest :: InitRequest req contentType res accept -> (NH.Request -> NH.Request) -> InitRequest req contentType res accept
modifyInitRequest (InitRequest req) f = InitRequest (f req)

-- | modify the underlying Request (monadic)
modifyInitRequestM :: Monad m => InitRequest req contentType res accept -> (NH.Request -> m NH.Request) -> m (InitRequest req contentType res accept)
modifyInitRequestM (InitRequest req) f = fmap InitRequest (f req)

-- ** Logging 

-- | Run a block using the configured logger instance
runConfigLog
  :: P.MonadIO m
  => SamsaraConfig -> LogExec m
runConfigLog config = configLogExecWithContext config (configLogContext config)

-- | Run a block using the configured logger instance (logs exceptions)
runConfigLogWithExceptions
  :: (E.MonadCatch m, P.MonadIO m)
  => T.Text -> SamsaraConfig -> LogExec m
runConfigLogWithExceptions src config = runConfigLog config . logExceptions src
