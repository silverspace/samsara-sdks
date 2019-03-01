# OpenAPI\Server\Api\AssetsApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](AssetsApiInterface.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](AssetsApiInterface.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](AssetsApiInterface.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](AssetsApiInterface.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.assets:
        class: Acme\MyBundle\Api\AssetsApi
        tags:
            - { name: "open_apiserver.api", api: "assets" }
    # ...
```

## **getAllAssetCurrentLocations**
> OpenAPI\Server\Model\InlineResponse2001 getAllAssetCurrentLocations($accessToken, $groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssetsApiInterface;

class AssetsApi implements AssetsApiInterface
{

    // ...

    /**
     * Implementation of AssetsApiInterface#getAllAssetCurrentLocations
     */
    public function getAllAssetCurrentLocations($accessToken, $groupId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAllAssets**
> OpenAPI\Server\Model\InlineResponse200 getAllAssets($accessToken, $groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssetsApiInterface;

class AssetsApi implements AssetsApiInterface
{

    // ...

    /**
     * Implementation of AssetsApiInterface#getAllAssets
     */
    public function getAllAssets($accessToken, $groupId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAssetLocation**
> array getAssetLocation($accessToken, $assetId, $startMs, $endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssetsApiInterface;

class AssetsApi implements AssetsApiInterface
{

    // ...

    /**
     * Implementation of AssetsApiInterface#getAssetLocation
     */
    public function getAssetLocation($accessToken, $assetId, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **assetId** | **int**| ID of the asset |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

**array**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAssetReefer**
> OpenAPI\Server\Model\AssetReeferResponse getAssetReefer($accessToken, $assetId, $startMs, $endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssetsApiInterface;

class AssetsApi implements AssetsApiInterface
{

    // ...

    /**
     * Implementation of AssetsApiInterface#getAssetReefer
     */
    public function getAssetReefer($accessToken, $assetId, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **assetId** | **int**| ID of the asset |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**OpenAPI\Server\Model\AssetReeferResponse**](../Model/AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

