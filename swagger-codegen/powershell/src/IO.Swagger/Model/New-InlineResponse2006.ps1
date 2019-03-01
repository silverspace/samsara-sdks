function New-InlineResponse2006 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DataInputHistoryResponse[]]]
        ${dataInputs}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2006' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2006 -ArgumentList @(
            ${dataInputs}
        )
    }
}
