# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.VehicleMaintenanceJ1939 do
  @moduledoc """
  J1939 based data. Null if no data is available.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"checkEngineLight",
    :"diagnosticTroubleCodes"
  ]

  @type t :: %__MODULE__{
    :"checkEngineLight" => VehicleMaintenanceJ1939CheckEngineLight | nil,
    :"diagnosticTroubleCodes" => [VehicleMaintenanceJ1939DiagnosticTroubleCodes] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.VehicleMaintenanceJ1939 do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"checkEngineLight", :struct, SamsaraAPI.Model.VehicleMaintenanceJ1939CheckEngineLight, options)
    |> deserialize(:"diagnosticTroubleCodes", :list, SamsaraAPI.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes, options)
  end
end

