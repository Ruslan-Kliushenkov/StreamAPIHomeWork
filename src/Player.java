public class Player {
    String name;
    int id;
    int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setScore(int score) {
        this.count = score;
    }

    public Player(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.count = score;
    }
}
