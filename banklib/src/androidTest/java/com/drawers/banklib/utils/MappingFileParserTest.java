package com.drawers.banklib.utils;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import com.drawers.banklib.model.BaseModel;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.InputStream;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class MappingFileParserTest {

  @Test
  public void parse_sample1() throws Exception {
    InputStream resource = MappingFileParserTest.class.getClassLoader().getResourceAsStream("sample1.json");
    MappingFileParser parser = new MappingFileParser(resource);
    Map<String, BaseModel> parse = parser.parse();
    assertNotNull(parse);
  }

  @Test
  public void parse_sample2() throws Exception {
    InputStream resource = MappingFileParserTest.class.getClassLoader().getResourceAsStream("sample2.json");
    MappingFileParser parser = new MappingFileParser(resource);
    Map<String, BaseModel> parse = parser.parse();
    assertNotNull(parse);
  }

}