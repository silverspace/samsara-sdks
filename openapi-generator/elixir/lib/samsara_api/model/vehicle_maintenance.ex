# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.VehicleMaintenance do
  @moduledoc """
  Contains any J1939/Passenger engine light warnings and engine faults.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"j1939",
    :"passenger"
  ]

  @type t :: %__MODULE__{
    :"id" => integer(),
    :"j1939" => VehicleMaintenanceJ1939 | nil,
    :"passenger" => VehicleMaintenancePassenger | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.VehicleMaintenance do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"j1939", :struct, SamsaraAPI.Model.VehicleMaintenanceJ1939, options)
    |> deserialize(:"passenger", :struct, SamsaraAPI.Model.VehicleMaintenancePassenger, options)
  end
end
