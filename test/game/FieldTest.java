package game;

import static org.junit.Assert.*;
import game.Field.FieldColors;

import org.junit.Test;

public class FieldTest {

	@Test
	public void instantiateTest() {
		Field field = new Field(game.Field.FieldColors.BLACK);
		assertEquals(game.Field.FieldColors.BLACK, field.getColor());
		field.setColor(FieldColors.WHITE);
		assertEquals(FieldColors.WHITE, field.getColor());
	}

}
