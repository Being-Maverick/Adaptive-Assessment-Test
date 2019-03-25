package com.charchit;
/*
Class to create a set of easy questions
for the quiz.

It defines one Question data member and implements the Base interface
The constructor is also provided
 */
import java.util.*;

public class EasyQuestions implements Base{
    private Questions easyQuestions;

    public EasyQuestions() {
        // The maps are used for same functioning as mentioned in the Questions class
        Map<StringBuffer, ArrayList<StringBuffer>> questions = new HashMap<>();
        Map<StringBuffer, StringBuffer> answer = new HashMap<>();
        Map<Integer, List<StringBuffer>> score = new HashMap<>();
        Map<StringBuffer,Boolean> isVisited = new HashMap<>();

        // List to store questions
        List<StringBuffer> questionsList= new ArrayList<>();
        StringBuffer solution;

        StringBuffer questionTitle = new StringBuffer("Which of the following is/are the levels of implementation of data structure");
        // ArrayList created to hold options for the questions
        ArrayList<StringBuffer> options = new ArrayList<>();
        options.add(new StringBuffer("a. Abstract level"));
        options.add(new StringBuffer("b. Application level"));
        options.add(new StringBuffer("c. Implementation level"));
        options.add(solution = new StringBuffer("d. All of the above"));

        // Question added to the question list
        questionsList.add(questionTitle);
        // Question and its answer added to the map answer
        answer.put(questionTitle,solution);
        // Questions and its options added to the map questions
        questions.put(questionTitle,options);
        // Questions and its status added to the map isVisited
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("………………. is where the model becomes compatible executable code.");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Abstract"));
        options.add(new StringBuffer("b. Application"));
        options.add(solution = new StringBuffer("c. Implementation"));
        options.add(new StringBuffer("d. All of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("…………… is not the component of data structure.");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Operations"));
        options.add(new StringBuffer("b. Storage Structures"));
        options.add(new StringBuffer("c. Algorithms"));
        options.add(solution = new StringBuffer("d. None of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer(" Which of the following is not the part of ADT description?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Data"));
        options.add(new StringBuffer("b. Operations"));
        options.add(new StringBuffer("c. Both of the above"));
        options.add(solution = new StringBuffer("d. None of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following is non-linear data structure?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. String"));
        options.add(new StringBuffer("b. Lists"));
        options.add(new StringBuffer("c. Stack"));
        options.add(solution = new StringBuffer("d. Graph"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        // Questions List added to the map score
        score.put(1,questionsList);
        questionsList.clear();

        questionTitle = new StringBuffer("Which of the following data structure is linear type?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Trees"));
        options.add(new StringBuffer("b. Graphs"));
        options.add(new StringBuffer("c. BST"));
        options.add(solution = new StringBuffer("d. Stack"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following data structure is non linear type?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Stack"));
        options.add(new StringBuffer("b. Deque"));
        options.add(solution =new StringBuffer("c. Priority Queue"));
        options.add(new StringBuffer("d. None of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("To represent hierarchical relationship between elements, Which data structure is suitable?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Deque"));
        options.add(new StringBuffer("b. Priority Queue"));
        options.add(solution = new StringBuffer("c. Tree"));
        options.add(new StringBuffer("d. Graph"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("When new data are to be inserted into a data structure, but there is not available space; this situation is usually called ….");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Underflow"));
        options.add(solution = new StringBuffer("b. Overflow"));
        options.add(new StringBuffer("c. Housefull"));
        options.add(new StringBuffer("d. Saturated"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("The way in which the data item are logically related defines …..");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Storage Structure"));
        options.add(solution = new StringBuffer("b. Data Structure"));
        options.add(new StringBuffer("c. Data relationship"));
        options.add(new StringBuffer("d. Data Operation"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("The simplest type of data structure is ………………");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Multidimensional Array"));
        options.add(solution = new StringBuffer("b. One dimensional Array"));
        options.add(new StringBuffer("c. Two dimensional Array"));
        options.add(new StringBuffer("d. Three Dimensional Array"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        score.put(2,questionsList);
        questionsList.clear();

        questionTitle = new StringBuffer("Linear arrays are also called ……………….");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Straight Line Array"));
        options.add(solution = new StringBuffer("b. One Dimensional Array"));
        options.add(new StringBuffer("c. Horizontal array"));
        options.add(new StringBuffer("d. Vertical Array"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following data structure is not a linear data structure?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Arrays"));
        options.add(new StringBuffer("b. Linked List"));
        options.add(new StringBuffer("c. Both of the above"));
        options.add(solution = new StringBuffer("d. None of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following data structure is linear data structure?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Trees"));
        options.add(new StringBuffer("b. Graphs"));
        options.add(solution = new StringBuffer("c. Arrays"));
        options.add(new StringBuffer("d. All of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following sorting algorithm is of divide-and-conquer type?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Bubble Sort"));
        options.add(new StringBuffer("b. Insertion Sort"));
        options.add(solution = new StringBuffer("c. QuickSort"));
        options.add(new StringBuffer("d. All of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following data structures are indexed structures?");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. Linear Arrays"));
        options.add(new StringBuffer("b. Linked Lists"));
        options.add(new StringBuffer("c. Queues"));
        options.add(new StringBuffer("d. Stack"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        score.put(3,questionsList);

        easyQuestions = new Questions(questions,answer,score,isVisited);
    }

    public Questions getQuestions() {
        return easyQuestions;
    }
}
