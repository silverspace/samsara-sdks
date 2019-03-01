{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.Core
-}

{-# LANGUAGE DeriveDataTypeable #-}
{-# LANGUAGE ExistentialQuantification #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE TupleSections #-}
{-# LANGUAGE TypeFamilies #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds #-}

module Samsara.Core where

import Samsara.MimeTypes
import Samsara.Logging

import qualified Control.Arrow as P (left)
import qualified Control.DeepSeq as NF
import qualified Control.Exception.Safe as E
import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Base64.Lazy as BL64
import qualified Data.ByteString.Builder as BB
import qualified Data.ByteString.Char8 as BC
import qualified Data.ByteString.Lazy as BL
import qualified Data.ByteString.Lazy.Char8 as BCL
import qualified Data.CaseInsensitive as CI
import qualified Data.Data as P (Data, Typeable, TypeRep, typeRep)
import qualified Data.Foldable as P
import qualified Data.Ix as P
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Time as TI
import qualified Data.Time.ISO8601 as TI
import qualified GHC.Base as P (Alternative)
import qualified Lens.Micro as L
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Types as NH
import qualified Prelude as P
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH
import qualified Text.Printf as T

import Control.Applicative ((<|>))
import Control.Applicative (Alternative)
import Data.Function ((&))
import Data.Foldable(foldlM)
import Data.Monoid ((<>))
import Data.Text (Text)
import Prelude (($), (.), (<$>), (<*>), Maybe(..), Bool(..), Char, String, fmap, mempty, pure, return, show, IO, Monad, Functor)

-- * SamsaraConfig

-- | 
data SamsaraConfig = SamsaraConfig
  { configHost  :: BCL.ByteString -- ^ host supplied in the Request
  , configUserAgent :: Text -- ^ user-agent supplied in the Request
  , configLogExecWithContext :: LogExecWithContext -- ^ Run a block using a Logger instance
  , configLogContext :: LogContext -- ^ Configures the logger
  , configAuthMethods :: [AnyAuthMethod] -- ^ List of configured auth methods
  , configValidateAuthMethods :: Bool -- ^ throw exceptions if auth methods are not configured
  }

-- | display the config
instance P.Show SamsaraConfig where
  show c =
    T.printf
      "{ configHost = %v, configUserAgent = %v, ..}"
      (show (configHost c))
      (show (configUserAgent c))

-- | constructs a default SamsaraConfig
--
-- configHost:
--
-- @https://api.samsara.com/v1@
--
-- configUserAgent:
--
-- @"samsara/0.1.0.0"@
--
newConfig :: IO SamsaraConfig
newConfig = do
    logCxt <- initLogContext
    return $ SamsaraConfig
        { configHost = "https://api.samsara.com/v1"
        , configUserAgent = "samsara/0.1.0.0"
        , configLogExecWithContext = runDefaultLogExecWithContext
        , configLogContext = logCxt
        , configAuthMethods = []
        , configValidateAuthMethods = True
        }  

-- | updates config use AuthMethod on matching requests
addAuthMethod :: AuthMethod auth => SamsaraConfig -> auth -> SamsaraConfig
addAuthMethod config@SamsaraConfig {configAuthMethods = as} a =
  config { configAuthMethods = AnyAuthMethod a : as}

-- | updates the config to use stdout logging
withStdoutLogging :: SamsaraConfig -> IO SamsaraConfig
withStdoutLogging p = do
    logCxt <- stdoutLoggingContext (configLogContext p)
    return $ p { configLogExecWithContext = stdoutLoggingExec, configLogContext = logCxt }

-- | updates the config to use stderr logging
withStderrLogging :: SamsaraConfig -> IO SamsaraConfig
withStderrLogging p = do
    logCxt <- stderrLoggingContext (configLogContext p)
    return $ p { configLogExecWithContext = stderrLoggingExec, configLogContext = logCxt }

-- | updates the config to disable logging
withNoLogging :: SamsaraConfig -> SamsaraConfig
withNoLogging p = p { configLogExecWithContext =  runNullLogExec}
 
-- * SamsaraRequest

-- | Represents a request.
--
--   Type Variables:
--
--   * req - request operation
--   * contentType - 'MimeType' associated with request body
--   * res - response model
--   * accept - 'MimeType' associated with response body
data SamsaraRequest req contentType res accept = SamsaraRequest
  { rMethod  :: NH.Method   -- ^ Method of SamsaraRequest
  , rUrlPath :: [BCL.ByteString] -- ^ Endpoint of SamsaraRequest
  , rParams   :: Params -- ^ params of SamsaraRequest
  , rAuthTypes :: [P.TypeRep] -- ^ types of auth methods
  }
  deriving (P.Show)

-- | 'rMethod' Lens
rMethodL :: Lens_' (SamsaraRequest req contentType res accept) NH.Method
rMethodL f SamsaraRequest{..} = (\rMethod -> SamsaraRequest { rMethod, ..} ) <$> f rMethod
{-# INLINE rMethodL #-}

-- | 'rUrlPath' Lens
rUrlPathL :: Lens_' (SamsaraRequest req contentType res accept) [BCL.ByteString]
rUrlPathL f SamsaraRequest{..} = (\rUrlPath -> SamsaraRequest { rUrlPath, ..} ) <$> f rUrlPath
{-# INLINE rUrlPathL #-}

-- | 'rParams' Lens
rParamsL :: Lens_' (SamsaraRequest req contentType res accept) Params
rParamsL f SamsaraRequest{..} = (\rParams -> SamsaraRequest { rParams, ..} ) <$> f rParams
{-# INLINE rParamsL #-}

-- | 'rParams' Lens
rAuthTypesL :: Lens_' (SamsaraRequest req contentType res accept) [P.TypeRep]
rAuthTypesL f SamsaraRequest{..} = (\rAuthTypes -> SamsaraRequest { rAuthTypes, ..} ) <$> f rAuthTypes
{-# INLINE rAuthTypesL #-}

-- * HasBodyParam

-- | Designates the body parameter of a request
class HasBodyParam req param where
  setBodyParam :: forall contentType res accept. (Consumes req contentType, MimeRender contentType param) => SamsaraRequest req contentType res accept -> param -> SamsaraRequest req contentType res accept
  setBodyParam req xs =
    req `_setBodyLBS` mimeRender (P.Proxy :: P.Proxy contentType) xs & _setContentTypeHeader

-- * HasOptionalParam

-- | Designates the optional parameters of a request
class HasOptionalParam req param where
  {-# MINIMAL applyOptionalParam | (-&-) #-}

  -- | Apply an optional parameter to a request
  applyOptionalParam :: SamsaraRequest req contentType res accept -> param -> SamsaraRequest req contentType res accept
  applyOptionalParam = (-&-)
  {-# INLINE applyOptionalParam #-}

  -- | infix operator \/ alias for 'addOptionalParam'
  (-&-) :: SamsaraRequest req contentType res accept -> param -> SamsaraRequest req contentType res accept
  (-&-) = applyOptionalParam
  {-# INLINE (-&-) #-}

infixl 2 -&-

-- | Request Params
data Params = Params
  { paramsQuery :: NH.Query
  , paramsHeaders :: NH.RequestHeaders
  , paramsBody :: ParamBody
  }
  deriving (P.Show)

-- | 'paramsQuery' Lens
paramsQueryL :: Lens_' Params NH.Query
paramsQueryL f Params{..} = (\paramsQuery -> Params { paramsQuery, ..} ) <$> f paramsQuery
{-# INLINE paramsQueryL #-}

-- | 'paramsHeaders' Lens
paramsHeadersL :: Lens_' Params NH.RequestHeaders
paramsHeadersL f Params{..} = (\paramsHeaders -> Params { paramsHeaders, ..} ) <$> f paramsHeaders
{-# INLINE paramsHeadersL #-}

-- | 'paramsBody' Lens
paramsBodyL :: Lens_' Params ParamBody
paramsBodyL f Params{..} = (\paramsBody -> Params { paramsBody, ..} ) <$> f paramsBody
{-# INLINE paramsBodyL #-}

-- | Request Body
data ParamBody
  = ParamBodyNone
  | ParamBodyB B.ByteString
  | ParamBodyBL BL.ByteString
  | ParamBodyFormUrlEncoded WH.Form
  | ParamBodyMultipartFormData [NH.Part]
  deriving (P.Show)

-- ** SamsaraRequest Utils

_mkRequest :: NH.Method -- ^ Method 
          -> [BCL.ByteString] -- ^ Endpoint
          -> SamsaraRequest req contentType res accept -- ^ req: Request Type, res: Response Type
_mkRequest m u = SamsaraRequest m u _mkParams []

_mkParams :: Params
_mkParams = Params [] [] ParamBodyNone

setHeader :: SamsaraRequest req contentType res accept -> [NH.Header] -> SamsaraRequest req contentType res accept
setHeader req header =
  req `removeHeader` P.fmap P.fst header &
  L.over (rParamsL . paramsHeadersL) (header P.++)

removeHeader :: SamsaraRequest req contentType res accept -> [NH.HeaderName] -> SamsaraRequest req contentType res accept
removeHeader req header =
  req &
  L.over
    (rParamsL . paramsHeadersL)
    (P.filter (\h -> cifst h `P.notElem` P.fmap CI.mk header))
  where
    cifst = CI.mk . P.fst


_setContentTypeHeader :: forall req contentType res accept. MimeType contentType => SamsaraRequest req contentType res accept -> SamsaraRequest req contentType res accept
_setContentTypeHeader req =
    case mimeType (P.Proxy :: P.Proxy contentType) of 
        Just m -> req `setHeader` [("content-type", BC.pack $ P.show m)]
        Nothing -> req `removeHeader` ["content-type"]

_setAcceptHeader :: forall req contentType res accept. MimeType accept => SamsaraRequest req contentType res accept -> SamsaraRequest req contentType res accept
_setAcceptHeader req =
    case mimeType (P.Proxy :: P.Proxy accept) of 
        Just m -> req `setHeader` [("accept", BC.pack $ P.show m)]
        Nothing -> req `removeHeader` ["accept"]

setQuery :: SamsaraRequest req contentType res accept -> [NH.QueryItem] -> SamsaraRequest req contentType res accept
setQuery req query = 
  req &
  L.over
    (rParamsL . paramsQueryL)
    ((query P.++) . P.filter (\q -> cifst q `P.notElem` P.fmap cifst query))
  where
    cifst = CI.mk . P.fst

addForm :: SamsaraRequest req contentType res accept -> WH.Form -> SamsaraRequest req contentType res accept
addForm req newform = 
    let form = case paramsBody (rParams req) of
            ParamBodyFormUrlEncoded _form -> _form
            _ -> mempty
    in req & L.set (rParamsL . paramsBodyL) (ParamBodyFormUrlEncoded (newform <> form))

_addMultiFormPart :: SamsaraRequest req contentType res accept -> NH.Part -> SamsaraRequest req contentType res accept
_addMultiFormPart req newpart = 
    let parts = case paramsBody (rParams req) of
            ParamBodyMultipartFormData _parts -> _parts
            _ -> []
    in req & L.set (rParamsL . paramsBodyL) (ParamBodyMultipartFormData (newpart : parts))

_setBodyBS :: SamsaraRequest req contentType res accept -> B.ByteString -> SamsaraRequest req contentType res accept
_setBodyBS req body = 
    req & L.set (rParamsL . paramsBodyL) (ParamBodyB body)

_setBodyLBS :: SamsaraRequest req contentType res accept -> BL.ByteString -> SamsaraRequest req contentType res accept
_setBodyLBS req body = 
    req & L.set (rParamsL . paramsBodyL) (ParamBodyBL body)

_hasAuthType :: AuthMethod authMethod => SamsaraRequest req contentType res accept -> P.Proxy authMethod -> SamsaraRequest req contentType res accept
_hasAuthType req proxy =
  req & L.over rAuthTypesL (P.typeRep proxy :)

-- ** Params Utils

toPath
  :: WH.ToHttpApiData a
  => a -> BCL.ByteString
toPath = BB.toLazyByteString . WH.toEncodedUrlPiece

toHeader :: WH.ToHttpApiData a => (NH.HeaderName, a) -> [NH.Header]
toHeader x = [fmap WH.toHeader x]

toForm :: WH.ToHttpApiData v => (BC.ByteString, v) -> WH.Form
toForm (k,v) = WH.toForm [(BC.unpack k,v)]

toQuery :: WH.ToHttpApiData a => (BC.ByteString, Maybe a) -> [NH.QueryItem]
toQuery x = [(fmap . fmap) toQueryParam x]
  where toQueryParam = T.encodeUtf8 . WH.toQueryParam

-- *** OpenAPI `CollectionFormat` Utils

-- | Determines the format of the array if type array is used.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. This is valid only for parameters in "query" ('NH.Query') or "formData" ('WH.Form')

toHeaderColl :: WH.ToHttpApiData a => CollectionFormat -> (NH.HeaderName, [a]) -> [NH.Header]
toHeaderColl c xs = _toColl c toHeader xs

toFormColl :: WH.ToHttpApiData v => CollectionFormat -> (BC.ByteString, [v]) -> WH.Form
toFormColl c xs = WH.toForm $ fmap unpack $ _toColl c toHeader $ pack xs
  where
    pack (k,v) = (CI.mk k, v)
    unpack (k,v) = (BC.unpack (CI.original k), BC.unpack v)

toQueryColl :: WH.ToHttpApiData a => CollectionFormat -> (BC.ByteString, Maybe [a]) -> NH.Query
toQueryColl c xs = _toCollA c toQuery xs

_toColl :: P.Traversable f => CollectionFormat -> (f a -> [(b, BC.ByteString)]) -> f [a] -> [(b, BC.ByteString)]
_toColl c encode xs = fmap (fmap P.fromJust) (_toCollA' c fencode BC.singleton (fmap Just xs))
  where fencode = fmap (fmap Just) . encode . fmap P.fromJust
        {-# INLINE fencode #-}

_toCollA :: (P.Traversable f, P.Traversable t, P.Alternative t) => CollectionFormat -> (f (t a) -> [(b, t BC.ByteString)]) -> f (t [a]) -> [(b, t BC.ByteString)]
_toCollA c encode xs = _toCollA' c encode BC.singleton xs

_toCollA' :: (P.Monoid c, P.Traversable f, P.Traversable t, P.Alternative t) => CollectionFormat -> (f (t a) -> [(b, t c)]) -> (Char -> c) -> f (t [a]) -> [(b, t c)]
_toCollA' c encode one xs = case c of
  CommaSeparated -> go (one ',')
  SpaceSeparated -> go (one ' ')
  TabSeparated -> go (one '\t')
  PipeSeparated -> go (one '|')
  MultiParamArray -> expandList
  where
    go sep =
      [P.foldl1 (\(sk, sv) (_, v) -> (sk, (combine sep <$> sv <*> v) <|> sv <|> v)) expandList]
    combine sep x y = x <> sep <> y
    expandList = (P.concatMap encode . (P.traverse . P.traverse) P.toList) xs
    {-# INLINE go #-}
    {-# INLINE expandList #-}
    {-# INLINE combine #-}
  
-- * AuthMethods

-- | Provides a method to apply auth methods to requests
class P.Typeable a =>
      AuthMethod a  where
  applyAuthMethod
    :: SamsaraConfig
    -> a
    -> SamsaraRequest req contentType res accept
    -> IO (SamsaraRequest req contentType res accept)

-- | An existential wrapper for any AuthMethod
data AnyAuthMethod = forall a. AuthMethod a => AnyAuthMethod a deriving (P.Typeable)

instance AuthMethod AnyAuthMethod where applyAuthMethod config (AnyAuthMethod a) req = applyAuthMethod config a req

-- | indicates exceptions related to AuthMethods
data AuthMethodException = AuthMethodException String deriving (P.Show, P.Typeable)

instance E.Exception AuthMethodException

-- | apply all matching AuthMethods in config to request
_applyAuthMethods
  :: SamsaraRequest req contentType res accept
  -> SamsaraConfig
  -> IO (SamsaraRequest req contentType res accept)
_applyAuthMethods req config@(SamsaraConfig {configAuthMethods = as}) =
  foldlM go req as
  where
    go r (AnyAuthMethod a) = applyAuthMethod config a r
  
-- * Utils

-- | Removes Null fields.  (OpenAPI-Specification 2.0 does not allow Null in JSON)
_omitNulls :: [(Text, A.Value)] -> A.Value
_omitNulls = A.object . P.filter notNull
  where
    notNull (_, A.Null) = False
    notNull _ = True

-- | Encodes fields using WH.toQueryParam
_toFormItem :: (WH.ToHttpApiData a, Functor f) => t -> f a -> f (t, [Text])
_toFormItem name x = (name,) . (:[]) . WH.toQueryParam <$> x

-- | Collapse (Just "") to Nothing
_emptyToNothing :: Maybe String -> Maybe String
_emptyToNothing (Just "") = Nothing
_emptyToNothing x = x
{-# INLINE _emptyToNothing #-}

-- | Collapse (Just mempty) to Nothing
_memptyToNothing :: (P.Monoid a, P.Eq a) => Maybe a -> Maybe a
_memptyToNothing (Just x) | x P.== P.mempty = Nothing
_memptyToNothing x = x
{-# INLINE _memptyToNothing #-}

-- * DateTime Formatting

newtype DateTime = DateTime { unDateTime :: TI.UTCTime }
  deriving (P.Eq,P.Data,P.Ord,P.Typeable,NF.NFData,TI.ParseTime,TI.FormatTime)
instance A.FromJSON DateTime where
  parseJSON = A.withText "DateTime" (_readDateTime . T.unpack)
instance A.ToJSON DateTime where
  toJSON (DateTime t) = A.toJSON (_showDateTime t)
instance WH.FromHttpApiData DateTime where
  parseUrlPiece = P.left T.pack . _readDateTime . T.unpack
instance WH.ToHttpApiData DateTime where
  toUrlPiece (DateTime t) = T.pack (_showDateTime t)
instance P.Show DateTime where
  show (DateTime t) = _showDateTime t
instance MimeRender MimeMultipartFormData DateTime where
  mimeRender _ = mimeRenderDefaultMultipartFormData

-- | @_parseISO8601@
_readDateTime :: (TI.ParseTime t, Monad m, Alternative m) => String -> m t
_readDateTime =
  _parseISO8601
{-# INLINE _readDateTime #-}

-- | @TI.formatISO8601Millis@
_showDateTime :: (t ~ TI.UTCTime, TI.FormatTime t) => t -> String
_showDateTime =
  TI.formatISO8601Millis
{-# INLINE _showDateTime #-}

-- | parse an ISO8601 date-time string
_parseISO8601 :: (TI.ParseTime t, Monad m, Alternative m) => String -> m t
_parseISO8601 t =
  P.asum $
  P.flip (TI.parseTimeM True TI.defaultTimeLocale) t <$>
  ["%FT%T%QZ", "%FT%T%Q%z", "%FT%T%Q%Z"]
{-# INLINE _parseISO8601 #-}

-- * Date Formatting

newtype Date = Date { unDate :: TI.Day }
  deriving (P.Enum,P.Eq,P.Data,P.Ord,P.Ix,NF.NFData,TI.ParseTime,TI.FormatTime)
instance A.FromJSON Date where
  parseJSON = A.withText "Date" (_readDate . T.unpack)
instance A.ToJSON Date where
  toJSON (Date t) = A.toJSON (_showDate t)
instance WH.FromHttpApiData Date where
  parseUrlPiece = P.left T.pack . _readDate . T.unpack
instance WH.ToHttpApiData Date where
  toUrlPiece (Date t) = T.pack (_showDate t)
instance P.Show Date where
  show (Date t) = _showDate t
instance MimeRender MimeMultipartFormData Date where
  mimeRender _ = mimeRenderDefaultMultipartFormData

-- | @TI.parseTimeM True TI.defaultTimeLocale "%Y-%m-%d"@
_readDate :: (TI.ParseTime t, Monad m) => String -> m t
_readDate =
  TI.parseTimeM True TI.defaultTimeLocale "%Y-%m-%d"
{-# INLINE _readDate #-}

-- | @TI.formatTime TI.defaultTimeLocale "%Y-%m-%d"@
_showDate :: TI.FormatTime t => t -> String
_showDate =
  TI.formatTime TI.defaultTimeLocale "%Y-%m-%d"
{-# INLINE _showDate #-}

-- * Byte/Binary Formatting

  
-- | base64 encoded characters
newtype ByteArray = ByteArray { unByteArray :: BL.ByteString }
  deriving (P.Eq,P.Data,P.Ord,P.Typeable,NF.NFData)

instance A.FromJSON ByteArray where
  parseJSON = A.withText "ByteArray" _readByteArray
instance A.ToJSON ByteArray where
  toJSON = A.toJSON . _showByteArray
instance WH.FromHttpApiData ByteArray where
  parseUrlPiece = P.left T.pack . _readByteArray
instance WH.ToHttpApiData ByteArray where
  toUrlPiece = _showByteArray
instance P.Show ByteArray where
  show = T.unpack . _showByteArray
instance MimeRender MimeMultipartFormData ByteArray where
  mimeRender _ = mimeRenderDefaultMultipartFormData

-- | read base64 encoded characters
_readByteArray :: Monad m => Text -> m ByteArray
_readByteArray = P.either P.fail (pure . ByteArray) . BL64.decode . BL.fromStrict . T.encodeUtf8
{-# INLINE _readByteArray #-}

-- | show base64 encoded characters
_showByteArray :: ByteArray -> Text
_showByteArray = T.decodeUtf8 . BL.toStrict . BL64.encode . unByteArray
{-# INLINE _showByteArray #-}

-- | any sequence of octets
newtype Binary = Binary { unBinary :: BL.ByteString }
  deriving (P.Eq,P.Data,P.Ord,P.Typeable,NF.NFData)

instance A.FromJSON Binary where
  parseJSON = A.withText "Binary" _readBinaryBase64
instance A.ToJSON Binary where
  toJSON = A.toJSON . _showBinaryBase64
instance WH.FromHttpApiData Binary where
  parseUrlPiece = P.left T.pack . _readBinaryBase64
instance WH.ToHttpApiData Binary where
  toUrlPiece = _showBinaryBase64
instance P.Show Binary where
  show = T.unpack . _showBinaryBase64
instance MimeRender MimeMultipartFormData Binary where
  mimeRender _ = unBinary

_readBinaryBase64 :: Monad m => Text -> m Binary
_readBinaryBase64 = P.either P.fail (pure . Binary) . BL64.decode . BL.fromStrict . T.encodeUtf8
{-# INLINE _readBinaryBase64 #-}

_showBinaryBase64 :: Binary -> Text
_showBinaryBase64 = T.decodeUtf8 . BL.toStrict . BL64.encode . unBinary
{-# INLINE _showBinaryBase64 #-}

-- * Lens Type Aliases

type Lens_' s a = Lens_ s s a a
type Lens_ s t a b = forall (f :: * -> *). Functor f => (a -> f b) -> s -> f t
