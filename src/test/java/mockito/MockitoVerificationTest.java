package mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoVerificationTest {
    private Car myFerrari = mock(Car.class);

    @Test
    void testVerification() {
        myFerrari.driveTo("Hanoi, VietNam");
        myFerrari.needsFuel();

        verify(myFerrari).driveTo("Hanoi, VietNam");
        verify(myFerrari).needsFuel();
    }

}

