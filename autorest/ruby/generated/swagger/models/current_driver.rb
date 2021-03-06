# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Model object.
    #
    #
    class CurrentDriver < DriverBase
      # @return [Integer] ID of the driver.
      attr_accessor :id

      # @return [Boolean] True if the driver account has been deactivated.
      attr_accessor :is_deactivated

      # @return [Array<TagMetadata>]
      attr_accessor :tags

      # @return [Integer] ID of the vehicle that this driver is currently
      # assigned to. Omitted if there is no current vehicle assignment for this
      # driver.
      attr_accessor :current_vehicle_id


      #
      # Mapper for CurrentDriver class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'CurrentDriver',
          type: {
            name: 'Composite',
            class_name: 'CurrentDriver',
            model_properties: {
              eld_adverse_weather_exemption_enabled: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldAdverseWeatherExemptionEnabled',
                type: {
                  name: 'Boolean'
                }
              },
              eld_big_day_exemption_enabled: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldBigDayExemptionEnabled',
                type: {
                  name: 'Boolean'
                }
              },
              eld_day_start_hour: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldDayStartHour',
                type: {
                  name: 'Number'
                }
              },
              eld_exempt: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldExempt',
                type: {
                  name: 'Boolean'
                }
              },
              eld_exempt_reason: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldExemptReason',
                type: {
                  name: 'String'
                }
              },
              eld_pc_enabled: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldPcEnabled',
                default_value: false,
                type: {
                  name: 'Boolean'
                }
              },
              eld_ym_enabled: {
                client_side_validation: true,
                required: false,
                serialized_name: 'eldYmEnabled',
                default_value: false,
                type: {
                  name: 'Boolean'
                }
              },
              external_ids: {
                client_side_validation: true,
                required: false,
                serialized_name: 'externalIds',
                type: {
                  name: 'Dictionary',
                  value: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'StringElementType',
                      type: {
                        name: 'String'
                      }
                  }
                }
              },
              group_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'groupId',
                type: {
                  name: 'Number'
                }
              },
              license_number: {
                client_side_validation: true,
                required: false,
                serialized_name: 'licenseNumber',
                type: {
                  name: 'String'
                }
              },
              license_state: {
                client_side_validation: true,
                required: false,
                serialized_name: 'licenseState',
                type: {
                  name: 'String'
                }
              },
              name: {
                client_side_validation: true,
                required: true,
                serialized_name: 'name',
                type: {
                  name: 'String'
                }
              },
              notes: {
                client_side_validation: true,
                required: false,
                serialized_name: 'notes',
                type: {
                  name: 'String'
                }
              },
              phone: {
                client_side_validation: true,
                required: false,
                serialized_name: 'phone',
                type: {
                  name: 'String'
                }
              },
              username: {
                client_side_validation: true,
                required: false,
                serialized_name: 'username',
                type: {
                  name: 'String'
                }
              },
              vehicle_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'vehicleId',
                type: {
                  name: 'Number'
                }
              },
              id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'id',
                type: {
                  name: 'Number'
                }
              },
              is_deactivated: {
                client_side_validation: true,
                required: false,
                serialized_name: 'isDeactivated',
                type: {
                  name: 'Boolean'
                }
              },
              tags: {
                client_side_validation: true,
                required: false,
                serialized_name: 'tags',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'TagMetadataElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'TagMetadata'
                      }
                  }
                }
              },
              current_vehicle_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'currentVehicleId',
                type: {
                  name: 'Number'
                }
              }
            }
          }
        }
      end
    end
  end
end
