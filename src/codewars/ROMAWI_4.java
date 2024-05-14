package codewars;

public class ROMAWI_4 {

    public static char getGrade(int s1, int s2, int s3) {
        int rata = (s1 + s2 + s3) / 3;
        if (rata >= 90 && rata <= 100) {
            return 'A';
        } else if (rata >= 80 && rata < 90) {
            return 'B';
        } else if (rata >= 70 && rata < 80) {
            return 'C';
        } else if (rata >= 60 && rata < 70) {
            return 'D';
        } else {
            return 'F';
        }

    }

    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 92;
        int score3 = 78;

        char grade = getGrade(score1, score2, score3);
        System.out.println("Nilai rata-rata : " + grade);

    }

}
