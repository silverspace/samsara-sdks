function New-Documents {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.Documents' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.Documents -ArgumentList @(
        )
    }
}
