public main(String name) {
    this.name = name;
}

public static void main(String[] args) {
    main person = new main("Jummam Hossain");
    System.out.println("My name is " + person.name + ".");
}
//02
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner numbers =new Scanner(System.in);
        System.out.println("First Number:");
        int num01=numbers.nextInt();
        System.out.println("Second Number:");
        int num02=numbers.nextInt();
       int temp =num01;
       num01=num02;
       num02=temp;

        System.out.println("After Swoping");
        System.out.println("First Number:"+num02);
        System.out.println("Second Number:"+num01);
        
        
        
       
        
        numbers.close();

    }
}
//03
public class main {
    public static void main(String[] args) {
        char ch ='u';
        if(ch=='a'|| ch=='e' ||ch=='a'|| ch=='i'||ch=='o'|| ch=='u'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
        
        
    }
  //04
  public class main {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++)
            System.out.println("JUMMAM");
    }
}
  //05
  public class main {
    public static void main(String[] args) {
        int i= 1;
        do {
            System.out.println("Let Me Go!!");
            i++;
        } while( i<=5);
    }
}

  //06
  public class main {
    public static void main(String[] args) {
        boolean x;
        x= false;
        System.out.println("Value of x is :"+x);
        
    }
}

  07
  import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner marks =new Scanner(System.in);
        System.out.println("Math:");
        int math =marks.nextInt();
        System.out.println("English:");
        int english=marks.nextInt();
        System.out.println("Science:");
        int science =marks.nextInt();
        double avgmarks = (math+english+science)/3;
        System.out.println("Avg Mark  is:"+avgmarks);
        marks.close();

    }
}

//08
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Length:");
        int length =input.nextInt();
        System.out.println("Width:");
        int width =input.nextInt();
        int area = length *width;
        System.out.println("Area is:"+area33);
        input.close();

    }
}
//09
public class main {
    public static void main(String[] args) {
        int x=1;
        while(x<=5){
            System.out.println("I am done with this!!");
            x++;
        }
    }
}
//10
public class main {
    public static void main(String[] args) {
        double myVar;
        myVar = 550.6475;
        myVar = myVar +10;
        System.out.println("Value of myVar is :"+myVar);
        
    }
}
//11
public class main {
    public static void main(String[] args) {
        int x=1;
        switch (x) {
            case 2:
                System.out.println("Bangladesh");
                
                break;
            case 1:
                System.out.println("USA");
                break;
        
            default:
                System.out.println("Out of Earth.");
                break;
        }
        
    }
}

//12

public class main {
  public static void main(String[] args) {
    String st = "Hi, I am good ";
    String s2 = new String("Bangladesh");
    System.out.println(st+ "" +s2);
       
    }
}

//13
public class main {
  public static void main(String[] args) {
    String  s ="I@Love@Bangladesh";
    String []a = s.split("@");
    for( int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }
}
//14
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Length:");
        int length =input.nextInt();
        System.out.println("Width:");
        int width =input.nextInt();
        int area = length *width;
        System.out.println("Area is:"+area33);
        input.close();

    }
}
//15
public main(String name) {
    this.name = name;
}

public static void main(String[] args) {
    main person = new main("Jummam Hossain");
    System.out.println("My name is " + person.name + ".");
}
//16
public class main {
    public static void main(String[] args) {
        int x;
        x=7+5;
        x+=10;
        System.out.println("Value of x is:"+x);
    }
}
//17
public class main {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
//18
public class main {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
//19
public class main {
  public static void main(String[] args){
    sayHi();
    int Addition = getSum(10,50);
    System.out.println("Result:" +Addition);
  } 
    static int getSum(int x, int y){
        int sum =x+y;

        return sum;
    }
    static void sayHi(){
        System.out.println("HI");
    }
    
}

//20
public class main {
  public static void main(String[] args){
     myFunc();
    }
     static void myFunc(){
        System.out.println("Hi....");
     }
    
}

//21
public class main {
  public static void main(String[] args){
     evenOrodd(99);
    }
     static void evenOrodd(int x){
        if( x %2 ==0){
            System.out.println("Even");
        }else{
                System.out.println("Odd");
            }
        }
     }
    


//22

public class main {
  public static void main(String[] args){
     divisor(99);
    }
     static void divisor(int num){
        for(int i=1; i<=num;i++){
           if( num % i ==0)
        
            System.out.println(i);
                }               
            }   
            
        }

//23

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int x, y;

        System.out.println("Enter value of x and y:");

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        int r = add(x, y);
        System.out.println("Addition: " + r);

        r = sub(x, y);
        System.out.println("Subtraction: " + r);

        r = mul(x, y);
        System.out.println("Multiplication: " + r);

        r = div(x, y);
        System.out.println("Division: " + r);

        sc.close();
    }

    static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    static int mul(int x, int y) {
        int result = x * y;
        return result;
    }

    static int div(int x, int y) {
        int result = x / y;
        return result;
    }
}


    


//24

public class main {

    public static void main(String[] args) {

        int x[] = {1, 3, 44, -4, 5};

        System.out.println("Size of x: " + x.length);

        System.out.println("Value of index 0: " + x[0]);

        System.out.println("Value of index 3: " + x[3]);
    }
}
//25
public class main {
  public static void main(String[] args) {
    int x[][] =new int [2][3];
    x[1][1] =10;
    x[1][0] =10;

    int y = x[1][1] + x[1][0];
    System.out.println(y);
       
    }
}

}
