package com.biku;


import java.util.*;

public class Reader {

    public int read(String s) {
        String tabOfsentence[];                                  // table with separate sentence
        String[] elementsOfSentenceList;
        int maxNumberOfElementsInSentence = 0;
        String splitsMarks = ";|!|\\?|\\.";
        String separatorMark = "\\s";

        tabOfsentence = s.split(splitsMarks);

            for (String i : tabOfsentence) {
                int numberOfElementsInSentence = 0;

                elementsOfSentenceList = i.split(separatorMark);

                for (String j: elementsOfSentenceList) {
                    if (!j.isEmpty() || !j.equals(""))
                        numberOfElementsInSentence++;
                }

                maxNumberOfElementsInSentence = (maxNumberOfElementsInSentence < numberOfElementsInSentence)
                        ? numberOfElementsInSentence : maxNumberOfElementsInSentence;
            }
        return maxNumberOfElementsInSentence;
    }

}
