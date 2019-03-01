function New-PrevJobStatus {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.PrevJobStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.PrevJobStatus -ArgumentList @(
        )
    }
}
