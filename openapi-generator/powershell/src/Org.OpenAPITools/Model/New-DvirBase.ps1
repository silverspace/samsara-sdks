function New-DvirBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBaseAuthorSignature]]
        ${authorSignature},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${defectsCorrected},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${defectsNeedNotBeCorrected},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${inspectionType},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${mechanicNotes},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBaseMechanicOrAgentSignature]]
        ${mechanicOrAgentSignature},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBaseNextDriverSignature]]
        ${nextDriverSignature},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${odometerMiles},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeMs},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBaseTrailerDefects[]]]
        ${trailerDefects},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${trailerId},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${trailerName},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBaseVehicle]]
        ${vehicle},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vehicleCondition},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBaseTrailerDefects[]]]
        ${vehicleDefects}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DvirBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DvirBase -ArgumentList @(
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
