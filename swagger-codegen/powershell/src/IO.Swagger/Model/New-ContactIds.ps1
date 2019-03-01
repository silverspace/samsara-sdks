function New-ContactIds {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.ContactIds' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.ContactIds -ArgumentList @(
        )
    }
}
