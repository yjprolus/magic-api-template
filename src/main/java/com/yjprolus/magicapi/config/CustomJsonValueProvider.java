package com.yjprolus.magicapi.config;

import org.springframework.stereotype.Component;
import org.ssssssss.magicapi.core.context.RequestEntity;
import org.ssssssss.magicapi.core.interceptor.ResultProvider;

/**
 * Created by yjprolus on 2022/6/27  0027 01:36:22
 * @author 17937
 */
@Component
public class CustomJsonValueProvider implements ResultProvider {
    /**
     * 定义返回结果，默认返回JsonBean
     */
    @Override
    public Object buildResult(RequestEntity requestEntity, int code, String message, Object data) {
        // 如果对分页格式有要求的话，可以对data的类型进行判断，进而返回不同的格式
//        return new HashMap<String, Object>() {
//            {
//                put("data", data);
//            }
//        };
//        return JSONObject.toJSON(data);
        return data;
    }
}
