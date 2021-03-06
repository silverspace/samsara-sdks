# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.InlineObject12 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"inspectionType",
    :"mechanicNotes",
    :"odometerMiles",
    :"previousDefectsCorrected",
    :"previousDefectsIgnored",
    :"safe",
    :"trailerId",
    :"userEmail",
    :"vehicleId"
  ]

  @type t :: %__MODULE__{
    :"inspectionType" => String.t,
    :"mechanicNotes" => String.t | nil,
    :"odometerMiles" => integer() | nil,
    :"previousDefectsCorrected" => boolean() | nil,
    :"previousDefectsIgnored" => boolean() | nil,
    :"safe" => String.t,
    :"trailerId" => integer() | nil,
    :"userEmail" => String.t,
    :"vehicleId" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.InlineObject12 do
  def decode(value, _options) do
    value
  end
end

