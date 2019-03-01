using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// The next driver signature for the DVIR.
    /// </summary>
    public sealed class DvirBaseNextDriverSignature:  IEquatable<DvirBaseNextDriverSignature>
    { 
        /// <summary>
        /// ID of the driver who signed the DVIR
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// The name of the driver who signed the next DVIR on this vehicle.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The time in millis when the next driver signed the DVIR on this vehicle.
        /// </summary>
        public long? SignedAt { get; private set; }

        /// <summary>
        /// Type corresponds to driver.
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// Email of the  driver who signed the next DVIR on this vehicle.
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// Username of the  driver who signed the next DVIR on this vehicle.
        /// </summary>
        public string Username { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DvirBaseNextDriverSignature.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DvirBaseNextDriverSignature()
        {
        }

        private DvirBaseNextDriverSignature(long? DriverId, string Name, long? SignedAt, string Type, string Email, string Username)
        {
            
            this.DriverId = DriverId;
            
            this.Name = Name;
            
            this.SignedAt = SignedAt;
            
            this.Type = Type;
            
            this.Email = Email;
            
            this.Username = Username;
            
        }

        /// <summary>
        /// Returns builder of DvirBaseNextDriverSignature.
        /// </summary>
        /// <returns>DvirBaseNextDriverSignatureBuilder</returns>
        public static DvirBaseNextDriverSignatureBuilder Builder()
        {
            return new DvirBaseNextDriverSignatureBuilder();
        }

        /// <summary>
        /// Returns DvirBaseNextDriverSignatureBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DvirBaseNextDriverSignatureBuilder</returns>
        public DvirBaseNextDriverSignatureBuilder With()
        {
            return Builder()
                .DriverId(DriverId)
                .Name(Name)
                .SignedAt(SignedAt)
                .Type(Type)
                .Email(Email)
                .Username(Username);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DvirBaseNextDriverSignature other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DvirBaseNextDriverSignature.
        /// </summary>
        /// <param name="left">Compared (DvirBaseNextDriverSignature</param>
        /// <param name="right">Compared (DvirBaseNextDriverSignature</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DvirBaseNextDriverSignature left, DvirBaseNextDriverSignature right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DvirBaseNextDriverSignature.
        /// </summary>
        /// <param name="left">Compared (DvirBaseNextDriverSignature</param>
        /// <param name="right">Compared (DvirBaseNextDriverSignature</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DvirBaseNextDriverSignature left, DvirBaseNextDriverSignature right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DvirBaseNextDriverSignature.
        /// </summary>
        public sealed class DvirBaseNextDriverSignatureBuilder
        {
            private long? _DriverId;
            private string _Name;
            private long? _SignedAt;
            private string _Type;
            private string _Email;
            private string _Username;

            internal DvirBaseNextDriverSignatureBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DvirBaseNextDriverSignature.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver who signed the DVIR</param>
            public DvirBaseNextDriverSignatureBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseNextDriverSignature.Name property.
            /// </summary>
            /// <param name="value">The name of the driver who signed the next DVIR on this vehicle.</param>
            public DvirBaseNextDriverSignatureBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseNextDriverSignature.SignedAt property.
            /// </summary>
            /// <param name="value">The time in millis when the next driver signed the DVIR on this vehicle.</param>
            public DvirBaseNextDriverSignatureBuilder SignedAt(long? value)
            {
                _SignedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseNextDriverSignature.Type property.
            /// </summary>
            /// <param name="value">Type corresponds to driver.</param>
            public DvirBaseNextDriverSignatureBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseNextDriverSignature.Email property.
            /// </summary>
            /// <param name="value">Email of the  driver who signed the next DVIR on this vehicle.</param>
            public DvirBaseNextDriverSignatureBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseNextDriverSignature.Username property.
            /// </summary>
            /// <param name="value">Username of the  driver who signed the next DVIR on this vehicle.</param>
            public DvirBaseNextDriverSignatureBuilder Username(string value)
            {
                _Username = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DvirBaseNextDriverSignature.
            /// </summary>
            /// <returns>DvirBaseNextDriverSignature</returns>
            public DvirBaseNextDriverSignature Build()
            {
                Validate();
                return new DvirBaseNextDriverSignature(
                    DriverId: _DriverId,
                    Name: _Name,
                    SignedAt: _SignedAt,
                    Type: _Type,
                    Email: _Email,
                    Username: _Username
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}