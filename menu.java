import java.util.Scanner;
   class menu{
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int choice;
for(;;){
       System.out.println("1 for Customers");
       System.out.println("2 for Staff");
       System.out.println("3 for Admin");
       System.out.println("4 for Exit");
choice = sc.nextInt();
 
switch (choice){
       case 1: System.out.println("Customers  Block");
                 break;

       case 2: System.out.println("Staff Block");
                 break;
       case 3: System.out.println("Admin Block");
                 break;
       case 4: System.out.println("Exit Block");
                 break;
default:
       System.out.println("default Block");
                  break;

}
     }
          }
            }




