function New-InlineResponse2005VehicleStats {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.EngineState[]]]
        ${engineState},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AuxInputSeries]]
        ${auxInput2},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AuxInputSeries]]
        ${auxInput1}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2005VehicleStats' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2005VehicleStats -ArgumentList @(
            ${engineState},
            ${auxInput2},
            ${vehicleId},
            ${auxInput1}
        )
    }
}
