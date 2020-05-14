package com.cjean.exercise.exercise01;

import com.cjean.exercise.exercise01.netty.TimeClient;
import com.cjean.exercise.exercise01.netty.TimeServer;
import org.junit.Test;

public class CoreTest {

    @Test
    public void timeServerTest() throws Exception {
        new TimeServer().bind(8080);
    }
    
    @Test
    public void timeClientTest() throws Exception {
        new TimeClient().connect(8080, "127.0.0.1");
    }

    @Test
    public void timeClientTest1() throws Exception {
        new TimeClient().connect(8080, "127.0.0.1");
    }
    
}