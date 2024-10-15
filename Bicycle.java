/**
 * The Bicycle Class.
 * @author  Mr Coxall
 * @version 1.0
 * @since   2020-01-01
 */

public class Bicycle {
    /**
     * The number of revolutions of the peddles per minute.
     */
    int cadence;

    /**
     * What gear the bike is in.
     */
    int gear;

    /**
     * The current speed of the bike.
     */
    int speed;

    /**
     * The applyBrake() function.
     *
     * @param decrement -  how much to slow down
     */
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
}
