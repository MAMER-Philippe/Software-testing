
public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //TODO complete
    	double price=0.0;
    	double reduction=0.0;
    	int count=1;
 
    	for(int i=0;i<books.length;i++)
    	{
    		/*if(books[i]<0 && books[i]<=1)
    		{
    			reduction+=7;
    			price += i*8-(reduction/100);
    		}
    		else {*/
    		
    		if(books[i]==1) {
    			
    			if(count>=2)
    			{
    			reduction+=7.0;
    			price+= 8;
    			}
    			else {
    				price+=8;
    			}
    			count++;
    		}
    		
    		//}
    	}
    	price-=(reduction/100);
        return price;
    }
}
