function New-DocumentTypes {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.DocumentTypes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentTypes -ArgumentList @(
        )
    }
}
