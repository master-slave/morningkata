package com.slavisa.wordcount;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2018-12-01
 */
public class WordCountTest {

  private WordCount wordCount = new WordCount();

  @Test // 13mins
  public void wordcount() throws IOException {
    File file = new File("D:\\programs\\projects\\slavisa\\morningkata\\wordcount\\src\\main\\resources\\loremipsum.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
    StringBuilder text = new StringBuilder();
    while ((st = br.readLine()) != null) {
     // System.out.println(st);
      text.append(st).append(System.lineSeparator());
    }

    int wordcount = wordCount.wordcount(text.toString());

    assertThat(wordcount, CoreMatchers.is(421));
  }
}