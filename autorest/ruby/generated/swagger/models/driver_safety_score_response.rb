# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Safety score details for a driver
    #
    class DriverSafetyScoreResponse
      # @return [Integer] Crash event count
      attr_accessor :crash_count

      # @return [Integer] Driver ID
      attr_accessor :driver_id

      # @return [Integer] Harsh acceleration event count
      attr_accessor :harsh_accel_count

      # @return [Integer] Harsh braking event count
      attr_accessor :harsh_braking_count

      # @return [Array<SafetyReportHarshEvent>]
      attr_accessor :harsh_events

      # @return [Integer] Harsh turning event count
      attr_accessor :harsh_turning_count

      # @return [Integer] Safety Score
      attr_accessor :safety_score

      # @return [String] Safety Score Rank
      attr_accessor :safety_score_rank

      # @return [Integer] Amount of time driven over the speed limit in
      # milliseconds
      attr_accessor :time_over_speed_limit_ms

      # @return [Integer] Total distance driven in meters
      attr_accessor :total_distance_driven_meters

      # @return [Integer] Total harsh event count
      attr_accessor :total_harsh_event_count

      # @return [Integer] Amount of time driven in milliseconds
      attr_accessor :total_time_driven_ms


      #
      # Mapper for DriverSafetyScoreResponse class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'DriverSafetyScoreResponse',
          type: {
            name: 'Composite',
            class_name: 'DriverSafetyScoreResponse',
            model_properties: {
              crash_count: {
                client_side_validation: true,
                required: false,
                serialized_name: 'crashCount',
                type: {
                  name: 'Number'
                }
              },
              driver_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'driverId',
                type: {
                  name: 'Number'
                }
              },
              harsh_accel_count: {
                client_side_validation: true,
                required: false,
                serialized_name: 'harshAccelCount',
                type: {
                  name: 'Number'
                }
              },
              harsh_braking_count: {
                client_side_validation: true,
                required: false,
                serialized_name: 'harshBrakingCount',
                type: {
                  name: 'Number'
                }
              },
              harsh_events: {
                client_side_validation: true,
                required: false,
                serialized_name: 'harshEvents',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'SafetyReportHarshEventElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'SafetyReportHarshEvent'
                      }
                  }
                }
              },
              harsh_turning_count: {
                client_side_validation: true,
                required: false,
                serialized_name: 'harshTurningCount',
                type: {
                  name: 'Number'
                }
              },
              safety_score: {
                client_side_validation: true,
                required: false,
                serialized_name: 'safetyScore',
                type: {
                  name: 'Number'
                }
              },
              safety_score_rank: {
                client_side_validation: true,
                required: false,
                serialized_name: 'safetyScoreRank',
                type: {
                  name: 'String'
                }
              },
              time_over_speed_limit_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'timeOverSpeedLimitMs',
                type: {
                  name: 'Number'
                }
              },
              total_distance_driven_meters: {
                client_side_validation: true,
                required: false,
                serialized_name: 'totalDistanceDrivenMeters',
                type: {
                  name: 'Number'
                }
              },
              total_harsh_event_count: {
                client_side_validation: true,
                required: false,
                serialized_name: 'totalHarshEventCount',
                type: {
                  name: 'Number'
                }
              },
              total_time_driven_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'totalTimeDrivenMs',
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