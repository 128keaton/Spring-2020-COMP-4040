using System;

namespace Question_2
{
    public delegate void ExampleDelegate();

    class Program
    {
        static void Main(string[] args)
        {
            ExampleDelegate exampleDelegate = new ExampleDelegate(SayHello);

            exampleDelegate();
        }

        static void SayHello()
        {
            Console.WriteLine("Hello!");
        }
    }
}
