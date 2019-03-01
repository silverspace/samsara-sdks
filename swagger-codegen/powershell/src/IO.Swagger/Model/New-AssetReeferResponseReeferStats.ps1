function New-AssetReeferResponseReeferStats {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsAlarms1[]]]
        ${alarms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsEngineHours[]]]
        ${engineHours},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsFuelPercentage[]]]
        ${fuelPercentage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsPowerStatus[]]]
        ${powerStatus},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsReturnAirTemp[]]]
        ${returnAirTemp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsSetPoint[]]]
        ${setPoint}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStats' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStats -ArgumentList @(
            ${alarms},
            ${engineHours},
            ${fuelPercentage},
            ${powerStatus},
            ${returnAirTemp},
            ${setPoint}
        )
    }
}
