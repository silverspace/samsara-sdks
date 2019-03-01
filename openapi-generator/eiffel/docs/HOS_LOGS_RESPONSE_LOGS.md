# HOS_LOGS_RESPONSE_LOGS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loc_lng** | **REAL_64** | Longitude at which the log was recorded. | [optional] [default to null]
**log_start_ms** | **INTEGER_64** | The time at which the log/HOS status started in UNIX milliseconds. | [optional] [default to null]
**driver_id** | **INTEGER_64** | ID of the driver. | [optional] [default to null]
**status_type** | [**STRING_32**](STRING_32.md) | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] [default to null]
**loc_city** | [**STRING_32**](STRING_32.md) | City in which the log was recorded. | [optional] [default to null]
**group_id** | **INTEGER_64** | ID of the group. | [optional] [default to null]
**loc_name** | [**STRING_32**](STRING_32.md) | Name of location at which the log was recorded. | [optional] [default to null]
**loc_lat** | **REAL_64** | Latitude at which the log was recorded. | [optional] [default to null]
**remark** | [**STRING_32**](STRING_32.md) | Remark associated with the log entry. | [optional] [default to null]
**loc_state** | [**STRING_32**](STRING_32.md) | State in which the log was recorded. | [optional] [default to null]
**vehicle_id** | **INTEGER_64** | ID of the vehicle. | [optional] [default to null]
**codriver_ids** | **LIST [INTEGER_64]** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


