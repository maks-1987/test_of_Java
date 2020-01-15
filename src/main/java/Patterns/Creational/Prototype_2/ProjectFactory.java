package Patterns.Creational.Prototype_2;

public class ProjectFactory {
    private Project project;

    ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
