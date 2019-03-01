# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineResponse2008 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"sensors"
  ]

  @type t :: %__MODULE__{
    :"sensors" => [Sensor] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineResponse2008 do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"sensors", :list, SamsaraAPI.Model.Sensor, options)
  end
end
