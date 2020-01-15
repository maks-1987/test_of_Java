package Patterns.Creational.Prototype_2;

public class Project implements Copyable {
    private int id;
    private String projectName;
    private String sourceCode;

    Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // copy() - внутри создает экземпляр проекта, который в конструктор
    // принимает поля имеющегося проекта, т.е. его самого
    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, sourceCode);
        // возвращает уже копию данного проекта
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
