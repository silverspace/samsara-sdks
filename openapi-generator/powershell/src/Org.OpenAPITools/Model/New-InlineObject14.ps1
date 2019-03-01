function New-InlineObject14 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.Vehicle[]]
        ${vehicles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject14' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject14 -ArgumentList @(
            ${groupId},
            ${vehicles}
        )
    }
}
