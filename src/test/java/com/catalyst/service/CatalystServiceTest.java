package com.catalyst.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

// @ExtendWith(MockitoExtension.class)
public class CatalystServiceTest {
    //@InjectMocks
    private CatalystService catalystService;

    @BeforeEach
    void init() {
        catalystService = new CatalystService();
    }

    @DisplayName("should return hello world")
    @Test
    void shouldReturnHelloWorld() {
        Assertions.assertEquals("hello world", catalystService.helloWorld());
    }
}
