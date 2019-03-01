using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// The authors signature for the DVIR.
    /// </summary>
    public sealed class DvirBaseAuthorSignature:  IEquatable<DvirBaseAuthorSignature>
    { 
        /// <summary>
        /// ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
        /// </summary>
        public long? MechanicUserId { get; private set; }

        /// <summary>
        /// ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// The name of the driver or mechanic who signed the DVIR.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The time in millis when the DVIR was signed
        /// </summary>
        public long? SignedAt { get; private set; }

        /// <summary>
        /// Type corresponds to whether the signature corresponds to driver|mechanic.
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// Email of the  driver|mechanic who signed the DVIR.
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// Username of the  driver|mechanic who signed the DVIR.
        /// </summary>
        public string Username { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DvirBaseAuthorSignature.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DvirBaseAuthorSignature()
        {
        }

        private DvirBaseAuthorSignature(long? MechanicUserId, long? DriverId, string Name, long? SignedAt, string Type, string Email, string Username)
        {
            
            this.MechanicUserId = MechanicUserId;
            
            this.DriverId = DriverId;
            
            this.Name = Name;
            
            this.SignedAt = SignedAt;
            
            this.Type = Type;
            
            this.Email = Email;
            
            this.Username = Username;
            
        }

        /// <summary>
        /// Returns builder of DvirBaseAuthorSignature.
        /// </summary>
        /// <returns>DvirBaseAuthorSignatureBuilder</returns>
        public static DvirBaseAuthorSignatureBuilder Builder()
        {
            return new DvirBaseAuthorSignatureBuilder();
        }

        /// <summary>
        /// Returns DvirBaseAuthorSignatureBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DvirBaseAuthorSignatureBuilder</returns>
        public DvirBaseAuthorSignatureBuilder With()
        {
            return Builder()
                .MechanicUserId(MechanicUserId)
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

        public bool Equals(DvirBaseAuthorSignature other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DvirBaseAuthorSignature.
        /// </summary>
        /// <param name="left">Compared (DvirBaseAuthorSignature</param>
        /// <param name="right">Compared (DvirBaseAuthorSignature</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DvirBaseAuthorSignature left, DvirBaseAuthorSignature right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DvirBaseAuthorSignature.
        /// </summary>
        /// <param name="left">Compared (DvirBaseAuthorSignature</param>
        /// <param name="right">Compared (DvirBaseAuthorSignature</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DvirBaseAuthorSignature left, DvirBaseAuthorSignature right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DvirBaseAuthorSignature.
        /// </summary>
        public sealed class DvirBaseAuthorSignatureBuilder
        {
            private long? _MechanicUserId;
            private long? _DriverId;
            private string _Name;
            private long? _SignedAt;
            private string _Type;
            private string _Email;
            private string _Username;

            internal DvirBaseAuthorSignatureBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.MechanicUserId property.
            /// </summary>
            /// <param name="value">ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.</param>
            public DvirBaseAuthorSignatureBuilder MechanicUserId(long? value)
            {
                _MechanicUserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.</param>
            public DvirBaseAuthorSignatureBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.Name property.
            /// </summary>
            /// <param name="value">The name of the driver or mechanic who signed the DVIR.</param>
            public DvirBaseAuthorSignatureBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.SignedAt property.
            /// </summary>
            /// <param name="value">The time in millis when the DVIR was signed</param>
            public DvirBaseAuthorSignatureBuilder SignedAt(long? value)
            {
                _SignedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.Type property.
            /// </summary>
            /// <param name="value">Type corresponds to whether the signature corresponds to driver|mechanic.</param>
            public DvirBaseAuthorSignatureBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.Email property.
            /// </summary>
            /// <param name="value">Email of the  driver|mechanic who signed the DVIR.</param>
            public DvirBaseAuthorSignatureBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseAuthorSignature.Username property.
            /// </summary>
            /// <param name="value">Username of the  driver|mechanic who signed the DVIR.</param>
            public DvirBaseAuthorSignatureBuilder Username(string value)
            {
                _Username = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DvirBaseAuthorSignature.
            /// </summary>
            /// <returns>DvirBaseAuthorSignature</returns>
            public DvirBaseAuthorSignature Build()
            {
                Validate();
                return new DvirBaseAuthorSignature(
                    MechanicUserId: _MechanicUserId,
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