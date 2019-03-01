function New-VehicleMaintenanceJ1939CheckEngineLight {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${protectIsOn},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${stopIsOn},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${warningIsOn},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${emissionsIsOn}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenanceJ1939CheckEngineLight' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenanceJ1939CheckEngineLight -ArgumentList @(
            ${protectIsOn},
            ${stopIsOn},
            ${warningIsOn},
            ${emissionsIsOn}
        )
    }
}
