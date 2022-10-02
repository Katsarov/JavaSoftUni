package ExamplesListsExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String[] inputCommands = input.split(":");
            String command = inputCommands[0];
            String lessonTitle = inputCommands[1];

            switch (command){
                case "Add":
                    if(!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    //insert(schedule, inputCommands, lessonTitle);
                    int index = Integer.parseInt(inputCommands[2]);
                    if(!schedule.contains(lessonTitle)){
                        if(index >= 0 && index < schedule.size()){
                            schedule.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    schedule.remove(lessonTitle + "-Exercise");
                    break;
                case "Swap":
                    //swap(schedule, inputCommands, lessonTitle);
                    String swapWithLesson = inputCommands[2];
                    String firstLessonEx = lessonTitle + "-Exercise";
                    String secondLessonEx = swapWithLesson + "-Exercise";
                    if(schedule.contains(lessonTitle) && schedule.contains(swapWithLesson)){
                        int lessonTitleIndex = schedule.indexOf(lessonTitle);
                        int swapWithIndex = schedule.indexOf(swapWithLesson);
                        Collections.swap(schedule, lessonTitleIndex, swapWithIndex);
//                        schedule.add(swapWithIndex, lessonTitle);
//                        schedule.remove(swapWithLesson);
//                        schedule.remove(lessonTitle);
//                        schedule.add(lessonTitleIndex, swapWithLesson);
                    }
                    if(schedule.contains(firstLessonEx)){
                        schedule.remove(firstLessonEx);
                        schedule.add(schedule.indexOf(lessonTitle) + 1, firstLessonEx);
                    }
                    if(schedule.contains(secondLessonEx)){
                        schedule.remove(secondLessonEx);
                        schedule.add(schedule.indexOf(swapWithLesson) + 1, secondLessonEx);
                    }
                    break;
                case "Exercise":
                    //exercise(schedule, lessonTitle);
                    String exercise = lessonTitle + "-Exercise";
                    // In case there is such schedule, but there is not an exercise belongs to it.
                    if(schedule.contains(lessonTitle) && !schedule.contains(exercise)){
                        schedule.add(schedule.indexOf(lessonTitle) + 1, exercise);
                    } else if(!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 1; i <= schedule.size(); i++) {
            System.out.println(i + "." + schedule.get(i - 1));
        }
    }

    private static void exercise(List<String> schedule, String lessonTitle) {
        String exercise = lessonTitle + "-Exercise";
        // In case there is such schedule, but there is not an exercise belongs to it.
        if(schedule.contains(lessonTitle) && !schedule.contains(exercise)){
            schedule.add(schedule.indexOf(lessonTitle) + 1, exercise);
        } else if(!schedule.contains(lessonTitle)){
            schedule.add(lessonTitle);
            schedule.add(exercise);
        }
    }

    private static void swap(List<String> schedule, String[] inputCommands, String lessonTitle) {
        String swapWithLesson = inputCommands[2];
        String firstLessonEx = lessonTitle + "-Exercise";
        String secondLessonEx = swapWithLesson + "-Exercise";
        if(schedule.contains(lessonTitle) && schedule.contains(swapWithLesson)){
            int lessonTitleIndex = schedule.indexOf(lessonTitle);
            int swapWithIndex = schedule.indexOf(swapWithLesson);
            schedule.add(swapWithIndex, lessonTitle);
            schedule.remove(swapWithLesson);
            schedule.remove(lessonTitle);
            schedule.add(lessonTitleIndex, swapWithLesson);
        }
        if(schedule.contains(firstLessonEx)){
            schedule.remove(firstLessonEx);
            schedule.add(schedule.indexOf(lessonTitle) + 1, firstLessonEx);
        }
        if(schedule.contains(secondLessonEx)){
            schedule.remove(secondLessonEx);
            schedule.add(schedule.indexOf(swapWithLesson) + 1, secondLessonEx);
        }
    }

    private static void insert(List<String> schedule, String[] inputCommands, String lessonTitle) {
        int index = Integer.parseInt(inputCommands[2]);
        if(!schedule.contains(lessonTitle)){
            if(index >= 0 && index < schedule.size()){
                schedule.add(index, lessonTitle);
            }
        }
    }
}
