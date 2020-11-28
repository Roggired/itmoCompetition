package ru.itmoCompetition;

import java.util.Map;

/**
 * Describes results of the reception per department. Be sure that you
 * check results.
 *
 * Guaranteed only that for each existed department there is a result.
 */
public final class ReceptionCompany {
    private final Map<String, Integer> newStudentsForDepartment;


    public ReceptionCompany(Map<String, Integer> newStudentsForDepartment) {
        this.newStudentsForDepartment = newStudentsForDepartment;
    }


    /**
     * Returns amount of new students for this department.
     */
    public int getNewStudents(String department) {
        return newStudentsForDepartment.get(department);
    }
}
