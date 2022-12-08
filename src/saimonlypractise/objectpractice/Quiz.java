package saimonlypractise.objectpractice;

public class Quiz {
    String topic;
    int totalnumberOfQuestion;
    double points;

    public Quiz(String topic, int totalnumberOfQuestion, double points) {
        this.topic = topic;
        this.totalnumberOfQuestion = totalnumberOfQuestion;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", totalnumberOfQuestion=" + totalnumberOfQuestion +
                ", points=" + points +
                '}';
    }

    public void takeQuiz(){
        System.out.println("taking the "+topic+" quiz");
    }


}
