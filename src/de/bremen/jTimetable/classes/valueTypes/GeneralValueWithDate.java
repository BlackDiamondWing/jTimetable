package de.bremen.jTimetable.classes.valueTypes;

import java.time.LocalDate;

/**
 * Adds a start and end date to the abstract parent class GeneralValue and is abstract itself.
 */
public abstract class GeneralValueWithDate extends GeneralValue {

    /**
     * StartDate
     */
    private LocalDate startDay;

    /**
     * EndDate
     */
    private LocalDate endDay;

    /**
     * Constructor.
     *
     * @param id       this.id
     * @param caption  this.caption
     * @param active   this.active
     * @param startDay this.startDay
     * @param endDay   this.endDay
     */
    public GeneralValueWithDate(int id, String caption, boolean active, LocalDate startDay, LocalDate endDay) {
        super(id, caption, active);
        this.startDay = startDay;
        this.endDay = endDay;
    }

    /*
    Generated getter and setter methods.
     */

    public LocalDate getStartDay() {
        return startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }
}
