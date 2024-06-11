package org.geunskoo;

public class Name {

    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validateArgument(name);
        this.name = name;
    }

    private void validateArgument(String name) {
        if (name.isBlank() || name.length() > MAX_CAR_NAME_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 공백 또는 5자리 초과 설정이 불가능합니다.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
