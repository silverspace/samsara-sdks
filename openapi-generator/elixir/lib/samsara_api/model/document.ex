# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.Document do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"dispatchJobId",
    :"notes",
    :"documentType",
    :"driverCreatedAtMs",
    :"driverId",
    :"fields",
    :"vehicleId"
  ]

  @type t :: %__MODULE__{
    :"dispatchJobId" => integer() | nil,
    :"notes" => String.t | nil,
    :"documentType" => String.t,
    :"driverCreatedAtMs" => integer(),
    :"driverId" => integer(),
    :"fields" => [DocumentField],
    :"vehicleId" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.Document do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"fields", :list, SamsaraAPI.Model.DocumentField, options)
  end
end

