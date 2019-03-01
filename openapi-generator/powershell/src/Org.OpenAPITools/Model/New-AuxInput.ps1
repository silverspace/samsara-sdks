function New-AuxInput {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${timeMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${value}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AuxInput' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AuxInput -ArgumentList @(
            ${timeMs},
            ${value}
        )
    }
}
