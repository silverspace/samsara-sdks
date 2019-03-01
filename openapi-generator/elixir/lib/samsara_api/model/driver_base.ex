# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.DriverBase do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"eldAdverseWeatherExemptionEnabled",
    :"eldBigDayExemptionEnabled",
    :"eldDayStartHour",
    :"eldExempt",
    :"eldExemptReason",
    :"eldPcEnabled",
    :"eldYmEnabled",
    :"externalIds",
    :"groupId",
    :"licenseNumber",
    :"licenseState",
    :"name",
    :"notes",
    :"phone",
    :"username",
    :"vehicleId"
  ]

  @type t :: %__MODULE__{
    :"eldAdverseWeatherExemptionEnabled" => boolean() | nil,
    :"eldBigDayExemptionEnabled" => boolean() | nil,
    :"eldDayStartHour" => integer() | nil,
    :"eldExempt" => boolean() | nil,
    :"eldExemptReason" => String.t | nil,
    :"eldPcEnabled" => boolean() | nil,
    :"eldYmEnabled" => boolean() | nil,
    :"externalIds" => %{optional(String.t) => String.t} | nil,
    :"groupId" => integer() | nil,
    :"licenseNumber" => String.t | nil,
    :"licenseState" => String.t | nil,
    :"name" => String.t,
    :"notes" => String.t | nil,
    :"phone" => String.t | nil,
    :"username" => String.t | nil,
    :"vehicleId" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.DriverBase do
  def decode(value, _options) do
    value
  end
end

