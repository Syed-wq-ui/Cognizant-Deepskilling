package net.javaguides;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class ApiServiceTest {

    @Test
    public void testFetchData() {
        // Arrange
        // Create a mock object of ExternalApi
        ExternalApi api = mock(ExternalApi.class);//mocking
        // Tell the mock what to return when getData() is called
        when(api.getData()).thenReturn("Mock Data");//stubbing --> telling mock object what to do
        // Pass the mock object to ApiService
        ApiService service = new ApiService(api);
        // Act
        // Call the method under test
        String result = service.fetchData();
        // Asser
        assertEquals("Mock Data", result);
    }
}