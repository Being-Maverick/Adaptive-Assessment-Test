package com.charchit;
/*
Class defining basic characteristics of a Questions
It defines four maps as its members, a constructor
and the getters for each data member
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Questions {

    // Map created to store questions and its related options
    private Map<StringBuffer, ArrayList<StringBuffer>> questions;
    // Map created to store the answer of a question
    private Map<StringBuffer, StringBuffer> answer;
    // Map to store list of questions having definite marks
    private Map<Integer, List<StringBuffer>> score;
    // Map to check the condition if the question is already visited
    private Map<StringBuffer, Boolean> isVisited;

    public Questions(Map<StringBuffer, ArrayList<StringBuffer>> questions, Map<StringBuffer, StringBuffer> answer, Map<Integer,List<StringBuffer>> score, Map<StringBuffer, Boolean> isVisited) {
        this.questions = questions;
        this.answer = answer;
        this.score = score;
        this.isVisited = isVisited;
    }

    public Map<StringBuffer, ArrayList<StringBuffer>> getQuestions() {
        return questions;
    }

    public Map<StringBuffer, StringBuffer> getAnswer() {
        return answer;
    }

    public Map<Integer,List<StringBuffer>> getScore() {
        return score;
    }

    public Map<StringBuffer, Boolean> getIsVisited() {
        return isVisited;
    }
}
