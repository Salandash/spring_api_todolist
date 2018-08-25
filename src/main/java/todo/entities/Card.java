package todo.entities;

import java.util.HashMap;
import java.util.List;

public class Card {
	private int id;
	private String title;
	private List<Item> itemList;
	private Category category;
	private String color;
	
	public Card(){}
	
	public Card(int _id, String _title){
		this.id = _id;
		this.title = _title;
		this.color = colorMap.get("White");
	}
	
	public void addItem(int _id,String _item){
		Item auxItem = new Item(_id, _item);
		this.itemList.add(auxItem);
		auxItem = null;
	}
	
	public void removeItem(int _id){
		this.itemList.remove(_id);
	}
	
	public void editItem(int _id, String _item){
		Item auxItem = new Item(_id, _item);
		this.itemList.set(_id, auxItem);
		auxItem = null;
	}
	
	public void setCategory(int _id, String _descripcion){
		this.category = new Category(_id, _descripcion);
	}
	
	//TODO getItem
	//TODO DBIntegration
	//TODO UserIntegration
	
	//HashMap with static color pallete.
	public static final HashMap<String , String> colorMap = new HashMap<>();
	static{
		colorMap.put("Light Green", "8BC34A");
		colorMap.put("Yellown", "FFEB3B");
		colorMap.put("Amber", "FFC107");
		colorMap.put("Deep Orange", "FF5722");
		colorMap.put("Pink", "E91E63");
		colorMap.put("Green", "259B24");
		colorMap.put("Lime", "CDDC39");
		colorMap.put("Orange", "FF9800");
		colorMap.put("Red", "E51C23");
		colorMap.put("Purple", "9C27B0");
		colorMap.put("Indigo", "3F51B5");
		colorMap.put("Cyan", "03A9F4");
		colorMap.put("Grey", "00BCD4");
		colorMap.put("Blue Grey", "9E9E9E");
		colorMap.put("Deep Purple", "607D8B");
		colorMap.put("Blue", "673AB7");
		colorMap.put("Teal", "5677FC");
		colorMap.put("Brown", "795548");
		colorMap.put("White", "FFFFFF");
	}
	
}

