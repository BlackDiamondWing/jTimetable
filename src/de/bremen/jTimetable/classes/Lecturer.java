package de.bremen.jTimetable.classes;

/**
 * This class represents one lecturer which extends GeneralValue. The Lecturer can teach several subjects and is at a
 * location. If they change locations the time they need to get there needs to be considered.
 */
public class Lecturer extends GeneralValue {

    /**
     * Lecturers firstname.
     */
    private final String firstName;

    /**
     * Lecturers lastname.
     */
    private final String lastName;

    /**
     * Reference to the location where the lecturer is so that the time between changing locations can be determined.
     */
    private final Location location;

    /**
     * Constructor.
     *
     * @param id        this.id
     * @param caption   this.caption
     * @param active    this.active
     * @param firstName this.firstName
     * @param lastName  this.lastName
     * @param location  this.location
     */
    public Lecturer(int id, String caption, boolean active, String firstName, String lastName,
                    Location location) {
        super(id, caption, active);
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    /**
     * Getter for firstName.
     *
     * @return this.firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for lastName
     *
     * @return this.lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter for location reference.
     *
     * @return this.location
     */
    public Location getLocation() {
        return location;
    }
}
