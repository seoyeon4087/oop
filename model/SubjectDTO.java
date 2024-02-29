package model;


public class SubjectDTO {
    private int id;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public SubjectDTO(int koreanScore, int englishScore, int mathScore) {
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "koreanScore=" + koreanScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }
}