using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains information about a machine.
    /// </summary>
    public sealed class Machine:  IEquatable<Machine>
    { 
        /// <summary>
        /// ID of the machine.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the machine.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Notes about the machine
        /// </summary>
        public string Notes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Machine.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Machine()
        {
        }

        private Machine(long? Id, string Name, string Notes)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Notes = Notes;
            
        }

        /// <summary>
        /// Returns builder of Machine.
        /// </summary>
        /// <returns>MachineBuilder</returns>
        public static MachineBuilder Builder()
        {
            return new MachineBuilder();
        }

        /// <summary>
        /// Returns MachineBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MachineBuilder</returns>
        public MachineBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Notes(Notes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Machine other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Machine.
        /// </summary>
        /// <param name="left">Compared (Machine</param>
        /// <param name="right">Compared (Machine</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Machine left, Machine right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Machine.
        /// </summary>
        /// <param name="left">Compared (Machine</param>
        /// <param name="right">Compared (Machine</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Machine left, Machine right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Machine.
        /// </summary>
        public sealed class MachineBuilder
        {
            private long? _Id;
            private string _Name;
            private string _Notes;

            internal MachineBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Machine.Id property.
            /// </summary>
            /// <param name="value">ID of the machine.</param>
            public MachineBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Machine.Name property.
            /// </summary>
            /// <param name="value">Name of the machine.</param>
            public MachineBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Machine.Notes property.
            /// </summary>
            /// <param name="value">Notes about the machine</param>
            public MachineBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Machine.
            /// </summary>
            /// <returns>Machine</returns>
            public Machine Build()
            {
                Validate();
                return new Machine(
                    Id: _Id,
                    Name: _Name,
                    Notes: _Notes
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for Machine and cannot be null");
                } 
            }
        }

        
    }
}