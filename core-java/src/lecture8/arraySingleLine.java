package lecture8;

public class arraySingleLine {
    /*
    Array declaration, creation and initialization in a single line

    conclusion-1 we can declare create and initialize array in a single line(shortcut representation)
    int[] x;
    x = new [3];
    x[0] = 10;
    x[1] = 20;
    x[2] = 30;
    int[] x = {10,20,30};
    char[] ch = {'a','e','i','o','u'};
    string[] s = {"a", "aa", "AAA"};

    conclusion-2 we can extend this shortcut for multidimensional array also
    int[][] x = {{10,20},{30,40,50}};

    int[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}}; //represent in memory location
    s.o.pln(x[0][1][2]); -->60
    s.o.pln(x[1][0][1]); -->80
    s.o.pln(x[2][0][0]); -->Re: array Index of bound exception
    s.o.pln(x[1][2][0]); -->Re: array Index of bound exception
    s.o.pln(x[1][1][1]); -->100
    s.o.pln(x[2][1][0]); -->Re: array Index of bound exception

    conclusion-3 if we want to this shortcut compulsory we should perform all activity in single line
    if you are trying to divide in multiple line then we will get compile time error
    int x = 10;
    x = 10; //valid
//  int[] x = {10,20,30};
    int[] x;
    x = {10,20,30}; ce:illegal start of expression

    length vs length()
    length is final variable applicable for arrays
    length variable represent the size of arrays
    example:
    int[] x = new int[6];
    s.o.pln(x.length()); -->ce: cannot find symbol , symbol: method length(), location: class int[]
    s.o.pln(x.length); -->6

    length() method is your final method applicable for string objects
    length method return number of character present in the string.
    string s = "kaushik";
    s.o.pln(s.length); ce: cannot find symbol , symbol: variable length, location: class j.l.string
    s.o.pln(s.length()); -->7

    note: length variable applicable for arrays but not for string objects,
    whereas length()(length method) applicable for string objects but not for arrays
    string[] s = {"A","AA","AAA"};
    1.s.o.pln(s.length); -->3
    2.s.o.pln(s.length()); --> ce: cannot find symbol, symbol: method length(), location: class string[]
    3.s.o.pln(s[0].length); -->ce: cannot find symbol, symbol: variable length, location: class j.l.string
    4.s.o.pln(s[0].length()); -->1
    in multi dimensional array length variable represent only base size
    but not total size.
    int[][] x = new int[6][3];
    s.o.pln(x.length); --> 6
    s.o.pln(x[0].length); --> 3

    there is no direct way to specifying total length multidimensional arrays,
    but indirectly we can find as follow
    x[0].length + x[1].length+ x[2].length + ...

    new topic --------->>   anonymous arrays <<----------
    definition- sometime we can declare an arrays without name such type of name less
    arrays are called anonymous arrays .
    the main purpose of anonymous arrays is just for instance use (one time usage).

    how to create-> we can create anonymous  arrays as follows
    new int[] {10,20,30,40}

    conclusion-1 while creating anonymous  arrays we can't specify the size otherwise we
    will ge compile time error
    new int[3] {10,20,30,40} //invalid
    new int[] {10,20,30,40} //valid

    conclusion-2 we can create multidimensional anonymous arrays also
    new int[][] {{10,20},{30,40,50}}; //valid

    conclusion-3 based on our requirements we can give the name for anonymous array
    then it is no longer anonymous.
    int x = new int[] {10,20,30};

    class text
    {
        p s v main(string[] args)
        {
            sum(new int[]{10,20,30,40}),
         }
         p s v sum(int[] x)
         {
            int total = 0;
            for(int x1 = x )
            {
                total = total + x1;
             }
             s.o.pln("the sum + total);
             }
        }
        in above example just to call sum method we required an array but
        after completing sum method call we're not using that array anymore
        hence for this one time requirement anonymous array is the best choice

        ----------> array element assignments <-----------
        case 1
        in the case of primitive type arrays as array elements we can provide any type
        which can be implicitly promoted to declared type like..

        int[] x = new int[5];
        x[0] = 10;
        x[1] = 'a';
        byte b = 20;
        short s = 30;
        x[3] = s;
        x[4] = 10l; ce: plp, found: long , required:int

        in the case of float type array the allowed data type are
        byte->short->char->int->long->float

        case-2
         in the case of object type arrays as array elements we can provide
         either declared type object or it's child class object

         eg-1
         Object[] a = new object[10];
         a[0] = new object();
         a[1] = new string("kaushik");
         a[2] = new integer(10);
         eg-1
         Number[] n = new Number[10];
         n[0] = new Integer(10);
         n[1] = new Double(10.5);
         n[2] = new string("kaushik"); ce: incompatible types, found: j.l.string, required: j.l.Number

         case-3
         for inter face type array as array element it's implementation class object allowed

         eg-
         Runnable[] r = new Runnable[10];
         r[0] = new Thread();
         r[1] = new string("kasuhik"); ce: incompatible type, fond: j.l.string , required:j.l.Runnable

         Array type ------------------>> Allowed element Types
         primitive type --> any type which can be implicitly promoted to declared type
         object type arrays --> either declared type or it's child class objects
         abstract class type arrays --> it's child class objects
         interface type arrays --> it's implementation class objects are allowed

     */
}
