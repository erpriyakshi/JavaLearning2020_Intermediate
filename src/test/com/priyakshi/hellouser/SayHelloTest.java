package com.priyakshi.hellouser;

import com.priyakshi.hellouser.SayHello;
import org.junit.Test;

public class SayHelloTest {

    @Test
    public void testSayHelloToTUser() {
        // given - scenario setup for testing

        SayHello testClass = new SayHello() {
            @Override
            protected String getNameFromUser() {
                return "testName";
            }
        };

        // when - call test method
        testClass.sayHelloToTUser();

        // then - verify/assert

    }
}