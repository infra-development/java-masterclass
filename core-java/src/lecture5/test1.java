package lecture5;

public class test1 {
    /*
    __________char__________________
    1st way to : we can specify char literal as single character with in single quote
    char ch = 'a';
    char ch = a; ce: cannot find symbol, symbol: variable a, location:class test1
    char ch = "a"; ce: incompatible type, found: string , required: char
    char ch = 'ab'; ce1: unclosed char literal , ce2: unclosed char literal ce3:not a statement

    2way to : we can specify char literal as integral literal which can represent unicode value of the
    character and that integral literal can be specified either in decimal, octal or hexadecimal forms
    but allowed range is 0 to 65535
    char ch = 97;
    char ch = 0xface;
    char ch = 0777;
    char ch = 65535;
    char ch = 65536; ce: possible loss of precession, found: int , required char

    we can represent char literal as unicode represent which nothing but '\uxxxx' 4-digit hexadecimal number
    char ch = '\u0061';
    s.o.p(ch); --> a

    every escape character is valid char literal
    ex: char ch = \n;
        char ch = \t;
        char ch = \m; ce: illegal escape character
    in java 8 escape character their
    these are various escape charter presenting in java
    \n ---> new line
    \t ---> horizontal Tab
    \r ---> carriage return
    \b ---> Back space
    \f ---> Form Feed
    \' ---> Single quote
    \" ---> double quote
    \\ ---> Back slash
    s.o.p("This is \' symbol");
    s.o.p("this is \" symbol");
    s.o.pln("this is \\ symbol");

    which are the following are valid
    char ch = 65536; //invalid
    char ch = 0xBeer;   //invalid
    char ch = \4face;   //invalid
    char ch = '\ubeef';
    char ch = '\m'; //invalid
    char ch = '\iface';

    -----------string literal----------------
    any sequence of character within double quote it is treated as string literal
    string s = "kaushik";

    1.7 version enhancement with respected to literal
    (1) binary literal
   for integral data type until 1.6 version we can specify literal value in the following ways
   1. decimal form
   2. octal form
   3. hexadecimal form
   but from 1.7 version we can specify literal value even in binary form also
   allowed digits are 0 and 1
   literal value should be prefixed with 0b of 0B
   int x = 0B1111;
   s.o.pln(x); --> 15

   2.enhancement
   usage of underscore(_) symbol in numeric literal from 1.7 version on wards we can use underscore
   symbol between digits of numeric literal
   ex : double d = 123456.789;
        double d = 1_23_456.7_8_9;
        double d = 123_456.7_8_9;
   the main advantage of this approach is readability of the code will be improved
   at the time of competition this underscore symbol will be removed automatically
   hence after compilation above line become
        double d = 123456.790;
   we can use more then one underscore symbol also between the digit
   double d = 1__23_4_5__6.7_8_9;
   double d = 1___2__3_4_5_6.7_8_9;
   we can use underscore symbol only between the digits
   if we're using anywhere else we will get compile time error
   double d = _1_23_456.7_8_9;  //invalid
   double d = 1_23_456_.7_8_9;  //invalid
   double d = 1_23_456.7_8_9_;  //invalid

   byte --> short __
                    -->int --> long --> float --> double
   char --->--------^
   8 byte long value we can assign to 4 byte float variable because
   both are following different memory representation internally
   float f = 10l;
   s.o.p(f); --> 10.0




     */
}
