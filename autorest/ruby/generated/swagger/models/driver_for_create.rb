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
    class DriverForCreate < DriverBase
      # @return [String] Driver's password for the driver app.
      attr_accessor :password

      # @return [Array<Float>]
      attr_accessor :tag_ids


      #
      # Mapper for DriverForCreate class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'DriverForCreate',
          type: {
            name: 'Composite',
            class_name: 'DriverForCreate',
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
              password: {
                client_side_validation: true,
                required: false,
                serialized_name: 'password',
                type: {
                  name: 'String'
                }
              },
              tag_ids: {
                client_side_validation: true,
                required: false,
                serialized_name: 'tagIds',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'FloatElementType',
                      type: {
                        name: 'Double'
                      }
                  }
                }
              }
            }
          }
        }
      end
    end
  end
end
