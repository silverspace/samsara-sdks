# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DriverDailyLogResponseDays do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"certifiedAtMs",
    :"endMs",
    :"startMs",
    :"trailerIds",
    :"activeHours",
    :"distanceMiles",
    :"activeMs",
    :"certified",
    :"vehicleIds"
  ]

  @type t :: %__MODULE__{
    :"certifiedAtMs" => integer() | nil,
    :"endMs" => integer() | nil,
    :"startMs" => integer() | nil,
    :"trailerIds" => Map | nil,
    :"activeHours" => float() | nil,
    :"distanceMiles" => float() | nil,
    :"activeMs" => integer() | nil,
    :"certified" => boolean() | nil,
    :"vehicleIds" => Map | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DriverDailyLogResponseDays do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"trailerIds", :struct, SamsaraAPI.Model.Map, options)
    |> deserialize(:"vehicleIds", :struct, SamsaraAPI.Model.Map, options)
  end
end
