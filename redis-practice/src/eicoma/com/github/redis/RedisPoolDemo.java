package eicoma.com.github.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 数据库连接池操作redis
 * 目的：获取Redis数据库连接对象Jedis
 * 相关的类  JedisConfigPool 数据库相关配置信息
 * 相关的类 JedisPool 连接池对象
 * 连接池对象 返回Jedis对象
 * <p>
 * 实现步骤
 * 创建对象JedisPoolConfig
 * 设置连接池相关数据
 * <p>
 * 创建连接池对象JedisPool
 * 创建配置对象，数据库IP和端口
 */
public class RedisPoolDemo {
    public static void main(String[] args) {
        //创建对象JedisPoolConfig
        JedisPoolConfig config = new JedisPoolConfig();
        //设置连接池相关数据
        //设置连接池中的最大连接数
        config.setMaxTotal(50);
        //设置最大空闲数量
        config.setMaxIdle(20);

        //创建JedisPool对象
        JedisPool pool = new JedisPool(config, "localhost", 6379);
        //连接池对象的方法 getResource()获取Jedis对象
        Jedis jedis = pool.getResource();
        System.out.println(jedis.get("zhangsan"));
        jedis.close();
        pool.close();
    }
}
