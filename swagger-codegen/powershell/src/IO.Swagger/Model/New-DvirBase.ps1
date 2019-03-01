function New-DvirBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBaseAuthorSignature]]
        ${authorSignature},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${defectsCorrected},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${defectsNeedNotBeCorrected},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${inspectionType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${mechanicNotes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBaseMechanicOrAgentSignature]]
        ${mechanicOrAgentSignature},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBaseNextDriverSignature]]
        ${nextDriverSignature},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${odometerMiles},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBaseTrailerDefects[]]]
        ${trailerDefects},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${trailerId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${trailerName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBaseVehicle]]
        ${vehicle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vehicleCondition},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBaseTrailerDefects[]]]
        ${vehicleDefects}
    )

    Process {
        'Creating object: samsara.Model.DvirBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DvirBase -ArgumentList @(
            ${authorSignature},
            ${defectsCorrected},
            ${defectsNeedNotBeCorrected},
            ${id},
            ${inspectionType},
            ${mechanicNotes},
            ${mechanicOrAgentSignature},
            ${nextDriverSignature},
            ${odometerMiles},
            ${timeMs},
            ${trailerDefects},
            ${trailerId},
            ${trailerName},
            ${vehicle},
            ${vehicleCondition},
            ${vehicleDefects}
        )
    }
}
