package me.rest.demo.Events;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setExtractBareNamePropertyMethods;


public class EventTest {

    @Test
    public void builder(){
        Event event = Event.builder()
                .name("test")
                .description("test1")
                .build();
        assertThat(event).isNotNull();

    }

    @Test
    public void javaBean() {
        // Given
        String name = "Event";
        String description = "Spring";

        // When
        Event event = new Event();
        event.setName("Event");
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }
}