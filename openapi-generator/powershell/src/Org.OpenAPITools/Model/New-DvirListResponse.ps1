function New-DvirListResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DvirBase[]]]
        ${dvirs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DvirListResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DvirListResponse -ArgumentList @(
            ${dvirs}
        )
    }
}
