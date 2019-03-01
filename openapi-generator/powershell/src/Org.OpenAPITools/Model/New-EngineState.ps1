function New-EngineState {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${timeMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${value}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EngineState' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EngineState -ArgumentList @(
            ${timeMs},
            ${value}
        )
    }
}
