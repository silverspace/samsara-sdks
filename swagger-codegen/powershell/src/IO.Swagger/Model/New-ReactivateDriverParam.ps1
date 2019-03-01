function New-ReactivateDriverParam {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${reactivate}
    )

    Process {
        'Creating object: samsara.Model.ReactivateDriverParam' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.ReactivateDriverParam -ArgumentList @(
            ${reactivate}
        )
    }
}
