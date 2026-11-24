package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest {
    private final MessageService service = new MessageService();

    @Test
    void shouldReturnWelcomeMessage() {
        assertEquals("Welcome to the DevOps practical examination", service.getMessage());
             /********** add your assertion to test for service.getMessage() *****/
    }

    @Test
    void shouldCalculateTotal() {
      /********** add your assertion to test for service.calculateTotal() *****/
    }
}
