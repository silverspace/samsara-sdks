# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.AssetReeferResponseReeferStatsEngineHours do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"engineHours",
    :"changedAtMs"
  ]

  @type t :: %__MODULE__{
    :"engineHours" => integer() | nil,
    :"changedAtMs" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.AssetReeferResponseReeferStatsEngineHours do
  def decode(value, _options) do
    value
  end
end

