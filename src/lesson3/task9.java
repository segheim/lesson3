package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		
		int number ;
        number = 112;
        int del = 8;
        int ost = -1;
        ArrayList<Integer> mass = new ArrayList<Integer>();
        while ( number != 0 ){
            
            ost = number%del;
            number = number/del;
            if(number != 0){
                   mass.add(ost);
                   
            }
        }
       for(int i = mass.size() - 1; i >= 0; i --)
           System.out.println(mass.get(i));
       
    }
		
		
		
		

	}


