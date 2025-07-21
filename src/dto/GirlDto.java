package dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class GirlDto {
    private int g_id;
    private String name;
    private Timestamp debut;

    @Override
    public String toString() {
        return "GirlDto{" +
                "g_id=" + g_id +
                ", name='" + name + '\'' +
                ", debut=" + debut +
                '}';
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Timestamp getDebut() {
        return debut;
    }

    public void setDebut(Timestamp debut) {
        this.debut = debut;
    }
}
