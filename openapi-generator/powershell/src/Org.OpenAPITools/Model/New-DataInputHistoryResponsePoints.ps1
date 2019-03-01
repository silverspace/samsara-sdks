function New-DataInputHistoryResponsePoints {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${value},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DataInputHistoryResponsePoints' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DataInputHistoryResponsePoints -ArgumentList @(
            ${value},
            ${timeMs}
        )
    }
}
