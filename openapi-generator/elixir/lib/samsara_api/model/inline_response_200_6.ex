# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineResponse2006 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"dataInputs"
  ]

  @type t :: %__MODULE__{
    :"dataInputs" => [DataInputHistoryResponse] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineResponse2006 do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"dataInputs", :list, SamsaraAPI.Model.DataInputHistoryResponse, options)
  end
end

