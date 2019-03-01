function New-InlineResponse2002 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Pagination]]
        ${pagination},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Vehicle[]]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2002' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2002 -ArgumentList @(
            ${groupId},
            ${pagination},
            ${vehicles}
        )
    }
}
