package Patterns.Creational.Prototype_2;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject",
                "SourceCode sc = new SourceCoed();");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        // клонируем проект master, который получила наша Фабрика
        Project masterClone = factory.cloneProject();

        System.out.println("\n=====================\n");
        System.out.println(masterClone);
    }
}/*
>>> Project{id=1, projectName='SuperProject', sourceCode='SourceCode sc = new SourceCoed();'}

    =====================
    Project{id=1, projectName='SuperProject', sourceCode='SourceCode sc = new SourceCoed();'}
*/
