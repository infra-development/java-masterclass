package lecture7;

public class arrayInitialization {
    /*
    Array Initialization
    one's we create an array every element initialize by default values
    example: int[] x = new int[3];
             s.o.pln(x); [I@3e25a5
             s.o.pln(x[0]); --> 0
     whenever we are trying to print any different variable internally tow string
     method will be called which is implemented by default to return the string
     in the following form
     callsname@hashCode-in-hexadecimalform

     next terminology
     int[][] x = new int[3][2];
     s.o.pln(x); [[I@3ew5a5
     s.o.pln(x[0]); [I@3ew5a5
     s.o.pln(x[0][0]); 0
     example-3
     int[][] x = new int[3][];
     s.o.pln(x); [[I@3ew5a5
     s.o.pln(x[0]); null
     s.o.pln(x[0][0]); re:npe
     note: if we are trying to perform any operation on null then we will get Run time exception
     saying null pointer exception

     once we create an array every array element by default initialized with default values
     if we are not satisfied default values then we can overwrite this values
     with our customized values
     int[] x = new int[6];
     x[0] = 10;
     x[1] = 20;
     x[2] = 30;
     x[3] = 40;
     x[4] = 50;
     x[5] = 60;
     x[6] = 70; Re: array index out of bound exception
     x[-6] = 80; Re: array Index out of bound exception
     x[2.5] = 90; ce: possible loss of precision
     note: if we are trying to access array element with out of range index
            (either positive or nagetive int values)then we will get run time exception
            saying array index out of bound exception.




     */
}
