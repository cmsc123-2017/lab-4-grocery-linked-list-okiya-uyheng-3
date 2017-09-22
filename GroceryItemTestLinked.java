import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GroceryItemTestLinked extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testMarkAsBought() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);

    GroceryListLinked arr1 = new GroceryListLinked();
    
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
     
    assertEquals(false, arr1.markAsBought("Water"));
    assertEquals(true, arr1.markAsBought("Sugar"));  
  }
  
  public void testRemoveEnd() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);
   
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
    
    assertEquals(false, arr1.remove("Coffee"));
    assertEquals(true, arr1.remove("Egg"));
    
  }
  
 public void testRemoveMiddle() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);
   
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
    
    assertEquals(false, arr1.remove("Chili"));
    assertEquals(true, arr1.remove("Sugar"));
  }
 
 public void testRemoveOne() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    
    assertEquals(false, arr1.remove("Chili"));
    assertEquals(true, arr1.remove("Egg"));
  }
 
 public void testRemoveEmpty() {

    GroceryListLinked arr1 = new GroceryListLinked();
   
    assertEquals(false, arr1.remove("Chili"));

  }
 public void testRemoveFront() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    //GroceryItem item3 = new GroceryItem("Salt", 3);
    //GroceryItem item4 = new GroceryItem("Potato", 4);
    //GroceryItem item5 = new GroceryItem("Sugar", 5);
   
    //GroceryListArray arr1 = new GroceryListArray();
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    //arr1.add(item3);
    //arr1.add(item4);
    //arr1.add(item5);
    
    assertEquals(false, arr1.remove("Chicken"));
    assertEquals(true, arr1.remove("Carrots"));
  }
 
 public void testAdd() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);

   
    //GroceryListArray arr1 = new GroceryListArray();
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
     
  }
 
  public void testDisplay() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);

    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
    
    arr1.display();
     
  }
 
  public void testAdd() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);
    GroceryItem item6 = new GroceryItem("Chicken", 1);
    GroceryItem item7 = new GroceryItem("Tomato", 2);
    GroceryItem item8 = new GroceryItem("Pepper", 3);
    GroceryItem item9 = new GroceryItem("Lemon", 4);
    GroceryItem item10 = new GroceryItem("Chili", 5);
    GroceryItem item11 = new GroceryItem("Egg", 1);
    GroceryItem item12 = new GroceryItem("Chili", 5);
    GroceryItem item13 = new GroceryItem("Egg", 1);
    GroceryItem item14 = new GroceryItem("Orange", 5);
    GroceryItem item15 = new GroceryItem("Egg", 2);
   
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
    arr1.add(item6);
    arr1.add(item7);
    arr1.add(item8);
    arr1.add(item9);
    arr1.add(item10);
    arr1.add(item11);
    arr1.add(item12);
    arr1.add(item13);
    arr1.add(item14);
    arr1.add(item15);
     
  }
}
