function New-VehicleHarshEventResponseLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${address},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${latitude},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${longitude}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleHarshEventResponseLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleHarshEventResponseLocation -ArgumentList @(
            ${address},
            ${latitude},
            ${longitude}
        )
    }
}
