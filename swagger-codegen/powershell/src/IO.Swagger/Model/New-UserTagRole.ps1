function New-UserTagRole {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${role},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${roleId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.UserTagRoleTag]
        ${tag}
    )

    Process {
        'Creating object: samsara.Model.UserTagRole' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.UserTagRole -ArgumentList @(
            ${role},
            ${roleId},
            ${tag}
        )
    }
}
