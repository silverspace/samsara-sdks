# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DocumentBase do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"dispatchJobId",
    :"notes"
  ]

  @type t :: %__MODULE__{
    :"dispatchJobId" => integer() | nil,
    :"notes" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DocumentBase do
  def decode(value, _options) do
    value
  end
end
