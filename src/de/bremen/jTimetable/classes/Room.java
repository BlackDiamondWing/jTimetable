package de.bremen.jTimetable.classes;

public class Room extends GeneralValue{


    /**
     * Reference to the Location.
     */
    private long refLocationId;

    /**
     * @param caption
     * @param id
     * @param active
     */
    public Room(String caption, int id, boolean active) {
        super(caption, id, active);
    }

}
