# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DvirBaseTrailerDefects do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"comment",
    :"defectType"
  ]

  @type t :: %__MODULE__{
    :"comment" => String.t | nil,
    :"defectType" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DvirBaseTrailerDefects do
  def decode(value, _options) do
    value
  end
end
