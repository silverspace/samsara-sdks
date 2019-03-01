function New-AddressNotes {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.AddressNotes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AddressNotes -ArgumentList @(
        )
    }
}
