# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DvirBaseVehicle do
  @moduledoc """
  The vehicle on which DVIR was done.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"name",
    :"id"
  ]

  @type t :: %__MODULE__{
    :"name" => String.t | nil,
    :"id" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DvirBaseVehicle do
  def decode(value, _options) do
    value
  end
end
