import java.util.Scanner;

//클래스 실습
//접근지정자 : private, public (수업外) 
//반환타입 실습
//this 사용
//static 실습

class Pizza {
   
   //default 필드는 타 클래스에서 접근 가능
   static String company_name;
   String title;
   char size;
   int price;
      

   /*
   //private 필드는 같은 클래스 내에서만 사용 가능
   private String company_name;
   private String title;
   private char size;
   private int price;
   */   
   
   
   
   public String getCompany_name() {
      return company_name;
   }

   public void setCompany_name(String a) {
      if(a == "도미노" || a == "피자헛") {
         company_name = a;
      }
      else {
         return;
      }
      
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public char getSize() {
      return size;
   }

   public void setSize(char size) {
      this.size = size;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   void show() {   //같은 프로젝트 內 타 클래스에서 객체 생성 후 호출 가능
      System.out.println("회사 이름 : "+company_name);
      System.out.println("피자 이름 : "+title);
      System.out.println("정가 : "+price);
      System.out.println("피자 크기 : "+size);
   }
   
   private void show2() {   //같은 클래스에서만 호출 가능
      System.out.println("private show 메소드");
      System.out.println("회사 이름 : "+company_name);
      System.out.println("피자 이름 : "+title);
      System.out.println("정가 : "+price);
      System.out.println("피자 크기 : "+size);
   }
   
   int coupon(int discount) {
      show();   //같은 클래스의 메소드 호출
      return (int)(this.price * (1-(discount*0.01)));
   }
   
   
}
public class Main {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner sc = new Scanner(System.in);
      
      Pizza myPizza1 = new Pizza();
      Pizza myPizza2 = new Pizza();
      
      /*
      myPizza1.setCompany_name("피자헛");
      myPizza1.setTitle("고구마피자");
      myPizza1.setSize('L');
      myPizza1.setPrice(20000);
      */
      
      myPizza1.company_name = "도미노";
      Pizza.company_name = "도미노";
      myPizza1.title = "고구마피자";
      myPizza1.size = 'L';
      myPizza1.price = 20000;
      myPizza1.show();
      
      //Pizza.company_name = "피자헛";
      myPizza2.title = "치즈피자";
      myPizza2.size = 'M';
      myPizza2.price = 15000;
      myPizza2.show();
      
      /*
      System.out.println(myPizza1.coupon(30));
      
      System.out.println("-----");
      System.out.println(myPizza1.getCompany_name());
      */
      
      //Static 사용
      //1. 원래는 객체생성 후 멤버를 사용 가능, static을 붙이면 객체생성이 필요없음
      //System.out.println(Math.random());
      
      //2. static 메소드에서는 static 멤버만 호출 가능
      //System.out.println(a);
      System.out.println(b);
      //func1();
      func2();      
      Main m = new Main();
      System.out.println(m.a);
      
   }
   
   int a;   //main메소드에서 호출 불가, 객체 생성을 해야 사용 가능
   static int b;   //객체 생성 하지 않아도 클래스이름.필드명 으로 호출 가능
   
   void func1() { //main메소드에서 호출 불가, 객체 생성을 해야 사용 가능
      System.out.println("static 없는 메소드 실행");
   }
   
   static void func2() { //객체 생성 하지 않아도 클래스이름.메소드명 으로 호출 가능
      System.out.println("static 있는 메소드 실행");
   }   

}



/*
접근지정자 연습

   public
     공개 정도가 가장 높고 어디에서든 자유롭게 접근할 수 있다.
   
   protected
     같은 패키지 내에서 접근이 가능하고 다른 패키지에서도 상속을 받은 클래스 내부에서는 사용 가능하다.
     public과 다른 점은 다른 패키지의 자식 클래스 외부에서는 접근할 수 없다는 것이다.
   
   default
     같은 패키지 내에서만 접근이 가능하다. 아무런 접근 지정자도 없을 경우 이 옵션이 자동으로 적용된다.
   
   private
     동일 클래스 내에서만 접근이 가능한 가장 낮은 단계의 자유도를 갖는다.

 */
