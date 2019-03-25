package com.charchit;
/*
Class to create a set of medium questions
for the quiz.

It defines one Question data member and implements the Base interface
The constructor is also provided
 */
import java.util.*;

public class MediumQuestions implements Base{
    private Questions mediumQuestions;

    public MediumQuestions() {
        // The maps are used for same functioning as mentioned in the Questions class
        Map<StringBuffer, ArrayList<StringBuffer>> questions = new HashMap<>();
        Map<StringBuffer, StringBuffer> answer = new HashMap<>();
        Map<Integer, List<StringBuffer>> score = new HashMap<>();
        Map<StringBuffer,Boolean> isVisited = new HashMap<>();
        StringBuffer solution;

        // List to store questions
        List<StringBuffer> questionsList = new ArrayList<>();

        StringBuffer questionTitle = new StringBuffer("Rate at which cost of algorithm grows as size of its input grows is called its");
        // ArrayList created to hold options for the questions
        ArrayList<StringBuffer> options = new ArrayList<>();
        options.add(new StringBuffer("a. Input Rate"));
        options.add(new StringBuffer("b. Output Rate"));
        options.add(solution = new StringBuffer("c. Growth Rate"));
        options.add(new StringBuffer("d. Processing Rate"));

        // Question added to the question list
        questionsList.add(questionTitle);
        // Question and its answer added to the map answer
        answer.put(questionTitle,solution);
        // Questions and its options added to the map questions
        questions.put(questionTitle,options);
        // Questions and its status added to the map isVisited
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Critical resource for a program is most often its");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Compilation Time"));
        options.add(solution = new StringBuffer("b. Running Time"));
        options.add(new StringBuffer("c. Storage Time"));
        options.add(new StringBuffer("d. Testing Time"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("A growth rate of n, is referred to as");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Absolute growth rate"));
        options.add(solution = new StringBuffer("b. Linear growth rate"));
        options.add(new StringBuffer("c. Quadratic growth rate"));
        options.add(new StringBuffer("d. Unbounded growth rate"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Efficiency of an algorithm is measured by");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Absolute analysis"));
        options.add(new StringBuffer("b. Cost Analysis"));
        options.add(new StringBuffer("c. Relative Analysis"));
        options.add(solution = new StringBuffer("d. Asymptotic analysis"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Implementation of operations associated with an ADT is done by a");
        options = new ArrayList<>();
        options.add(solution =  new StringBuffer("a. Member function"));
        options.add(new StringBuffer("b. Member type"));
        options.add(new StringBuffer("c. Member object"));
        options.add(new StringBuffer("d. Member data-type"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("A data structure requires a certain amount of space for each");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Data process"));
        options.add(new StringBuffer("b. Data movement"));
        options.add(solution = new StringBuffer("c. Data item"));
        options.add(new StringBuffer("d. Data action"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        // Questions List added to the map score
        score.put(4,questionsList);
        questionsList.clear();

        questionTitle = new StringBuffer("Defining a data type in terms of an ADT is of form");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. Logical"));
        options.add(new StringBuffer("b. Physical"));
        options.add(new StringBuffer("c. Composite"));
        options.add(new StringBuffer("d. Visual"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("For selecting a data structure, approach to be followed is known as");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Two step"));
        options.add(new StringBuffer("b. Three step"));
        options.add(solution = new StringBuffer("c. Four Step"));
        options.add(new StringBuffer("d. Five Step"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Records can be accessed by unique numbers, that are known to be");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Record-match"));
        options.add(solution = new StringBuffer("b. Exact-match"));
        options.add(new StringBuffer("c. Query-match"));
        options.add(new StringBuffer("d. Data-match"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Term that makes realization of a data type as a software component is called");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Actual Data Type"));
        options.add(solution = new StringBuffer("b. Abstract Data Type"));
        options.add(new StringBuffer("c. Visual Data Type"));
        options.add(new StringBuffer("d. Component Data Type"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        score.put(5,questionsList);

        questionTitle = new StringBuffer("A record is modifiable only when medication does not affect its");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Resource Requirements"));
        options.add(new StringBuffer("b. Degradation Requirements"));
        options.add(solution = new StringBuffer("c. Space Requirements"));
        options.add(new StringBuffer("d. Reference Requirements"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("A solution is assumed to be efficient if it is able to solve problem within required");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. Constraints"));
        options.add(new StringBuffer("b. Processing"));
        options.add(new StringBuffer("c. Decision making"));
        options.add(new StringBuffer("d. Developers"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Data structure that allows extremely fast exact-match search, is known to be\n");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Arrays"));
        options.add(new StringBuffer("b. Pointers"));
        options.add(new StringBuffer("c. Stack"));
        options.add(solution = new StringBuffer("d. HashTables"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("An instantiation of an algorithm in a computer programming language is called");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Algorithm"));
        options.add(new StringBuffer("b. Problem Solving"));
        options.add(new StringBuffer("c. Process Method"));
        options.add(solution = new StringBuffer("d. Program"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Operation(s) that an algorithm must fulfill is/are");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Compute The function"));
        options.add(new StringBuffer("b. Convert each input to correct output"));
        options.add(new StringBuffer("c. Intented functional parameters"));
        options.add(solution = new StringBuffer("d. All of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("In problem solving solution defined constraints should be of form");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Inputs and Outputs"));
        options.add(new StringBuffer("b. Pseudocode"));
        options.add(solution = new StringBuffer("c. Used Resources"));
        options.add(new StringBuffer("d. Used Mechanisms"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        score.put(6,questionsList);

        mediumQuestions = new Questions(questions,answer,score,isVisited);
    }

    public Questions getQuestions() {
        return mediumQuestions;
    }
}
