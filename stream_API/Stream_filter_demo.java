package advance_java.stream_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Product implements Comparable<Product>{
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int compareTo(Product o) {
		return o.price-this.price ;
	}
		 
}

public class Stream_filter_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Product Product;
	
	List<Product> Productlist = new ArrayList<>();
	Productlist.add(new Product(1,"hp pavilion",60000));
	Productlist.add(new Product(2,"hp elitebook",50000));
	Productlist.add(new Product(3,"vivo book",76000));
	Productlist.add(new Product(4,"macbook",100000));
	Productlist.add(new Product(5,"mibook",70000));
	
	List<Product> newProductlist = new ArrayList<>();
	
	newProductlist=Productlist.stream().filter(n->n.price>=60000).collect(Collectors.toList());
						//	.forEach(n->System.out.println(n.name+" "+n.price));
	Collections.sort(newProductlist);
	newProductlist.forEach(n->System.out.println(n.id+" "+n.name+" "+n.price));
		
	}

}
