
package com.example.admin.solidwaste.pojo.MapPlacedetailsPojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Viewport {

    @SerializedName("northeast")
    private Northeast mNortheast;
    @SerializedName("southwest")
    private Southwest mSouthwest;

    public Northeast getNortheast() {
        return mNortheast;
    }

    public Southwest getSouthwest() {
        return mSouthwest;
    }

    public static class Builder {

        private Northeast mNortheast;
        private Southwest mSouthwest;

        public Viewport.Builder withNortheast(Northeast northeast) {
            mNortheast = northeast;
            return this;
        }

        public Viewport.Builder withSouthwest(Southwest southwest) {
            mSouthwest = southwest;
            return this;
        }

        public Viewport build() {
            Viewport viewport = new Viewport();
            viewport.mNortheast = mNortheast;
            viewport.mSouthwest = mSouthwest;
            return viewport;
        }

    }

}
