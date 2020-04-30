package com.kbrleson.project;

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
        while (true) {
            printMenu();
            String optionChosen = new Scanner(System.in).nextLine();

            if (optionChosen.equals("1")) {
                runTestData();
            } else if (optionChosen.equals("2")) {
                handleUserInput();
            } else {
                break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("--------Menu--------");
        System.out.println("1. Run Example Test Data");
        System.out.println("2. Test User Input");
        System.out.println("--------------------");
        System.out.print("Choice (anything else results in exit): ");
    }

    public static void handleUserInput() {
        System.out.print("Please input a full name (single RETURN to exit): ");
        String fullName = new Scanner(System.in).nextLine();
        if (StringUtils.isEmpty(fullName)) return;

        System.out.print("Please input an address (single RETURN to exit): ");
        String address = new Scanner(System.in).nextLine();
        if (StringUtils.isEmpty(address)) return;

        System.out.print("Please input a phone number (single RETURN to exit): ");
        String phoneNumber = new Scanner(System.in).nextLine();
        if (StringUtils.isEmpty(phoneNumber)) return;

        parse(fullName, address, phoneNumber);
    }

    public static void runTestData() {
        String fullName = "John Doe";
        String address = "3609 Mynders Ave, Memphis, TN, United States of America";
        String phoneNumber = "(901) 345-9834";

        parse(fullName, address, phoneNumber);

        fullName = "Joshua R. Clemens";
        address = "982 Pryor St, Little Rock, AR, USA";
        phoneNumber = "(501) 876-1234";

        parse(fullName, address, phoneNumber);

        fullName = "Mary Smith";
        address = "82 Main St., Toronto, Ontario, Canada";
        phoneNumber = "(416) 509-6995";

        parse(fullName, address, phoneNumber);
    }

    public static void parse(String fullName, String address, String phoneNumber) {
        CustomerFormParser customerFormParser = Parboiled.createParser(CustomerFormParser.class);
        String input = fullName + "\n" + address + "\n" + phoneNumber;

        System.out.println("Parsing:");
        System.out.println(input);

        ParsingResult<?> result = new ReportingParseRunner(customerFormParser.CustomerForm()).run(input);

        if (!result.parseErrors.isEmpty())
            System.out.println(ErrorUtils.printParseError(result.parseErrors.get(0)));
        else
            System.out.println(printNodeTree(result) + '\n');
    }
}
