# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineObject8 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"driverId",
    :"endMs",
    :"groupId",
    :"startMs"
  ]

  @type t :: %__MODULE__{
    :"driverId" => integer(),
    :"endMs" => integer(),
    :"groupId" => integer(),
    :"startMs" => integer()
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineObject8 do
  def decode(value, _options) do
    value
  end
end

