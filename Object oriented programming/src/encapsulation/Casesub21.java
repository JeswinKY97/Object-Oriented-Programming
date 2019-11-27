package encapsulation;

public class Casesub21 {
	String name;
	String address;
	String cno;
	String email;
	String prtype;
	String prid;
	int n=0,r=0,m=0,o=0,p=0,q=0;
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if (name.matches("^[a-z A-Z]*$"))
        {
			
            this.name=name;
            return true;
        }
        else
        {
           n++;
        	//System.out.println("Invalid Name");
            return false;
        }
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		if (address.matches("^[a-zA-Z0-9]*$"))
        {
			
            this.address=address;
            return true;
        }
        else
        {
           m++;
        	//System.out.println("Invalid Name");
            return false;
	
	}}
	public String getCno() {
		return cno;
	}
	public boolean setCno(String cno) {
		  if (cno.matches("^[0-9]*$"))
          {
              this.cno=cno;
              return true;
          }
          else
          {
        	  o++;
              //System.out.println("Invalid Contact Number");
              return false;
          }
	}
	public String getEmail() {
		  return this.email;
	}
	public boolean setEmail(String email) {
		  if (email.contains("@"))
          {
              this.email=email;
              return true;
          }
          else
          {
        	  p++;
              //System.out.println("Invalid Email");
              return false;
          }
	}
	public String getPrtype() {
		return prtype;
	}
	public boolean setPrtype(String prtype) {
		if (prtype.matches("[a-z A-Z]"))
        {
            this.prtype=prtype;
            return true;
        }
        else
        {
        	q++;
            //System.out.println("Invalid Name");
            return false;
        }
	}
	public String getPrid() {
		return prid;
	}
	public boolean setPrid(String prid) {

		if (prid.matches("^[a-zA-Z0-9-]*$"))
        {
			
            this.prid=prid;
            return true;
        }
        else
        {
           r++;
        	//System.out.println("Invalid Name");
            return false;
        }
	}
	public void check()
	{
	if(n==0 && m==0 && o==0 && p==0 && q==0 && r==0) {
		System.out.println("Registration Successfull");
		reg();
		}
	else {
		if(n==1)
		{
			System.out.println("Invalid Name");
		}
		if(m==1)
		{
			System.out.println("Invalid Address");
		}
		if(o==1)
		{
			System.out.println("Invalid Contact number");
		}
		if(p==1)
		{
			System.out.println("Invalid Email");
		}
		if(q==1)
		{
			System.out.println("Invalid proof type");
		}
		if(r==1)
		{
			System.out.println("Invalid proof id");
		}
		System.out.println("Registration Failed");	
	}}
	public void reg() {
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Number: "+cno);
		System.out.println("Email: "+email);
		System.out.println("Proof type: "+prtype);
		System.out.println("Proof Id: "+prid);
		
	}
		
	}
	

