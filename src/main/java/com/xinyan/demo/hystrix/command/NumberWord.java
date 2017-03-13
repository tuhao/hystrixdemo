package com.xinyan.demo.hystrix.command;

/**
 * <p></p>
 *
 * @author liuhang
 * @version 1.0.0 Date: 3/13/17 Time: 3:28 PM
 */

public class NumberWord {

        private final Integer number;
        private final String word;

        public NumberWord(final Integer number, final String word)
        {
            super();
            this.number = number;
            this.word = word;
        }

        public Integer getNumber()
        {
            return number;
        }

        public String getWord()
        {
            return word;
        }
}
