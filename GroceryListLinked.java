class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  //item -> boolean
  //adds an item at the top of the list
  /*Fields:
   * this.head -- GroceryNode
   * this.size -- int
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * Fields of GroceryNode:
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * Methods of GroceryItem:
   * addQuantity(int)
   * buy()
   * toString()
   * equals(Object)
   */
  public boolean add(GroceryItem item) {
    //quantity?
    GroceryNode newNode = new GroceryNode(item, head);
    this.head = newNode;
    this.size++;
    return true;
  }
  
  
  //item, int -> boolean
  //adds an item at a given index
  /*Fields:
   * this.head -- GroceryNode
   * this.size -- int
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * Fields of GroceryNode:
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * Methods of GroceryItem:
   * addQuantity(int)
   * buy()
   * toString()
   * equals(Object)
   */
  public boolean addAtIndex(GroceryItem item, int index) {
    //quantity?
    if(index == 0 || this.size == 0){
      add(item);
      return true;
    }
    
    if(index > this.size + 1) {
      throw new IndexOutOfBoundsException("The index is out of bounds.");
      //return false;
    }
    
    if(index == this.size){
      GroceryNode current = this.head;
      while(current.next != null){
        current = current.next;
      }
      
      current.next = new GroceryNode(item, null);
      
      size++;
      return true;
    }
    
    GroceryNode previous = this.head;
    GroceryNode current = this.head.next;
    
    int cursor = 1;
    
    while(current != null){
      if(cursor == index){
        
        current = new GroceryNode(item, current);
        previous.next = current;
        
        this.size++;
        return true;
      }
      
      previous = previous.next;
      current = current.next;
      
      cursor++;
    }
    
    
    return false;
  }
  
  
  //String -> boolean
  //Removes the first instance of the object item
  //from the calling list, if present.
  //Returns true if item is present, false if not.
  /*Fields:
   * this.head -- GroceryNode
   * this.size -- int
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * Fields of GroceryNode:
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * Methods of GroceryItem:
   * addQuantity(int)
   * buy()
   * toString()
   * equals(Object)
   */
  public boolean remove(String name) {
    if (this.size == 0) {
      return false;
    }
    
    GroceryItem item = new GroceryItem(name, 0);

    //traverse to find item
    //reference of previous node
    GroceryNode previous = this.head;
    GroceryNode current = this.head.next;
    
    if(item.equals(previous.data)){
      this.head = current;
      previous = null;
      
      this.size--;
      return true;
    }
    
    //while(current.next != null){
    while(current != null){

      if (item.equals(current.data)){
        previous.next = current.next;
        current.next = null;
    
        this.size--;
        return true;
      }
      
      previous = previous.next;
      current = current.next;
      
    }
    /*
    if (item.equals(current.data)){
        previous.next = current.next;
        current.next = null;
    
        this.size--;
        return true;
      }
       */
    return false;
  }
  
  //String -> boolean
  //Returns true if the item has been marked as bought
  //Returns false if the item doesn't exist
  /*Fields:
   * this.head -- GroceryNode
   * this.size -- int
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * Fields of GroceryNode:
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * Methods of GroceryItem:
   * addQuantity(int)
   * buy()
   * toString()
   * equals(Object)
   */
  
  public boolean markAsBought(String name) {
    GroceryItem item = new GroceryItem(name, 0);
    
    GroceryNode current = this.head;
    
    while(current != null){
      if (item.equals(current.data)){
        current.data.buy();
        return true;
      }
      current = current.next;
    }
    
    return false;
  }
  
  public void display() {
    GroceryNode current = this.head;
    while(current != null){
      System.out.println(current.data);
      current = current.next;
    }
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}