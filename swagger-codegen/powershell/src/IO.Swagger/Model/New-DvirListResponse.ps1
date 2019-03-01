function New-DvirListResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DvirBase[]]]
        ${dvirs}
    )

    Process {
        'Creating object: samsara.Model.DvirListResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DvirListResponse -ArgumentList @(
            ${dvirs}
        )
    }
}
