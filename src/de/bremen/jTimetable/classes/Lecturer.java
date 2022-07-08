package de.bremen.jTimetable.classes;

public class Lecturer extends GeneralValue {

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     * TODO wieso zur Location?
     */
    private int refLocationId;

    /**
     * Constructor.
     *
     * @param caption
     * @param id
     */
    public Lecturer(String caption, int id, boolean active, String firstName, String lastName,
                    int refLocationId) {
        super(caption, id, active);
        this.firstName = firstName;
        this.lastName = lastName;
        this.refLocationId = refLocationId;
    }
}
