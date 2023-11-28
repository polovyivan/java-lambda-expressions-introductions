package com.polovyi.ivan.tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TraditionalApproach {

    interface TextParser {
        List<String> parse(String text);
    }

    static class SemicolonParser implements TextParser {
        @Override
        public List<String> parse(String text) {
            return Arrays.stream(text.split(";")).toList();
        }
    }

    static class CommaParser implements TextParser {
        @Override
        public List<String> parse(String text) {
            return Arrays.stream(text.split(",")).toList();
        }
    }

    public static void main(String[] args) {
        generateReport(new CommaParser(), "1,John Doe,17737278341");
        generateReport(new SemicolonParser(), "1;John Doe;17737278341");
    }

    private static void generateReport(TextParser textParser, String text) {
        System.out.println("Customers\n| ID | Name     | Phone       |");
        String row = textParser.parse(text).stream()
                .collect(Collectors
                        .joining(" | ", "|  ", " |"));
        System.out.println(row);
    }
}
