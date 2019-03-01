using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// MachineHistoryResponseMachines
    /// </summary>
    public sealed class MachineHistoryResponseMachines:  IEquatable<MachineHistoryResponseMachines>
    { 
        /// <summary>
        /// Machine name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Machine ID
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
        /// </summary>
        public List<MachineHistoryResponseVibrations> Vibrations { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MachineHistoryResponseMachines.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MachineHistoryResponseMachines()
        {
        }

        private MachineHistoryResponseMachines(string Name, int? Id, List<MachineHistoryResponseVibrations> Vibrations)
        {
            
            this.Name = Name;
            
            this.Id = Id;
            
            this.Vibrations = Vibrations;
            
        }

        /// <summary>
        /// Returns builder of MachineHistoryResponseMachines.
        /// </summary>
        /// <returns>MachineHistoryResponseMachinesBuilder</returns>
        public static MachineHistoryResponseMachinesBuilder Builder()
        {
            return new MachineHistoryResponseMachinesBuilder();
        }

        /// <summary>
        /// Returns MachineHistoryResponseMachinesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MachineHistoryResponseMachinesBuilder</returns>
        public MachineHistoryResponseMachinesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Id(Id)
                .Vibrations(Vibrations);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MachineHistoryResponseMachines other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MachineHistoryResponseMachines.
        /// </summary>
        /// <param name="left">Compared (MachineHistoryResponseMachines</param>
        /// <param name="right">Compared (MachineHistoryResponseMachines</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MachineHistoryResponseMachines left, MachineHistoryResponseMachines right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MachineHistoryResponseMachines.
        /// </summary>
        /// <param name="left">Compared (MachineHistoryResponseMachines</param>
        /// <param name="right">Compared (MachineHistoryResponseMachines</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MachineHistoryResponseMachines left, MachineHistoryResponseMachines right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MachineHistoryResponseMachines.
        /// </summary>
        public sealed class MachineHistoryResponseMachinesBuilder
        {
            private string _Name;
            private int? _Id;
            private List<MachineHistoryResponseVibrations> _Vibrations;

            internal MachineHistoryResponseMachinesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseMachines.Name property.
            /// </summary>
            /// <param name="value">Machine name</param>
            public MachineHistoryResponseMachinesBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseMachines.Id property.
            /// </summary>
            /// <param name="value">Machine ID</param>
            public MachineHistoryResponseMachinesBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseMachines.Vibrations property.
            /// </summary>
            /// <param name="value">List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s</param>
            public MachineHistoryResponseMachinesBuilder Vibrations(List<MachineHistoryResponseVibrations> value)
            {
                _Vibrations = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MachineHistoryResponseMachines.
            /// </summary>
            /// <returns>MachineHistoryResponseMachines</returns>
            public MachineHistoryResponseMachines Build()
            {
                Validate();
                return new MachineHistoryResponseMachines(
                    Name: _Name,
                    Id: _Id,
                    Vibrations: _Vibrations
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}