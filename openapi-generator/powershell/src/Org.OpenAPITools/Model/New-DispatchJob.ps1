function New-DispatchJob {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${destinationUnderscoreaddress},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${destinationUnderscoreaddressUnderscoreid},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${destinationUnderscorelat},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${destinationUnderscorelng},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${destinationUnderscorename},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduledUnderscorearrivalUnderscoretimeUnderscorems},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${scheduledUnderscoredepartureUnderscoretimeUnderscorems},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${arrivedUnderscoreatUnderscorems},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${completedUnderscoreatUnderscorems},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${dispatchUnderscorerouteUnderscoreid},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverUnderscoreid},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${enUnderscorerouteUnderscoreatUnderscorems},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${estimatedUnderscorearrivalUnderscorems},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fleetUnderscoreviewerUnderscoreurl},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupUnderscoreid},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.JobStatus]
        ${jobUnderscorestate},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${skippedUnderscoreatUnderscorems},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DispatchJob' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DispatchJob -ArgumentList @(
            ${destinationUnderscoreaddress},
            ${destinationUnderscoreaddressUnderscoreid},
            ${destinationUnderscorelat},
            ${destinationUnderscorelng},
            ${destinationUnderscorename},
            ${notes},
            ${scheduledUnderscorearrivalUnderscoretimeUnderscorems},
            ${scheduledUnderscoredepartureUnderscoretimeUnderscorems},
            ${arrivedUnderscoreatUnderscorems},
            ${completedUnderscoreatUnderscorems},
            ${dispatchUnderscorerouteUnderscoreid},
            ${driverUnderscoreid},
            ${enUnderscorerouteUnderscoreatUnderscorems},
            ${estimatedUnderscorearrivalUnderscorems},
            ${fleetUnderscoreviewerUnderscoreurl},
            ${groupUnderscoreid},
            ${id},
            ${jobUnderscorestate},
            ${skippedUnderscoreatUnderscorems},
            ${vehicleUnderscoreid}
        )
    }
}
