function Invoke-UsersApiDeleteUserById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${userId}
    )

    Process {
        'Calling method: UsersApi-DeleteUserById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UsersApi.DeleteUserById(
            ${accessToken},
            ${userId}
        )
    }
}

function Invoke-UsersApiGetUserById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${userId}
    )

    Process {
        'Calling method: UsersApi-GetUserById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UsersApi.GetUserById(
            ${accessToken},
            ${userId}
        )
    }
}

function Invoke-UsersApiListUserRoles {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken}
    )

    Process {
        'Calling method: UsersApi-ListUserRoles' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UsersApi.ListUserRoles(
            ${accessToken}
        )
    }
}

function Invoke-UsersApiListUsers {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken}
    )

    Process {
        'Calling method: UsersApi-ListUsers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UsersApi.ListUsers(
            ${accessToken}
        )
    }
}

