package com.gs.serviceproviderdemo;

import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSONObject;


/**
 * Map 转 json
 */
public class MapUtils {

    public static JSONObject map2Json(Map<String, Object> map) {
        JSONObject result = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                result.put(key, value);
            } else if (value instanceof List) {
                result.put(key, JSONObject.toJSON(value));
            } else {
                result.put(key, JSONObject.toJSON(value));
            }
        }
        return result;
    }


}
