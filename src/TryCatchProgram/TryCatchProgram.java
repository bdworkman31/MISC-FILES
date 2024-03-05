/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TryCatchProgram;

public class TryCatchProgram {

    public static void main(String[] args) {
        // This is an example from W3C.org
        // original program
//        int[] myNumbers = {1, 2, 3};
//        System.out.println(myNumbers[10]); // error!
//    
        
        // Adding a try catch to it to give more information
    
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } // Adding finally
        finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
