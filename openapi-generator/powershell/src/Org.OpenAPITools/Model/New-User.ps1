function New-User {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${email},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${organizationRoleId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${organizationRole},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.UserTagRole[]]]
        ${tagRoles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.User' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.User -ArgumentList @(
            ${authType},
            ${email},
            ${name},
            ${organizationRoleId},
            ${id},
            ${organizationRole},
            ${tagRoles}
        )
    }
}
