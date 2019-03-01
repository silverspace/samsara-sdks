using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// The previous state of the dispatch job.
    /// </summary>
    /// <value>The previous state of the dispatch job.</value>
    public enum PrevJobStatus
    {
        
        /// <summary>
        /// Enum Unassigned
        /// </summary>
        Unassigned = 1,
        
        /// <summary>
        /// Enum Scheduled
        /// </summary>
        Scheduled = 2,
        
        /// <summary>
        /// Enum EnRoute
        /// </summary>
        EnRoute = 3,
        
        /// <summary>
        /// Enum Arrived
        /// </summary>
        Arrived = 4,
        
        /// <summary>
        /// Enum Completed
        /// </summary>
        Completed = 5,
        
        /// <summary>
        /// Enum Skipped
        /// </summary>
        Skipped = 6
    }

}