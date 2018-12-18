package com.launcher.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LBW on 2018/12/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }

}
