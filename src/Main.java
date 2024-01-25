public class Main {
    public static void main(String[] args) {
        // 1
        int x = sum(1, 2, 3);
        int y = sum(1, 4, 9);
        System.out.println(x);
        System.out.println(y);
        System.out.println();

        // 2
        System.out.println(daytime(7));
        System.out.println(daytime(13));
        System.out.println(daytime(18));
        System.out.println(daytime(2));
        System.out.println();

        // 3
        daytime2(7);
        daytime2(13);
        daytime2(32);
        daytime2(56);
        daytime2(2);
    }

    // 1
    static int sum(int a, int b, int c){
        return a + b + c;
    }

    // 2
    static String daytime(int hour){
        if (hour >24 || hour < 0)
            return "Invalid data";
        else if(hour > 21 || hour < 6)
            return "Good night";
        else if(hour >= 15)
            return "Good evening";
        else if(hour >= 11)
            return "Good after noon";
        else
            return "Good morning";
    }

    // 3
    static void daytime2(int hour) {
        if (hour > 24 || hour < 0)
            return;
        if(hour > 21 || hour < 6)
            System.out.println("Good night");
        else if(hour >= 15)
            System.out.println("Good evening");
        else if(hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}