function New-DataInputHistoryResponsePoints {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${value}
    )

    Process {
        'Creating object: samsara.Model.DataInputHistoryResponsePoints' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DataInputHistoryResponsePoints -ArgumentList @(
            ${timeMs},
            ${value}
        )
    }
}
