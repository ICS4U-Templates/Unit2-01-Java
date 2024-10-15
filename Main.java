/**
 * This is the standard Main() class starting point.
 *
 * @author  Mr Coxall
 * @version 1.0
 * @since   2020-01-01
 */
final class Main {
    /**
    * Bike 1 start speed.
    */
    static final int BIKE_1_START_SPEED = 10;

    /**
    * Bike 2 start speed.
    */
    static final int BIKE_2_START_SPEED = 5;

    /**
    * Break speed.
    */
    static final int BRAKE_SPEED = 2;

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // use Bicycle class
        final Bicycle someBicycle1 = new Bicycle();
        final Bicycle someBicycle2 = new Bicycle();

        System.out.println("\nSet speed to 10 on bike 1.");
        someBicycle1.speed = BIKE_1_START_SPEED;
        System.out.println("The current speed on bike 1 is: "
                           + someBicycle1.speed);

        System.out.println("\nSet speed to 5 on bike 2.");
        someBicycle2.speed = BIKE_2_START_SPEED;
        System.out.println("The current speed on bike 2 is: "
                           + someBicycle2.speed);

        System.out.println("\nApply the brake with value 2.");
        someBicycle1.applyBrake(BRAKE_SPEED);
        someBicycle2.applyBrake(BRAKE_SPEED);

        System.out.println("The new speed on bike 1 is: "
                           + someBicycle1.speed);
        System.out.println("The new speed on bike 2 is: "
                           + someBicycle2.speed);

        System.out.println("\nDone.");
    }
}
