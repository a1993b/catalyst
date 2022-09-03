package com.catalyst.controller;

import com.catalyst.controller.CatalystController;
import com.catalyst.service.CatalystService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CatalystController.class)
public class CatalystControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CatalystService catalystService;

    @BeforeEach
    void init() {
        Mockito.when(catalystService.helloWorld()).thenReturn("hello world");
    }
    @Test
    public void shouldReturnHelloWorldFromController() throws Exception {
        this.mockMvc.perform(get("/hello-world")).andExpect(status().isOk())
                .andExpect(content().string(containsString("hello world")));
    }
}
