# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineResponse2009 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"tags"
  ]

  @type t :: %__MODULE__{
    :"tags" => [Tag] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineResponse2009 do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"tags", :list, SamsaraAPI.Model.Tag, options)
  end
end

