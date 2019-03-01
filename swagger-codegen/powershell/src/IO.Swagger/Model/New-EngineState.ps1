function New-EngineState {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Decimal]
        ${timeMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${value}
    )

    Process {
        'Creating object: samsara.Model.EngineState' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.EngineState -ArgumentList @(
            ${timeMs},
            ${value}
        )
    }
}
