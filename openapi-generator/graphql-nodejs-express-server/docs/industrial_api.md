# industrial_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllDataInputs**](industrial_api.md#GetAllDataInputs) | **GET** /industrial/data | /industrial/data
[**GetDataInput**](industrial_api.md#GetDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**GetMachines**](industrial_api.md#GetMachines) | **POST** /machines/list | /machines/list
[**GetMachinesHistory**](industrial_api.md#GetMachinesHistory) | **POST** /machines/history | /machines/history


<a name="GetAllDataInputs"></a>
# **GetAllDataInputs**
> InlineResponse2006 GetAllDataInputs(accessToken, groupId, startMs, endMs)

/industrial/data

Fetch all of the data inputs for a group.
<a name="GetDataInput"></a>
# **GetDataInput**
> DataInputHistoryResponse GetDataInput(accessToken, dataInputId, startMs, endMs)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.
<a name="GetMachines"></a>
# **GetMachines**
> InlineResponse2007 GetMachines(accessToken, groupParam)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
<a name="GetMachinesHistory"></a>
# **GetMachinesHistory**
> MachineHistoryResponse GetMachinesHistory(accessToken, historyParam)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group
