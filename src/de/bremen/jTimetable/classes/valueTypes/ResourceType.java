package de.bremen.jTimetable.classes.valueTypes;

/**
 * TODO was kann alles Ressource sein? --> Dozent, Raum, Kurs
 */
public class ResourceType extends GeneralValue {

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public ResourceType(int id, String caption, boolean active) {
        super(id, caption, active);
    }
}
