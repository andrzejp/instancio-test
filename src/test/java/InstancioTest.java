import instanciotest.ExampleObject;
import org.approvaltests.Approvals;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

class InstancioTest {

    @Test
    void should_instantiate_an_object_with_random_values() {
        ExampleObject exampleObject = Instancio.create(ExampleObject.class);
        Approvals.verify(exampleObject);
    }
}
