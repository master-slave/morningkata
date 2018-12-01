package com.slavisa.wordcount;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2018-12-01
 */
public class WordCount {

  public int wordcount(String text) {
    String[] words = text.split("[ |\\n]");
    return words.length;
  }

}
