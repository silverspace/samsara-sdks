# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DataInputHistoryResponsePoints do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"value",
    :"timeMs"
  ]

  @type t :: %__MODULE__{
    :"value" => float() | nil,
    :"timeMs" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DataInputHistoryResponsePoints do
  def decode(value, _options) do
    value
  end
end

