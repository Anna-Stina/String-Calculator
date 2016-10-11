

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CalTest {

	@Test
	public void emptyStringReturnsZero() {
		Calculator c = new Calculator();
		int result = c.add("");
		assertThat(result, is(0));
	}

	@Test
	public void stringNumReturnsItsValue() {
		Calculator cal = new Calculator();
		int result = cal.add("1");
		assertThat(result, is(1));

	}

	@Test
	public void stringAddsTwoValuesTogether() {
		Calculator cal = new Calculator();
		int add1 = cal.add("2,3");
		
		
		assertThat(add1, is(5));

	}
	@Test
	public void stringAddsMultiValuesTogether() {
		Calculator cal = new Calculator();
		int add1 = cal.add("2,3,3");
		assertThat(add1, is(8));

	}

}

