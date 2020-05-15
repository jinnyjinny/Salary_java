import java.text.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Employee emp = new Employee();
        DBManager dbManager = new DBManager();
        System.out.println(dbManager);

        /*Salesman sal = new Salesman(2,2019, "Son", "",400, 150000);
        System.out.println(sal);

        Executive exe = new Executive(3,2019,"Kim", "",500, 55);
        System.out.println(exe);

         */

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd월 hh시 mm분 ss초");
        String strNow = sdf.format(now);
        System.out.println("조회 시간: " + strNow);


    }
}


