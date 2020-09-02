public class NumberOps{

public static void main(String args []){

double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;

double Q;
double W;                                                   //Challenge 1
double E;                                                   //Dmitri Albig, Computer Science
double R;                                                   
  
  Q = 57.2 * (i1 / i2) + 1;
  System.out.println(Q);

W = 57.2 * ((double)i1 / i2) + 1;
System.out.println(W);

E = 15 - i1 * (d1 * 3) + 4;
System.out.println(E);

R = 15 - i1 * ((int)d1 * 3) + 4;
System.out.println(R);

T = 15 - i1 * (int)(d1 * 3) + 4;
System.out.println(T);

//____________________________________________________________________________________________________________________________

// challenge 2

double yo = 1234;
double mama = 6789;
double moment = 1080;

String n1 = yo + "";


String nn1 = n1.substring(3,4);
System.out.print(nn1);

String nn2 = n1.substring(2,3);
System.out.print(nn2);

String nn3 = n1.substring(1,2);
System.out.print(nn3);

String nn4 = n1.substring(0,1);
System.out.println(nn4);




String n2 = mama + "";

String nnn2 = n2.substring(3,4);
System.out.print(nnn2);

String nnn3 = n2.substring(2,3);
System.out.print(nnn3);

String nnn4 = n2.substring(1,2);
System.out.print(nnn4);

String nnn5 = n2.substring(0,1);
System.out.println(nnn5);




String n3 = moment + "";


String e2 = n3.substring(3,4);
System.out.print(e2);

String e3 = n3.substring(2,3);
System.out.print(e3);

String e4 = n3.substring(1,2);
System.out.print(e4);

String e5 = n3.substring(0,1);
System.out.print(e5);










    }

}
