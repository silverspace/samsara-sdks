# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DocumentCreate do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"dispatchJobId",
    :"notes",
    :"documentTypeUuid",
    :"fields"
  ]

  @type t :: %__MODULE__{
    :"dispatchJobId" => integer() | nil,
    :"notes" => String.t | nil,
    :"documentTypeUuid" => String.t,
    :"fields" => [DocumentField]
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DocumentCreate do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"fields", :list, SamsaraAPI.Model.DocumentField, options)
  end
end
