package game;


public class Field {
	public enum FieldColors {BLACK, WHITE};
	
	private FieldColors color;
	
	public Field(FieldColors color) {
		this.color = color;
	}
	
	public FieldColors getColor() {
		return this.color;
	}
	
	public void setColor(FieldColors color) {
		this.color = color;
	}

}
