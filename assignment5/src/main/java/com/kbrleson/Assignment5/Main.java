package com.kbrleson.Assignment5;

import org.parboiled.Parboiled;
import org.parboiled.common.StringUtils;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;
import java.util.Scanner;

import static org.parboiled.support.ParseTreeUtils.printNodeTree;

@SuppressWarnings("rawtypes")
public class Main {
    public static void main(String[] args) {
        AddressParser addressParser = Parboiled.createParser(AddressParser.class);

        while (true) {
            System.out.print("Please input an address (single RETURN to exit): ");

            String input = new Scanner(System.in).nextLine();
            if (StringUtils.isEmpty(input)) break;

            ParsingResult<?> result = new ReportingParseRunner(addressParser.Address()).run(input);

            if (!result.parseErrors.isEmpty())
                System.out.println(ErrorUtils.printParseError(result.parseErrors.get(0)));
            else
                System.out.println(printNodeTree(result) + '\n');
        }
    }
}
