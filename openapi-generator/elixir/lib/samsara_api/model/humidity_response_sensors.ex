# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.HumidityResponseSensors do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"name",
    :"humidity",
    :"id"
  ]

  @type t :: %__MODULE__{
    :"name" => String.t | nil,
    :"humidity" => integer() | nil,
    :"id" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.HumidityResponseSensors do
  def decode(value, _options) do
    value
  end
end
