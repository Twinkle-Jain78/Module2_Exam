class Item{
    int itemid;
	String itemName;
	Item(int itemId,String ItemName){
	 this.itemName = itemName;
	 this.itemName = itemName;
	}
	 Item(){}
	 
	 void setitemId(int itemId){
		 this.itemId =itemId;
		 
	 }
	 void setitemName(int itemName){
		 this.itemName = itemName;
		 
	}
	public String toString(){
	return this.itemId+""+this.itemName;
	}
}
class namesort inplements Comparator<Item>{
	
	public int compare(Item I1, Item I2){
		
	return I1.itemName.compareTo(I2.itemName);
	}
	
class idsort implements Compartor<Item>{
	public int compare(Item I1, Item I2){
	return I1.itemId-(I2.itemId);
	
	}
	
class Inventory{
	
	static Item  I = new Item();
	static ArrayList<Item>list = new ArrayList<> ();
	  public static void main (String[] args ){
		  Scanner(System.in);
		          int choice;
				  Item I1 = new Item(1,"A");
				  Item I2 = new Item(2,"B");
				  Item I3 = new Item(3,"C");
				  Item I4 = new Item(4,"D");
				  Item I5 = new Item(5,"H");
				  Item I6 = new Item(7,"W");
				  Item I7 = new Item(8,"X");
				  list.add(I1);
				  list.add(I2);
				  list.add(I3);
				  list.add(I4);
				  list.add(I5);
				  list.add(I6);
				  list.add(I7);
				  do{
					  System.out.println("Enter Your choice ==");
					  System.out.println("1");
					  (Add Item.\n2) Display complete inventory in Sorted order of item names as well as itemid.\3) Remove Item.\4)
					  exit");
					   choice = sc.nextInt();
					   switch(choice){
						   case 1: System.out.println("Enter the detail as follow");
						           System.out.println("Enter the Item  you want add");
						           for (int i =1;i<=1; i++){
									   System.out.println("Enter id of item");
									   int d = sc.nextInt(d);
									   I.setitemId(d);
									   System.out.println("Enter name of item");
									   sc.nextLine();
									   String s1 = sc.nextLine();
									   I.setitemId(s1);
									   list.add(I);
									   System.out.println(list);
									   break;
							case 2: System.out.println("before Sorting");
                                    System.out.println(list);
                                    System.out.println("sorting by id");
                                    idsort n2 = new idsort();
                                    Collection.sort(list.n2);
                                    System.out.println(list); 
                                    System.out.println("Sorting by name");
                                    namesort n1 = new namesort();
								    Collection.sort(list.n1);
								    System.out.println(list);
								    break;
							case 3: System.out.println("list as follow"); 
							       System.out.println(list);
								   System.out.println("Enter index item which you want to remove index start from 0");
								   int re = sc.nextInt();
								   list.remove(re);
								   System.out.println("list after remove item");
								   System.out.println(list);
								   break;
							case 4: System.out.println("THANKS");
							       break;
					   }
					   }while(choice!=4){
				  
					   
				  }
	  }
				  
				  
	 
}	
	