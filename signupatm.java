package atmpack;
import java.util.*;
public class signupatm{
private String name;
private String address;
private long phno;
private int balance;

private boolean b;

public signupatm(String name,String address,long phno,int balance)
{
this.name=name;
this.address=address;
this.phno=phno;
this.balance=balance;
}


public String getname()
{
return name;
}

public String getaddress()
{
return address;
}

public long getphno()
{
return phno;
}

public int getbalance()
{
return balance;
}

public void setbalance(int balance)
{
this.balance=balance;
}


public void display()
{
System.out.println();
System.out.println("name is   "+ name);
System.out.println("address is   "+address);
System.out.println("phno is   "+phno);
System.out.println("balance is   "+balance);
//System.out.println("accno is   "+accno);
System.out.println();

}



}
