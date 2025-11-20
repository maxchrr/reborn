package core;

public abstract class Items{
	private String name;
	private String desc;
	
	public String getName(){
		return this.name;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public Items(String name, String desc) {
		this.name = name;
		this.desc = desc;		
	}
	
	public abstract void use();
	
	public String toString(){
		return this.name;
	}
}
