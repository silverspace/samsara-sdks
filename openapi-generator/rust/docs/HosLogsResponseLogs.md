# HosLogsResponseLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loc_lng** | **f64** | Longitude at which the log was recorded. | [optional] 
**log_start_ms** | **i64** | The time at which the log/HOS status started in UNIX milliseconds. | [optional] 
**driver_id** | **i64** | ID of the driver. | [optional] 
**status_type** | **String** | The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. | [optional] 
**loc_city** | **String** | City in which the log was recorded. | [optional] 
**group_id** | **i64** | ID of the group. | [optional] 
**loc_name** | **String** | Name of location at which the log was recorded. | [optional] 
**loc_lat** | **f64** | Latitude at which the log was recorded. | [optional] 
**remark** | **String** | Remark associated with the log entry. | [optional] 
**loc_state** | **String** | State in which the log was recorded. | [optional] 
**vehicle_id** | **i64** | ID of the vehicle. | [optional] 
**codriver_ids** | **Vec<i64>** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


