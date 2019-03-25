package com.charchit;
/*
Class to create a set of hard questions
for the quiz.

It defines one Question data member and implements the Base interface
The constructor is also provided
 */

import java.util.*;

public class HardQuestions implements Base {
    Questions hardQuestions;

    public HardQuestions() {
        // The maps are used for same functioning as mentioned in the Questions class
        Map<StringBuffer, ArrayList<StringBuffer>> questions = new HashMap<>();
        Map<StringBuffer, StringBuffer> answer = new HashMap<>();
        Map<Integer, List<StringBuffer>> score = new HashMap<>();
        Map<StringBuffer,Boolean> isVisited = new HashMap<>();
        StringBuffer solution;

        // List to store questions
        List<StringBuffer> questionsList = new ArrayList<>();

        StringBuffer questionTitle = new StringBuffer("A relation that can be used to partition a set into equivalence classes is called");
        // ArrayList created to hold options for the questions
        ArrayList<StringBuffer> options = new ArrayList<>();
        options.add(new StringBuffer("a. Symmetric"));
        options.add(new StringBuffer("b. Asymmetric"));
        options.add(solution = new StringBuffer("c. Equivalence"));
        options.add(new StringBuffer("d. Non-equivalence"));

        // Question added to the question list
        questionsList.add(questionTitle);
        // Question and its answer added to the map answer
        answer.put(questionTitle,solution);
        // Questions and its options added to the map questions
        questions.put(questionTitle,options);
        // Questions and its status added to the map isVisited
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("If a binary relation is antisymmetric and transitive is referred to as");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Impartial Order"));
        options.add(new StringBuffer("b. Comparable Order"));
        options.add(solution = new StringBuffer("c. Partial Order"));
        options.add(new StringBuffer("d. Non Comparable Order"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("A sequence is also referred to as a");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. Tuple"));
        options.add(new StringBuffer("b. Instance"));
        options.add(new StringBuffer("c. Domain"));
        options.add(new StringBuffer("d. Attribute"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Duplicate-valued elements can be attributed in a");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Set"));
        options.add(solution = new StringBuffer("b. Sequence"));
        options.add(new StringBuffer("c. Entities"));
        options.add(new StringBuffer("d. Structure"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Each member of a set can be thought of an/a");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Primitive member of itself"));
        options.add(solution =  new StringBuffer("b. Set Itself"));
        options.add(new StringBuffer("c. Both A and B"));
        options.add(new StringBuffer("d. None of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Total order is also called");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Uniform Order"));
        options.add(new StringBuffer("b. Static Order"));
        options.add(solution = new StringBuffer("c. Linear Order"));
        options.add(new StringBuffer("d. Paired Order"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        // Questions List added to the map score
        score.put(7,questionsList);
        questionsList.clear();

        questionTitle = new StringBuffer("If every pair of distinct elements in a partial order are comparable, then order is called a");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. Total order"));
        options.add(new StringBuffer("b. Partial order"));
        options.add(new StringBuffer("c. Comparable order"));
        options.add(new StringBuffer("d. Non - comparable order"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Members of a set are drawn from a larger population known as");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Data Type"));
        options.add(new StringBuffer("b. Primitive Type"));
        options.add(solution = new StringBuffer("c. Compound Type"));
        options.add(new StringBuffer("d. Base Type"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Set on which partial order is defined is called");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. Poset"));
        options.add(new StringBuffer("b. Relation"));
        options.add(new StringBuffer("c. Sequence"));
        options.add(new StringBuffer("d. Coset"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("R is an equivalence relation on set S if it has property of");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Reflexive"));
        options.add(new StringBuffer("b. Symmetric"));
        options.add(new StringBuffer("c. Transitive"));
        options.add(solution = new StringBuffer("d. All of the above"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        score.put(8,questionsList);
        questionsList.clear();

        questionTitle = new StringBuffer("Relation between two sets P and Q in qiven form is P ⊂ Q is");
        options = new ArrayList<>();
        options.add(solution = new StringBuffer("a. P is subset of Q"));
        options.add(new StringBuffer("b. Q is subset of P"));
        options.add(new StringBuffer("c. All Elements are equal"));
        options.add(new StringBuffer("d. one of Elements are equal"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Sum of reciprocals from 1 to n, called");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Hammer Series"));
        options.add(new StringBuffer("b. Geometric Series"));
        options.add(new StringBuffer("c. Arithmetic Series"));
        options.add(solution = new StringBuffer("d. Harmonic Series"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Recurrence relations are widely used for modelling cost of");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Non-recurrence functions"));
        options.add(new StringBuffer("b. Asymmetric functions"));
        options.add(solution = new StringBuffer("c. Recurrence functions"));
        options.add(new StringBuffer("d. Symmetric functions"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Which of the following abstract data types can be used to represent a many to many relation?");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Plex"));
        options.add(new StringBuffer("b. Graph"));
        options.add(solution = new StringBuffer("c. Both (a) and (b)"));
        options.add(new StringBuffer("d. Tree"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("Relation defining a function by means of an expression that includes one or more instances of itself is known to be");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. Structured relation"));
        options.add(solution = new StringBuffer("b. Recurrence relation"));
        options.add(new StringBuffer("c. Sequenced relation"));
        options.add(new StringBuffer("d. Absolute relation"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        questionTitle = new StringBuffer("In line '200 IF NAME$=\"***\" THEN Average= Total Mark/N' of BASIC program, NAME$ is classified as\n");
        options = new ArrayList<>();
        options.add(new StringBuffer("a. String variable"));
        options.add(new StringBuffer("b. String constant"));
        options.add(solution = new StringBuffer("c. Rational string"));
        options.add(new StringBuffer("d. Irrational string"));

        questionsList.add(questionTitle);
        answer.put(questionTitle,solution);
        questions.put(questionTitle,options);
        isVisited.put(questionTitle,false);

        score.put(9,questionsList);

        hardQuestions = new Questions(questions,answer,score,isVisited);
    }

    public Questions getQuestions() {
        return hardQuestions;
    }
}
