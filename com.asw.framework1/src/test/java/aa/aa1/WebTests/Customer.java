package aa.aa1.WebTests;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
class Customer
{
private String fname;
private String lname;
private int id;
private List<Addresses> addresses;

public Customer(int id, String fname,String lname,List<Addresses> addresses)
{
this.id=id;
this.fname=fname;
this.lname=lname;
this.addresses=addresses;

}

public Customer(CustomerData customerdata)
{
this.id=customerdata.getid();
this.fname=customerdata.getfname();
this.lname=customerdata.getlname();

}

public int getid()
{
return id;
}

public String getfname()
{
return fname;
}

public String getlname()
{
return lname;}
public List<Addresses> getAddresses()
{

return addresses;

}
}

