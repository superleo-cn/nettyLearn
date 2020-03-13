package cn.com.demo.chat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * jackson 的工具类
 *
 * @author huanglong05
 * @version 1.0
 * @description
 * @date 2019-10-14 10:49
 */
public class JsonUtils {

    private static Logger log = LoggerFactory.getLogger(JsonUtils.class);
    private static JsonFactory factory = new JsonFactory();
    private static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper(factory);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public JsonUtils() {
    }

    public static String toJson(Object obj) {
        if (obj == null) {
            return null;
        } else {
            try {
                return objectMapper.writeValueAsString(obj);
            } catch (Exception var2) {
                log.warn("对象转换json异常", var2);
                return null;
            }
        }
    }

    public static <T> T jsonToObject(String jsonStr, Class<T> c) {
        if (StringUtils.isBlank(jsonStr)) {
            return null;
        } else {
            try {
                return objectMapper.readValue(jsonStr.getBytes("UTF-8"), c);
            } catch (Exception var3) {
                log.warn("json转换对象异常:{}", jsonStr, var3);
                return null;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String pattern = "MMM d, yyyy HH:mm:ss a";
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("Oct 31, 2019 3:54:29 PM");
        System.out.println(date);
    }

}