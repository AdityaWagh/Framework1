package aa.aa1.WebTests;

import java.util.Random;

class CustomerData
{  Random random;
  int r;
  private int id;
  private String fname;
  private String lname;
 
 public CustomerData()
 {
	  random = new Random();
	  r = random.nextInt(1000000);
	  id = r;
	  fname = "Flauren";
	  lname = "Greenwhich";
 }
 
 public void setid(int id)
 {
     this.id=id;
 }
 
 public void setfname(String fname)
 {
     this.fname=fname;
 }
 
 
 public void setlname(String lname)
 {
     this.lname=lname;
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
     return lname;
 }
}
