function New-ErrorResponse {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.ErrorResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.ErrorResponse -ArgumentList @(
        )
    }
}
