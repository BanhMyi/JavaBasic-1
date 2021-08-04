package com.javabasic.string1;
import java.util.Scanner;
import java.lang.String;
class StringLession1{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s = sc.next();  // Chuyen thanh String s = "ToiYeuDaNang" vi neu la chuoi khac => các index của subString ko đúng nữa
            System.out.println("- Vị trí của kí tự a là : "+ s.indexOf("a") + " và "+ s.lastIndexOf("a"));
            /* Tách chuỗi ( Substring)*/
            System.out.println("- Chuỗi sẽ trở thành :" + s.substring(0,3)+","+ s.substring(3,6)+","+s.substring(6,8)+","+s.substring(8));
            /* Kết hợp chuỗi ( concat)*/
            System.out.println("- Và khi nối chuỗi trên sẽ trở thành : "+ s.concat("."));    // String s1 = "Toi",  s.concat("Yeu").concat("Da).concat("Nang")
            /* Lấy chuỗi trong chuỗi ( Substring)*/
            System.out.println("- Khi lấy chuỗi -DaNang- ta được : "+ s.substring(6,8));   // neu s.subString(6,8) thi thu duoc: "Da", Để thu được "DaNang"
                                                                                        //=> s.subString(6): co nghia tu vi tri thu 6 den vị trí cuối cùng
                
            /* Thay thế chuỗi (replace)*/
            System.out.println("- Thay thế Da Nang -->HaNoi ta được : "+ s.replace("DaNang","HaNoi"));
            /* Kiểm tra chuỗi có rỗng or không */
            System.out.println("- Khi kiểm tra chuỗi có rỗng hay không ta được giá trị : "+s.isEmpty());

        }
    }

/*package com.javabasic.string1;
import java.lang.String;
import java.util.Scanner;

public class StringLesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char c = sc.next().charAt(0);
        for ( int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                System.out.print(i+" ");
    }

        }
    }
}*/
