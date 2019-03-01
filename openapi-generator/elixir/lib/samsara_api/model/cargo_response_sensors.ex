# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.CargoResponseSensors do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"cargoEmpty",
    :"name",
    :"id"
  ]

  @type t :: %__MODULE__{
    :"cargoEmpty" => boolean() | nil,
    :"name" => String.t | nil,
    :"id" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.CargoResponseSensors do
  def decode(value, _options) do
    value
  end
end

