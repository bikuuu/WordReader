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

        for (String i : tabOfsentence) {
                int numberOfElementsInSentence = 0;

                elementsOfSentenceList = i.split(separatorMark);
            /**
             * sum of all not empty separated elements of sentence
             */

            for (String j: elementsOfSentenceList) {
                    if (!j.isEmpty() || !j.equals(""))
                        numberOfElementsInSentence++;
                }

            /**
             * Equale how sentence heve more not empty elements (words)
             */

                maxNumberOfElementsInSentence = (maxNumberOfElementsInSentence < numberOfElementsInSentence)
                        ? numberOfElementsInSentence : maxNumberOfElementsInSentence;
            }
        return maxNumberOfElementsInSentence;
    }

}
