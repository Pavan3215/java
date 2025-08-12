import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo {
    static String input() {
        String item;
        System.out.print("Enetr the element : ");
        Scanner f = new Scanner(System.in);
        item=f.nextLine();
        return item;
    }
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice,pos;
        String item;
        do {
            System.out.println("1-> Create list");
            System.out.println("2-> Insert an element at first");
            System.out.println("3-> Insert an element at last");
            System.out.println("4-> Insert an element at position");
            System.out.println("5-> Removing an element from first place");
            System.out.println("6-> Removing an element from last place");
            System.out.println("7-> Removing an element at specified position");
            System.out.println("8-> Removing an element by value");
	    System.out.println("9-> Display List Information");
	    System.out.println("10-> Search by position");
            System.out.print("Enetr your choice : ");
            choice=sc.nextInt();
            
            switch(choice) {
                case 1 : fruits.add(input());
                         break;
                        
                case 2 : fruits.addFirst(input()); 
                         break;
                        
                case 3 : fruits.addLast(input()); 
                         break;
                        
                case 4 : System.out.print("Enter the position :");
                         pos=sc.nextInt();
                         fruits.add(pos-1,input());
                         break;
                         
                case 5 : System.out.println("The deleted element is :"+fruits.removeFirst());
                         break;
                case 6 : System.out.println("The deleted element is :"+fruits.removeLast());
                         break;
                         
                case 7 : System.out.print("Enter the position :");
                         pos=sc.nextInt();
			 if(pos-1 <= fruits.size()) {
                         System.out.println("The element at position "+pos+" is :"+fruits.remove(pos-1)+" deleted from the list");
                	 }
			 else
			     System.out.println("Invalid Position");
                         break;
                case 8 : item=input();
                         if (fruits.contains(item)) {
                            System.out.println("The element "+item+" is available in list");
                            System.out.println("and "+fruits.remove(item)+" is deleted from the list");
                          } else {
                            System.out.println("The element is not found in the list.");
                          }
                          break;
                case 9 : System.out.println("First Element: " + fruits.getFirst());
                         System.out.println("Last Element: " + fruits.getLast());
                         System.out.println("Size of the list: " + fruits.size());
                         break;
                        
		case 10 : System.out.print("Enter the search position :");
			  pos=sc.nextInt();
			  if(pos-1 <= fruits.size()) {
			     System.out.println("The element found at"+pos+"is"+fruits.get(pos-1));
			  }
			  else
			     System.out.println("Invalid Position");
			  break;
            }
            System.out.println("Fruits List: " + fruits);
        }while(choice < 11);
        
        }
    }
