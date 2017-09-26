interface IGroceryList {
  boolean add(GroceryItem item);
  
  boolean remove(String name);
  
  boolean markAsBought(String name);
  
  public boolean addAtIndex(GroceryItem item, int index);
    
  //int totalQuantity();
  
  //boolean reduceQuantity(String itemName, int quantity);
  
  void display();
}