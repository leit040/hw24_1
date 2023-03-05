import java.util.Random;

public class MyMath {

    public static int randomInt(int min, int max){
        return new Random().nextInt(min, max);
    }

    public static double randomDouble(){
        return Math.random();
    }

    public static double sin(double a){
        return Math.toDegrees(Math.sin(Math.toRadians(a)));
    }

    public static double cos(double a){
        return Math.toDegrees(Math.sin(Math.toRadians(a)));
    }

    public static double tan(double a){
        return Math.toDegrees(Math.sin(Math.toRadians(a)));
    }

    public static double sqrt(double x){
        return Math.sqrt(x);
    }

    public static double cbrt(double x){
        return Math.cbrt(x);
    }

}
