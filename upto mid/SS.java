class College{
  {
   System.out.println("Inside college init block");
  }
  static{
   System.out.println("inside college static block");
  }
  College(){
   System.out.println("inside college constructor ");
  }
  
}



class SGGSS extends College{
 

{
 System.out.println("inside SGGS init block");
}

static{
 System.out.println("inside SGGS static block");
}

SGGSS(){
 System.out.println("inside SGGS constructor ");
}
public static void main(String args[]){
 
 System.out.println("hi");
 SGGSS s=new SGGSS();
 System.out.println("hii");
 System.out.println("hii");

}

/*
public static void main(String args[]){
 
System.out.println("utkarsh");
SGGSS s=new SGGSS();

}
*/

}




class SS extends SGGSS{
  College c=new College();
{
 System.out.println("inside SS init block");
}


SS(){
 System.out.println("Inside SS constructor");
}

static{
 System.out.println("inside SS static block");
}


public static void main(String args[]){
 /*
 System.out.println("utkarsh");
 System.out.println("hi1");
 SGGSS s=new SGGSS();
 System.out.println("hii12");
 System.out.println("hii123");
*/
}


 //static SS k=new SS();

}

