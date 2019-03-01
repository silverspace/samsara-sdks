# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DocumentFieldCreate do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"numberValue",
    :"photoValue",
    :"stringValue",
    :"valueType"
  ]

  @type t :: %__MODULE__{
    :"numberValue" => float() | nil,
    :"photoValue" => [DocumentFieldCreatePhotoValue] | nil,
    :"stringValue" => String.t | nil,
    :"valueType" => String.t
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DocumentFieldCreate do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"photoValue", :list, SamsaraAPI.Model.DocumentFieldCreatePhotoValue, options)
  end
end
