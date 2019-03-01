using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Pagination
    /// </summary>
    public sealed class Pagination:  IEquatable<Pagination>
    { 
        /// <summary>
        /// Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.
        /// </summary>
        public string EndCursor { get; private set; }

        /// <summary>
        /// True if there are more pages of results after this response.
        /// </summary>
        public bool? HasNextPage { get; private set; }

        /// <summary>
        /// True if there are more pages of results before this response.
        /// </summary>
        public bool? HasPrevPage { get; private set; }

        /// <summary>
        /// Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.
        /// </summary>
        public string StartCursor { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Pagination.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Pagination()
        {
        }

        private Pagination(string EndCursor, bool? HasNextPage, bool? HasPrevPage, string StartCursor)
        {
            
            this.EndCursor = EndCursor;
            
            this.HasNextPage = HasNextPage;
            
            this.HasPrevPage = HasPrevPage;
            
            this.StartCursor = StartCursor;
            
        }

        /// <summary>
        /// Returns builder of Pagination.
        /// </summary>
        /// <returns>PaginationBuilder</returns>
        public static PaginationBuilder Builder()
        {
            return new PaginationBuilder();
        }

        /// <summary>
        /// Returns PaginationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PaginationBuilder</returns>
        public PaginationBuilder With()
        {
            return Builder()
                .EndCursor(EndCursor)
                .HasNextPage(HasNextPage)
                .HasPrevPage(HasPrevPage)
                .StartCursor(StartCursor);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Pagination other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Pagination.
        /// </summary>
        /// <param name="left">Compared (Pagination</param>
        /// <param name="right">Compared (Pagination</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Pagination left, Pagination right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Pagination.
        /// </summary>
        /// <param name="left">Compared (Pagination</param>
        /// <param name="right">Compared (Pagination</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Pagination left, Pagination right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Pagination.
        /// </summary>
        public sealed class PaginationBuilder
        {
            private string _EndCursor;
            private bool? _HasNextPage;
            private bool? _HasPrevPage;
            private string _StartCursor;

            internal PaginationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Pagination.EndCursor property.
            /// </summary>
            /// <param name="value">Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.</param>
            public PaginationBuilder EndCursor(string value)
            {
                _EndCursor = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pagination.HasNextPage property.
            /// </summary>
            /// <param name="value">True if there are more pages of results after this response.</param>
            public PaginationBuilder HasNextPage(bool? value)
            {
                _HasNextPage = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pagination.HasPrevPage property.
            /// </summary>
            /// <param name="value">True if there are more pages of results before this response.</param>
            public PaginationBuilder HasPrevPage(bool? value)
            {
                _HasPrevPage = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pagination.StartCursor property.
            /// </summary>
            /// <param name="value">Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.</param>
            public PaginationBuilder StartCursor(string value)
            {
                _StartCursor = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Pagination.
            /// </summary>
            /// <returns>Pagination</returns>
            public Pagination Build()
            {
                Validate();
                return new Pagination(
                    EndCursor: _EndCursor,
                    HasNextPage: _HasNextPage,
                    HasPrevPage: _HasPrevPage,
                    StartCursor: _StartCursor
                );
            }

            private void Validate()
            { 
                if (_EndCursor == null)
                {
                    throw new ArgumentException("EndCursor is a required property for Pagination and cannot be null");
                } 
                if (_HasNextPage == null)
                {
                    throw new ArgumentException("HasNextPage is a required property for Pagination and cannot be null");
                } 
                if (_HasPrevPage == null)
                {
                    throw new ArgumentException("HasPrevPage is a required property for Pagination and cannot be null");
                } 
                if (_StartCursor == null)
                {
                    throw new ArgumentException("StartCursor is a required property for Pagination and cannot be null");
                } 
            }
        }

        
    }
}