function New-DataInputHistoryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DataInputHistoryResponsePoints[]]]
        ${points}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DataInputHistoryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DataInputHistoryResponse -ArgumentList @(
            ${id},
            ${name},
            ${points}
        )
    }
}
