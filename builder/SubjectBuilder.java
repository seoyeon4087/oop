package builder;

import model.SubjectDTO;

public class SubjectBuilder {
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public SubjectBuilder koreanScore(int koreanScore){
        this.koreanScore = koreanScore;
        return this;
    }

    public SubjectBuilder englishScore(int englishScore){
        this.englishScore = englishScore;
        return this;
    }

    public SubjectBuilder mathScore(int mathScore){
        this.mathScore = mathScore;
        return this;
    }

    public SubjectDTO build(){
        return new SubjectDTO(koreanScore, englishScore, mathScore);
    }
}
