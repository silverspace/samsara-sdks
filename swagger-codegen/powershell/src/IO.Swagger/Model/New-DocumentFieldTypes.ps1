function New-DocumentFieldTypes {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.DocumentFieldTypes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentFieldTypes -ArgumentList @(
        )
    }
}
