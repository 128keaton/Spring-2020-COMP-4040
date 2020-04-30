package com.kbrleson.project;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class CustomerFormParser extends BaseParser<Object> {
    Rule Digit() {
        return CharRange('0', '9');
    }

    Rule Comma() {
        return Ch(',');
    }

    Rule Space() {
        return Ch(' ');
    }

    Rule Hyphen() {
        return Ch('-');
    }

    Rule Period() {
        return Ch('.');
    }

    Rule NewLine() {
        return Ch('\n');
    }

    Rule OpenParenthesis() {
        return Ch('(');
    }

    Rule CloseParenthesis() {
        return Ch(')');
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

    Rule AddressCountryName() {
        return Sequence(
                ZeroOrMore(UppercaseCharacters()),
                ZeroOrMore(LowercaseCharacters()),
                ZeroOrMore(Space()),
                ZeroOrMore(UppercaseCharacters()),
                ZeroOrMore(LowercaseCharacters()),
                ZeroOrMore(Space()),
                ZeroOrMore(UppercaseCharacters()),
                ZeroOrMore(LowercaseCharacters()),
                ZeroOrMore(Space()),
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
                ZeroOrMore(LowercaseCharacters()),
               ZeroOrMore(UppercaseCharacters())
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

    Rule MiddleInitial() {
        return Sequence(
                UppercaseCharacters(),
                Period(),
                Space()
        );
    }

    Rule FullName() {
        return Sequence(
                UppercaseCharacters(),
                ZeroOrMore(LowercaseCharacters()),
                Space(),
                ZeroOrMore(MiddleInitial()),
                UppercaseCharacters(),
                ZeroOrMore(LowercaseCharacters())
        );
    }

    Rule PhoneNumber() {
        return Sequence(
                OpenParenthesis(),
                Digit(),
                Digit(),
                Digit(),
                CloseParenthesis(),
                Space(),
                Digit(),
                Digit(),
                Digit(),
                Hyphen(),
                Digit(),
                Digit(),
                Digit(),
                Digit()
        );
    }

    Rule Address() {
        return Sequence(
                AddressDigits(), // 3609
                Space(), //
                WholeString(), // Mynders
                Space(), //
                WholeString(), // Ave
                ZeroOrMore(Period()),
                Comma(), // ,
                Space(), //
                AddressCityName(), // Memphis
                Comma(), // ,
                Space(), //
                AddressState(),
                Comma(), // ,
                Space(), //
                AddressCountryName() // United States of America
        );
    }

    public Rule CustomerForm() {
        return Sequence(
                FullName(),
                NewLine(),
                Address(),
                NewLine(),
                PhoneNumber()
        );
    }
}
