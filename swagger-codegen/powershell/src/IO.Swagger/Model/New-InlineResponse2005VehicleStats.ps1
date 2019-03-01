function New-InlineResponse2005VehicleStats {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AuxInputSeries]]
        ${auxInput1},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AuxInputSeries]]
        ${auxInput2},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.EngineState[]]]
        ${engineState},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2005VehicleStats' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2005VehicleStats -ArgumentList @(
            ${auxInput1},
            ${auxInput2},
            ${engineState},
            ${vehicleId}
        )
    }
}
