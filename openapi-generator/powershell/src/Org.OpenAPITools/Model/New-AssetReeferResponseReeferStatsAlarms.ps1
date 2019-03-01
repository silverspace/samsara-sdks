function New-AssetReeferResponseReeferStatsAlarms {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${severity},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${operatorAction},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${alarmCode}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AssetReeferResponseReeferStatsAlarms' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetReeferResponseReeferStatsAlarms -ArgumentList @(
            ${severity},
            ${operatorAction},
            ${description},
            ${alarmCode}
        )
    }
}
