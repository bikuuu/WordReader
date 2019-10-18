package com.biku.reader;

/**
 * Class with method "read" to return number of words in the longest sentence
 */

public class Reader {

    public int Read(String s) {
        String tabOfsentence[];                                  // table with separate sentence
        String[] elementsOfSentenceList;                         // Table with separated word
        int maxNumberOfElementsInSentence = 0;
        String splitsMarks = ";|!|\\?|\\.";                      // All splits marks (";" "!" "?" ".")
        String separatorMark = "\\s";                            // Separator mark to separate words
        tabOfsentence = s.split(splitsMarks);
        /**
         * Loop to separate sentence
         */
        if(tabOfsentence.length > 0 && tabOfsentence[0] != "") {
            for (String sentence : tabOfsentence) {
                int numberOfWordInSentence = 0;
                sentence.replaceAll("[^a-zA-Z]+", "");
                elementsOfSentenceList = sentence.split(separatorMark);
                /**
                 * sum of all not empty separated elements of sentence
                 */
                for (String word : elementsOfSentenceList) {
                    if (!word.isEmpty() || !word.equals(""))
                        numberOfWordInSentence++;
                }
                /**
                 * Equale how sentence heve more not empty elements (words)
                 */
                maxNumberOfElementsInSentence = (maxNumberOfElementsInSentence < numberOfWordInSentence)
                        ? numberOfWordInSentence : maxNumberOfElementsInSentence;
            }
        }else {
            com.biku.readerFX.Alerts.emptyFile();
        }
        return maxNumberOfElementsInSentence;
    }
}
