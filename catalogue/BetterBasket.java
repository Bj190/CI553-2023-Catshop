package catalogue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
 
  
  public String productList(Product pr) {
	  double total2 = 0.0;
	  ArrayList<String> products = new ArrayList<String>();
	  for(int i = 0; i < products.size(); i++) {
		  if(pr.equals(products.get(i))){
			  int number2 = pr.getQuantity();
			  number2++;
			  total2 = pr.getPrice() * number2;
		  }
		  else {
			  super.add(pr);
		  }
	  }
	  //to be sorted
	  return productList(products);
  }
  
  @Override
  public boolean add ( Product pr)
  {       
	super.add(pr); 
	productList(pr);   
	  
  }
 

  // You need to add code here
}
