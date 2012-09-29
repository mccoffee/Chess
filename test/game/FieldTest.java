package game;

import static org.junit.Assert.*;
import game.Field.FieldColors;

import org.junit.Test;

public class FieldTest {

	@Test
	public void instantiateTest() {
		Field field = new Field(FieldColors.BLACK);
		assertEquals(FieldColors.BLACK, field.getColor());
		field.setColor(FieldColors.WHITE);
		assertEquals(FieldColors.WHITE, field.getColor());
		field.setColor(null);
		assertEquals(FieldColors.WHITE, field.getColor());
		Field field2 = new Field(null);
		assertEquals(FieldColors.WHITE, field2.getColor());
	}

}
