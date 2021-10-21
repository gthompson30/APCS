/*
Nacho Patcho (Gabriel Thompson and Iggy, Faiza Huda and Truthful Tom, Jacob Ng and PreGuac)
APCS
HW21 -- STAtisTically Speaking...
2021-10-20
*/

/*
DISCO:
-We discovered we could make a method for converting doubles to ints
-We discovered in the max functions that else{} isn't needed
QCC:
-Why was casting banned?
-How are we supposed to convert doubles to int without casting?
-For max with 3 inputs we can call our max function with 2 inputs.
*/

public class StatsDriver{
        public static void main( String[] args ){
                Stats st = new Stats();
              System.out.println(st.mean(2,4)); // Should be 3
               System.out.println(st.mean(2.0,4.0)); // Should be 3.0
               System.out.println(st.mean(1, 0)); // Should be 1 or 0
               System.out.println(st.mean(1.0, 0.0));// Should be 0.5

               System.out.println(st.max(7,5)); //Should be 7
               System.out.println(st.max(7.7777, 4.4444444444444)); //Should be 7.7777
               System.out.println(st.max(1, 0)); //Should be 1
               System.out.println(st.max(1.0, 0.0));//Should be 1.0

               System.out.println(st.geoMean(4, 16)); //Should be 8
               System.out.println(st.geoMean(3.00, 12.0)); //Should be 6.0
               System.out.println(st.geoMean(1,0)); // Should be 0

               System.out.println(st.max(7,5,10)); //Should be 10
               System.out.println(st.max(7.7777, 4.4444444444444, 9.0)); //Should be 9.0
               System.out.println(st.max(1, 0, 0)); //Should be 1
               System.out.println(st.max(1.0, 0.0, 1.0));//Should be 1.0

               System.out.println(st.geoMean(2, 16, 2)); //Should be 4
               System.out.println(st.geoMean(9.0, 243.0, 177147.0)); //Should be 729
               System.out.println(st.geoMean(1,0,0)); // Should be 0
        }
}
