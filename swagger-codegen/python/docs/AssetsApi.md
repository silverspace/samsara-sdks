# samsara.AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_asset_current_locations**](AssetsApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**get_all_assets**](AssetsApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
[**get_asset_location**](AssetsApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**get_asset_reefer**](AssetsApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **get_all_asset_current_locations**
> InlineResponse2001 get_all_asset_current_locations(access_token, group_id=group_id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.AssetsApi()
access_token = 'access_token_example' # str | Samsara API access token.
group_id = 789 # int | Optional group ID if the organization has multiple groups (uncommon). (optional)

try:
    # /fleet/assets/locations
    api_response = api_instance.get_all_asset_current_locations(access_token, group_id=group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AssetsApi->get_all_asset_current_locations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_assets**
> InlineResponse200 get_all_assets(access_token, group_id=group_id)

/fleet/assets

Fetch all of the assets for the group.

### Example
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.AssetsApi()
access_token = 'access_token_example' # str | Samsara API access token.
group_id = 789 # int | Optional group ID if the organization has multiple groups (uncommon). (optional)

try:
    # /fleet/assets
    api_response = api_instance.get_all_assets(access_token, group_id=group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AssetsApi->get_all_assets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_location**
> AssetLocationResponse get_asset_location(access_token, asset_id, start_ms, end_ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.AssetsApi()
access_token = 'access_token_example' # str | Samsara API access token.
asset_id = 789 # int | ID of the asset
start_ms = 789 # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
end_ms = 789 # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try:
    # /fleet/assets/{assetId:[0-9]+}/locations
    api_response = api_instance.get_asset_location(access_token, asset_id, start_ms, end_ms)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AssetsApi->get_asset_location: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **asset_id** | **int**| ID of the asset | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetLocationResponse**](AssetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_reefer**
> AssetReeferResponse get_asset_reefer(access_token, asset_id, start_ms, end_ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.AssetsApi()
access_token = 'access_token_example' # str | Samsara API access token.
asset_id = 789 # int | ID of the asset
start_ms = 789 # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
end_ms = 789 # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try:
    # /fleet/assets/{assetId:[0-9]+}/reefer
    api_response = api_instance.get_asset_reefer(access_token, asset_id, start_ms, end_ms)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AssetsApi->get_asset_reefer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **asset_id** | **int**| ID of the asset | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

