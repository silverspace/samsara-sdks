# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DocumentFieldTypeNumberValueTypeMetadata do
  @moduledoc """
  Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"numDecimalPlaces"
  ]

  @type t :: %__MODULE__{
    :"numDecimalPlaces" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DocumentFieldTypeNumberValueTypeMetadata do
  def decode(value, _options) do
    value
  end
end

