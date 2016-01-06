package com.mdl.maven.utils.redis;

import redis.clients.jedis.Jedis;

public class CodeGenerateUtil {

  public static void main(String[] args) {
    
    String code=generateBjlikpvbeln();
    System.out.println("code:"+code);
  }

  // 报价单编号
  public static String generateBjlikpvbeln() {
    Long code;
    Jedis jedis = null;
    try {
      jedis = RedisUtil.getJedis();
      code = jedis.incr("bjlikpVbeln");
    } finally {
      if (jedis != null) {
        RedisUtil.recycleJedis(jedis);
      }
    }
    return ("VL" + (10000000 + code));
  }


}
