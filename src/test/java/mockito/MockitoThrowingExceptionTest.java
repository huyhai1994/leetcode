package mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertThrows;

public class MockitoThrowingExceptionTest {
    private Car myFerrari = mock(Car.class);

    @Test
    void throwException() {
        when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, () -> myFerrari.needsFuel());

    }
}
