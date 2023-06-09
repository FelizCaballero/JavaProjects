package com.company;

/**
 The CourseGrades class stores data about a course's
 graded activities for the Course Grades programming
 challenge.
 */

public class CourseGrades implements Analyzable {
    // Constant for the number of grades
    public final int NUM_GRADES = 4;

    // Variable to reference a GradedActivity
    // array
    private GradedActivity[] grades;

    /**
     * Constructor
     */

    public CourseGrades() {
        // Create the grades array.
        grades = new GradedActivity[NUM_GRADES];
    }

    /**
     * The setLab method stores a GradedActivity object
     * for the lab grade.
     *
     * @param aLab Represents the lab grade.
     */

    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }

    /**
     * The setPassFailExam method stores a PassFailExam object
     * for the pass/fail exam grade.
     *
     * @param aPassFailExam Represents the pass/fail exam grade.
     */

    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    /**
     * The setEssay method stores an Essay object
     * for the essay grade.
     *
     * @param anEssay Represents the essay grade.
     */

    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    /**
     * The setFinalExam method stores a FinalExam object
     * for the final exam grade.
     *
     * @param aFinalExam Represents the final exam grade.
     */

    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    /**
     * The toString method returns a string representation
     * of the object.
     *
     * @return A string representation of the object.
     */

    public String toString() {
        String str = "Lab Score: " + grades[0].getScore() +
                "\tGrade: " + grades[0].getGrade() +
                "\nPass/Fail Exam Score: " + grades[1].getScore() +
                "\tGrade: " + grades[1].getGrade() +
                "\nEssay Score: " + grades[2].getScore() +
                "\tGrade: " + grades[2].getGrade() +
                "\nFinal Exam Score: " + grades[3].getScore() +
                "\tGrade: " + grades[3].getGrade() +
                "\nAverage Score: " + getAverage() +
                "\nHighest Score: " + getHighest().getScore() +
                "\nLowest Score: " + getLowest().getScore();

        return str;
    }

    public double getAverage() {
        double total = 0;
        for (int i = 0; i < 4; i++){
            total += grades[i].getScore();
        }
        grades[3] = new GradedActivity(total/4);
        return grades[3].getScore();
    }

    public GradedActivity getHighest() {
        int highest = 0;
        for (int i = 0; i < (grades.length - 1); i++){
            if (grades[i].getScore() > grades[highest].getScore())
                highest = i;
        }
        return grades[highest];
    }

    public GradedActivity getLowest() {
        int lowest = 0;
        for (int i = 0; i < (grades.length - 1); i++){
            if (grades[i].getScore() < grades[lowest].getScore())
                lowest = i;
        }
        return grades[lowest];
    }
}
