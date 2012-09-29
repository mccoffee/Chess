package game;


public class Field {
	public enum FieldColors {BLACK, WHITE};
	
	private FieldColors color;
	
	public Field(FieldColors color) {
		setColor(color);
	}
	
	public FieldColors getColor() {
		return this.color;
	}
	
	public void setColor(FieldColors color) {
		if(color == null){
			this.color = FieldColors.WHITE;
		} else {
			this.color = color;
		}
	}

}
