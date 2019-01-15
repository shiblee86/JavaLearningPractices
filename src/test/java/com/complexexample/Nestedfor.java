package com.complexexample;
public class Nestedfor {



    public static void main(String[]args) {





        int [] bookingids = new int[16];

        int start = 20171101;



        for(int x = 0; x < bookingids.length; x++)

        {

            bookingids[x] = start;

            start++;

        }



        for(int salesid = 0; salesid<bookingids.length; salesid++)

        {

    

        int [] bookingamt = new int[16];

        int start2 = 5000;

        

        for(int y = 0; y < bookingamt.length; y++)

        

        {

        bookingamt[y] = start2;

        start2++;

        }

        

        for(int salesamt = 0; salesamt <bookingamt.length; salesamt++)

        {

        System.out.print(bookingids[salesid] + "    ");

        System.out.println(bookingamt[salesamt]);

        }

        }

        

        

        }

    }