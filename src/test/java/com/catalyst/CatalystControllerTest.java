package com.catalyst;

import com.catalyst.controller.CatalystController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CatalystControllerTest {
    @Autowired
    private CatalystController controller;

    @Test
    public void shouldReturnHelloWorldFromController(){
        Assertions.assertNotNull(controller.helloWorld());
    }
}
