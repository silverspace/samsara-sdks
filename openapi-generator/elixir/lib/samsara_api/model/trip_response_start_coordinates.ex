# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.TripResponseStartCoordinates do
  @moduledoc """
  Start (latitude, longitude) in decimal degrees.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"latitude",
    :"longitude"
  ]

  @type t :: %__MODULE__{
    :"latitude" => float() | nil,
    :"longitude" => float() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.TripResponseStartCoordinates do
  def decode(value, _options) do
    value
  end
end

