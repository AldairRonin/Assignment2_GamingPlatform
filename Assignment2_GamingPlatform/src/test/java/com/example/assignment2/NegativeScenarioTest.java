package com.example.assignment2;

import com.example.assignment2.config.FactorySelector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeScenarioTest {
    @Test void unknownFamilyRejected() {
        assertThrows(IllegalArgumentException.class, () -> FactorySelector.from("unknown"));
    }
    @Test void emptyFamilyRejected() {
        assertThrows(IllegalArgumentException.class, () -> FactorySelector.from(""));
    }
}
