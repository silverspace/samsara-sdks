# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DvirBaseAuthorSignature do
  @moduledoc """
  The authors signature for the DVIR.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"mechanicUserId",
    :"driverId",
    :"name",
    :"signedAt",
    :"type",
    :"email",
    :"username"
  ]

  @type t :: %__MODULE__{
    :"mechanicUserId" => integer() | nil,
    :"driverId" => integer() | nil,
    :"name" => String.t | nil,
    :"signedAt" => integer() | nil,
    :"type" => String.t | nil,
    :"email" => String.t | nil,
    :"username" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DvirBaseAuthorSignature do
  def decode(value, _options) do
    value
  end
end

