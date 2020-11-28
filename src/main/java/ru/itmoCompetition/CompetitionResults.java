package ru.itmoCompetition;

import java.util.HashMap;
import java.util.Map;

/**
 * Stores results of semester competition.
 */
public final class CompetitionResults {
    private final Map<String, Integer> results;


    public CompetitionResults() {
        results = new HashMap<>();
    }


    /**
     * Adds statistics information about expulsion. If the result for this department and this course
     * was added before, would replace previous result with current.
     *
     * @param department department's name. Must be nonnull, not less then 3 character length.
     * @param course course number. Must be between 1 and 4.
     * @param numberOfExpelledStudents score. Must be zero or greater.
     *
     * @throws IllegalArgumentException if parameters are invalid.
     */
    public void add(String department, int course, int numberOfExpelledStudents) {
        if (department == null || department.length() < 3) {
            throw new IllegalArgumentException("Wrong department. Must be nonnull and not less than 3 character length.");
        }

        if (course < 1 || course > 4) {
            throw new IllegalArgumentException("Wrong course. Must be between 1 and 4.");
        }

        if (numberOfExpelledStudents < 0) {
            throw new IllegalArgumentException("Wrong number of expelled students. Must be zero or greater.");
        }

        results.remove(department + course);
        results.put(department + course, numberOfExpelledStudents);
    }

    public Map<String, Integer> getResults() {
        return results;
    }
}
