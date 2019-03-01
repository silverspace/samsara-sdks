function New-UserTagRoleTag {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${parentTagId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.UserTagRoleTag' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.UserTagRoleTag -ArgumentList @(
            ${parentTagId},
            ${name},
            ${id}
        )
    }
}
