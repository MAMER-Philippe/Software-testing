
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



/**
 * TODO : Add your import here
 * 
 */

public class BookShopTest {

	BookShop shop= new BookShop("Mamer Store");
    /**
     * TODO : Put your test here
     */

    @Test
    public void myFirstTest(){
       // assertTrue(false);
    	int[] n= {1,1,1,0,0};
        assertEquals(23.86,shop.cost(n));
    }
}