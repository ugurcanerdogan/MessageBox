/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entities.Message;
import entities.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author uqi
 */
public class FileReadHelper {

    public static String readInput(String inputPath) throws IOException {
        Path fileName = Path.of(inputPath);
        return Files.readString(fileName);
    }

    public static ArrayList<User> createUserList(String inputPath) {
        ArrayList<User> userList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(inputPath);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String[] userDetails = sc.nextLine().split("\\s+");
                User userToAdd = new User(userDetails[0], userDetails[1]);
                userList.add(userToAdd);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public static String[] createUsernamesArray(ArrayList<User> userList) {
        String[] userArray = new String[userList.size()];
        int i = 0;
        for (User user : userList) {
            userArray[i] = user.getUsername();
            i++;
        }
        return userArray;
    }

    public static ArrayList<Message> createMessageList(String inputPath, ArrayList<User> userList) {
        ArrayList<Message> messageList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(inputPath);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String[] messageDetails = sc.nextLine().split("\\x09");
                User userOfMessage = null;
                for (User user : userList) {
                    if (user.getUsername().equals(messageDetails[3])) {
                        userOfMessage = user;
                    }
                }
                if (userOfMessage == null) {
                    System.out.println("USER NOT FOUND ERROR!");
                    break;
                }
                Message messageToAdd = new Message(messageDetails[0], messageDetails[1], messageDetails[2], userOfMessage);
                messageList.add(messageToAdd);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return messageList;
    }

    public static boolean messageIdUniquenessCheck(String messageId, ArrayList<Message> messageList) {
        for (Message message : messageList) {
            if (message.getMessage_id().equals(messageId)) {
                return false;
            }
        }
        return true;
    }

    public static boolean usernameUniquenessCheck(String username, String[] usernamesArray) {
        for (String savedUsername : usernamesArray) {
            if (savedUsername.equals(username)) {
                return false;
            }
        }
        return true;
    }
}
