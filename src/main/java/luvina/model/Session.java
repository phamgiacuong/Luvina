package luvina.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;


public class Role{
	int cust_id;
	boolean role;
 

}

public Role(){

}
public Interger getCust_id(){

	return cust_id;
}

public Interger setCust_id(int cust_id){

	return this.cust_id =cust_id;
}

public Boolean getRole(){
	return role;
}

public Boolean setRole(int role){
	return this.role=role;
}