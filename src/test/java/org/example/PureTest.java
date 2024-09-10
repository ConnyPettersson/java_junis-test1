package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PureTest {

    @Test
    void addTwoAndThreeReturnsFive() {
        var result = Pure.add(2,3);
        assertEquals(5, result);
    }

}