# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.JobUpdateObject do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"changed_at_ms",
    :"job_id",
    :"job_state",
    :"prev_job_state",
    :"route",
    :"route_id"
  ]

  @type t :: %__MODULE__{
    :"changed_at_ms" => integer() | nil,
    :"job_id" => integer() | nil,
    :"job_state" => JobStatus | nil,
    :"prev_job_state" => PrevJobStatus | nil,
    :"route" => DispatchRoute | nil,
    :"route_id" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.JobUpdateObject do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"job_state", :struct, SamsaraAPI.Model.JobStatus, options)
    |> deserialize(:"prev_job_state", :struct, SamsaraAPI.Model.PrevJobStatus, options)
    |> deserialize(:"route", :struct, SamsaraAPI.Model.DispatchRoute, options)
  end
end

