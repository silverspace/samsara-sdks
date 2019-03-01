# OpenapiClient::Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Email address of the contact | [optional] 
**first_name** | **String** | First name of the contact | [optional] 
**id** | **Integer** | ID of the contact | [optional] 
**last_name** | **String** | Last name of the contact | [optional] 
**phone** | **String** | Phone number of the contact | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Contact.new(email: jane.jones@yahoo.com,
                                 first_name: Jane,
                                 id: 123,
                                 last_name: Jones,
                                 phone: 111-222-3344)
```


