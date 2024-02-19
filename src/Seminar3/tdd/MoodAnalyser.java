package Seminar3.tdd;

//Примените подход TDD для создания нового класса MoodAnalyser, который оценивает настроение
//выраженное во фразах.
public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("refactor")) {
            return "Refactor";
        } else if (message.contains("falling")) {
            return "Write a falling test";
        } else {
            return "Make the test pass";
        }
    }
}