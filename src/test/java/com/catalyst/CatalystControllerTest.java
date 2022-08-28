package com.catalyst;

import com.catalyst.controller.CatalystController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CatalystController.class)
public class CatalystControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnHelloWorldFromController() throws Exception {
        //Assertions.assertNotNull(controller.helloWorld());
        this.mockMvc.perform(get("/hello-world")).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }
}
