function New-InlineObject22 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64[]]
        ${sensors}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject22' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject22 -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
