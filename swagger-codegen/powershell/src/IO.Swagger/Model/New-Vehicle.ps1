function New-Vehicle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${engineHours},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${fuelLevelPercent},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${note},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${odometerMeters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vin}
    )

    Process {
        'Creating object: samsara.Model.Vehicle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.Vehicle -ArgumentList @(
            ${engineHours},
            ${fuelLevelPercent},
            ${id},
            ${name},
            ${note},
            ${odometerMeters},
            ${vin}
        )
    }
}
