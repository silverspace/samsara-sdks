function New-AssetLocationResponse {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.AssetLocationResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetLocationResponse -ArgumentList @(
        )
    }
}
