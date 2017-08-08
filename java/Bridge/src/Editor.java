
public class Editor implements _______ { //> 3
	_____ theme = new LightTheme(); //> 4

	@Override
	public void _________(Theme theme) { //> 5
		this.theme = theme;
		System.out.println(
				"Editor : Applying theme with background color " + this.theme.backgroundColor + " and font color " + this.theme.fontColor);
	}
}
