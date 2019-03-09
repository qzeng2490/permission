package com.qzeng2490.permisson.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Qiang Zeng
 * @Date: Created in 15:44 2019-03-09
 */
@Configuration
public class JedisConfiguration {

  @Autowired
  RedisConfig redisConfig;

  @Bean
  public ShardedJedisPool convertJedisPool() {
    JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxIdle(redisConfig.getPoolMaxIdle());
    poolConfig.setMaxTotal(redisConfig.getPoolMaxTotal());
    poolConfig.setMaxWaitMillis(redisConfig.getPoolMaxWait() * 1000);
    List<JedisShardInfo> jedisShardInfoList = new ArrayList<>();
    jedisShardInfoList.add(new JedisShardInfo(redisConfig.getHost(),redisConfig.getPort(),redisConfig.getTimeout()));
    return new ShardedJedisPool(poolConfig, jedisShardInfoList);

  }
}
