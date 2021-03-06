import javafx.scene.image.Image;

// Object class
public class Saber {
	// Data fields
	boolean isDefault;
	String name = "Unnamed Saber";
	Image emitter = new Image("/Saber Parts/AnakinEmitter.png");
	Image guard = new Image("/Saber Parts/AnakinGuard.png");
	Image bladeSwitch = new Image("/Saber Parts/AnakinSwitch.png");
	Image pommel = new Image("/Saber Parts/AnakinPommel.png");
	// <! Implement blade color and sound !>
	
	// Construct default saber
	public Saber() {
	}
	
	// Construct saber with specific values
	public Saber(boolean isDefault, String name, Image emitter, 
			Image guard, Image bladeSwitch, Image pommel) {
		this.isDefault = isDefault;
		this.name = name;
		this.emitter = emitter;
		this.guard = guard;
		this.bladeSwitch = bladeSwitch;
		this.pommel = pommel;
	}
	
	// Return isDefault
	public boolean getIsDefault() {
		return isDefault;
	}
	
	// Set a new isDefault
	public void isIsDefault(boolean newIsDefault) {
		isDefault = newIsDefault;
	}
	
	// Return name
	public String getName() {
		return name;
	}
	
	// Set a new name
	public void setName(String newName) {
		name = newName;
	}
	
	// Return emitter
	public Image getEmitter() {
		return emitter;
	}
	
	// Set a new emitter
	public void setEmitter(Image newEmitter) {
		emitter = newEmitter;
	}
	
	// Return guard
	public Image getGuard() {
		return guard;
	}
	
	// Set a new guard
	public void setGuard(Image newGuard) {
		guard = newGuard;
	}
	
	// Return bladeSwitch
	public Image getBladeSwitch() {
		return bladeSwitch;
	}
	
	// Set a new bladeSwitch
	public void setBladeSwitch(Image newBladeSwitch) {
		bladeSwitch = newBladeSwitch;
	}
	// Return pommel
	public Image getPommel() {
		return pommel;
	}
	
	// Set a new pommel
	public void setPommel(Image newPommel) {
		pommel = newPommel;
	}
	
}
