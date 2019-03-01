# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.VehicleHarshEventResponse do
  @moduledoc """
  Harsh event details for a vehicle
  """

  @derive [Poison.Encoder]
  defstruct [
    :"downloadForwardVideoUrl",
    :"downloadInwardVideoUrl",
    :"downloadTrackedInwardVideoUrl",
    :"harshEventType",
    :"incidentReportUrl",
    :"isDistracted",
    :"location"
  ]

  @type t :: %__MODULE__{
    :"downloadForwardVideoUrl" => String.t | nil,
    :"downloadInwardVideoUrl" => String.t | nil,
    :"downloadTrackedInwardVideoUrl" => String.t | nil,
    :"harshEventType" => String.t,
    :"incidentReportUrl" => String.t,
    :"isDistracted" => boolean() | nil,
    :"location" => VehicleHarshEventResponseLocation | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.VehicleHarshEventResponse do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"location", :struct, SamsaraAPI.Model.VehicleHarshEventResponseLocation, options)
  end
end
