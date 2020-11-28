package ru.itmoCompetition;

public interface ITMOUniversity {
    /**
     * Creates a new department with given name, studentsLimit and dean described by deanName and deanCharacter.
     * All parameters should be checked by implementation. If there are any mistakes, throw {@link IllegalArgumentException}
     *
     * @param name department's name. Must be nonnull and not less that 3 character length.
     * @param deanName dean's name. Must be nonnull and not less that 3 character length.
     * @param deanCharacter dean's character.
     * @param studentsLimit limit of students for all courses in total. Must be not less than 100.
     *
     * @throws IllegalArgumentException if parameters are invalid.
     */
    void createDepartment(String name, String deanName, DeanCharacter deanCharacter, int studentsLimit);

    /**
     * Sets a new dean for department with given name.
     * All parameters should be checked by implementation. If there are any mistakes, throw {@link IllegalArgumentException}
     *
     * @param department department's name. Must be nonnull and not less that 3 character length.
     * @param deanName dean's name. Must be nonnull and not less that 3 character length.
     * @param deanCharacter dean's character.
     *
     * @throws IllegalArgumentException if parameters are invalid.
     */
    void setNewDean(String department, String deanName, DeanCharacter deanCharacter);

    /**
     * Deletes department with given name.
     * All parameters should be checked by implementation. If there are any mistakes, throw {@link IllegalArgumentException}
     *
     * @param name department's name. Must be nonnull and not less that 3 character length.
     *
     * @throws IllegalArgumentException if parameters are invalid.
     */
    void deleteDepartment(String name);


    /**
     * Adds first years for departments. ReceptionCompany describes results of reception.
     * ReceptionCompany should be checked. If there are any mistakes, throw {@link IllegalArgumentException}
     *
     * @param receptionCompany results of reception per department.
     *
     * @throws IllegalArgumentException if parameters are invalid.
     */
    void enrollNewStudents(ReceptionCompany receptionCompany);

    /**
     * Fills the competitionResults with results of semester expulsion.
     *
     * @param competitionResults an instance of CompetitionResults.
     */
    void semesterResults(CompetitionResults competitionResults);

    /**
     * Returns current amount of students in this department.
     * All parameters should be checked by implementation. If there are any mistakes, throw {@link IllegalArgumentException}
     *
     * @param department department's name. Must be nonnull and not less that 3 character length.
     * @return amount students on all courses in total. Must be zero or greater.
     *
     * @throws IllegalArgumentException if parameters are invalid.
     */
    int getStudentsNumberForDepartment(String department);
}
