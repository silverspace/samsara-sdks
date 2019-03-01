# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Api.Industrial do
  @moduledoc """
  API calls for all endpoints tagged `Industrial`.
  """

  alias SamsaraAPI.Connection
  import SamsaraAPI.RequestBuilder


  @doc """
  /industrial/data
  Fetch all of the data inputs for a group.

  ## Parameters

  - connection (SamsaraAPI.Connection): Connection to server
  - access_token (String.t): Samsara API access token.
  - opts (KeywordList): [optional] Optional parameters
    - :group_id (integer()): Optional group ID if the organization has multiple groups (uncommon).
    - :start_ms (integer()): Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    - :end_ms (integer()): Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
  ## Returns

  {:ok, %SamsaraAPI.Model.InlineResponse2006{}} on success
  {:error, info} on failure
  """
  @spec get_all_data_inputs(Tesla.Env.client, String.t, keyword()) :: {:ok, SamsaraAPI.Model.InlineResponse2006.t} | {:error, Tesla.Env.t}
  def get_all_data_inputs(connection, access_token, opts \\ []) do
    optional_params = %{
      :"group_id" => :query,
      :"startMs" => :query,
      :"endMs" => :query
    }
    %{}
    |> method(:get)
    |> url("/industrial/data")
    |> add_param(:query, :"access_token", access_token)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SamsaraAPI.Model.InlineResponse2006{})
  end

  @doc """
  /industrial/data/{data_input_id:[0-9]+}
  Fetch datapoints from a given data input.

  ## Parameters

  - connection (SamsaraAPI.Connection): Connection to server
  - access_token (String.t): Samsara API access token.
  - data_input_id (integer()): ID of the data input
  - opts (KeywordList): [optional] Optional parameters
    - :start_ms (integer()): Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    - :end_ms (integer()): Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
  ## Returns

  {:ok, %SamsaraAPI.Model.DataInputHistoryResponse{}} on success
  {:error, info} on failure
  """
  @spec get_data_input(Tesla.Env.client, String.t, integer(), keyword()) :: {:ok, SamsaraAPI.Model.DataInputHistoryResponse.t} | {:error, Tesla.Env.t}
  def get_data_input(connection, access_token, data_input_id, opts \\ []) do
    optional_params = %{
      :"startMs" => :query,
      :"endMs" => :query
    }
    %{}
    |> method(:get)
    |> url("/industrial/data/#{data_input_id}")
    |> add_param(:query, :"access_token", access_token)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SamsaraAPI.Model.DataInputHistoryResponse{})
  end

  @doc """
  /machines/list
  Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

  ## Parameters

  - connection (SamsaraAPI.Connection): Connection to server
  - access_token (String.t): Samsara API access token.
  - group_param (InlineObject18): 
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %SamsaraAPI.Model.InlineResponse2007{}} on success
  {:error, info} on failure
  """
  @spec get_machines(Tesla.Env.client, String.t, SamsaraAPI.Model.InlineObject18.t, keyword()) :: {:ok, SamsaraAPI.Model.InlineResponse2007.t} | {:error, Tesla.Env.t}
  def get_machines(connection, access_token, group_param, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/machines/list")
    |> add_param(:query, :"access_token", access_token)
    |> add_param(:body, :body, group_param)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SamsaraAPI.Model.InlineResponse2007{})
  end

  @doc """
  /machines/history
  Get historical data for machine objects. This method returns a set of historical data for all machines in a group

  ## Parameters

  - connection (SamsaraAPI.Connection): Connection to server
  - access_token (String.t): Samsara API access token.
  - history_param (InlineObject17): 
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %SamsaraAPI.Model.MachineHistoryResponse{}} on success
  {:error, info} on failure
  """
  @spec get_machines_history(Tesla.Env.client, String.t, SamsaraAPI.Model.InlineObject17.t, keyword()) :: {:ok, SamsaraAPI.Model.MachineHistoryResponse.t} | {:error, Tesla.Env.t}
  def get_machines_history(connection, access_token, history_param, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/machines/history")
    |> add_param(:query, :"access_token", access_token)
    |> add_param(:body, :body, history_param)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SamsaraAPI.Model.MachineHistoryResponse{})
  end
end
