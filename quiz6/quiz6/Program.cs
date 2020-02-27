using System;

namespace quiz6
{
    class QuizSix
    {
        static void Main(string[] args)
        {
            // Execute question one
            Console.WriteLine("Question 1:");
            QuestionOne();

            Console.WriteLine("Question 2:");
            QuestionTwo();
        }

        static void QuestionOne()
        {
            PrintSeparator();
            
            // Define initial variables
            int a = 8;
            int b = 16;

            // Print initial variables to console
            Console.WriteLine("Initial values: a = " + a + ", b = " + b);

            // Swap with 'SwapPassedByValue'
            Console.WriteLine("Swapping with 'SwapPassedByValue'");
            SwapPassedByValue(a, b);
            Console.WriteLine("Current values after swapping with 'SwapPassedByValue': a = " + a + ", b = " + b);

            // Swap with 'SwapPassedByReference'
            Console.WriteLine("Swapping with 'SwapPassedByReference'");
            SwapPassedByReference(ref a, ref b);
            Console.WriteLine("Current values after swapping with 'SwapPassedByReference': a = " + a + ", b = " + b);

            // Swap with 'SwapPassedByValueResult'
            Console.WriteLine("Swapping with 'SwapPassedByValueResult'");
            SwapPassedByValueResult(a, b, out a, out b);
            Console.WriteLine("Current values after swapping with 'SwapPassedByValueResult': a = " + a + ", b = " + b);

            PrintSeparator();
        }

        static void QuestionTwo()
        {
            PrintSeparator();

            // Define initial variables
            String a = "yes";
            String b = "no";

            // Print initial variables to console
            Console.WriteLine("Initial values: a = \"" + a + "\", b = \"" + b + "\"");

            // Swap with 'SwapGenerics'
            Console.WriteLine("Swapping with 'SwapGenerics'");
            SwapGenerics(ref a, ref b);
            Console.WriteLine("Current values after swapping with 'SwapGenerics': a = \"" + a + "\", b = \"" + b + "\"");

            PrintSeparator();
        }

        // Does not work since temp references 'a' and we change 'a' later on
        static void SwapPassedByValue(int a, int b)
        {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        // Works because we're passing a reference value
        static void SwapPassedByReference(ref int a, ref int b)
        {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        // Works because of our 'out' values
        static void SwapPassedByValueResult(int a, int b, out int resultA, out int resultB)
        {
            resultA = b;
            resultB = a;
        }

        // Swaps two generic items for each other (using reference values)
        static void SwapGenerics<T>(ref T a, ref T b)
        {
            T temp;
            temp = a;
            a = b;
            b = temp;
        }

        static void PrintSeparator()
        {
            Console.WriteLine("-----------------------------------------------------------------------------");
        }
    }
}
