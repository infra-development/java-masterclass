package lecture2;

public class dataTypes {
    /*
    In java every variable and every expression has some type
    each and every data types clearly define
    every assignment should be checked by compiler for type compatibility
    because of above reason we can conclude java language is strongly typed programming language
    java is pure object-oriented programing language or not?  -> yes | no
    Java is not concerned as pure object-oriented language because several whoop features not satisfied by java
    (like operator overloading, multiple inheritance)
    more over we are depending on primitive data types which are non objects

    primitive data types(8)   -> 1.Numeric data types  ,   2.Non-numeric Data types
    1.Numeric data types   -> ( a) Integral data types -> I.byte, II.short, III.int, Iv.long
                              (b) Floating-point data types -> I.float , II.double
    2.Non-numeric Data types -> (a) char
                                (b) boolean

    Accept boolean and char remaining data types concerned as singed data types
    because we can represent both positive and negative numbers
    byte size = 1 byte (8 bit)
    max_value : +127            MSB
    min_value : -128            |*|1|1|1|1|1|1|1|
    range: -128 to 127
    the most significand text as signbit 0 means positive number 1 means negative number
    positive number will be represented directly in a memory where e as negative number represented in to
    composites form.

    ->byte____________________________________________________
    byte b=10;
    byte b=127;
    byte b=128;
    ce: possible loss of precision
    found: int
    required: byte

    byte b=10.5;
    ce: possible loss of precision
        found: double
        required: byte
    byte b=true;
    ce: incompatible types
    found: boolean
    require:byte

    byte b= "kaushik";
    ce: incompatible types
    found: java.lang.string
    required:byte

    if you want to handle data in the form of streams either
    byte is the best choice if we want to handle data in terms of streams either form the file are form the network
    (file supported form or network supported form is byte).

    ->short______________________________________
    This is most rarly used data type in java  //it is not that much powerful data type
    size: 2 byte (16)bit
    range: -2**15 to 2**15 -1
            (-32768 to 32767)
    short r = 32767;
    short r = 32768; // invalid
        ce: plp
        found:int
        required:short
    short r = 10.5;
    ce: plp
    found: double
    required:short

    r = true;
    ce:in compatible types
    found:boolean
    required:short
    when short data types is the best choice
    java came in 1995
    short data types is the best datable for 16bit processor like 8085 but this processor is completely out dated
    and hence responding short data type is also out dated data type.

    ->int_______________________________________________
    the most commonly used data type in java is int
    size: 4byte(32bit)
    range: -2**31 to 2**31-1
            [-2147483648  to 2147483647]
    int x = 2147483647;  //valid
    int x = 2147483648; //invalid get error
    ce: integer number too large
    int x= 2147483648l;
    ce:plp
    found: long
    required:int
    int x = true;
    ce: incompatible types
    found: boolean
    required:int

     */
}
