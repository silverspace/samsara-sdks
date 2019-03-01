# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.Sensor do
  @moduledoc """
  Contains information about a sensor.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"macAddress",
    :"name"
  ]

  @type t :: %__MODULE__{
    :"id" => integer(),
    :"macAddress" => String.t | nil,
    :"name" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.Sensor do
  def decode(value, _options) do
    value
  end
end

