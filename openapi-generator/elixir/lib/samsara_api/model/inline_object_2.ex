# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineObject2 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"address",
    :"groupId",
    :"name",
    :"radius"
  ]

  @type t :: %__MODULE__{
    :"address" => String.t,
    :"groupId" => integer(),
    :"name" => String.t,
    :"radius" => integer()
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineObject2 do
  def decode(value, _options) do
    value
  end
end

