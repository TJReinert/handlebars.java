package com.github.edgarespina.handlebars.parser;

import java.util.HashMap;
import java.util.Map;

public class ArrayTest extends TemplateTest {

  @Override
  public String input() {
    return "{{#list}}{{firstName}} {{lastName}}, {{/list}}";
  }

  @Override
  public Map<String, Object> scope() {
    Map<String, Object> scope = new HashMap<String, Object>();
    Map<String, Object> john = new HashMap<String, Object>();
    john.put("firstName", "John");
    john.put("lastName", "Doe");

    Map<String, Object> peter = new HashMap<String, Object>();
    peter.put("firstName", "Peter");
    peter.put("lastName", "Doe");

    scope.put("list", new Object[] {john, peter});
    return scope;
  }

  @Override
  public String output() {
    return "John Doe, Peter Doe, ";
  }
}
