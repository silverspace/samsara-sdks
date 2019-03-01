function New-AssetReeferResponseReeferStats {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsFuelPercentage[]]]
        ${fuelPercentage},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsPowerStatus[]]]
        ${powerStatus},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsEngineHours[]]]
        ${engineHours},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsSetPoint[]]]
        ${setPoint},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsReturnAirTemp[]]]
        ${returnAirTemp},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsAlarms1[]]]
        ${alarms}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AssetReeferResponseReeferStats' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetReeferResponseReeferStats -ArgumentList @(
            ${fuelPercentage},
            ${powerStatus},
            ${engineHours},
            ${setPoint},
            ${returnAirTemp},
            ${alarms}
        )
    }
}
