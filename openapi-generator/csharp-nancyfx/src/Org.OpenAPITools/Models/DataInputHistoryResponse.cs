using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DataInputHistoryResponse
    /// </summary>
    public sealed class DataInputHistoryResponse:  IEquatable<DataInputHistoryResponse>
    { 
        /// <summary>
        /// The ID of this data input
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of this data input
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Data points from this data input
        /// </summary>
        public List<DataInputHistoryResponsePoints> Points { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DataInputHistoryResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DataInputHistoryResponse()
        {
        }

        private DataInputHistoryResponse(long? Id, string Name, List<DataInputHistoryResponsePoints> Points)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Points = Points;
            
        }

        /// <summary>
        /// Returns builder of DataInputHistoryResponse.
        /// </summary>
        /// <returns>DataInputHistoryResponseBuilder</returns>
        public static DataInputHistoryResponseBuilder Builder()
        {
            return new DataInputHistoryResponseBuilder();
        }

        /// <summary>
        /// Returns DataInputHistoryResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DataInputHistoryResponseBuilder</returns>
        public DataInputHistoryResponseBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Points(Points);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DataInputHistoryResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DataInputHistoryResponse.
        /// </summary>
        /// <param name="left">Compared (DataInputHistoryResponse</param>
        /// <param name="right">Compared (DataInputHistoryResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DataInputHistoryResponse left, DataInputHistoryResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DataInputHistoryResponse.
        /// </summary>
        /// <param name="left">Compared (DataInputHistoryResponse</param>
        /// <param name="right">Compared (DataInputHistoryResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DataInputHistoryResponse left, DataInputHistoryResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DataInputHistoryResponse.
        /// </summary>
        public sealed class DataInputHistoryResponseBuilder
        {
            private long? _Id;
            private string _Name;
            private List<DataInputHistoryResponsePoints> _Points;

            internal DataInputHistoryResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DataInputHistoryResponse.Id property.
            /// </summary>
            /// <param name="value">The ID of this data input</param>
            public DataInputHistoryResponseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for DataInputHistoryResponse.Name property.
            /// </summary>
            /// <param name="value">Name of this data input</param>
            public DataInputHistoryResponseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DataInputHistoryResponse.Points property.
            /// </summary>
            /// <param name="value">Data points from this data input</param>
            public DataInputHistoryResponseBuilder Points(List<DataInputHistoryResponsePoints> value)
            {
                _Points = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DataInputHistoryResponse.
            /// </summary>
            /// <returns>DataInputHistoryResponse</returns>
            public DataInputHistoryResponse Build()
            {
                Validate();
                return new DataInputHistoryResponse(
                    Id: _Id,
                    Name: _Name,
                    Points: _Points
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DataInputHistoryResponse and cannot be null");
                } 
            }
        }

        
    }
}