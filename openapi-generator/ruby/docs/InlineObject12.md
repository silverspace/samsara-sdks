# OpenapiClient::InlineObject12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspection_type** | **String** | Only type &#39;mechanic&#39; is currently accepted. | 
**mechanic_notes** | **String** | Any notes from the mechanic. | [optional] 
**odometer_miles** | **Integer** | The current odometer of the vehicle. | [optional] 
**previous_defects_corrected** | **BOOLEAN** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**previous_defects_ignored** | **BOOLEAN** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**safe** | **String** | Whether or not this vehicle or trailer is safe to drive. | 
**trailer_id** | **Integer** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. | [optional] 
**user_email** | **String** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | 
**vehicle_id** | **Integer** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject12.new(inspection_type: mechanic,
                                 mechanic_notes: Replaced headlight on passenger side.,
                                 odometer_miles: 38426,
                                 previous_defects_corrected: true,
                                 previous_defects_ignored: false,
                                 safe: safe,
                                 trailer_id: 11,
                                 user_email: j.smith@yahoo.com,
                                 vehicle_id: 10)
```


