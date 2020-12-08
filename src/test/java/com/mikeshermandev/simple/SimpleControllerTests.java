package com.mikeshermandev.simple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleControllerTests {

    @Test
    public void SimpleTestController_shouldReturn_Integer() {
        SimpleController simpleController = new SimpleController();
        var a = simpleController.getNumber();

        assertThat(a).isLessThan(100);
        assertThat(a).isGreaterThan(-1);
    }
}
