package com.github.tvbox.osc.util;

import android.graphics.Color;

public class ColorHelper {
    private static final String[] PALETTE_CN;
    static {
        PALETTE_CN = new String[]{
                "#ff4e20",
                "#f35336",
                "#dc3023",
                "#ff3300",
                "#cb3a56",
                "#a98175",
                "#b36d61",
                "#ef7a82",
                "#ff0097",
                "#ff461f",
                "#ff2d51",
                "#f36838",
                "#ed5736",
                "#f00056",
                "#ffb3a7",
                "#f47983",
                "#db5a6b",
                "#00e079",
                "#00e09e",
                "#3de1ad",
                "#2add9c",
                "#2edfa3",
                "#7fecad",
                "#a4e2c6",
                "#7bcfa6",
                "#1bd1a5",
                "#bce672",
                "#c9dd22",
                "#bddd22",
                "#afdd22",
                "#a3d900",
                "#9ed900",
                "#9ed048",
                "#96ce54",
                "#00bc12",
                "#ffffff",
                "#e9e7ef",
                "#f0f0f4",
                "#e9f1f6",
                "#f0fcff",
                "#e3f9fd",
                "#d6ecf0",
                "#fffbf0",
                "#f2ecde",
                "#70f3ff",
                "#44cef6",
                "#3eede7",
                "#1685a9",
                "#177cb0",
                "#4b5cc4",
                "#a1afc9",
                "#801dae",
                "#4c8dae",
                "#b0a4e3",
                "#cca4e3",
                "#edd1d8",
                "#e4c6d0",
                "#eaff56",
                "#fff143",
                "#faff72",
                "#ffa631",
                "#ffa400",
                "#fa8c35",
                "#ff8c31",
                "#ff8936",
                "#ff7500",
                "#d3b17d",
                "#e29c45",
                "#a78e44",
                "#c89b40",
                "#ae7000",
                "#ca6924",
                "#b25d25",
                "#b35c44"};
    }

    public static int getCN() {
        int num = PALETTE_CN.length;
        int key = (int)(Math.random()*num);
        return Color.parseColor(PALETTE_CN[key]);
    }
}
