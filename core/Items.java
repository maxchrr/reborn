package core;

public abstract class Items{
	private String name;
	private String desc;
	
	public Items(String name, String desc) {
		this.name = name;
		this.desc = desc;		
	}
	
	public abstract void use();
}
