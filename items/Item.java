package items;

import util.Writer;

public abstract class Item {
	private final String NAME;
	private final String DESC;
	
	public String getName() {
		return this.NAME;
	}
	
	public String getDesc() {
		return this.DESC;
	}
	
	public Item(String name, String desc) {
		this.NAME = name;
		this.DESC = desc;		
	}
	
	public abstract void use(Writer writer, String[] args);
	
	public String toString(){
		return getName();
	}
}
