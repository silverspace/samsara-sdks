using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsAlarms
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsAlarms:  IEquatable<AssetReeferResponseReeferStatsAlarms>
    { 
        /// <summary>
        /// Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
        /// </summary>
        public long? Severity { get; private set; }

        /// <summary>
        /// Recommended operator action
        /// </summary>
        public string OperatorAction { get; private set; }

        /// <summary>
        /// Description of the alarm
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// ID of the alarm
        /// </summary>
        public long? AlarmCode { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsAlarms.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsAlarms()
        {
        }

        private AssetReeferResponseReeferStatsAlarms(long? Severity, string OperatorAction, string Description, long? AlarmCode)
        {
            
            this.Severity = Severity;
            
            this.OperatorAction = OperatorAction;
            
            this.Description = Description;
            
            this.AlarmCode = AlarmCode;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsAlarms.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsAlarmsBuilder</returns>
        public static AssetReeferResponseReeferStatsAlarmsBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsAlarmsBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsAlarmsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsAlarmsBuilder</returns>
        public AssetReeferResponseReeferStatsAlarmsBuilder With()
        {
            return Builder()
                .Severity(Severity)
                .OperatorAction(OperatorAction)
                .Description(Description)
                .AlarmCode(AlarmCode);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AssetReeferResponseReeferStatsAlarms other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsAlarms.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsAlarms</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsAlarms</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsAlarms left, AssetReeferResponseReeferStatsAlarms right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsAlarms.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsAlarms</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsAlarms</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsAlarms left, AssetReeferResponseReeferStatsAlarms right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsAlarms.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsAlarmsBuilder
        {
            private long? _Severity;
            private string _OperatorAction;
            private string _Description;
            private long? _AlarmCode;

            internal AssetReeferResponseReeferStatsAlarmsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsAlarms.Severity property.
            /// </summary>
            /// <param name="value">Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action</param>
            public AssetReeferResponseReeferStatsAlarmsBuilder Severity(long? value)
            {
                _Severity = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsAlarms.OperatorAction property.
            /// </summary>
            /// <param name="value">Recommended operator action</param>
            public AssetReeferResponseReeferStatsAlarmsBuilder OperatorAction(string value)
            {
                _OperatorAction = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsAlarms.Description property.
            /// </summary>
            /// <param name="value">Description of the alarm</param>
            public AssetReeferResponseReeferStatsAlarmsBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsAlarms.AlarmCode property.
            /// </summary>
            /// <param name="value">ID of the alarm</param>
            public AssetReeferResponseReeferStatsAlarmsBuilder AlarmCode(long? value)
            {
                _AlarmCode = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsAlarms.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsAlarms</returns>
            public AssetReeferResponseReeferStatsAlarms Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsAlarms(
                    Severity: _Severity,
                    OperatorAction: _OperatorAction,
                    Description: _Description,
                    AlarmCode: _AlarmCode
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}