package de.bremen.jTimetable.classes;

public class Room extends GeneralValue{


    /**
     * Reference to the Location.
     */
    private int refLocationId;

    /**
     * @param caption
     * @param id
     * @param active
     */
    public Room(String caption, int id, boolean active, int refLocationId) {
        super(caption, id, active);
        this.refLocationId = refLocationId;
    }

}
