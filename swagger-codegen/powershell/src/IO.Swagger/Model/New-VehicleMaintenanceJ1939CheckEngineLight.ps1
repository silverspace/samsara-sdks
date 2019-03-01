function New-VehicleMaintenanceJ1939CheckEngineLight {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${emissionsIsOn},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${protectIsOn},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${stopIsOn},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${warningIsOn}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenanceJ1939CheckEngineLight' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenanceJ1939CheckEngineLight -ArgumentList @(
            ${emissionsIsOn},
            ${protectIsOn},
            ${stopIsOn},
            ${warningIsOn}
        )
    }
}
