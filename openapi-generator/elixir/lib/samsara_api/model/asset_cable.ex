# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.AssetCable do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"assetType"
  ]

  @type t :: %__MODULE__{
    :"assetType" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.AssetCable do
  def decode(value, _options) do
    value
  end
end

