package model;

public class Player {
    private String nickName;
    private double score;
    private String id;

    public Player(String nickName, double score, String id) {
        this.nickName = nickName;
        this.score = score;
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", score=" + score +
                ", id='" + id + '\'' +
                '}';
    }
}
