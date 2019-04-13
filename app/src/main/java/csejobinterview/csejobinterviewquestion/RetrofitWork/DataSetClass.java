package csejobinterview.csejobinterviewquestion.RetrofitWork;

public class DataSetClass {
    String name;
    String education;
    String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public DataSetClass() {
    }

    public DataSetClass(String name, String education, String hobby) {
        this.name = name;
        this.education = education;
        this.hobby = hobby;
    }
}
