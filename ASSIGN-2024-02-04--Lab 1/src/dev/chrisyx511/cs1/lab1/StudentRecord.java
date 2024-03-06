package dev.chrisyx511.cs1.lab1;

import java.util.Arrays;

public class StudentRecord {
    private final double[] quizScores = new double[3];
    private double midtermScore;
    private double finalExamScore;
    private Character letterGrade;
    private double overallScore;
    private int quizNumber = 0;

    public Character getLetterGrade() {
        return letterGrade;
    }

    public double getFinalExamScore() {
        return finalExamScore;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public double[] getQuizScores() {
        return quizScores;
    }
    public double getIndividualQuizScore(int index) {
        return quizScores[index];
    }

    public void addQuizScore(double score) {
        if (quizNumber > 2) {
            System.out.println("Already added 3 quizzes");
            return;
        }
        this.quizScores[quizNumber] = score;
        quizNumber++;

    }

    public void setQuizScore(int index, double newScore) {
        if (index > 2) {
            System.out.println("No more than 3 quizzes");
            return;
        }
        this.quizScores[index] = newScore;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public void setFinalExamScore(double finalExamScore) {
        this.finalExamScore = finalExamScore;
    }

    public void calculateOverallAndLetterGrade() {
        double sumOfQuizScoresOn30 = 0;
        for (double quizScore: quizScores) {
            sumOfQuizScoresOn30 += quizScore;
        }
        overallScore = (sumOfQuizScoresOn30 * 25 / 30) + (midtermScore * 35 / 100) + (finalExamScore * 40 / 100);
        if (overallScore >= 90) {
            letterGrade = 'A';
        } else if (overallScore >= 80) {
            letterGrade = 'B';
        } else if (overallScore >= 70) {
            letterGrade = 'C';
        } else if (overallScore >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRecord that = (StudentRecord) o;
        return Double.compare(midtermScore, that.midtermScore) == 0 && Double.compare(finalExamScore, that.finalExamScore) == 0 && Double.compare(overallScore, that.overallScore) == 0 && quizNumber == that.quizNumber && Arrays.equals(quizScores, that.quizScores) && letterGrade.equals(that.letterGrade);
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "quizScores=" + Arrays.toString(quizScores) +
                ", midtermScore=" + midtermScore +
                ", finalExamScore=" + finalExamScore +
                ", letterGrade=" + letterGrade +
                ", overallScore=" + overallScore +
                ", quizNumber=" + quizNumber +
                '}';
    }
}
