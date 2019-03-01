function New-InlineObject12 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${inspectionType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${mechanicNotes},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${odometerMiles},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${previousDefectsCorrected},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${previousDefectsIgnored},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${safe},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${trailerId},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${userEmail},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${vehicleId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject12' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject12 -ArgumentList @(
            ${inspectionType},
            ${mechanicNotes},
            ${odometerMiles},
            ${previousDefectsCorrected},
            ${previousDefectsIgnored},
            ${safe},
            ${trailerId},
            ${userEmail},
            ${vehicleId}
        )
    }
}
