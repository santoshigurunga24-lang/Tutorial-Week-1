package com.ingcollegeapt.week1tut;

import com.ingcollegeapt.week1tut.model.Topic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week1Tut {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Topic> topics = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            showMenu();
            String choice = scanner.next();

            switch (choice) {

                case "1":
                    System.out.println("Please:Enter the topic name:");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();

                    if (name.isEmpty()) {
                        System.out.println("Topic is not added. Name cannot be empty.");
                        break;
                    }

                    int TopicID = topics.size() + 1;
                    Topic newTopic = new Topic(TopicID, name);
                    topics.add(newTopic);

                    System.out.println("Topic added Successfully!");
                    for (Topic topic : topics) {
                        System.out.println("ID: " + topic.getTopicID() +
                                ", Name: " + topic.getName());
                    }
                    break;

                case "2":
                    if (topics.isEmpty()) {
                        System.out.println("NO topics available :(");
                    } else {
                        System.out.println("Topics:");
                        for (Topic topic : topics) {
                            System.out.println("ID: " + topic.getTopicID()
                                    + ", Name: " + topic.getName()
                                    + ", createdAt: " + topic.getCreatedAt()
                                    + ", updatedAt: " + topic.getUpdatedAt());
                        }
                    }
                    break;

                case "3":
                    if (topics.isEmpty()) {
                        System.out.println("No topics available. Please add a topic first.");
                        break;
                    }

                    System.out.println("Select a topic ID to add an entry:");
                    for (Topic topic : topics) {
                        System.out.println("ID: " + topic.getTopicID()
                                + ", Name: " + topic.getName());
                    }

                    int selectedID = scanner.nextInt();
                    scanner.nextLine();

                    Topic selectedTopic = null;
                    for (Topic topic : topics) {
                        if (topic.getTopicID() == selectedID) {
                            selectedTopic = topic;
                            break;
                        }
                    }

                    if (selectedTopic == null) {
                        System.out.println("Invalid topic ID.");
                        break;
                    } else {
                        System.out.println("Enter entry text:");
                    }

                    String entryText = scanner.nextLine().trim();

                    if (entryText.isEmpty()) {
                        System.out.println("Entry not added. Text cannot be empty.");
                        break;
                    }

                    System.out.println("Entry added to topic '"
                            + selectedTopic.getName() + "': "
                            + entryText);
                    break;

                case "4":
                    System.out.println("Entries feature not fully implemented yet.");
                    System.out.println("You can extend this by creating an Entry class"
                            + " and a List<Entry> per Topic.");
                    break;

                case "5":
                    System.out.println("Exiting program... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nLearning Logs Menu");
        System.out.println("1. Add Topic");
        System.out.println("2. View Topics");
        System.out.println("3. Add Entry");
        System.out.println("4. View Entries");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}