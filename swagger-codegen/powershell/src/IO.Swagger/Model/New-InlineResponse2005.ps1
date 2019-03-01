function New-InlineResponse2005 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Pagination]]
        ${pagination},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.InlineResponse2005VehicleStats[]]
        ${vehicleStats}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2005' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2005 -ArgumentList @(
            ${pagination},
            ${vehicleStats}
        )
    }
}
