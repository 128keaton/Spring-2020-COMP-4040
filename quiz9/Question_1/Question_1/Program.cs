// Program.cs
// kbrleson

using System;

namespace Question_1
{
    class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                Console.Write("Please input a score: ");

                String input = Console.ReadLine();
                int examScore = Convert.ToInt32(input);

                if (examScore < 50)
                {
                    throw new ScoreIsLessException();
                }

                Console.WriteLine("You passed the exam. Congratulations.");
            }
            catch (ScoreIsLessException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
