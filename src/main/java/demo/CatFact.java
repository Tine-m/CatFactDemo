package demo;

import java.util.Date;

public class CatFact {
    private String text;
    private Date createdAt;
    private Date updatedAt;

    //public CatFact(){}

    @Override
    public String toString() {
        return "CatFact {" +
                "text='" + text + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}