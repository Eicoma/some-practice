package eicoma.com.github.redis;

import eicoma.com.github.util.JedisUtils;
import redis.clients.jedis.Jedis;

public class JedisUtilsTest {
    public static void main(String[] args) {
        //通过连接池工具类，获取Jedis对象
        Jedis jedis = JedisUtils.getJedis();
        System.out.println("zhangsan");

        JedisUtils.close(jedis);
    }
}
