import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class FullNameParser extends BaseParser<Object> {
    Rule FullName() {
        return Sequence(
                Name(),
                Space(),
                Name()
        );
    }

    Rule Space() {
        return Ch(' ');
    }

    Rule Name() {
        return OneOrMore(Letter());
    }

    Rule Letter() {
        return FirstOf(CharRange('a', 'z'), CharRange('A', 'Z'));
    }

}
