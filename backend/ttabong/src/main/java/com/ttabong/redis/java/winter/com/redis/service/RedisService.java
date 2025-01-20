package com.ttabong.redis.java.winter.com.redis.service;

public interface RedisService {
    String searchKeyWord(String q);

    Object rankingKeyWord();
}
