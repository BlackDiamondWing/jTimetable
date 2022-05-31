package de.bremen.jTimetable.Classes;

/**
 *
 */
public class Subject extends GeneralValue{
    /**
     * TODO active auch in GeneralValue?
     */
    boolean active;

    /**
     * Constructor.
     *
     * @param caption
     * @param id
     */
    public Subject(String caption, int id) {
        super(caption, id);
    }
}
