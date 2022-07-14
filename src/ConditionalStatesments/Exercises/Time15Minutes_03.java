package ConditionalStatesments.Exercises;

import java.util.Scanner;

                public class Time15Minutes_03 {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);

                        int intHour = Integer.parseInt(scanner.nextLine());
                        int intMinutes = Integer.parseInt(scanner.nextLine());

                        int hour = 0;
                        int minutes = 0;

                        if (intHour < 23){
                            hour = intHour;
                            int min = intMinutes + 15;
                            if (min <= 59){
                                minutes = min;
                            } else {
                                hour = intHour + 1;
                                int newMinutes = min % 60;
                                minutes = newMinutes;
                            }
                        } else if (intHour == 23){
                            //hour = 0;
                            int min = intMinutes + 15;
                            if (min <= 59){
                                hour = intHour;
                                minutes = min;
                            } else {
                                int newMinutes = min % 60;
                                hour = 0;
                                minutes = newMinutes;
                            }
                        }

                        if(minutes < 10){
                            System.out.printf("%d:%02d", hour, minutes);
                        } else {
                            System.out.printf("%d:%d", hour, minutes);
                        }
                    }
                }
