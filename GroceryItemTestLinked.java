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
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);
   
    GroceryListLinked arr1 = new GroceryListLinked();
   
    arr1.add(item1);
    arr1.add(item2);
    arr1.add(item3);
    arr1.add(item4);
    arr1.add(item5);
    
    assertEquals(false, arr1.remove("Chicken"));
    //assertEquals(true, arr1.remove("Carrots"));
    assertEquals(true, arr1.remove("Sugar"));
  }
 
 public void testAdd() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);
    GroceryItem item4 = new GroceryItem("Potato", 4);
    GroceryItem item5 = new GroceryItem("Sugar", 5);

    GroceryListLinked arr1 = new GroceryListLinked();
   
    assertEquals(true, arr1.add(item1));
    assertEquals(true, arr1.add(item2));
    assertEquals(true, arr1.add(item3));
    assertEquals(true, arr1.add(item4));
    assertEquals(true, arr1.add(item5));
     
  }
 
 public void testAddAtIndex0() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);

    GroceryListLinked arr1 = new GroceryListLinked();
   
    assertEquals(true, arr1.add(item1));
   
    assertEquals(true, arr1.addAtIndex(item2, 0));
     
  }
 
  public void testAddAtIndex1() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);

    GroceryListLinked arr1 = new GroceryListLinked();
   
    assertEquals(true, arr1.add(item1));
    assertEquals(true, arr1.add(item2));
    assertEquals(true, arr1.addAtIndex(item3, 1));
     
  }
 
  public void testAddAtIndex2() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    GroceryItem item2 = new GroceryItem("Carrots", 2);
    GroceryItem item3 = new GroceryItem("Salt", 3);

    GroceryListLinked arr1 = new GroceryListLinked();
   
    assertEquals(true, arr1.add(item1));
    assertEquals(true, arr1.add(item2));
    assertEquals(true, arr1.addAtIndex(item3, 2));
     
  }
  
  public void testAddAtIndexWhileEmpty() {
    GroceryItem item1 = new GroceryItem("Egg", 1);
    
    GroceryListLinked arr1 = new GroceryListLinked();
   
    assertEquals(true, arr1.addAtIndex(item1, 2));

     
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
 
}
