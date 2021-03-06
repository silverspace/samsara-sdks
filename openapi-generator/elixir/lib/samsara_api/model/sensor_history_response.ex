# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.SensorHistoryResponse do
  @moduledoc """
  Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"results"
  ]

  @type t :: %__MODULE__{
    :"results" => [SensorHistoryResponseResults] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.SensorHistoryResponse do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"results", :list, SamsaraAPI.Model.SensorHistoryResponseResults, options)
  end
end

