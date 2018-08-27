package todo.entities;


import java.util.List;


public class User {
	private String username;
    private String password;
    private boolean active;
    private List<Card> cardList;
    private String name;
    private String lastname;
    private String email;
    
    User(){}
    
    public User(String _username, String _password){
    	this.username = _username;
    	this.password = _password;
    }
    
    public String getUsername(){ return this.username;}
    
    public void setUsername(String _username){this.username = _username;}
    
    public String getPassword(){return this.password;}
    
    public void setPassword(String _password) {this.password = _password;}
    
    
    
    
    

}
