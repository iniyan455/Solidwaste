
package com.example.admin.solidwaste.pojo.DirectionApiPojo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GeocodedWaypoint {

    @SerializedName("geocoder_status")
    private String mGeocoderStatus;
    @SerializedName("place_id")
    private String mPlaceId;
    @SerializedName("types")
    private List<String> mTypes;

    public String getGeocoderStatus() {
        return mGeocoderStatus;
    }

    public void setGeocoderStatus(String geocoderStatus) {
        mGeocoderStatus = geocoderStatus;
    }

    public String getPlaceId() {
        return mPlaceId;
    }

    public void setPlaceId(String placeId) {
        mPlaceId = placeId;
    }

    public List<String> getTypes() {
        return mTypes;
    }

    public void setTypes(List<String> types) {
        mTypes = types;
    }

}
