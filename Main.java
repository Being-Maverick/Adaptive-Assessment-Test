package com.charchit;
/*
The logic of the quiz is defined in this class
A concept similar to a multilevel queue is used
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // List created to hold questions of easy,medium and hard levels
        List<Base> multilevelQueue = new ArrayList<>();

        EasyQuestions easyQuestions = new EasyQuestions();
        //Easy Questions added to the queue
        multilevelQueue.add(easyQuestions);

        //Medium Questions added to the queue
        MediumQuestions mediumQuestions = new MediumQuestions();
        multilevelQueue.add(mediumQuestions);

        //Hard Questions added to the queue
        HardQuestions hardQuestions = new HardQuestions();
        multilevelQueue.add(hardQuestions);

        // Denotes the question number
        int count = 1;
        // Denotes the question level 0-easy,1-medium,2-hard
        int level = 1;
        // Denotes the question score within the levels
        // Level 0 --> score 1-3
        // Level 1 --> score 4-6
        // Level 2 --> score 7-9
        int score = 5;
        // BufferedReader used to read user-input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Your Name(only first and last name separated by spaces)");
        // String objects to contain username,email-Id
        String name,email;
        // Interface Base reference variable defined to refer to any type of questions
        Base obj;
        try{
            name = bufferedReader.readLine();
        }catch (IOException e){
            System.out.println("An error occurred");
            return;
        }
        System.out.println("Please Enter Your Email-id");
        try{
            email = bufferedReader.readLine();
        }catch (IOException e){
            System.out.println("An error occurred");
            return;
        }
        // Comparing name to a regular expression
        if(!(name.matches("[A-Za-z]+\\s*([A-Za-z]+)*"))){
            System.out.println("Invalid Name");
            return;
        }
        // Comparing mail to a regular expression
        if(!(email.matches("[A-Za-z0-9.]+@[a-z]+.com"))){
            System.out.println("Invalid Email");
            return;
        }
        // Maps declared to refer to the Questions data members
        Map<StringBuffer, ArrayList<StringBuffer>> questions;
        Map<StringBuffer, StringBuffer> answer;
        Map<Integer,List<StringBuffer>> scores;
        Map<StringBuffer, Boolean> isVisited;

        // List declared to refer to question list related to a score
        List<StringBuffer> questionsList;

        // Boolean variable to denote if the level of question changed during the quiz
        boolean levelChanged = false;

        // Variable denoting current question
        StringBuffer stringBufferQuestion = null;
        // Variable denoting answer to the current question
        StringBuffer stringBufferAnswer;

        // ArrayList to hold current question's options
        ArrayList<StringBuffer> arrayList;
        // Variable denoting the count of questions that are already visited for a particular score
        int insideCount = 0;
        // Variable denoting user's input
        char ch = '0';
        // Array to store the scores of user question
        int output[] = new int[10];
        // Random number generator created and initialized
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        while(count <= 10){
            // scores checked if it is valid for a given level
            if(!(score > 3*level && score<= 3*(level+1))){
                score = 3*level+1;
            }
            insideCount = 0;
            // Questions obtained for a given level
            obj = multilevelQueue.get(level);
            // Questions object obtained
            Questions quest = obj.getQuestions();
            // Maps intialized to hold various Questions class members
            questions = quest.getQuestions();
            answer = quest.getAnswer();
            scores = quest.getScore();
            isVisited = quest.getIsVisited();

            // Question List for a score obtained
            questionsList = scores.get(score);

            // Selecting a question from the given list of questions randomly
            for(StringBuffer stringBuffer: questionsList){
                // Already visited questions ignored
                if(isVisited.get(stringBuffer)){
                    insideCount++;
                    continue;
                }else{
                    stringBufferQuestion = stringBuffer;
                    if(random.nextInt()%5 == 0){
                        break;
                    }
                }
            }

            // If all questions for a score are visited change the score and level(if neccessary)
            if(insideCount == questionsList.size()){
                score+=1;
                if(score > (3*(level+1))){
                    level = (level+1)%3;
                    score = random.nextInt(4) + 3*(level) ;
                    if(score ==0){
                        score = 1;
                    }
                }
                continue;
            }

            // Display the question
            arrayList = questions.get(stringBufferQuestion);
            System.out.println(count + ". " + stringBufferQuestion + "\n");

            // Display the options related to the question
            for(StringBuffer stringBuffer1 : arrayList){
                System.out.println(stringBuffer1);
            }

            //Read user's Answer
            System.out.println("Your Answer");
            try {
                ch = bufferedReader.readLine().charAt(0);
            }catch (IOException e){
                System.out.println("An error occurred");
            }
            // Score of the question stored in the output array
            output[count-1] = score;
            // Original answer retrieved from the map
            stringBufferAnswer = answer.get(stringBufferQuestion);
            // Question marked as visited
            isVisited.replace(stringBufferQuestion,false,true);
            // Comparing the user's answer with the original answer
            if(ch == stringBufferAnswer.charAt(0)){
                // levels and score changed accordingly in case of right answer
                if(level == 3 && score<9){
                    score++;
                }
                else{
                    level = random.nextInt(level+1)%3;
                    levelChanged = true;
                }
            }
            else{
                // levels and score changed accordingly in case of wrong answer
                if(level == 0 && score > 1){
                    score--;
                }else {
                    level = (level - 1) % 3 + 3;
                    if (level > 2) {
                        level = 0;
                    }
                    levelChanged = true;
                }
            }
            // Score set according to levels in case of level change
            if(levelChanged){
                score = random.nextInt(4) + 3*level;
                if(score == 0){
                    score=1;
                }
            }
            // Increment the question count
            count++;
        }
        System.out.println("===========================================");
        System.out.println("The performance graph is");
        System.out.println("===========================================");
        int i,j;
        // Loops to display the performance graph
        for(i=9; i>=1; i--){
            System.out.print(10-i + "\t");
            for(j=0; j<=9; j++){
                if(output[j] == i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.print("\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"\t"+"5"+"\t"+"6"+"\t"+"7"+"\t"+"8"+"\t"+"9"+"\t"+"10");
        System.out.println("\nX-axis ---> Questions");
        System.out.println("Y-axis ---> Score");
    }
}
