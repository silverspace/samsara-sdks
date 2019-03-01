#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: Org.OpenAPITools.Api.AssetsApi' | Write-Verbose
$Script:AssetsApi= New-Object -TypeName Org.OpenAPITools.Api.AssetsApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.DriversApi' | Write-Verbose
$Script:DriversApi= New-Object -TypeName Org.OpenAPITools.Api.DriversApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.FleetApi' | Write-Verbose
$Script:FleetApi= New-Object -TypeName Org.OpenAPITools.Api.FleetApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.IndustrialApi' | Write-Verbose
$Script:IndustrialApi= New-Object -TypeName Org.OpenAPITools.Api.IndustrialApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.RoutesApi' | Write-Verbose
$Script:RoutesApi= New-Object -TypeName Org.OpenAPITools.Api.RoutesApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.SafetyApi' | Write-Verbose
$Script:SafetyApi= New-Object -TypeName Org.OpenAPITools.Api.SafetyApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.SensorsApi' | Write-Verbose
$Script:SensorsApi= New-Object -TypeName Org.OpenAPITools.Api.SensorsApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.TagsApi' | Write-Verbose
$Script:TagsApi= New-Object -TypeName Org.OpenAPITools.Api.TagsApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.UsersApi' | Write-Verbose
$Script:UsersApi= New-Object -TypeName Org.OpenAPITools.Api.UsersApi -ArgumentList @($null)


#endregion
