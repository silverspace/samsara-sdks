function New-FleetVehicleResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[{String, String}]]
        ${externalIds},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${harshAccelSetting},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.FleetVehicleResponseVehicleInfo]]
        ${vehicleInfo}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.FleetVehicleResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.FleetVehicleResponse -ArgumentList @(
            ${externalIds},
            ${harshAccelSetting},
            ${id},
            ${name},
            ${vehicleInfo}
        )
    }
}
