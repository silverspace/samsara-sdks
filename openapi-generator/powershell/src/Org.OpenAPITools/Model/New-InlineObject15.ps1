function New-InlineObject15 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject15' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject15 -ArgumentList @(
            ${endMs},
            ${groupId},
            ${startMs},
            ${vehicleId}
        )
    }
}
