package de.bremen.jTimetable.classes;

/**
 * This class represents the database table that connects a Subject with a Lecturer and a CourseOfStudy.
 */
public class SubjectInCourseHasLecturer {

    /**
     * Reference to the Subject (just the id, because that's the only value that is in the corresponding database
     * table).
     */
    private final int subject;

    /**
     * Reference to the CourseOfStudy (just the id, because that's the only value that is in the corresponding database
     * table).
     */
    private final int course;

    /**
     * Reference to the Lecturer (just the id, because that's the only value that is in the corresponding database
     * table).
     */
    private final int lecturer;

    /**
     * Constructor.
     *
     * @param subject  this.subject (id)
     * @param course   this.course (id)
     * @param lecturer this.lecturer (id)
     */
    public SubjectInCourseHasLecturer(int subject, int course, int lecturer) {
        this.subject = subject;
        this.course = course;
        this.lecturer = lecturer;
    }

    /**
     * Getter for subject id.
     *
     * @return this.subject
     */
    public int getSubjectId() {
        return subject;
    }

    /**
     * Getter for courseOfStudy id.
     *
     * @return this.course
     */
    public int getCourseId() {
        return course;
    }

    /**
     * Getter for reference to lecturer (id)
     *
     * @return this.lecturer
     */
    public int getLecturer() {
        return lecturer;
    }
}
