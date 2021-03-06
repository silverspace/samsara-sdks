# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.CargoResponse do
  @moduledoc """
  Contains the current cargo status of a sensor.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"groupId",
    :"sensors"
  ]

  @type t :: %__MODULE__{
    :"groupId" => integer() | nil,
    :"sensors" => [CargoResponseSensors] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.CargoResponse do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"sensors", :list, SamsaraAPI.Model.CargoResponseSensors, options)
  end
end

