function New-FleetVehicleResponseVehicleInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${year},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${model},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vin},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${make}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.FleetVehicleResponseVehicleInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.FleetVehicleResponseVehicleInfo -ArgumentList @(
            ${year},
            ${model},
            ${vin},
            ${make}
        )
    }
}
