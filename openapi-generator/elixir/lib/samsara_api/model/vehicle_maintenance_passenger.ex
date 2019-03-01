# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.VehicleMaintenancePassenger do
  @moduledoc """
  Passenger vehicle data. Null if no data is available.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"checkEngineLight",
    :"diagnosticTroubleCodes"
  ]

  @type t :: %__MODULE__{
    :"checkEngineLight" => VehicleMaintenancePassengerCheckEngineLight | nil,
    :"diagnosticTroubleCodes" => [VehicleMaintenancePassengerDiagnosticTroubleCodes] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.VehicleMaintenancePassenger do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"checkEngineLight", :struct, SamsaraAPI.Model.VehicleMaintenancePassengerCheckEngineLight, options)
    |> deserialize(:"diagnosticTroubleCodes", :list, SamsaraAPI.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes, options)
  end
end
