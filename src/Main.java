//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        }
        else if (exercise == 3) {
            f3();
        }
        else if (exercise == 4) {
            f4();
        }
        else if (exercise == 5) {
            f5();
        }
        else if (exercise == 6) {
            f6();
        }
        else if (exercise == 7) {
            f7();
        }
        else if (exercise == 8) {
            f8();
        }
        else if (exercise == 9) {
            f9();
        }
        else if (exercise == 10) {
            f10();
        }
        else{
           System.out.println("invalid num");
        }
    }

    public static void f1() {
        System.out.println("enter name");
        String name= scanner.next();
        System.out.println("age");
        int age= scanner.nextInt();
        System.out.println("enter height");
        double height= scanner.nextDouble();
        System.out.println("enter Last name initial");
        char lastNameInitial= scanner.next().charAt(0);
        System.out.println("name:"+name+ "\n age:"+age+"height:"+"\n last name initail:"+lastNameInitial+"\n age int 10 years:"+(age+10));
    }

    public static void f2() {
        System.out.println("enter time in seconds");
        int time= scanner.nextInt();
        System.out.println("\n hours:"+(time/3600)+"\n minutes:"+((time%3600)/60)+"\n seconds:"+(time%60));
    }

    public static void f3() {
        System.out.println("Enter bill: ");
        double bill = scanner.nextInt();
        System.out.println("Tip percentage: ");
        double tip = scanner.nextInt();
        System.out.println("People: ");
        int people = scanner.nextInt();

        System.out.println("Tip: " + (bill*(tip/100)) + "\n" +
                "Total: " + (bill + (bill*(tip/100))) + "\n" +
                "Per person: " + (((bill + (bill*(tip/100)))/people)));

    }
    public static void f4() {
        System.out.println("product 1 price: ");
        double p1Price = scanner.nextDouble();
        System.out.println("product 1 units: ");
        int p1Units = scanner.nextInt();

        System.out.println("product 2 price: ");
        double p2Price = scanner.nextDouble();
        System.out.println("product 2 units: ");
        int p2Units = scanner.nextInt();

        System.out.println("product 3 price: ");
        double p3Price = scanner.nextDouble();
        System.out.println("product 3 units: ");
        int p3Units = scanner.nextInt();

        System.out.println("discount percentage: ");
        double discountPct = scanner.nextDouble();

        double subtotal = (p1Price * p1Units) + (p2Price * p2Units) + (p3Price * p3Units);
        double discountAmount = subtotal * (discountPct / 100.0);
        double finalPrice = subtotal - discountAmount;

        System.out.println("total before discount: " + subtotal);
        System.out.println("discount amount: " + discountAmount);
        System.out.println("final price: " + finalPrice);

        System.out.println("payment amount: ");
        double payment = scanner.nextDouble();
        System.out.println("change: " + (payment - finalPrice));
    }

    public static void f5() {
        System.out.println("distance in km: ");
        double distanceKm = scanner.nextDouble();
        System.out.println("time in minutes: ");
        double timeMin = scanner.nextDouble();

        double hours = timeMin / 60.0;
        double avgSpeed = distanceKm / hours;

        System.out.println("time in hours: " + hours);
        System.out.println("average speed: " + avgSpeed + " km/h");
        System.out.println("distance in one hour: " + avgSpeed + " km");
    }

    public static void f6() {
        System.out.println("assignments: ");
        double hwScore = scanner.nextDouble();
        System.out.println("quiz: ");
        double quizScore = scanner.nextDouble();
        System.out.println("final exam: ");
        double examScore = scanner.nextDouble();

        double finalGrade = (hwScore * 0.20) + (quizScore * 0.30) + (examScore * 0.50);
        System.out.println("final grade: " + finalGrade);

        if (finalGrade >= 60)
            System.out.println("result: pass");
        else
            System.out.println("result: fail");
    }

    public static void f7() {
        System.out.println("x: ");
        int num1 = scanner.nextInt();
        System.out.println("y: ");
        int num2 = scanner.nextInt();

        if (num1 == num2)
            System.out.println("numbers are equal");
        else if (num1 > num2)
            System.out.println("bigger num: " + num1);
        else
            System.out.println("bigger num: " + num2);

        if (num1 % 2 == 0)
            System.out.println("even number: true");
        else
            System.out.println("even number: false");

        if (num2 % 5 == 0)
            System.out.println("divisible by 5: true");
        else
            System.out.println("divisible by 5: false");

        int sum = num1 + num2;
        if (sum > 0)
            System.out.println("sum is positive");
        else if (sum < 0)
            System.out.println("sum is negative");
        else
            System.out.println("sum is zero");
    }

    public static void f8() {
        System.out.println("customer age: ");
        int age = scanner.nextInt();

        if (age < 6)
            System.out.println("ticket price: 0 nis");
        else if (age <= 17)
            System.out.println("ticket price: 30 nis");
        else if (age <= 64)
            System.out.println("ticket price: 45 nis");
        else
            System.out.println("ticket price: 25 nis");
    }

    public static void f9() {
        System.out.println("enter word");
        String word= scanner.next();
        System.out.println("length: " +word.length());
        System.out.println("Uppercase: " +word.toUpperCase());
        System.out.println("lowercase: " +word.toLowerCase());
        System.out.println("first character: " +word.charAt(0));
        System.out.println("first character: " +word.charAt(word.length()-1));




    }
    public static void f10() {
        int a = 7;
        int b = 2;

        System.out.println(a / b);
        System.out.println(a / 2.0);
        //3,3.5
        //צדקתי בראשון בגלל ששניהם int אז זה מדפיס במספר שלם את החילוק כלומר 3
        // ובשני בגלל שאחד המשתנים הוא double זה עושה casting ולכן מדיפס 3.5

        int num = 2147483647;

        System.out.println(num);
        System.out.println(num + 1);
        //2147483647, בשני זה לא יתן ויגיד שגיאה
        //בשיטת משלים ל2 זה הופך את כל האפסים ל1 ולכן זה נותן את המספר הכי מנימלי

        double c = 0.1;
        double d = 0.2;

        System.out.println(c + d);
        System.out.println(c + d == 0.3);
        //0.3, בשני true
        //בראשון זה יצא ככה כי double זה לא מספר מדיוק בחלק מהמספרים כי זה לא בחזקות של 2 אז זה קירוב למספר האמיתי
        // בשני זה false מאותה סיבה כי זה רק קירוב וזה לא שווה במדיוק

        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);
        //100000001.0
        //100000001.0
        //בראשון טעיתי וזה בגלל שאין מספיק מקום בזיכרון בשביל מספר כזה גדול
        // בשני יש מספיק מקום ולכן זה מוסיף אחד
    }
}