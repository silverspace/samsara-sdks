# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.AssetReeferResponseReeferStatsPowerStatus do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"changedAtMs",
    :"status"
  ]

  @type t :: %__MODULE__{
    :"changedAtMs" => integer() | nil,
    :"status" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.AssetReeferResponseReeferStatsPowerStatus do
  def decode(value, _options) do
    value
  end
end
