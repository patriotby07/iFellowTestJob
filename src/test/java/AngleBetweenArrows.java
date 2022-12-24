public class AngleBetweenArrows {

    static double determiningAngleBetweenHandsClock(int hours, int minutes) {
        if (hours > 23 || hours < 0 || minutes > 59 || minutes < 0) {
            throw new IllegalArgumentException("Wrong data entered");
        }
        double angle;

        if (hours == 12 && minutes > 0 || hours == 0) {
            angle = Math.abs((hours + minutes / 60.0) * 30 - minutes * 6);
        } else {
            angle = (hours + minutes / 60.0) * 30 - minutes * 6 - 360;
        }

        if (angle > 180) {
            return  360 - angle;
        }

        return angle;
    }


    public static void main(String[] args) {
        System.out.println("The angle between the arrows is " + determiningAngleBetweenHandsClock(12, 00));
        System.out.println("The angle between the arrows is " + determiningAngleBetweenHandsClock(15, 15));
        System.out.println("The angle between the arrows is " + determiningAngleBetweenHandsClock(12, 5));
        System.out.println("The angle between the arrows is " + determiningAngleBetweenHandsClock(12, 55));
        System.out.println("The angle between the arrows is " + determiningAngleBetweenHandsClock(00, 00));

    }
}
