//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
//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
//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
//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

class calci{

public static void main(string args []){
int x=10;
int y=20;

int mult=multiply(int x,int y);  //adding multiply function

int add=addition(int x,int y);   //adding addition function

int sub=subtraction(int x,int y);   //adding subtraction function

int div=divison(int x,int y); //adding divison function

int mod=modulus(int x,int y);   //adding modulus function

int sq=square(int x);    //adding square function

int cu=cube(int x);      //adding cube function

int pr=percent(int x);   //adding percentage function


}


static int multiply(int a,int b){
return a*b;
}


static int addition(int a,int b){
return a+b;
}


static int subtraction(int a,int b){
return a-b;
}

static int divison(int a,int b){
return a/b;
}

static int modulus(int a,int b){
return a%b;
}

static int square(int a){
return a*a;
}

static int cube(int a){
  return a*a*a;
}

static int percent(int a){
return a/100;
}

}
