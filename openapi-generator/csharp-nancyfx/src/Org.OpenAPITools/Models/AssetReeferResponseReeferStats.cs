using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStats
    /// </summary>
    public sealed class AssetReeferResponseReeferStats:  IEquatable<AssetReeferResponseReeferStats>
    { 
        /// <summary>
        /// Fuel percentage of the reefer
        /// </summary>
        public List<AssetReeferResponseReeferStatsFuelPercentage> FuelPercentage { get; private set; }

        /// <summary>
        /// Power status of the reefer
        /// </summary>
        public List<AssetReeferResponseReeferStatsPowerStatus> PowerStatus { get; private set; }

        /// <summary>
        /// Engine hours of the reefer
        /// </summary>
        public List<AssetReeferResponseReeferStatsEngineHours> EngineHours { get; private set; }

        /// <summary>
        /// Set point temperature of the reefer
        /// </summary>
        public List<AssetReeferResponseReeferStatsSetPoint> SetPoint { get; private set; }

        /// <summary>
        /// Return air temperature of the reefer
        /// </summary>
        public List<AssetReeferResponseReeferStatsReturnAirTemp> ReturnAirTemp { get; private set; }

        /// <summary>
        /// Reefer alarms
        /// </summary>
        public List<AssetReeferResponseReeferStatsAlarms1> Alarms { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStats.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStats()
        {
        }

        private AssetReeferResponseReeferStats(List<AssetReeferResponseReeferStatsFuelPercentage> FuelPercentage, List<AssetReeferResponseReeferStatsPowerStatus> PowerStatus, List<AssetReeferResponseReeferStatsEngineHours> EngineHours, List<AssetReeferResponseReeferStatsSetPoint> SetPoint, List<AssetReeferResponseReeferStatsReturnAirTemp> ReturnAirTemp, List<AssetReeferResponseReeferStatsAlarms1> Alarms)
        {
            
            this.FuelPercentage = FuelPercentage;
            
            this.PowerStatus = PowerStatus;
            
            this.EngineHours = EngineHours;
            
            this.SetPoint = SetPoint;
            
            this.ReturnAirTemp = ReturnAirTemp;
            
            this.Alarms = Alarms;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStats.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsBuilder</returns>
        public static AssetReeferResponseReeferStatsBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsBuilder</returns>
        public AssetReeferResponseReeferStatsBuilder With()
        {
            return Builder()
                .FuelPercentage(FuelPercentage)
                .PowerStatus(PowerStatus)
                .EngineHours(EngineHours)
                .SetPoint(SetPoint)
                .ReturnAirTemp(ReturnAirTemp)
                .Alarms(Alarms);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AssetReeferResponseReeferStats other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStats.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStats</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStats</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStats left, AssetReeferResponseReeferStats right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStats.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStats</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStats</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStats left, AssetReeferResponseReeferStats right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStats.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsBuilder
        {
            private List<AssetReeferResponseReeferStatsFuelPercentage> _FuelPercentage;
            private List<AssetReeferResponseReeferStatsPowerStatus> _PowerStatus;
            private List<AssetReeferResponseReeferStatsEngineHours> _EngineHours;
            private List<AssetReeferResponseReeferStatsSetPoint> _SetPoint;
            private List<AssetReeferResponseReeferStatsReturnAirTemp> _ReturnAirTemp;
            private List<AssetReeferResponseReeferStatsAlarms1> _Alarms;

            internal AssetReeferResponseReeferStatsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStats.FuelPercentage property.
            /// </summary>
            /// <param name="value">Fuel percentage of the reefer</param>
            public AssetReeferResponseReeferStatsBuilder FuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> value)
            {
                _FuelPercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStats.PowerStatus property.
            /// </summary>
            /// <param name="value">Power status of the reefer</param>
            public AssetReeferResponseReeferStatsBuilder PowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> value)
            {
                _PowerStatus = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStats.EngineHours property.
            /// </summary>
            /// <param name="value">Engine hours of the reefer</param>
            public AssetReeferResponseReeferStatsBuilder EngineHours(List<AssetReeferResponseReeferStatsEngineHours> value)
            {
                _EngineHours = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStats.SetPoint property.
            /// </summary>
            /// <param name="value">Set point temperature of the reefer</param>
            public AssetReeferResponseReeferStatsBuilder SetPoint(List<AssetReeferResponseReeferStatsSetPoint> value)
            {
                _SetPoint = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStats.ReturnAirTemp property.
            /// </summary>
            /// <param name="value">Return air temperature of the reefer</param>
            public AssetReeferResponseReeferStatsBuilder ReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> value)
            {
                _ReturnAirTemp = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStats.Alarms property.
            /// </summary>
            /// <param name="value">Reefer alarms</param>
            public AssetReeferResponseReeferStatsBuilder Alarms(List<AssetReeferResponseReeferStatsAlarms1> value)
            {
                _Alarms = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStats.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStats</returns>
            public AssetReeferResponseReeferStats Build()
            {
                Validate();
                return new AssetReeferResponseReeferStats(
                    FuelPercentage: _FuelPercentage,
                    PowerStatus: _PowerStatus,
                    EngineHours: _EngineHours,
                    SetPoint: _SetPoint,
                    ReturnAirTemp: _ReturnAirTemp,
                    Alarms: _Alarms
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}