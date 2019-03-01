function New-SensorHistoryResponseResults {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${series},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${timeMs}
    )

    Process {
        'Creating object: samsara.Model.SensorHistoryResponseResults' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.SensorHistoryResponseResults -ArgumentList @(
            ${series},
            ${timeMs}
        )
    }
}
