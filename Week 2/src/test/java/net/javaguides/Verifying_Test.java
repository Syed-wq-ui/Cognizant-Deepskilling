package net.javaguides;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Verifying_Test {

    @Test
    public void testSendMoney() {

        // Arrange
        Verifying_Interactions obj = mock(Verifying_Interactions.class);

        Verifying_Interaction_Service test =
                new Verifying_Interaction_Service(obj);

        // Act
        test.sendmoney(5000);

        // Verify
        verify(obj).transfermoney(5000);
    }
}