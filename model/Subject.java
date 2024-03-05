package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Subject {
    private int id;
    private int korean;
    private int english;
    private int math;

    @Builder(builderMethodName = "builder")
    public Subject(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

}