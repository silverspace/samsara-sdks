# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DriversResponse do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"drivers"
  ]

  @type t :: %__MODULE__{
    :"drivers" => [Driver] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DriversResponse do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"drivers", :list, SamsaraAPI.Model.Driver, options)
  end
end

