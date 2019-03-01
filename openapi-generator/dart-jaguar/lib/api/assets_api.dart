import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/asset_reefer_response.dart';
import 'package:openapi/model/inline_response2001.dart';
import 'package:openapi/model/inline_response200.dart';
import 'package:openapi/model/object.dart';


part 'assets_api.jretro.dart';

@GenApiClient()
class AssetsApi extends _$AssetsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    AssetsApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// /fleet/assets/locations
    ///
    /// Fetch current locations of all assets for the group.
    @GetReq(path: "/fleet/assets/locations")
    Future<InlineResponse2001> getAllAssetCurrentLocations(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getAllAssetCurrentLocations(
        
        accessToken, 
        
        groupId

        ).timeout(timeout);
    }

    /// /fleet/assets
    ///
    /// Fetch all of the assets for the group.
    @GetReq(path: "/fleet/assets")
    Future<InlineResponse200> getAllAssets(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getAllAssets(
        
        accessToken, 
        
        groupId

        ).timeout(timeout);
    }

    /// /fleet/assets/{assetId:[0-9]+}/locations
    ///
    /// Fetch the historical locations for the asset.
    @GetReq(path: "/fleet/assets/:asset_id/locations")
    Future<List<Object>> getAssetLocation(
            @PathParam("asset_id") int assetId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getAssetLocation(
        assetId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    ///
    /// Fetch the reefer-specific stats of an asset.
    @GetReq(path: "/fleet/assets/:asset_id/reefer")
    Future<AssetReeferResponse> getAssetReefer(
            @PathParam("asset_id") int assetId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getAssetReefer(
        assetId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }


}
