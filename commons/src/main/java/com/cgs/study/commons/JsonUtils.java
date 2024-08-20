package com.cgs.study.commons;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public class JsonUtils {

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  /**
   * Convert json string to object.
   *
   * @param json  json string.
   * @param clazz class type.
   * @param <T>   object type.
   * @return object.
   * @throws JsonProcessingException json processing exception.
   */
  public static <T> T fromJson(String json, Class<T> clazz) throws JsonProcessingException {
    return OBJECT_MAPPER.readValue(json, clazz);
  }

  /**
   * Convert object to json string.
   *
   * @param obj object.
   * @return json string.
   * @throws JsonProcessingException json processing exception.
   */
  public static String toJson(Object obj) throws JsonProcessingException {
    return OBJECT_MAPPER.writeValueAsString(obj);
  }

}