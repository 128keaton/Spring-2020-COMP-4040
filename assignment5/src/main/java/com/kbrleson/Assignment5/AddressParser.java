package com.kbrleson.Assignment5;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class AddressParser extends BaseParser<Object> {
    Rule Digit() {
        return CharRange('0', '9');
    }

    Rule Comma() {
        return Ch(',');
    }

    Rule Space() {
        return Ch(' ');
    }

    Rule UppercaseCharacters() {
        return CharRange('A', 'Z');
    }

    Rule LowercaseCharacters() {
        return CharRange('a', 'z');
    }

    Rule WholeString() {
        return Sequence(
                ZeroOrMore(UppercaseCharacters()),
                ZeroOrMore(LowercaseCharacters())
        );
    }

    Rule AddressCityName() {
        return Sequence(
                ZeroOrMore(UppercaseCharacters()),
                ZeroOrMore(LowercaseCharacters()),
                ZeroOrMore(Space()),
                ZeroOrMore(UppercaseCharacters()),
                ZeroOrMore(LowercaseCharacters())
        );
    }

    Rule AddressState() {
        return Sequence(
                UppercaseCharacters(),
                UppercaseCharacters()
        );
    }

    Rule AddressDigits() {
        return Sequence(
                ZeroOrMore(Digit()),
                ZeroOrMore(Digit())
        );
    }

    Rule AddressZipCode() {
        return Sequence(
                    Digit(),
                    Digit(),
                    Digit(),
                    Digit(),
                    Digit()
                );
    }

    public Rule Address() {
        return Sequence(
                    AddressDigits(), // 3609
                    Space(), //
                    WholeString(), // Mynders
                    Space(), //
                    WholeString(), // Ave
                    Comma(), // ,
                    Space(), //
                    AddressCityName(), // Memphis
                    Comma(), // ,
                    Space(), //
                    AddressZipCode(), // 38111
                    Comma(), // ,
                    Space(), //
                    AddressState(),
                    Comma(), // ,
                    Space(), //
                    WholeString() // United States of America
                );
    }
}
