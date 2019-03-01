# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.MachineHistoryResponse do
  @moduledoc """
  Contains the results for a machine history request
  """

  @derive [Poison.Encoder]
  defstruct [
    :"machines"
  ]

  @type t :: %__MODULE__{
    :"machines" => [MachineHistoryResponseMachines] | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.MachineHistoryResponse do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"machines", :list, SamsaraAPI.Model.MachineHistoryResponseMachines, options)
  end
end
