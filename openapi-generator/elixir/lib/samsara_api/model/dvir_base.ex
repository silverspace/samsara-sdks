# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DvirBase do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"authorSignature",
    :"defectsCorrected",
    :"defectsNeedNotBeCorrected",
    :"id",
    :"inspectionType",
    :"mechanicNotes",
    :"mechanicOrAgentSignature",
    :"nextDriverSignature",
    :"odometerMiles",
    :"timeMs",
    :"trailerDefects",
    :"trailerId",
    :"trailerName",
    :"vehicle",
    :"vehicleCondition",
    :"vehicleDefects"
  ]

  @type t :: %__MODULE__{
    :"authorSignature" => DvirBaseAuthorSignature | nil,
    :"defectsCorrected" => boolean() | nil,
    :"defectsNeedNotBeCorrected" => boolean() | nil,
    :"id" => integer() | nil,
    :"inspectionType" => String.t | nil,
    :"mechanicNotes" => String.t | nil,
    :"mechanicOrAgentSignature" => DvirBaseMechanicOrAgentSignature | nil,
    :"nextDriverSignature" => DvirBaseNextDriverSignature | nil,
    :"odometerMiles" => integer() | nil,
    :"timeMs" => integer() | nil,
    :"trailerDefects" => [DvirBaseTrailerDefects] | nil,
    :"trailerId" => integer() | nil,
    :"trailerName" => String.t | nil,
    :"vehicle" => DvirBaseVehicle | nil,
    :"vehicleCondition" => String.t | nil,
    :"vehicleDefects" => [DvirBaseTrailerDefects] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DvirBase do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"authorSignature", :struct, SamsaraAPI.Model.DvirBaseAuthorSignature, options)
    |> deserialize(:"mechanicOrAgentSignature", :struct, SamsaraAPI.Model.DvirBaseMechanicOrAgentSignature, options)
    |> deserialize(:"nextDriverSignature", :struct, SamsaraAPI.Model.DvirBaseNextDriverSignature, options)
    |> deserialize(:"trailerDefects", :list, SamsaraAPI.Model.DvirBaseTrailerDefects, options)
    |> deserialize(:"vehicle", :struct, SamsaraAPI.Model.DvirBaseVehicle, options)
    |> deserialize(:"vehicleDefects", :list, SamsaraAPI.Model.DvirBaseTrailerDefects, options)
  end
end

