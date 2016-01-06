package com.mdl.maven.utils.redis;

import java.util.ResourceBundle;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	
	protected static JedisPool pool;
	
	// 静态代码初始化池配置
	static {
		// 加载redis配置文件
		ResourceBundle bundle = ResourceBundle.getBundle("redis");
		if (bundle == null) {
			throw new IllegalArgumentException("[redis.properties] is not found!");
		}
		// 创建jedis池配置实例
		JedisPoolConfig config = new JedisPoolConfig();
		
		// 设置池配置项值
		config.setMaxTotal(Integer.valueOf(bundle.getString("redis.pool.maxTotal")));
		config.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxIdle")));
		config.setMaxWaitMillis(Long.valueOf(bundle.getString("redis.pool.maxWaitMillis")));
		config.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.pool.testOnBorrow")));
		config.setTestOnReturn(Boolean.valueOf(bundle.getString("redis.pool.testOnReturn")));
		// 根据配置实例化jedis池
		pool = new JedisPool(config, bundle.getString("redis.host"), Integer.valueOf(bundle.getString("redis.port")));
	}

    /**获得jedis对象*/
    public static Jedis getJedis(){
     return pool.getResource();
    }
    
    /**
     * 批量删除pattern匹配的key
     * @param pattern
     */
    public static void batchDelKeys(String pattern){
    	Jedis jedis = getJedis();
    	Set<String> keys = jedis.keys(pattern);
    	jedis.del(keys.toArray(new String[keys.size()]));
    }

    /**归还jedis对象*/
    public static void recycleJedis(Jedis jedis){
    	pool.returnResource(jedis);  
    }


	/** 
     * 测试jedis池方法 
     */  
    public static void main(String[] args) {

        Jedis jedis = getJedis();//获得jedis实例                  
        
        recycleJedis(jedis); //将 获取的jedis实例对象还回迟中
    } 

	public static void destory(Jedis jedis,JedisPool pool) {
        pool.returnResource(jedis);//使用完之后将连接返回到连接池中
    }
	
}
