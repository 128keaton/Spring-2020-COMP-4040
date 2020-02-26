import org.parboiled.Parboiled;
import org.parboiled.common.StringUtils;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;

import static org.parboiled.support.ParseTreeUtils.printNodeTree;

import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class Main {
    public static void main(String[] args) {
        FullNameParser nameParser = Parboiled.createParser(FullNameParser.class);

        while (true) {
            System.out.print("Please input your name (single RETURN to exit): ");

            String input = new Scanner(System.in).nextLine();
            if (StringUtils.isEmpty(input)) break;

            ParsingResult<?> result = new ReportingParseRunner(nameParser.FullName()).run(input);

            if (!result.parseErrors.isEmpty())
                System.out.println(ErrorUtils.printParseError(result.parseErrors.get(0)));
            else
                System.out.println(printNodeTree(result) + '\n');
        }
    }
}
