package com.xworkz.learn;

public class Note {
    public static void main(String[] args) {
        String PESITM="Information Technology";

        if(PESITM=="Management Studies" | PESITM=="Information Technology") {
            System.out.println("User Permitted");
        }
        else
        {
            System.out.println("User Bloked");
        }                    // Logical OR Operator, denoted by |

        String Shivamogga="Sahyadri";

        if(Shivamogga=="Sahyadri" || Shivamogga=="Malenadu"){
            System.out.println("The Malenadu region Shivamogga");
        }
        else {
            System.out.println("It is not Malenadu Region");
        }
    }
}

        // Logical Short Circuit OR Operator, denoted by ||