function New-TagIds {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.TagIds' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.TagIds -ArgumentList @(
        )
    }
}
