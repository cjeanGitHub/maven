package com.cjean.exercise.exercise01.netty.netty5.tcp.lanpeng.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettyConfig {
    @Value("${tcp.portMk}")
    private int tcpPort;




}
