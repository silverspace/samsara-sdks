using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Information about a notification contact for alerts.
    /// </summary>
    public sealed class Contact:  IEquatable<Contact>
    { 
        /// <summary>
        /// Email address of the contact
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// First name of the contact
        /// </summary>
        public string FirstName { get; private set; }

        /// <summary>
        /// ID of the contact
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Last name of the contact
        /// </summary>
        public string LastName { get; private set; }

        /// <summary>
        /// Phone number of the contact
        /// </summary>
        public string Phone { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Contact.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Contact()
        {
        }

        private Contact(string Email, string FirstName, long? Id, string LastName, string Phone)
        {
            
            this.Email = Email;
            
            this.FirstName = FirstName;
            
            this.Id = Id;
            
            this.LastName = LastName;
            
            this.Phone = Phone;
            
        }

        /// <summary>
        /// Returns builder of Contact.
        /// </summary>
        /// <returns>ContactBuilder</returns>
        public static ContactBuilder Builder()
        {
            return new ContactBuilder();
        }

        /// <summary>
        /// Returns ContactBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ContactBuilder</returns>
        public ContactBuilder With()
        {
            return Builder()
                .Email(Email)
                .FirstName(FirstName)
                .Id(Id)
                .LastName(LastName)
                .Phone(Phone);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Contact other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Contact.
        /// </summary>
        /// <param name="left">Compared (Contact</param>
        /// <param name="right">Compared (Contact</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Contact left, Contact right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Contact.
        /// </summary>
        /// <param name="left">Compared (Contact</param>
        /// <param name="right">Compared (Contact</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Contact left, Contact right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Contact.
        /// </summary>
        public sealed class ContactBuilder
        {
            private string _Email;
            private string _FirstName;
            private long? _Id;
            private string _LastName;
            private string _Phone;

            internal ContactBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Contact.Email property.
            /// </summary>
            /// <param name="value">Email address of the contact</param>
            public ContactBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for Contact.FirstName property.
            /// </summary>
            /// <param name="value">First name of the contact</param>
            public ContactBuilder FirstName(string value)
            {
                _FirstName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Contact.Id property.
            /// </summary>
            /// <param name="value">ID of the contact</param>
            public ContactBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Contact.LastName property.
            /// </summary>
            /// <param name="value">Last name of the contact</param>
            public ContactBuilder LastName(string value)
            {
                _LastName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Contact.Phone property.
            /// </summary>
            /// <param name="value">Phone number of the contact</param>
            public ContactBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Contact.
            /// </summary>
            /// <returns>Contact</returns>
            public Contact Build()
            {
                Validate();
                return new Contact(
                    Email: _Email,
                    FirstName: _FirstName,
                    Id: _Id,
                    LastName: _LastName,
                    Phone: _Phone
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}