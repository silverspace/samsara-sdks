# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineObject23 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"groupId"
  ]

  @type t :: %__MODULE__{
    :"groupId" => integer()
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineObject23 do
  def decode(value, _options) do
    value
  end
end
