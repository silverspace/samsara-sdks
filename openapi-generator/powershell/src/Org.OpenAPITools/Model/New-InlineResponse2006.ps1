function New-InlineResponse2006 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DataInputHistoryResponse[]]]
        ${dataInputs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2006' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2006 -ArgumentList @(
            ${dataInputs}
        )
    }
}
