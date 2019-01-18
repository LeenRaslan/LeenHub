package week9.exc5;

public class Film {
    public String title;
    public Double score;
    public Integer voteCount;
    public Integer runtime;
    public Integer budget;
    public Integer revenue;

    public Film(String title, Double score, Integer voteCount, Integer runtime, Integer budget, Integer revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Integer getBudget() {
        return budget;
    }

    public Integer getRevenue() {
        return revenue;
    }
}
