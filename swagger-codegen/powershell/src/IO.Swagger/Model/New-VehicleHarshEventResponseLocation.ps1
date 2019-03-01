function New-VehicleHarshEventResponseLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${address},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${latitude},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${longitude}
    )

    Process {
        'Creating object: samsara.Model.VehicleHarshEventResponseLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleHarshEventResponseLocation -ArgumentList @(
            ${address},
            ${latitude},
            ${longitude}
        )
    }
}
