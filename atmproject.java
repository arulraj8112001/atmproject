package atmpack;
import java.util.*;
public class atmproject{
public static void main(String args[]){


HashMap<Integer,signupatm> al=new HashMap<Integer,signupatm>();
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
HashMap<Integer,Integer> B=new HashMap<Integer,Integer>();

Scanner input=new Scanner(System.in);
System.out.println();

boolean a=true;

while(a)
{
System.out.println();
System.out.println("welcome to the kaniraj atm");
System.out.println();
System.out.println("1-SignUp");
System.out.println();
System.out.println("2-Login");
System.out.println();
System.out.println("3-Exit");
System.out.println();
System.out.println();

System.out.println("enter the choice");
int b=0;

try
{

int bcd=input.nextInt();

b=bcd;
}
catch(InputMismatchException e)
{
System.out.println("enter number only");
a=true;
}



System.out.println();


switch (b)
{

case 1:
{
System.out.println();
System.out.println("enter your  accno");
int accno=input.nextInt();
System.out.println("enter your  name");
input.nextLine();
String name=input.nextLine();
System.out.println("enter your  address");
String address=input.nextLine();
System.out.println("enter your  phno");
long phno=input.nextLong();
System.out.println("enter your  balance ");
int balance=input.nextInt();


if(al.containsKey(accno))
{
System.out.println("sorry it is always created");
}
else
{
al.put(accno,new signupatm(name,address,phno,balance));
B.put(accno,balance);
signupatm s=new signupatm(name,address,phno,balance);
s.display();
}

}
break;
case 2:
{

System.out.println();
System.out.println("enter your  name");
String name=input.next();
System.out.println();
System.out.println("enter your  accno");
int accno=input.nextInt();

System.out.println(); 

int count=0;
int key=0;
String value="";
boolean bl=true;

for (Map.Entry<Integer,signupatm> entry : al.entrySet())
{

if( (entry.getKey()==accno) && (entry.getValue().getname().equals(name) ) )
{
key=entry.getKey();
value=entry.getValue().getname();
count++;
}
}
if(count==1)
{
System.out.println("login successfully ");

int dep=0;
int with=0;
int one=0;

while(bl)
{
System.out.println();
System.out.println("select your options");
System.out.println();
System.out.println("1-deposite");
System.out.println("2-withdraw");
System.out.println("3-balance");
System.out.println("4-exit");
System.out.println();
System.out.println("enter the choice ");
int ch=input.nextInt();
System.out.println();
if(0<ch && ch<=4)
{
switch(ch)
{

case 1:
{
System.out.println();
System.out.println("please enter the  deposite amount");
 dep=input.nextInt();

for(Map.Entry m:B.entrySet())
{
if(m.getKey().equals(accno))
{
int bal=(Integer) m.getValue();
bal=bal+dep;
B.put(accno,bal);

}
}

System.out.println("your amount was deposited");
one=1;
}
break;
case 2:
{
System.out.println();
System.out.println("please enter the withdraw amount");
with=input.nextInt();

for(Map.Entry m:B.entrySet())
{
if(m.getKey().equals(accno))
{
int bal=(Integer) m.getValue();
if(bal>=with)
{
//System.out.println(bal);
bal=bal-with;
//System.out.println(bal);

B.put(accno,bal);

System.out.println("please collect your money");
one=2;
}
else
{
System.out.println("your account money has a low level");
}
}
}


}
break;
case 3:
{

if(one==1)
{
System.out.println("deposit value  :"+dep);
System.out.println("withdraw value :   "+"0");
}
else
{
System.out.println("deposit value  : "+"0");
System.out.println("withdraw value :"+with);
}

for(Map.Entry m:B.entrySet())
{
if(m.getKey().equals(accno))
System.out.println("balance is  "+m.getValue());
}
}
break;
case 4:
{
bl=false;
}
break;

} //switch

}  //if
else
{
System.out.println("only three options ");
}

}  //while (bl)
}  //login sucess
else
{
System.out.println("sorry,username or password not");
}
}
break;


case 3:
{
a=false;
}
break;


default:
{

if(a)
System.out.println("invalid choice use with 1,2,3 cases ");

}

} // switch






} // while





} //  main method

}  //  main class