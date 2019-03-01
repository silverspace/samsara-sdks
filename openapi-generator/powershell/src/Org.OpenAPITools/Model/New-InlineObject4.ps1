function New-InlineObject4 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${reactivate}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject4' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject4 -ArgumentList @(
            ${reactivate}
        )
    }
}
