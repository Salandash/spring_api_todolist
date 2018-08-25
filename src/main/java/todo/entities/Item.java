package todo.entities;

/*
 * The item class that provides the base structure
 * for item lists. 
 */
public class Item {
	private final long id;
	private String description;
	private Boolean done;
	
	public Item(long _id, String _description){
		this.id = _id;
		this.description = _description;
		this.done = false;
	}
	
	public void checkItem(long _id){
		this.done = true;
	}
	
	public void unCheckItem(long _id){
		this.done = false;
	}
	

}
