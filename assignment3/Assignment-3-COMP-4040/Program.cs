using System;
using System.IO;

namespace Assignment_3_COMP_4040
{
    class Program
    {
        public const int LETTER = 0;
        public const int DIGIT = 1;
        public const int UNKNOWN = 99;
        public const int INT_LIT = 10;
        public const int IDENT = 11;
        public const int ASSIGN_OP = 20;
        public const int ADD_OP = 21;
        public const int SUB_OP = 22;
        public const int MULT_OP = 23;
        public const int DIV_OP = 24;
        public const int LEFT_PAREN = 25;
        public const int RIGHT_PAREN = 26;
        public const int EOF = -1;

        static int charClass;
        static char[] lexeme = new char[100];
        static char nextChar;
        static int lexLen;
        static int nextToken;
        static private StreamReader fileStream;
        static string workingDirectory = Environment.CurrentDirectory;
        static string projectDirectory = Directory.GetParent(workingDirectory).Parent.Parent.FullName;

        public static void Main(string[] args)
        {
            fileStream = new StreamReader(projectDirectory + "/front.in", System.Text.Encoding.UTF8);
            getChar(); do
            {
                lex();
            } while (nextToken != EOF);
        }

        static int lookup(char ch)
        {
            switch (ch)
            {
                case '(':
                    addChar();
                    nextToken = LEFT_PAREN; break;
                case ')':
                    addChar();
                    nextToken = RIGHT_PAREN; break;
                case '+':
                    addChar(); nextToken = ADD_OP; break;
                case '-':
                    addChar(); nextToken = SUB_OP; break;
                case '*':
                    addChar();
                    nextToken = MULT_OP; break;
                case '/':
                    addChar(); nextToken = DIV_OP; break;
                default: addChar(); nextToken = EOF; break;
            }
            return nextToken;
        }


        static void addChar()
        {
            if (lexLen <= 98)
            {
                lexeme[lexLen++] = nextChar;
            }
            else
                Console.WriteLine("Error - lexeme is too long \n");
        }

        static void getChar()
        {
            nextChar = (char)fileStream.Read();
            if (nextChar != EOF)
            {
                if (Char.IsLetter(nextChar))
                    charClass = LETTER;
                else if (Char.IsDigit(nextChar))
                    charClass = DIGIT;
                else charClass = UNKNOWN;
            }
            else charClass = EOF;

        }


        static void getNonBlank()
        {
            while (Char.IsWhiteSpace(nextChar)) getChar();
        }

        static int lex()
        {
            lexLen = 0; getNonBlank();
            switch (charClass)
            {
                case LETTER:
                    addChar();
                    getChar();
                    while (charClass == LETTER || charClass == DIGIT)
                    {
                        addChar();
                        getChar();
                    }
                    nextToken = IDENT; break;

                case DIGIT:
                    addChar();
                    getChar();
                    while (charClass == DIGIT)
                    {
                        addChar();
                        getChar();
                    }
                    nextToken = INT_LIT; break;

                case UNKNOWN:
                    lookup(nextChar); getChar();
                    break;
                case EOF:
                    nextToken = EOF; lexeme[0] = 'E'; lexeme[1] = 'O'; lexeme[2] = 'F';
                    break;
            }

            Console.WriteLine("Next token is: {0}, Next lexeme is {1}", nextToken, new string(lexeme).Replace("￿", "EOF"));
            lexeme = new char[100];
            return nextToken;
        }
    }
}
