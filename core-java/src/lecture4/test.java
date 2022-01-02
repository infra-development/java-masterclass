package lecture4;

public class test {
    /*
    _________Literals_____________
    any constant value which can be assigned to the variable is called literal
    ex: int x = 10;
    int -> datatype | keyword,
    x -> name of variable | identifier then
    10 -> constant value | literal

    ----> integral literals <----
    for integral data types (byte, short , int , long) we can specify literal value
    in the following base
    1) decimal literals(form): (base 10)
    allowed digit are 0 to 9
    ex: int x = 10;

    2) octal literals(form): (base 8)
    allowed digit are 0 to 7
    literal value should be prefixed with 0
    ex: int x = 010;

    3) hex decimal literals(form): (base 16)
    allowed digit are 0 to 9, a to f
    for extra digit(a to f) we can use both lowercase and uppercase characters
    this is one of very few areas where java is not case-sensitive
    the literal value should be prefixed with 0x or 0X
    ex int x = 0X10;

    -->These are only possible ways to specify literal value for integer data types

    1.which are following declaration are valid
    int x = 10;
    int x = 0786; ce: integer number too long
    int x = 0777;
    int x = 0xBeef;
    int x = 0xBreef; ce: ';' expected
    2.possibility
    int x = 10;    -> 10
    int u = 010;    -> 8
    int z = 0x10;   -> 16
    3.possibility
    by default int type every integral literal is of int type, but we can specify explicitly as long type
    by suffixed with small(l) or capital(L)
    ex;
    int x = 10;
    long l = 10L;
    int x = 10L;    //invalid  ce: possible loss of precise
                               found: long
                               required: int
    long l = 10;

    can you consider as byte & short
    there is no direct way to specify byte and short literals explicitly but indirectly we can specify
    when ever you are assigning integral literal to the byte variable undep the value within the range of byte
    then compiler treat is as automatic byte literal similarly short literal also
    byte b = 10;
    byte b = 127;
    byte b = 128; ce: p l p  | found: int , required: byte
    short s = 32767;
    short s= 32768; ce: p c p | found: int , required:short
    --------------------------------------------------------------------------------
    floating point literal
    bt default every floating point literal is of double type an enhanced we can assign directly to the float
    variable, but we can specify floating point literals as float type by suffixed with the small f 0r F.
    float f = 123.456; ce: p l p | found: double , required: float
    float f = 123.456f;
    double d = 123.456;

    we can specify explicitly floating point literals as double type by suffixed with d or D
    of course this convinced is not required
    double d = 123.456D;
    float f = 123.456D; cd: p l p | found: double , required: float

    we can specify floating point literal only in decimal form, and  we can't specify in octal and hexadecimal forms
    double d= 123.456;
    double d= 0123.456; //get in decimal literal but not octal
    double d= 0x123.456; ce: mal formed floating point literal

    we can assign integral literal directly to floating point variable under that integral literal
    can be specified either in decimal or octal or hexadecimal forms

    double d= 0786; ce: integer number too large
    double d = 0xface;
    double d = 0786.0;
    double d = 0xface.0; ce;
    double d = 10;
    double d = 0777;

    we can't assign floating point literal to integral types
    double d = 10;
    int d = 10.0; ce: P L P , found:double , required:int

    we can specify floating point literal even in exposition form scientific notation
    double d = 1.2e3;
    float f = 1.2e3; ce; p l p , found: double , required:float
    float f = 1.2e3f;

    _____________boolean literals________________________
    the only allowed values for boolean data types are true or false

    boolean b = true;
    boolean b = 0;  ce: incompatible types , found:int ,required:boolean
    boolean b = True; ce: cannot find symbol, symbol: variable True
    boolean b = 'true'; ce:incompatible types , found: java l string , required: boolean

    int x = 0;
    if (x){                     ----->>>   ce: incompatible types , found: int, required:boolean
        s.o.p.ln("hello");
        }else{
            s.o.p.ln("hi");
            }
     */
}
