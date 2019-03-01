function New-JobStatus {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.JobStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.JobStatus -ArgumentList @(
        )
    }
}
