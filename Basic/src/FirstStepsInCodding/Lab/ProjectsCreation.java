package FirstStepsInCodding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numOfProjects = Integer.parseInt(scanner.nextLine());

        int oneProject = 3;

        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        int hours = numOfProjects * oneProject;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, numOfProjects);
    }
}
