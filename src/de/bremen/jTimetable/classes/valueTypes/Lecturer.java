package de.bremen.jTimetable.classes.valueTypes;

/**
 * This class represents one lecturer and extends GeneralValueWithLocation. The Lecturer can teach several subjects and is at a
 * location. If they change locations the time they need to get there needs to be considered.
 */
public class Lecturer extends GeneralValueWithLocation {

    //TODO brauchen wir Vor- und Nachname?
    /**
     * Lecturers firstname.
     */
    private String firstName;

    /**
     * Lecturers lastname.
     */
    private String lastName;

    /**
     * Reference to Lecturers office.
     */
    private int officeId;


    /**
     * Constructor.
     *
     * @param id        this.id
     * @param caption   this.caption
     * @param active    this.active
     * @param firstName this.firstName
     * @param lastName  this.lastName
     * @param location  this.location
     * @param officeId  this.officeId
     */
    public Lecturer(int id, String caption, boolean active, String firstName, String lastName,
                    int location, int officeId) {
        super(id, caption, active, location);
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeId = officeId;
    }

    /*
    Generated getter and setter methods.
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }
}
