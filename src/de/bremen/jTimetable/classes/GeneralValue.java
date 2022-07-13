package de.bremen.jTimetable.classes;

/**
 * Abstract parent class to the values that can be stored in the database.
 */
public abstract class GeneralValue {

    /**
     * The values' id in the database table
     */
    private int id;

    /**
     * The values' caption in the database.
     */
    private final String caption;

    /**
     * Status whether the object is active.
     */
    private final boolean active;

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public GeneralValue(int id, String caption, boolean active) {
        this.id = id;
        this.caption = caption;
        this.active = active;
    }

    /**
     * Getter for the values' caption.
     *
     * @return this.caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Getter for the values' id.
     *
     * @return this.id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for isActive
     *
     * @return true if the value is active (this.isActive)
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Setter for id, because it's automatically set by the database.
     * @param id the id the object has in the database (primary key)
     */
    public void setId(int id) {
        this.id = id;
    }

//    /**
//     *
//     * @return
//     */
//    public String toSQLString() {
//        StringBuilder sb = new StringBuilder("(").append(getId()).append(", ").append(getCaption())
//                .append(", ").append(isActive());
//        this.toSQLString(sb);
//        sb.append(")");
//        return sb.toString();
//    }
//
//    /**
//     *
//     * @param sb
//     * @return
//     */
//    public abstract String toSQLString(StringBuilder sb);
}
