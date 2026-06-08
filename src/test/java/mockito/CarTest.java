package mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CarTest {
    private Car myFerrari = mock(Car.class);

    @Test
    void testIfCarIsACar() {
        assertTrue(myFerrari instanceof Car);
    }

    @Test
    void testDefaultBehaviorOfTestDouble() {
        assertFalse(myFerrari.needsFuel());
        assertEquals(0.0d, myFerrari.getEngineTemperature());
    }

    @Test
    void testStubbing() {
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue(myFerrari.needsFuel());
    }

}