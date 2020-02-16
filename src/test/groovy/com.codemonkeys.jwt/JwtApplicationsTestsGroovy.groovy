package com.codemonkeys.jwt

import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class LoadContextTest extends Specification {

    @Autowired(required = false)
    private TestController testController

    @Test
    def "applicationContextLoads"() {
        expect: "the testController is created"
        testController
    }
}
