using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the results for a machine history request
    /// </summary>
    public sealed class MachineHistoryResponse:  IEquatable<MachineHistoryResponse>
    { 
        /// <summary>
        /// Machines
        /// </summary>
        public List<MachineHistoryResponseMachines> Machines { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MachineHistoryResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MachineHistoryResponse()
        {
        }

        private MachineHistoryResponse(List<MachineHistoryResponseMachines> Machines)
        {
            
            this.Machines = Machines;
            
        }

        /// <summary>
        /// Returns builder of MachineHistoryResponse.
        /// </summary>
        /// <returns>MachineHistoryResponseBuilder</returns>
        public static MachineHistoryResponseBuilder Builder()
        {
            return new MachineHistoryResponseBuilder();
        }

        /// <summary>
        /// Returns MachineHistoryResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MachineHistoryResponseBuilder</returns>
        public MachineHistoryResponseBuilder With()
        {
            return Builder()
                .Machines(Machines);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MachineHistoryResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MachineHistoryResponse.
        /// </summary>
        /// <param name="left">Compared (MachineHistoryResponse</param>
        /// <param name="right">Compared (MachineHistoryResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MachineHistoryResponse left, MachineHistoryResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MachineHistoryResponse.
        /// </summary>
        /// <param name="left">Compared (MachineHistoryResponse</param>
        /// <param name="right">Compared (MachineHistoryResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MachineHistoryResponse left, MachineHistoryResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MachineHistoryResponse.
        /// </summary>
        public sealed class MachineHistoryResponseBuilder
        {
            private List<MachineHistoryResponseMachines> _Machines;

            internal MachineHistoryResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MachineHistoryResponse.Machines property.
            /// </summary>
            /// <param name="value">Machines</param>
            public MachineHistoryResponseBuilder Machines(List<MachineHistoryResponseMachines> value)
            {
                _Machines = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MachineHistoryResponse.
            /// </summary>
            /// <returns>MachineHistoryResponse</returns>
            public MachineHistoryResponse Build()
            {
                Validate();
                return new MachineHistoryResponse(
                    Machines: _Machines
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}