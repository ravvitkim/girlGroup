package dto;

public class EnterDto {
    private int e_id;
    private String eName;

    @Override
    public String toString() {
        return "EnterDto{" +
                "e_id=" + e_id +
                ", eName='" + eName + '\'' +
                '}';
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}
