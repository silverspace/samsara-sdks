# Auto-Generated OpenAPI Bindings to `Samsara`

The library in `lib` provides auto-generated-from-OpenAPI bindings to the Samsara API.

## Installation

Installation follows the standard approach to installing Stack-based projects.

1. Install the [Haskell `stack` tool](http://docs.haskellstack.org/en/stable/README).
2. Run `stack install` to install this package.

Otherwise, if you already have a Stack project, you can include this package under the `packages` key in your `stack.yaml`:
```yaml
packages:
- location:
    git: https://github.com/yourGitOrg/yourGitRepo
    commit: somecommit
```

## Main Interface

The main interface to this library is in the `Samsara.API` module, which exports the SamsaraBackend type. The SamsaraBackend
type can be used to create and define servers and clients for the API.

## Creating a Client

A client can be created via the `createSamsaraClient` function, which will generate a function for every endpoint of the API.
Then these functions can be invoked with `runSamsaraClientWithManager` or more conveniently with `callSamsaraClient`
(depending if you want an `Either` back or you want to catch) to access the API endpoint they refer to, if the API is served
at the `url` you specified.

For example, if `localhost:8080` is serving the Samsara API, you can write:

```haskell
{-# LANGUAGE RecordWildCards #-}

import Samsara.API as API

import           Network.HTTP.Client     (newManager)
import           Network.HTTP.Client.TLS (tlsManagerSettings)
import           Servant.Client          (ClientEnv, mkClientEnv, parseBaseUrl)


main :: IO ()
main = do
  -- Configure the BaseUrl for the client
  url <- parseBaseUrl "http://localhost:8080/"

  -- You probably want to reuse the Manager across calls, for performance reasons
  manager <- newManager tlsManagerSettings

  -- Create the client (all endpoint functions will be available)
  SamsaraBackend{..} <- API.createSamsaraClient

  -- Any Samsara API call can go here, e.g. here we call `getSomeEndpoint`
  API.callSamsara (mkClientEnv manager url) getSomeEndpoint
```

## Creating a Server

In order to create a server, you must use the `runSamsaraServer` function. However, you unlike the client, in which case you *got* a `SamsaraBackend`
from the library, you must instead *provide* a `SamsaraBackend`. For example, if you have defined handler functions for all the
functions in `Samsara.Handlers`, you can write:

```haskell
{-# LANGUAGE RecordWildCards #-}

import Samsara.API

-- A module you wrote yourself, containing all handlers needed for the SamsaraBackend type.
import Samsara.Handlers

-- Run a Samsara server on localhost:8080
main :: IO ()
main = do
  let server = SamsaraBackend{..}
      config = Config "http://localhost:8080/"
  runSamsaraServer config server
```
