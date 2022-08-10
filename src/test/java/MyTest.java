import co.elastic.clients.elasticsearch._types.mapping.RuntimeFieldType;
import org.junit.jupiter.api.Test;


class MyTest {
	@Test
	void testRuntimeField() {
		RuntimeFieldType.Double.jsonValue();
	}
}
