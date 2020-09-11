package labex8;

import java.util.Scanner;

/**
 *
 * @author Desktop pc
 */
public class email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //object creation for class mail and invoking objects

        mail obj = new mail();
        obj = new mail();
        obj.get();
        obj.creation();

    }

}

class mail {

    String firstname, lastname;

    void get() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The firstname of email id:");
        firstname = obj.next();

        System.out.println("Enter The lasttname of email id:");
        lastname = obj.next();

    }

    void creation() {
        String sub1 = firstname.substring(0, 3);
        String sub2 = lastname.substring(0, 4);
        System.out.println("The email id is:");
        System.out.println(firstname.substring(0, 3) + "." + lastname.substring(0, 4) + ".@veltech.ac.in");

    }
}
