function New-Vehicle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${engineHours},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${fuelLevelPercent},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${note},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${odometerMeters},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vin}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Vehicle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Vehicle -ArgumentList @(
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
