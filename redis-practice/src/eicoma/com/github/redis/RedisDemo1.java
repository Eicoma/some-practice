package eicoma.com.github.redis;

import redis.clients.jedis.Jedis;

/**
 * Java连接数据库redis
 * 实现数据库的存储和取出
 * <p>
 * Mysql数据库，Java中的连接对象Connection
 * Redis数据库，Java中的连接对象Jedis
 */

public class RedisDemo1 {
    public static void main(String[] args) {
        //1.创建Jedis对象
        //构造方法传递参数，数据库服务器IP地址和端口号
        Jedis jedis = new Jedis("localhost", 6379);
        System.out.println(jedis);

        //2.Jedis对象调用方法即可
        //方法名和数据库命令名一样

        //Redis数据库存储键值对
        jedis.set("zhangsan", "23");
        //读取键值对
        String str = jedis.get("zhangsan");
        System.out.println(str);
        //释放资源
        jedis.close();
    }
}
