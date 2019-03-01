using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TagModify
    /// </summary>
    public sealed class TagModify:  IEquatable<TagModify>
    { 
        /// <summary>
        /// Add
        /// </summary>
        public TagModifyAdd Add { get; private set; }

        /// <summary>
        /// Delete
        /// </summary>
        public TagModifyDelete Delete { get; private set; }

        /// <summary>
        /// Updated name of this tag.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
        /// </summary>
        public long? ParentTagId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TagModify.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TagModify()
        {
        }

        private TagModify(TagModifyAdd Add, TagModifyDelete Delete, string Name, long? ParentTagId)
        {
            
            this.Add = Add;
            
            this.Delete = Delete;
            
            this.Name = Name;
            
            this.ParentTagId = ParentTagId;
            
        }

        /// <summary>
        /// Returns builder of TagModify.
        /// </summary>
        /// <returns>TagModifyBuilder</returns>
        public static TagModifyBuilder Builder()
        {
            return new TagModifyBuilder();
        }

        /// <summary>
        /// Returns TagModifyBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagModifyBuilder</returns>
        public TagModifyBuilder With()
        {
            return Builder()
                .Add(Add)
                .Delete(Delete)
                .Name(Name)
                .ParentTagId(ParentTagId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TagModify other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TagModify.
        /// </summary>
        /// <param name="left">Compared (TagModify</param>
        /// <param name="right">Compared (TagModify</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TagModify left, TagModify right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TagModify.
        /// </summary>
        /// <param name="left">Compared (TagModify</param>
        /// <param name="right">Compared (TagModify</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TagModify left, TagModify right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TagModify.
        /// </summary>
        public sealed class TagModifyBuilder
        {
            private TagModifyAdd _Add;
            private TagModifyDelete _Delete;
            private string _Name;
            private long? _ParentTagId;

            internal TagModifyBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TagModify.Add property.
            /// </summary>
            /// <param name="value">Add</param>
            public TagModifyBuilder Add(TagModifyAdd value)
            {
                _Add = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModify.Delete property.
            /// </summary>
            /// <param name="value">Delete</param>
            public TagModifyBuilder Delete(TagModifyDelete value)
            {
                _Delete = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModify.Name property.
            /// </summary>
            /// <param name="value">Updated name of this tag.</param>
            public TagModifyBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModify.ParentTagId property.
            /// </summary>
            /// <param name="value">If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.</param>
            public TagModifyBuilder ParentTagId(long? value)
            {
                _ParentTagId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TagModify.
            /// </summary>
            /// <returns>TagModify</returns>
            public TagModify Build()
            {
                Validate();
                return new TagModify(
                    Add: _Add,
                    Delete: _Delete,
                    Name: _Name,
                    ParentTagId: _ParentTagId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}