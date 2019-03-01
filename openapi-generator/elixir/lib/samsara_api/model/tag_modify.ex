# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SamsaraAPI.Model.TagModify do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"add",
    :"delete",
    :"name",
    :"parentTagId"
  ]

  @type t :: %__MODULE__{
    :"add" => TagModifyAdd | nil,
    :"delete" => TagModifyDelete | nil,
    :"name" => String.t | nil,
    :"parentTagId" => integer() | nil
  }
end

defimpl Poison.Decoder, for: SamsaraAPI.Model.TagModify do
  import SamsaraAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"add", :struct, SamsaraAPI.Model.TagModifyAdd, options)
    |> deserialize(:"delete", :struct, SamsaraAPI.Model.TagModifyDelete, options)
  end
end

