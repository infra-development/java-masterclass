package lecture3;

public class testdata1 {
    /*
    Datatype part-2
    ________________long data type________________________
    some time int may not enough to hold big values then we should go for long type
    ex1: the among of distance traveled by light in a thousand days ,
        to hold this values int may not enough we should go for long data type.
            long l = 1,26,000*60*60*24*1000 miles
    ex2: The number of character present in big file may excite int range hence the
        return type method is long but not int
            long l = f.length()
    size: 8byte(64bit)
    Range: -2**63 to 2**63-1
    ________________________________________________________________________________
    All the above data type (byte,short,int,long)want for representing intigrel values
    if we want to represent floating point values then we should go for floating point
    data types
    ______________Floating point data types_________________
    float,double
    1.float , 2. Double
        1. if we want 5 to 6 decimal places of accuracy then we should go for
        2. if we want 14 to 16 decimal places of accuracy then we should go for double
      1.float follow single prescription
      2.double follow double prescription
      1.size:4byte
      2.size:8byte
      1.Range -1.7e38 to 1.7e38
      2.Range -3.4e38 to 3.4e38

    ---------------boolean data type____________________
    in java size not applicable [vm dependent]
    Range: N.A [ But allowed values are: true\false]
    boolean b = true; //valid
    boolean b = 0;  //invalid  ce: incompatible types
                                found: int
                                required: boolean
    boolean b = True;   ce: cannot find symbol,
                        symbol: variable True
                        location: class Text
    boolean b = "true"; ce: incompatible types
                            found: java length string
                            required: boolean

    int x = 0;
    if(x){                                                                      while(1){
        sop("hello");           ce:incompatible types                                   sop("hello);
        }else{                      found:int                                           }
        sop("Hi");                  required:boolean
        }
    ______________char_____________
    size: 2byte(16bit)
    old languages (c or c++) ascII code based
    under number of allowed difference ascII character are <= 266 to represent this 256 character
    8 bit are enough hence the size of char in old languages is 1 byte but java is unicode based
    under the number of different unicode are > 256 and <=65536 to represent this many character 8 bit may not
    enough compulsory we should go for 16 bit hence the size of char in java is 2 byte
    Range: 0 to 65535

    summary of java primitive data types
    Null is default value for object difference, and we can't apply for primitive if we are trying to use for primitive  then
    we get compile time error        ex: ce: ch = null;
                                            found : <null type>
                                            required: char
     */
}
