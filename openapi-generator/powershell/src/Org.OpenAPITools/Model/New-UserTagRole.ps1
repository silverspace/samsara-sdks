function New-UserTagRole {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${role},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${roleId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.UserTagRoleTag]
        ${tag}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.UserTagRole' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.UserTagRole -ArgumentList @(
            ${role},
            ${roleId},
            ${tag}
        )
    }
}
