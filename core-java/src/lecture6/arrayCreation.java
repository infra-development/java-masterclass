package lecture6;

public class arrayCreation {
    /*
    Array creation
    Every Array in java is an object only hence we can create arrays by using new operator
    int[] a= new int[3];

    for Every Array type corresponding classes are available for these classes are part of java language
    aren't available for programmer level
    int[] a[] new int[3];
    s.o.pln(a.get class().get name()); [I
    Array type               |   corresponding class name
    int[]                  -->     [I
    int[][]                -->     [[I
    double[]               -->     [D
    short[]                -->     [s
    byte[]                 -->     [B
    boolean[]              -->     [z

    conclusion1: At the time of Array creation compulsory we should specify the size
    otherwise we will get compile time error
    int[] x = new int[]; //invalid
    int[] x = new int[6];

    conclusion2: it is legal to have an Array with size of 0 in java
    ex: int[] x = new int[0];

    conclusion3: if we are trying to specify array size with some negative int value than we will get
    Runtime exception saying negative size exception
    int[] x = new int[-3]; Re(Runtime error): Negative Array size exception

    conclusion4: To specifying array size the allowed data types are byte , short ,char , int
    if we're trying to specify any other type then we will get compile time error
    int[] x = new int[10];
    int[] x = new int['a'];
    byte b = 20;
    int[] x = new int[b];
    short s = 30;
    int[] x new int[s];
    int[] x = new int[10l]; ce : p . l . p , found: long , required;int

    conclusion7: The maximum allowed array size in java is 2147483647 which is the maximum value
    of int Datatype
    int[] x = new int[2147493647];
    int[] x new int[21474936478]; ce:integer number too long
    even in the first case we make it run time exception
    if sufficient memory not available

     */
}
