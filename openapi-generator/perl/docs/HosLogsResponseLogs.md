# WWW::OpenAPIClient::Object::HosLogsResponseLogs

## Load the model package
```perl
use WWW::OpenAPIClient::Object::HosLogsResponseLogs;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loc_lng** | **double** | Longitude at which the log was recorded. | [optional] 
**log_start_ms** | **int** | The time at which the log/HOS status started in UNIX milliseconds. | [optional] 
**driver_id** | **int** | ID of the driver. | [optional] 
**status_type** | **string** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] 
**loc_city** | **string** | City in which the log was recorded. | [optional] 
**group_id** | **int** | ID of the group. | [optional] 
**loc_name** | **string** | Name of location at which the log was recorded. | [optional] 
**loc_lat** | **double** | Latitude at which the log was recorded. | [optional] 
**remark** | **string** | Remark associated with the log entry. | [optional] 
**loc_state** | **string** | State in which the log was recorded. | [optional] 
**vehicle_id** | **int** | ID of the vehicle. | [optional] 
**codriver_ids** | **ARRAY[int]** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


