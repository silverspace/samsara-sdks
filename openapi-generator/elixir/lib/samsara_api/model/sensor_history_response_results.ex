# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.SensorHistoryResponseResults do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"series",
    :"timeMs"
  ]

  @type t :: %__MODULE__{
    :"series" => [integer()] | nil,
    :"timeMs" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.SensorHistoryResponseResults do
  def decode(value, _options) do
    value
  end
end

